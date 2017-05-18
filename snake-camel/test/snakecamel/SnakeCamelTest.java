package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelTest {
	@Test
	public void snakeToCamelcaseをsnakeケースで呼び出すとCamelケースが返ってくる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "itoHaruka";
		String actual = scu.snakeToCamelcase("ito_haruka");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void camelToSnakecaseをcamelケースで呼び出すとSnakeケースが返ってくる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "ito_haruka";
		String actual = scu.camelToSnakecase("itoHaruka");
		assertThat(actual,is(expected));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void snakeToCamelcaseをcamelケースで呼び出した時IllegalArgumentExceptionを検出する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.snakeToCamelcase("itoHaruka");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void camelToSnakecaseをsnakeケース呼び出した時IllegalArgumentExceptionを検出する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.camelToSnakecase("ito_haruka");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void capitalizeをcamelケースで呼び出した時IllegalArgumentExceptionを検出する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.capitalize("Haruka");
	}

	@Test(expected = IllegalArgumentException.class)
	public void uncapitalizeをsnakeケースで呼び出した時IllegalArgumentExceptionを検出する() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		scu.uncapitalize("haruka");
	}
}
