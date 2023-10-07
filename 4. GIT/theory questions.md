# What is git?
 ## Ans-
 - Git is a distributed version control system that is widely used for software development and other version control tasks. 

# 2.what is version control system?
## Ans-
- A version control system (VCS) is a software tool that manages changes to a set of files over time. 
    It is commonly used in software development to keep track of changes to source code, but it can also be
     used for other types of files such as documents, images, and configuration files.

# 3.What is github?
## Ans-
- GitHub is a web-based platform that serves as a hub for developers to collaborate on software development projects.
     It provides a platform for version control, code management, and project management. 

# 4.what is git clone?
## Ans-
- git clone is a Git command used to create a copy of a remote repository on a local machine. 
    This allows developers to have a local copy of the codebase to work on and make changes to, without affecting the original remote repository.

# 5.what is git pull?
## Ans-
- git pull is a Git command used to update a local repository with changes from a remote repository. 
     It combines two actions: fetching the latest changes from the remote repository and merging them into the local repository.

# 6.what is git push?
## Ans-
- git push is a Git command used to upload local repository changes to a remote repository. 
     It is used after a developer has made changes to their local repository and wants to make those changes available
     to other developers working on the same remote repository.

# 7.what is git commit?
## Ans-
- git commit is a Git command used to save changes made to a local repository. 
     It is used after a developer has made changes to their codebase and wants to create a new commit to save those changes.

# 8. Types of files in git:
1. Untracked files:
- These files are not tracked by git, usually new files created.
          To make untracked file to track, git add [file name] or git add .

2. UnModified:
- These files are tracked by git but nothing changed since last time commit. so no problem.

3. Modified:
     - These files are tracked by git and it was changed since last time commit. we have two options now
         - git add [file]      // mark the changes to stage (i.e accept)
         - git restore [file name]  // reject the change

4. staged
     -  These files are one whoose changes is make permanenty and will be included in next commit.
     - git commmit -m "msg here"   // commit all staged files
     - git push                    // push this commit
9. Basics Command:
    
    ## git clone : 
     -  Usage: git clone [url]
         - This command is used to obtain a repository from an existing URL.
    ## git add : 
     -  Usage: git add [file] or git add .
          - This command adds a file to the staging area.
          - git add . , adds all files into stage area
    ## git commit :
     - Usage: git commit -m “[ Type in the commit message]”
          - This command records or snapshots the file permanently in the version history.
    ## git diff  :
     - Usage: git diff
          - This command shows the file differences which are not yet staged.
    ## git status :
     - Usage: git status
         - This command lists all the files that have to be committed.
    ## git rm :
     - Usage: git rm [file]
        - This command deletes the file from your working directory and stages the deletion.
    ## git log :
     - Usage: git log
        - This command is used to list the version history for the current branch.
    ## git push :
     - Usage: git push [variable name] master
        - This command sends the committed changes of master branch to your remote repository.
    ## git pull :
     - Usage:  git pull [Repository Link]
       - This command fetches and merges changes on the remote server to your working directory.