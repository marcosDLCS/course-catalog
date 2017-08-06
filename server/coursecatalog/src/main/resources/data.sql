-- Data initialization

-- Teachers

INSERT into TEACHER (id, name, surname) VALUES (1, 'Marcos', 'de la Calle Samaniego');
INSERT into TEACHER (id, name, surname) VALUES (2, 'Ricardo', 'Rodríguez Vaca');
INSERT into TEACHER (id, name, surname) VALUES (3, 'Andrea ', 'Zucchini García');

-- Courses

INSERT INTO COURSE (id, name, teacher, hours, active) VALUES (1, 'A - Mi primer curso', 1, 5, 1);
INSERT INTO COURSE (id, name, teacher, hours, active) VALUES (2, 'B - Mi segundo curso', 1, 10, 1);
INSERT INTO COURSE (id, name, teacher, hours, active) VALUES (3, 'C - Mi tercer curso', 2, 15, 1);
INSERT INTO COURSE (id, name, teacher, hours, active) VALUES (4, 'D - Mi cuarto curso', 2, 20, 1);
INSERT INTO COURSE (id, name, teacher, hours, active) VALUES (5, 'E - Mi quinto curso', 3, 25, 0);