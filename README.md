<p align="center">
  <a href="" rel="noopener">
 <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-Q0WB8tei61WpihPEimyqQAGYMbi7PksLrg&s" alt="Project logo"></a>
</p>

<h1 align="center"><b>OBU Docker with Java Spring Boot</b></h1>


## 📝 Table of Contents

- What's Docker ?
- Your Maven project ( expected structure )
- Basic Dockerfile ( MOST IMPORTANT PART )
- Getting Started

## 1. What's Docker <a name = "about"></a>

Docker is just a box for your app so it runs the same everywhere.

- Builds your app into an image
- Runs that image as a container
- No need to install Java/Maven on prod server

## 2. Your Maven project ( expected structure ) <a name = "about"></a>

```
my-app/
├── pom.xml
├── src/
└── Dockerfile   👈 we’ll add this
```

## 3. Basic Dockerfile ( MOST IMPORTANT PART FOR OpenShift ) <a name = "about"></a>

```
FROM openjdk:25-ea-21-jdk-slim-bullseye
COPY ./target/*.jar /app/application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/application.jar" ]
```

## 4 Getting Started <a name = "getting_started"></a>

Make sure you have installed :
- Java JDK 21
- maven in variable path system
- Docker Desktop

### Clean and build jar with Maven
```bash
mvn clean package
```

### Docker build
- tag name : hello-world
- tag version : 1.0

```bash
docker build -t hello-world:1.0 .
```

### Check docker images

```bash
docker images
```

### Run your docker images as Container

```bash
docker run -d -p 8080:8080 --name hello-world-container hello-world:1.0
```
Open your endpoint :
```bash
http://localhost:8080/api/getting
```
Boom 💥 app running inside Docker.

### Stop / remove container

```bash
docker stop hello-world-container
docker rm hello-world-container
```


Thank you 🙏🏻

## **Sambath Reasmey**
*Junior Software Engineer | Backend & API Developer*

- 💡 **Project Initiator & Core Contributor** – Led the project from inception and remains a primary contributor  
- 🧱 **System Architecture & Technical Direction** – Designed the overall system structure and guided technical decisions  
- ☁️ **Infrastructure & Deployment** – Hands-on experience with OpenShift and containerized environments  
- 🤖 **Automation** – Built automation for build, deployment, and operational workflows  
- 🔌 **Backend APIs** – Developed and maintained scalable backend service APIs  
- 📊 **Observability & Monitoring** – Implemented monitoring and observability to ensure reliability and performance  
- 🚗 **Data Analysis** – Worked with driving pattern data and related system logic  
- 🛠️ **Continuous Improvement** – Actively maintains, optimizes, and evolves the project

GitHub: [@sambathreasmey](https://github.com/sambathreasmey) |
GitLab: [@sambathreasmey](https://gitlab.com/reasmeysambath) |
Linkedin: [@sambathreasmey](https://www.linkedin.com/in/reasmey-sambath-4b7658350) |
Telegram: [@sambathreasmey](https://t.me/sambathreasmey)
