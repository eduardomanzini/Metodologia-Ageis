pipeline {
    agent any
    stages {
        stage('Clonar repositório') {
            steps {
                git branch: 'main', url: 'https://github.com/eduardomanzini/Metodologias-geis.git'
            }
        }
        stage('Construir') {
            steps {
                sh 'chmod +x gradlew'  // Garante a permissão de execução no ambiente Jenkins
                sh './gradlew build'
            }
        }
        stage('Testar') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
