pipeline {
    agent any
    triggers {
            pollSCM '*/20 * * * *'
        }
    tools {
            maven 'maven 3.8.1'
        }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}