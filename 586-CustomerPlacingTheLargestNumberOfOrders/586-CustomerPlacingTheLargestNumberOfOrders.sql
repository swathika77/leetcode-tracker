-- Last updated: 09/10/2026, 09:23:57
# Write your MySQL query statement below
SELECT customer_number
FROM Orders 
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;