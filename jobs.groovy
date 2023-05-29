folder('ASIR_DEPLOY') {
  stage('FULL') {
    steps {
      script {
        pipenvInstall()
        ansiblePlaybook('main.yml')
      }
    }
  }

  stage('LOCALHOST') {
    steps {
      script {
        pipenvInstall()
        ansiblePlaybook('main.yml --tags localhost')
      }
    }
  }

  stage('INSTALL_PACKAGES') {
    steps {
      script {
        pipenvInstall()
        ansiblePlaybook('main.yml --tags install')
      }
    }
  }

  stage('VBOX') {
    steps {
      script {
        pipenvInstall()
        ansiblePlaybook('main.yml --tags vbox')
      }
    }
  }

  stage('IAWE') {
    steps {
      script {
        pipenvInstall()
        ansiblePlaybook('main.yml --tags iawe')
      }
    }
  }

  stage('BBDD') {
    steps {
      script {
        pipenvInstall()
        ansiblePlaybook('main.yml --tags bbdd')
      }
    }
  }

  stage('VEYON') {
    steps {
      script {
        pipenvInstall()
        ansiblePlaybook('main.yml --tags veyon')
      }
    }
  }

  def pipenvInstall() {
    sh 'pipenv install'
  }

  def ansiblePlaybook(tags) {
    sh "pipenv run ansible-galaxy install -r requirements.yml"
    sh "pipenv run ansible-playbook main.yml --vault-password-file=.vault --tags $tags"
  }
}
