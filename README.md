to run the project locally ensure that you have mysql installed.
paste the following into the application properties
while ensuring that the fields for 
username, password and database name are changed  
///////

spring.application.name=Backend_Traini8_LeviManaseWani
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.format_sql = true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url = jdbc:mysql://localhost:3306/databasename
spring.datasource.username=username
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=8081
spring.mvc.throw-exception-if-no-handler-found=true
server.error.include-message=always

springdoc.api-docs.enabled=true
springdoc.swagger-ui.enabled=true


////
this is done as the current application.properties is configured for live deployment in an attempt to make running it easier 

locally, use postman or swagger(http://localhost:8081/swagger-ui/index.html) to view and run the project.
The list of apis created can be seen in the APiConstants file 
