#!/bin/bash

cat $1 

filename="$1"
i=0

cat $filename | sort -k 3,3 -k 2,2 > Grades1.txt

filename="Grades1.txt"
while read line
	do
		info=$line
		#echo "INFO LOOKS LIKE: "
		#echo "$info"
		#echo "$info[1]" DOESNT WORK

		# Create variables for all the necessary values
		ID[$i]=$(echo $info | cut -d ' ' -f 1)
		Fname[$i]=$(echo $info | cut -d ' ' -f 2)
		Lname[$i]=$(echo $info | cut -d ' ' -f 3)
		S4=$(echo $info | cut -d ' ' -f 4)
		S5=$(echo $info | cut -d ' ' -f 5)
		S6=$(echo $info | cut -d ' ' -f 6)
				
		# Look at what the variables are
		#clear
		#echo $S1 

		# Determine the sum for each of the students
		Sum1=$(expr "$S5" + "$S6")
		Sum=$(expr "$Sum1" + "$S4")
		Avg=$(expr "$Sum" /  "3")
		
		# Look at the average value
		echo $Avg
		
		# Store this average value for later use
		Avgs[$i]=$Avg
		i=$(expr "$i" + "1")
		
		# Make sure i var is iterating
		echo $i
done < "$filename"

# Testing the Avgs variable
echo ${Avgs[*]}

clear
for (( x=0; x<$i; x = x + 1))
	do
	echo ${Avgs[x]} '['${ID[x]}']' ${Lname[x]}',' ${Fname[x]}
done
