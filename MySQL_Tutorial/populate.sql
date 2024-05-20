USE db_tutorial;

INSERT INTO users(first_name, last_name, email, password_hash, role, profile_picture, bio)
VALUES 
('nhan', 'tran','nhan.tran@tuni.fi', '123456', 'admin', 'profile_picture_nhan', 'bio_nhan'),
('nhan', 'tran','tranhuynhdainhan25102004@gmail.com', '123456', 'user', 'profile_picture_nhan', 'bio_nhan');

INSERT INTO stories(user_id, title, content, image_url, created_at)
VALUES 
(1 , 'Story Title 1','Story Content for user 1', 'image.png', '2024-05-20 09:30:00'),
(2 , 'Story Title 2','Story Content for user 2', 'image.png', '2024-05-20 09:30:00')