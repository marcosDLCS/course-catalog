-- Data initialization

-- Teachers

INSERT INTO TEACHER (id, name, surname)
VALUES (1, 'Marcos', 'de la Calle Samaniego');
INSERT INTO TEACHER (id, name, surname)
VALUES (2, 'Ricardo', 'Rodriguez Vaca');
INSERT INTO TEACHER (id, name, surname)
VALUES (3, 'Andrea ', 'Zucchini Garcia');

-- Courses

INSERT INTO COURSE (id, name, teacher, hours, level, active)
VALUES (1, 'A - Mi primer curso', 1, 5, 'Intermediate', 1);
INSERT INTO COURSE (id, name, teacher, hours, level, active)
VALUES (2, 'B - Mi segundo curso', 1, 10, 'Intermediate', 1);
INSERT INTO COURSE (id, name, teacher, hours, level, active)
VALUES (3, 'C - Mi tercer curso', 2, 15, 'Intermediate', 1);
INSERT INTO COURSE (id, name, teacher, hours, level, active)
VALUES (4, 'D - Mi cuarto curso', 2, 20, 'Intermediate', 1);
INSERT INTO COURSE (id, name, teacher, hours, level, active)
VALUES (5, 'E - Mi quinto curso', 3, 25, 'Intermediate', 0);