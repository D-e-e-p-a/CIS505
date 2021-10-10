package Module_6;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {

	private List<Composer> composers = new ArrayList<Composer>();
	int size = composers.size();

	MemComposerDao() {
		composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
		composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
		composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
		composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
		composers.add(new Composer(1011, "Richard Wagner", "Classical"));

	}

	@Override
	public List<Composer> findall() {
		List<Composer> findList = new ArrayList<>();
		// System.out.println(size);

		for (Composer c : composers)
			findList.add(c);

		return findList;
	}

	@Override
	public Composer findBy(Integer key) {
		Composer composer = null;
		for (Composer c : composers) {
			if (c.getId() == key)
				composer = c;
		}
		return composer;
	}

	@Override
	public void insert(Composer entity) {
		composers.add(entity);
	}

}
