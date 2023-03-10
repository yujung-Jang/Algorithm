SELECT B.FLAVOR
FROM FIRST_HALF AS A, ICECREAM_INFO AS B
WHERE A.FLAVOR = B.FLAVOR AND A.TOTAL_ORDER > 3000 AND B.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC