In Spring Boot Applications, you'd want to use the Factory Pattern under the following scenarios:
1. When constructing objects with lots of fields from another object (also with a lot of fields)
2. If the object you are creating requires a lot of `@Autowired` dependencies. This helps avoid the need for the
   Client (i.e. the class that is calling/using this Factory) to define these `@Autowired` dependencies themselves.

The Factory class will typically be `@Autowired` into the Client class.