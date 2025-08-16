# Awesome Kartikey Cineplex

## Description

Awesome Kartikey Cineplex is a web-based application designed to simulate a basic online portal for a movie theater complex (cineplex). It allows users to browse movies, view trailers, sign up for an account, and sign in. The project structure suggests functionality for booking tickets, although the core booking logic might be incomplete in the provided source.

It is built using JavaServer Pages (JSP) for the frontend rendering, standard JDBC for database interaction with a MySQL backend, and Apache Ant for building the project, likely developed using the NetBeans IDE.

## Features

- **User Authentication:** Sign Up for new users and Sign In for existing users.
- **Movie Browsing:** View lists of running and upcoming movies (categorized by Bollywood/Hollywood).
- **Movie Categories:** Browse movies based on predefined categories.
- **Trailers:** View movie trailers (displays movie posters, actual video playback might require further implementation).
- **Homepage:** Features a simple image slider.
- **Support Page:** Provides contact information and a basic contact form/FAQ section.
- **Database Interaction:** Connects to a MySQL database to fetch and potentially store data (users, movies, etc.).

## Tech Stack

- **Frontend:** HTML, CSS, JSP (JavaServer Pages), JavaScript (basic)
- **Backend:** Java (Core), JDBC (Java Database Connectivity)
- **Database:** MySQL
- **Build Tool:** Apache Ant
- **Web Server/Servlet Container:** GlassFish (as configured in project files), or any Java EE compatible server (e.g., Apache Tomcat).
- **IDE (Project Origin):** NetBeans IDE

## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK):** Version 1.7 or higher.
- **Apache Ant:** Build tool for Java projects.
- **MySQL Server:** Database for storing application data.
- **Application Server:** GlassFish, Apache Tomcat, or any other Java EE compatible servlet container.
- **NetBeans IDE (Optional):** The project is structured as a NetBeans project, making it easiest to import and run directly from the IDE.

### Database Setup

1.  Ensure your MySQL server is running.
2.  Create a database named `ostc`.
    ```sql
    CREATE DATABASE ostc;
    ```
3.  Create a MySQL user `root` with password `mysql` having privileges on the `ostc` database, OR update the database credentials in `src/java/utility/Jdbc.java`:
    ```java
    // In src/java/utility/Jdbc.java - update these lines if needed
    String url = "jdbc:mysql://localhost:3307/"; // Update host/port if necessary
    String dbName = "ostc";
    String userName = "root"; // Update username if necessary
    String password = "mysql"; // Update password if necessary
    ```
4.  **Create Tables:** The database schema (table structure) is not provided in the project files. You will need to infer the necessary tables and columns based on the JSP files and `Jdbc.java` usage (e.g., tables for users, movies, cities, categories, slots, etc.). Example tables might include:
    - `users` (userid, name, contact, email, password)
    - `movies` (mid, mname, img, director, producer, cast, language, rdate, description, trailer_url)
    - `city` (cid, cname)
    - `category` (catid, catname)
    - `hall` (hid, hname, cid)
    - `slots` (slotid, hid, mid, slot_time, date)
    - _Note: This is an inferred schema and needs adjustment based on actual application logic._

### Build

- **Using NetBeans:**
  1.  Open NetBeans IDE.
  2.  Go to `File` > `Open Project`.
  3.  Navigate to the `cineplex` project directory and open it.
  4.  Right-click the project in the Projects window and select `Clean and Build`. This will compile the source code and create a WAR file in the `dist/` directory.
- **Using Ant (Command Line):**
  1.  Navigate to the root directory (`cineplex/`) in your terminal.
  2.  Run the Ant build command:
      ```bash
      ant dist
      ```
  3.  This will compile the project and create `dist/Cineplex.war`.

### Deployment

1.  Start your Application Server (e.g., GlassFish, Tomcat).
2.  Deploy the generated `Cineplex.war` file (located in the `dist/` directory) through your server's administration console or by copying it to the server's deployment directory (e.g., `glassfish/domains/domain1/autodeploy/` or `tomcat/webapps/`).
3.  The server will automatically deploy the application.

## Usage

1.  Access the application through your browser. The URL will depend on your server configuration and the context root (likely `http://localhost:8080/Cineplex/` if deployed with default settings).
2.  The homepage (`Home.jsp`) will be displayed.
3.  Use the header menu to navigate:
    - **Home:** Main page with image slider.
    - **Trailers:** View movie posters/trailers.
    - **Support:** Access support information.
    - **Sign Up / Sign In:** Use the links in the top-right to register or log in. The forms appear on hover.
4.  Use the main menu below the slider (menu.jsp) to:
    - Browse running movies (requires selecting a city - logic might be incomplete).
    - Browse upcoming movies.
    - Browse movies by category.
    - Attempt to book a movie (requires selecting a city - logic might be incomplete).


## Known Issues / Points of Interest

- **Missing Logic:** Key backend logic files like `storeCust.jsp` (for user registration) and `validate.jsp` (for login) are not present in the repository. These must be implemented for the authentication features to work.
- **Security:** The application, in its current state, has significant security vulnerabilities. Passwords are not hashed, and the use of `java.sql.Statement` instead of `PreparedStatement` makes it susceptible to SQL Injection. This project is for demonstration purposes and is **not production-ready**.
- **Hardcoded Values:** Database credentials are hardcoded in `Jdbc.java`. This is not a recommended practice.
- **PHP Tags:** There are erroneous PHP tags (`<?php ... ?>`) in `web/menu.jsp` which should be ignored or removed as this is a Java project.
- **NetBeans Dependency:** The project is tightly coupled with the NetBeans IDE structure and its Ant build scripts.