<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Description of Articulo
 *
 * @author Ernesto Ramirez
 */
class Articulo {
    
    public $sku;
    protected $existencia;
    protected $precio;
    protected $costo;
    public $descripción;
    
  public function Articulo ($sku, $precio, $descripcion) {
    $this->sku = $sku;
    $this->existencia = 0;
    $this->precio = $precio;
    $this->costo = 0;
    $this->descripción = $descripcion;
  }
    public function compra ($cArt, $costo) {
     $this->existencia += $cArt;
     $this->costo = $costo;
  }  
  public function verificarExistencia (){
        return $this->existencia;    
    }
    
     public function venta ($cArt) {
         if ($this->verificarExistencia() >= $cArt) {
            $this->existencia -= $cArt;
           return true;
       } else {
           return false;
       }
    }
    
    public function actualizaPrecio ($precio){
        $this->precio = $precio;
    }
}


 