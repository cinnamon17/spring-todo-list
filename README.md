# spring-todo-list
Todo list using Spring boot framework


## Introduction

This is a simple To-Do List application built using Java and Spring Boot. The main purpose of this project is to help you organize your daily tasks and keep track of your progress.

With this application, you can easily create new tasks, mark them as completed, and delete them when you're done. You can also edit existing tasks if you need to make changes or add more details.

The application provides a simple and user-friendly interface, making it easy for you to manage your to-do list on any device. Whether you're at home, at work, or on the go, you can always access your list and stay organized.

![demo Image](https://raw.githubusercontent.com/cinnamon17/spring-todo-list/4b7d71d00c0db174715312de24cecddc64768576/src/main/resources/static/assets/demo.png)

## Requirements 

- Java 17.0.6 2023-01-17 LTS
- Javac 17.0.6

## Installing

```
git clone git@github.com:cinnamon17/spring-todo-list.git
cd spring-todo-list
```
## Configuration

Create your local configuration file beside application.properties

> local.application.properties
```
spring.datasource.url=jdbc:mysql://localhost/{yourDatabaseName}
spring.datasource.username={your-database-username}
spring.datasource.password={your-database-password}
```


## Runing the application

```
./gradlew bootrun
```

## Default route

```
http://localhost:8080/app
```
