package com.project2.socialmedia.dao;

import java.util.List;
/**
 * A generic interface to implement a designated class.
 * @author Nick, Ilia, Danny and Fausto.
 *
 * @param <T>
 */
public interface Select<T>
{
	T selectOne(int id);
	
	List<T> selectAll();
}
