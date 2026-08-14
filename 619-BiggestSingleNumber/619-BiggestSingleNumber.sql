-- Last updated: 8/14/2026, 10:49:39 AM
# Write your MySQL query statement below
select max(num) as num
from(
select num
from mynumbers
group by num
having count(*) = 1
)t;





