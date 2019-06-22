# ExercisePESimulator
To run the tests we need to install the Java 8 SDK and the Maven version 3.6.1. <br>
The Selenium integration to Java is set by the pom.xml and the drivers are on the root of the project. <br>
If the enviornement is set it can run on a Unix and Windows systems. <br>
To execute in a IDE set the it to run as a TestNG. <br>
In the command line run it with Maven: <br>
mvn clean install <br>
<br><br>
For tests the user <b>test1</b> was created. <br>
login: test1@mail.com <br>
pwd: 123qweasd <br>
<br>
To run the simulator test, and since I don't use the portal API to prepare the test, we need to set on the project pom file variables: <br>
\<build> <br>
        \<plugins> <br>
            \<plugin> <br>
                \<groupId>org.apache.maven.plugins</groupId> <br>
                \<artifactId>maven-surefire-plugin</artifactId> <br>
                \<configuration> <br>
                    \<systemPropertyVariables> <br>
                    (...) <br>
                    <user.name>test1</user.name> <br>
                    <user.mail>test1@mail.com</user.mail> <br>
                    <user.pwd>123qweasd</user.pwd> <br>
                    (...) <br>
                \</systemPropertyVariables> <br>
            \</configuration> <br>
        \</plugin> <br>
    \</plugins> <br>
\</build> <br>
<br><br>
Java 8u211 <br>
https://www.java.com/pt_BR/download/ <br>
<br>
Maven 3.6.1 <br>
http://maven.apache.org/download.cgi <br>
<br>
Selenium Java 3.141.59 <br>
https://www.seleniumhq.org/ <br>
<a href="https://bit.ly/2zm3ZzF">Download</a> <br>
<br>
Geckodriver 0.24.0 <br>
https://github.com/mozilla/geckodriver/releases <br>
<br>
ChromeDriver 75.0.3770.90 <br>
https://chromedriver.storage.googleapis.com/index.html?path=75.0.3770.90/ <br>
<br><br>
<h3>Parameters</h3><br>
If none of the parameters are passed, by default it will run with Firefox and NO gui (headless). <br>
<br>
<b>browser:</b> firefox/chrome <br>
<b>gui:</b> yes/no <br>
<br>
Examples <br><br>
mvn clean install -Dbrowser=chrome <br><br>
mvn clean install -Dgui=yes <br><br>
mvn clean install -browser=chrome -Dgui=yes <br>
<br><br>
<h3>Run Test or Suite</h3><br>
<b>Run Suite (class):</b> <br>
mvn clean install -Dtest=className <br><br>
<b>Run Test (method):</b> <br>
mvn clean install -Dtest=className#methodName <br><br>
<b>Just compile and run no tests:</b> <br>
mvn clean install -DskipTests <br>