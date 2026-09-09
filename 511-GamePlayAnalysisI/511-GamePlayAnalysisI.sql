-- Last updated: 9/9/2026, 12:06:35 PM
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;