-- Last updated: 8/14/2026, 10:49:53 AM
# Write your MySQL query statement below
select name
from customer 
where  referee_id <> 2 or referee_id is null;