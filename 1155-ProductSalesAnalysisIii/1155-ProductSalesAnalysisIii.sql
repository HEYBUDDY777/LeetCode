-- Last updated: 8/14/2026, 10:48:38 AM
# Write your MySQL query statement below
select s1.product_id,s1.year as first_year,s1.quantity,s1.price
from sales s1

where(s1.product_id,s1.year) in(
select product_id,min(year)
from sales
group by product_id);