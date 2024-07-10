/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.giovannicarrera.webapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Productos")
@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    private String nombreProducto;
    private String marcaProducto;
    private String decripcionProducto;
    private Double precioProducto;
    
    public Producto(){
        
    }

    public Producto(String nombreProducto, String marcaProducto, String decripcionProducto, Double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.decripcionProducto = decripcionProducto;
        this.precioProducto = precioProducto;
    }
    
    public Producto(Long productoId, String nombreProducto, String marcaProducto, String decripcionProducto, Double precioProducto) {
        this.productoId = productoId;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.decripcionProducto = decripcionProducto;
        this.precioProducto = precioProducto;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getDecripcionProducto() {
        return decripcionProducto;
    }

    public void setDecripcionProducto(String decripcionProducto) {
        this.decripcionProducto = decripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "productoId=" + productoId + ", nombreProducto=" + nombreProducto + ", marcaProducto=" + marcaProducto + ", decripcionProducto=" + decripcionProducto + ", precioProducto=" + precioProducto + '}';
    }
  
}
