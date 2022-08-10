create table book (
       id bigint not null,
        description varchar(255),
        name varchar(255),
        price double precision,
        author_id bigint,
        category_id bigint,
        primary key (id)
    ) engine=InnoDB;