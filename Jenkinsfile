pipeline {
    agent {
        node {
            label 'Linux_Default' //Сборка должна происходить на централизованных агентах из пула Linux_Default
        }
    }
    stages {
        stage('Build') {
            steps {
                withMaven(maven: 'Maven 3.5.2', mavenSettingsFilePath: 'settings.xml') {  //Используется maven environment Подробнее https://plugins.jenkins.io/pipeline-maven/
                    sh 'mvn clean install' //Выполняется сборка проекта
                }
            }
        }
    }
    post {
        always {
            cleanWs disableDeferredWipeout: true, deleteDirs: true //Очистка workspace Подробнее https://jenkins.io/doc/pipeline/steps/ws-cleanup/
        }
    }
}