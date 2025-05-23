package gr.aueb.cf.schoolapp.dto;

import lombok.*;


public record  TeacherReadOnlyDTO (
     Long id,
     String vat,
     String firstname,
     String lastname
){}