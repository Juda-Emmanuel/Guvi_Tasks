create database EMPLOYEEINFO;
use EMPLOYEEINFO;
create table EMPLOYEE (
    Employee_No int (9999) primary key,
    Employee_Name varchar(50),
    Job varchar(50),
    Manager int(9999),
    Hire_Date date,
    Salary decimal(10, 2),
    Commission decimal(10, 2),
    Department_No int(9999));
    
select * from EMPLOYEE;
    
insert into EMPLOYEE values 
(8369, 'SMITH', 'CLERK', 8902, '1990-12-18', 800.00, NULL, 20),
(8499, 'ANYA', 'SALESMAN', 8698, '1991-02-20', 1600.00, 300.00, 30),
(8521, 'SETH', 'SALESMAN', 8698, '1991-02-22', 1250.00, 500.00, 30),
(8566, 'MAHADEVAN', 'MANAGER', 8839, '1991-04-02', 2985.00, NULL, 20),
(8654, 'MOMIN', 'SALESMAN', 8698, '1991-09-28', 1250.00, 1400.00, 30),
(8898, 'BINA', 'MANAGER', 8839, '1991-05-01', 2850.00, NULL, 30),
(8882, 'SHIVANSH', 'MANAGER', 8839, '1991-06-09', 2450.00, NULL, 10),
(8560, 'SCOTT', 'ANALYST', 8566, '1991-06-09', 3000.00, NULL, 20),
(8839, 'AMIR', 'PRESIDENT', NULL, '1991-11-18', 5000.00, NULL, 10),
(8844, 'KULDEEP', 'SALESMAN', 8698, '1991-09-08', 1500.00, 0.00, 30);

-- A. Display Employee_Name and Salary of employees whose salary is greater than or equal to 2200
SELECT Employee_Name, Salary 
FROM EMPLOYEE 
WHERE Salary >= 2200;

-- B. Display details of employees who are not getting a commission
SELECT * 
FROM EMPLOYEE 
WHERE Commission IS NULL;

-- C. Display employee name and salary of employees who don’t have their salary in the range of 2500 to 4000
SELECT Employee_Name, Salary
FROM EMPLOYEE 
WHERE Salary NOT BETWEEN 2500 AND 4000;

-- D. Display the name, job title, and salary of employees who don’t have a manager
SELECT Employee_Name, Job, Salary 
FROM EMPLOYEE 
WHERE Manager IS NULL;

-- E. Display the name of an employee whose name contains "A" as the third alphabet
SELECT Employee_Name 
FROM EMPLOYEE 
WHERE Employee_Name LIKE '__A%';

-- F. Display the name of an employee whose name contains "T" as the last alphabet
SELECT Employee_Name 
FROM EMPLOYEE 
WHERE Employee_Name LIKE '%T';


