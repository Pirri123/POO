<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        echo "Programación orientada a objetos<br>";
        include "Articulo.php";
        
        $telefono=new Articulo(120899, 11500.00, "Iphone 6s 16Gb");
        $telefono->compra(50, 9890.00);
        echo "La existencia en almacén del artículo es " . $telefono->verificarExistencia() . "<br>";
        
        echo "Se venden 15 telefonos<br>";
        $telefono->venta(15);
        echo "La nueva existencia después de la venta es: " . $telefono->verificarExistencia() . "<br>";
        echo "Hay una promo y el nuevo precio es $10,000" . $telefono->actualizaPrecio(10000.00);
        ?>
    </body>
</html>
