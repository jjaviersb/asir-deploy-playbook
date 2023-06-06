# Asir-Deploy Ansible Playbook
![Logo](logo.gif)


This ansible playbook installs Asir-Deploy in a Linux Mint environment. It has been tested for the following Linux Mint versions:
* Linux Mint 21 / 21.1

## Getting Started
These instructions will get you a copy the playbook in a Debian system.

### Prerequisities

Ansible 2.14.6 version installed.
Python 3.10.6 version.
jinja 3.1.2 version.
paramiko 3.2.0 version.
passlib 1.7.4 version.

## Usage

Look to the [defaults](groups_vars/all/) properties file to see the possible configuration properties, it is very likely that you will not need to override any variables.

## Install dependencies

```sh
$ pipenv install
$ pipenv sync
$ pipenv shell
```

## Authors

* **jjaviersb** - *Work with* - [idealista](https://github.com/idealista)

