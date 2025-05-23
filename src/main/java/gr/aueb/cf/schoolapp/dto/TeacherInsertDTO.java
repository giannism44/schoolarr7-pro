package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TeacherInsertDTO(

    @NotNull(message = "Tο όνομα δεν μπορεί αν μην υπάρχει.")
    @Size(min = 2, max = 255, message = "Το όνομα πρέπει να είναι μεταξύ 2-255 χαρακτήρων")
     String firstname,

    @NotNull(message = "Tο επώνυμο δεν μπορεί αν μην υπάρχει.")
    @Size(min = 2, max = 255, message = "Το επώνυμο πρέπει να είναι μεταξύ 2-255 χαρακτήρων")
     String lastname,

    @NotNull(message = "το ΑΦΜ δεν μπορεί να μην υπάρχει.")
    @Size(message = "Το ΑΦΜ πρέπει να περιέχει τουλάχιστον 9 ψηφία.")
    String vat
){}
