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