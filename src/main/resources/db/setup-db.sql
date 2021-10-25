create database conferenceDb;

create user 'conference_user'@'localhost' identified by 'Con123';
grant all privileges conferenceDb.* to 'conference_user'@'localhost';
flush privileges