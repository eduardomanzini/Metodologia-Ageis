pipeline {
    agent any
    stages {
        stage('Construir') {
            steps {
                git branch: 'main', url: 'https://github.com/eduardomanzini/Metodologias-geis.git'
                sh './gradlew build'
            }
        }
    }
}
