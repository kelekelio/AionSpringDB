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
                sh "chmod +x gradlew"
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh "chmod +x gradlew"
                sh './gradlew test'
            }
        }
    }
}