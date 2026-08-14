-- Last updated: 8/14/2026, 10:48:47 AM
# Write your MySQL query statement below
select c.customer_id 
from customer c
join product p
group by c.customer_id
having count(distinct c.product_key) = count(distinct p.product_key)
