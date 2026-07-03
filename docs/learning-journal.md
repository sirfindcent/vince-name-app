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

- **What is a debugger?**

- **What is a breakpoint?**

- **Why is debugging better than only using `System.out.println`?**

- **What happens when I run the program in Debug mode?**

- **What is `Step Over`?**

- **What is `Step Into`?**

- **What is `Resume Program`?**
  
- **What variables did I inspect while debugging?**
- **What did `args.length` show when I ran the program without an argument?**
- **What did `args.length` show when I ran the program with an argument?**
- **What did `args[0]` contain when I provided a name?**
- **What is Evaluate Expression used for?**
- **What is the call stack?**
- **What did I learn from debugging the greeting program?**

---

### Capability 1.3: JUnit Unit Testing

- **What is a unit test?**
- **What is JUnit?**
- **What does `@Test` mean?**
- **What is an assertion?**
- **Why should I test the greeting logic automatically?**
- **What test case should check the default name?**
- **What test case should check a provided name?**
- **What is the difference between manual testing and automated testing?**
- **Why is it better to separate greeting logic from printing logic?**
- **How do automated tests help when I change code later?**
- **What did I learn from writing tests for the greeting program?**

---

### Phase 1 Reflection

- **What did I learn in Phase 1?**
- **What confused me the most?**
- **How did I solve or understand the confusing part?**
- **What do I feel more confident about now?**