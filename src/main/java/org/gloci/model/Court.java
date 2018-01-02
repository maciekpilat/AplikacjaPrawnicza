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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table
public class Court {
    
@Id
@GeneratedValue
private Long courtId;
private String courtName;

@OneToMany
private List<CourtDepartment> courtDepartments;

}
