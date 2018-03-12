var api = "http://localhost:8080/api/";
var selectairline;

function getAirlines(){
    $.ajax({
        url: api+"airlinecontroller/allairlines",
        type: "get",
        success: function(data){
            var airlines = "";

            $.each(data, function(index,current){
                $('#airlineselect').append($('<option>', {
                    value : current.id,
                    text: current.name
                    }));
                })



        }
    })
}

$(document).ready(function(){
    getAirlines();

})