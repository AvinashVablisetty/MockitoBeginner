package com.avinash.mockito.testCases;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class ListInterfaceTest {

	@Test
	public void testListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void testListSizeMethodMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3); //Multiple return
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
	}
	
	@Test
	public void testListgetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("anything");//Argument Matchers
		assertEquals("anything",listMock.get(3));
		assertEquals("anything",listMock.get(1));
	}
	
	@Test(expected=RuntimeException.class)
	public void testForException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Run time exception"));//Exception
		listMock.get(0);
	}

}
