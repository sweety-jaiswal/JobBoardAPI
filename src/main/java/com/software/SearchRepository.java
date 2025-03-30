package com.software;

import java.util.List;

public interface SearchRepository {

	List<Post> findByText(String text);
	
}
