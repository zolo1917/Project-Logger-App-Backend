DROP table if exists event_status_xref;
create table event_status_xref(
	id int unsigned primary key,
    event_status varchar(30),
    event_description varchar(150)
);

DROP table if exists project_status_xref;
create table project_status_xref(
	id int unsigned primary key,
    project_status varchar(30),
    project_description varchar(150)
);

DROP table if exists user_status_xref;
create table user_status_xref(
	id int unsigned primary key,
    user_status varchar(30)
);
