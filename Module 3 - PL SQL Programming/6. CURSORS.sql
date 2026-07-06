SET SERVEROUTPUT ON;

DECLARE

    CURSOR employee_cursor IS

        SELECT employee_id,
               employee_name
        FROM Employees;

    v_id Employees.employee_id%TYPE;
    v_name Employees.employee_name%TYPE;

BEGIN

    OPEN employee_cursor;

    LOOP

        FETCH employee_cursor
        INTO v_id,
             v_name;

        EXIT WHEN employee_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(v_id || ' - ' || v_name);

    END LOOP;

    CLOSE employee_cursor;

END;
/