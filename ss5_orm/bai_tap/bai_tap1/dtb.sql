drop database if exists song;
create database song;
create table song_music(
id int auto_increment primary key,
name_song varchar(250),
nge_si varchar(250),
the_loai varchar(250),
duong_dan varchar(250)
);
insert into song_music (name_song,nge_si,the_loai,duong_dan)
value('tim lai bau troi','tuan hung','chu tinh','a'),
('tim ','tuan ','chu tinh','a'),
(' troi',' hung','chu tinh','a'),
('tim lai bau troi','tuan hung','chu tinh','a');