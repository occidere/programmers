-- MySQL
SELECT COUNT(DISTINCT name) count
FROM animal_ins
WHERE name IS NOT NULL
;
