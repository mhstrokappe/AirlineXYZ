function getAirplanes(){
    $.ajax({
        url: apiairplane+"allairplanes",
        type: "get",
        success: function(data){
            $('#airplaneselect').html("");

            $.each(data, function(index,current){
                $('#airplaneselect').append($('<option></option>').attr("id",index).text(current.name));
            })
        }
    })
}

$(document).ready(function(){
    getAirplanes();

})