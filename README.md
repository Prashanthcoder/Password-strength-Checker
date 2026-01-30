<!-- Project README for Password Checker -->
![status](https://img.shields.io/badge/status-prototype-yellow)
![language](https://img.shields.io/badge/language-Java-orange)

# Password Checker

A tiny console-based Java utility that evaluates password strength using simple character checks (letters, digits, and special characters).

## Table of Contents
- [What the project does](#what-the-project-does)
- [Why it is useful](#why-it-is-useful)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Build & Run](#build--run)
  - [Examples](#examples)
- [Where to get help](#where-to-get-help)
- [Who maintains and contributes](#who-maintains-and-contributes)
- [Files of interest](#files-of-interest)

## What the project does

`Password Checker` is a minimal Java program that reads a password from standard input and classifies it as `Weak`, `medium`, or `Strong` based on length and the presence of letters, digits, and special characters.

See the implementation: [src/PasswordChecker.java](src/PasswordChecker.java#L1-L200).

## Why it is useful

- **Small learning project**: Demonstrates basic Java I/O and string inspection.
- **Easy to extend**: A compact codebase for adding more rules (entropy checks, blacklist, regex policies).
- **Quick CLI tool**: Useful as a first-pass strength indicator in demos or classroom exercises.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or newer installed and `javac`/`java` available on your `PATH`.

### Build & Run

From the repository root run:

```bash
javac src/PasswordChecker.java
java -cp src PasswordChecker
```

Notes:
- The program uses the default package and reads input from the console.
- Run the `java` command from the repository root so the `src` directory is on the classpath.

### Examples

Example session (user input shown after the prompt):

```
Enter the password
myP@ssw0rd!
Strong
```

Other outputs:

- `Weak` — password length <= 6
- `medium` — neither weak nor strong (note: output is lowercase `medium` in code)
- `Strong` — length >= 8 and contains letters, digits, and special characters

## Where to get help

- Open an issue in this repository for bugs or questions.
- For usage questions, inspect the source: [src/PasswordChecker.java](src/PasswordChecker.java#L1-L200) and the short project note in [src/read.txt](src/read.txt#L1-L50).

## Who maintains and contributes

- Maintainer: repository owner (open an issue for contact or contributor coordination).
- To contribute, please read the contribution guidelines: [CONTRIBUTING.md](CONTRIBUTING.md)

If you want to propose changes:

1. Fork the repository.
2. Create a feature branch: `git checkout -b fix/feature-name`.
3. Make changes and add tests if applicable.
4. Submit a pull request describing the change.

## Files of interest

- Source: [src/PasswordChecker.java](src/PasswordChecker.java#L1-L200)
- Notes: [src/read.txt](src/read.txt#L1-L50)

---
