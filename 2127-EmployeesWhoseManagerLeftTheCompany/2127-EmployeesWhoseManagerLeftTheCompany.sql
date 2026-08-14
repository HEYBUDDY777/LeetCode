-- Last updated: 8/14/2026, 10:47:50 AM
select employee_id
from Employees
where salary<30000 and 
manager_id not in(select employee_id from employees)
order by employee_id;