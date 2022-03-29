insert into `category` (`id`,`created_at`,`updated_at`,`title`,`slug`,`description`,`enabled`)values('cat1','2022-09-01','2022-09-06','Front-end','fe','Designing the page',0);
insert into `category` (`id`,`created_at`,`updated_at`,`title`,`slug`,`description`,`enabled`)values('cat2','2022-06-03','2022-06-05','Front-end','we','Designing the page',1);
insert into `category` (`id`,`created_at`,`updated_at`,`title`,`slug`,`description`,`enabled`)values('cat3','2021-06-09','2021-06-11','middle-ware',"fa",'designing the page',0);
insert into `category` (id,created_at,updated_at,title,slug,description,parent_id,enabled)values('cat4','2022-09-03','2022-09-05','back-end','wa','connect fa and wa','cat2',0);
insert into `category` (id,created_at,updated_at,title,slug,description,parent_id,enabled)values('cat5','2022-06-05','2022-06-09','back-end','sa','connect wa and sa','cat1',0);
select * from category;
truncate category;
insert into image(id,created_at,updated_at,url) values('img1','2022-09-06','2022-09-08','G:\images\01');
insert into image(id,created_at,updated_at,url) values('img2','2022-09-06','2022-09-08','G:\images\05');
insert into image(id,created_at,updated_at,name,url) values('img3','2022-09-06','2022-09-08','img1','G:\images\01');
insert into image(id,created_at,updated_at,url) values('img4','2022-09-06','2022-09-08','G:\images\04');
insert into image(id,created_at,updated_at,name,url) values('img5','2022-09-06','2022-09-08','img2','G:\images\01');
insert into image(id,created_at,updated_at,name,url) values('img6','2022-09-06','2022-09-08','img2','G:\images\04');
insert into image(id,created_at,updated_at,name,url) values('img7','2022-09-06','2022-09-08','img2','G:\images\03');
select * from image;
insert into organization values('org01','2000-02-20','2005-03-25','tcs','www.tcs.com','tcs.in','img1','full') ;
insert into organization values('org02','2002-02-22','2003-03-25','wipro','www.wipro.com','wipro.in','img2','EXTERNAL') ;
insert into organization values('org03','2003-02-25','2004-03-20','hcl','www.hcl.com','hcl.in','img4','TRIAL') ;
insert into organization values('org04','2004-04-20','2005-03-25','vitech','www.vitech.com','vitech.in','img5','INTERNAL') ;
insert into organization values('org05','2005-02-20','2006-03-25','intel','www.intel.com','intel.in','img3','full') ;
select * from organization;
insert into instructor (id,created_at,updated_at,bio,tagline,user_id)values('ins1','2019-09-06','2019-06-09','User','user_01','user1');
insert into instructor (id,created_at,updated_at,bio,tagline,user_id)values('ins2','2019-09-06','2019-06-09','User','user_02','user2');
insert into instructor (id,created_at,updated_at,bio,tagline,user_id)values('ins3','2019-09-06','2019-06-09','User','user_01','user3');
insert into instructor (id,created_at,updated_at,bio,tagline,user_id)values('ins4','2019-09-06','2019-06-09','User','user_01','user4');
insert into instructor (id,created_at,updated_at,bio,tagline,user_id)values('ins5','2019-09-06','2019-06-09','User','user_01','user5');
select * from instructor;
insert into user(id,created_at,updated_at,first_name,last_name,email,mobile,password,date_of_birth,address,display_picture_id,organization_id)
values('user01','2020-04-09','2020-04-10','Arunkumar','G','arun@gmail.com',9845318551,'arun@123','1997-04-09','{ "door_no":63,"street":"Rajajistreet","city":"arakkonam","State":"TN"}','img1','org01');
insert into user(id,created_at,updated_at,first_name,last_name,email,mobile,password,date_of_birth,address,display_picture_id,organization_id)
values('user02','2020-04-09','2020-04-10','Arunkumar','j','jarun@gmail.com',9845318551,'jarun@123','1996-04-09','{ "door_no":63,"street":"nerhustreet","city":"arakkonam","State":"TN"}','img3','org05');
insert into user(id,created_at,updated_at,first_name,last_name,email,mobile,password,date_of_birth,address,display_picture_id,organization_id)
values('user03','2020-04-09','2020-04-10','Arunkumar','h','harun@gmail.com',9845318551,'harun@123','1927-04-09','{ "door_no":63,"street":"gandhistreet","city":"arakkonam","State":"TN"}','img4','org04');
insert into user(id,created_at,updated_at,first_name,last_name,email,mobile,password,date_of_birth,address,display_picture_id,organization_id)
values('user04','2020-04-09','2020-04-10','Arunkumar','l','larun@gmail.com',9845318551,'larun@123','1996-04-09','{ "door_no":65,"street":"Rajajistreet","city":"arakkonam","State":"TN"}','img2','org01');
insert into user(id,created_at,updated_at,first_name,last_name,email,mobile,password,date_of_birth,address,display_picture_id,organization_id)
values('user05','2020-04-09','2020-04-10','Arun','G','arun@gmail.com',9845318551,'arun@123','1997-04-09','{ "door_no":69,"street":"Rajajistreet","city":"arakkonam","State":"TN"}','img5','org05');
select * from user;
insert into role values('r001','2000-02-20','2005-03-25','student',' recent learning ','1','1','org01','k001','accept') ;
insert into role values('r002','2000-02-23','2005-03-20','alumni',' already learned student ','0','0','org02','k002','accept') ;
insert into role values('r003','2000-02-24','2005-03-25','admin',' office work ','1','1','org03','k003','accept') ;
insert into role values('r004','2000-02-21','2005-03-24','student',' recent learning ','1','1','org04','k004','accept') ;
insert into role values('r005','2000-02-23','2005-03-27','alumni',' office work ','1','1','org05','k005','accept') ;
select * from role;
insert into user_roles(`user_id`,`role_id`)values('user01','r001');
insert into user_roles(`user_id`,`role_id`)values('user02','r002');
insert into user_roles(`user_id`,`role_id`)values('user03','r003');
insert into user_roles(`user_id`,`role_id`)values('user04','r004');
insert into user_roles(`user_id`,`role_id`)values('user05','r005');
select * from user_roles;



