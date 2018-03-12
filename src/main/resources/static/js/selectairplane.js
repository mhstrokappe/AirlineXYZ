$("#airplaneselect").change(function(){

    function getAirplane(){
        $.ajax({
            url: apiairplane+"findairplane",
            type: "get",
            success: function(data){
                var airport = data.airport;
                $("#location").val(airport.city);


            }
        })
    }



})