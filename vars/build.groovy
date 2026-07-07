def call(String image, String tag ) {
   echo "building image"
   sh """
   docker build -t "${image}:${tag}" .
   """
    echo "building succesfull"
}
