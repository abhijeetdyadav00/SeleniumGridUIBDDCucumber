pipeline {
    agent any

    stages {
        stage('Making infra up') {
            steps {
                   sh "docker-compose up -d chrome selenium-hub"
                     }
        }

        stage('Executing the code on Chrome') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true -DcliBrowser=Chrome test"
            }
                post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/cucumberreport/report.html', body: '''<div style="font-family: Arial, sans-serif; line-height: 1.6;">
  <h2 style="color: #2E86C1;">🚀 Project Name: <span style="color: #1ABC9C;">Execution of a project</span></h2>
  
  
  
  <p>
    <strong>Description:</strong><br>
    <span style="color: #34495E;">
      This project is responsible for the automated build and test <strong>AwesomeApp</strong> application.
      It integrates with GitHub, runs regression tests, performs static analysis, and have an attachment with this email.
    </span>
  </p>

  <hr style="border-top: 1px dashed #ccc;">

  <h3 style="color: #8E44AD;">📦 Things to remember</h3>
  <ul style="color: #2C3E50;">
    <li>🔧 Dont need to get the latest code</li>
    <li>🧪 Directly execute the test</li>
    <li>🔍 click build now button</li>
  </ul>

  <h3 style="color: #E67E22;">📅 Last Updated:</h3>

  <h3 style="color: #C0392B;">🧑‍💻 Maintainer</h3>
</div>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email notifier', to: 'abhijeetdyadav00@gmail.com abhijeetdyadav270@gmail.com'
        }
    }
        }
stage('Making infra down') {
            steps {
                sh "docker-compose down"
            }
                
        }



        }
        }