CREATE TABLE IF NOT EXISTS actor (
    id BIGSERIAL primary key ,
    name TEXT NOT NULL,
    movie  BIGSERIAL references movie (id),
    unique (name, movie)
);