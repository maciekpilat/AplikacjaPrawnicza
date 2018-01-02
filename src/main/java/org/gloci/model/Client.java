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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table
public class Client {
@Id
@GeneratedValue
private Long clientId;
private String clientFirstName;
private String clientLastName;
private String clientTitle;

@ManyToOne
private Adress adress;
@ManyToOne
private Collection<Case> casex = new ArrayList<Case>();

    
}
