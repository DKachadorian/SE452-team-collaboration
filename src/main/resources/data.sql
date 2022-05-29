-- Full Customer Creation Example
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(999, '1 East Jackson Blvd', 'IL', '60604');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(998, '2320 North Ken St.', 'IL', '60608');

INSERT INTO Customer(CustomerId, FirstName, LastName, DateOfBirth,
                     Address, PhoneNumber, DriversLicenseId, InsuranceCarrier,
                     Username, Password, ZipCode, State, Email)
VALUES (100, 'John', 'Simon', '1999-03-06',
        'Address', '222-222-2222', 99999999, 'State Farm',
        'JSimon', 'JSimon111!', '60234', 'IL', 'JSimon@gmail.com');
INSERT INTO Customer(CustomerId, FirstName, LastName, DateOfBirth,
                     Address, PhoneNumber, DriversLicenseId, InsuranceCarrier,
                     Username, Password, ZipCode, State, Email)
VALUES (101, 'James', 'Buttress', '1999-03-22',
        'Address', '222-212-2112', 99999999, 'Allstate',
        'JJ', '222', '85048', 'AZ', 'FlyingButtress@gmail.com');

INSERT INTO Payment(AccountId, CardType, CardNumber, ExpirationDate, CVV, Currency, CardHolderName, CustomerId)
VALUES(5, 'AMEX', 11111111, '2023-09-22', 545, 'US', 'John Simon', 100);
INSERT INTO Payment(AccountId, CardType, CardNumber, ExpirationDate, CVV, Currency, CardHolderName, CustomerId)
VALUES(6, 'VISA', 11112111, '2024-09-22', 525, 'US', 'Alice Buttress', 101);

INSERT INTO Employee(EmployeeId, FirstName, LastName, JobTitle, Username, Password, DealershipId)
VALUES(100, 'Employee', 'Account', 'Admin', 'emp', 123, 999);

INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(20, 'TGR231', 'Honda', 'Challenger', 'LUXURY', 485, 'N', 'N', 'N', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(21, 'TGR231', 'Honda', 'Challenger', 'ECONOMY', 95, 'N', 'Y', 'Y', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(22, '4343434', 'Toyota', 'Challenger', 'LUXURY', 485, 'Y', 'N', 'N', 998);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(23, 'n84rt24', 'Ford', 'F150', 'ECONOMY', 95, 'Y', 'Y', 'N', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(24, 'TGR231', 'Toyota', 'Ram', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 998);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(25, 'TGR231', 'Honda', 'Plum', 'ECONOMY', 95, 'N', 'Y', 'Y', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(26, '4343434', 'Acura', 'FX35', 'LUXURY', 485, 'Y', 'N', 'Y', 998);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(27, 'n84rt24', 'Subaru', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 999);

INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(11, '2021-04-22', 3, true, '2021-05-01', '2021-05-04', 100, 20);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(12, '2021-04-22', 3, true, '2021-06-01', '2021-06-04', 100, 21);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(13, '2022-04-22', 3, true, '2022-05-01', '2022-05-04', 101, 22);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(14, '2022-04-22', 3, true, '2022-06-01', '2022-06-04', 101, 23);

INSERT INTO CarReturn(ReturnId, DealershipId, CustomerId, EmployeeId, LateReturn,
                      FullTank, ReturnMileage, InteriorDamage, InteriorNotes, InteriorFee, ExteriorDamage, ExteriorNotes, ExteriorFee, TotalFee)
VALUES(1, 999, 100, 100, 'N', 'Y', 50000, 'F', 'NA', 0, 'F', 'NA', 0, 0);