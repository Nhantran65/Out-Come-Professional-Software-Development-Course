## This is the link to access to Postman Tutorial

## This is step by step to test API with Postman

# Test CRUD API Endpoints with Postman following these steps below:

http://localhost:8082/sign-up

Body content:
{
    "email": "demo@gmail.com",
    "password" : "nhan25102ds0d04",
    "firstname" : "Nhan",
    "lastname" : "Tran",
    "role" : "user"
}

http://localhost:8082/authenticate

{
    "email": "demo@gmail.com",
    "password" : "nhan25102ds0d04"
}

http://localhost:8082/story/all

http://localhost:8082/story?id=2

http://localhost:8082/story/delete?id=2

http://localhost:8082/story/add

{
    "user_id": 1,
    "title": "New Story Title",
    "content": "This is the content of the new story.",
    "image": "http://example.com/image.jpg"
}


http://localhost:8082/story/update?id=2

{
    "user_id": 1,
    "title": "Updated Story Title by Author is Nhan Tran",
    "content": "This is the updated content of the story.",
    "image": "http://example.com/updated_image.jpg"
}
