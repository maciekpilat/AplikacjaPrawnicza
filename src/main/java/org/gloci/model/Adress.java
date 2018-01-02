/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gloci.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table
public class Adress {
@Id
@GeneratedValue
private Long adress_id;
private Long adress_type;
private Long country;
private Long voivodeship;
private Long city;
private String street_name;
private Long street_number;
private Long street_flat_number;

    
}
