-- Last updated: 09/10/2026, 09:23:53
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;