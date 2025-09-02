-- ERD schema for RestMan – full

CREATE TABLE users (
  id BIGSERIAL PRIMARY KEY,
  username VARCHAR(60) UNIQUE NOT NULL,
  password_hash VARCHAR(200) NOT NULL,
  full_name VARCHAR(200),
  email VARCHAR(120),
  phone VARCHAR(30),
  role VARCHAR(30) NOT NULL
);

CREATE TABLE staff (
  id BIGINT PRIMARY KEY REFERENCES users(id) ON DELETE CASCADE,
  code VARCHAR(30) UNIQUE,
  position VARCHAR(60),
  joined_at DATE
);

CREATE TABLE customers (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(200) NOT NULL,
  phone VARCHAR(30),
  email VARCHAR(120),
  dob DATE,
  gender VARCHAR(10)
);

CREATE TABLE suppliers (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(200) NOT NULL,
  address VARCHAR(300),
  phone VARCHAR(30),
  email VARCHAR(120),
  contact_person VARCHAR(120),
  note TEXT
);

CREATE TABLE ingredients (
  id BIGSERIAL PRIMARY KEY,
  code VARCHAR(30) UNIQUE,
  name VARCHAR(200) NOT NULL,
  unit VARCHAR(20) NOT NULL,
  cost_price NUMERIC(12,2) DEFAULT 0,
  stock_qty NUMERIC(12,3) DEFAULT 0,
  status VARCHAR(20) DEFAULT 'ACTIVE'
);

CREATE TABLE dishes (
  id BIGSERIAL PRIMARY KEY,
  code VARCHAR(30) UNIQUE,
  name VARCHAR(200) NOT NULL,
  description TEXT,
  price NUMERIC(12,2) NOT NULL,
  is_active BOOLEAN DEFAULT TRUE,
  image_url TEXT
);

CREATE TABLE dish_ingredients (
  dish_id BIGINT NOT NULL REFERENCES dishes(id) ON DELETE CASCADE,
  ingredient_id BIGINT NOT NULL REFERENCES ingredients(id),
  quantity_required NUMERIC(12,3) NOT NULL,
  PRIMARY KEY (dish_id, ingredient_id)
);

CREATE TABLE combos (
  id BIGSERIAL PRIMARY KEY,
  code VARCHAR(30) UNIQUE,
  name VARCHAR(200) NOT NULL,
  price NUMERIC(12,2) NOT NULL,
  description TEXT
);

CREATE TABLE combo_items (
  combo_id BIGINT NOT NULL REFERENCES combos(id) ON DELETE CASCADE,
  dish_id BIGINT NOT NULL REFERENCES dishes(id),
  quantity INT NOT NULL DEFAULT 1,
  PRIMARY KEY (combo_id, dish_id)
);

CREATE TABLE tables (
  id BIGSERIAL PRIMARY KEY,
  code VARCHAR(30) UNIQUE NOT NULL,
  name VARCHAR(100),
  capacity INT,
  status VARCHAR(20) DEFAULT 'FREE'
);

CREATE TABLE reservations (
  id BIGSERIAL PRIMARY KEY,
  customer_id BIGINT NOT NULL REFERENCES customers(id),
  table_id BIGINT NOT NULL REFERENCES tables(id),
  reserved_at TIMESTAMP NOT NULL,
  people INT NOT NULL,
  note TEXT,
  status VARCHAR(20) NOT NULL
);

CREATE TABLE orders (
  id BIGSERIAL PRIMARY KEY,
  table_id BIGINT NOT NULL REFERENCES tables(id),
  customer_id BIGINT REFERENCES customers(id),
  sales_staff_id BIGINT REFERENCES staff(id),
  created_at TIMESTAMP NOT NULL DEFAULT NOW(),
  status VARCHAR(20) NOT NULL
);

CREATE INDEX idx_orders_table_status ON orders(table_id, status);

CREATE TABLE order_items (
  id BIGSERIAL PRIMARY KEY,
  order_id BIGINT NOT NULL REFERENCES orders(id) ON DELETE CASCADE,
  dish_id BIGINT REFERENCES dishes(id),
  combo_id BIGINT REFERENCES combos(id),
  quantity INT NOT NULL,
  unit_price NUMERIC(12,2) NOT NULL,
  amount NUMERIC(12,2) NOT NULL
);

CREATE TABLE payments (
  id BIGSERIAL PRIMARY KEY,
  order_id BIGINT NOT NULL REFERENCES orders(id) ON DELETE CASCADE,
  method VARCHAR(20) NOT NULL,
  paid_amount NUMERIC(12,2) NOT NULL,
  paid_at TIMESTAMP NOT NULL DEFAULT NOW(),
  status VARCHAR(20) NOT NULL
);

CREATE TABLE invoices (
  id BIGSERIAL PRIMARY KEY,
  order_id BIGINT NOT NULL UNIQUE REFERENCES orders(id) ON DELETE CASCADE,
  number VARCHAR(50) UNIQUE NOT NULL,
  total_amount NUMERIC(12,2) NOT NULL,
  tax_amount NUMERIC(12,2) DEFAULT 0,
  discount_amount NUMERIC(12,2) DEFAULT 0,
  grand_total NUMERIC(12,2) NOT NULL,
  issued_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE inventory_receipts (
  id BIGSERIAL PRIMARY KEY,
  supplier_id BIGINT NOT NULL REFERENCES suppliers(id),
  warehouse_staff_id BIGINT REFERENCES staff(id),
  received_at TIMESTAMP NOT NULL,
  note TEXT
);

CREATE TABLE inventory_receipt_items (
  id BIGSERIAL PRIMARY KEY,
  receipt_id BIGINT NOT NULL REFERENCES inventory_receipts(id) ON DELETE CASCADE,
  ingredient_id BIGINT NOT NULL REFERENCES ingredients(id),
  quantity NUMERIC(12,3) NOT NULL,
  unit_cost NUMERIC(12,2) NOT NULL,
  amount NUMERIC(12,2) NOT NULL
);
