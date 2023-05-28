pipeline {
    agent any
    
    stages {
        stage('ASIR_DEPLOY') {
            stages {
                stage('FULL') {
                    steps {
                        sh '''
                            cd /home/javiersb/workspace/asir-deploy_playbook
                            pipenv run ansible-galaxy install -r requirements.yml
                            pipenv run ansible-playbook main.yml
                        '''
                    }
                }
                
                stage('LOCALHOST') {
                    steps {
                        sh '''
                            cd /home/javiersb/workspace/asir-deploy_playbook
                            pipenv run ansible-galaxy install -r requirements.yml
                            pipenv run ansible-playbook main.yml --tags localhost
                        '''
                    }
                }
                
                stage('INSTALL_PACKAGES') {
                    steps {
                        sh '''
                            cd /home/javiersb/workspace/asir-deploy_playbook
                            pipenv run ansible-galaxy install -r requirements.yml
                            pipenv run ansible-playbook main.yml --tags install
                        '''
                    }
                }
                
                stage('VBOX') {
                    steps {
                        sh '''
                            cd /home/javiersb/workspace/asir-deploy_playbook
                            pipenv run ansible-galaxy install -r requirements.yml
                            pipenv run ansible-playbook main.yml --tags vbox
                        '''
                    }
                }
                
                stage('IAWE') {
                    steps {
                        sh '''
                            cd /home/javiersb/workspace/asir-deploy_playbook
                            pipenv run ansible-galaxy install -r requirements.yml
                            pipenv run ansible-playbook main.yml --tags iawe
                        '''
                    }
                }
                
                stage('BBDD') {
                    steps {
                        sh '''
                            cd /home/javiersb/workspace/asir-deploy_playbook
                            pipenv run ansible-galaxy install -r requirements.yml
                            pipenv run ansible-playbook main.yml --tags bbdd
                        '''
                    }
                }
                
                stage('VEYON') {
                    steps {
                        sh '''
                            cd /home/javiersb/workspace/asir-deploy_playbook
                            pipenv run ansible-galaxy install -r requirements.yml
                            pipenv run ansible-playbook main.yml --tags veyon
                        '''
                    }
                }
            }
        }
    }
    
    post {
        success {
            echo 'El pipeline se ha ejecutado correctamente'
        }
        
        failure {
            echo 'El pipeline ha fallado'
        }
    }
}
