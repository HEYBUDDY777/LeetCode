-- Last updated: 8/14/2026, 10:48:23 AM
# Write your MySQL query statement below
select distinct viewer_id as id
from views
where author_id = viewer_id
order by id;