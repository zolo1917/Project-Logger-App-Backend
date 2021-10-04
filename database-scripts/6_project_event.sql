drop table if exists project_event;
create table project_event (
	id int unsigned primary key,
	event_topic varchar(30),
    project_id int unsigned,
    event_description varchar(500),
    event_status varchar(30),
    user_id int unsigned,
    created_date date, 
    updated_date date,
    foreign key (project_id) references project(id),
    foreign key (user_id) references users(id)
);