-- Last updated: 9/9/2026, 12:06:42 PM
# Write your MySQL query statement below
select s1.product_id,s1.year as first_year,s1.quantity,s1.price
from sales s1

where(s1.product_id,s1.year) in(
select product_id,min(year)
from sales
group by product_id);