/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test.java.com.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.test.annotation.type.IntegrationTest;

@Category(IntegrationTest.class)
public class EmptyIntegrationTest_1 {

	@Test
	@Category(com.test.annotation.type.IntegrationTest.class)
	public void emptyTest1() throws Exception {
		System.out.println();
	}
}