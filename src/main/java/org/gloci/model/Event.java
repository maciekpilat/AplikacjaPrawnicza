/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gloci.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table
public class Event {
@Id
@GeneratedValue
private Long eventId;
private Long eventType;
private String eventDesc;
private String eventDate;

@OneToMany
private List<Document> documents;
@ManyToOne
private Parties parties;
@ManyToOne
private Case casex;

    
}
