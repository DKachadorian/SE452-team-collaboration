
-- Full Customer Creation Example
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
    VALUES(999, '2320 North Kenmore Ave. 1 East Jackson Blvd', 'Illinois', '60604');

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

INSERT INTO Payment(PaymentId, CardType, CardNumber, ExpirationDate, CVV, Currency, CardHolderName, CustomerId)
    VALUES(5, 'AMEX', 11111111, '2023-09-22', 545, 'US', 'John Simon', 100);
    INSERT INTO Payment(AccountId, CardType, CardNumber, ExpirationDate, CVV, Currency, CardHolderName, CustomerId)
        VALUES(6, 'VISA', 11112111, '2024-09-22', 525, 'US', 'Alice Buttress', 101);

INSERT INTO Employee(EmployeeId, FirstName, LastName, JobTitle, Username, Password, DealershipId)
    VALUES(100, 'Employee', 'Account', 'Admin', 'emp', 123, 999);

INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
    VALUES(20, 'TGR231', 'Dodge', 'Challenger', 'LUXURY', 40000, 'Y', 'Y', 'Y', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
    VALUES(21, 'TGR231', 'Dodge', 'Challenger', 'ECONOMY', 50000, 'Y', 'Y', 'Y', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
    VALUES(22, '4343434', 'Toyota', 'Challenger', 'LUXURY', 40000, 'Y', 'Y', 'Y', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
    VALUES(23, 'n84rt24', 'Ford', 'F150', 'ECONOMYPlus', 50000, 'Y', 'Y', 'Y', 999);

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
