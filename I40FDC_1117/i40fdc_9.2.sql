CREATE TABLE tanfolyam (tkod INT PRIMARY KEY, ar INT CHECK (ar>0), megnevezes CHAR(50), tipus CHAR(1));
CREATE TABLE befizetes (kurzus INT REFERENCES tanfolyam, befizetes INT);
CREATE TABLE resztvevo (tajszam CHAR(12) PRIMARY KEY, nev CHAR(50), LAKCIM CHAR(100));

SELECT tipus, AVG(ar), MAX(ar) - MIN(ar) FROM tanfolyam GROUP BY tipus;

CREATE VIEW tdb AS SELECT MAX(t.megnevezes) nev, COUNT(*) db FROM tanfolyam t INNER JOIN befizetes b ON b.kurzus = t.tkod GROUP BY t.tkod;
SELECT nev, CASE WHEN db > 10 THEN "sokan" ELSE "kevesen" END letszam FROM tdb

