package com.project2.socialmedia.dao;

import java.util.ArrayList;

public interface Select<T>
{
	T selectOne(int id);
	
	ArrayList<T> selectAll();
}
