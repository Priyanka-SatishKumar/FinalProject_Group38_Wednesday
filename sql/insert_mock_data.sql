use pharmacy_mgmt;

insert into master_drug_table(drug_name) values('Crocin');
insert into master_drug_table(drug_name) values('Paracetamol');
insert into master_drug_table(drug_name) values('Cetrizon');

insert into company(company_name, company_type, registered_date) values("Abbot Laboratories", "MANUFACTURER", "1980-02-13");
insert into company(company_name, company_type, registered_date) values("Johnson and Johnson", "MANUFACTURER", "1985-04-13");
insert into company(company_name, company_type, registered_date) values("Cardinal Health", "DISTRIBUTOR", "1990-05-23");
insert into company(company_name, company_type, registered_date) values("King World Medicines Group", "DISTRIBUTOR", "2000-12-25");
insert into company(company_name, company_type, registered_date) values("CVS Pharmacy", "PHARMACY", "1982-06-04");
insert into company(company_name, company_type, registered_date) values("MedPlus", "PHARMACY", "1970-02-16");
insert into company(company_name, company_type, registered_date) values("Boston Transports", "TRANSPORTER", "1982-06-04");

insert into person(username, person_name, password, person_role, company_id) values("man1", "Alankrutha Reddy", "password", "MANUFACTURE_ADMIN", 1);
insert into person(username, person_name, password, person_role, company_id) values("man2", "Varadmurty Mohod", "password", "MANUFACTURE_ADMIN", 2);
insert into person(username, person_name, password, person_role, company_id) values("dist1", "Alankrutha Reddy", "password", "DISTRIBUTOR_ADMIN", 3);
insert into person(username, person_name, password, person_role, company_id) values("dist2", "Varadmurty Mohod", "password", "DISTRIBUTOR_ADMIN", 4);
insert into person(username, person_name, password, person_role, company_id) values("pharm1", "Sudarshan Kudli", "password", "PHARMACY_ADMIN", 5);
insert into person(username, person_name, password, person_role, company_id) values("pharm2", "Sudarshan Kudli", "password", "PHARMACY_ADMIN", 6);
insert into person(username, person_name, password, person_role, company_id) values("phstore1", "Shreya Jaiswal", "password", "PHARMACY_STORE_MANAGER", 5);
insert into person(username, person_name, password, person_role, company_id) values("trans1", "Suraksha Nadig", "password", "TRANSPORT_ADMIN", 7);

insert into manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) values(1, 1, 100, 3, 4);
insert into manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) values(1, 2, 120, 4, 4.5);
insert into manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) values(2, 2, 150, 10, 12.5);
insert into manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) values(2, 3, 200, 14, 15);

insert into pharmacy_order(pharmacy_id, manufacturer_id, order_date, order_status) values(5, 1, "2021-02-16", "PENDING");
insert into pharmacy_order(pharmacy_id, manufacturer_id, order_date, order_status) values(6, 2, "2021-04-16", "PENDING");

insert into pharmacy_order_item(order_id, item_id, quantity, cost_price) values(1, 1, 5, 4);
insert into pharmacy_order_item(order_id, item_id, quantity, cost_price) values(1, 2, 2, 4.5);
insert into pharmacy_order_item(order_id, item_id, quantity, cost_price) values(2, 2, 8, 4.5);
insert into pharmacy_order_item(order_id, item_id, quantity, cost_price) values(2, 3, 3, 15);

insert into pharmacy_inventory(pharmacy_id, drug_id, quantity, cost_price, selling_price) values(5, 1, 5, 4, 6);
insert into pharmacy_inventory(pharmacy_id, drug_id, quantity, cost_price, selling_price) values(5, 2, 10, 4.5, 7);

INSERT INTO pharmacy_store(pharmacy_id, store_name, store_address, store_zip, store_city)
VALUES(5, "CVS 1", "25 Fenway Street", "02118", "Boston");
INSERT INTO pharmacy_store(pharmacy_id, store_name, store_address, store_zip, store_city)
VALUES(5, "CVS 2", "115 Boyleston Street", "02125", "Boston");
INSERT INTO pharmacy_store(pharmacy_id, store_name, store_address, store_zip, store_city)
VALUES(5, "MedPlus 1", "1628 5th Avenue", "02310", "Seattle");


