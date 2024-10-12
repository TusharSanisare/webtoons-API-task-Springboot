# Webtoons API

## Overview

The Webtoons API is a Spring Boot application that manages a collection of webtoons inspired by the characters from "Top 14 Castle Swimmer Characters." This RESTful API allows users to fetch, add, and delete webtoon entries, ensuring a smooth interaction through secure and optimized endpoints.

## Features

- **Fetch Webtoons**: Retrieve a list of webtoons or a specific webtoon by ID.
- **Add Webtoons**: Create new webtoon entries with necessary details.
- **Delete Webtoons**: Remove webtoon entries by ID.
- **Authentication**: Secure access to the API using JWT-based authentication.
- **Input Validation**: Validate inputs to ensure data integrity.
- **Rate Limiting**: Prevent abuse by limiting the number of requests.

## Technologies Used

- Java
- Spring Boot
- PostgreSQL (or MongoDB)
- JWT (JSON Web Tokens)
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- PostgreSQL or MongoDB
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:
   git clone https://github.com/TusharSanisare/webtoons-API-task-Springboot.git 


2. Navigate to the project directory:
   cd webtoons-API-task-Springboot

4. Configure your database settings in application.properties:
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password

5. Build the project using Maven:
   mvn clean install

6. Run the application:
   mvn spring-boot:run

API Endpoints:
- GET /api/webtoons: Get a list of all webtoons
- GET /api/webtoons/{id}: Get a webtoon by ID
- POST /api/webtoons: Add a new webtoon
- DELETE /api/webtoons/{id}: Delete a webtoon by ID

###Example Requests:
- Fetch all webtoons:
  GET /api/webtoons

- Add a new webtoon:
  POST /api/webtoons
  Content-Type: application/json
  {
        "description": "An Ghost ride",
        "writer": "Wendy Lian Martin",
        "created_date": "Aug 21 2024",
        "subtitles": [
            {
                "subtitle": "funny joni ",
                "image": "url",
                "description": "Beacon of hope"
            },
            {
                "subtitle": "Hugyye plays double",
                "image": "url",
                "description": "bahubali killer"
            }
        ]
    }

- Delete a webtoon:
  DELETE /api/webtoons/{id}

Security:
- Ensure that all sensitive data is protected.


Author:
Tushar Sanisare
- GitHub: https://github.com/TusharSanisare
- LinkedIn: https://www.linkedin.com/in/tusharsanisare
