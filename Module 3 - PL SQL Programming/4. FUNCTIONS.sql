CREATE OR REPLACE FUNCTION AnnualSalary(
    p_monthly_salary NUMBER
)
RETURN NUMBER
IS
BEGIN

    RETURN p_monthly_salary * 12;

END;
/

SET SERVEROUTPUT ON;

DECLARE

    yearly_salary NUMBER;

BEGIN

    yearly_salary := AnnualSalary(65000);

    DBMS_OUTPUT.PUT_LINE('Annual Salary : ' || yearly_salary);

END;
/