CREATE TABLE IF NOT EXISTS categories (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  type VARCHAR(20),
  PRIMARY KEY (id)
);

INSERT INTO categories (name, type) VALUES ('Salario', 'earning');
INSERT INTO categories (name, type) VALUES ('Intereses', 'earning');
INSERT INTO categories (name, type) VALUES ('Regalos', 'earning');
INSERT INTO categories (name, type) VALUES ('Alimentación', 'expense');
INSERT INTO categories (name, type) VALUES ('Salud', 'expense');
INSERT INTO categories (name, type) VALUES ('Entretenimiento', 'expense');
INSERT INTO categories (name, type) VALUES ('Deudas', 'expense');
INSERT INTO categories (name, type) VALUES ('Servicios', 'expense');
INSERT INTO categories (name, type) VALUES ('Transporte', 'expense');
INSERT INTO categories (name, type) VALUES ('Educación', 'expense');

CREATE TABLE IF NOT EXISTS accounts (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  type VARCHAR(20) NOT NULL,
  initial_balance FLOAT DEFAULT 0,
  PRIMARY KEY (id)
);

INSERT INTO accounts (name, type, initial_balance) VALUES ('Efectivo', 'efectivo', 200000);
INSERT INTO accounts (name, type, initial_balance) VALUES ('Bancolombia', 'ahorros', 1500000);

CREATE TABLE IF NOT EXISTS earnings (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  amount FLOAT NOT NULL,
  date VARCHAR(20) NOT NULL,
  category_id INT NOT NULL,
  account_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (category_id) REFERENCES categories(id),
  FOREIGN KEY (account_id) REFERENCES accounts(id)
);