/**
 [The "BSD license"]
 Copyright (c) 2013-2017 jinhong zhou (周金红)
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
     notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
     notice, this list of conditions and the following disclaimer in the
     documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
     derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.imwot.db.sql;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

/**
 * sql
 * 
 * @author jinhong zhou
 */
public abstract class AbstractSqlOperator extends AbstractTransactionSqlOperator {

	/**
	 * spirng SimpleJdbcTemplate
	 */
	protected SimpleJdbcTemplate simpleJdbcTemplate;

	/**
	 * 
	 * 插入、更新数据
	 * 
	 * @param sql
	 * @return int
	 * @exception/throws
	 */
	public int update(String sql) {
		return this.simpleJdbcTemplate.update(sql);
	}

	/**
	 * 
	 * 插入、更新数据
	 * 
	 * @param sql
	 * @return int
	 * @exception/throws
	 */
	@SuppressWarnings("rawtypes")
	public int[] updateBach(String sql, Map[] maps) {
		return this.simpleJdbcTemplate.batchUpdate(sql, maps);
	}

	/**
	 * 
	 * 插入、更新数据
	 * 
	 * @param sql
	 * @param object
	 * @return int
	 * @exception/throws
	 */
	public int update(String sql, Object object) {
		return this.simpleJdbcTemplate.update(sql, object);
	}

	/**
	 * @param sql
	 * @param object
	 * @return
	 */
	public int update(String sql, Object... object) {
		return this.simpleJdbcTemplate.update(sql, object);
	}

	/**
	 * 
	 * 插入、更新数据〉
	 * 
	 * @param sql
	 * @param map
	 * @return int
	 * @exception/throws
	 */
	public int update(String sql, Map<String, Object> map) {
		return this.simpleJdbcTemplate.update(sql, map);
	}

	/**
	 * 此方法覆盖父类的方法
	 * 
	 * @see com.mifeng.iService.db.sql.ISqlOperator#queryForList(java.lang.String)
	 */
	public List<Map<String, Object>> queryForList(String sql) {
		return this.simpleJdbcTemplate.queryForList(sql);
	}

	/**
	 * 
	 * 查询新数据
	 * 
	 * @param sql
	 * @return List<Map<String,Object>>
	 * @exception/throws
	 */
	public List<Map<String, Object>> queryForList(String sql, Object object) {
		return this.simpleJdbcTemplate.queryForList(sql, object);
	}

	/**
	 * 
	 * 查询新数据
	 * 
	 * @param sql
	 * @return Map<String,Object>
	 * @exception/throws
	 */
	public Map<String, Object> queryForMap(String sql) {
		return this.simpleJdbcTemplate.queryForMap(sql);
	}

	/**
	 * 
	 * 查询数据
	 * 
	 * @param sql
	 * @param object
	 * @return Map<String,Object>
	 * @exception/throws
	 */
	public Map<String, Object> queryForMap(String sql, Object object) {
		return this.simpleJdbcTemplate.queryForMap(sql, object);
	}

	/**
	 * 
	 * 统计数量
	 * 
	 * @param sql
	 * @return int
	 * @exception/throws
	 */
	public int queryForInt(String sql) {
		return this.simpleJdbcTemplate.queryForInt(sql);
	}

	/**
	 * 
	 * 统计数量
	 * 
	 * @param sql
	 * @param object
	 * @return int
	 * @exception/throws
	 */
	public int queryForInt(String sql, Object object) {
		return this.simpleJdbcTemplate.queryForInt(sql, object);
	}
}