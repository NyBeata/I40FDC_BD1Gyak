CREATE TABLE gyarto (adoszam INT PRIMARY KEY, nev CHAR(30), irsz CHAR(30), varos CHAR(30), utca CHAR(30));
CREATE TABLE termek (tkod INT PRIMARY KEY, nev CHAR(30), ear INT CHECK (ear>0), gyarto INT REFERENCES gyarto);
CREATE TABLE alkatresz (akod INT PRIMARY KEY, nev CHAR(30) NOT NULL);
CREATE TABLE egysegek (aru INT REFERENCES termek, db INT CHECK (db > 0)) ;
CREATE TABLE komponens (termek INT REFERENCES termek, alkatresz INT REFERENCES alkatresz);

ALTER TABLE alkatresz ADD (ar INT CHECK (ar>0));
SELECT nev FROM gyarto WHERE adoszam NOT IN (SELECT gyarto FROM termek);
UPDATE termek SET ear = 1.1*ear WHERE tkod IN (SELECT termek FROM komponens WHERE alkatresz = (SELECT akod FROM alkatresz WHERE nev = 'X'));
