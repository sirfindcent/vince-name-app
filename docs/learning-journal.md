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
