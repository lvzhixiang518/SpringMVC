<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript">

        //编写一个javascript对象
        var user = {
            name:"吕智翔",
            age :22,
            sex :"男"
        }
        console.log(user);
        var json = JSON.stringify(user);
        console.log(json);
        var tt = JSON.parse(json);
        console.log(tt);

    </script>
</head>
<body>

</body>
</html>
