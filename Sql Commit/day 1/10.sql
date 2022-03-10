create database peacock;
use peacock;
show databases;
show tables;
drop table trainer_info;
create table trainer_info(trainer_id varchar(20),salutation varchar(7),trainer_name varchar(50),Trainer_Track varchar(15),Trainer_Qualification varchar(100),Trainer_Experiance varchar(11),Trainer_Email varchar(100),Trainer_password varchar(20));
create table Batch_Info(Batch_Id varchar(20),Batch_Owner varchar(30),Batch_BU_Name varchar(30));
create table Module_Info(Module_Id varchar(20),Module_Name varchar(40),Module_Duration int(11),Trainer_Track varchar(15),Trainer_Qualification varchar(100),Trainer_Experiance int(11),Trainer_Email varchar(100),Trainer_password varchar(20));
create table Batch_Info(Batch_Id varchar(20),Batch_Owner varchar(30),Batch_BU_Name varchar(30));
create table Associate_Info1(Associate_Id varchar(20),Salutation varchar(7),Associate_Name varchar(30),Associate_Location varchar(30),Associate_Track varchar(15),Associate_Qualification varchar(200),Associate_Email varchar(200),Associate_Password varchar(20));
create table Questions(Question_Id varchar(20),Module_Id varchar(20),Question_Text varchar(900));
create table Associate_Status(Associate_Id varchar(20),Module_Id varchar(20),Start_Date varchar(20),End_Date varchar(20),AFeedbackGiven varchar(20),TFeedbackGiven varchar(20));
create table Trainer_Feedback1(Trainer_Id varchar(20),Question_Id varchar(20),Batch_Id varchar(20),Module_Id varchar(20),Trainer_Rating varchar(11));
create table Associate_Status(Associate_Id varchar(20),Module_Id varchar(20),Start_Date varchar(20),End_Date varchar(20),AFeedbackGiven varchar(20),TFeedbackGiven varchar(20));
create table Login_Details(User_Id varchar(20),User_Password varchar(20));
show tables;
desc trainer_info ;
desc Batch_Info;
desc Module_Info;
desc  Batch_Info;

