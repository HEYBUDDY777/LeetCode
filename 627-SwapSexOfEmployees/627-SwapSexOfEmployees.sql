-- Last updated: 8/14/2026, 10:49:32 AM
# Write your MySQL query statement below
update salary
set sex = 
case sex
when 'm' then 'f'
else 'm'
end;

