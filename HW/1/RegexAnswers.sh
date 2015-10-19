#!/bin/bash

# Problem 1 Solution
egrep [0-9]$ regex_practice_data.txt | wc -l 

# Problem 2 Solution
egrep '^[^aeiouAEIOU]' regex_practice_data.txt | wc -l

# Problem 3 Solution
egrep '^[a-zA-Z]{12}$' regex_practice_data.txt | wc -l

# Problem 4 Solution
egrep '^[0-9]{3}-[0-9]{3}-[0-9]{4}$' regex_practice_data.txt | wc -l

# Problem 5 Solution
egrep '^303-[0-9]{3}-[0-9]{4}$' regex_practice_data.txt | wc -l

# Problem 6 Solution
egrep '^[aeiouAEIOU][a-zA-Z0-9@\.-]*[0-9]$' regex_practice_data.txt | wc -l 

# Problem 7 Solution
egrep '@geocities.com$' regex_practice_data.txt | wc -l

# Problem 8 Solution
egrep '@^[a-zA-Z0-9.]*\.[a-zA-Z0-9]{3}$' regex_practice_data.txt | wc -l
