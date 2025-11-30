package com.mycompany.pert5_51422467.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mahasiswa")
public class ModelMahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "npm", nullable = false, length = 10)
    private String npm;

    @Column(name = "nama", nullable = false, length = 50)
    private String nama;

    @Column(name = "semester", nullable = false)
    private int semester;

    @Column(name = "ipk", nullable = false)
    private float ipk;

    public ModelMahasiswa() {}

    public ModelMahasiswa(int id, String npm, String nama, int semester, float ipk) {
        this.id = id;
        this.npm = npm;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", npm='" + npm + '\'' +
                ", nama='" + nama + '\'' +
                ", semester=" + semester +
                ", ipk=" + ipk +
                '}';
    }
}
