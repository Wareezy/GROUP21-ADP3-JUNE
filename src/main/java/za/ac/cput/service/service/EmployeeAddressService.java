package za.ac.cput.service.service;

import za.ac.cput.domain.EmployeeAddress;
import za.ac.cput.service.IService;

import java.util.List;
/*Warren Jaftha-219005303*/
public interface EmployeeAddressService extends IService<EmployeeAddress,EmployeeAddress.EmployeeAddressId> {
    List<EmployeeAddress> findAll();
    //void deleteById(String id);

    List<EmployeeAddress>findByStaffId(String staffId);
}

