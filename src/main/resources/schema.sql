DROP TABLE IF EXISTS Dealership, Customer, Payment, Employee, Car, Reservation, CarReturn CASCADE;


CREATE TABLE Dealership (
    DealershipId BIGINT AUTO_INCREMENT NOT NULL,
    Address VARCHAR(200),
    City VARCHAR(50),
    State VARCHAR(30),    
    ZipCode VARCHAR(100),
    PRIMARY KEY(DealershipId)
);

CREATE TABLE Customer (
    CustomerId BIGINT AUTO_INCREMENT NOT NULL,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Address VARCHAR(100),
    PhoneNumber VARCHAR(20),
    DriversLicenseId VARCHAR(20),
    InsuranceCarrier VARCHAR(50),
    Username VARCHAR(30),
    Password VARCHAR(50),
    ZipCode VARCHAR(5),
    State VARCHAR(30),
    Email VARCHAR(50),
    PRIMARY KEY(CustomerId)
);

CREATE TABLE Payment (
    PaymentId BIGINT AUTO_INCREMENT NOT NULL,
    CardType VARCHAR(200),
    CardNumber BIGINT,
    ExpirationDate DATE,
    CVV VARCHAR(10),
    Currency VARCHAR(20),
    CardHolderName VARCHAR(100),
    CustomerId BIGINT,
    PRIMARY KEY(PaymentId),
    FOREIGN KEY(CustomerId) REFERENCES Customer(CustomerId) ON DELETE CASCADE
);

CREATE TABLE Employee (
    EmployeeId BIGINT AUTO_INCREMENT NOT NULL,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    JobTitle VARCHAR(100),
    Username VARCHAR(30),
    Password VARCHAR(50),
    DealershipId BIGINT,
    PRIMARY KEY(EmployeeId),
    FOREIGN KEY(DealershipId) REFERENCES Dealership(DealershipId) ON DELETE CASCADE
);

CREATE TABLE Car (
     CarId BIGINT AUTO_INCREMENT NOT NULL,
     CarVinId VARCHAR(50),
     CarManufacturer VARCHAR(50),
     CarModel VARCHAR(50),
     CarClass VARCHAR(50),
     CarPrice DOUBLE,
     CarBabySeat BOOLEAN,
     CarSunroof BOOLEAN,
     CarAvailable BOOLEAN,
     DealershipId BIGINT,
     PRIMARY KEY(CarId),
     FOREIGN KEY(DealershipId) REFERENCES Dealership(DealershipId) ON DELETE CASCADE
);

CREATE TABLE Reservation (
     ReservationId BIGINT AUTO_INCREMENT NOT NULL,
     ReservationDate DATE,
     ReturnToOrigin BOOLEAN,
     StartDate DATE,
     EndDate DATE,
     DaysReserved BIGINT,
     CustomerId BIGINT,
     CarId BIGINT,
     PRIMARY KEY(ReservationId),
     FOREIGN KEY(CustomerId) REFERENCES Customer(CustomerId) ON DELETE CASCADE,
     FOREIGN KEY(CarId) REFERENCES Car(CarId) ON DELETE CASCADE
);

CREATE TABLE CarReturn (
    ReturnId BIGINT AUTO_INCREMENT NOT NULL,
    DealershipId BIGINT,
    CustomerId BIGINT,
    EmployeeId BIGINT,
    LateReturn BOOLEAN,
    FullTank BOOLEAN,
    ReturnMileage BIGINT,
    InteriorDamage BOOLEAN,
    InteriorNotes VARCHAR(1000),
    InteriorFee DOUBLE,
    ExteriorDamage BOOLEAN,
    ExteriorNotes VARCHAR(1000),
    ExteriorFee DOUBLE,
    TotalFee DOUBLE,
    PRIMARY KEY(ReturnId),
    FOREIGN KEY(DealershipId) REFERENCES Dealership(DealershipId) ON DELETE CASCADE,
    FOREIGN KEY(CustomerId) REFERENCES Customer(CustomerId) ON DELETE CASCADE,
    FOREIGN KEY(EmployeeId) REFERENCES Employee(EmployeeId) ON DELETE CASCADE
);


