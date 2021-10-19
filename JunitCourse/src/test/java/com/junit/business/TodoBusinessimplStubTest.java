package com.junit.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.junit.business.imp.TodoBusinessImpl;
import com.junit.data.api.TodoService;
import com.junit.data.api.TodoServiceStub;

public class TodoBusinessimplStubTest {

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredList = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	
		assertEquals(2, filteredList.size());
	}

}
