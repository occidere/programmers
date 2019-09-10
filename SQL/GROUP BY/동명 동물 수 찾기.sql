-- MySQL
SELECT name, COUNT(1) count
FROM animal_ins
WHERE name IS NOT NULL
GROUP BY name
HAVING COUNT(1) > 1
ORDER BY name
;
