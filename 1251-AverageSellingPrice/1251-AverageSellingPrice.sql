-- Last updated: 9/9/2026, 12:06:18 PM
SELECT
    p.product_id,
    ROUND(
        IFNULL(
            SUM(u.units * p.price) / SUM(u.units),
            0
        ),
        2
    ) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;