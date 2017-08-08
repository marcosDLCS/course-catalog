-- Data initialization

-- Teachers

INSERT INTO TEACHER (name, surname)
VALUES ('Marcos', 'de la Calle Samaniego');
INSERT INTO TEACHER (name, surname)
VALUES ('Ricardo', 'Rodriguez Vaca');
INSERT INTO TEACHER (name, surname)
VALUES ('Andrea ', 'Zucchini Garcia');

-- Courses

INSERT INTO COURSE (name, teacher, hours, level, active)
VALUES ('A - Mi primer curso', 1, 5, 'Basico', true);
INSERT INTO COURSE (name, teacher, hours, level, active)
VALUES ('B - Mi segundo curso', 1, 10, 'Intermedio', true);
INSERT INTO COURSE (name, teacher, hours, level, active)
VALUES ('C - Mi tercer curso', 2, 15, 'Avanzado', true);
INSERT INTO COURSE (name, teacher, hours, level, active)
VALUES ('D - Mi cuarto curso', 2, 20, 'Basico', true);
INSERT INTO COURSE (name, teacher, hours, level, active)
VALUES ('E - Mi quinto curso', 3, 25, 'Intermedio', false);