/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.hwc.data.masterdata.registrar;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "m_beneficiaryincomestatus")
public class IncomeStatusMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	@Column(name = "IncomeStatusID")
	private Short incomeStatusID;
	@Expose
	@Column(name = "IncomeStatus")
	private String incomeStatus;
	@Expose
	@Column(name = "Deleted")
	private Boolean deleted;

	public IncomeStatusMaster() {
	}

	public IncomeStatusMaster(Short incomeStatusID, String incomeStatus) {
		this.incomeStatusID = incomeStatusID;
		this.incomeStatus = incomeStatus;
	}

	public static ArrayList<IncomeStatusMaster> getIncomeStatusMasterData(ArrayList<Object[]> resList) {
		ArrayList<IncomeStatusMaster> resArray = new ArrayList<>();
		for (Object[] obj : resList) {
			IncomeStatusMaster cOBJ = new IncomeStatusMaster((Short) obj[0], (String) obj[1]);
			resArray.add(cOBJ);
		}
		return resArray;
	}
}
