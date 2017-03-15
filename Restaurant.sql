create database RestaurantResSys;

use RestaurantResSys;

create table customer(
	C_ID int primary key not null auto_increment,
    name varchar(50),
    username varchar(50),
    password varchar(256)
);

insert into customer (	C_ID ,
    name ,
    username ,
    password ) values (null,"MMT","MMT","ABC");
    
