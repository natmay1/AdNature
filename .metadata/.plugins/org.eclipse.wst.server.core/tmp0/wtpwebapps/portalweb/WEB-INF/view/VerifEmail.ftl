    

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

#logo {
    position: absolute;
    left:20px;


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

        <div style="background-color:white; padding-top: 30px;">
            <h1 style= font-size: 23pt; padding-top: 40px;> Hi ${(webUser.login)!}, </h1>
            <p style=padding: 30px;>Thank you for activating your account at AdNature. Please click <a style= color: #0000FF; text-decoration: none; href="${taglibs.ctx}/account/index.htm">this link</a> to verify your account. </p>
            <p>We look forward to seeing you around,<br><br>The Team at AdNature</p><br>
    
            <div class="content2">
                <img src="../style/Laurel-Creek.jpg" width=400px height=150px>
                <p style=font-size: 12pt; font-family: "calibri";>Have you been to Laurel Creek yet?</p><p style=font-size: 12pt; font-family: "calibri";><a style= color: #0000FF; text-decoration: none;>Click here to find out more</a></p>
            
            <div  background-color: #b3ffb3; height: 80px; width: 550px;>
                <img src="style/logo.png" id="logo" width=165px height=84px align=left>
                <p style= font-size:14pt; font-family: calibri; position: relative; left: 70px; top: 35px; font-weight: bold;>Making it easier for you to get outside</p>
                </div>
            </div>
        </div>
   