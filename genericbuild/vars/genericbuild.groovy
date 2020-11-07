def call(Map config[:]) {
    node {
        stage('SCM') {
            echo 'Gathering code from version control'
            git branch: '${branch}', url: 'https://github.com/JaimeSalas/jenkins-groovy.git'
        }

        stage('Build') {
            try {
                echo 'Building...'
                sh 'dotnet build ./console-app-1/ConsoleApp1'
                echo 'Building new feature'
                releasenotes(changes:"true")
            } catch (ex) {
                echo 'Something went wrong'
                echo ex.toString();
                currentBuild.result = 'FAILURE'
            } finally {
                // cleanup
            }
        }
        
        stage('Test') {
            echo 'Testing...'
        }
        
        stage('Deploy') {
            echo 'Deploying...'
        }
    }
}
