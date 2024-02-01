# Jenkins Spring App

## Overview

This repository contains the source code for the Jenkins Spring App.

## Building the Docker Image

To build the Docker image for the Jenkins Spring App, follow these steps:

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/Nonelela4980/jenkins-spring-app.git
    cd jenkins-spring-app
    ```

2. Build the Docker image using the following command:

    ```bash
    docker build -t jenkins-spring-app:0.0.1 .
    ```

   This command will build the Docker image with the specified name and tag.

## Running the Docker Container

After building the Docker image, you can run the container with the following command:

```bash
docker run -p 8081:8081 jenkins-spring-app:release-0.0.1-SNAPSHOT
