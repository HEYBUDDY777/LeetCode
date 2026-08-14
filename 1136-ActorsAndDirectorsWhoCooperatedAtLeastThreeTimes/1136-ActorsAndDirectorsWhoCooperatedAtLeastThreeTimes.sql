-- Last updated: 8/14/2026, 10:48:45 AM
# Write your MySQL query statement below
select actor_id,director_id
from actordirector as ad
#on ad.actor_id = ad.director_id
group by ad.actor_id , ad.director_id 
having count(*)>=3;