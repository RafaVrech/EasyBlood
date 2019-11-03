package easyblood.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;

@Data
/*Para aparecer no bloodcenter o objeto inteiro*/
/*Aqui fica como se nao fosse uma tabela. Se nao aparece só o id lá na lista de Blood em BloodCenter*/
//@Document(collection = "bloodcenters")
public class Blood {

    @Id
    private String id;

    @NotEmpty
    private BloodType type;

    @NotEmpty
    private float liters;
}
