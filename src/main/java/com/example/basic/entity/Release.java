package com.example.basic.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Release {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String releaseDate;
  private String description;

  public Release() {
  }

  public Release(Integer id, String description, String releaseDate) {
    this.id = id;
    this.releaseDate = releaseDate;
    this.description = description;
  }

}
