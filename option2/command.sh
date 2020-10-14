docker run -d -p 9999:8080
 -v wiremock/__files:/wiremock/__files
-v wiremock/mappings/:/wiremock/mappings
 --name wiremock wiremock