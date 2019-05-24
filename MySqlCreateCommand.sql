CREATE TABLE CARS(
	id INT NOT NULL auto_increment UNIQUE,
	make VARCHAR(16) NOT NULL,
	modell VARCHAR(20) NOT NULL,
    year DATETIME NOT NULL,
    engine VARCHAR(10) NOT NULL, 
	price int NOT NULL,
	available boolean
	);

	insert into cars (make,modell,year,engine,price,available)
	 values('BMW','E36','2013-01-18','20i',850000,true);