# Asir-Deploy Ansible role
![Logo](logo.gif)


This ansible role installs Asir-Deploy in a Linux Mint environment. It has been tested for the following Linux Mint versions:
* Linux Mint 21

This role has been generated using the [cookiecutter](https://github.com/cookiecutter/cookiecutter) tool, you can generate a similar role that fits your needs using the this [cookiecutter template](https://github.com/idealista/cookiecutter-ansible-role).

- [Getting Started](#getting-started)
	- [Prerequisities](#prerequisities)
- [Usage](#usage)
- [Install dependencies](#install-dependencies)
- [Authors](#authors)
- [License](#license)

## Getting Started
These instructions will get you a copy the playbook in a Debian system.

### Prerequisities

Ansible 2.14.5 version installed.

## Usage

Look to the [defaults](groups_vars/main.yml) properties file to see the possible configuration properties, it is very likely that you will not need to override any variables.

## Install dependencies

```sh
$ pipenv sync
```

## Built With

![Ansible](https://img.shields.io/badge/ansible-5.2.0-green.svg)
![Molecule](https://img.shields.io/badge/molecule-3.4.0-green.svg)

## Authors

* **jjaviersb** - *Work with* - [idealista](https://github.com/idealista)

## License

![Apache 2.0 License](https://img.shields.io/hexpm/l/plug.svg)

This project is licensed under the [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0) license - see the [LICENSE](LICENSE) file for details.

