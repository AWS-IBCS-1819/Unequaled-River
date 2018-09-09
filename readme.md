This repository will hold all of my class work and projects for this computer science class.

Cheat sheet for how to use gitub:
git status	list which (unstaged) files have changed
git diff	list (unstaged) changes to files
git log	list recent commits
git add fn	stage file
git commit -m 'message'	commit file
git commit -am 'message'	add/commit all changes from all tracked files (no untracked files) in one go

git reset filename	unstage file
git commit --amend -m 'message'	alter the last commit (add any staged files, new comment)
git reset --soft HEAD^	undo previous commit, put changes in staging
git reset --hard HEAD^	Undo last commit and all changes
git reset --hard HEAD^^	Undo two (^^) last commits and all changes
git checkout -- cats.html index.html	Undo all changes that were made to files cats.html and index.html
git rebase --onto <commit-id>\^ <commit-id> HEAD	remove specific commit from repository. the \ in ^ is just an escape char to make zsh play nice and is not necessary if using bash.
find more on:https://gist.github.com/davfre/8313299
