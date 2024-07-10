/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.giovannicarrera.webapp.service;

import jakarta.persistence.EntityManager;
import java.util.List;
import org.giovannicarrera.webapp.entity.Producto;
import org.giovannicarrera.webapp.util.JpaUtil;


public class ProductoService implements IProductoService {

    private EntityManager em;
    
    public ProductoService(){
        this.em =JpaUtil.getEntityManager();
    }
    
    @Override
    public List<Producto> listarProductos() {
        return em.createQuery("SELECT p  FROM Producto p", Producto.class).getResultList();
    }

    @Override
    public void agregarProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarProducto(int productoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto buscarProductoId(int productoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
