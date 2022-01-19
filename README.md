# Cinema-shop
___

## Introduction

This is a prototype of a web application that works like a Cinema Theater.
Implemented two roles `ADMIN` or `USER`.
The access for endpoints depends on these roles.

## Project structure

#### The structure of this project consists of 3 levels:
* Data access layer (DAO). This layer is responsible for accessing the database. It is implemented with a Hibernate API.
* Application layer (service). This layer implements the main logic of the application.
* Presentation layer (controllers). This layer is responsible for communication with a user. It is implemented with Spring API.

#### Technologies:
* MySql
* Hibernate ORM
* Spring(Core, Web, Security)
* Apache Tomcat
* Maven
* JSON
## Opportunities depending on the role
There are two ready-made users provided for testing this application:
* username admin@i.ua with password admin123 and role `ADMIN`
* username user@i.ua with password user123 and role `USER`

You can also register a new one (POST: /register)

The admin has access to such endpoints:
* POST: /cinema-halls
* POST: /movies
* POST: /movie-sessions
* PUT: /movie-sessions/{id}
* DELETE: /movie-sessions/{id}
* GET: /users/by-email

The user has access to such endpoints:
* POST: /orders/complete
* PUT: /shopping-carts/movie-sessions
* GET: /orders
* GET: /shopping-carts/by-user

Endpoints that can be accessed by any logged-in user:
* GET: /cinema-halls
* GET: /movies
* GET: /movie-sessions/available

#### Use Postman for sending your requests during testing this application

## How to start the application

1. Install and configure Apache Tomcat(v9.0.50)
2. Install MySQL with MySQL Workbench
3. Fork this project on GitHub
4. In the /resources/db.properties file, replace the stubs with your database data
5. Run the application