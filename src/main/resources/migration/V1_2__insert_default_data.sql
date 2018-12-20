INSERT INTO student_group(title, in_progress)
VALUES ('IKKK-91', TRUE);

INSERT INTO student(name, surname, age, student_group)
VALUES ('Vasya', 'Pupkin', 35, (SELECT sg.id FROM student_group sg WHERE sg.title LIKE 'IKKK-91'));

INSERT INTO student(name, surname, age, student_group)
VALUES ('Ivan', 'Ivanov', 28, (SELECT sg.id FROM student_group sg WHERE sg.title LIKE 'IKKK-91'));