
drop table if exists project;
create table project(
	id int unsigned auto_increment primary key,
    project_name varchar (30),
    summary varchar(100),
    user_id int unsigned,
    project_description varchar(500),
    project_status varchar (30),
    created_date date,
    modified_date date,
    foreign key (user_id) references users(id)
);


