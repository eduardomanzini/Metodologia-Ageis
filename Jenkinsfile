pipeline {
    agent any
    stages {
        stage('Construir') {
            steps {
                git 'https://github.com/eduardomanzini/Metodologias-geis.git'
                sh './gradlew build'
            }
        }
    }
}
