-- MySQL
SELECT animal_type, COUNT(1) count
FROM animal_ins
GROUP BY animal_type
ORDER BY animal_type
;
