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
    stage('Run Commands')
    {
      agent any
      steps
      {
        echo "Hello World!"
        sh "echo Hello from the shell"
      }
    }
  }
}