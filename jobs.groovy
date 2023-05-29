pipeline {
    agent any
    
    stages {
        stage('FULL') {
            steps {
                sh 'pipenv install'
                
                sh '''
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml
                '''
            }
        }
        
        stage('LOCALHOST') {
            steps {
                sh 'pipenv install'
                
                sh '''
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags localhost
                '''
            }
        }
        
        stage('INSTALL_PACKAGES') {
            steps {
                sh 'pipenv install'
                
                sh '''
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags install
                '''
            }
        }
        
        stage('VBOX') {
            steps {
                sh 'pipenv install'
                
                sh '''
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags vbox
                '''
            }
        }
        
        stage('IAWE') {
            steps {
                sh 'pipenv install'
                
                sh '''
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags iawe
                '''
            }
        }
        
        stage('BBDD') {
            steps {
                sh 'pipenv install'
                
                sh '''
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags bbdd
                '''
            }
        }
        
        stage('VEYON') {
            steps {
                sh 'pipenv install'
                
                sh '''
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags veyon
                '''
            }
        }
    }
}
