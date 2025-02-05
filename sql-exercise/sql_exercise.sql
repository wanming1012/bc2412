DROP DATABASE IF EXISTS BOOTCAMP_EXERCISE1;
CREATE DATABASE BOOTCAMP_EXERCISE1;

USE MATTHEW;

DROP TABLE IF EXISTS JOB_HISTORY;
DROP TABLE IF EXISTS EMPLOYEES;
DROP TABLE IF EXISTS JOBS;
DROP TABLE IF EXISTS JOB_GRADES;
DROP TABLE IF EXISTS DEPARTMENTS;
DROP TABLE IF EXISTS LOCATIONS;
DROP TABLE IF EXISTS COUNTRIES;
DROP TABLE IF EXISTS REGIONS;

CREATE TABLE REGIONS (
	REGION_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    REGION_NAME VARCHAR(25) UNIQUE NOT NULL
);

CREATE TABLE COUNTRIES (
	COUNTRY_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    COUNTRY_NAME VARCHAR(40) UNIQUE NOT NULL,
    REGION_ID INTEGER NOT NULL,
    FOREIGN KEY(REGION_ID) REFERENCES REGIONS(REGION_ID)
);

CREATE TABLE LOCATIONS (
	LOCATION_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    STREET_ADDRESS VARCHAR(25) NOT NULL,
    POSTAL_CODE VARCHAR(12) NOT NULL,
    CITY VARCHAR(30) NOT NULL,
    STATE_PROVINCE VARCHAR(12) NOT NULL,
    COUNTRY_ID INTEGER NOT NULL,
    FOREIGN KEY(COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
);

CREATE TABLE DEPARTMENTS (
	DEPARTMENT_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    DEPARTMENT_NAME VARCHAR(30) NOT NULL,
    MANAGER_ID INTEGER NOT NULL,
    LOCATION_ID INTEGER NOT NULL,
    -- FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID),
    FOREIGN KEY(LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
);

CREATE TABLE JOB_GRADES (
	GRADE_LEVEL VARCHAR(2) PRIMARY KEY,
    LOWEST_SAL INTEGER,
    HIGHEST_SAL INTEGER
);

CREATE TABLE JOBS (
	JOB_ID VARCHAR(10) PRIMARY KEY,
    JOB_TITLE VARCHAR(35) UNIQUE NOT NULL,
    GRADE_LEVEL VARCHAR(2) NOT NULL,
    FOREIGN KEY(GRADE_LEVEL) REFERENCES JOB_GRADES(GRADE_LEVEL)
);

CREATE TABLE EMPLOYEES (
	EMPLOYEE_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    FIRST_NAME VARCHAR(20) NOT NULL,
    LAST_NAME VARCHAR(25) NOT NULL,
    EMAIL VARCHAR(25) UNIQUE,
    PHONE_NUMBER VARCHAR(20),
    HIRE_DATE DATE NOT NULL,
    JOB_ID VARCHAR(10) NOT NULL,
    SALARY INTEGER NOT NULL,
    COMMISSION_PCT INTEGER NOT NULL,
    MANAGER_ID INTEGER,
    DEPARTMENT_ID INTEGER NOT NULL,
    FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID),
    FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID),
    FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);

CREATE TABLE JOB_HISTORY (
	EMPLOYEE_ID INTEGER NOT NULL,
    START_DATE DATE NOT NULL,
    END_DATE DATE,
    JOB_ID VARCHAR(10) NOT NULL,
    DEPARTMENT_ID INTEGER NOT NULL,
    PRIMARY KEY(EMPLOYEE_ID, START_DATE),
    FOREIGN KEY(EMPLOYEE_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID),
    FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID),
    FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);

INSERT INTO REGIONS (REGION_NAME) VALUES ('REGION 1');
INSERT INTO REGIONS (REGION_NAME) VALUES ('REGION 2');
-- SELECT * FROM REGIONS;

INSERT INTO COUNTRIES (COUNTRY_NAME, REGION_ID) VALUES 
	('COUNTRY 1', 1),
	('COUNTRY 2', 1),
	('COUNTRY 3', 2),
	('COUNTRY 4', 2),
	('COUNTRY 5', 2);
-- SELECT * FROM COUNTRIES;

