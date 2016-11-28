package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

// Product Entity managed by the ORM
@Entity
public class Product extends Model {

    // Properties
    // Annotate id as the primary key
    @Id
    private Long id;

    // Other fields marked as being required (for validation purposes)
    @Constraints.Required
    private String name;

    @Constraints.Required
    private String category;

    @Constraints.Required
    private String description;

    @Constraints.Required
    private int	stock;

    @Constraints.Required
    private double price;

    @OneToMany
    private List<Product> products;

    // Default constructor
    public  Category() {
    }

    // Constructor to initialise object
    public  Category(Integer id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }
}