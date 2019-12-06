# Real-Estate-Agency-Application-using-Microservices-with-Spring-Boot-Part-1-
Real Estate Agency Application using Microservices with Spring Boot


Instead of using @Feign annotation or RestTemplate configuration :
+ Adding custom annotation -MO- to determine the relationship between entities; between local entities and external entities(ressources).
+ The custom annotation based on :
  - URI of the nested object's ressource (DB or RestAPI);
  - Name of the nested object's key;
  - Implementing the WebController
  - Autowiring the Integrator of Entities (IEntityIntegration)
  
  Example : 
  AppUser Entity :
  ![alt text](https://raw.githubusercontent.com/abdev2019/Real-Estate-Agency-Application-using-Microservices-with-Spring-Boot-Part-1-/master/AppUser%20Entity.PNG)
  
  
  Offer Entity :
  ![alt text](https://raw.githubusercontent.com/abdev2019/Real-Estate-Agency-Application-using-Microservices-with-Spring-Boot-Part-1-/master/Offer%20Entity.PNG)
  
  
  Result :
  ![alt text](https://raw.githubusercontent.com/abdev2019/Real-Estate-Agency-Application-using-Microservices-with-Spring-Boot-Part-1-/master/Result.PNG)
  
