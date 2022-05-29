-- Dealerships [999 - 138] 
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(999, '54 Wellington St.', 'AL', '35242');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(998, '72 Lower River Ave.', 'AZ', '85224');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1000, '49 Prairie St.', 'AZ', '85048');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1001, '9228 Buckingham St.', 'CA', '95002');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1002, '591 Purple Finch Lane', 'CA', '90241');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1003, '548 Glen Eagles St.', 'CO', '80210');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1004, '89 Summer Dr.', 'CT', '06088');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1005, '7345 E. Del Monte Dr.', 'CT', '06084');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1006, '623 Creekside St.', 'DE', '19702');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1007, '265 Cherry Hill Lane', 'DC', '20001');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1008, '4 Fairview Street', 'GA', '30307');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1009, '2320 North Ken St.', 'IL', '60608');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1010, '1 East Jackson Blvd', 'IL', '60604');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1011, '755 Bank Street', 'IN', '60608');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1012, '27 Harrison Ave.', 'CA', '94203');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1013, '16 Bow Ridge Ave.', 'CA', '90245');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1014, '196 Stillwater St.', 'KY', '40475');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1015, '8444 Green Hill Rd.', 'LA', '70769');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1016, '9817 Bridgeton Dr.', 'LA', '70726');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1017, '463 Essex Ave.', 'ME', '04103');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1018, '8478 Golden Star Ave.', 'MD', '21218');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1019, '84 Lafayette Drive', 'MA', '01003');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1021, '92 Manor Street', 'MI', '48823');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1022, '9319 Brickell Rd.', 'NV', '89106');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1023, '7236 Campfire Ave.', 'NY', '10001');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1024, '31 Illinois Lane.', 'NC', '27604');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1025, '9752 West Riverside Street', 'OR', '97539');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1026, '7286 Cleveland Street', 'OR', '97520');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1027, '7498 Summerhouse Dr.', 'PA', '19397');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1028, '811 Queen Lane', 'SC', '29412');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1029, '727 Shipley Rd.', 'TX', '75088');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1031, '3 Hill Street', 'UT', '84105');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1032, '7330 Manor Street', 'VT', '05030');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1033, '638 Pulaski St.', 'VA', '22030');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1034, '623 Homewood Ave.', 'WA', '98104');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1035, '848 West School Street', 'WA', '98101');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1036, '7 E. Tailwater St.', 'TX', '75240');
INSERT INTO Dealership(DealershipId, Address, State, ZipCode)
VALUES(1037, '9458 East 4th St.', 'TX', '75237');

