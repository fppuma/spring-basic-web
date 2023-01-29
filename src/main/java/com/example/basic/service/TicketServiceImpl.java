package com.example.basic.service;

import com.example.basic.entity.Ticket;
import com.example.basic.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{
  @Autowired
  private TicketRepository ticketRepository;

  @Override
  public Iterable<Ticket> listTickets() {
    return ticketRepository.findAll();
  }

}
