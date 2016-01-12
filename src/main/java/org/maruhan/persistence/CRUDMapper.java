package org.maruhan.persistence;

import java.util.List;

public interface CRUDMapper<V,K> {
	public void create(V vo) throws Exception;
	public V read(K routeno) throws Exception;
	public List<V> list() throws Exception;
	public void delete(K routeno) throws Exception;
	public void update(V vo) throws Exception;
}
