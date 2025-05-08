# Sprint-Boot-EcomAPI

A **Full Stack E-commerce Application** with a React frontend and a Spring Boot microservices backend.

---

## 📦 Project Overview

This project is designed to demonstrate a modern full-stack e-commerce system using **React** on the frontend and **Spring Boot** microservices on the backend. It integrates key enterprise patterns such as API Gateway, service discovery, centralized configuration, load balancing, JWT-based authentication, role-based access control, circuit breaking, rate limiting, health checks, and asynchronous communication.

---

## 🚀 Modules

- **User Service**
- **Order Service**
- **Product Service**

Each module is implemented as an independent microservice.

---

## ⚙️ Core Features

✅ API Gateway with **Eureka Server** for service discovery  
✅ Centralized configuration using **Spring Cloud Config**  
✅ Load balancing between services using **Spring Cloud LoadBalancer**  
✅ Global exception handling across services  
✅ Proper entity relationships among different tables  
✅ Asynchronous operations where needed  
✅ **Spring Security** and **JWT** token-based user authentication  
✅ Role-based access control for protected routes  
✅ Circuit breaker and fallback mechanisms at the Gateway level  
✅ Rate limiting and retry patterns at the Gateway level  
✅ **Spring Boot Actuator** for health checks  
✅ Asynchronous communication using **RabbitMQ**

---

## 🏗️ Architecture


---

## 💥 Advanced Patterns

- **Circuit Breaking & Fallback:** Protect services from cascading failures
- **Rate Limiting:** Control request flow at the API Gateway
- **Retry Patterns:** Improve resiliency under transient failures
- **Actuator:** Enable monitoring and health checks
- **RabbitMQ:** Handle asynchronous events and communication

---

## 🔐 Security

- **JWT Authentication** for verifying users
- **Spring Security** integration
- **Role-based access** for admin/user-specific endpoints

---

## 📈 Monitoring & Health

- Spring Boot **Actuator** endpoints for health checks
- Metrics exposure for observability tools

---

## 💡 Notes

- All microservices are independently deployable.
- Configuration management is centralized for better maintainability.
- Gateway layer handles both routing and resilience patterns.

---

## 📦 Setup Instructions (basic outline)

1. Clone this repository.
2. Set up the Spring Cloud Config server with externalized properties.
3. Run Eureka Server.
4. Start API Gateway.
5. Launch microservices: User, Order, Product.
6. Run RabbitMQ (for async communication).
7. Launch the React frontend.
8. Access the application from the React UI.

---

## 📄 Technologies Used

- **Backend:** Spring Boot, Spring Cloud, Spring Security, Eureka, Config Server, RabbitMQ, Actuator
- **Frontend:** React.js
- **Database:** (Choose appropriate DBs per service, e.g., MySQL/Postgres)

---

## 🔗 Future Enhancements

- Payment microservice
- Inventory management
- Email/SMS notifications
- Docker + Kubernetes deployment

---


