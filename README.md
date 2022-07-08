#Freeletics Assignment 

#####Part I : Use Selenium WebDriver 

Overview
  
 Open freeletics website in a chrome browser and select the QA Engineer job post. Validate the role description , 
 job responsibilities, profile and click to apply now. And also check form page should open in other tab.
 
#####Code Structure
 1. open eclipse : Version: 2022-06 (4.24.0)
 2. Create Maven project : File-->-->New-->Project-->Maven Project
 3. Maven Project structure created at extreme left side of the eclipse under project explorer.
 4. Created base class : includes browser detail.
 5. Created commonMethod class under helper package : include methods like the QA Engineer job post , role description and many more 
 as given above under overview.
 6. Created main class 
 7. Run the scenarios with testng
 
 
 
##### How To Run from command Line
 1. install Maven in Window PC
 2. set the environment variable by(creating MAVEN_HOME and add the maven path and under PATH name give the  maven path till bin)
 3. command line check for maven version: mvn -version
 4. in command line go to your test folder(command cd <test folder path> press enter /or open test folder and then open the command line
 5. mvn clear
 6. mvn test
 
 
 
  
#####Specific Information 
1. Java version "18.0.1.1" 
2. Testng dependency added in pom.xml
3. Selenium java dependency added in pom.xml





#####Part II : Taking the Appium
 
 1.Which parts of the code you provided would need to be adapted to run the same
   tests in an Android phone, using the same browser, in the tool you chose?
   
Answer:set capabilities
such as: UD ID, mobile name, mobile version, platform version, name of the browser/
modify the set capabilities to run the test case 

2.How could we run these tests in a physical android phone connected to your laptop?
Does the laptop need any extra software/hardware to run them properly?

Answer: 
Andriod studio
need to set path in environment variable: such as bin and platform tool(Andriod studio)
need appium
ADB(Android Debug Bridge) this need to check connection is establish with machine and phone
using command prompt

3.What would be the main changes if the website was now part of a hybrid android
app?

Answer:
Switch :
should be in native view
hybrid: things need to change and check
hybrid work with application(app) and also use browser 
need to switch in mobile and web

4.And if it was a native app?

Answer:
check for .apk or app package and app activity
launch appium:
connection established
check for set capabilities list
pass url
  
  