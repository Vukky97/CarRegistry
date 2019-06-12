CREATE TABLE CARS(
	id INT NOT NULL auto_increment UNIQUE,
	make VARCHAR(16) NOT NULL,
	modell VARCHAR(20) NOT NULL,
    	engine VARCHAR(10) NOT NULL, 
	price int NOT NULL,
	available boolean,
	year INT NOT NULL
	);

	insert into cars (make,modell,engine,price,available,year)
	 values('BMW','E36','20i',850000,true,1998);
