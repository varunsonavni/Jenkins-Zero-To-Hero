def call(Map config = [:]) {

pipeline {
    
    agent any 
    
    environment {
        IMAGE_TAG = "${BUILD_NUMBER}"
    }
    
    stages {


        stage('Call from Share Library'){
            steps{
                scriptFun()
            }
        }

        stage('Call from Share Library with custom value'){
            steps{
                scriptRepoName("varun@varun","20")
            }
        }

        stage('Call from Share Library with any arguments 1-2-3 or many'){
            steps{
                customPara(name:"varun", surname:"sonavni")
            }
        }

        // stage('Call from Share Library with any arguments 1-2-3 or manyff'){
        //     steps{
        //         diffStage()
        //     }
        // }
        // diffStage(name:"varun", surname:"sonavni")
        // diffStage()




        stage('pipeline step'){
            steps{
                script{
                    sh '''
                    echo 'In jenkins file'
                    
                    '''
                }
            }
        }

        }
    }



}