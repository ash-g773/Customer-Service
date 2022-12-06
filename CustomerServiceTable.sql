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
values (10, 20, 101, "Intra-Day", 1000),
(11, 20, 102, "Intra-Day", 773),
(12, 21, 103, "Long Term Holding", 444),
(13, 22, 104, "Intra-Day", 847),
(14, 23, 105, "Long Term Holding", 123),
(15, 23, 102, "Long Term Holding", 850),
(16, 24, 102, "Intra-Day", 9),
(17, 25, 105, "Intra-Day", 10),
(18, 26, 104, "Intra-Day", 12),
(19, 26, 101, "Long Term Holding", 80);