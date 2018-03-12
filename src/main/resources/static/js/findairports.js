var apiairport = "http://localhost:8080/api/airportcontroller/";

function getAirports(){
    $.ajax({
        url: apiairport+"allairports",
        type: "get",
        success: function(data){
            $('#startairport').html("");

            $.each(data, function(index,current){
                $('#startairport').append($('<option></option>').attr("id",index).text(current.city));
                })



        }
    })
}