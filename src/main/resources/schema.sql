create table genres (
                        id serial8 primary key,
                        name varchar(50) not null
);

create table movies (
                        id serial8 primary key,
                        title varchar(100) not null,
                        release_year int2 not null,
                        rating float4 not null
);

create table movies_genres (
                               genre_id int8 not null,
                               movie_id int8 not null,
                               primary key (genre_id, movie_id),
                               foreign key (genre_id) references genres (id) on delete cascade,
                               foreign key (movie_id) references movies (id) on delete cascade
);
