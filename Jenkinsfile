pipeline {
    agent any
    tools { maven 'maven3' }

    stages {
        stage('Checkout') {
            steps { checkout scm }
        }
        stage('Build') {
            steps { sh 'mvn -B clean compile' }
        }
        stage('Test') {
            steps {
                // Não derruba o build quando um teste falha; o step junit marca como UNSTABLE
                sh 'mvn -B test -Dmaven.test.failure.ignore=true'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    recordCoverage(tools: [[parser: 'JACOCO', pattern: 'target/site/jacoco/jacoco.xml']])
                }
            }
        }
    }
}
