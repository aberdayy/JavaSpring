package com.springBootProject.hibernateAndJpa.DataAccess;
import com.springBootProject.hibernateAndJpa.Entities.City;
import java.util.*;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
