package org.csystem.app.service.animalhospital.veterinarian.mapper;

import com.metemengen.animalhospital.data.entity.Veterinarian;
import org.csystem.app.service.animalhospital.veterinarian.dto.VeterinarianDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class VeterinarianMapper implements IVeterinarianMapper {
    @Override
    public VeterinarianDTO toVeterinarianDTO(Veterinarian veterinarian)
    {
        var dto = new VeterinarianDTO();

        dto.diplomaNo = veterinarian.diplomaNo;;
        dto.citizenId = veterinarian.citizenId;
        dto.firstName = veterinarian.firstName;
        dto.middleName = veterinarian.middleName.orElse(null);
        dto.lastName = veterinarian.lastName;
        dto.birthDate = veterinarian.birthDate;
        dto.registerDate = veterinarian.registerDate;

        return dto;
    }
}
