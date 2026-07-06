CREATE TABLE Employee_Log (

    log_message VARCHAR2(100)

);

CREATE TABLE Employees (

    employee_id NUMBER,
    employee_name VARCHAR2(50)

);

CREATE OR REPLACE TRIGGER Employee_Insert_Trigger

AFTER INSERT

ON Employees

FOR EACH ROW

BEGIN

    INSERT INTO Employee_Log
    VALUES ('Employee Added : ' || :NEW.employee_name);

END;
/

INSERT INTO Employees
VALUES (101,'Sharlyn');

SELECT * FROM Employee_Log;