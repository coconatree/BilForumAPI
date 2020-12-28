Group number: g2F

Title: Bil Forum

Description: Bil forum is a desktop app that uses a Java Spring Rest API and Java Swing front end to create a forum application for Bilkent University students. 

Current status: Currently our app is working but it is not the most user-friendly app and it contains lots of minor and major bugs. 

What has been done and what is not done: 

  Login / Register sytstems are woking.
  The post / Answer system is working.
  Rest API cloud database connection is working.
  Rest API front end connection is working.
  The mailing system is working.
  The page navigation system is working.
  
  Syntax language is currently working but it has its bugs. 
  The guest user system doesn't work. 
  The search algorithm is working but it is not properly implemented.
  Latex support is not working.
  
What needs to be done:
  
  Better live support needs to be implemented.
  A relational database needs to be implemented.
  Abstraction levels for the action listeners, page changes, updates, and HTTP connection needs to be implemented.
  Improvements in the design are needed.

Members controbution:

  Emre Caniklioğlu : API controllers /  API services / Syntax Laguage / Forum Page / Post Creation Page / Main Frame / Auth Frame / CustomComponents
  primarily worked on the following files and modules;
    
    BilFoumRepo/src/Mainframe/Pages/ForumPage/
    BilFoumRepo/src/Mainframe/Pages/PostCreationPage/
    
    BilFoumRepo/src/Mainframe/MainFrameModel.java
    BilFoumRepo/src/Mainframe/MainFrameView.java
    BilFoumRepo/src/Mainframe/MainFrameController.java
    
  Can Yılmaz : Register System / Validation Libraries / Main Menu / Login Page / CustomComponents
  primarily worked on the following files and modules;
    
    BilFoumRepo/src/Mainframe/Pages/MainMenu/
    BilFoumRepo/src/AuthFrame/LoginPage/

  Mustafa Hamit Dölek : Register System / API services / Profile Page / Register Page / CustomComponents
  primarily worked on the following files and modules;
  
    BilFoumRepo/src/Mainframe/Pages/ProfilePage/
    BilFoumRepo/src/AuthFrame/RegisterPage/
    BilForumRepo/src/AuthFrame/ForgetPasswordPage/
  
  Gizem Gökçe Işık: Profile Page / Email Confirmation Page 
  primarily worked on the following files and modules;
  
    BilFoumRepo/src/Mainframe/Pages/PostPage/
    BilFoumRepo/src/AuthFrame/EmailPage/
    
Frameworks:
  
  Our rest API uses the sprig framework with the following dependencies;
  
  spring-boot-starter-web 
  spring-boot-starter-test
  spring-context-support
  spring-boot-starter-mail
  firebase-admin - version : 6.11.0
     

Libraries:  (All of the following jars can be found inside one of our two git hub repositories BilForumRepo / BilForumAPI or inside the zip file we uploaded.)
  
  Miglayout - version 3.5.5
    
  Jackson core - version 2.9.5                (API and Front-end)
  Jackson annotations - version 2.9.0         (API and Front-end)
  Jackson databind - version 2.9.5            (API and Front-end)
    
  httpclient - version 4.5.13                 (Front-end)
  httpcore - version 4.4.13                   (Front-end)
    
  commons codec - version 1.11                (Front-end)
  commons logging - version 1.2               (Front-end)
    
  jiconfont bundle - version 1.4              (Front-end)
  jiconfont open iconic - version 1.1.1.3     (Front-end)
    
  activation - no version indicated on the jar      (Front-end)
  mail - no version indicated on the jar            (Front-end)
  techsoftemail - no version indicated on the jar   (Front-end)
    
    
  Instructions:
   
    Step 1 (This step is required because currently our rest API is not deployed on a remote server hence we need to start a local server.)
   
    First clone the BilForumAPI from the GitHub to your local machine.
    Open it in your preferred ide or text editor.
    If it gives errors about the libraries please make sure that you have added the API jars and try to clean install the maven dependencies.
    Run the ApplicationDemo inside the BilForumAPI
    
    Step2
    
    Open a new folder and clone the BilForumRepo to the folder.
    Open it in your preferred ide or text editor.
    If it gives errors about the libraries please make sure that you have added the jars and your java version is at least java 11
    Run the main method inside the Main class.
    
