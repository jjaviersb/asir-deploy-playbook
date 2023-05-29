pipeline {
    agent any
    
    folder('ASIR_DEPLOY') {
        job('FULL') {
            steps {
                sh '''
                    pipenv install
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml
                '''
            }
        }
        
        job('LOCALHOST') {
            steps {
                sh '''
                    pipenv install
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags localhost
                '''
            }
        }
        
        job('INSTALL_PACKAGES') {
            steps {
                sh '''
                    pipenv install
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags install
                '''
            }
        }
        
        job('VBOX') {
            steps {
                sh '''
                    pipenv install
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags vbox
                '''
            }
        }
        
        job('IAWE') {
            steps {
                sh '''
                    pipenv install
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags iawe
                '''
            }
        }
        
        job('BBDD') {
            steps {
                sh '''
                    pipenv install
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags bbdd
                '''
            }
        }
        
        job('VEYON') {
            steps {
                sh '''
                    pipenv install
                    pipenv run ansible-galaxy install -r requirements.yml
                    pipenv run ansible-playbook main.yml --tags veyon
                '''
            }
        }
    }
}
