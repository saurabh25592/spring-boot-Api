<!DOCTYPE html>
<html>
<head>
    <title>APIDemo - README</title>
</head>
<body>
    <h1>APIDemo</h1>
    <p>This is a demo project for Spring Boot showcasing a REST API for car-related operations.</p>

    <h2>Features</h2>
    <ul>
        <li>Buy new cars</li>
        <li>Buy old cars</li>
        <li>Car loan options</li>
        <li>Exchange existing cars</li>
    </ul>

    <h2>Project Structure</h2>
    <pre>
    src/
    ├── main/
    │   ├── java/com/example/SpringAPIHomework/
    │   │   ├── SpringApiHomeworkApplication.java
    │   │   └── mycontroller/Mycontroller.java
    │   └── resources/
    │       └── application.properties
    └── test/
        └── java/com/example/SpringAPIHomework/
    </pre>

    <h2>API Endpoints</h2>
    <ul>
        <li><strong>GET /carwale/newcar</strong> - Get a list of new cars available for purchase.</li>
        <li><strong>POST /carwale/oldcar</strong> - Get information on available old cars.</li>
        <li><strong>PUT /carwale/newCarLoan</strong> - Get details about car loans.</li>
        <li><strong>DELETE /carwale/replace</strong> - Exchange your existing car.</li>
    </ul>

    <h2>Requirements</h2>
    <ul>
        <li>Java 17</li>
        <li>Maven 3.8+ installed</li>
    </ul>

    <h2>How to Run</h2>
    <ol>
        <li>Clone the repository:</li>
        <pre>git clone https://github.com/your-repository-url.git</pre>
        <li>Navigate to the project directory:</li>
        <pre>cd APIDemo</pre>
        <li>Build the project:</li>
        <pre>mvn clean install</pre>
        <li>Run the application:</li>
        <pre>mvn spring-boot:run</pre>
        <li>Access the API at <a href="http://localhost:8080/carwale" target="_blank">http://localhost:8080/carwale</a></li>
    </ol>

    <h2>Dependencies</h2>
    <ul>
        <li><strong>spring-boot-starter-web</strong> - For building RESTful web services.</li>
        <li><strong>spring-boot-devtools</strong> - For developer tools and hot-reloading.</li>
        <li><strong>spring-boot-starter-test</strong> - For testing purposes.</li>
    </ul>

    <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>
</body>
</html>
