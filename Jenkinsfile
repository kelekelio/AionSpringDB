pipeline {
    agent any
    triggers {
            pollSCM '*/20 * * * *'
        }
    tools {
            maven 'maven 3.8.1'
        }
    stages {
        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}