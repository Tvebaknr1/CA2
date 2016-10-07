$(document).ready(function () {
    showAll();
    findCByCvr();
    addCompany();
});

function showAll()
{
    $("#showAll").click(function () {

        $.getJSON("api/company/all", function (json)
        {
            for (var i = 0; i < json.length; i++) {

                tr = $('<tr/>');
                tr.append("<td>" + json[i].name + "</td>");
                tr.append("<td>" + json[i].cvr + "</td>");
                tr.append("<td>" + json[i].description + "</td>");
                tr.append("<td>" + json[i].marketValue + "</td>");
                tr.append("<td>" + json[i].numEmployees + "</td>");
                $('table').append(tr);
            }

        });
    });

}

function findCByCvr()
{
    $("#byCvr").click(function () {
        var cvr = document.getElementById("cvrN").value;
        $.getJSON("api/company/cvr/" + cvr, function (json)
        {
            console.log(json);
            for (var i = 0; i < json.length; i++) {

                tr = $('<tr/>');
                tr.append("<td>" + json[i].name + "</td>");
                tr.append("<td>" + json[i].cvr + "</td>");
                tr.append("<td>" + json[i].description + "</td>");
                tr.append("<td>" + json[i].marketValue + "</td>");
                tr.append("<td>" + json[i].numEmployees + "</td>");
                $('table').append(tr);
            }

        });
    });

}
function addCompany()
{
    $("#addButton").click(function ()
    {
        var person = '{"name":"' + $("#name").val() + '","description":"' + $("#descrip").val() + '","cvr":"' + $("#cvr").val() + '","numEmployees":"' + $("#numE").val() + '","marketValue":"' + $("#mv").val() + '"}';
        console.log(person);
        $.ajax({
            url: "api/company",
            type: "POST",
            data: person,
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: function () {
                alert("Oprettet!");
            }
        });
    });
}
 