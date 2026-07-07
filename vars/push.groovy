def call(String CredId, String tag, String image){
  echo "pushing image to dockerhub started"
  withCredentials([usernamePassword(
    credentialsId:"${CredId}",
    "usernameVariable":"dockerhubusername",
    "passwordVariable":"dockerhubpassword"
  )])
  sh """
  docker login -u "${dockerhubusername}" -p "${dockerhubpassword}"
  docker image tag todo-app:latest "${dockerhubusername}/${image}:${tag}"
  docker push "${dockerusername}/${image}:${tag}"
  """
}
