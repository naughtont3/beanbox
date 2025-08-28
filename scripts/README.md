# Scripts Directory

## Overview
This directory contains build and test automation scripts for the Java projects in this repository.

## Files

### `sanity-test.sh`
Automated test script that discovers and tests all Java projects under `src/`.

**Features:**
- Auto-discovers all subdirectories under `src/`
- Builds projects using Makefile (if present) or direct javac compilation
- Runs tests specified in `test.txt` manifest files
- Supports passing command-line arguments to test programs
- Cross-platform compatible (Windows, macOS, Linux)

**Usage:**
```bash
./scripts/sanity-test.sh
```

## Test Manifest Format
Each Java project directory can include a `test.txt` file to specify which compiled classes should be executed during testing.

**Format:**
```
# Comments start with #
ClassName
AnotherClass arg1 arg2
TestRunner --verbose input.txt
```

**Features:**
- One test per line
- Support for command-line arguments
- Comment lines (starting with #) are ignored
- Empty lines are ignored
- No arguments needed for simple test cases

**Example (`src/HelloPerson/test.txt`):**
```
# Test manifest for HelloPerson project
HelloWorld1
HelloWorld2
```

## GitHub Actions Integration
The `sanity-test.sh` script is called by the GitHub Actions CI workflow (`.github/workflows/ci.yml`) to ensure all Java programs build and run correctly across multiple platforms and Java versions.

**CI Matrix:**
- **Operating Systems:** Ubuntu, Windows, macOS
- **Java Versions:** 17, 21

## Adding New Projects
To add a new Java project for testing:

1. Create your project directory under `src/YourProjectName/`
2. Add your Java source files
3. (Optional) Create a Makefile for custom build steps
4. Create a `test.txt` file listing the main classes to test
5. The CI will automatically discover and test your project

The test script will handle compilation automatically, either using your Makefile or by directly invoking javac on all .java files.