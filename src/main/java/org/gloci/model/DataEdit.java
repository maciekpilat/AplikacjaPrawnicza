/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gloci.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table
public class DataEdit {
@Id
@GeneratedValue
private Long dataEditId;
private String dataEditDate;
private String dataBeforeEdition;
private String dataAfterEdition;
private String columnName;

@ManyToOne
private Partner partner;
@ManyToOne
private Case casex;
    
}
