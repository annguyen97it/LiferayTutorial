create table MyStudent (
	studentId LONG not null primary key,
	Code VARCHAR(75) null,
	FullName VARCHAR(75) null,
	Birthday DATE null,
	Gender BOOLEAN,
	Address VARCHAR(75) null
);