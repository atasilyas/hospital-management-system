package com.hospital.management.mapper;

import com.hospital.management.dto.ReceiptDto;
import com.hospital.management.model.Receipt;
import lombok.Data;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",uses = { DoctorMapper.class })
public interface ReceiptMapper {


    ReceiptMapper MAPPER = Mappers.getMapper(ReceiptMapper.class);

    @Mappings({@Mapping(source = "medicineCount", target = "medicineCount"),
                @Mapping(source = "totalAmount", target = "totalAmount"),
                @Mapping(source = "recipeNumber", target = "recipeNumber"),
                @Mapping(source = "doctor", target = "doctor"),
                @Mapping(source = "medicineType", target = "medicineType")})
    Receipt toDOctor(ReceiptDto receiptDto);

    @InheritInverseConfiguration
    ReceiptDto fromDoctor(Receipt receipt);

}
