node ('master')
{

    git poll: true, url: 'https://github.com/karthikpaidi/testrrepo1.git'
    stage 'delete all existing file'
    sh 'rm -rf *'
    stage 'clone git repo'
    sh 'git clone https://github.com/karthikpaidi/testrrepo1.git'
    stage 'copy to dockerbuild directory'
    sh 'cp testrrepo1/karthik.html /dockerbuilds'
    stage 'build new docker images'
    sh 'sudo docker build -t finale /dockerbuilds/.' 
    stage 'artifactory'
    def server = Artifactory.newServer url: 'http://35.160.144.59:8081/artifactory', username: 'admin', password: 'Karthik@546'
    def buildInfo = Artifactory.newBuildInfo()
    buildInfo.env.capture = true
    server.publishBuildInfo(buildInfo)
}
