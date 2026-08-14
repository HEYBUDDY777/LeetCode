-- Last updated: 8/14/2026, 10:52:19 AM
# Write your MySQL query statement below
select p.firstname,p.lastname,a.city,a.state
from Person p
left join Address a
on p.personId = a.personId;