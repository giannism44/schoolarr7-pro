package gr.aueb.cf.schoolapp.mapper;

import gr.aueb.cf.schoolapp.dto.*;
import gr.aueb.cf.schoolapp.model.Teacher;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapper {

    private Mapper() {}

    public static Teacher mapToTeacher(TeacherInsertDTO dto) {
        return new Teacher(null, dto.vat(), dto.firstname(), dto.lastname());
    }

    public static Teacher mapToTeacher(TeacherUpdateDTO dto) {
        return new Teacher(dto.id(), dto.vat(), dto.firstname(), dto.lastname());
    }

    public static TeacherReadOnlyDTO mapToTeacherReadOnlyDTO(Teacher teacher) {
        return new TeacherReadOnlyDTO(teacher.getId(), teacher.getVat(), teacher.getFirstname(), teacher.getLastname());
    }

    public static List<TeacherReadOnlyDTO> teachersToReadOnlyDTOs(List<Teacher> teachers) {
        return teachers.stream()
                .map(Mapper::mapToTeacherReadOnlyDTO)
                .collect(Collectors.toList());
    }

    public static Map<String , Object> mapToCriteria(TeacherFiltersDTO filtersDTO) {
        Map<String , Object> filters = new HashMap<>();

        if (filtersDTO.firstname() != null && !filtersDTO.firstname().isEmpty()) {
            filters.put("firstname", filtersDTO.firstname());
        }

        if (filtersDTO.lastname() != null && !filtersDTO.lastname().isEmpty()) {
            filters.put("lastname", filtersDTO.lastname());
        }

        if (filtersDTO.vat() != null && !filtersDTO.vat().isEmpty()) {
            filters.put("vat", filtersDTO.vat());
        }
        return filters;
    }

}
