node ('master')
{

    stage 'delete all existing file'
    sh 'rm -rf *'
    stage 'clone git repo'
    sh 'git clone https://github.com/karthikpaidi/testrrepo1.git'
    stage 'copy to dockerbuild directory'
    sh 'cp /var/lib/jenkins/workspace/pipecode/testrrepo1/karthik.html /dockerbuilds'
    stage 'Remove old docker images'
    sh 'docker rmi -f finale'
    stage 'build new docker images'
    sh 'docker build -t finale /dockerbuilds/.'
    sleep time: 1, unit: 'MINUTES'

}
