
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.giovannicarrera.webapp.entity.Producto;
import org.giovannicarrera.webapp.util.JpaUtil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatica
 */
public class main {
    private static EntityManager em = JpaUtil.getEntityManager();
    
    public static void main(String [ ] args){
     
        TypedQuery<Producto> query = em.createQuery("SELECET p FROM Producto p", Producto.class);
        List <Producto> productos =query.getResultList();
        
        productos.forEach(producto -> System.out.println(producto));
    }
}
