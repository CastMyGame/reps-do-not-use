package com.dms.hims.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Infractions")
public class Infraction {
    @Id
    private String infractionId;
    private int infractionLevel;
    private String infractionType;
    private String infractionUrl;
    private String infractionAssign;
    private String status;

}
