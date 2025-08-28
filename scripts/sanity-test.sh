#!/bin/bash
set -e

echo "Running sanity tests for Java programs..."
echo "Java version:"
java -version

echo "Javac version:"
javac -version

echo ""
echo "Discovering and testing all Java projects in src/..."

# Find all directories under src/ that contain Java files or Makefiles
for project_dir in src/*/; do
    if [ -d "$project_dir" ]; then
        project_name=$(basename "$project_dir")
        echo ""
        echo "=== Testing project: $project_name ==="
        cd "$project_dir"
        
        # Build the project
        if [ -f "Makefile" ]; then
            echo "Found Makefile, using make to build..."
            make clean 2>/dev/null || true
            make all
        else
            # No Makefile, try to compile Java files directly
            java_files=(*.java)
            if [ -e "${java_files[0]}" ]; then
                echo "No Makefile found, compiling Java files directly..."
                javac *.java
            else
                echo "No Java files found in $project_name, skipping..."
                cd - > /dev/null
                continue
            fi
        fi
        
        # Check for test.txt manifest file
        if [ -f "test.txt" ]; then
            echo "Found test.txt manifest, running specified tests..."
            while IFS= read -r line; do
                # Skip empty lines and comments (lines starting with #)
                if [[ -z "$line" || "$line" =~ ^[[:space:]]*# ]]; then
                    continue
                fi
                
                # Parse class name and arguments
                read -r class_name args <<< "$line"
                
                echo "Testing: $class_name $args"
                if java $class_name $args; then
                    echo "✓ $class_name test passed!"
                else
                    echo "✗ $class_name test failed!"
                    exit 1
                fi
            done < test.txt
        else
            echo "No test.txt manifest found - create one to specify which classes to run"
            echo "Example test.txt format:"
            echo "  HelloWorld1"
            echo "  MyApp arg1 arg2"
            echo "  # This is a comment"
        fi
        
        cd - > /dev/null
        echo "$project_name test completed"
    fi
done

echo ""
echo "All project tests completed!"