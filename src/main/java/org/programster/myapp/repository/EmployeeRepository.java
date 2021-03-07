/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.programster.myapp.repository;

import java.util.UUID;
import org.programster.myapp.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, UUID>
{
    
}
