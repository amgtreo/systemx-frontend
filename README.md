
![Logo](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/th5xamgrr6se0x5ro4g6.png)


# SystemX - Frontend

This application holds the frontend for SystemX.


## Features

- Now support theme colors
- Field deep color progression
- Added support for webviews
- Added support for Java 11


## Installation

Steps to configure systemx-frontend locally
- Install NodeJS https://nodejs.org/es/download/

```bash
  #Installing sass
  npm install -g sass
```

Is required to have installed and configured:
- Java 11
- MAVEN
- PostgreSQL
- Your favorire  IDE


```bash
# Installing Primefaces Omega
  mvn install:install-file -Dfile=<jar_path> -DgroupId=org.primefaces.omegamenu -DartifactId=omega-menu -Dversion=4.1.0 -Dpackaging=jar
```

## Run Locally

Clone the project

```bash
  git clone https://github.com/amgtreo/systemx-frontend.git
```

Go to the project directory

```bash
  cd systemx-frontend
```

Install dependencies

```bash
  mvn clean install
```

Start the server

```bash
  mvn spring-boot:run
```


# Hi, I'm amgtreo! 👋


## 🛠 Skills
Java, Kotlin, Python... 
