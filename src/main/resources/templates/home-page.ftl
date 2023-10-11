<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Internwise</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">Internwise</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <#list listOfCompanies as company>
                    <li class="nav-item">
                        <a class="nav-link" href="/programs?companyId=${company.id}">${company.getCompanyName()}</a>
                    </li>
                </#list>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h2>The list of all the companies (and their programs):</h2>
    <ul>
        <#list contentCompanies as company>
            <li>
                ${company.getCompanyName()}:
                <ul>
                    <#list company.programs as program>
                        <li>${program.getTitle()}</li>
                    </#list>
                </ul>
            </li>
        </#list>
    </ul>

    <h2>The list of all the users</h2>
    <#list listOfUsers as users>
        <div>${users.getFirstName()}</div>
    </#list>
</div>

<!-- Optional JavaScript; choose one of the two! -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
