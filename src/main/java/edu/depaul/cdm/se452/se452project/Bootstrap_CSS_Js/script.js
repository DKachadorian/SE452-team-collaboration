
function onClickHome(){
    document.location.href="index.html";
}

function onClickFn(){
    $(document).ready(function() {
        $("#MyForm").validate({
            rules: {
                'pickUpLocation': {
                required: true,
                minlength: 2
            },
            'pickUpDate': {
                required: true,
                date:true
            },
            'pickUpTime':{
                required: true,    
            },
            'dropOffTime': {
                required: true,    
            },
            'dropOffDate': {
                required: true,
                date:true
            },

            },
            messages: {
                'pickUpLocation': "Please enter text.",
                'pickUpDate': "Please enter a date.",
                'pickUpTime': "Please enter time.",
                'dropOffTime': "Please enter time.",
                'dropOffDate': "Please enter a date.",
            }    
            }
            
            );
    });

    //Process Form
    $("#MyForm").submit(function(e){
        e.preventDefault();

    // if the form is valid - do the following - call the cars.html
    if ($("#MyForm").valid()) 
        {
            document.location.href="cars.html";            
        }                                
        });   
    }
