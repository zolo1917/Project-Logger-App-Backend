drop table if exists users;
create table users (
	id int unsigned AUTO_INCREMENT PRIMARY KEY,
    first_name varchar(30),
    last_name varchar(30),
    user_status int unsigned,
    email varchar(30),
    created_date date,
    modified_date date,
	foreign key (user_status) references user_status_xref(id)
);