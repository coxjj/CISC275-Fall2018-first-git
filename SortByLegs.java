

import java.util.Comparator;

public class SortByLegs implements Comparator <Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.legs- o2.legs;

	}

}