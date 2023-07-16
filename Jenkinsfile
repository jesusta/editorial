pipeline {
    agent {
        docker {
            image 'maven:latest'
            args '-v /root/.m2:/root/.m2' // Monta el directorio .m2 en el contenedor para compartir las dependencias descargadas
        }
    }

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
