# Getting Started -> Mock server book


**Mock  server embedded functionality:** 

`A GET request to the root admin URL e.g http://localhost:8080/__admin will return all currently registered stub mappings`

__admin

__admin/shutdown


`The WireMock server can be reset at any time, removing all stub mappings and deleting the request log. If you’re using either of the JUnit rules this will happen automatically at the start of every test case. However you can do it yourself via a call to WireMock.reset() in Java or sending a POST request with an empty body to http://<host>:<port>/__admin/reset.`

__admin/reset

`To reset just the stub mappings leaving the request log intact send a DELETE to http://<host>:<port>/__admin/mappings.`

__admin/mappings

`Optionally limit and offset parameters can be specified to constrain the set returned e.g.`

__admin/mappings?limit=10&offset=50

**swagger**

http://{host}:{port}/__admin/swagger-ui/

**Docker:**

volume : wiremock directory


**Env set port:** 

  ~ export SPRING_MOCK_PORT=9090 
  
  ~ export MOCK_PORT=9092
  
  ~ export SPRING_MOCK_MANGEMENTPORT=9091
  

