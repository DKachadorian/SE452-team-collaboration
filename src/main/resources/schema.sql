DROP TABLE IF EXISTS TestTable, Cars, Reservations CASCADE;

CREATE TABLE TestTable (
    TestId BIGINT NOT NULL,
    FirstName VARCHAR(255)
);

CREATE TABLE Cars (
  carID INT AUTO_INCREMENT,    
    car_make CHARACTER (20),
    car_model CHARACTER(20),
    car_class ENUM('SEDAN','COUPE', 'SPORTS_CAR','STATION_WAGON','HATCHBACK','CONVERTIBLE','SUV','MINIVAN','PICKUP_TRUCK'),
    car_price FLOAT,
    car_vin_id VARCHAR(20),
    car_seat BOOLEAN,
    car_sunroof BOOLEAN,
    primary key(carID)   
);

CREATE TABLE Reservations (
  orderID INT AUTO_INCREMENT,    
    order_date DATE,
    return_to_origin BOOLEAN,
    reservation_start_date DATE,
    reservation_end_date DATE,
    num_days_reserved INT,
    primary key(orderID)   
);