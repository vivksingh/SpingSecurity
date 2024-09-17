# Spring Boot Security Application

This project is an introductory Spring Boot application to learn about Spring Security. It implements JWT (JSON Web Token) authentication, role-based authorization, password encoding, and other basic security features. The goal is to provide a secure foundation for future applications by covering essential security concepts.

## Features

- **JWT Authentication:** Users receive a token upon successful login, which is used to access protected routes.
- **Role-Based Authorization:** Different roles (e.g., Admin, User) with specific access to resources (Currently implementing user only).
- **Password Encoding:** Secure user passwords stored using BCrypt encoding.
- **Basic Security Features:** Protection against common security threats such as CSRF, XSS, and more.
  
## Technologies Used

- **Java 17**
- **Spring Boot 3.x**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **Maven**
- **PostgresSQL database (for development and testing)**

## Project Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/vivksingh/SpingSecurity.git
   cd SpringSecurity
    ```
2. Configure PostgreSQL Database: Update the application.properties or application.yml with your PostgreSQL configuration:
    ```bash
    spring.datasource.url=jdbc:postgresql://localhost:5432/your-database-name
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    ```
3. Run the application: Make sure you have PostgreSQL running, then run the application using Maven:
    ```bash
    mvn spring-boot:run
    ```
4. Access the Application: You can access your API at http://localhost:8080.

5. Postman or Swagger for API Testing: Use tools like Postman or Swagger to test the authentication and secured endpoints.


