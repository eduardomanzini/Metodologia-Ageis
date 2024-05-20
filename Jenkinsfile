pipeline {
    agent any

    stages {
        stage('Clonar repositório') {
            steps {
                // Clonar o repositório do GitHub
                git 'https://github.com/eduardomanzini/Metodologias-geis.git'
            }
        }
        stage('Construir') {
            steps {
                // Construir o projeto com Gradle
                sh './gradlew build'
            }
        }
        stage('Testes') {
            steps {
                // Executar testes se necessário
                sh './gradlew test'
            }
        }
        stage('Implantar') {
            steps {
                // Implantar a aplicação se necessário
                // Por exemplo: sh './gradlew deploy'
            }
        }
    }
}
