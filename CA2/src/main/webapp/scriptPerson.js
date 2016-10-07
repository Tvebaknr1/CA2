$(document).ready(function () {
    
    showAll();
    findPersonByPhone();
    findPersonByName();
});

function table()
{
    var th = $('<th>');
    th.append('<th>' + 'Fornavn' + '</th>');
    th.append('<th>' + 'Efternavn' + '</th>');
    th.append('<th>' + 'E-mail' + '</th>');
    th.append('<th>' + 'Adresse' + '</th>');
    th.append('<th>' + 'Hobby' + '</th>');
    $('table').append(th);
}

function showAll()
{
    $("#showAll").click(function () {

        $.getJSON("api/person/all", function (json)
        {
            $('#myTable tbody tr').remove();
            for (var i = 0; i < json.length; i++) {

                tr = $('<tr/>');

                tr.append("<td>" + json[i].firstName + "</td>");
                tr.append("<td>" + json[i].lastName + "</td>");
                tr.append("<td>" + json[i].email + "</td>");
                tr.append("<td>" + json[i].address + "</td>");
                tr.append("<td>" + json[i].phone + "</td>");
                $('table').append(tr);
                console.log(json[i].firstName);
            }

        });
    });
}

function findPersonByPhone()
{
    $("#findP").click(function () {

        var phone = document.getElementById('phoneN').value;
       
        $.getJSON("api/person/phone/" + phone, function (json)
        {
            $('#myTable tbody tr').remove();
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

function findPersonByName()
{
    $("#findN").click(function () {

        var name = document.getElementById('name').value;
       
        $.getJSON("api/person/firstname/" + name, function (json)
        {
            $('#myTable tbody tr').remove();
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

function findPersonByPhone()
{
    $("#findZ").click(function () {

        var zip = document.getElementById('zip').value;
       
        $.getJSON("api/person/zip/" + zip, function (json)
        {
            $('#myTable tbody tr').remove();
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