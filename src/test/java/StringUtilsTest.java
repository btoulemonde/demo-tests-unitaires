import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dev.utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
		int resultat = StringUtils.levenshteinDistance("avion", "aviron");

		assertEquals(1, resultat);

		

	}
	
	@Test
	public void testLevenshteinDistance2() {
		int resultat = StringUtils.levenshteinDistance("distance", "instance");

		assertEquals(2, resultat);
	}
	
	@Test
	public void testLevenshteinDistancesupp() {
		int resultat = StringUtils.levenshteinDistance("chien", "chiens");

		assertEquals(1, resultat);
	}
	@Test
	public void testLevenshteinDistanceinv() {
		int resultat = StringUtils.levenshteinDistance("machins", "machine");

		assertEquals(1, resultat);
	}
	@Test
	public void testLevenshteinDistancenull() {
		int resultat = StringUtils.levenshteinDistance(null, "machine");

		assertEquals(0, resultat);
	}
}
