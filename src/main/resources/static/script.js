function validateLogin() {
    var userValue = document.forms["loginForm"]["username"].value;
    var pwValue = document.forms["loginForm"]["password"].value;
    
    if(userValue == null || userValue == "") {
        document.getElementsByClassName( "errorMessageUser" )[0].style.visibility = "visible";
        document.getElementsByClassName( "errorMessageUser" )[0].innerHTML ="<font color='red'>"+  "Please enter an username"+ "</font>";

        if(pwValue == null || pwValue == "") {

            document.getElementsByClassName( "errorMessagePw" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessagePw" )[0].innerHTML = "<font color='red'>"+ "Please enter a password"+ "</font>";
        }
    
    return false;
    } 
    else {
        return true;
    }

}


function validateAccount() {
    var username = document.forms["accountForm"]["username"].value;
    var password = document.forms["accountForm"]["password"].value;
    var confirmPw = document.forms["accountForm"]["confirmPw"].value;
    var firstName = document.forms["accountForm"]["firstName"].value;
    var lastName = document.forms["accountForm"]["lastName"].value;
    var streetName = document.forms["accountForm"]["streetName"].value;
    var zipCode = document.forms["accountForm"]["zipCode"].value;
    var phoneNum = document.forms["accountForm"]["phone"].value;
    
    if(username == null || username == "") {
        document.getElementsByClassName( "errorMessageUser" )[0].style.visibility = "visible";
        document.getElementsByClassName( "errorMessageUser" )[0].innerHTML = "<font color='red'>"+ "Please enter an username"+ "</font>";
    

        if(password == null || password == "") {

            document.getElementsByClassName( "errorMessagePw" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessagePw" )[0].innerHTML = "<font color='red'>"+ "Please enter a password"+ "</font>";
        }

        if (confirmPw !== password) {
            document.getElementsByClassName( "errorMessageConfirm" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageConfirm" )[0].innerHTML = "<font color='red'>"+ "Your passwords must match!"+ "</font>";
        }

        if(confirmPw == null || confirmPw == "") {

            document.getElementsByClassName( "errorMessageConfirm" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageConfirm" )[0].innerHTML = "<font color='red'>"+ "Please confirm the password!"+ "</font>";
        }

        if(firstName == null || firstName == "") {

            document.getElementsByClassName( "errorMessageFn" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageFn" )[0].innerHTML = "<font color='red'>"+ "Please enter a first name"+ "</font>";
        }

        if(lastName == null || lastName == "") {

            document.getElementsByClassName( "errorMessageLn" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageLn" )[0].innerHTML = "<font color='red'>"+ "Please enter a last name"+ "</font>";
        }

        if(streetName == null || streetName== "") {

            document.getElementsByClassName( "errorMessageSt" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageSt" )[0].innerHTML = "<font color='red'>"+ "Please enter a street name"+ "</font>";
        }

        if(zipCode == null || zipCode == "") {

            document.getElementsByClassName( "errorMessageZip" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageZip" )[0].innerHTML = "<font color='red'>"+ "Please enter a zip code"+ "</font>";
        }

        if(phoneNum == null || phoneNum == "") {

            document.getElementsByClassName( "errorMessagePhone" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessagePhone" )[0].innerHTML = "<font color='red'>"+ "Please enter a phone number"+ "</font>";
        }
    
    return false;
    } 


    else {
        return true;
    }

}

function validatePayment() {
    var creditCardNum = document.forms["paymentForm"]["creditCardNum"].value;
    var cvv = document.forms["paymentForm"]["cvv"].value;
    var cardholderName = document.forms["paymentForm"]["cardholderName"].value;
    var expDate = document.forms["paymentForm"]["expDate"].value;
    
    if(creditCardNum == null || creditCardNum == "") {
        document.getElementsByClassName( "errorMessageCreditCardNum" )[0].style.visibility = "visible";
        document.getElementsByClassName( "errorMessageCreditCardNum" )[0].innerHTML = "<font color='red'>"+ "Please enter your credit card number" + "</font>";

        if(cvv == null || cvv == "") { 

            document.getElementsByClassName( "errorMessageCvv" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCvv" )[0].innerHTML = "<font color='red'>"+"Please enter cvv number"+ "</font>";
        }

        if(cardholderName == null || cardholderName == "") {

            document.getElementsByClassName( "errorMessageCardholderName" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCardholderName" )[0].innerHTML = "<font color='red'>"+"Please enter your name that is on the credit card"+ "</font>";
        }        

        if(expDate == null || expDate == "") {

            document.getElementsByClassName( "errorMessageDate" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageDate" )[0].innerHTML = "<font color='red'>"+"Please enter a date"+ "</font>";
        } 
    
    return false;
    } 
    else {
        return true;
    }

}


