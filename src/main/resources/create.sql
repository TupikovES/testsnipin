create table department
(
	id bigint not null
		primary key,
	department_name varchar(128) null
)
;

create table speciality
(
	id bigint not null
		primary key,
	speciality_name varchar(128) null,
	department_id bigint not null,
	constraint sp_dp
		foreign key (department_id) references department (id)
)
;

create index sp_dp
	on speciality (department_id)
;

create table student
(
	id bigint not null
		primary key,
	address varchar(256) null,
	first_name varchar(30) null,
	last_name varchar(30) null,
	middle_name varchar(30) null,
	phone varchar(255) null,
	year int not null,
	speciality_id bigint not null,
	constraint st_sp
		foreign key (speciality_id) references speciality (id)
)
;

create index st_sp
	on student (speciality_id)
;