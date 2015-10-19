/* STATE NAMES AND THEIR CODES */
select name, statecode from states;
/*
+----------------+-----------+
| name           | statecode |
+----------------+-----------+
| Alaska         | AK        |
| Alabama        | AL        |
| Arkansas       | AR        |
| Arizona        | AZ        |
| California     | CA        |
| Colorado       | CO        |
| Connecticut    | CT        |
| Delaware       | DE        |
| Florida        | FL        |
| Georgia        | GA        |
| Hawaii         | HI        |
| Iowa           | IA        |
| Idaho          | ID        |
| Illinois       | IL        |
| Indiana        | IN        |
| Kansas         | KS        |
| Kentucky       | KY        |
| Louisiana      | LA        |
| Massachusetts  | MA        |
| Maryland       | MD        |
| Maine          | ME        |
| Michigan       | MI        |
| Minnesota      | MN        |
| Missouri       | MO        |
| Mississippi    | MS        |
| Montana        | MT        |
| North Carolina | NC        |
| North Dakota   | ND        |
| Nebraska       | NE        |
| New Hampshire  | NH        |
| New Jersey     | NJ        |
| New Mexico     | NM        |
| Nevada         | NV        |
| New York       | NY        |
| Ohio           | OH        |
| Oklahoma       | OK        |
| Oregon         | OR        |
| Pennsylvania   | PA        |
| Rhode Island   | RI        |
| South Carolina | SC        |
| South Dakota   | SD        |
| Tennessee      | TN        |
| Texas          | TX        |
| Utah           | UT        |
| Virginia       | VA        |
| Vermont        | VT        |
| Washington     | WA        |
| Wisconsin      | WI        |
| West Virginia  | WV        |
| Wyoming        | WY        |
+----------------+-----------+
50 rows in set (0.00 sec)
*/


/* ALL COUNTIES STARTING WITH PRINCE */
select * from counties where name like 'Prince%';
/*
+-----------------------+-----------+-----------------+-----------------+
| name                  | statecode | population_1950 | population_2010 |
+-----------------------+-----------+-----------------+-----------------+
| Prince of Wales-Hyder | AK        |               0 |            5559 |
| Prince Georges        | MD        |          194182 |          863420 |
| Prince Edward         | VA        |           15398 |           23368 |
| Prince George         | VA        |           19679 |           35725 |
| Prince William        | VA        |           22612 |          402002 |
+-----------------------+-----------+-----------------+-----------------+
*/


/* 2010 Population for the state represented by Sen.Richard Lugar */
select population_2010 from states, senators where states.statecode = senators.statecode and senators.name = "Richard Lugar";
/*
+-----------------+
| population_2010 |
+-----------------+
|         6483802 |
+-----------------+
*/


/* Count the number of counties in Maryland */
select * from counties, states where states.name = 'Maryland' and counties.statecode = states.statecode;
/*
------------------+
| Allegany       | MD        |           89556 |           75087 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Anne Arundel   | MD        |          117392 |          537656 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Baltimore      | MD        |          270273 |          805029 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Calvert        | MD        |           12100 |           88737 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Caroline       | MD        |           18234 |           33066 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Carroll        | MD        |           44907 |          167134 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Cecil          | MD        |           33356 |          101108 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Charles        | MD        |           23415 |          146551 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Dorchester     | MD        |           27815 |           32618 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Frederick      | MD        |           62287 |          233385 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Garrett        | MD        |           21259 |           30097 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Harford        | MD        |           51782 |          244826 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Howard         | MD        |           23119 |          287085 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Kent           | MD        |           13677 |           20197 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Montgomery     | MD        |          164401 |          971777 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Prince Georges | MD        |          194182 |          863420 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Queen Annes    | MD        |           14579 |           47798 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| St. Marys      | MD        |           29111 |          105151 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Somerset       | MD        |           20745 |           26470 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Talbot         | MD        |           19428 |           37782 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Washington     | MD        |           78886 |          147430 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Wicomico       | MD        |           39641 |           98733 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Worcester      | MD        |           23148 |           51454 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
| Baltimore city | MD        |          949708 |          620961 | MD        |         5773552 |         5296486 |         2343001 |         1188044 |  12406.7 | Maryland | 1788-04-28        |
+----------------+-----------+-----------------+-----------------+-----------+-----------------+-----------------+-----------------+-----------------+----------+----------+-------------------+
24 rows
*/


/* Single query to find the name of the last admitted state to the union */
select name from states where admitted_to_union = (select max(admitted_to_union) from states);
/*
+--------+
| name   |
+--------+
| Hawaii |
+--------+
*/


/* All democratic senators that are not chairman of commitees or sub-comittees */
select name from senators where name not in (select chairman from committees) and affiliation = 'D' order by name;
/*
+--------------------+
| name               |
+--------------------+
| Harry Reid         |
| Jeff Merkley       |
| Joe Manchin        |
| Richard Blumenthal |
| Tom Udall          |
+--------------------+
*/
