package com.example.basic.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Application {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="application_id")
  private Long id;

  @Column(name = "app_name", nullable = false)
  private String name;

  @Column(length = 2000)
  private String description;
  private String owner;

  public Application() {
  }

  public Application(String name, String owner,
                     String description) {
    this.name = name;
    this.owner = owner;
    this.description = description;
  }


}
