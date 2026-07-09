-- Last updated: 09/07/2026, 10:07:35
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT(salary) from Employee order by salary DESC
      LIMIT 1 OFFSET N
  );
END