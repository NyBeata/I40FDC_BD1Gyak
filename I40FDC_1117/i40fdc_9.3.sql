ALTER TABLE termek DROP COLUMN gyarto;
CREATE TABLE gyartja (termek INT REFERENCES termek, gyarto INT REFERENCES gyarto);

