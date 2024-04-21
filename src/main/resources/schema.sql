CREATE TABLE Bilett
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    film VARCHAR(255) NOT NULL,
    antall INTEGER,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    epost VARCHAR(255),
    telefon INTEGER,
    PRIMARY KEY (id)
);
