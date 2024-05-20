-- Create DB 
CREATE DATABASE IF NOT EXISTS db_tutorial;
USE db_tutorial;

-- Create a new User table: save the User Information
CREATE TABLE IF NOT EXISTS users(
	id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255) NOT NULL UNIQUE,
    password_hash TEXT NOT NULL,
    role ENUM('admin', 'user'),
    profile_picture TEXT,
    bio TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Create a new story table: save Story content
CREATE TABLE IF NOT EXISTS stories(
	id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    title VARCHAR(255),
    content TEXT,
    image_url TEXT,
    created_at DATETIME,
    
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON UPDATE CASCADE ON DELETE CASCADE 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;