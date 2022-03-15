use Ams;
/* 1. Write a query to display the names of all administrators (role Admin) sorted by name in 
ascending order.*/
select user.name,role.name from user 
join role on role.id=user.role_id
where role.name="admin" order by user.name asc;
select * from role;
select * from user;

select u1.name as UserName,r1.name as Role from user as u1
join role as r1 on r1.id=u1.role_id
where r1.name="admin" order by u1.name asc;
/*2.Write a query to display the names of all alumni (role Alumni) sorted by name in descending 
order.*/
select user.name,role.name from user 
join role on role.id=user.role_id
where role.name="alumni" order by user.name desc;
/*3.Write a query to display the names of all degrees offered by 'CSE' department, sorted in 
ascending order.*/
select * from department;
select * from degree;
select degree.NAME from degree join department on department.id=degree.DEPARTMENT_ID
where department.name="cse" order by department.NAME  asc;
/*4.Write a query to display the name of the department offering the degree 'BSC_CT'.*/
select * from  degree;
select * from department;
select department.NAME,degree.name from  department
join degree on degree.DEPARTMENT_ID=department.id where degree.NAME="BSC_CT";
/*5.Write a query to display the names of all female alumni (role Alumni), sorted in order*/
select user.name from user 
join role on role.id=user.role_id
join profile on profile.id=user.id
where role.name="alumni" and gender='female' order by NAME asc;
select * from user;
select * from profile; 
select * from role;
select * from user;
/*6.Write a query to display the name of all Alumni from BSC_CT 2008 batch, sorted by name.*/
select user.name from user 
join role on role.id= user.role_id
join profile on profile.id = user.PROFILE_ID
join degree on degree.id=profile.DEGREE_ID
where profile.batch="2008" and degree.name="BSC_CT" order by user.name;

/*7.Write a query to display the name of all Alumni of 2008 batch from CSE department, sorted by name.*/
select user.name from user;
select * from profile;
select * from role;
select * from department;
select user.name from user 
join role on role.id= user.role_id
join profile on profile.id = user.PROFILE_ID
join degree on degree.id=profile.DEGREE_ID
join department on department.id=degree.department_id
where profile.batch="2008" and department.NAME="cse" and role.name="alumni" order by user.NAME ;

/*8.Write a query to display the entire contents of the table after performing a left join on role table 
and user table, sorted by role name and then by name of the user.*/
select * from user 
left outer join 
role on role.id=user.role_id order by role.name,user.NAME;
/*9.Write a query to display the user name and role of all users, sorted by name of the user.*/
select user.name,role.name from user 
join role on role.id=user.role_id order by user.name; 
/*10.Write a query to display the phone number, emailid, batch, department, designation and the currently working company name of 'Ram'.*/
select * from user;
select * from profile;
select * from experience;
select * from degree;
select user.PHONENUMBER,user.EMAILID,profile.BATCH,department.NAME, profile.DESIGNATION from user
join profile on user.PROFILE_ID=profile.id
join degree on degree.ID=profile.DEGREE_ID
join department on department.id=degree.department_id
join experience on experience.profile_id=profile.id where user.NAME="ram";
/*11. Write a query to display the name and skillset name of all alumni users (role - 'Alumni'), sorted 
by name and then by skillset name.*/
select * from user;
select * from skill;
select * from profile_skills;
select * from role;
select user.name,skill.NAME,role.NAME from user
join role on user.ROLE_ID=role.id
join profile on user.PROFILE_ID=PROFILE.ID
join profile_skills on profile.ID=profile_skills.PROFILE_ID
join skill on profile_skills.SKILL_ID=skill.id where role.NAME="alumni";
/*12. Write a query to display the name and all company names in which they have worked of all 
alumni users(role - 'Alumni') who have been employed or are employed, sorted by name and 
then by company name.*/
select * from role;
select * from user;
select * from experience;
select* from profile;
select user.name,experience.company_name from user
join role on user.ROLE_ID=role.id
join profile on user.profile_id=profile.id
join experience on user.profile_id=experience.id
 where role.name="alumni"  order by user.name and experience.company_name;
