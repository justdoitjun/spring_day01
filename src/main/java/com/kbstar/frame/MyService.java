package com.kbstar.frame;

import java.util.List;

public interface MyService<K, V> {
    public void register(V v);
    public void delete(K k);
    public V get(K K);
   public List<V> get();


    }

}
