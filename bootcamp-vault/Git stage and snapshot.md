#status #git #add #reset #diff #stage #commit

```bash
git status
```
>show modified files in working directory, staged for your next commit

```bash
git add file 
or
git add *
```
>add a file in updated for to your next commit [stage]

```bash
git reset file
or 
git reset * 
```
> untage a file added to a commit 

```bash
git diff 
```
> difference to what's chaged but not staged

```bash
git diff staged
```
> show what's changed but not commited 

```bash
git commit -m "message"
```
>commit your staged content as a new commit snapshot
