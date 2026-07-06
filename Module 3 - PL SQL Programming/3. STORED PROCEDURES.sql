CREATE OR REPLACE PROCEDURE CalculateBonus(
    p_employee_name IN VARCHAR2,
    p_salary IN NUMBER
)
AS
    v_bonus NUMBER;
BEGIN

    IF p_salary >= 80000 THEN
        v_bonus := p_salary * 0.20;
    ELSE
        v_bonus := p_salary * 0.10;
    END IF;

    DBMS_OUTPUT.PUT_LINE('Employee : ' || p_employee_name);
    DBMS_OUTPUT.PUT_LINE('Salary   : ' || p_salary);
    DBMS_OUTPUT.PUT_LINE('Bonus    : ' || v_bonus);

END;
/

BEGIN
    CalculateBonus('Sharlyn',65000);
END;
/