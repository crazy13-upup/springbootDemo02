<html>
    <head>
        <title>car</title>
    </head>
    <body>
        <table align="center" border="1px" cellspacing="0px" cellpadding="10px">
            <thead>
                <tr>
                    <th>品牌</th>
                    <th>价格</th>
                </tr>
            </thead>
            <tbody>
                <#list carList as car>
                    <tr>
                        <td>${car.brand}</td>
                        <td>${car.price}</td>
                    </tr>
                </#list>
            </tbody>



        </table>
    </body>
</html>