-- Last updated: 9/9/2026, 12:06:50 PM
# Write your MySQL query statement below
select c.customer_id 
from customer c
join product p
group by c.customer_id
having count(distinct c.product_key) = count(distinct p.product_key)