--Pre-Made Customers
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
-- Premade Customer Payement Accounts
INSERT INTO Payment(AccountId, CardType, CardNumber, ExpirationDate, CVV, Currency, CardHolderName, CustomerId)
VALUES(5, 'AMEX', 11111111, '2023-09-22', 545, 'US', 'John Simon', 100);
INSERT INTO Payment(AccountId, CardType, CardNumber, ExpirationDate, CVV, Currency, CardHolderName, CustomerId)
VALUES(6, 'VISA', 11112111, '2024-09-22', 525, 'US', 'Alice Buttress', 101);
-- PREMADE EMPLOYEE ACCOUNT
INSERT INTO Employee(EmployeeId, FirstName, LastName, JobTitle, Username, Password, DealershipId)
VALUES(100, 'Employee', 'Account', 'Admin', 'emp', 123, 999);
-- Cars [RESERVED]
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(20, 'K5ZOJOPO7E', 'Honda', 'Civic', 'LUXURY', 485, 'N', 'N', 'N', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(21, 'C59QSKN55R', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'Y', 'N', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(22, 'V7SKBUCUZT', 'Toyota', 'Camry', 'LUXURY', 485, 'Y', 'N', 'N', 998);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(23, 'IREHLJMNIO', 'Ford', 'F150', 'ECONOMY', 95, 'Y', 'Y', 'N', 999);
-- Cars [Available] [Dealership IDs: 20 - 130] [ECONOMY= 95] [ECONOMYPLUS = 295] [LUXURY = 485]
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(24, 'DWCWZQ2RLM', 'Toyota', 'Corolla', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 998);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(25, '1277HLC6HV', 'Honda', 'Civic', 'ECONOMY', 95, 'N', 'Y', 'Y', 999);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(26, 'BDORZ2Z056', 'Acura', 'TSX', 'LUXURY', 485, 'Y', 'N', 'Y', 998);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(27, 'WG3CUZKI6B', 'Subaru', 'Outback', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 999);

----  [New Added Cars 05/29] 1000 - 1002
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(30, '2MV28BEM1S', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1000);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(31, 'UQUOMS9AA9', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1000);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(32, 'DYOSFRAXG9', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1000);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(33, 'BAJQQCYTEJ', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1000);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(34, 'SIVU7OZO13', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1000);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(35, 'V71FK156KW', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1001);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(36, '0A6R442HOX', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1002);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(37, 'UT7PL1LREK', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1002);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(38, 'NAGT1PNQT9', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1002);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(39, '3ZY7XRI9BF', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1002);
----- 1003 - 1005
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(40, 'SVS3H24D0P', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1003);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(41, 'YQ0071IW36', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1003);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(42, 'RVTW1Y23P0', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1003);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(43, 'D5KMDBRBR2', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1004);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(44, 'FTM2LUDZW9', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1004);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(45, 'QQF6WO3YMU', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1005);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(46, '7ZBD7W7HEY', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1005);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(47, '63VIKQKPJX', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1005);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(48, 'LBZIZS8SY5', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1005);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(49, 'O4KDKUXNRP', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1005);
----- 1006 - 1011
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(50, '4I3ZZ0ERXE', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1006);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(51, '21NZQZZU80', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1007);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(52, 'PUQ1W9ALTQ', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1007);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(53, 'P7ZJCTS18M', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1008);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(54, 'XGCMX2795F', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1008);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(55, '05W1K3BQ9A', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1009);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(56, '2MFGUVKMER', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1010);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(57, 'Y34842BQHW', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1010);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(58, '5B2ABWCWGK', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1011);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(59, 'SWCR2X8GZA', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1011);
----- 1012 - 1014
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(120, 'SXQZDJJ0LY', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1012);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(121, 'AHH7F4XRDI', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1012);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(122, '5KIKTAZ9RJ', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1012);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(123, 'PVW3NDR0QC', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1012);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(124, 'GH5MY4OJVJ', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1013);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(125, 'TDEYXYVOS4', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1013);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(126, 'LFB0ONJGHD', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1013);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(127, '0QPZWC2Z5W', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1014);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(128, '5JDPDBQRK0', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1014);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(129, 'DC4N1AX7S8', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1014);
----- 1015 - 1019
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(60, 'SEP9YCHAKE', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1015);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(61, '13AUPP4Q8X', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1015);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(62, '0AHF2QMWIN', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1016);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(63, 'UJ2D99JXB3', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1016);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(64, 'AQ03ZK5WQC', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1017);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(65, 'R5LI2Z0HHT', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1017);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(66, 'W4CNIS0EEB', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1018);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(67, 'JC6O4GHWOA', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1018);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(68, '491LKNUM09', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1019);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(69, 'ZAXL70AQ1Q', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1019);
----- 1020 - 1024
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(70, '5YY3165ZR8', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1021);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(71, 'HVXMZW6A4N', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1021);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(72, 'OYPRK6H8UK', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1021);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(73, '94NFH6UFK6', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1021);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(74, 'R6ZZLFVP77', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1022);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(75, 'I2S629QUFW', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1022);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(76, 'JYPDFOO57A', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1023);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(77, 'S7C7MD2GMB', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1023);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(78, 'XA9TLBD60E', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1024);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(79, 'JSO9ECEYZR', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1024);
----- 1025 - 1027
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(80, '3XPNKVNBKE', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1025);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(81, 'UUQTFHBE5C', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1025);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(82, 'EUMSTMISH6', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1025);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(83, 'PKRMKGNPMC', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1025);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(84, '6GVJ202RNJ', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1026);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(85, 'ITB6XTM4GN', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1026);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(86, 'ABHRXQRN73', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1026);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(87, 'J7WLRM37ZL', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1027);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(88, 'UFJ92WRKXG', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1027);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(89, '85Q316YRPL', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1027);
----- 1028 - 1030
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(90, 'XLNSZAW49S', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1028);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(91, '9ROD2W6AI9', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1028);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(92, 'L99THCW6Y7', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1028);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(93, 'QDTDRIS454', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1028);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(94, 'YQWZPP5ECW', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1029);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(95, '4I7KF06C7L', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1029);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(96, '4343434', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1029);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(97, 'CY03Y32FB8', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1031);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(98, 'M4F4MV8ESB', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1031);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(99, 'N341B1TIBG', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1031);
----- 1031 - 1035
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(100, 'QDZVIBRAMW', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1031);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(101, 'A0LXE92BGQ', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1031);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(102, 'VKTMTU2MJT', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1032);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(103, 'XTXHLV84VP', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1032);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(104, '8G1DEIN0PL', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1033);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(105, '6NFJXZB9QQ', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1033);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(106, 'KW9IWS9J89', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1034);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(107, 'L76W9GP36R', 'Ford', 'F150', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1034);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(108, 'EI12BFGYQ5', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1035);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(109, 'V57UOYDJPN', 'Toyota', 'Corolla', 'ECONOMY', 95, 'N', 'Y', 'Y', 1035);
----- 1036 - 1037
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(110, 'DNY716DE2H', 'Honda', 'Accord', 'ECONOMY', 95, 'N', 'N', 'Y', 1036);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(111, 'OOJPXRX88L', 'Toyota', 'Camry', 'ECONOMY', 95, 'N', 'Y', 'Y', 1036);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(112, 'DXGL7H9DV4', 'Acura', 'TLX', 'LUXURY', 485, 'Y', 'N', 'Y', 1036);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(113, 'V9NZE407L4', 'Subaru', 'Crosstrek', 'ECONOMYPLUS', 295, 'Y', 'Y', 'Y', 1036);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(114, 'R1T7NW3UR5', 'Honda', 'Civic', 'ECONOMYPLUS', 295, 'N', 'N', 'Y', 1037);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(115, '7XVGLTHYGD', 'Ford', 'Fiesta', 'ECONOMY', 95, 'N', 'Y', 'Y', 1037);
INSERT INTO Car(CarId, CarVinId, CarManufacturer, CarModel, CarClass, CarPrice, CarBabySeat, CarSunroof, CarAvailable, DealershipId)
VALUES(116, 'JMR2QCBB3D', 'Acura', 'TL', 'LUXURY', 485, 'Y', 'N', 'Y', 1037);

-- Premade Reservations
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(11, '2021-04-22', 3, true, '2022-05-11', '2022-06-06', 100, 20);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(12, '2021-04-22', 3, true, '2022-05-30', '2022-06-06', 100, 21);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(13, '2022-04-22', 3, true, '2022-06-01', '2022-06-07', 101, 22);
INSERT INTO Reservation(ReservationId, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId, CarId)
VALUES(14, '2022-04-22', 3, true, '2022-06-06', '2022-06-07', 101, 23);

INSERT INTO CarReturn(ReturnId, DealershipId, CustomerId, EmployeeId, LateReturn,
                      FullTank, ReturnMileage, InteriorDamage, InteriorNotes, InteriorFee, ExteriorDamage, ExteriorNotes, ExteriorFee, TotalFee)
VALUES(1, 999, 100, 100, 'N', 'Y', 50000, 'F', 'NA', 0, 'F', 'NA', 0, 0);