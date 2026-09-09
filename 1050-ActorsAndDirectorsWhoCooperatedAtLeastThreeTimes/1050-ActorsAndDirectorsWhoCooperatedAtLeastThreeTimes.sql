-- Last updated: 9/9/2026, 12:06:46 PM
# Write your MySQL query statement below
select actor_id,director_id
from actordirector as ad
#on ad.actor_id = ad.director_id
group by ad.actor_id , ad.director_id 
having count(*)>=3;