var apiairplane = "http://localhost:8080/api/airplanecontroller/";

function addAirplane(){

     //Get values from input texts
        var inputAirplaneName = $("#name").val();
        var inputAirplaneType = $("#type").val();
        var inputAirportId = $("#startairport").children(":selected").attr("id");

            //Put in a object
            var airplaneObject = {
            	name : inputAirplaneName,
            	type : inputAirplaneType,
            	airport_id : inputAirportId
            };

            var airplane = JSON.stringify(airplaneObject);
        //Communicate with Java
        $.ajax({
        	url : apiairplane + "addairplane",
        	type : "post",
        	data : airplane,
        	contentType: "application/json",
        	success : function(id,data){

                        //Maak de velden leeg
                        $("#name").val("");
                        $("#type").val("");
                        getAirplanes();


                    }
                })




}