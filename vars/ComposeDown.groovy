def call(){
    step([$class: 'DockerComposeBuilder', option: [$class: 'StopAllServices']])
}