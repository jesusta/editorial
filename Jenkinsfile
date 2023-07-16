pipeline {
    agent any

    environment {
        JAR_NAME = 'my-editorial-app'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build2') {
            steps {
                sh "mvn clean package -DfinalName=${env.JAR_NAME}"
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                sh "java -jar target/${env.JAR_NAME}.jar"
            }
        }
    }
}
