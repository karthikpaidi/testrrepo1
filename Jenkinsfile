node ('master')
{
    git poll: true, url: 'https://github.com/karthikpaidi/testrrepo1/blob/karthik-new-paidi/Jenkinsfile'
    stage 'delete all existing file'
    sh 'rm -rf *'
    stage 'clone git repo'
    sh 'git clone https://github.com/karthikpaidi/testrrepo1.git'
    stage 'copy to dockerbuild directory'
    sh 'cp testrrepo1/karthik.html /dockerbuilds'
    stage 'build new docker images'
    sh 'docker build -t finale /dockerbuilds/.'
    stage 'bye'
    
}
