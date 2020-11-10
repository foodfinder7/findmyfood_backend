package foodfinder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NotNull
@NoArgsConstructor
@Table(name = "restaurants")
public class RestaurantDTO {

    @Id
    @Column(name = "restaurant_id")
    private Integer restaurantId;
    private String name;
    private String address;
    private String type;
    private Float latitude;
    private Float longitude;

}
