function getAirplane(){
        var airplaneid = $("#airplaneselect").children(":selected").attr("id");

        console.log(airplaneid);
        $.ajax({
            url: apiairplane+"findairplane/"+airplaneid,
            type: "get",
            contentType: "application/json",
            success: function(data){
                console.log(data);
                $("#location").text(data.airport.city);
                $("#fuel").text(data.fuel);


            }
        })
    }

    $("#airplaneselect").change(function(){
        getAirplane();
    })