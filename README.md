# Smart Job Portal - Backend

## 🚀 Project Overview
Smart Job Portal Backend is built using Spring Boot.
It provides REST APIs for user registration, login, job listing, and job application management.

## 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- REST API

## 📌 Features
- User Registration
- User Login
- View All Jobs
- Apply for Jobs
- CRUD Operations for Users
- Role-based structure (USER)

## 📂 Project Structure
src/main/java → Controllers, Services, Entities  
src/main/resources → application.properties  

## ⚙️ API Endpoints

### 👤 User APIs
POST /api/users → Register User  
GET /api/users → Get All Users  
GET /api/users/{id} → Get User by ID  
PUT /api/users/{id} → Update User  
DELETE /api/users/{id} → Delete User  

### 💼 Job APIs
GET /api/jobs → Get All Jobs  

### 📝 Application APIs
POST /api/applications → Apply for Job  

## ▶️ How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Configure MySQL database
4. Run Spring Boot Application
5. Server runs on:
   http://localhost:8080

## 🔗 Frontend Repository
https://github.com/yuvasri200/SmartjobPortal-Frontend.git

---

👩‍💻 Developed by Yuvasri S

Update application.properties:
