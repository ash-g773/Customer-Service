create database customer;

use customer;

create table customer(
detailId int primary key,
customerId int not null,
shareId int not null,
shareType varchar(25) not null,
quantity int not null);

-- have not inserted yet, need to update
insert into customer
values (10, 20, 101, "YouTube", 1000),
(11, 20, 102, "Twitter", 773),
(12, 21, 103, "Twitch", 444),
(13, 22, 104, "Apple", 847),
(14, 23, 105, "Spotify", 123),
(15, 23, 102, "Twitter", 850),
(16, 24, 102, "Twitter", 9),
(17, 25, 105, "Spotify", 10),
(18, 26, 104, "Apple", 12),
(19, 26, 101, "YouTube", 80);