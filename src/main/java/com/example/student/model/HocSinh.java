package com.example.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hoc_sinh")
@Data
public class HocSinh {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "age")
  private Integer age;

  @Column(name = "status")
  private String status;

  @Override
  public String toString() {
    return "HocSinh{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", status='" + status + '\'' +
        '}';
  }
}