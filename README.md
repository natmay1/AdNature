# AdNature
Setting up your environment:

1. Download Git- https://git-scm.com/downloads
Optional: (Download Github desktop (Windows only)- https://desktop.github.com/ )

2. Download project: https://github.com/Thescienceguy/Adnature
(create github account)
-Fork AdNature repository from TheScienceGuy 
-create local adnature repository clone project into local repo

3. Download the latest compatible version of the java development kit: http://www.oracle.com/technetwork/java/javase/downloads/index.html

4. Download the latest compatible version of eclipse:
http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/europawinter

5. In eclipse, click file, import, select maven and then existing maven project, and choose Adnature\workspace folder as the directory. 

6. Download Tomcat 7.0 and setup: http://tomcat.apache.org/download-70.cgi
-Follow tutorial to set up with eclipse: http://www.coreservlets.com/Apache-Tomcat-Tutorial/tomcat-7-with-eclipse.html

7. Try running AdNature project. Right click on portal web folder and select run as… choose tomcat, which should already be set up. Go onto your web browser and type in “localhost:8080/index.htm” and the adnature website should be running! Now you can edit code and see your changes! 


Tomcat Troubleshooting:
We ran into issues starting and successfully running the Tomcat server, here is how we fixed the issue:

1. Go to Project > Clean.
2. Choose all projects and click OK. 
3. Next, Right click on any module and go to Maven > Update Project
4. Select all and press OK
5. Right click on the Portalweb module on the left, go to Properties >Deployment Assembly >Add java build path entries > Maven.
6. Go to Window >Preferences > Server >Runtime Environments. Delete the current environment and add Apache Tomcat 7.0 again.
7. Open the server in the main window of Eclipse. On the bottom, select the Modules tab.
8. Click on the server, and then edit.  Change the path from “/portalweb” to only “/”

9. Do a project clean again (steps 1 and 2) and restart the server. It should hopefully run now.





Familiarize yourself with location of content: 

common(//-):        	UI control(button, checkbox….), Exception, Log 
Allow non-programmers to access functions in code and make aesthetic changes, i.e. moving buttons, etc.

**corebiz:      	        	main business(sport, profile…..) Service
Has most services and service implementation (business logic) (sport and profile). Area to write new services. Functions are called by portalweb. Services and their implementations are written in src/main/java.

**domain:      	        	main business(sport, profile…..) DAO 
Contains SQL logic for services. Allows services to interact with the database.  In src/main/java is where the DAO is located

framework(//-):    	Utils tools(DateUtils, StringUtils…….)

mgrweb(//+):        	the back WebApp to manage website info

**portalweb:             	the front WebApp, includes css, js, all images on website, also contains java actions to send requests to server in src/main/java/com/adnature/por/action.  src/main/webapp/WEB-INF/ (view, style)

cms(//-):    	        	advertisement(indexPage,article…) service and DAO
security:                 	user(login,signup,password….) service and DAO
message(//+):       	message(email, alert, notice……..) service and DAO
 
MAIN POINTS:
Service module contains business logic function for portalweb to call
DAO module contains SQL logic function for service module to call

       (//- means the module may be deleted if not useful for development
       	//+ means the module should be added)




Service structure explained
Service is for business logic, DAO is for SQL
*Service.java is interface, *ServiceImpl.java is to implement this interface
*Repository.java is interface, * Repository.xml is to implement this interface
*Query.java is interface, * Query.xml is to implement this interface
Criteria is the parameter object for DAO function
Entity is the return object for DAO function
 
*Respository.xml contains very simple SQL, it is better to:
Findone(id)                       	select * from * where id #{id}
FindAll()                             	select * from *
FindByCriteria(criteria)   	select * from * where criteria1=#{ criteria1} and ….
Insert(object)
Update(object)
Delete(object) 

*Service is in package com.adnature.*.service
*ServiceImpl is in package com.adnature.*.service.impl
*Repository.java is in package java->com.adnature.domain*.repository
*Repository.xml is in package resource->com.adnature.domain*.repository
*Query.java is in package java->com.adnature.domain*.query
*Query.xml is in package resource->com.adnature.domain*.query
criteria is in package com.adnature.domain*.criteria
entity is in package com.adnature.domain*.entity



What we have accomplished and what we still need to work on: 
https://docs.google.com/document/d/1hnbWm9_RK6LNlxK810MIAJ8qd0whyY_zFAKHn30ZP48/edit?usp=sharing
