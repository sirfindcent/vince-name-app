# Learning Journal

## Phase 0: Git, Environment Setup & Project Foundation

### Git and GitHub

- **What is Git?**
  Distributed version control that track every change in our code.
- **What is GitHub?**
  Cloud software acting as a hub for repositories.
- **What is the difference between Git and GitHub?**
  Git is a tool to track changes while Git is a online place to store git repositories. Git is decentralized. Github is centralized.
- **Why do developers use Git?**
  To track changes in code
- **What is a repository?**
  Folder is just container for any file. Repository is a folder that stores all files for one project.
- **What is a git repository?**
  Git repo is a repo that git tracks. `.git` folder inside the repo is the one tracking all changes made to files in the project.
- **What is the difference between a local repo and a remote repo?**
  Local repo is a git repo stored in the computer. Remote repo is a git repo stored online.

### Git Workflow

- **What does `git status` show?**
  To see which files are staged, unstaged, or untracked.

- **What does `git add` do?**
  Choose which changes we want to save.
- **What does `git commit` do?**
  Saved the staged changes as a checkpoint to the repository.

- **What does `git push` do?**
  Send the checkpoint to a remote repository like github so others can see them.

- **What is the difference between commit and push?**
  Commit saves staged changes in local repo while push sends that staged changes to Github.

### Branching

- **What is a branch?**
  Separate workspace where you can make changes and try new ideas without affecting the main project.
  
- **Why should you use branches instead of always working on `main`?**
  It allows us to work on different parts of a project without interfering with the main branch

- **What does it mean to merge a branch?**
  Combining changes from one branch into another. Bringing work together after working separately on different features.

### Merge Conflict

- **What is a merge conflict?**
  Conflict happens when Git cannot automatically merge changes.

- **Why does a merge conflict happen?**
  When two branches touch the same part of a file.

- **What should you do when there is a merge conflict?**
  We decide what the final version should be.

### `.gitignore`

- **What is `.gitignore`?**
  This tells Git which files and folders to ignore.

### Commit Messages

- **What is a conventional commit?**
  Specification for writing standarized commit messages that follow a specific format.
  
- **What are the common types**
  - `feat`: new feature
  - `fix`: bug fix
  - `docs`: documentation only
  - `style`: formatting only, no logic change
  - `refactor`: code cleanup without changing behavior
  - `test`: adding or changing tests
  - `chore`: setup, config, maintenance
  
- **Why is a clear commit message important?**
  Clear intention of changes, automate version bumping, and generate changelogs automaticlly.

## Phase 1: Console Java Foundation + IDE Mastery + Testing
Reference: https://www.geeksforgeeks.org/java/java-main-method-public-static-void-main-string-args/

### Capability 1.1: Basic Console Application
- **What is a Java console application?**
  Java application where we can input something in the command line and it outputs something in the command line.

- **What is the `main` method?**
  JVM looks specifically for a properly defined main() method to start execution.

- **Why is `public static void main(String[] args)` important?**
 - `public` - Access modifier. Ensure that the method can be accesed globally.
 - `static` - Keyword. JVM can invoke it without 
 - `void` - Return type. Return nothing.
 - `main` - name of the Java main method. This is an identifier which means the JVM will look for this method name.
 - `String[] args`: `String[]` means Array of String and `args` is the name of the array.

- **What is a command-line argument?**
  - command-line argument allows you to input something in the command-line.

- **Why should I check `args.length` before using `args[0]`?**
  If the args.length is zero, there is nothing in the input.
---

### Capability 1.2: IntelliJ Debugger
Reference: https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html#setting-breakpoints

- **What is a debugging?**
 Debugging is the process of detecing and correcting errors in a program. With debugger, you can pause the execution at a specified point, and analyzing the program state.

- **What is a breakpoint?**
  marker in specific line so when the program reaches the line, the program will be paused and we can examine what is happening.

- **Why is debugging better than only using `System.out.println`?**
  Less repetitive, better integrations with IDEs, and precise.

- **What happens when I run the program in Debug mode?**
  The program runs normally until a breakpoint is hit. IntelliJ IDEA pauses the program, hightlight the breakpoint line, and shows the Debug tool window.

- **What is `Step Over`?**
  Run this line, the move to the next line


- **What is `Step Into`?**
  Go inside the method being called

- **What is `Step Out`?**
  Finish the current method and return to the place that called it

- **What is `Resume Program`?**
  Continue the program until next breakpoint

- **What variables did I inspect while debugging?**
  `args`

- **What did `args.length` show when I ran the program without an argument?**
  args.length equal to 0

- **What did `args.length` show when I ran the program with an argument**
  args.length equal to 1

- **What did `args[0]` contain when I provided a name?**
  The provided name

- **What is Evaluate Expression used for?**
  Evaluate the state of an expression. To see a code's value at a specific point.

- **What is the call stack?**
  Shows the active methods that led to the current line.

---

### Capability 1.3: JUnit Unit Testing

- **What is a unit test?**
  Type of test where **one invidual piece of code or unit** is being tested by itself. Unit test isolates one single piece of code and verify that piece is working correctly.

- **What is JUnit?**
  Java testing framework used for writing and executing unit tests for individual classes.

- **What does `@Test` mean?**
  Indicates that the class below is for testing. 

- **What is an assertion?**
    Used to validate the expected outcome of a test by comparing it with the actual result.

- **Why should I test the greeting logic automatically?**
  It helps improve code quality and reduc the effort of repeated testing.

- **What is the difference between manual testing and automated testing?**
  Verifying individual units of code without relying on automated test framework. Mainly during debugging or initial code validation.

- **Why is it better to separate greeting logic from printing logic?**
  Greeting logic can be tested separately.
  
- **How do automated tests help when I change code later?**
  Help catching the mistakes early by checking that the program still gives the expected result after changes.

- **What did I learn from writing tests for the greeting program?**
  Learn how to do unit test automatically with Junit 5 frameworl.

### Phase 1 Reflection
- **What do I feel more confident about now?**
  - Explaining public static void main(String[] args)
  - Debugging my code with IntelliJ
  - Testing my code with IntelliJ