/* Sorting in ascending or descending order */
SELECT * FROM store order by Name;
SELECT * FROM store order by Name desc;

/* Limiting the number of ouputs */
SELECT * FROM store order by Name limit 3;
SELECT * FROM store order by Name desc limit 3;

/* This computes the prices greater than 1 */
SELECT Name FROM store WHERE Price > 1;

/* This computes the product of the quantity and the prices for each item */
SELECT Name,Qty*Price as Extended_Price FROM store;

/* This computes the total cost of all the items in the store */
SELECT SUM(Qty*Price) as Total Price FROM store;

/* This tells the number of different items in the store */
SELECT COUNT(Name) as Items FROM store;

/* This is the total enrollment over all the classes */
SELECT SUM(count) FROM Enrollment;

/* This lists all the CS classes */
SELECT Name FROM Course WHERE deptID = 1;

/* This the total number of different courses taught */
SELECT COUNT(Name) FROM Course;

/* This is the total number of different departments */
SELECT COUNT(Name) FROM Dept;

/* This lists all the classes with the department and class name on one line */
SELECT Dept.Name as Dept_Name, Course.Name FROM Course, Dept WHERE Course.deptID=Dept.Id;
/* OR */
SELECT Dept.Name, Course.Name FROM Course JOIN Dept ON Course.deptID=Dept.Id;

/* This adds the department and classes on the same line */
SELECT CONCAT(Dept.Name,' ', Course.Name) as Courses FROM Course JOIN Dept ON Course.deptID=Dept.Id;

