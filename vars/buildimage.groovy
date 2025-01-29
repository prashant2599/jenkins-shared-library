define call() {
    pipeline {
        agent any

        stages {
            stage('Build Docker Image') {
                steps {
                    echo 'Hello I am buiding the Docker Image'
                }
            }
        }
    }
}