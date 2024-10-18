package com.smarttech.SmartRH;
import com.smarttech.SmartRH.AppResouces.Exceptions.DepartementException;
import com.smarttech.SmartRH.AppResouces.Exceptions.PermissionException;
import com.smarttech.SmartRH.AppResouces.Exceptions.UserException;
import com.smarttech.SmartRH.AppResouces.Models.DTOs.DepartementDto;
import com.smarttech.SmartRH.AppResouces.Services.DepartementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/departements")
public class DepartementControllerTest {
    @Autowired
    private DepartementServiceImpl departementService;

    // Create a new department
    @PostMapping
    public ResponseEntity<DepartementDto> addDepartement(@RequestBody DepartementDto departementDto) {
        try {
            DepartementDto createdDepartement = departementService.addDepartement(departementDto);
            return ResponseEntity.ok(createdDepartement);
        } catch (DepartementException | PermissionException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // Update an existing department
    @PutMapping("/{id}")
    public ResponseEntity<DepartementDto> updateDepartement(
            @PathVariable Long id,
            @RequestBody DepartementDto departementDto) {
        try {
            DepartementDto updatedDepartement = departementService.updateDepartement(id, departementDto);
            return ResponseEntity.ok(updatedDepartement);
        } catch (DepartementException | PermissionException | UserException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // Delete a department
    /*
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartement(@PathVariable Long id) {
        try {
            departementService.deleteDepartement(id);
            return ResponseEntity.ok().build();
        } catch (DepartementException | PermissionException | UserException | IOException e) {
            return ResponseEntity.badRequest().build();
        }
    }

     */

    // Get a department by ID
    @GetMapping("/{id}")
    public ResponseEntity<DepartementDto> getDepartementById(@PathVariable Long id) {
        try {
            DepartementDto departement = departementService.getDepartementById(id);
            return ResponseEntity.ok(departement);
        } catch (DepartementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Get all departments
    @GetMapping
    public ResponseEntity<List<DepartementDto>> getAllDepartements() {
        try {
            List<DepartementDto> departements = departementService.getAllDepartements();
            return ResponseEntity.ok(departements);
        } catch (DepartementException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
