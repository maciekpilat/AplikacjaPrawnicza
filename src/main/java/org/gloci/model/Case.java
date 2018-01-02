/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gloci.model;

import java.util.ArrayList;
import java.util.Collection;
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
public class Case {
@Id
@GeneratedValue
private Long caseId;
private String caseTitle;
private String caseStartDate;
private String caseEndDate;



@ManyToMany(mappedBy = "parties")
private Collection<Parties> parties = new ArrayList<Parties>();
@ManyToMany()
private Collection<Partner> partners = new ArrayList<Partner>();
@ManyToMany()
private Collection<Asistant> asistants = new ArrayList<Asistant>();

@ManyToOne
private Court court;
@OneToMany
private Event event;


//Long courtDepartmentId (fk)
//Long clientId (fk)
//Long partnerId (fk)
//Long asistantId (fk)

    
}
