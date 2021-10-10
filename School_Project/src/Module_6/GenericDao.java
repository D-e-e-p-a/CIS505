package Module_6;

import java.util.List;



public interface GenericDao<E, K> {
	List<E> findall();
	E findBy(K key);
	void insert(E entity);

}
