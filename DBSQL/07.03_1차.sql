CREATE TABLE contact_tbl (
	id INT UNSIGNED auto_increment NOT NULL,
	name varchar(20) NOT NULL,
	phoneNumber varchar(20) NOT NULL,
	zipNumber varchar(5) NOT NULL,
	email varchar(100) NOT NULL,
	addr varchar(500) NOT NULL,
	CONSTRAINT contact_pk PRIMARY KEY (id)
);

CREATE TABLE saled_tbl (
	id INT UNSIGNED auto_increment NOT NULL,
	sale_dt DATE default(CURRENT_DATE) NOT NULL,
	price INT UNSIGNED default(0) NOT NULL,
	qty INT UNSIGNED default(0) NOT NULL,
	product varchar(100) NOT NULL,
	location_id INT UNSIGNED,
	discount INT UNSIGNED default(0) NOT NULL,
	contact_id INT UNSIGNED NOT NULL,
	CONSTRAINT saled_pk PRIMARY KEY (id),
	CONSTRAINT saled_fk_loc FOREIGN KEY (location_id) REFERENCES location_tbl (id),
	CONSTRAINT saled_fk_con FOREIGN KEY (contact_id) REFERENCES contact_tbl (id)
);

CREATE TABLE location_tbl (
	id INT UNSIGNED auto_increment NOT NULL,
	location varchar(500) NOT NULL,
	CONSTRAINT location_pk PRIMARY KEY (id)
);

CREATE TABLE learn_tbl (
	id INT UNSIGNED auto_increment NOT NULL,
	lecture_id INT UNSIGNED NOT NULL,
	score DECIMAL(5,1) default(0) NOT NULL,
	contact_id int UNSIGNED NOT NULL,
	CONSTRAINT learn_pk PRIMARY KEY (id),
	CONSTRAINT learn_fk FOREIGN KEY (lecture_id) REFERENCES lecture_tbl (id),
	CONSTRAINT learn_fk_con FOREIGN KEY(contact_id) REFERENCES contact_tbl(id)
);

CREATE TABLE lecture_tbl (
	id INT UNSIGNED auto_increment NOT NULL,
	subject varchar(100) NOT NULL,
	teacher varchar(20) NOT NULL,
	root_num varchar(10) NOT NULL,
	start_dt DATE NOT NULL,
	end_dt DATE NOT NULL,
	CONSTRAINT lecture_pk PRIMARY KEY (id)
);




