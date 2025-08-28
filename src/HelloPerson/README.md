# Hello Person Example

A simple Java example demonstrating object-oriented programming concepts for new students.

## Files

- `Person.java` - A basic class with name/age attributes and methods
- `HelloWorld1.java` - Version 1: Direct method calls and inline formatting
- `HelloWorld2.java` - Version 2: Uses a helper function to reduce code duplication
- `Makefile` - Build and run commands

## Basic Java Commands

Compile all files together (recommended):
```bash
javac *.java
java HelloWorld1
java HelloWorld2
```

Or compile individually:
```bash
javac Person.java HelloWorld1.java
java HelloWorld1

javac Person.java HelloWorld2.java
java HelloWorld2
```

## Building and Running (Make Targets)

For faster/easier building when working in this directory, use the provided Makefile:

Compile both versions:
```bash
make all
```

Run version 1:
```bash
make run1
```

Run version 2:
```bash
make run2
```

Clean compiled files:
```bash
make clean
```

## CI Integration

This project is automatically tested by the repository's CI system using `javac *.java` compilation, which ensures cross-platform compatibility and proper dependency resolution.

## What You'll Learn

- Class instantiation and constructors
- Method calls and parameters
- String formatting
- Code organization and helper functions (v2)
- Build automation with Make (optional for local development)