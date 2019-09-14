package com.project2.socialmedia.dao;

import java.util.List;

public interface Select<T>
{
	T selectOne(int id);
	
	List<T> selectAll();
}
