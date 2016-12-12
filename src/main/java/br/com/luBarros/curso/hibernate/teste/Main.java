package br.com.luBarros.curso.hibernate.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursoHibernate");
        EntityManager manager = factory.createEntityManager();

        System.out.println("\n Conectado! \n ");

        manager.close();
        factory.close();
    }
}
