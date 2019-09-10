-- MySQL
SELECT DATE_FORMAT(datetime, '%H') hour, COUNT(1) count
FROM animal_outs
WHERE 
    DATE_FORMAT(datetime, '%H') 
    BETWEEN STR_TO_DATE('08:00:00', '%T') 
        AND STR_TO_DATE('19:00:00', '%T')
GROUP BY hour
ORDER BY hour
;
