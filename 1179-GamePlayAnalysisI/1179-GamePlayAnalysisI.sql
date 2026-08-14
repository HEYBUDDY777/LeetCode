-- Last updated: 8/14/2026, 10:48:34 AM
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;