# Library CRUD App with Spring

This is a CRUD (Create, Read, Update, Delete) application called Library built with Spring. The application allows you to manage positions in a database by performing various operations such as adding new positions, viewing position details, updating position information, and deleting positions.

## Features

- Create a new positions: Add a new position to the library.
- View position details: Display detailed information about a specific position.
- Update position information: Modify the details of a position, such as title, description.
- Delete a position: Remove a position from the library.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf (as the template engine)
- MySQL (or any other database of your choice)

## Getting Started

Follow the instructions below to set up and run the Library CRUD app on your local machine.

### Prerequisites

- Java Development Kit (JDK) installed
- MySQL (or any other compatible database) installed and running

### Installation

1. Clone the repository to your local machine:

git clone https://github.com/vsergejevslv/library.git


2. Open the project in your preferred Java IDE.

3. Configure the database connection settings in the `application.properties` file located in the `src/main/resources` directory. Modify the following properties to match your MySQL database setup:

```properties
# PostgreSQL Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=username
spring.datasource.password=password

# Hibernate configuration
spring.jpa.database=POSTGRESQL
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

4. Run the application from your IDE or build and run it using the following command:

./mvnw spring-boot:run

Access the application by navigating to http://localhost:8080/positions in your web browser.

### Usage
The Library CRUD app provides a user interface for managing positions. You can perform the following actions:

Create: Click on the "Create New Position" button to add a new position by providing the required details in the form.
Read: Click on a position title to view its details, including the author, description.
Update: From the position details page, click on the "Edit" button to update the position's information.
Delete: From the position details page, click on the "Delete" button to remove the position from the database.

### License
The Library CRUD app is open-source and available under the MIT License. Feel free to modify and use the code according to the terms of the license.

Acknowledgements
The Library CRUD app was developed based on the concepts and principles of Spring and CRUD operations. Special thanks to the Spring community for their valuable resources and documentation.

### Contact
If you have any questions or feedback regarding the Library CRUD app, please contact me.
