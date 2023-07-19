package org.acme.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CarDTO {
    public Long id;
    public String name;
    public String color;
    public Integer maxSpeed;
    public VehicleTypeDTO vehicleTypeDTO;
}
