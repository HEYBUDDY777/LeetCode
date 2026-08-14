-- Last updated: 8/14/2026, 10:48:42 AM
# Write your MySQL query statement below
select p.product_name,s.year,s.price
from sales s
join product p

where s.product_id =p.product_id;
