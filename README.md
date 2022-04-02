# Java 9 Modularity
Java 9 Modularity explained

MainCaller and Functionality1 are 2 independent modules of the Java Project. To make sure we can access the modules inside each other, we need to add the module-info.java file in each package either export or require that module to enable the functionality. 

The new java 9 HttpClient is present in a different module and cannot be accessed in our custom modules without mentioning in module-info file. Hence we need to mention that in whatever module needed. 
