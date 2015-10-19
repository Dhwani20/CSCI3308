# Bash scripts end in the .sh file type

# Renaming a filename
# Shibang characters #!
# !/usr/bin/bash
# vars/args/values = ${1}, ".txt", 0 
# If input p's last 4 matches ext=args
# Then run comparison examination

# Variables
# Shell vars = UPPERCASE
# Positional vars = ${command-line position}
#	${0} = name of calling program
# Special vars:
#	exit status $?
#	number of args $#
#	value of command-line args $* and $@
#		$* = string of args
#		$@ = list of args

# Check Command Line Args
#if [ $# -ne 2]
#then
#	echo "Usage: Prog.sh($0) key1 key2"
#	exit 1
#fi

# Invoking Shell Scripts
# 1. bash script.sh
# 2. ./script.sh
#	need to change permisions: chmod u+x script.sh

# Killing a BAD process
# Command
#	kill [-<signal>] <pid>
#	Signals List: kill -l
#	List all available jobs: jobs
#	List all processes: ps -ef

# Pipes 
# Pipe outputs into another function ||

# Redirect
# >
