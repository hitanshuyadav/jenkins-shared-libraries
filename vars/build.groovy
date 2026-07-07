def call() {
   echo "building image"
   sh '''
   docker build -t todo-app:latest .
   '''
    echo "building succesfull"
}
