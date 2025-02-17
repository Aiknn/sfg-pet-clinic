# Pet Clinic Project

### Creating The Project
* create repo on GitHub (add gitignore file Java) and copy the GitHub link
* go terminal and cd to projects workplace 
* terminal - git clone link from GitHub
* go IDE - new project - Spring Initializer - new project
* change folder to the one we created while cloning (don't cd to folder created by cloning, just make names the same)
* choose JAR + check java version
* select dependencies:
    * Spring Boot devTools
    * Lombok
    * Spring Web
    * Thymeleaf
    * MySQL Driver
    * H2 Database
    * Spring Boot Actuator
    * Spring Data JPA
* start project and download maven files (if not auto enabled)

### Git
* git add .
* git commit -m "your message"
* git push

### Task Tracking 
* go in GitHub repo 
* issues - new issues 
* when commit just type - git commit -m "Pojo create. Closes #2". So issue #2 will be closed in github.

### Project starting
* create model
  * create package 'model' and add entities
  * put @Getter and @Setter annotations 
* create multi module maven build
  * click project - new module - new module - project name
  * create 2 modules (pet-clinic-data & pet-clinic-web)
  * migrate info to pet-clinic-data
    * model package with all files  
    * move to pom next dependencies for h2database, mysql, projectlombok + all plugins
    * add to pom - properties - spring-boot.repackage.skip - true
  * migrate info to pet-clinic-web
    * main application file
    * resources folder with all files 
    * test folder with all files 
    * move to pom next dependencies - pet-clinic-data, actuator, thymeleaf, web, devtools
* adding maven release plugin 
  * go to root POM and add plugin
    * groupId: org.apache.maven.plugins
    * artifactId: maven-release-plugin
    * version: 3.0.1
    * configuration:
      * goals: install
      * autoVersionSubmodules: true
  * go to root POM and add
    * scm: 
      * developerConnection: scm:git:https://github.com/Aiknn/sfg-pet-clinic.git
  * commit all changes
  * mvn clean
  * mvn release:prepare
  * mvn release:perform
* service lair 
  * pet-clinic-data (package: services)
  * create interfaces for all models (example below)
    * Owner findById(Long id); 
    * Owner save(Owner owner); 
    * Set<Owner> findAll();
