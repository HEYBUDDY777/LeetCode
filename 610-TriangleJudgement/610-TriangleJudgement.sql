-- Last updated: 8/14/2026, 10:49:42 AM
# Write your MySQL query statement below
select x,y,z,
case
when
x+y>z and
x+z>y and
y+z>x then 'Yes'
else 'No'
end as triangle
from triangle;