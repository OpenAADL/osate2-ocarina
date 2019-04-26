pipeline {
    agent any
    stages {
        stage('Get Sources') { 
            steps {
                git url: 'https://github.com/OpenAADL/osate2-ocarina', branch: 'master', changelog: true
            }
        }
        stage('Build') {
            steps {
                withMaven(
                    // Maven installation declared in the Jenkins "Global Tool Configuration"
                    maven: 'MVN3',
                    // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
                    // Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
                    //mavenSettingsConfig: 'my-maven-settings',
                    mavenLocalRepo: '.repository') {
                        // Run the maven build
                        withEnv(['JENKINS_MAVEN_AGENT_DISABLED=true']) {

                        sh 'mvn -T 3 clean install -Pfull -U -Dtycho.disableP2Mirrors=true -DfailIfNoTests=false -Dspotbugs=true'
                            
                        }
                }
            }
        }
        stage('Deploy') {
        	steps {
        		sh 'bash ./deploy.sh'
        	}
        }
    }
} 
