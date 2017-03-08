<%--
  Created by IntelliJ IDEA.
  User: hejiecheng
  Date: 17/3/8
  Time: 下午3:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">@import url(css/main.css);</style>
</head>
<body>
    <div id="global">
        <h4>The product has been saved.</h4>
        <p>
        <h5>Details:</h5>
        Product Id: ${product.id}<br/>
        Product Name: ${product.name}<br/>
        Description: ${product.description}<br/>
        Price: $${product.price}
    </p>
</div>
</body>
</html>
