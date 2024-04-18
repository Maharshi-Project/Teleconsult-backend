package com.teleconsulting.demo.service;
import com.teleconsulting.demo.exception.UserNotFoundException;
import com.teleconsulting.demo.dto.AuthenticationResponse;
import com.teleconsulting.demo.model.Doctor;
import com.teleconsulting.demo.dto.RegDoc;

import java.util.List;

public interface DoctorService{
    Doctor saveDoctor(Doctor doctor);
    AuthenticationResponse saveNewDoctor(RegDoc regDoc);
    List<Doctor> getAllDoctors();
    List<Doctor> getAllSrDoctors();
    Doctor findByPhoneNumber(String phoneNumber);
    Doctor findById(Long id);
    Doctor updateDoctorIncomingCall(String doctorPhoneNumber, String patientPhoneNumber);
    Doctor updateDoctor(Long id,Doctor doctor);
    void deleteDoctorById(Long id) throws UserNotFoundException;
    List<Doctor> getDoctorsBySupervisorId(Long supervisorId);

    void updateRating(Long id, int rating);

}
