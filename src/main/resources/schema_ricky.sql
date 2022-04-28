DROP TABLE IF EXISTS Registrations CASCADE;
DROP TABLE IF EXISTS Registration_Guest;
DROP TABLE IF EXISTS Customers CASCADE;
DROP TABLE IF EXISTS PaymentAccounts;

CREATE TABLE Registrations (
    UserName    VARCHAR(255) NOT NULL,
    Password    VARCHAR(255) NOT NULL,
    ID          INT NOT NULL,
    FirstName   VARCHAR(255) NOT NULL,
    LastName    VARCHAR(255) NOT NULL,
    Address     VARCHAR(255) NOT NULL,
    DriversLicense  VARCHAR(255) NOT NULL,
    InsuranceCarrier    VARCHAR(255) NOT NULL
);

CREATE TABLE Registration_Guest (
    ID          INT NOT NULL,
    FirstName   VARCHAR(255) NOT NULL,
    LastName    VARCHAR(255) NOT NULL,
    Address     VARCHAR(255) NOT NULL,
    DriversLicense  VARCHAR(255) NOT NULL,
    InsuranceCarrier    VARCHAR(255) NOT NULL
);

CREATE TABLE Customers(
    CustomerID int NOT NULL AUTO INCREMENT,
    FirstName   VARCHAR(255) NOT NULL,
    LastName    VARCHAR(255) NOT NULL,
    Age         INT(3),
    Address     VARCHAR(255) NOT NULL,
    DriversLicense  VARCHAR(255) NOT NULL,
    InsuranceCarrier    VARCHAR(255) NOT NULL
    PRIMARY KEY(CustomerID);
);

CREATE TABLE PaymentAccounts(
    CustomerID  int,
    FirstName   VARCHAR(255) NOT NULL,
    LastName    VARCHAR(255) NOT NULL,
    PaymentOptions  VARCHAR(255) NOT NULL,
    CardType       VARCHAR(255) NOT NULL,
    CardNumber      INT(9),
    SecurityCode    INT(3),
    FOREIGN KEY(CustomerID), REFERENCES Customers(CustomerID)
);