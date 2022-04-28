DROP TABLE IF EXISTS Car, Customer, Reservation CASCADE;

CREATE TABLE Car (
     CarId INT AUTO_INCREMENT,
     CarMake VARCHAR(50),
     CarModel VARCHAR(50),
     CarClass VARCHAR(50),
     CarPrice FLOAT,
     CarVinId VARCHAR(50),
     CarSeat BOOLEAN,
     CarSunroof BOOLEAN,
     PRIMARY KEY(CarId)
);

CREATE TABLE Customer (
    CustomerId INT AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Address VARCHAR(100),
    PhoneNumber VARCHAR(20),
    PRIMARY KEY(CustomerId)
);

CREATE TABLE Reservation (
     ReservationId INT AUTO_INCREMENT NOT NULL,
     ReservationDate DATE,
     ReturnToOrigin BOOLEAN,
     StartDate DATE,
     EndDate DATE,
     DaysReserved INT,
     CustomerId INT,
     PRIMARY KEY(ReservationId),
     FOREIGN KEY(CustomerId) REFERENCES Customer(CustomerId)
);


