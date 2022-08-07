use case_study_module4;
insert into `position`(id_position,name_position) 
values 
(1,"Lễ tân"), 
(2,"Phục vụ"), 
(3,"Chuyên viên"), 
(4,"Giám sát"), 
(5,"Quản lý"), 
(6,"Giám đốc");
insert into education_degree(id_education,name_education) 
values 
(1,"Trung cấp"), 
(2,"Cao đẳng"), 
(3,"Đại học"), 
(4,"Sau đại học");
insert into division(id_division, name_division) 
values 
(1,"Sale – Marketing"), 
(2,"Hành Chính"), 
(3,"Phục vụ"), 
(4,"Quản lý");
insert into employee(name_employee,birthday_employee,id_card,salary,phone_number,email,address,id_position,id_education,id_division,`status`) 
values 
('Nguyễn Văn An', '1994-01-08','456231786','10000000','0901234121','annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1,0), 
('Lê Văn Bình', '1997-04-09','654231234','7000000','0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2,0), 
('Hồ Thị Yến','1995-12-12','999231723','14000000','0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2,0), 
('Võ Công Toản','1980-04-04','123231365','17000000','0374443232','toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,2,3,0), 
('Nguyễn Bỉnh Phát','1999-12-09','454363232','6000000','0902341231','phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1,0), 
('Khúc Nguyễn An Nghi','2000-11-08','964542311','7000000','0978653213','annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,3,3,0), 
('Nguyễn Hữu Hà','1993-01-01','534323231','8000000','0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2,0), 
('Nguyễn Hà Đông','1989-09-03','234414123','9000000','0642123111','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,2,2,0), 
('Tòng Hoang','1982-09-03','256781231','6000000','0245144444','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4,0), 
('Nguyễn Công Đạo','1994-01-08','755434343','8000000','0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2,0);
insert into customer_type(name_type) 
values 
('Diamond'), 
('Platinium'), 
('Gold'), 
('Silver'), 
('Member');
insert into customer(customer_type_id,`name`,birthday,gender,id_card,phone_number,email,address,`status`) 
values (5,'Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',0), 
(3,'Phạm Xuân Diệu','1992-08-08',1,865342123,0954333333,'xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',0), 
(1,'Trương Đình Nghệ','1990-02-27',1,488645199,0373213122,'nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',0), 
(1,'Dương Văn Quan','1981-07-08',1,543432111,0490039241,'duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',0), 
(4,'Hoàng Trần Nhi Nhi','1995-12-09',0,795453345,0312345678,'nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',0), 
(4,'Tôn Nữ Mộc Châu','2005-12-06',0,732434215,0988888844,'tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',0), 
(1,'Nguyễn Mỹ Kim','1984-04-08',0,856453123,0912345698,'kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',0), 
(3,'Nguyễn Thị Hào','1999-04-08',0,965656433,0763212345,'haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',0), 
(1,'Trần Đại Danh','1994-07-01',1,432341235,0643343433,'danhhai99@gmail.com','24 Lý Thường Kiệt,Quảng Ngãi',0), 
(2,'Nguyễn Tâm Đắc','1989-07-01',1,344343432,0987654321,'dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',0);
insert into rent_type( name_rent_type) 
values 
("Năm"), 
("Tháng"), 
("Ngày"), 
("Giờ");
insert into facility_type(id,name_facility_type) 
values 
(1,"Villa"), 
(2,"House"), 
(3,"Room");
-- (`name`,area,cost,max_people,standard_room,description_other_convenience,pool_area,number_of_floors,facility_free,rent_type_id,facility_type_id)

insert into facility(id,name_facility,area ,cost,max_people,s_room,o_amenities,poola,n_flo_ors,facility_free,rent_type_id,facility_type_id,`status`) 
values (1,'Villa Beach Front',25000,10000000,10,'vip','Có hồ bơi',500,4,'không có',3,1,0), 
(2,'House Princess 01',14000,5000000,7,'vip','Có thêm bếp nướng',null,3,'không có',2,2,0), 
(3,'Room Twin 01',5000,1000000,2,'normal','Có tivi',null,null,'không có',4,3,0), 
(4,'Villa No Beach Front',22000,9000000,8,'normal','Có hồ bơi',300,3,'không có',3,1,0), 
(5,'House Princess 02',10000,4000000,5,'normal','Có thêm bếp nướng',null,2,'không có',3,2,0), 
(6,'Room Twin 02',3000,900000,2,'normal','Có tivi',null,null,'không có',4,3,0);
INSERT INTO attach_facility(name,cost,unit,status) 
 VALUES ('Karaoke','100000','giờ','tiện nghi, hiện tại'), 
('Thuê xe máy','100000','chiếc','hỏng 1 xe'), 
('Thuê xe đạp','200000','chiếc','tốt'), 
('Buffet buổi sáng','150000','suất','đầy đủ đồ ăn, tráng miệng'), 
('Buffet buổi trưa','900000','suất','đầy đủ đồ ăn, tráng miệng'), 
('Buffet buổi tối','160000','suất','đầy đủ đồ ăn, tráng miệng'); 
insert into contract(star_date,end_date,deposit,employee_id,customer_id,facility_id) 
VALUES ( '2020-12-08', '2020-12-08', '0', '3', '1', '3'), 
( '2020-07-14', '2020-07-21', '200000', '7', '3', '1'), 
( '2021-03-15', '2021-03-17', '50000', '3', '4', '2'), 
( '2021-01-14', '2021-01-18', '100000', '7', '5', '5'), 
( '2021-07-14', '2021-07-15', '0', '7', '2', '6'), 
( '2021-06-01', '2021-06-03', '0', '7', '7', '6'), 
( '2021-09-02', '2021-09-05', '100000', '7', '4', '4'), 
( '2021-06-17', '2021-06-18', '150000', '3', '4', '1'), 
( '2020-11-19', '2020-11-19', '0', '3', '4', '3'), 
( '2021-04-12', '2021-04-14', '0', '10', '3', '5'), 
( '2021-04-25', '2021-04-25', '0', '2', '2', '1'), 
( '2021-05-25', '2021-05-27', '0', '7', '10', '1');
INSERT INTO contract_detail(quantity,contract_id,attach_facility_id) 
 VALUES ( 5,2,4),( 8,2,5),( 15,2,6),( 1,3,1),( 11,3,2),( 1,1,3),( 2,1,2),( 2,12,2); 