node ('master')
{

    stage 'delete all existing file'
    sh 'rm -rf *'
    stage 'clone git repo'
    sh 'git clone https://github.com/karthikpaidi/testrrepo1.git'
    stage 'copy to dockerbuild directory'
    sh 'cp testrrepo1/karthik.html /dockerbuilds'
    stage 'build new docker images'
    sh 'sudo docker build -t finale /dockerbuilds/.'
    
}
