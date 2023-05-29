pipeline {
    agent any
    environment {
        ASNIBLE_VAULT_PASSWORD = credentials('.vault')
    }
    stages {
        stage('ASIR_DEPLOY') {
            steps {
                script {
                    sh 'pipenv install'
                    sh 'pipenv run ansible-galaxy install -r requirements.yml'
                    sh 'pipenv run ansible-playbook main.yml --vault-password-file=$ASNIBLE_VAULT_PASSWORD'
                }
            }
        }
    }
}
// groovy