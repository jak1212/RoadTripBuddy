package com.RoadTripBuddy.Microservice.EntityMaps;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.util.Date;
import jakarta.persistence.Column;


@Entity
@Table(name="Ingredients_Master")
@Data
public class IngredientsEntity {

    //private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    private final int ingredientID;


}
