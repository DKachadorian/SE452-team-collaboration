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

function validateReservation(){
    var sf = document.forms["returnCar"]["id"].value;

    if(sf == null || sf == ""){
        document.getElementsByClassName( "errorMessageEmptySearch" )[0].style.visibility = "visible";
        document.getElementsByClassName( "errorMessageEmptySearch" )[0].innerHTML = "<font color='white'>"+ "Enter a reservation number to initiate car return."+ "</font>";
        return false;
    }
    else
        return true;
}

function validateReturnForm(){
    var dateCurr = document.forms["formReturn"]["dateCurr"].value;
    //var mileage = document.forms["formReturn"]["mileage"].value;
   // var tank = document.forms["formReturn"]["tank"].value;

    if(dateCurr==null||dateCurr=="")
    {
        document.getElementsByClassName("errorMessageFirstSection")[0].style.visibility = "visible";
        document.getElementsByClassName("errorMessageFirstSection")[0].innerHTML = "<font color='white'>"+ "Date must be filled in."+ "</font>";
        return false;
    }
  /*  else if(mileage==null||mileage=="")
    {
        document.getElementsByClassName("errorMessageFirstSection")[0].style.visibility = "visible";
        document.getElementsByClassName("errorMessageFirstSection")[0].innerHTML = "<font color='white'>"+ "Mileage must be filled in."+ "</font>";
        return false;
    }
    else if(tank==null||tank=="")
    {
         document.getElementsByClassName("errorMessageFirstSection")[0].style.visibility = "visible";
         document.getElementsByClassName("errorMessageFirstSection")[0].innerHTML = "<font color='white'>"+ "Tank level must be filled in."+ "</font>";
         return false;
    } */
    else
        return true;
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
    var creditCardNum = document.forms["accountForm"]["creditCardNum"].value;
    var cvv = document.forms["accountForm"]["cvv"].value;
    var cardholderName = document.forms["accountForm"]["cardholderName"].value;
    var expDate = document.forms["accountForm"]["expDate"].value;



if (username == null || username == ""||confirmPw !== password||password == null || password == ""||confirmPw == null || confirmPw == ""
    ||firstName == null || firstName == ""||lastName == null || lastName == ""||streetName == null || streetName== ""||
    zipCode == null || zipCode == ""||phoneNum == null || phoneNum == "" || creditCardNum == null || creditCardNum == ""||
    cvv == null || cvv == ""||cardholderName == null || cardholderName == ""||expDate == null || expDate == ""){ 

    if(username == null || username == ""  ) {
        document.getElementsByClassName( "errorMessageUser" )[0].style.visibility = "visible";
        document.getElementsByClassName( "errorMessageUser" )[0].innerHTML = "<font color='red'>"+ "Please enter an username"+ "</font>";
    }
    else{
            document.getElementsByClassName( "errorMessageUser" )[0].innerHTML = "";
        }

        if(password == null || password == "") {

            document.getElementsByClassName( "errorMessagePw" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessagePw" )[0].innerHTML = "<font color='red'>"+ "Please enter a password"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessagePw" )[0].innerHTML = "";
        }

        if (confirmPw !== password) {
            document.getElementsByClassName( "errorMessageConfirm" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageConfirm" )[0].innerHTML = "<font color='red'>"+ "Your passwords must match!"+ "</font>";
            alert("passwords dont match, please make sure the passwords match!");
        }

        else{
            document.getElementsByClassName("errorMessageConfirm")[0].innerHTML = "";
        }

        if(confirmPw == null || confirmPw == "") {

            document.getElementsByClassName( "errorMessageConfirm" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageConfirm" )[0].innerHTML = "<font color='red'>"+ "Please confirm the password!"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageConfirm" )[0].innerHTML = "";
        }

        if(firstName == null || firstName == "") {

            document.getElementsByClassName( "errorMessageFn" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageFn" )[0].innerHTML = "<font color='red'>"+ "Please enter a first name"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageFn" )[0].innerHTML = "";
        }

        if(lastName == null || lastName == "") {

            document.getElementsByClassName( "errorMessageLn" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageLn" )[0].innerHTML = "<font color='red'>"+ "Please enter a last name"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageLn" )[0].innerHTML = "";
        }

        if(streetName == null || streetName== "") {

            document.getElementsByClassName( "errorMessageSt" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageSt" )[0].innerHTML = "<font color='red'>"+ "Please enter a street name"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageSt" )[0].innerHTML = "";
        }

        if(zipCode == null || zipCode == "") {

            document.getElementsByClassName( "errorMessageZip" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageZip" )[0].innerHTML = "<font color='red'>"+ "Please enter a zip code"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageZip" )[0].innerHTML = "";
        }

        if(phoneNum == null || phoneNum == "") {

            document.getElementsByClassName( "errorMessagePhone" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessagePhone" )[0].innerHTML = "<font color='red'>"+ "Please enter a phone number"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessagePhone" )[0].innerHTML = "";
        }

        
        if (creditCardNum == null || creditCardNum == "") {
            document.getElementsByClassName( "errorMessageCreditCardNum" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCreditCardNum" )[0].innerHTML = "<font color='red'>"+ "Please enter your credit card number" + "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageCreditCardNum" )[0].innerHTML =""; 
        }     
        
        if(cvv == null || cvv == "") { 

            document.getElementsByClassName( "errorMessageCvv" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCvv" )[0].innerHTML = "<font color='red'>"+"Please enter cvv number"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageCvv" )[0].innerHTML = "";
        }


        if(cardholderName == null || cardholderName == "") {

            document.getElementsByClassName( "errorMessageCardholderName" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCardholderName" )[0].innerHTML = "<font color='red'>"+"Please enter your name that is on the credit card"+ "</font>";
        }    
        
        else{
            document.getElementsByClassName( "errorMessageCardholderName" )[0].innerHTML = "";
        }

        if(expDate == null || expDate == "") {

            document.getElementsByClassName( "errorMessageDate" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageDate" )[0].innerHTML = "<font color='red'>"+"Please enter a date"+ "</font>";
        } 
        else{
            document.getElementsByClassName( "errorMessageDate" )[0].innerHTML = "";
        }        

    
    return false;
    } 


    else {
        console.log("validateAccountFunction");
        return true;
    }

}



function validatePayment() {
    var creditCardNum = document.forms["paymentForm"]["creditCardNum"].value;
    var cvv = document.forms["paymentForm"]["cvv"].value;
    var cardholderName = document.forms["paymentForm"]["cardholderName"].value;
    var expDate = document.forms["paymentForm"]["expDate"].value;

    
    
    if (creditCardNum == null || creditCardNum == "" ||cvv == null || cvv == ""||cardholderName == null || cardholderName == ""||expDate == null || expDate == ""){
    
        if (creditCardNum == null || creditCardNum == "") {
            document.getElementsByClassName( "errorMessageCreditCardNum" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCreditCardNum" )[0].innerHTML = "<font color='red'>"+ "Please enter your credit card number" + "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageCreditCardNum" )[0].innerHTML =""; 
        }

        if(cvv == null || cvv == "") { 

            document.getElementsByClassName( "errorMessageCvv" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCvv" )[0].innerHTML = "<font color='red'>"+"Please enter cvv number"+ "</font>";
        }

        else{
            document.getElementsByClassName( "errorMessageCvv" )[0].innerHTML = "";
        }


        if(cardholderName == null || cardholderName == "") {

            document.getElementsByClassName( "errorMessageCardholderName" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageCardholderName" )[0].innerHTML = "<font color='red'>"+"Please enter your name that is on the credit card"+ "</font>";
        }    
        
        else{
            document.getElementsByClassName( "errorMessageCardholderName" )[0].innerHTML = "";
        }

        if(expDate == null || expDate == "") {

            document.getElementsByClassName( "errorMessageDate" )[0].style.visibility = "visible";
            document.getElementsByClassName( "errorMessageDate" )[0].innerHTML = "<font color='red'>"+"Please enter a date"+ "</font>";
        } 
        else{
            document.getElementsByClassName( "errorMessageDate" )[0].innerHTML = "";
        }
    
    
    alert("form is invalid");
   return false;
}

    else {
        console.log("validatePaymentFunction");
        document.getElementsByClassName( "errorMessageCardholderName" )[0].innerHTML = "";
        alert("form has been validated");
        
        return true;
    }
   
}



