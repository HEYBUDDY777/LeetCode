-- Last updated: 8/14/2026, 10:49:51 AM
# Write your MySQL query statement below
select customer_number
from orders
group by customer_number
order by count(*) desc
limit 1;