<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Level Up Lunch - Contact Listing</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"></head>
<body>

<h2>Contact Listing</h2>

<table class="data-contacts-js table table-striped" >
    <tr>
        <th>Name</th>
        <th>Telephone</th>
        <th>Email</th>
        </tr>
</table>

<button id="fetchContacts" class="btn btn-default" type="submit">Button</button>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script type="text/javascript">

    $("#fetchContacts").bind("click", function() {

        $.get("http://localhost:8080/rwr/candidates", function(data) {

            $.each(data, function(i, candidate) {

                $(".data-contacts-js").append(
                        "<tr><td>" + candidate.firstName + "</td>" +
                        "<td>" + candidate.name + "</td>" +
                        "<td>" + candidate.emailAddress + "</td></tr>");
            });

        });
    });
</script>
</body>
</html>