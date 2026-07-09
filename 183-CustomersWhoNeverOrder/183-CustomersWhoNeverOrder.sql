-- Last updated: 09/07/2026, 10:07:24
# Write your MySQL query statement below

SELECT 
    c.name as Customers
FROM
    customers as c
LEFT JOIN
    orders as o
    ON o.customerId=c.id
WHERE
    o.id is NULL