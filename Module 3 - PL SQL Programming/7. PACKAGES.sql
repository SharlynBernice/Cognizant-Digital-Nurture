CREATE OR REPLACE PACKAGE EmployeePackage AS

    PROCEDURE DisplayEmployee(
        p_name VARCHAR2,
        p_salary NUMBER
    );

    FUNCTION CalculateAnnualSalary(
        p_salary NUMBER
    ) RETURN NUMBER;

END EmployeePackage;
/

CREATE OR REPLACE PACKAGE BODY EmployeePackage AS

    PROCEDURE DisplayEmployee(
        p_name VARCHAR2,
        p_salary NUMBER
    )
    IS
    BEGIN

        DBMS_OUTPUT.PUT_LINE('Employee : ' || p_name);
        DBMS_OUTPUT.PUT_LINE('Salary   : ' || p_salary);

    END;

    FUNCTION CalculateAnnualSalary(
        p_salary NUMBER
    )
    RETURN NUMBER
    IS
    BEGIN

        RETURN p_salary * 12;

    END;

END EmployeePackage;
/

SET SERVEROUTPUT ON;

BEGIN

    EmployeePackage.DisplayEmployee('Sharlyn',65000);

    DBMS_OUTPUT.PUT_LINE(
        'Annual Salary : ' ||
        EmployeePackage.CalculateAnnualSalary(65000)
    );

END;
/