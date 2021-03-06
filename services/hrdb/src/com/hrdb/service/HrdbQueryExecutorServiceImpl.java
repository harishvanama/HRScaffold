/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/


package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomQuery;
import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class HrdbQueryExecutorServiceImpl implements HrdbQueryExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(HrdbQueryExecutorServiceImpl.class);

	@Autowired
	@Qualifier("hrdbWMQueryExecutor")
	private WMQueryExecutor queryExecutor;

	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeEmployeeListOf_DeptId1(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("EmployeeListOf_DeptId1", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeEmployeeListOf_DeptId2(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("EmployeeListOf_DeptId2", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeSrv_Var_EmployeeCount(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("Srv_Var_EmployeeCount", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeTotalBudget(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("TotalBudget", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeChecking(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("checking", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeEmploteeList(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("EmploteeList", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeEmployeeListOf_DeptId5(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("EmployeeListOf_DeptId5", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeEmployeeListOf_DeptId4(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("EmployeeListOf_DeptId4", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeSearchEmployees(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("SearchEmployees", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeNoOfDepartment(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("NoOfDepartment", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeSelectEmployeeVar(Pageable pageable, java.lang.Integer SearchID, java.lang.Integer LiveListID)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SearchID", SearchID);
        params.put("LiveListID", LiveListID);
        return queryExecutor.executeNamedQuery("SelectEmployeeVar", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeSelectEmployee(Pageable pageable, java.lang.Integer SearchID, java.lang.Integer LiveListID)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SearchID", SearchID);
        params.put("LiveListID", LiveListID);
        return queryExecutor.executeNamedQuery("SelectEmployee", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeEmployeeListOf_Deptid3(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("EmployeeListOf_Deptid3", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> execute_ColleagueDetails(Pageable pageable, java.lang.Integer selectedemployeedeptid, java.lang.Integer selectedemployeeid)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("selectedemployeedeptid", selectedemployeedeptid);
        params.put("selectedemployeeid", selectedemployeeid);
        return queryExecutor.executeNamedQuery("_ColleagueDetails", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeEmployeeSelectVar(Pageable pageable, java.lang.Integer SelectedEmployee)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SelectedEmployee", SelectedEmployee);
        return queryExecutor.executeNamedQuery("EmployeeSelectVar", params, pageable);
	}
	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeDepartmentCount(Pageable pageable)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return queryExecutor.executeNamedQuery("DepartmentCount", params, pageable);
	}

	@Transactional(value = "hrdbTransactionManager")
	@Override
	public Page<Object> executeWMCustomQuerySelect(CustomQuery query, Pageable pageable) {
	    return queryExecutor.executeCustomQuery(query, pageable);
	}

	@Transactional(value = "hrdbTransactionManager")
    @Override
    public int executeWMCustomQueryUpdate(CustomQuery query) {
        return queryExecutor.executeCustomQueryForUpdate(query);
    }
}