INSERT INTO LOCATIONS (STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES
	('STREET 1', 'POSTAL 1', 'CITY 1', 'STATE 1', 1),
	('STREET 2', 'POSTAL 2', 'CITY 2', 'STATE 2', 1),
	('STREET 3', 'POSTAL 3', 'CITY 3', 'STATE 3', 2),
	('STREET 4', 'POSTAL 4', 'CITY 4', 'STATE 4', 2),
	('STREET 5', 'POSTAL 5', 'CITY 5', 'STATE 5', 3),
	('STREET 6', 'POSTAL 6', 'CITY 6', 'STATE 6', 3),
	('STREET 7', 'POSTAL 7', 'CITY 7', 'STATE 7', 4),
	('STREET 8', 'POSTAL 8', 'CITY 8', 'STATE 8', 4),
	('STREET 9', 'POSTAL 9', 'CITY 9', 'STATE 9', 4);
    
-- SELECT * FROM LOCATIONS;

INSERT INTO DEPARTMENTS (DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES
	('DEPARTMENT 1', 1, 1),
	('DEPARTMENT 2', 2, 2),
 	('DEPARTMENT 3', 2, 5);
-- 	('DEPARTMENT 4', 4, 4),
-- 	('DEPARTMENT 5', 5, 5),
-- 	('DEPARTMENT 6', 6, 6);
    
-- SELECT * FROM DEPARTMENTS;
    
INSERT INTO JOB_GRADES (GRADE_LEVEL, LOWEST_SAL, HIGHEST_SAL) VALUES
	('E1', 1000, 2000),
	('E2', 1500, 2500),
	('E3', 2000, 3000),
	('M1', 5000, 7000),
	('M2', 6000, 9000);

-- SELECT * FROM JOB_GRADES;
    
INSERT INTO JOBS (JOB_ID, JOB_TITLE, GRADE_LEVEL) VALUES
	('PE1', 'PROCESS ENGINEER', 'E1'),
	('PE2', 'SENIOR PROCESS ENGINEER 1', 'E2'),
	('PE3', 'SENIOR PROCESS ENGINEER 2', 'E3'),
	('ME1', 'MECHANICAL ENGINEER', 'E1'),
	('ME2', 'SENIOR MECHANICAL ENGINEER 1', 'E2'),
	('ME3', 'SENIOR MECHANICAL ENGINEER 2', 'E3'),
	('EM', 'ENGINEERING MANAGER', 'M1'),
	('SEM', 'SENIOR ENGINEERING MANAGER', 'M2');
-- SELECT * FROM JOBS;

INSERT INTO EMPLOYEES (FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES
	('FIRST NAME 1', 'LAST NAME 1', 'EMAIL 1', 'PHONE NUMBER 1', '2024-01-01', 'EM', 5000, 1000, NULL, 1),
	('FIRST NAME 2', 'LAST NAME 2', 'EMAIL 2', 'PHONE NUMBER 2', '2024-01-02', 'SEM', 7000, 1000, NULL, 2),
	('FIRST NAME 3', 'LAST NAME 3', 'EMAIL 3', 'PHONE NUMBER 3', '2024-01-03', 'PE1', 1500, 100, 1, 1),
	('FIRST NAME 4', 'LAST NAME 4', 'EMAIL 4', 'PHONE NUMBER 4', '2024-01-04', 'PE2', 2000, 200, 1, 1),
	('FIRST NAME 5', 'LAST NAME 5', 'EMAIL 5', 'PHONE NUMBER 5', '2024-01-05', 'PE3', 3000, 400, 1, 1),
	('FIRST NAME 6', 'LAST NAME 6', 'EMAIL 6', 'PHONE NUMBER 6', '2024-01-06', 'ME1', 1000, 50, 2, 2),
	('FIRST NAME 7', 'LAST NAME 7', 'EMAIL 7', 'PHONE NUMBER 7', '2024-01-07', 'ME2', 1500, 100, 2, 2),
	('FIRST NAME 8', 'LAST NAME 8', 'EMAIL 8', 'PHONE NUMBER 8', '2024-01-08', 'ME3', 2500, 200, 2, 2),
	('FIRST NAME 9', 'LAST NAME 9', 'EMAIL 9', 'PHONE NUMBER 9', '2024-01-09', 'ME1', 1200, 50, 1, 3),
	('FIRST NAME 10', 'LAST NAME 10', 'EMAIL 10', 'PHONE NUMBER 10', '2024-01-10', 'ME2', 1700, 100, 1, 3),
	('FIRST NAME 11', 'LAST NAME 11', 'EMAIL 11', 'PHONE NUMBER 11', '2024-01-11', 'ME3', 2700, 200, 1, 3);

-- SELECT * FROM EMPLOYEES;

INSERT INTO JOB_HISTORY (EMPLOYEE_ID, START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID) VALUES
	(2, '2024-07-01', NULL, 'SEM', 2),
	(2, '2024-01-01', '2024-06-30', 'EM', 2),
	(1, '2024-01-01', NULL, 'EM', 1),
	(3, '2024-01-03', '2024-06-30', 'ME1', 1),
	(4, '2024-01-04', NULL, 'PE2', 1),
	(5, '2024-01-05', NULL, 'PE3', 1),
	(3, '2024-07-01', NULL, 'PE1', 1),
	(6, '2024-01-06', NULL, 'ME1', 2),
	(7, '2024-01-07', NULL, 'ME2', 2),
	(8, '2024-01-08', '2024-06-30', 'ME1', 2),
	(8, '2024-07-01', '2024-12-31', 'ME2', 2),
	(8, '2025-01-01', NULL, 'ME3', 2),
	(9, '2024-01-09', NULL, 'ME1', 3),
	(10, '2024-01-10', NULL, 'ME2', 3),
	(11, '2024-01-11', NULL, 'ME3', 3);
-- SELECT * FROM JOB_HISTORY;

-- EXERCISE 3
SELECT L.LOCATION_ID, L.STREET_ADDRESS, L.CITY, L.STATE_PROVINCE, C.COUNTRY_NAME
FROM LOCATIONS L LEFT JOIN COUNTRIES C ON L.COUNTRY_ID = C.COUNTRY_ID;

-- EXERCISE 4
SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_ID
FROM EMPLOYEES;

-- EXERCISE 5
SELECT E.FIRST_NAME, E.LAST_NAME, E.JOB_ID, E.DEPARTMENT_ID
FROM EMPLOYEES E 
	LEFT JOIN DEPARTMENTS D ON D.DEPARTMENT_ID = E.DEPARTMENT_ID
    LEFT JOIN LOCATIONS L ON L.LOCATION_ID = D.LOCATION_ID
    LEFT JOIN COUNTRIES C ON C.COUNTRY_ID = L.COUNTRY_ID
WHERE C.COUNTRY_NAME = 'COUNTRY 1';
    
-- EXERCISE 6
SELECT E1.EMPLOYEE_ID, E1.LAST_NAME, E1.MANAGER_ID, E2.LAST_NAME
FROM EMPLOYEES E1 LEFT JOIN EMPLOYEES E2 ON E1.MANAGER_ID = E2.EMPLOYEE_ID
WHERE E1.MANAGER_ID IS NOT NULL;

-- EXERCISE 7
SELECT FIRST_NAME, LAST_NAME, HIRE_DATE
FROM EMPLOYEES E
WHERE E.HIRE_DATE >  (
	SELECT HIRE_DATE
	FROM EMPLOYEES
	WHERE FIRST_NAME = 'FIRST NAME 3' AND LAST_NAME = 'LAST NAME 3'
);

-- EXERCISE 8
SELECT D.DEPARTMENT_NAME, COUNT(*) AS NUM_OF_EMPLOYEES
FROM DEPARTMENTS D INNER JOIN EMPLOYEES E ON D.DEPARTMENT_ID = E.DEPARTMENT_ID
GROUP BY D.DEPARTMENT_ID;

-- EXERCISE 9
SELECT E.EMPLOYEE_ID, J.JOB_TITLE, DATEDIFF(IFNULL(H.END_DATE, CURRENT_DATE()), H.START_DATE) AS NUM_OF_DAYS
FROM EMPLOYEES E 
	LEFT JOIN JOB_HISTORY H ON H.EMPLOYEE_ID = E.EMPLOYEE_ID
	LEFT JOIN JOBS J ON J.JOB_ID = H.JOB_ID
WHERE E.DEPARTMENT_ID = 1;

-- EXERCISE 10
SELECT D.DEPARTMENT_NAME, CONCAT(E.FIRST_NAME, ' ', E.LAST_NAME) AS MANAGER_NAME, L.CITY, C.COUNTRY_NAME
FROM DEPARTMENTS D 
	LEFT JOIN EMPLOYEES E ON E.EMPLOYEE_ID = D.MANAGER_ID
	LEFT JOIN LOCATIONS L ON L.LOCATION_ID = D.LOCATION_ID
    LEFT JOIN COUNTRIES C ON C.COUNTRY_ID = L.COUNTRY_ID;
    
-- EXERCISE 11
SELECT D.DEPARTMENT_NAME, ROUND(IFNULL(AVG(E.SALARY), 0),1) AS AVG_SALARY
FROM DEPARTMENTS D
	LEFT JOIN EMPLOYEES E ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
GROUP BY D.DEPARTMENT_ID;