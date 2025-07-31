# 🔗 Spring Boot URL Shortener(A Mini Backend Project)

A full-featured URL shortener web application built with **Java**, **Spring Boot**, **Thymeleaf**, and **MySQL**. Users can register, shorten URLs, manage their dashboard, and admins can manage users and URLs. Features include custom expiry, pagination, role-based access, and secure login.

---

## 🚀 Features

### 👥 User Management
- **User Registration & Login** using Spring Security
- **Role-based access** (`ROLE_USER`, `ROLE_ADMIN`)
- **Password encryption** with BCrypt

### 🔗 URL Shortening
- Shortens long URLs to short, unique keys
- Configurable **default expiry** for links
- **Validation** of original URLs (optional)
- Tracks **click counts** and expiry

### 📊 Dashboards
- **User Dashboard**: View, manage your shortened URLs
- **Admin Dashboard**: Manage all users and their URLs

### ⚙️ Pagination
- Paginated URL and user listings
- Configurable **page size** via `application.properties`

### 🔐 Security
- Integrated with **Spring Security**
- Role-based authorization
- Secure password handling

### 📦 Persistence
- **MySQL** database using **JPA/Hibernate**
- Entities: `User`, `ShortUrl`
- Repositories: `UserRepository`, `ShortUrlRepository`

### 💡 Additional
- Custom **404** and **500** error pages
- Global exception handler
- Externalized configuration with `application.properties`

---

## 🛠️ Technologies Used

- **Backend**: Java, Spring Boot, Spring Security, Spring Data JPA
- **Frontend**: HTML, CSS, Thymeleaf, BootStrap
- **Database**: MySQL
- **Build Tool**: Maven

---
##  Admin Dashboard
<img width="1919" height="722" alt="Screenshot 2025-07-31 152010" src="https://github.com/user-attachments/assets/34fd16e6-bebc-41e1-8a10-718df969b209" />


---
##  Guest View
<img width="1919" height="910" alt="Screenshot 2025-07-31 134806" src="https://github.com/user-attachments/assets/0a0d633f-0ead-4e1b-ab9e-aaadc97cc3d8" />

---
##  Login View
<img width="1919" height="902" alt="Screenshot 2025-07-31 134855" src="https://github.com/user-attachments/assets/740d2d34-562b-42c6-8b5b-7e26d066064b" />

