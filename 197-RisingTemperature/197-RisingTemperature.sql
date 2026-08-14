-- Last updated: 8/14/2026, 10:51:54 AM
SELECT w2.id
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w2.recordDate, w1.recordDate) = 1
WHERE w2.temperature > w1.temperature;