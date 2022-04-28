def call(String rel_type){
        sh "echo RELEASE_TYPE=$rel_type >> .env"
        if(rel_type == "dev") {
                sh "echo FLASK_ENV=development"
        }
        step([$class: 'DockerComposeBuilder', option: [$class: 'StartAllServices']])
}