# 🚀 Production-Ready CI/CD Pipeline with REST APIs using Spring Boot, Docker & AWS

## 📌 Project Overview

This project demonstrates a complete CI/CD pipeline for a Spring Boot application using Docker and AWS. It automates build and deployment, ensuring faster and reliable updates.

---

## 🧠 Key Features

* 🔄 Continuous Integration using AWS CodeBuild
* 🐳 Docker containerization
* ☁️ Deployment on AWS EC2
* 🔁 Automated deployment using cron-based pull mechanism
* 🌐 RESTful APIs with JSON responses
* ❤️ Health monitoring endpoint

---

## 🏗️ Architecture

Local → GitHub → AWS CodeBuild → EC2 → Docker → Browser

---

## ⚙️ Tech Stack

* Java (Spring Boot)
* Docker
* AWS EC2 & CodeBuild
* Git & GitHub

---

## 🔄 Workflow

1. Developer pushes code to GitHub
2. AWS CodeBuild triggers build (CI)
3. EC2 instance pulls latest code
4. Docker rebuilds and redeploys application
5. Updated application is accessible via browser

---

## 🔧 Enhancements by Me

* Designed RESTful APIs with JSON responses
* Implemented versioned endpoints (`/api/v1`)
* Added health monitoring (`/health`)
* Fixed endpoint conflicts and improved routing
* Optimized Docker configuration
* Improved deployment script with logs

---

## 🚀 API Endpoints

* `/home` → Welcome message
* `/health` → Service status
* `/api/v1/info` → App info
* `/api/v1/time` → Server time

---

## 🧪 Run Locally

```bash
mvn clean package
docker build -t cicd-demo .
docker run -p 8080:8080 cicd-demo
```

---

## 🌐 Live Application

👉 http://<EC2_PUBLIC_IP>:8080/health

---

## 🎯 Learning Outcomes

* Understanding CI/CD pipelines
* Working with AWS cloud services
* Docker containerization
* REST API design
* Real-world deployment strategies

---

## 🗣️ Explanation

"I designed and deployed a production-like CI/CD pipeline for a Spring Boot application using Docker and AWS, and enhanced it with RESTful APIs and monitoring features."
