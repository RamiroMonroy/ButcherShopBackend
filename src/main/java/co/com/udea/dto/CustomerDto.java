package co.com.udea.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDto {

	private Integer id;

    @NotNull
    @Size(min = ValidatorConstants.MIN_CODPRESTADOR, max = ValidatorConstants.MAX_CODPRESTADOR, message = ValidatorConstants.BAD_SIZE_CODPRESTADOR_MESSAGE)

    public CustomerDto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
