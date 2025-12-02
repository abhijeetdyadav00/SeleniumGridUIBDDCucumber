pipeline {
    agent any

    stages {
        stage('Pull code from git') {
            steps {
                git credentialsId: '4aa08d17-ac63-4f37-81c6-58b2532af162', url: 'https://github.com/abhijeetdyadav00/UiBDDCucumberProject.git'
            }
        }
		stage('Executing the code'){
		    steps{
				bat 'mvn test'
			}
			
			    post { //It is inside code execution stage
                   always { 
                            emailext attachLog: true, attachmentsPattern: '/target/cucumber_report/report.html', body: '''$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS: Customized message

                            Check console output at $BUILD_URL to view the results.''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: 'abhijeetdyadav00@gmail.com abhijeetdyadav270@gmail.com'
                       }
                } //Post Ends here
		
		}
		stage('Execution end'){
			step{
				echo 'Execution is compeleted'
			}
		}
		
    }
}
