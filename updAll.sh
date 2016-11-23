#!/bin/bash
# update git repo
if [[ $# -eq 0 ]] ; then
   echo we need a string for commit message
   exit
fi
git add .
git commit =m "$@"
git push origin master
