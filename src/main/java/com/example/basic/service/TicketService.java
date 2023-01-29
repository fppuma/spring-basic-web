package com.example.basic.service;

import com.example.basic.entity.Ticket;

public interface TicketService {
  Iterable<Ticket> listTickets();
}
