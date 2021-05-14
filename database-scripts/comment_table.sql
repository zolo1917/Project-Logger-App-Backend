drop table if exists comments;
create table comments (
	id int unsigned primary key,
    event_id int unsigned,
    comment_description varchar(400),
    user_id int unsigned,
    created_date date,
    updated_date date,
    foreign key (event_id) references project_event(id),
    foreign key (user_id) references users(id)
);