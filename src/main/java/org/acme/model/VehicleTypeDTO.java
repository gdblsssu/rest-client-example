package org.acme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class VehicleTypeDTO {
    public Long id;
    public Integer code;
    public String typeName;
}
