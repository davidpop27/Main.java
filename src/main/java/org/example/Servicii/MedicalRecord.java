package org.example.Servicii;

import jakarta.persistence.EntityManager;
import org.example.Database.HibernateUtil;
import org.example.Model.IstoricMedical;
import org.example.Model.Pacient;
import org.example.Model.Doctor;

import java.time.LocalDate;
import java.util.List;

public class MedicalRecord {

    private final EntityManager em = new HibernateUtil().getEntityManager();

    public void addMedicalRecord(Pacient patient, Doctor doctor, String diagnostic, String tratament) {
        em.getTransaction().begin();
        IstoricMedical record = new IstoricMedical(diagnostic, tratament, patient, doctor);
        record.setDate(LocalDate.now());
        em.persist(record);
        em.getTransaction().commit();
    }

    public List<IstoricMedical> getRecordsForPatient(Pacient patient) {
        return em.createQuery("SELECT m FROM MedicalRecord m WHERE m.patient = :patient", IstoricMedical.class)
                .setParameter("patient", patient)
                .getResultList();
    }
}
