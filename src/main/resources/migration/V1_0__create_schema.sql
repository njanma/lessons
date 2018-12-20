CREATE TABLE student_group
(
  id    SERIAL PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  UNIQUE (title)
);

CREATE TABLE student
(
  id            SERIAL PRIMARY KEY,
  name          VARCHAR(255)             NOT NULL,
  surname       VARCHAR(255)             NOT NULL,
  age           INT                      NOT NULL,
  student_group INT                      NOT NULL,
  created_at    TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
  FOREIGN KEY (student_group) REFERENCES student_group (id),
  UNIQUE (name, surname)
);

CREATE INDEX student_name_idx ON student (name);