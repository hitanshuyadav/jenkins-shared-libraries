def call(String image, String tag, String Hport, String Sport){
echo "deployement started"
sh '''
docker run -p "${Hport}:${Sport}" "${image}:${tag}"
'''
}
