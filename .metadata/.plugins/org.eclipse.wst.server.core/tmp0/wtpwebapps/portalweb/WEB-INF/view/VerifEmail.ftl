<html>
    <head>
       <style>
       

.Content {
    position: absolute;
    right: 50%;
    background-color: #FEF2F2;
    border: 1px solid black;
    text-align: center;
    width: 550px;
    font-family: "Overlock";
    font-size: 16pt;
    transform: translate(50%);
}
h1 {
    font-size: 23pt;
    padding-top: 40px;
}
a {
    color: #0000FF;
     text-decoration: none;
}

#logo {
    position: absolute;
    left:20px;
}
#link {
    padding: 30px;
    
}
.Content2 {
     
    background-color:white;
    padding-top: 30px;

}

.laurel{
    font-size: 12pt;
    font-family: "calibri";
}
.Bottom {
    background-color: #b3ffb3;
    height: 80px;
    width: 550px;


}

#footer {
    font-size:14pt;
    font-family: calibri;
    position: relative;
    left: 70px;
    top: 35px;
    font-weight: bold;
}
</style>
        
    </head>
    <body>
        <div class="content">
            <h1> Hi ${(webUser.login)!}, </h1>
            <p id="link">Thank you for activating your account at AdNature. Please click <a href="${taglibs.ctx}/account/index.htm">this link</a> to verify your account. </p>
            <p>We look forward to seeing you around,<br><br>The Team at AdNature</p><br>
    
            <div class="content2">
                <img src="../style/Laurel-Creek.jpg" width=400px height=150px>
                <p>Have you been to Laurel Creek yet?</p><p class="laurel"><a>Click here to find out more</a></p>
            
            <div class="Bottom">
                <img src="style/logo.png" id="logo" width=165px height=84px align=left>
                <p id="footer">Making it easier for you to get outside</p>
                </div>
            </div>
        </div>
    </body>
</html>