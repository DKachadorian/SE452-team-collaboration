-- Full Customer Creation Example
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(999, '1 East Jackson Blvd', 'AL', '35242');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(998, '2320 North Ken St.', 'AZ', '85224');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1000, '1 East Jackson Blvd', 'AZ', '85048');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1001, '2320 North Ken St.', 'CA', '95002');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1002, '1 East Jackson Blvd', 'CA', '90241');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1003, '2320 North Ken St.', 'CO', '80210');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1004, '1 East Jackson Blvd', 'CT', '06088');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1005, '2320 North Ken St.', 'CT', '06084');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1006, '1 East Jackson Blvd', 'DE', '19702');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1007, '2320 North Ken St.', 'DC', '20001');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1008, '1 East Jackson Blvd', 'GA', '30307');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1009, '2320 North Ken St.', 'IL', '60608');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1010, '1 East Jackson Blvd', 'IL', '60604');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1011, '2320 North Ken St.', 'IN', '60608');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1012, '1 East Jackson Blvd', 'CA', '94203');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1013, '2320 North Ken St.', 'CA', '90245');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1014, '1 East Jackson Blvd', 'KY', '40475');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1015, '2320 North Ken St.', 'LA', '70769');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1016, '2320 North Ken St.', 'LA', '70726');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1017, '1 East Jackson Blvd', 'ME', '04103');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1018, '2320 North Ken St.', 'MD', '21218');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1019, '1 East Jackson Blvd', 'MA', '01003');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1021, '2320 North Ken St.', 'MI', '48823');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1022, '2320 North Ken St.', 'NV', '89106');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1023, '2320 North Ken St.', 'NY', '10001');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1024, '2320 North Ken St.', 'NC', '27604');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1025, '2320 North Ken St.', 'OR', '97539');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1026, '2320 North Ken St.', 'OR', '97520');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1027, '2320 North Ken St.', 'PA', '19397');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1028, '2320 North Ken St.', 'SC', '29412');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1029, '2320 North Ken St.', 'TX', '75088');
VALUES(1031, '2320 North Ken St.', 'UT', '84105');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1032, '2320 North Ken St.', 'VT', '05030');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1033, '2320 North Ken St.', 'VA', '22030');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1034, '2320 North Ken St.', 'WA', '98104');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1035, '2320 North Ken St.', 'WA', '98101');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1036, '2320 North Ken St.', 'TX', '75240');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1037, '2320 North Ken St.', 'TX', '75237');


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
VALUES(21, 'TGR231', 'Honda', 'Challenger', 'ECONOMY', 95, 'N', 'Y', 'N', 999);
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
VALUES(11, '2021-04-22', 3, true, '2022-05-11', '2021-06-06', 100, 20);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(12, '2021-04-22', 3, true, '2022-05-30', '2021-06-06', 100, 21);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(13, '2022-04-22', 3, true, '2022-06-01', '2022-06-07', 101, 22);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(14, '2022-04-22', 3, true, '2022-06-06', '2022-06-07', 101, 23);

INSERT INTO CarReturn(ReturnId, DealershipId, CustomerId, EmployeeId, LateReturn,
                      FullTank, ReturnMileage, InteriorDamage, InteriorNotes, InteriorFee, ExteriorDamage, ExteriorNotes, ExteriorFee, TotalFee)
VALUES(1, 999, 100, 100, 'N', 'Y', 50000, 'F', 'NA', 0, 'F', 'NA', 0, 0);