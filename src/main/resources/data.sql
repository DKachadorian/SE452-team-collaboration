INSERT INTO Car(CarId, CarMake, CarModel, CarClass, CarPrice, CarVinId, CarSeat, CarSunroof)
    VALUES(1,'Dodge','Challenger','SPORTS_CAR',40000,'TGR231','Y','Y');

INSERT INTO Customer(CustomerId, Address, FirstName, LastName, PhoneNumber) VALUES (1, 'Address', 'John', 'Simon', '222-222-2222');

INSERT INTO Reservation(ReservationID, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId)
    VALUES(1, '2021-04-22', 3, true, '2021-05-01', '2021-05-04', 1);
INSERT INTO Reservation(ReservationID, ReservationDate, DaysReserved, ReturnToOrigin, StartDate, EndDate, CustomerId)
    VALUES(2, '2021-04-24', 5, true, '2021-01-03', '2021-05-08', 1);
