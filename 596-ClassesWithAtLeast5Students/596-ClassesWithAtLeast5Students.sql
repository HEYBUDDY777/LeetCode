-- Last updated: 8/14/2026, 10:49:46 AM
# Write your MySQL query statement below
select class
from courses
group by class
having count(*)>=5;