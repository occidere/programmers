-- MySQL
SELECT a.animal_id, a.name
FROM animal_ins a JOIN animal_outs b ON a.animal_id = b.animal_id
ORDER BY b.datetime - a.datetime DESC
LIMIT 2
;
