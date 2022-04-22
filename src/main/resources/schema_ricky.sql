DROP TABLE IF EXISTS Registrations CASCADE;
DROP TABLE IF EXISTS Customers CASCADE;

CREATE TABLE Registrations (
    UserName    VARCHAR(255) NOT NULL,
    Password    VARCHAR(255) NOT NULL,
    ID          INT NOT NULL
);

CREATE TABLE Customers(
    CustomerID int NOT NULL AUTO INCREMENT,
    FirstName   VARCHAR(255) NOT NULL,
    LastName    VARCHAR(255) NOT NULL,
    Age         int,
    Address     VARCHAR(255) NOT NULL,
    PRIMARY KEY(CustomerID);
);

CREATE TABLE PaymentAccounts(
    d_license   VARCHAR(9),
    carrier     VARCHAR(255),
    CustomerID  int,
    FOREIGN KEY(CustomerID), REFERENCES Customers(CustomerID)
);