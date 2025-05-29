# E-Commerce Backend Application

This is a Spring Boot-based E-Commerce backend API that provides basic functionalities for product management and user authentication using JWT (JSON Web Tokens).

## 🚀 Features

- 🔐 User Registration and Login with JWT Authentication
- 👤 Role-based access control (Admin, User)
- 📦 Product Management (Add, Update, Delete, View)
- 🛡️ Secure REST APIs using Spring Security
- 🧾 Request/Response DTOs for clean API structure

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA (Hibernate)
- MySQL (or H2 for testing)
- Maven

## 📂 Project Structure

src/
├── main/
│ ├── java/com/example/ecommerce/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ ├── service/
│ │ ├── security/
│ │ ├── dto/
│ │ └── EcommerceApplication.java
│ └── resources/
│ └── application.properties

## 🧪 API Endpoints

| Method | Endpoint           | Description               | Access      |
|--------|--------------------|---------------------------|-------------|
| POST   | `/auth/register`   | Register a new user       | Public      |
| POST   | `/auth/login`      | Login and get JWT token   | Public      |
| GET    | `/products`        | Get all products          | User/Admin  |
| POST   | `/products`        | Add new product           | Admin       |
| PUT    | `/products/{id}`   | Update product by ID      | Admin       |
| DELETE | `/products/{id}`   | Delete product by ID      | Admin       |

## 🔐 Authentication

All protected endpoints require an `Authorization` header:


## 📦 How to Run

```bash
# Clone the repo
git clone https://github.com/your-username/ecommerce-backend.git
cd ecommerce-backend

# Build and run the app
./mvnw spring-boot:run
📝 License
This project is for educational purposes and personal portfolio use.

🙋‍♂️ Author
Vignesh Sankar

