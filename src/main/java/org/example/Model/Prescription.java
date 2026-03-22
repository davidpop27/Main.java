package org.example.Model;

import jakarta.persistence.*;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medication;
    private String dosage;
    private String instructions;

    @ManyToOne
    @JoinColumn(name = "record_id")
    private IstoricMedical medicalRecord;

    public Prescription() {
    }

    public Prescription(String medication, String dosage, String instructions, IstoricMedical medicalRecord) {
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
        this.medicalRecord = medicalRecord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public IstoricMedical getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(IstoricMedical medicalRecord) {
        this.medicalRecord = medicalRecord;
    }
}
