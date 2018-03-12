function getAirplanes(){
    $.ajax({
        url: apiairplane+"allairplanes",
        type: "get",
        success: function(data){
            $('#airplaneselect').html("");

            $.each(data, function(index,current){
                $('#airplaneselect').append($('<option></option>').attr("id",current.id).text(current.name));
            })
            getAirplane();
        }
    })
}

$(document).ready(function(){
    getAirplanes();

})