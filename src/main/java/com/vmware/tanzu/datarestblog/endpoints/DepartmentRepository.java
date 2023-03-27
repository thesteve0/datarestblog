package com.vmware.tanzu.datarestblog.endpoints;

import com.vmware.tanzu.datarestblog.dataobjects.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "departments", path = "departments")
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
