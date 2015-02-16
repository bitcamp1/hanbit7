package com.hanbit.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.web.dao.GuestDao;
@Service
public class GuestService {
@Autowired
private GuestDao mapper;
	

}
