-- Last updated: 9/9/2026, 12:06:26 PM
# Write your MySQL query statement below
select distinct viewer_id as id
from views
where author_id = viewer_id
order by id;