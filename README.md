# Tour de France 2022 Rest-API.

This project is my backend for my exam project 2022. It is a full-stack application build in Java, with the Spring framework and a MYSQL database.

There is Postman Script included for testing CRUD in the docs/postman folder.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/Tour-de-france-2022-eksamen/Tour-de-france-rest-api.git
```

**2. Create Mysql database**
```bash
create database tourdefrance2022
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`
+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Run the Rest-API using maven**

```bash
Run/compile app in your local IDE

or

mvn spring-boot:run
```
The app will start running at <http://localhost:8080>

## Explore Rest APIs
  
## Rest-API endpoints
  The app defines following CRUD APIs.

### Teams



| Method | Url                                 | Description                    | Sample Valid Request Body    |
|--------|-------------------------------------|--------------------------------|------------------------------|
| GET    | /teams	                             | Read all teams                 |                              |
| GET    | /teams/{id}	                       | Read team by id                |                              |



### Riders


| Method | Url                                 | Description                    | Sample Valid Request Body    |
|--------|-------------------------------------|--------------------------------|------------------------------|
| GET    | /riders                             | Read all riders                |                              |
| GET    | /riders/orderbytime                 | Read all riders order by time  |                              |
| GET    | /riders/{teamid}/riders             | Read all riders by team        |                              |
| GET    | /riders/{Id}                        | Read rider by id               |                              |
| POST   | /ridersriders                       | Create rider                   |                              |
| PUT    | /riders{id}                         | Update rider by id             |                              |
| DELETE | /riders{Id}                         | Delete rider by id             |                              |

  
## Contributors

This is a solo-project for my exam build and developed by:

* [@jeppe-t](https://github.com/jeppe-t) 👊🏻👨🏻‍💻
