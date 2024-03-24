<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add product</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Add your custom CSS styles here */
        .container {
            max-width: 500px;
        }
        .form-group label {
            font-weight: bold;
        }
        .btn-primary {
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center font-italic mb-4">Save Product Data</h2>
        <form method="post" action="./AddProductServlet" enctype="multipart/form-data" onsubmit="return validateform()">
           <div class="form-group">
            <label for="proId">Product Id :</label>
            <input type="text" class="form-control" id="proId" name="proId" required>
           </div>
           <div class="form-group">
            <label for="proName">Product Name :</label>
            <input type="text" class="form-control" id="proName" name="proName" required>
           </div>
           <div class="form-group">
            <label for="proPrice">Product Price :</label>
            <input type="number" class="form-control" id="proPrice" name="proPrice" required>
           </div>
           <div class="form-group">
            <label for="proBrand">Product Brand :</label>
            <input type="text" class="form-control" id="proBrand" name="proBrand" required>
           </div>
           <div class="form-group">
            <label for="proMadeIn">Product Made In :</label>
            <input type="text" class="form-control" id="proMadeIn" name="proMadeIn" required>
           </div>
           <div class="form-group">
            <label for="proMfg">MFG Date :</label>
            <input type="date" class="form-control" id="proMfg" name="proMfg" required>
           </div>
           <div class="form-group">
            <label for="proExp">Expire Date :</label>
            <input type="date" class="form-control" id="proExp" name="proExp" required>
           </div>
           <div class="form-group">
            <label for="proImg">Product Image :</label>
            <input type="file" class="form-control-file" id="proImg" name="proImg" accept="image/*" required>
           </div>
           <div class="text-center">
            <input type="submit" class="btn btn-success mr-2" value="Save Product">
            <a href="productlist.jsp" class="btn btn-primary">List of Products</a>
           </div>
        </form>
    </div>
</body>
</html>
