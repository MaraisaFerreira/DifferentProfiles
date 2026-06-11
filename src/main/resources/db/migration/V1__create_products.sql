create table products (
    id bigint primary key auto_increment,
    name varchar(100) not null,
    price double precision not null,
    quantity int not null,
    category ENUM(
        'PAPELARIA',
        'MOVEIS',
        'INFORMATICA'
) not null,

    constraint check_negative_price check ( price >= 0 ),
    constraint check_negative_quantity check ( quantity >= 0 )
);