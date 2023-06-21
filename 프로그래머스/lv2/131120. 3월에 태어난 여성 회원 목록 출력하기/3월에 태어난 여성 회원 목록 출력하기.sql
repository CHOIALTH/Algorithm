-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT("YY"-"MM"-"DD",DATE_OF_BIRTH) AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TLNO IS NOT NULL AND MONTH(DATE_OF_BIRTH) = 3 AND GENDER = 'W'
ORDER BY MEMBER_ID;