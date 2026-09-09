-- Last updated: 9/9/2026, 12:06:07 PM
SELECT p.product_name,
       SUM(o.unit) AS unit
FROM Orders o
JOIN Products p
ON o.product_id = p.product_id
WHERE YEAR(o.order_date) = 2020
  AND MONTH(o.order_date) = 2
GROUP BY o.product_id, p.product_name
HAVING SUM(o.unit) >= 100;