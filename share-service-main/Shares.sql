create database Shares;

create table share (
shareId int primary key,
shareName varchar(20),
marketPrice double);

insert into share
values(101, 500000, "Share One"),
(102, 200000, "Share Two"),
(103, 400000, "Share Three"),
(104, 300000, "Share Four"),
(105, 800000, "Share Five");

select * from share;