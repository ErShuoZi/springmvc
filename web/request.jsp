<%--
  Created by IntelliJ IDEA.
  User: ershuozi
  Date: 12/17/23
  Time: 4:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/buy" method="post">
    u: <input type="text"name="username"/><br/>
    c: <input type="text"name="nums"/><br/>
    <input type="submit" value="提交"/>
</form>


<h2>演示傳參</h2>
<a href="user/search?bookId=100" >查詢書籍</a>


<a href="user/message/aa" >測試</a>

<a href="user/reg/張三/20" >測試2</a>

</body>
</html>
