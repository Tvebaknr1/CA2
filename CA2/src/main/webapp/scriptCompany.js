$(document).ready(function () {
    showAll();
});

function showAll()
{
    $("#showAll").click(function () {

        $.getJSON("api/person/all", function (json)
        {
            for (var i = 0; i < json.length; i++) {

                tr = $('<tr/>');
                tr.append("<td>" + json[i].firstName + "</td>");
                tr.append("<td>" + json[i].lastName + "</td>");
                tr.append("<td>" + json[i].email + "</td>");
                tr.append("<td>" + json[i].address + "</td>");
                $('table').append(tr);
                console.log(json[i].firstName);
            }

        });
    });

}