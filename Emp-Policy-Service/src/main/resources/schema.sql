DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  employee_id        VARCHAR(100) PRIMARY KEY NOT NULL,
  policy_id          VARCHAR NOT NULL,
  date_of_birth      VARCHAR NOT NULL,
  name      VARCHAR NOT NULL,
  sex       CHAR   NOT NULL,
  joining_date VARCHAR NOT NULL);