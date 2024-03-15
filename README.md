# Assignment

**Web Application**

Prerequisites:
Before you begin, ensure you have the following installed on your system:
-MySQL workBench.
-Spring Tool suite.

After the setUp,
  Create a new SpringStarterProject with all the necessary configuaration. After the creation of the project to start the application we have main class by default in spring(**Application/src/main/java/com/example/demo/Application.java**).


1.User Input Form:
    We create a html files in Resource Folder(**Application/src/main/resources/static/sample.html**).
    By taking the new file as text and save it with fileName.html.
    In that we write a code to create a Form. 
    **main/Application/src/main/resources/static/sample.html**
  2.DataBase
    To store the data of a form in Table, we are using MySQL Workbench. After connecting to the workbench, to create a database. After        that create a table as shown below.
   ** 
    create database Test;
    use Test;
    create table Details(
    ID int auto_increment primary key,
    Name varchar(30),
    Email varChar(30),
    Age int,
    Date_of_Birth date
    );
    **

    To Connect it with spring, we have application.properties file in spring , there we need to set the configuartion with your port 
    number,username,password and DriverClass.
  **Application/src/main/resources/application.properties**.
    Once all the configurations are done,now we are connected with database.

    Next,to get the colums from table, we have to create a class and make that class as entity and give a annotation as table with the 
    table name in the database.And set all the variables and write the setter and getter for that variables.
  **Application/src/main/java/com/example/demo/Details.java**.
    From this class we are connnecting to sql table.

    To Save the data we are creating interface and extending it with JPA repository 
  **Application/src/main/java/com/example/demo/SaveInfo.java**
    And we are creating a class as controller for POST Mapping, once the form is submitted we need to save the details into the table. 
    After submitting the data, data will be store in the data Base.
  **Application/src/main/java/com/example/demo/RepoService.java**

  3. Data Retrieval:
     To get the data from the table we are creating a class and making that class as RestController.By using GetMapping we are getting 
     the data from the table and storing that in the form of List.
**Application/src/main/java/com/example/demo/GetData.java**
     The data is send back to html to display the data in table format by getting the JSON.
  **Application/src/main/resources/static/display.html**

Finally when we open the display html file in browser by using localhost(http://localhost:8080/display.html) the table is displayed with the user data.

Make sure to use the correct post number and the html file name.

    
    
