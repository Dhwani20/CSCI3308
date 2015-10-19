#!/bin/bash

cat $1 | sort -k 3,3 -k 2,2 > GradesAwk1.txt

#cat GradesAwk1.txt

awk '{for( i=4 ; i<=NF ; i= i + 1)j+= $i; print int(j/(NF-3)),"["$1"]",$3",",$2;j=0}' GradesAwk1.txt
