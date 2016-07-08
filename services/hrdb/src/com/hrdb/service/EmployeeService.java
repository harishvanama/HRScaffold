/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.hrdb.Employee;

/**
 * Service object for domain model class Employee.
 *
 * @see {@link Employee}
 */
public interface EmployeeService {

    /**
     * Creates a new Employee.
     *
     * @param employee The information of the created CompositeTable.
     * @return The created Employee.
     */
	Employee create(Employee employee);


	/**
	 * Finds Employee by id.
	 *
	 * @param employeeId The id of the wanted Employee.
	 * @return The found Employee. If no Employee is found, this method returns null.
	 */
	Employee getById(Integer employeeId) throws EntityNotFoundException;

	/**
	 * Updates the information of a Employee.
	 *
	 * @param employee The information of the updated Employee.
	 * @return The updated Employee.
     *
	 * @throws EntityNotFoundException if no Employee is found with given id.
	 */
	Employee update(Employee employee) throws EntityNotFoundException;

    /**
	 * Deletes a Employee.
	 *
	 * @param employeeId The id of the deleted Employee.
	 * @return The deleted Employee.
     *
	 * @throws EntityNotFoundException if no Employee is found with the given id.
	 */
	Employee delete(Integer employeeId) throws EntityNotFoundException;

	/**
	 * Finds all Employees.
	 *
	 * @return A list of Employees.
	 */
    @Deprecated
	Page<Employee> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Finds all Employees.
	 * @return A list of Employees.
	 */
    Page<Employee> findAll(String query, Pageable pageable);

    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Employees in the repository with matching query.
     *
     * @param query query to filter results.
	 * @return The count of the Employee.
	 */
	long count(String query);

    Page<Employee> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);

}

