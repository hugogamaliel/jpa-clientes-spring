#!groovy
pipeline {
    agent none
   stages {     
    stage('Maven Install') {
      agent {         
       docker {          
         image 'maven:3.3.3'         
     }       
  }       
  steps {
       bat 'mvn clean install'
       }
     }
   }
 }