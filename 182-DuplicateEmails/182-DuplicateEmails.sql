-- Last updated: 09/07/2026, 10:07:26
# Write your MySQL query statement below
# Please upvote, if you like my solution
# 1
SELECT email from Person
group by email
having count(email) > 1;

