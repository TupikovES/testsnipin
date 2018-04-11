jQuery(document).ready(function() {
var url = "http://localhost:8080/testsnipin/testreq";
alert("ready " + url);
var items = [];
$.ajax({
            type: "GET",
            url: url,
            dataType: 'json',
            success: function (data) {
                console.log("success");
                $.each( data, function( key, val ) {
                                                items.push( "<li id='" + key + "'>" + val + "</li>" );
                                              });

                                              $( "<ul/>", {
                                                "class": "my-new-list",
                                                html: items.join( "" )
                                              }).appendTo( "#test" );
            },
            error: function (xhr, status, error) {
                alert("Ошибка");
            }
        });

});