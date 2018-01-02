/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gloci.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table
public class Asistant {
@Id
@GeneratedValue
private Long asistantId;
private String  asistantFirstName;
private String  asistantLastName;
private String  asistantTitle;

@ManyToMany(mappedBy = "case")
private Collection<Case> cases = new ArrayList<Case>(); 
@ManyToOne
private Partner partner;

    
}
