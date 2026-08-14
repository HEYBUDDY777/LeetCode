-- Last updated: 8/14/2026, 10:52:04 AM
# Write your MySQL query statement below
select distinct p1.email
from person p1
join person p2
on p1.email = p2.email
and p1.id <> p2.id;
