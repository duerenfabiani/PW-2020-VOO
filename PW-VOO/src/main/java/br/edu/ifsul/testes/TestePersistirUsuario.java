package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestePersistirUsuario {

    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PW-VOO-PU");
        EntityManager em = emf.createEntityManager();
        Usuario u1 = new Usuario();
        u1.setNome("Dueren Finatto");
        u1.setNomeUsuario("dueren1");
        u1.setSenha("123");
        u1.setAtivo(true);
        u1.setEmail("duerenfabiani@gmail.com");        
        em.getTransaction().begin();
        em.persist(u1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}