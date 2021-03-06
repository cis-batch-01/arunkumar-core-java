create database LMS;
drop database LMS;
set sql_safe_updates=0;
use LMS;
CREATE TABLE `category` (`id` varchar(36) NOT NULL, `created_at` datetime NOT NULL,`updated_at` datetime NOT NULL,
  `title` varchar(255) NOT NULL, `slug` varchar(255) NOT NULL, `description` varchar(255) NOT NULL,
  `parent_id` varchar(36) DEFAULT NULL,  `enabled` tinyint NOT NULL, PRIMARY KEY (`id`),
  KEY `category_parent_id_index` (`parent_id`),  CONSTRAINT `category_parent_id_foreign` FOREIGN KEY (`parent_id`) 
  REFERENCES `category` (`id`) ON DELETE SET NULL ON UPDATE CASCADE) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

  
  
  select * from category;
  
  CREATE TABLE `image` (
  `id` varchar(36) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from image;

CREATE TABLE `organization` (
  `id` varchar(36) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `logo_id` varchar(36) DEFAULT NULL,
  `license` enum('INTERNAL','EXTERNAL','FULL','TRIAL') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `organization_logo_id_unique` (`logo_id`),
  KEY `organization_logo_id_index` (`logo_id`),
  CONSTRAINT `organization_logo_id_foreign` FOREIGN KEY (`logo_id`) REFERENCES `image` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from organization;



CREATE TABLE `user` (
  `id` varchar(36) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `address` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`address`)),
  `display_picture_id` varchar(36) DEFAULT NULL,
  `organization_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_display_picture_id_unique` (`display_picture_id`),
  KEY `user_display_picture_id_index` (`display_picture_id`),
  KEY `user_organization_id_index` (`organization_id`),
  CONSTRAINT `user_display_picture_id_foreign` FOREIGN KEY (`display_picture_id`) REFERENCES `image` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `user_organization_id_foreign` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from user;
delete from organization;


CREATE TABLE `instructor` (
  `id` varchar(36) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `bio` varchar(255) DEFAULT NULL,
  `tagline` varchar(255) DEFAULT NULL,
  `user_id` varchar(36) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `instructor_user_id_unique` (`user_id`),
  KEY `instructor_user_id_index` (`user_id`),
  CONSTRAINT `instructor_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from instructor;

  CREATE TABLE `course` (
  `id` varchar(36) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `status` enum('DRAFT','PUBLISHED','ARCHIVED','DELETED') NOT NULL,
  `duration` varchar(255) NOT NULL,
  `level` enum('BEGINNER','INTERMEDIATE','ADVANCED') NOT NULL,
  `price` int NOT NULL,
  `rating` int NOT NULL,
  `rating_count` int(11) NOT NULL,
  `instructor_id` varchar(36) DEFAULT NULL,
  `code` varchar(255) NOT NULL,
  `banner_id` varchar(36) DEFAULT NULL,
  `cover_id` varchar(36) DEFAULT NULL,
  `curriculum` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`curriculum`)),
  `visibility` enum('PUBLIC','INTERNAL') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `course_banner_id_unique` (`banner_id`),
  UNIQUE KEY `course_cover_id_unique` (`cover_id`),
  KEY `course_instructor_id_index` (`instructor_id`),
  KEY `course_banner_id_index` (`banner_id`),
  KEY `course_cover_id_index` (`cover_id`),
  CONSTRAINT `course_banner_id_foreign` FOREIGN KEY (`banner_id`) REFERENCES `image` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `course_cover_id_foreign` FOREIGN KEY (`cover_id`) REFERENCES `image` (`id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `course_instructor_id_foreign` FOREIGN KEY (`instructor_id`) REFERENCES `instructor` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from course;


  CREATE TABLE `category_courses` (
  `category_id` varchar(36) NOT NULL,
  `course_id` varchar(36) NOT NULL,
  PRIMARY KEY (`category_id`,`course_id`),KEY `category_courses_category_id_index` (`category_id`), 
  KEY `category_courses_course_id_index` (`course_id`),  CONSTRAINT `category_courses_category_id_foreign` 
  FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `category_courses_course_id_foreign` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from category_courses;

CREATE TABLE `course_pre_requisites` (
  `course_1_id` varchar(36) NOT NULL,
  `course_2_id` varchar(36) NOT NULL,
  PRIMARY KEY (`course_1_id`,`course_2_id`),
  KEY `course_pre_requisites_course_1_id_index` (`course_1_id`),
  KEY `course_pre_requisites_course_2_id_index` (`course_2_id`),
  CONSTRAINT `course_pre_requisites_course_1_id_foreign` FOREIGN KEY (`course_1_id`) REFERENCES `course` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `course_pre_requisites_course_2_id_foreign` FOREIGN KEY (`course_2_id`) REFERENCES `course` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from course_pre_requisites;

CREATE TABLE `course_students` (
  `course_id` varchar(36) NOT NULL,
  `user_id` varchar(36) NOT NULL,
  PRIMARY KEY (`course_id`,`user_id`),
  KEY `course_students_course_id_index` (`course_id`),
  KEY `course_students_user_id_index` (`user_id`),
  CONSTRAINT `course_students_course_id_foreign` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `course_students_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from course_students;

CREATE TABLE `migrations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `executed_at` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

select * from migrations;

CREATE TABLE `payment` (
  `id` varchar(36) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `provider` varchar(255) NOT NULL,
  `ref` varchar(255) NOT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from payment;

CREATE TABLE `role` (
  `id` varchar(36) NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `active` tinyint(1) NOT NULL,
  `default` tinyint(1) NOT NULL,
  `organization_id` varchar(36) DEFAULT NULL,
  `key` varchar(255) NOT NULL,
  `permissions` text DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_organization_id_index` (`organization_id`),
  CONSTRAINT `role_organization_id_foreign` FOREIGN KEY (`organization_id`) REFERENCES `organization` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from role;

CREATE TABLE `user_roles` (
  `user_id` varchar(36) NOT NULL,
  `role_id` varchar(36) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `user_roles_user_id_index` (`user_id`),
  KEY `user_roles_role_id_index` (`role_id`),
  CONSTRAINT `user_roles_role_id_foreign` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_roles_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

select * from user_roles;

show tables;




