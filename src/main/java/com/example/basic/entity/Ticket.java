package com.example.basic.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Ticket {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;
  private String description;

  @ManyToOne
  @JoinColumn(name = "application_id")
  private Application application;

  @ManyToOne
  @JoinTable(name ="ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
  private Release release;

  private String status;

  public Ticket() {
  }

  public Ticket(String title, String description,
                Application application, Release release, String status) {
    this.title = title;
    this.description = description;
    this.application = application;
    this.release = release;
    this.status = status;
  }

}
