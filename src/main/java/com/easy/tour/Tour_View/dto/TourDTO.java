package com.easy.tour.Tour_View.dto;

import com.easy.tour.Tour_View.Enum.ApprovalStatus;
import com.easy.tour.Tour_View.Enum.PriceStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class TourDTO {

    // TourCode will be generated based on tourName
    String tourCode;

    @NotNull(message = "tourName must not be empty")
    String tourName;

    String description;

    Integer maximumSize;
    // private String creator;
// private Date createDate;
// private String approvedBy;
// private Date approvalDate;
    ApprovalStatus approvalStatus;

    PriceStatus priceStatus;

    String tourRequestCode;

    String tourImg1;

    String tourImg2;
}
