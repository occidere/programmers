-- MySQL
SELECT animal_id, name, DATE_FORMAT(datetime, '%Y-%m-%d') '날짜'
FROM animal_ins
ORDER BY animal_id
;
