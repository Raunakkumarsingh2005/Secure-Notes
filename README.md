# 🔐 Secure Notes

A secure note-taking application built with Spring Boot that provides robust authentication, authorization, and encrypted note management capabilities.

## 📋 Overview

Secure Notes is a full-featured web application designed to help users create, manage, and protect their notes with enterprise-grade security. The application implements role-based access control (RBAC), user authentication, and comprehensive note management features.

## ✨ Features

- **User Authentication & Authorization**
  - Secure user registration and login
  - JWT-based authentication
  - Role-based access control (Admin & User roles)
  
- **Note Management**
  - Create, read, update, and delete notes
  - Rich text support
  - Search and filter capabilities
  - Organized note categories
  
- **Security**
  - Encrypted data storage
  - Secure password handling with BCrypt
  - Protected API endpoints
  - CSRF protection
  - Session management

- **Admin Features**
  - User management
  - Role assignment
  - System monitoring

## 🛠️ Tech Stack

- **Backend Framework:** Spring Boot
- **Security:** Spring Security
- **Database:** [Database type - e.g., MySQL/PostgreSQL/H2]
- **Build Tool:** Maven
- **Java Version:** Java 17+

## 📦 Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Maven 3.6+
- [Database system] (if applicable)
- Git

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Raunakkumarsingh2005/Secure-Notes.git
cd Secure-Notes
```

### 2. Configure Environment Variables

Create a `.env` file in the root directory (or update the existing one) with the following:

```properties
# Database Configuration
DB_URL=jdbc:mysql://localhost:3306/securenotes
DB_USERNAME=your_username
DB_PASSWORD=your_password

# JWT Configuration
JWT_SECRET=your_secret_key
JWT_EXPIRATION=86400000

# Application Configuration
SERVER_PORT=8080
```

### 3. Build the Application

Using Maven wrapper:

```bash
./mvnw clean install
```

Or using Maven directly:

```bash
mvn clean install
```

### 4. Run the Application

Using Maven wrapper:

```bash
./mvnw spring-boot:run
```

Or using Maven directly:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080` (or your configured port).

## 📚 API Documentation

### Authentication Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Login and receive JWT token |
| POST | `/api/auth/logout` | Logout current user |

### Note Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/api/notes` | Get all user notes | Yes |
| GET | `/api/notes/{id}` | Get specific note | Yes |
| POST | `/api/notes` | Create new note | Yes |
| PUT | `/api/notes/{id}` | Update existing note | Yes |
| DELETE | `/api/notes/{id}` | Delete note | Yes |

### Admin Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| GET | `/api/admin/users` | Get all users | Admin |
| PUT | `/api/admin/users/{id}/role` | Update user role | Admin |
| DELETE | `/api/admin/users/{id}` | Delete user | Admin |

## 🔒 Security

This application implements multiple security layers:

1. **Password Encryption:** All passwords are hashed using BCrypt before storage
2. **JWT Authentication:** Stateless authentication using JSON Web Tokens
3. **Role-Based Access Control:** Different permissions for Admin and User roles
4. **Input Validation:** Server-side validation for all inputs
5. **SQL Injection Prevention:** Parameterized queries via JPA
6. **XSS Protection:** Content Security Policy headers

## 🏗️ Project Structure

```
Secure-Notes/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/securenotes/
│   │   │       ├── config/          # Security & app configuration
│   │   │       ├── controller/      # REST API controllers
│   │   │       ├── dto/             # Data Transfer Objects
│   │   │       ├── entity/          # JPA entities
│   │   │       ├── repository/      # Data access layer
│   │   │       ├── service/         # Business logic
│   │   │       └── security/        # Security implementations
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application.yml
│   └── test/                        # Unit and integration tests
├── .env
├── .gitignore
├── pom.xml
└── README.md
```

## 🧪 Testing

Run the test suite:

```bash
./mvnw test
```

Run with coverage:

```bash
./mvnw clean test jacoco:report
```

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Raunak Kumar Singh**

- GitHub: [@Raunakkumarsingh2005](https://github.com/Raunakkumarsingh2005)

## 🙏 Acknowledgments

- Spring Boot team for the excellent framework
- Spring Security for robust security features
- All contributors who help improve this project

## 📞 Support

If you have any questions or need help, please:

- Open an issue in the GitHub repository
- Contact the maintainer through GitHub

## 🗺️ Roadmap

- [ ] Add email verification
- [ ] Implement password reset functionality
- [ ] Add note sharing between users
- [ ] Implement note versioning
- [ ] Add export functionality (PDF, Markdown)
- [ ] Mobile application support
- [ ] Two-factor authentication (2FA)
- [ ] Dark mode support

---

⭐ If you find this project useful, please consider giving it a star on GitHub!
