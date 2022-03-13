create database QuanLy
go
use QuanLy
go
create table users(
	maUser int  IDENTITY not null primary key,
	hoVaTen nvarchar(30),
	soDienThoai char(10),
	userName varchar(20),
	matKhau varchar(10),
	gioiTinh char(7),
)
create table product(
	maSanPham int identity  not null primary key,
	tenSanPham nvarchar(30),
	soLuong int ,
	donGia float,
)
Insert into users(hoVaTen,soDienThoai,userName,matKhau,gioiTinh)
values
	('Phan Đức Kiên','03225','PhanKien02','1234','Female')
insert into product(tenSanPham,soLuong,donGia)
values('sp1',23,50)