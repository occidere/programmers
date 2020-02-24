-- Oracle SQL
SELECT cart_id
FROM (
    SELECT DISTINCT cart_id, name
    FROM cart_products
    WHERE name IN ('우유', '요거트')
    GROUP BY cart_id, name
) a
GROUP BY cart_id
HAVING COUNT(1) > 1
ORDER BY cart_id
;
