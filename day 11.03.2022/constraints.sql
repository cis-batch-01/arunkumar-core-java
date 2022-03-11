create database bala;
use bala;
drop table trainer_info;
create table trainer_info2(Trainer_Id varchar(7) NOT NULL  primary key,Salutation varchar(50) NOT NULL,Trainer_Name varchar(50) NOT NULL,Trainer_Location varchar(50) NOT NULL,Trainer_Track varchar(50) NOT NULL,Trainer_Qualification varchar(50) NOT NULL,Trainer_Experiance varchar(5) ,Trainer_Email varchar(200) NOT NULL ,Trainer_Password varchar(200) NOT NULL, check (Trainer_Id like'F%'));
insert into  trainer_info2(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email ,Trainer_Password) values('F001','Mr.','PANKAJ GHOSH','Pune','Java','Bachelor of Technology',12,'Pankaj.Ghosh@alliance.com','fac1@123'); 
insert into  trainer_info2(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email ,Trainer_Password) values('T001','Mr.','PANKAJ GHOSH','Pune','Java','Bachelor of Technology',12,'Pankaj.Ghosh@alliance.com','fac1@123'); 
insert into  trainer_info2(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email ,Trainer_Password) values('F002','Mr.','PANKAJ GHOSH','Pune','Java','Bachelor of Technology',12,'Pankaj.Ghosh@alliance.com','pac1@123'); 
insert into  trainer_info2(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email ,Trainer_Password) values('F003','Mr.','SANJAY RADHAKRISHNAN' ,'Bangalore','DotNet','Bachelor of Technology',12,'Sanjay.Radhakrishnan@alliance.com','fac2@123'); 
insert into  trainer_info2(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email ,Trainer_Password) values('F003','Mr.','VIJAY MATHUR','Chennai','Mainframe','Bachelor of Technology',10,'Vijay.Mathur@alliance.com','fac3@123'); 
insert into  trainer_info2(Trainer_Id,Salutation,Trainer_Name,Trainer_Location,Trainer_Track,Trainer_Qualification,Trainer_Experiance,Trainer_Email ,Trainer_Password) values('F002','Mr.','PANKAJ GHOSH','Pune','Java','Bachelor of Technology',12,'Pankaj.Ghosh@alliance.com','pac1@123'); 

select * from trainer_info2;
create table Batch_Info(Batch_Id varchar(20) NOT NULL  primary key,Batch_Owner varchar(30) NOT NULL,Batch_BU_Name varchar(30) , check (Batch_Id like'B%'));
insert into Batch_Info(Batch_Id,Batch_Owner,Batch_BU_Name)values('B001','MRS.SWATI ROY','MSP');
insert into Batch_Info(Batch_Id,Batch_Owner,Batch_BU_Name)values('T001','MRS.SWATI ROY','MSP');
insert into Batch_Info(Batch_Id,Batch_Owner,Batch_BU_Name)values(null,'MRS.SWATI ROY','MSP');
select * from Batch_Info;
desc Batch_Info;
create table Module_Info(Module_Id varchar(20) NOT NULL  primary key,Module_Name varchar(40) NOT NULL,Module_Duration int , check (Module_Id=upper(Module_Id)));
insert into Module_Info(Module_Id,Module_Name,Module_Duration)values('O10SQL','Oracle 10gSQL' ,8);
insert into Module_Info(Module_Id,Module_Name,Module_Duration)values('0010vpl','Oracle 10gSQL' ,8);
select * from Module_Info;
create table Associate_Info(Associate_Id varchar(20) NOT NULL  primary key,Salutation varchar(7) NOT NULL,Associate_Name varchar(30) NOT NULL,Associate_Location varchar(30) NOT NULL,Associate_Track varchar(15) NOT NULL,Associate_Qualification varchar(200) NOT NULL,Associate_Email varchar(100) NOT NULL,Associate_Password varchar(20)NOT  NULL  , check (Associate_Id like'A%'));
insert into Associate_Info(Associate_Id,Salutation,Associate_Name,Associate_Location,Associate_Track,Associate_Qualification,Associate_Email,Associate_Password)values('A001','Miss.','GAYATHRI NARAYANAN','Gurgaon','Java','Bachelor of Technology','Gayathri.Narayanan@hp.com','tne1@123');
insert into Associate_Info(Associate_Id,Salutation,Associate_Name,Associate_Location,Associate_Track,Associate_Qualification,Associate_Email,Associate_Password)values('F001','Miss.','GAYATHRI NARAYANAN','Gurgaon','Java','Bachelor of Technology','Gayathri.Narayanan@hp.com','tne1@123');
select * from Associate_Info ; 
create table Questions(Question_Id varchar(20) NOT NULL  primary key,Module_Id varchar(7) NOT NULL references Module_Info.Module_Id,
Question_Text varchar(900) NOT NULL, check (Question_Id like'Q%'));
insert into Questions(Question_Id,Module_Id,Question_Text)values('Q004','EM002','The Hands on session adequate enough to grasp the understanding of the topic.');
insert into Questions(Question_Id,Module_Id,Question_Text)values('R004','EM002','The Hands on session adequate enough to grasp the understanding of the topic.');
select * from Questions ;
create table Associate_Status(Associate_Id varchar(20) NOT NULL  references Associate_Info.Associate_Id,Module_Id varchar(20) NOT NULL references Module_Info.Module_Id,Batch_Id varchar(20) NOT NULL references Batch_Info.Batch_Id,
Trainer_Id  varchar(20) NOT NULL references Trainer_Info.Trainer_Id,Start_Date varchar(20) NOT NULL,End_Date varchar(20)NOT NULL,AFeedbackGiven varchar(20) NOT NULL,TFeedbackGiven varchar(20) NOT NULL);
insert into Associate_Status(Associate_Id,Module_Id,Batch_Id,Trainer_Id,Start_Date,End_Date,AFeedbackGiven,TFeedbackGiven)values('A001','O10SQL','B001','F001','2000-12-15','2000-12-25','lovely','Good');
select * from Associate_Status ;
create table Trainer_Feedback(Trainer_Id varchar(20) NOT NULL  references Trainer_Info.Trainer_Id,Question_Id varchar(20) NOT NULL references Questions.Question_Id,Batch_Id varchar(20) NOT NULL references Batch_Info.Batch_Id,
Module_Id  varchar(20) NOT NULL references Module_Info.Module_Id,Trainer_Rating varchar(20) NOT NULL);
insert into Trainer_Feedback(Trainer_Id,Question_Id,Batch_Id,Module_Id,Trainer_Rating)values('F001','Q004','B001','O10SQL',4);
select * from Trainer_Feedback  ;
create table Associate_Feedback(Associate_Id varchar(20) NOT NULL  references Associate_Info.Associate_Id ,Question_Id varchar(20) NOT NULL references Questions.Question_Id,Module_Id varchar(20) NOT NULL references Module_Info.Module_Id,
Associate_Rating  varchar(20) NOT NULL);
insert into Associate_Feedback(Associate_Id,Question_Id,Module_Id,Associate_Rating)values('A001','Q004','O10SQL',4);
select * from  Associate_Feedback ;







