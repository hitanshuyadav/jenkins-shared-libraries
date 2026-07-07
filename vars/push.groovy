def call(){
  echo "pushing image to dockerhub started"
  withCredentials([usernamePassword(
    credentialsId:"jenkinsCred"
    "usernameVariable":"dockerhubusername"
    "passwordVariable":"dockerhubpassword"
  )])
  sh '''
  docker login -u ${dockerhubusername} -p ${dockerhubpassword}
  docker image tag todo-app:latest ${dockerhubusername}/todo-app:latest
  docker push ${dockerusername}/todo-app:latest
  '''
}
