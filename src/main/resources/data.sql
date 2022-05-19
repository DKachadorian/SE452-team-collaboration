
-- Full Customer Creation Example
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
    VALUES(999, '2320 North Kenmore Ave. 1 East Jackson Blvd', 'Illinois', '60604');

INSERT INTO Customer(CustomerId, FirstName, LastName, DateOfBirth,
                     Address, PhoneNumber, DriversLicenseId, InsuranceCarrier,
                     Username, Password, ZipCode, State, Email)
    VALUES (100, 'John', 'Simon', '1999-03-06',
            'Address', '222-222-2222', 99999999, 'State Farm',
            'JSimon', 'JSimon111!', '60234', 'IL', 'JSimon@gmail.com');

INSERT INTO Payment(AccountId, CardType, CardNumber, ExpirationDate, CVV, Currency, CardHolderName, CustomerId)
    VALUES(5, 'AMEX', 11111111, '2023-09-22', 545, 'US', 'John Simon', 100);

INSERT INTO Employee(EmployeeId, FirstName, LastName, JobTitle, Username, Password, DealershipId)
    VALUES(100, 'Employee', 'Account', 'Admin', 'emp', 123, 999);

INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
    VALUES(20, 'TGR231', 'Dodge', 'Challenger', 'SPORTS_CAR', 40000, 'Y', 'Y', 'Y', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
    VALUES(21, 'TGR231', 'Dodge', 'Challenger', 'SPORTS_CAR', 50000, 'Y', 'Y', 'Y', 999);

INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
    VALUES(1, '2021-04-22', 3, true, '2021-05-01', '2021-05-04', 100, 20);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
    VALUES(2, '2021-04-22', 3, true, '2021-05-01', '2021-05-04', 100, 21);

INSERT INTO CarReturn(ReturnId, DealershipId, CustomerId, EmployeeId, LateReturn,
                   FullTank, ReturnMileage, InteriorDamage, InteriorNotes, InteriorFee, ExteriorDamage, ExteriorNotes, ExteriorFee, TotalFee)
   VALUES(1, 999, 100, 100, 'N', 'Y', 50000, 'F', 'NA', 0, 'F', 'NA', 0, 0);
