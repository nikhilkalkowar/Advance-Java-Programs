<%@page import="com.sathya.productapp.ProductDao"%>
<%@page language="java" contentType="text/html"%>
<%@ page import="java.util.Base64" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<html>
<head>
<title>Product List</title>
 <!-- BootStrap CDN link to Get the Support of BootStrap -->
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="header.jsp"/>

<h1 class="text-center font-italic mb-1 text-success">List of Available Products...</h1>

<div>
	<a class="btn btn-success" href="add-product.html">Save Product</a>
</div>


<div>
	<input type="text" placeholder="Search">
</div>

<div>
	<c:if test="${saveResult==1}">
		<h1 class="text-success text-center">Data inserted Successfully.....</h1>
	</c:if>
</div>

<div>
	<c:if test="${deleteResult==1}">
		<h1 class="text-danger text-center">Data Deleted Successfully.....</h1>
	</c:if>
	
	<c:if test="${deleteResult==0}">
		<h1 class="text-danger text-center">Data Deleted Fail.....</h1>
	</c:if>
</div>



<table class="table table-bordered table-striped">

<thead class="thead-dark">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Cost</th>
            <th>Brand</th>
            <th>Made In</th>
            <th>Manufacture Date</th>
            <th>Expiry Date</th>
            <th>Image</th>
            <th>Actions</th>
        </tr>
</thead>

<tbody>
	
    <c:forEach var="product" items="<%=new ProductDao().findAll()%>">
    	<tr>
             <td>${product.proId}</td>
             <td>${product.proName}</td>
             <td>${product.proPrice}</td>
             <td>${product.proBrand}</td>
             <td>${product.proMadeIn}</td>
             <td>${product.proMfgDate}</td>
             <td>${product.proExpDate}</td>           
    	<td>
            <img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}" alt="Product Image" style="max-width: 100px; max-height: 100px;">
        </td>
        
        <td>
        	 <a class="btn btn-primary" href="./DeleteProductServlet?proId=${product.proId}">Delete</a>
        	 <a class="btn btn-primary" href="./EditProductServlet?proId=${product.proId}">Edit</a>
        </td>
        
        
        
        </tr>    
    </c:forEach>


</tbody>









</table>


</body>
</html>





