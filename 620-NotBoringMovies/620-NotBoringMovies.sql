-- Last updated: 8/14/2026, 10:49:36 AM
# Write your MySQL query statement below
select * 
from cinema
where id%2 = 1
and description<> "boring"
order by rating desc;

