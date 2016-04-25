docker.build('navigtours-build').inside('-v /home/jenkins/.ssh:/root/.ssh') {
                sh 'git config --global user.email "jenkins@code-troopers.com" && git config --global user.name "Jenkins"'
                sh 'gulp deploy'
}
