<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="cssforsave.css" rel="stylesheet" >
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container register-form">
			<form action="./update" method="post" >
			
            <div class="form">
                <div class="note">
                    <p>Employee Edit.</p>
                </div>

                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Employee ID" readonly="readonly" value="${employee.employeeId}" name="employeeId"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Employee Name" value="${employee.employeeName}" name="employeeName"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Employee Sal" value="${employee.employeeSal}" name="employeeSal"/>
                            </div>
                            
                        </div>
                    </div>
                    <button type="submit" class="btnSubmit">update</button>
                </div>
            </div>
            </form>
        </div>