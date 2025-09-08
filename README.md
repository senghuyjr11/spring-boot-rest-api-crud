# Spring Boot REST API CRUD

This repository provides a simple RESTful API for CRUD (Create, Read, Update, Delete) operations using Spring Boot and Gradle. It is designed as a foundational example for building and managing RESTful web services in Java.

## Features

- **Full CRUD Operations:** Easily create, retrieve, update, and delete data via REST endpoints.
- **Spring Boot:** Leverages Spring Boot for rapid development and simplified configuration.
- **Gradle:** Uses Gradle for build automation and dependency management.
- **Java:** Fully implemented in Java for robust and scalable web services.

## Technologies Used

- Java (100%)
- Spring Boot
- Gradle

## Getting Started

### Prerequisites

- Java 11 or above
- Gradle
- Git

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/senghuyjr11/spring-boot-rest-api-crud.git
    cd spring-boot-rest-api-crud
    ```

2. **Build the project:**

    ```bash
    ./gradlew build
    ```

3. **Run the application:**

    ```bash
    ./gradlew bootRun
    ```

4. **Access the API:**

    The API will be available at `http://localhost:8080/` (default port).

## Usage

- Interact with the API using tools like [Postman](https://www.postman.com/) or `curl`.
- Typical endpoints include:
    - `GET /items` - Retrieve all items
    - `POST /items` - Create a new item
    - `GET /items/{id}` - Get item by ID
    - `PUT /items/{id}` - Update item by ID
    - `DELETE /items/{id}` - Delete item by ID

Check the source code or controller classes for the exact endpoint paths.

## Project Structure

```
spring-boot-rest-api-crud/
│
├── src/
│   ├── main/
│   │   ├── java/          # Java source code
│   │   └── resources/     # Application configuration
├── build.gradle           # Gradle build file
├── settings.gradle        # Gradle settings
└── README.md              # Project documentation
```

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for improvements or new features.

## License

This project is licensed under the MIT License.

## Author

Maintainer: [senghuyjr11](https://github.com/senghuyjr11)

---

Feel free to reach out if you have any questions or suggestions!
