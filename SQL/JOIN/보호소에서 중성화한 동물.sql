-- MySQL
SELECT
    b.animal_id, 
    b.animal_type, 
    b.name
FROM (
    SELECT 
        animal_id, 
        animal_type,
        name
    FROM animal_ins
    WHERE sex_upon_intake IN ('Intact Male', 'Intact Female')
) a
JOIN animal_outs b
ON a.animal_id = b.animal_id
WHERE b.sex_upon_outcome NOT IN ('Intact Male', 'Intact Female')
ORDER BY b.animal_id
;
