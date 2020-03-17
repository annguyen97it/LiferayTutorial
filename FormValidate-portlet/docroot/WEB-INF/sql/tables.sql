create table Validate_St (
	studentId LONG not null primary key,
	code_ VARCHAR(75) null,
	fullname VARCHAR(75) null,
	gender BOOLEAN,
	birthday DATE null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	blog VARCHAR(75) null,
	mark DOUBLE
);

create table Validate_Student (
	studentId LONG not null primary key,
	code_ VARCHAR(75) null,
	fullname VARCHAR(75) null,
	gender BOOLEAN,
	birthday DATE null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	blog VARCHAR(75) null,
	mark DOUBLE
);