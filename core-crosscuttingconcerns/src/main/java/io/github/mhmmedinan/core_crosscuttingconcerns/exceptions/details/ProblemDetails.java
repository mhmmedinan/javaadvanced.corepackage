package io.github.mhmmedinan.core_crosscuttingconcerns.exceptions.details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemDetails {
    private String title;
    private String detail;
    private String status;
    private String type;
}
