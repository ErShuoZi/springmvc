<%--
  Created by IntelliJ IDEA.
  User: ershuozi
  Date: 12/18/23
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="script/jquery-3.6.0.min.js" ></script>
    <script>
        $(function () {
            $("#del-btn").click(function (){
                $("#hiddenForm").attr("action",this.href);
                $(":hidden").val("DELETE");
                $("#hiddenForm").submit();
                return false;
            })


            $("#put-btn").click(function (){
                $("#hiddenForm2").attr("action",this.href);
                $(":hidden").val("PUT");
                $("#hiddenForm2").submit();
                return false;
            })
        })
    </script>
</head>
<body>
<h3>get</h3>
<a href="book/getbook/1">点击</a>
<br/>
<h3>post</h3>
<form action="book/addbook" method="post">
    <input name="name" type="text"/>
    <input type="submit" value="提交"/>
</form>
<br/>

<h3>del</h3>
<a id="del-btn" href="book/delBook/111">删除</a>
<form action="" method="post" id="hiddenForm" >
   <input type="hidden" name="_method">
</form>
<br/>




<h3>put</h3>
<%--<form action="book/updateBook/123" method="put">--%>
<%--    <input type="submit" value="修改  "/>--%>
<%--</form>--%>

<a id="put-btn" href="book/updateBook/123">修改</a>
<form action="" method="post" id="hiddenForm2" >
    <input type="hidden" name="_method">
</form>
<br/>

<a href="vote/vote05">哈哈</a>
<form action="vote/vote05">
    <input name="id" type="text"/>
    <input name="name" type="text"/>
    <input type="submit" value="提交" />
</form>



<form action="vote/vote06">
    <input name="id" type="text"/>
    <input name="name" type="text"/>
    <input type="submit" value="提交" />
</form>
</body>
</html>
