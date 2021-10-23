create database conferenceDb;

create user 'conference_user'@'localhost' identified by 'Con123';
grant all privileges shopdb.* to 'conference_user'@'localhost';
flush privileges