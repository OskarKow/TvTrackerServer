/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oskar.kow.ActionsTrackerServer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Oskar Kowalewski
 */
@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "channels")
public class Channel {
    
    @Getter
    @Id
    UUID id = UUID.randomUUID();
    
    @Getter
    @Setter
    @Column(nullable=false)
    String name;
    
    @OneToMany(mappedBy = "channel")
    @Getter
    List<Broadcast> broadcasts = new ArrayList<>();
  
}
