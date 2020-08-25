pipeline 
{
  agent none
  stages 
  {
    stage('Maven Install') 
    {
      agent 
      {
        docker 
        {
          image 'maven:3.5.0'
        }
      }
      steps 
      {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build') 
    {
      agent any
      steps 
      {
        sh 'docker build -t hugogamaliel/jpa-clientes-spring .'
      }
    }
    stage('Docker Push') 
    {
      agent any
      steps   
      {
        withCredentials([usernamePassword(credentialsId: 'dockerHub',
        passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')])
        {
          sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
          sh 'docker push hugogamaliel/jpa-clientes-spring'
        }
      }
    }
    stage('Install ecs-cli')
    {
      agent any
      steps
      {
        sh 'curl -Lo /usr/local/bin/ecs-cli https://amazon-ecs-cli.s3.amazonaws.com/ecs-cli-linux-amd64-latest'
        sh 'sudo chmod +x /usr/local/bin/ecs-cli'
        sh 'ecs-cli --version'
      }
    }
  }
}