def call() {
    echo 'Hello, I am Deploying the Docker Image'
    sh 'docker --version'
    sh 'docker build -t myimage:latest .'
}
