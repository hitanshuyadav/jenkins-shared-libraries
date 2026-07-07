def call(){
echo "deployement started"
sh '''
docker run -p 80:8000 todo-app:latest
'''
}
