CREATE TABLE app_user (
  id SERIAL NOT NULL PRIMARY KEY,
  email TEXT NOT NULL
);

INSERT INTO app_user(id, email) values (1, 'john@doe.com');