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