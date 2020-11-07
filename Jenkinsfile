node {
    stage('SCM') {
        echo 'Gathering code from version control'
        git branch: '${branch}', url: 'https://github.com/JaimeSalas/jenkins-groovy.git'
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