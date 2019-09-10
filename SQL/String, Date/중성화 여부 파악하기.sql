-- MySQL
SELECT
    animal_id,
    name,
    CASE
        WHEN sex_upon_intake LIKE '%Intact%' THEN 'X'
        ELSE 'O'
    END AS '중성화'
FROM animal_ins
ORDER BY animal_id
;
