-- Last updated: 8/14/2026, 10:48:10 AM
WITH daily_amount AS (
    SELECT visited_on,
           SUM(amount) AS amount
    FROM Customer
    GROUP BY visited_on
)

SELECT a.visited_on,
       SUM(b.amount) AS amount,
       ROUND(AVG(b.amount), 2) AS average_amount
FROM daily_amount a
JOIN daily_amount b
ON b.visited_on BETWEEN DATE_SUB(a.visited_on, INTERVAL 6 DAY)
                   AND a.visited_on
GROUP BY a.visited_on
HAVING COUNT(*) = 7
ORDER BY a.visited_on;