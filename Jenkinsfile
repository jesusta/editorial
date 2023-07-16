pipeline {
    agent any
    
    environment {
        JAR_NAME = 'editorial-0.0.1-SNAPSHOT'
    }
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
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
                sh "nohup java -jar target/${env.JAR_NAME}.jar > myapp.log 2>&1 & disown"
            }
        }
    }

            post {
                success {
                    // Este bloque se ejecutará solo si la etapa 'Deploy' es exitosa
                    echo "¡La etapa de despliegue fue exitosa!"
                    // Puedes agregar aquí notificaciones, acciones adicionales, etc.
                }
                failure {
                    // Este bloque se ejecutará solo si la etapa 'Deploy' falla
                    echo "¡Error en la etapa de despliegue!"
                    // Puedes agregar aquí notificaciones, acciones de recuperación, etc.
                }
            }

}
