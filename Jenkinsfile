pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Deliver') { 
            steps {
                sh './jenkins/scripts/deliver.sh' 
            }
        }
        stage('Docker Build') {
            agent any
            steps {
                    sh 'docker build -t hugogamaliel/jpa-clientes-spring .'
                  }
        }
        stage('Docker Push') {
            agent any
            steps {
                    sh 'docker push hugogamaliel/jpa-clientes-spring'
                  }
        }
      }
  }