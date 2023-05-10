def call(Map config = [:]) {
    stage('Build') {
                steps {
                    sh 'echo Buidling...........###########'
                }
            }

            stage('Test') {
                steps {
                    sh 'echo "TESTING$$$$$$$$$$$$$$$$44"'
                }
            }

            stage('Deploy') {
                steps {
                    sh 'echo "deploy%%%%%%%%%%%%%%%%"'
                }
            }
}



// def call(Map config = [:]) {
//    pipeline {
    
//     agent any 
    
//     environment {
//         IMAGE_TAG = "${BUILD_NUMBER}"
//     }
    
//     stages {


//         stage('Call from Share Library'){
//             steps{
//                 scriptFun()
//             }
//         }

//         stage('Call from Share Library with custom value'){
//             steps{
//                 scriptRepoName("varun@varun","20")
//             }
//         }

//         stage('Call from Share Library with any arguments 1-2-3 or many'){
//             steps{
//                 customPara(name:"varun", surname:"sonavni")
//             }
//         }

//         stage('pipeline step'){
//             steps{
//                 script{
//                     sh '''
//                     echo 'In jenkins file'
                    
//                     '''
//                 }
//             }
//         }

//         }
//     }
// }