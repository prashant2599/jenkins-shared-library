define call() {
    pipeline {
        agent any

        stages {
            stage('Build Docker Image') {
                steps {
                    echo 'Hello I am Deploying the Docker Image'
                }
            }
        }
    }
}