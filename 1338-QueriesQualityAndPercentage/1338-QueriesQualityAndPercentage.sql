-- Last updated: 8/14/2026, 10:48:18 AM
SELECT
    query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(
        SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100 / COUNT(*),
        2
    ) AS poor_query_percentage
FROM Queries
GROUP BY query_name;