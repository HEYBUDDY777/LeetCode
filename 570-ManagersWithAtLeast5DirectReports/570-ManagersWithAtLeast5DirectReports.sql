-- Last updated: 8/14/2026, 10:50:00 AM
# Write your MySQL query statement below
select e1.name as name
from employee e1
join employee e2
on e1.id = e2.managerid
group by e2.managerid
HAVING COUNT(*) >= 5;