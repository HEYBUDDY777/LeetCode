-- Last updated: 8/14/2026, 10:51:57 AM
# Write your MySQL query statement below

-- select email 
-- from person
-- group by email
-- having count(*) = 1;

DELETE p1

FROM Person p1, Person p2
WHERE p1.Email = p2.Email
AND p1.Id > p2.Id;