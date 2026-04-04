# 🚀 CI/CD Pipeline for Dockerized Spring Boot Application

## 📌 Project Overview

This project demonstrates a complete CI/CD pipeline for a Spring Boot application using AWS and Docker. It automates the build and deployment process, ensuring faster and reliable updates.

---

## 🧠 Key Features

* 🔄 Automated build using AWS CodeBuild
* 🐳 Containerization using Docker
* ☁️ Cloud deployment on AWS EC2
* 🔁 Auto deployment using cron-based pull mechanism
* 🌐 Live application accessible via public IP

---

## 🏗️ Architecture

```
Local → GitHub → AWS CodeBuild → EC2 → Docker → Browser
```

---

## ⚙️ Tech Stack

* Java (Spring Boot)
* Docker
* AWS CodeBuild
* AWS EC2
* Git & GitHub

---

## 🔄 Workflow

1. Developer pushes code to GitHub
2. AWS CodeBuild triggers automatically (CI)
3. EC2 instance pulls latest code using cron job
4. Docker rebuilds and redeploys the application
5. Updated application is available on browser

---

## 📂 Project Structure

```
cicd-demo/
├── src/
├── Dockerfile
├── buildspec.yml
├── deploy.sh
├── pom.xml
```

---

## 🚀 Setup Instructions

### 1️⃣ Clone Repository

```
git clone https://github.com/Vivacity5X/cicd-demo.git
cd cicd-demo
```

### 2️⃣ Build & Run Locally (Docker)

```
docker build -t cicd-demo .
docker run -p 8080:8080 cicd-demo
```

---

## ☁️ AWS Deployment

### EC2 Setup

* Launch EC2 instance (Ubuntu)
* Install Docker
* Clone repository
* Run deploy script

### Deploy Script

```
./deploy.sh
```

---

## 🔁 Auto Deployment (Cron Job)

```
*/2 * * * * /home/ubuntu/cicd-demo/deploy.sh
```

---

## 🌍 Access Application

```
http://<EC2_PUBLIC_IP>:8080
```

---

## 🎥 Demo Video

👉 Click below to watch the live demo of the project:

🔗 [Watch Demo Video](https://drive.google.com/file/d/1R0geif3B0dyjyH032L_xVWbFq7s9wsUw/view?usp=sharing)

---

## 🌐 Live Application

👉 Access the deployed application here:

http://EC2_PUBLIC_IP:8080


## 🎯 Learning Outcomes

* Understanding CI/CD pipelines
* Working with AWS services
* Docker containerization
* Cloud deployment strategies
* Debugging real-world DevOps issues

---

## 🗣️ 

"I implemented a CI/CD pipeline using GitHub and AWS CodeBuild for continuous integration, and a pull-based deployment strategy on EC2 using Docker for continuous deployment."

---

## 🚀 Future Improvements

* Use AWS ECR for image storage
* Implement full automated deployment (push-based)
* Add monitoring using CloudWatch

---

## 👨‍💻 Author

Chaitanya Khandare 
