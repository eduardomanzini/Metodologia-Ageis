pipeline {
    agent any
    stages {
        stage('Clonar repositório Codigo Modificado') {
            steps {
                git branch: 'main', url: 'https://github.com/eduardomanzini/Metodologias-geis.git'
            }
        }
        stage('Construir Codigo Modificado') {
            steps {
                sh 'chmod +x gradlew'  // Garante a permissão de execução no ambiente Jenkins
                sh './gradlew build'
            }
        }
        stage('Testar Codigo Modificado') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
