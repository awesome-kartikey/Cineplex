# Frequently Asked Questions (FAQ)

**Q1: What is Awesome Kartikey Cineplex?**

A1: It's a simple Java-based web application designed as an online portal for a movie theater. It demonstrates features like user registration/login, movie browsing (running, upcoming, categories), trailer viewing, and basic support interaction. It uses JSP for the frontend and JDBC for database communication with MySQL.

**Q2: What technologies are used in this project?**

A2: The core technologies are:
* Java
* JavaServer Pages (JSP)
* Java Database Connectivity (JDBC)
* HTML, CSS, basic JavaScript
* MySQL (Database)
* Apache Ant (Build Tool)
* GlassFish / Tomcat (or similar Servlet Container)

**Q3: How do I set up the database?**

A3: 1. Install and run MySQL Server. 2. Create a database named `ostc`. 3. Ensure you have a user (e.g., `root` with password `mysql`) that can access this database. If your credentials differ, update them in `src/java/utility/Jdbc.java`. 4. You need to create the necessary tables (like `users`, `movies`, `city`, `category`, etc.). The exact schema isn't provided, so you'll need to define it based on the application's needs shown in the JSP files. See the `README.md` Setup section for a possible schema structure.

**Q4: How do I build the project?**

A4: You can build it using:
* **NetBeans IDE:** Import the project and use the `Clean and Build` option.
* **Apache Ant:** Navigate to the project's root directory in the command line and run `ant dist`.
This will produce a `Cineplex.war` file in the `dist/` directory.

**Q5: How do I run the project?**

A5: Deploy the `Cineplex.war` file (created during the build step) to a compatible Java EE application server like GlassFish or Apache Tomcat. Then access the application via your web browser (e.g., `http://localhost:8080/Cineplex/`).

**Q6: Can I actually book movie tickets with this application?**

A6: The user interface (`menu.jsp`) includes options for booking movies, and there's code to fetch show timings (`helper.jsp`). However, the core logic for handling the booking process, seat selection, payment integration, and storing booking information seems incomplete or missing from the provided files. You would need to implement these features.

**Q7: I see `<?php ... ?>` tags or `.php` references in `menu.jsp`. Does this project use PHP?**

A7: No, this is a Java/JSP project. The PHP tags (`<?php include ... ?>`) found in `web/menu.jsp` are incorrect for this context and will not work. They are likely placeholders, comments that were not properly formatted, or remnants from a different version or copy-paste error. They should be replaced with appropriate JSP includes or logic if needed.

**Q8: Is the user authentication secure?**

A8: Based on the provided code:
* The `SignIn.jsp` and `SignUp.jsp` forms handle passwords as plain text in the HTML.
* The actual validation logic (`validate.jsp`) and user storage logic (`storeCust.jsp`) are missing.
* There's no evidence of password hashing or other standard security practices like protection against SQL injection (`PreparedStatement` is not used in the provided `Jdbc.java` examples) or XSS.
* Therefore, the security is likely very basic and **not suitable for production**.

**Q9: What is the `src/java/utility/Jdbc.java` class for?**

A9: This is a utility class providing static methods to handle database interactions using JDBC. It includes methods for:
_ `getConnection()`: Establishes a connection to the MySQL database using hardcoded credentials.
_ `getStatement()`: Creates a basic `Statement` object.
_ `executeQuery()`: Executes a SELECT SQL query.
_ `executeUpdate()`: Executes an INSERT, UPDATE, or DELETE SQL query.
_ `closeConn()`, `closeStatement()`, `closeResultSet()`: Methods to close database resources.
_ _Note: This class provides basic functionality but lacks features like connection pooling and protection against SQL injection (as it uses `Statement` instead of `PreparedStatement`)._

**Q10: What is the `nbproject` directory?**

A10: This directory contains configuration files specific to the NetBeans IDE. It includes project settings, library references, private user settings, and parts of the Ant build process implementation (`build-impl.xml`). If you are not using NetBeans, this directory might not be directly relevant, though `project.properties` contains important build settings.