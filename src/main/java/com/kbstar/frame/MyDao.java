package com.kbstar.frame;

import java.util.List;

public interface MyDao<K, V> {
    public void insert(V v);
    //무엇을 insert할 거냐? 그게 바로 DTO
    public void delete(K k);
    public V select(K k);
    public List<V> get();

}
