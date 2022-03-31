/*1. Write a query to display all the available course categories?*/

select title,description,created_at from category;

/*2.write a query to get the Organization title and website Address.*/

select name,website from Organization;
select * from role;

/*3.write a query to get coursename, count of students in each course*/

select * from course;
select * from course_students;
select course.title,count(user_id) as Count from course
join course_students as cs on course.id=cs.course_id
group by course.title;

/*4. write a query to get username ,email, role of all the users*/
select * from user;
select * from user_roles;
select * from role;
select first_name,last_name,email,role.title from user
join user_roles on user_roles.user_id=user.id
join role on role.id=user_roles.role_id;

/*5. write a query to show the all the sub categiries of category 'frontEnd';*/

select * from category where parent_id in (select id from category where title="front-end");

/*6.write a query to show the name of the course,no of Students in course java*/

select * from course;         
select * from course_students;
select course.title,count(user_id)Student_List from course
join course_students as cs on course.id=cs.course_id where title="java";

/*7.write a query to show all the course details of Back End*/

select * from category where  title="back-end";

/*8.Write a query to show the payment details*/



/*9.Write a query to course name and instructor name*/

select * from instructor;
select * from role;
select * from course;
desc course;
select * from user;
select * from organization;

select title,user.first_name from course
join instructor on  course.instructor_id=instructor.id
join user on instructor.user_id=user.id;

/*10.Write a query to get all the course under 20,000.*/

select course.price from course where price<20000;

/*11.write a query to fetch all the corses for the user from organization org05*/

select * from course
join course_students on course_students.course_id=course.id
join user on user.id=course_students.user_id 
join organization on user.organization_id=organization.id
where organization.id="org05";

/*12.write a query to display only the admins name and email ,permissions*/
select user.first_name,user.email,role.permissions from role join organization on role.organization_id=organization.id
join user on organization.id=user.organization_id where role.title="student";
/*13.write a query to display all  courses published and its category name*/
select course.status,category.title from course
join category_courses as cc on course.id=cc.course_id
join category on cc.category_id=category.id
where course.status="draft";
/*14.write a query to display all advanced courese*/
select course.title from course where level="advanced";
/*15.write a query to display instructor name and email ,teaching the biginner level courses*/
select  user.first_name,user.email from  user 
 join instructor on  instructor.user_id= user.id
 join course on course.instructor_id=instructor.id where course.level="BEGINNER";
 /*/15.write a query to display instructor name and email ,teaching the biginner level courses*/

select  user.first_name,user.email from  user 
 join instructor on  instructor.user_id= user.id
 join course on course.instructor_id=instructor.id where course.level="BEGINNER";
 /*15.write a query to display instructor name and email ,teaching the biginner level courses*/

select  user.first_name,user.email from  user 
 join instructor on  instructor.user_id= user.id
 join course on course.instructor_id=instructor.id where course.level="BEGINNER";
 /*16.write a query to fetch all the course for user from org01*/
select * from user; 

select user.id,user.first_name from course
 join course_students on course_students.course_id=course.id
join user on user.id=course_students.user_id 
join organization on user.organization_id=organization.id
where organization.id="org01";

 /*17.write a query to show all the subcategory name and its courses for 'backend'*/
 
 select * from category where parent_id in (select id from category where title="back-end");
 select * from course
 desc course
 where visibility =
(select if(license='internal' || license='external','public','internal')  );



select * from course;
select * from organization;
select * from course_students;
select course.visibility,organization.license from course
 join course_students on course_students.course_id=course.id
join user on user.id=course_students.user_id 
join organization on user.organization_id=organization.id;
select * from user
join course_students on user.id=course_students.user_id
join course on course_students.course_id=course.id
join organization on user.organization_id=organization.id
where organization.license="full"||organization.license="trail";

select * from course;
select * from organization;

select * from course
 join course_students on course_students.course_id=course.id
join user on user.id=course_students.user_id 
join organization on user.organization_id=organization.id;


