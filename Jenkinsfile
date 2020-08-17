pipeline {
  agent none
  stages {
    stage('Maven Install') {
      agent {
              docker {
                image 'maven:3.5.0'
              }
            }
      steps {
              sh 'mvn clean install'
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
                    withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: '79101A5s.', usernameVariable: 'hugogamaliel')]) {
                    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
                    sh 'docker push hugogamaliel/jpa-clientes-spring'
                  }
        }
      }
  }