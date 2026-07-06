-- ===========================================
-- MODULE 3 - PL/SQL PROGRAMMING
-- Assignment 1 : CONTROL STRUCTURES
-- ===========================================

SET SERVEROUTPUT ON;

DECLARE
    employee_name   VARCHAR2(50) := 'Sharlyn';
    salary          NUMBER := 65000;
    bonus           NUMBER;
    grade           CHAR(1);
BEGIN

    DBMS_OUTPUT.PUT_LINE('Employee Name : ' || employee_name);
    DBMS_OUTPUT.PUT_LINE('Salary        : ' || salary);

    --------------------------------------------------
    -- IF ELSE
    --------------------------------------------------

    IF salary >= 80000 THEN
        bonus := salary * 0.20;

    ELSIF salary >= 50000 THEN
        bonus := salary * 0.10;

    ELSE
        bonus := salary * 0.05;

    END IF;

    DBMS_OUTPUT.PUT_LINE('Bonus         : ' || bonus);

    --------------------------------------------------
    -- CASE
    --------------------------------------------------

    grade := 'B';

    CASE grade

        WHEN 'A' THEN
            DBMS_OUTPUT.PUT_LINE('Performance : Excellent');

        WHEN 'B' THEN
            DBMS_OUTPUT.PUT_LINE('Performance : Good');

        WHEN 'C' THEN
            DBMS_OUTPUT.PUT_LINE('Performance : Average');

        ELSE
            DBMS_OUTPUT.PUT_LINE('Performance : Needs Improvement');

    END CASE;

    --------------------------------------------------
    -- FOR LOOP
    --------------------------------------------------

    DBMS_OUTPUT.PUT_LINE(CHR(10) || 'FOR LOOP');

    FOR i IN 1..5 LOOP

        DBMS_OUTPUT.PUT_LINE('Iteration : ' || i);

    END LOOP;

    --------------------------------------------------
    -- WHILE LOOP
    --------------------------------------------------

    DBMS_OUTPUT.PUT_LINE(CHR(10) || 'WHILE LOOP');

    DECLARE
        counter NUMBER := 1;
    BEGIN

        WHILE counter <= 5 LOOP

            DBMS_OUTPUT.PUT_LINE('Counter : ' || counter);

            counter := counter + 1;

        END LOOP;

    END;

END;
/