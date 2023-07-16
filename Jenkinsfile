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
                sh "./mvnw clean package -DfinalName=${env.JAR_NAME}"
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

        stage('Deploy') {
            steps {
                sh "java -jar target/${env.JAR_NAME}.jar"
            }
        }
    }
}
