-- Last updated: 8/14/2026, 10:52:08 AM
# Write your MySQL query statement below
select e.name as Employee
from employee e
join employee m
on e.managerid = m.id
where e.salary>m.salary;