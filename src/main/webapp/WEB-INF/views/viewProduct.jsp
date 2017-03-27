<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp"%>




<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Detail</h1>

            <p class="lead">Detail page for Product</p>
        </div>

        <div class="container">
            <div class="row">

                <div class="col-md-5">
                   <img src="" alt="image" style="width:100% ; height: 300px; ">

                </div>


                <div class="col-md-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>
                    <p> <strong>${product.productManufacturer} </strong></p>
                    <p><strong>${product.productCategory}</strong></p>
                    <p><strong>${product.productCondition}</strong></p>
                    <h4>${product.productPrice}</h4>

                </div>

            </div>
        </div>


        <%@ include file="/WEB-INF/views/template/footer.jsp"%>


