DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  active boolean DEFAULT TRUE,
  password VARCHAR(250) NOT NULL,
  roles VARCHAR(250) NOT NULL,
  username VARCHAR(250) NOT NULL
);
 
INSERT INTO user (id, active, password, roles, username) VALUES
  (1, true, '123','USER','Ahmed')