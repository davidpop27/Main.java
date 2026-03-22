package org.example.Servicii;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.Model.Pacient;
import org.example.Database.HibernateUtil;

import java.util.List;

public class PatientService {
    private final EntityManager em = new HibernateUtil().getEntityManager();

    public void registerPatient(Pacient patient) {
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();
    }

    public Pacient findByEmail(String email) {
        TypedQuery<Pacient> query = em.createQuery("SELECT p FROM Patient p WHERE p.email = :email", Pacient.class);
        query.setParameter("email", email);
        return query.getResultStream().findFirst().orElse(null);
    }

    public List<Pacient> getAllPatients() {
        return em.createQuery("SELECT p FROM Patient p", Pacient.class).getResultList();
    }

    public Pacient findById(Long id) {
        return em.find(Pacient.class, id);
    }

}
