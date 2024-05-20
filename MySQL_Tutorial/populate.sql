USE db_tutorial;

INSERT INTO users(first_name, last_name, email, password_hash, role, profile_picture, bio)
VALUES 
('nhan', 'tran','nhan.tran@tuni.fi', '123456', 'admin', 'profile_picture_nhan', 'bio_nhan'),
('nhan', 'tran','tranhuynhdainhan25102004@gmail.com', '123456', 'user', 'profile_picture_nhan', 'bio_nhan');


INSERT INTO stories (user_id, title, content, image_url, created_at)
VALUES
(1, 'Story Title 1', 'Story content for user 1', 'image1.jpg', '2024-02-20 09:30:00'),
(2, 'Story Title 2', 'Story content for user 3', 'image2.jpg', '2024-02-21 10:45:00');

INSERT INTO company
  (id, name, description, location, website, logo, industry, established, other_details)
VALUES
  (1, "TechBreeze", "Leading provider of cloud-based solutions.", "San Francisco, CA", "www.techbreeze.com", "www.techbreeze.com/logo.png", "Cloud Services", "2015-03-21", ""),
  (2, "SoftSprint", "Software development and consultancy firm.", "Austin, TX", "www.softsprint.com", "www.softsprint.com/logo.png", "Software Development", "2012-07-18", "");