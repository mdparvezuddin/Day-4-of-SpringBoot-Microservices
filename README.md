# Day 04 – Spring Boot Single Page Navigation Demo

## Project Overview

This project demonstrates **Single Page Navigation using Spring Boot and Thymeleaf**.

The objective of this mini assignment is to understand how multiple pages or modules can be navigated through Spring MVC Controllers while rendering dynamic content on a common Thymeleaf template.

Instead of creating separate HTML pages for every section, the application dynamically updates the displayed content by passing attributes through the Spring MVC Model object.

---

# Technologies Used

* Java 17
* Spring Boot
* Spring MVC
* Thymeleaf
* Maven
* STS / Eclipse
* HTML
* CSS

---

# Project Structure

```text
SinglePageNavigationDemo

│
├── controller
│    ├── HomeController.java
│    ├── DashboardController.java
│    ├── AboutController.java
│    ├── ContactController.java
│    └── CollegeController.java
│
├── templates
│    ├── dashboard.html
│    └── StudentDetails.html
│
└── SinglePageNavigationDemoApplication.java
```

---

# Application Flow

```text
Browser
   │
   ▼

Controller

   │

Model Attributes

   │

Thymeleaf Template

   │

Rendered View
```

---

# Controllers

## Home Controller

Responsible for loading the home page.

Endpoint:

```text
/
```

Attributes Passed

```java
title = Home

message = Welcome to the school Portal Home Page
```

View Returned

```text
dashboard
```

---

## Dashboard Controller

Endpoint

```text
/dashboard
```

Attributes

```java
title = Dashboard

message = Welcome to the School Dashboard
```

View

```text
dashboard
```

---

## About Controller

Endpoint

```text
/about
```

Attributes

```java
title = model

message = This school was established in 1990.
```

View

```text
dashboard
```

---

## Contact Controller

Endpoint

```text
/contact
```

Attributes

```java
title = Contact

message = Email Us
```

View

```text
dashboard
```

---

## College Controller

Endpoint

```text
/college
```

Attributes

```java
title = model

message = Student's College Name is LPU
```

View

```text
StudentDetails
```

---

# Main Application

The project starts from:

```java
@SpringBootApplication
public class SinglePageNavigationDemoApplication
```

Execution begins using:

```java
SpringApplication.run(
SinglePageNavigationDemoApplication.class,
args
);
```

---

# Endpoints

| URL        | Description         |
| ---------- | ------------------- |
| /          | Home Page           |
| /dashboard | Dashboard           |
| /about     | About School        |
| /contact   | Contact Information |
| /college   | College Details     |

---

# Running the Project

## Step 1

Import the project into STS.

---

## Step 2

Update Maven Dependencies.

```text
Right Click Project

↓

Maven

↓

Update Project
```

---

## Step 3

Run:

```text
SinglePageNavigationDemoApplication.java
```

---

## Step 4

Open Browser

```text
http://localhost:8080/
```

---

# Sample URLs

Home

```text
http://localhost:8080/
```

Dashboard

```text
http://localhost:8080/dashboard
```

About

```text
http://localhost:8080/about
```

Contact

```text
http://localhost:8080/contact
```

College

```text
http://localhost:8080/college
```

---

# Learning Outcomes

Through this project, I learned:

* Spring MVC Controllers
* Request Mapping
* Thymeleaf Integration
* Model Object Usage
* Dynamic Content Rendering
* Single Page Navigation
* View Resolution
* MVC Architecture

---

# Day 04 Assignment Summary

This assignment demonstrates the implementation of Single Page Navigation using Spring Boot and Thymeleaf.

Different URLs are mapped to dedicated controllers, which populate data into the Model object and render it on Thymeleaf templates. This approach reduces duplication and helps maintain a clean MVC architecture.

---

# Future Enhancements

This project can be extended further by adding:

* Database Connectivity
* CRUD Operations
* Form Validation
* Session Management
* Security
* Authentication
* Responsive UI
* REST APIs

---

# Author

**Md Parvezuddin**

B.Tech CSE

Java Full Stack (Learning)

Day 04 – Spring Boot Thymeleaf Navigation Project