/*13. Write a query to display the name and the company name in which they are working of all 
alumni users(role - 'Alumni'), sorted by name of the user.(Include alumni users who are currently 
working only).*/
select user.name,experience.company_name, experience.current from user
join role on user.ROLE_ID=role.id
join profile on user.profile_id=profile.id
join experience on user.profile_id=experience.profile_id
where role.name="alumni" and experience.current="1"
order by user.name and experience.company_name;
 /*14.  Write a query to display the name and the company name in which they are currently working of 
all alumni users(role - 'Alumni') from 2008, sorted by name. [Include users who are currently 
working only]*/
select user.name,experience.company_name,profile.batch,role.name from user
join role on user.ROLE_ID=role.id
join experience on user.profile_id 
join profile on profile.id=user.profile_id where current="1" and role.name="alumni" and batch="2008";
/*15. Write a query to display the name, email id, phone number and address of all alumni(role -
'Alumni') users who have filled in their profile, sorted by name.*/
select user.name,user.emailid,user.phonenumber,profile.address,role.name from user
join role on user.id=role.id
join profile on user.PROFILE_ID=profile.id
join degree on degree.ID=profile.DEGREE_ID
join department on department.id=degree.department_id
join experience on experience.profile_id=profile.id where role.name="alumni" group by user.name;
/*16. Write a query to display the name, email id, phone number and address of all alumni(role -
'Alumni') users from 2008 batch, sorted by name.*/
select user.name,user.emailid,user.phonenumber,profile.address,role.name, profile.batch from user
join role on user.id=role.id
join profile on user.PROFILE_ID=profile.id
join degree on degree.ID=profile.DEGREE_ID
join department on department.id=degree.department_id
join experience on experience.profile_id=profile.id where role.name="alumni" and batch="2008"group by user.name;
/*17. Write a query to display the name, email id, phone number and address of all alumni(role -
'Alumni') users from 'BSC_CT', sorted by name.*/
select user.name,user.emailid,user.phonenumber,profile.address, degree.name from user
join role on user.id=role.id
join profile on user.PROFILE_ID=profile.id
join degree on degree.ID=profile.DEGREE_ID
join department on department.id=degree.department_id
join experience on experience.profile_id=profile.id where degree.name="BSC_CT";
/*18. Write a query to display the name, email id, phone number and address of all alumni(role -
'Alumni') users from 'CSE' department, sorted by name.*/
select user.name,user.emailid,user.phonenumber,profile.address from user
join role on user.id=role.id
join profile on user.PROFILE_ID=profile.id
join degree on degree.ID=profile.DEGREE_ID
join department on department.id=degree.department_id
join experience on experience.profile_id=profile.id where role.name="alumni";
/*19. Write a query to display the name of the alumni users(role - 'Alumni') who have done higher 
studies in other colleges / universities and the University(s) in which the user has done higher 
studies, sorted by name and then by University.*/
select user.name,higher_degree.university_name from user
join role on user.role_id=role.id
join profile on user.PROFILE_ID=profile.id
join degree on degree.ID=profile.DEGREE_ID
join department on degree.department_id=department.id
join higher_degree on profile.id=higher_degree.profile_id
join experience on experience.profile_id=profile.id
where role.name="alumni" order by user.name,higher_degree.university_name;

/*20. rite a query to display the name of the alumni users(role - 'Alumni') from 'CSE' department 
who have done higher studies in other colleges / universities and the University(s) in which the 
user has done higher studies, sorted by name and then by University.*/
select user.name,higher_degree.university_name from user
join role on user.id=role.id
join profile on user.PROFILE_ID=profile.id
join degree on degree.ID=profile.DEGREE_ID
join department on department.id=degree.department_id
join higher_degree on department.id=degree.department_id
join experience on experience.profile_id=profile.id where role.name="alumni" and department.name="cse" order by user.name;






