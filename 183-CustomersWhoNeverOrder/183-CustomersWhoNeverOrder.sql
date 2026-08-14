-- Last updated: 8/14/2026, 10:52:01 AM
# Write your MySQL query statement below
select c.name as Customers
from customers c
left join orders o
on c.id = o.customerid
where
o.customerid is null;