-- Add more drugs to the master_drug_table
INSERT INTO master_drug_table(drug_name) VALUES('Aspirin');
INSERT INTO master_drug_table(drug_name) VALUES('Ibuprofen');
INSERT INTO master_drug_table(drug_name) VALUES('Cetirizine');

-- Add more companies to the company table
INSERT INTO company(company_name, company_type, registered_date) VALUES("Pfizer Inc", "MANUFACTURER", "1989-05-19");
INSERT INTO company(company_name, company_type, registered_date) VALUES("Roche", "MANUFACTURER", "1995-08-15");
INSERT INTO company(company_name, company_type, registered_date) VALUES("AmerisourceBergen", "DISTRIBUTOR", "2005-03-10");
INSERT INTO company(company_name, company_type, registered_date) VALUES("Walgreens", "PHARMACY", "1999-11-11");

-- Add more users to the person table
INSERT INTO person(username, person_name, password, person_role, company_id) VALUES("man3", "Ritika Sharma", "password", "MANUFACTURE_ADMIN", 8);
INSERT INTO person(username, person_name, password, person_role, company_id) VALUES("dist3", "Ankit Patel", "password", "DISTRIBUTOR_ADMIN", 9);
INSERT INTO person(username, person_name, password, person_role, company_id) VALUES("pharm3", "Anjali Nair", "password", "PHARMACY_ADMIN", 10);
INSERT INTO person(username, person_name, password, person_role, company_id) VALUES("phstore2", "Tina Verma", "password", "PHARMACY_STORE_MANAGER", 10);

-- Add manufacturer inventory data
INSERT INTO manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) VALUES(3, 4, 300, 2, 3);
INSERT INTO manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) VALUES(3, 5, 400, 5, 7);
INSERT INTO manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) VALUES(4, 6, 250, 8, 10);
INSERT INTO manufacturer_inventory(manufacturer_id, drug_id, quantity, cost_price, selling_price) VALUES(4, 7, 200, 12, 15);

-- Add pharmacy orders
INSERT INTO pharmacy_order(pharmacy_id, manufacturer_id, order_date, order_status) VALUES(10, 3, "2023-01-16", "COMPLETED");
INSERT INTO pharmacy_order(pharmacy_id, manufacturer_id, order_date, order_status) VALUES(10, 4, "2023-02-16", "PENDING");

-- Add pharmacy order items
INSERT INTO pharmacy_order_item(order_id, item_id, quantity, cost_price) VALUES(3, 4, 10, 3);
INSERT INTO pharmacy_order_item(order_id, item_id, quantity, cost_price) VALUES(3, 5, 15, 7);
INSERT INTO pharmacy_order_item(order_id, item_id, quantity, cost_price) VALUES(4, 6, 20, 10);
INSERT INTO pharmacy_order_item(order_id, item_id, quantity, cost_price) VALUES(4, 7, 12, 15);

-- Add pharmacy inventory
INSERT INTO pharmacy_inventory(pharmacy_id, drug_id, quantity, cost_price, selling_price) VALUES(10, 4, 10, 3, 5);
INSERT INTO pharmacy_inventory(pharmacy_id, drug_id, quantity, cost_price, selling_price) VALUES(10, 5, 15, 7, 10);
INSERT INTO pharmacy_inventory(pharmacy_id, drug_id, quantity, cost_price, selling_price) VALUES(10, 6, 20, 10, 12);
INSERT INTO pharmacy_inventory(pharmacy_id, drug_id, quantity, cost_price, selling_price) VALUES(10, 7, 12, 15, 18);

-- Add more pharmacy stores
INSERT INTO pharmacy_store(pharmacy_id, store_name, store_address, store_zip, store_city)
VALUES(10, "Walgreens 1", "525 Madison Avenue", "10022", "New York");
INSERT INTO pharmacy_store(pharmacy_id, store_name, store_address, store_zip, store_city)
VALUES(10, "Walgreens 2", "401 Market Street", "19106", "Philadelphia");
INSERT INTO pharmacy_store(pharmacy_id, store_name, store_address, store_zip, store_city)
VALUES(10, "Walgreens 3", "850 3rd Avenue", "10110", "New York");