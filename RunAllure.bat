set ProjectPath=%~dp0
cd %ProjectPath%
echo %ProjectPath%
set p=%PATH%
java -javaagent:"%ProjectPath%libAllure\aspectjweaver-1.9.8.jar" -classpath "%ProjectPath%bin;%ProjectPath%libAllure\*;%ProjectPath%libAllureReport\*;%ProjectPath%libExtentV5\*;%ProjectPath%libLog4j\*;%ProjectPath%libWebDriverManager\*;%ProjectPath%libReportNG\*;%ProjectPath%libSelenium\*" org.testng.TestNG "%ProjectPath%bin\runNopCommerceUser.xml"
pause