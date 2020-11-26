INSERT INTO bike_category (name) VALUES ('Mountain Bike');
INSERT INTO bike_category (name) VALUES ('Track Racer');
INSERT INTO bike_category (name) VALUES ('Road Racer');
INSERT INTO bike_category (name) VALUES ('City Bike');

INSERT INTO brand(name) VALUES ('Cannondale');
INSERT INTO brand(name) VALUES ('Canyon');
INSERT INTO brand(name) VALUES ('Centurion');

INSERT INTO bike(model_name, frame_size, wheel_size, brand_id)
    VALUES('Supersix', 62, 45, 1);

INSERT INTO bike(model_name, frame_size, wheel_size, brand_id)
    VALUES('Exceed CF', 70, 50, 2);

INSERT INTO bike(model_name, frame_size, wheel_size, brand_id)
    VALUES('Challenger', 55, 40, 3);