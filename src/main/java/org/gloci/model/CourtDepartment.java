/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gloci.model;

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
public class CourtDepartment {
    
@GeneratedValue
@Id
private Long courtDepartmentId;
private String courtDepartmentName;
private Long adress_id;

@ManyToOne
private Court court;
    
}
