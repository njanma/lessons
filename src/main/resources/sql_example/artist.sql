CREATE SCHEMA artist_storage;

DROP TABLE artist_storage.artist;

CREATE TABLE artist_storage.artist
(
  id   SERIAL PRIMARY KEY,
  name CHARACTER VARYING(128) UNIQUE NOT NULL,
  age  INTEGER
);

INSERT INTO artist_storage.artist (name, age)
VALUES ('Temp', 41),
       ('Kate', NULL),
       ('Ivan', 30),
       ('Petr', 12),
       ('Sveta', 28),
       ('Alex', 41);

SET SEARCH_PATH = artist_storage;

SELECT name AS n,
       age  AS ag
FROM artist art
WHERE age IN (12, 15, 20, 50, 30)
ORDER BY age;

SELECT name AS n,
       age  AS ag
FROM artist art
WHERE UPPER(name) LIKE UPPER('%I%')
ORDER BY age;

SELECT min(age),
       max(age),
       avg(age) as AVERAGE
FROM artist;

SELECT name,
       age
FROM artist
WHERE age > 18
ORDER BY age DESC
LIMIT 2
  OFFSET 2;

(SELECT name,
        age
 FROM artist
 ORDER BY age
 LIMIT 1)
UNION ALL
(SELECT name,
        age
 FROM artist
 ORDER BY age DESC
 LIMIT 1);

DELETE
FROM artist
WHERE age IS NULL RETURNING *;

UPDATE artist
SET age = 31
WHERE name = 'Ivan';

SELECT *
FROM artist;

SELECT max(age)
FROM artist;

SELECT id,
       name,
       age
FROM (SELECT id, name, age
      FROM artist) t
WHERE age = 41;