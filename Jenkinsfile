pipeline {
    agent any
    stages {
        stage('Build docker Image') {
            steps {
                script{
                    sh 'docker build -t chendocker14/springboot-app'
                }
            }
        }

    }
}