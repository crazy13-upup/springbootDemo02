<html>
    <head>
        <title>springboot</title>
    </head>
    <body>
        <table border="1px" cellpadding="10px" cellspacing="0px" width="50%" align="center">
            <thead>
                <tr>
                    <th>姓名</th>
                    <th>年纪</th>
                </tr>
            </thead>

            <tbody>
                <#list Musers as user>
                    <tr>
                        <td>${user.age}</td>
                        <td>${user.username}</td>
                    </tr>
                </#list>
            </tbody>

        </table>

    </body>

</html>