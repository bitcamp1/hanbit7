package com.hanbit.web.util;

import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.dao.CannotSerializeTransactionException;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jca.cci.InvalidResultSetAccessException;
import org.springframework.jdbc.BadSqlGrammarException;

public class DebugUtil {
	String msg;
	public void showDebugMsg(){
		final Logger LOGGER = Logger.getLogger(DebugUtil.class);
		try {
			
		} catch (Exception ex) {
			if (ex instanceof DataAccessException) {

			       SQLException se = (SQLException) ((DataAccessException) ex).getRootCause();

			       msg = se.getMessage();

			       LOGGER.debug("****** DataAccessException : {} // {}");

			}



			if (ex instanceof BadSqlGrammarException) {

			       SQLException se = ((BadSqlGrammarException) ex).getSQLException();

			       LOGGER.debug("**BadSqlGrammarException {} ");

			}

			else if (ex instanceof InvalidResultSetAccessException) {


			       LOGGER.debug("**InvalidResultSetAccessException {} ");

			}

			else if (ex instanceof DuplicateKeyException) {

			       LOGGER.debug("**DuplicateKeyException {} ");

			}

			else if (ex instanceof DataIntegrityViolationException) {

			       LOGGER.debug("**DataIntegrityViolationException {} ");

			}

			else if (ex instanceof DataAccessResourceFailureException) {

			       LOGGER.debug("**DataAccessResourceFailureException {} ");

			}

			else if (ex instanceof CannotAcquireLockException) {

			       LOGGER.debug("**CannotAcquireLockException {} ");

			}

			else if (ex instanceof DeadlockLoserDataAccessException) {

			       LOGGER.debug("**DeadlockLoserDataAccessException {} ");

			}

			else if (ex instanceof CannotSerializeTransactionException) {

			       LOGGER.debug("**CannotSerializeTransactionException {} ");

			}
		}
		
	}
}
