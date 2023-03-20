create table user_tb(
    id int auto_increment primary key,
    username varchar unique,
    password varchar,
    email varchar,
    created_at timestamp
);

create table board_tb(
    id int auto_increment primary key,
    title varchar,
    content varchar,
    user_id int,
    created_at timestamp
);