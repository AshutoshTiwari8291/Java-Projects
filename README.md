# Java Learning and Projects

# RestFul Web Services (restful-web-services-j17) - 
This is having APIs related to the solcial media application where I have created two entities as User and Posts. Here below you can find what are the APIs:

# URLs
Basic Resources <br/>
  http://localhost:8080/hello-world<br/>
  http://localhost:8080/hello-world-bean<br/>
  http://localhost:8080/hello-world/path-variable/Ashutosh<br/>
  http://localhost:8080/users<br/>
  http://localhost:8080/users/1<br/>
  
JPA Resources<br/>
  http://localhost:8080/jpa/users<br/>
  http://localhost:8080/jpa/users/1<br/>
  http://localhost:8080/jpa/users/10001/posts<br/>
  
Filtering<br/>
  http://localhost:8080/filtering<br/>
  http://localhost:8080/filtering-list<br/>
  
Actuator<br/>
  http://localhost:8080/actuator<br/>
  
Versioning<br/>
  http://localhost:8080/v1/person<br/>
  http://localhost:8080/v2/person<br/>
  http://localhost:8080/person<br/>
params=[version=1]<br/>
  http://localhost:8080/person<br/>
  params=[version=2]<br/>
  http://localhost:8080/person/header<br/>
  headers=[X-API-VERSION=1]<br/>
  http://localhost:8080/person/header<br/>
  headers=[X-API-VERSION=2]<br/>
  http://localhost:8080/person/accept<br/>
  produces=[application/vnd.company.app-v1+json]<br/>
  http://localhost:8080/person/accept<br/>
  produces=[application/vnd.company.app-v2+json]<br/>
  
Swagger<br/>
  http://localhost:8080/swagger-ui.html<br/>
  http://localhost:8080/v3/api-docs<br/>
  
H2-Console<br/>
  http://localhost:8080/h2-console<br/>
  
HAL Browser<br/>
  http://localhost:8080<br/>
