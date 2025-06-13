node('linux')
{
  stage ('Poll') {
    checkout([
      $class: 'GitSCM',
      branches: [[name: '*/main']],
      doGenerateSubmoduleConfigurations: false,
      extensions: [],
      userRemoteConfigs: [[url: 'https://github.com/zopencommunity/Findasioport.git']]])
  }
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/zopencommunity/Findasioport.git'), string(name: 'PORT_DESCRIPTION', value: 'Asio C++ Librrary[D[D[D[D[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~[3~' ), string(name: 'BUILD_LINE', value: 'STABLE') ]
  }
}
