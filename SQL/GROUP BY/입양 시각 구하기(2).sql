-- MySQL
SELECT a.hour, COUNT(DATE_FORMAT(b.datetime, '%H')) count
FROM (
    SELECT @rn := @rn + 1 hour, 0 count
    FROM animal_outs, (SELECT @rn := -1) r
    WHERE @rn < 23
) a
LEFT JOIN animal_outs b
ON a.hour = DATE_FORMAT(b.datetime, '%H')
GROUP BY a.hour
ORDER BY a.hour
;
