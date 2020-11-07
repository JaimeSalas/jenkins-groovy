node {
    stage('SCM') {
        echo 'Gathering code from version control'
        echo 'Building new feature'
    }

    stage('Build') {
        echo 'Building...'
        sh 'dotnet --version'
        sh 'dotnet build ./console-app-1/ConsoleApp1'
        echo 'Building new feature'
    }
    
    stage('Test') {
        echo 'Testing...'
    }
    
    stage('Deploy') {
        echo 'Deploying...'
    }
}