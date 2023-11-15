pipeline {
    environment {
        registry = "pranathi2207/swe645-ast3-image-fin:latest"
        registryCredential = 'Dockerhub'
        DOCKERHUB_PASS = credentials('Dockerhub')
        TIMESTAMP = new Date().format("yyyyMMdd_HHmmss")
    }
    agent any

    stages{

            stage('Build survey page') {
                steps {
                    script {
                        sh 'rm -rf *.war'
                        sh 'jar -cvf SWE645-Ast3.war .'
                        sh 'echo ${BUILD_TIMESTAMP}'
                        
                         docker.withRegistry('',registryCredential){
                            def customImage = docker.build("pranathi2207/swe645-ast3-image-fin:latest-${env.TIMESTAMP}")
                        }
//}

                        sh 'echo ${BUILD_TIMESTAMP}'

//                         sh "docker login -u Nagasumukh -p ${DOCKERHUB_PASS}"
//                         def customImage = docker.build("nagasumukh/newestimg:${env.TIMESTAMP}")

                   }
                }
            }

            stage('Push to Docker Hub') {
                steps {
                    script {
                        docker.withRegistry('',registryCredential){
                          sh "docker push pranathi2207/swe645-ast3-image-fin:latest-${env.TIMESTAMP}"
                       }
//                         sh 'docker push nagasumukh/newestimg:${env.TIMESTAMP}'
                    }
                }
            }

          stage('Deploying Rancher to single node') {
             steps {
                script{
                    sh "kubectl set image deployment/deploynp container-0=pranathi2207/swe645-ast3-image-fin:latest-${env.TIMESTAMP}"
//                    sh 'kubectl set image deployment/deploymain container-0=nagasumukh/newestimg:${env.TIMESTAMP}'
                }
             }
          }

//         stage('Deploying Rancher to Load Balancer') {
//            steps {
//               script{
//                   sh "kubectl set image deployment/deploylb container-0=pranathi2207/swe645-ast3-image-fin:${env.TIMESTAMP}"
// //                  sh 'kubectl set image deployment/deploylb container-0=nagasumukh/newestimg:${env.TIMESTAMP}'
//               }
//            }
        //}
    }
}
