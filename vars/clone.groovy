def call(){
    echo "cloning started"
    git url: "https://github.com/hitanshuyadav/node-todo-cicd.git", branch: "master"
    echo "cloning successfull"
}
