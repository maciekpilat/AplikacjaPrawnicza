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
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table
public class Parties {
@Id
@GeneratedValue
private Long partyId;
private Long partyType; // powód / pozwany
private String partyFirstName;
private String partyLastName;
private String partyTitle;
private Long partyClient; // yes / no

@ManyToMany()
private Collection<Case> cases = new ArrayList<Case>();
    
}