desc Questions;
desc Associate_Status;
desc Trainer_Feedbac;
desc Associate_Status;
desc  Login_Details;
ALTER TABLE Associate_Status add (Batch_Id varchar(20),batch_Info varchar(20));
ALTER TABLE Trainer_Feedback1 RENAME TO Trainer_Feedbac;
insert into Login_Details values('arunprakasam1994','arun1994');
insert into Login_Details values('logo','logo1994');
insert into Login_Details values('arunprakasam1994','arun1994');
insert into Trainer_Info values('F001','Mr.','PANKAJ GHOSH','Pune','Java,Bachelor of Technology',12,'Pankaj.Ghosh@alliance.com','fac1@123');
insert into Trainer_Info values('F002','Mr.','SANJAY RADHAKRISHNAN' ,'Bangalore','DotNet,Bachelor of Technology',12,'Sanjay.Radhakrishnan@alliance.com','fac2@123');
insert into Trainer_Info values('F003','Mr.','VIJAY MATHUR','Chennai','Mainframe,Bachelor of Technology',10,'Vijay.Mathur@alliance.com','fac3@123');
insert into Trainer_Info values('F004','Mrs.','NANDINI NAIR','Kolkata','Java,Master of Computer Applications',9,'Nandini.Nair@alliance.com','fac4@123');
insert into Trainer_Info values('F005','Miss.','ANITHA PAREKH','Hyderabad','Testing,Master of Computer Applications',6,'Anitha.Parekh@alliance.com','fac5@123');
insert into Trainer_Info values('F006','Mr.','MANOJ AGRAWAL' ,'Mumbai','Mainframe,Bachelor of Technology',9,'Manoj.Agrawal@alliance.com','fac6@123');
insert into Trainer_Info values('F007','Ms.','MEENA KULKARNI','Coimbatore','Testing,Bachelor of Technology',5,'Meena.Kulkarni@alliance.com','fac7@123');
insert into Trainer_Info values('F009','Mr.','SAGAR MENON' ,'Mumbai','Java,Master of Science In Information Technology',12,'Sagar.Menon@alliance.com','fac8@123');
select * from Trainer_Info;
delete  from Trainer_Info;
delete from Trainer_Info where trainer_name='NANDINI NAIR';
set sql_safe_updates=0;
insert into Batch_Info values('B001','MRS.SWATI ROY','MSP');
insert into Batch_Info values('B002','MRS.ARURNA K','HEALTHCARE');
insert into Batch_Info values('B003','MR.RAJESH KRISHNAN','LIFE SCIENCES');
insert into Batch_Info values('B004','MR.SACHIN SHETTY','BFS');
insert into Batch_Info values('B005','MR.RAMESH PATEL','COMMUNICATIONS');
insert into Batch_Info values('B006','MRS.SUSAN CHERIAN','RETAIL & HOSPITALITY');
insert into Batch_Info values('B007','MRS.SAMPADA JAIN','MSP');
insert into Batch_Info values('B008','MRS.KAVITA REGE','BPO');
insert into Batch_Info values('B009','MR.RAVI SEJPAL','MSP');
select * from Batch_Info;
insert into Module_Info  values('O10SQL','Oracle 10g SQL' ,16);
insert into Module_Info values('O10PLSQL','Oracle 10g PL/ SQL' ,16);
insert into Module_Info values('J2SE','Core Java SE 1.6',288);
insert into Module_Info values('J2EE','Advanced Java EE 1.6',80);
insert into Module_Info values('JAVAFX','JavaFX 2.1',80);
insert into Module_Info values('DOTNT4','.Net Framework 4.0' ,50);
insert into Module_Info values('SQL2008','MS SQl Server 2008',120);
insert into Module_Info values('MSBI08','MS BI Studio 2008',158);
insert into Module_Info values('SHRPNT','MS Share Point' ,80);
insert into Module_Info values('ANDRD4','Android 4.0',200);
insert into Module_Info values('EM001','Instructor',0);
insert into Module_Info values('EM001','Instructor',0);
insert into Module_Info values('EM003','Learning Effectiveness',0);
insert into Module_Info values('EM004','Environment',0);
insert into Module_Info values('EM005','Job Impact',0);
insert into Module_Info values('TM001','Attendees',0);
insert into Module_Info values('TM002','Course Material',0);
insert into Module_Info values('TM003','Environment',0);
select * from Module_Info;
select * from Associate_Info1;
insert into Associate_Info1  values('A001','Miss.','GAYATHRI NARAYANAN','Gurgaon','Java','Bachelor of Technology','Gayathri.Narayanan@hp.com','tne1@123');
insert into Associate_Info1 values('A002','Mrs.','RADHIKA MOHAN','Kerala','Java','Bachelor of Engineering In Information Technology','Radhika.Mohan@cognizant.com','tne2@123');
insert into Associate_Info1 values('A003','Mr.','KISHORE SRINIVAS','Chennai','Java','Bachelor of Engineering In Computers','Kishore.Srinivas@ibm.com','tne3@123');
insert into Associate_Info1 values('A004','Mr.','ANAND RANGANATHAN','Mumbai','DotNet','Master of Computer Applications','Anand.Ranganathan@finolex.com','tne4@123');
insert into Associate_Info1 values('A005','Miss.','LEELA MENON','Kerala','Mainframe','Bachelor of Engineering In Information Technology','Leela.Menon@microsoft.com','tne5@123');
insert into Associate_Info1 values('A006','Mrs.','ARTI KRISHNAN','Pune','Testing','Master of Computer Applications','Arti.Krishnan@cognizant.com','tne6@123');
insert into Associate_Info1 values('A007','Mr.','PRABHAKAR SHUNMUGHAM','Mumbai','Java','Bachelor of Technology','Prabhakar.Shunmugham@honda.com','tne7@123');
select * from Questions;
insert into Questions values('Q001','EM001','Instructor knowledgeable and able to handle all your queries');
insert into Questions values('Q002','EM001','All the topics in a particular course handled by the trainer without any gaps or slippages');
insert into Questions values('Q003','EM002','The course materials presentation, handson,  etc. refered during the training are relevant and useful.');
insert into Questions values('Q004','EM002','The Hands on session adequate enough to grasp the understanding of the topic.');
insert into Questions values('Q005','EM002','The reference materials suggested for each module are adequate.');
insert into Questions values('Q006','EM003','Knowledge and skills presented in this training are applicatible at your work');
insert into Questions values('Q007','EM003','This training increases my proficiency level');
insert into Questions values('Q008','EM004','The physical environment e.g. classroom space, air-conditioning was conducive to learning.');
insert into Questions values('Q009','EM004','The software/hardware environment provided was sufficient for the purpose of the training.');
insert into Questions values('Q010','EM005','This training will improve your job performance.');
insert into Questions values('Q011','EM005','This training align with the business priorities and goals.');
insert into Questions values('Q012','TM001','Participants were receptive and had attitude towards learning.');
insert into Questions values('Q013','TM001','All participats gained the knowledge and the practical skills after this training.');
insert into Questions values('Q014','TM002','The course materials presentation, handson,  etc. available for the session covers the entire objectives of the course.');
insert into Questions values('Q015','TM002','Complexity of the course is adequate for the particpate level.');
insert into Questions values('Q016','TM002','Case study and practical demos helpful in understanding of the topic');
insert into Questions values('Q017','TM003','The physical environment e.g. classroom space, air-conditioning was conducive to learning.');
insert into Questions values('Q018','TM003','The software/hardware environment provided was adequate  for the purpose of the training.');
select * from Questions;
select * from Associate_Status;
delete  from Associate_Status;
insert into Associate_Status values('A001','O10SQL','2000-12-15','2000-12-25','lovely','lovely','B001','F001');
insert into Associate_Status values('A002','O10SQL','2000-12-15','2000-12-25','lovely','lovely','B001','F001');
insert into Associate_Status values('A003','O10SQL','2000-12-15','2000-12-25','lovely','lovely','B001','F001');
insert into Associate_Status values('A001','O10PLSQL','2001-2-1','2001-2-12','lovely','lovely','B002','F002');
insert into Associate_Status values('A002','O10PLSQL',2001-2-1,2001-2-12,'lovely','lovely','B002','F002');
insert into Associate_Status values('A003','O10PLSQL','2001-2-1','2001-2-12','lovely','lovely','B002','F002');
insert into Associate_Status values('A001','J2SE',2002-8-20,2002-10-25,'lovely','Good','B003','F003');
insert into Associate_Status values('A002','J2SE','2002-8-20','2002-10-25','lovely','lovely','B003','F003');
insert into Associate_Status values('A001','J2EE','B004','F004','lovely','Good',2005-12-1,2005-12-25);
insert into Associate_Status values('A002','J2EE','2005-12-1','2005-12-25','lovely','Good','B004','F004');
insert into Associate_Status values('A003','J2EE','2005-12-1','2005-12-25','Good','Good','B004','F004');
insert into Associate_Status values('A004','J2EE','2005-12-1','2005-12-25','Good','Average','B004','F004');
insert into Associate_Status values('A005','JAVAFX','2005-12-4','2005-12-20','Average','Good','B005','F006');


0









