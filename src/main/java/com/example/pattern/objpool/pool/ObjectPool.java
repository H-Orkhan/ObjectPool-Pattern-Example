package com.example.pattern.objpool.pool;

import com.example.pattern.objpool.model.PooledObject;
import java.util.ArrayList;
import java.util.List;

public class ObjectPool {

    List<PooledObject> freeObjects = new ArrayList<>();
    List<PooledObject> usedObjects = new ArrayList<>();

    public PooledObject getPooledObject() {
        if (freeObjects.isEmpty()) {
            PooledObject pooledObject = new PooledObject("Orkhan", "Hashimov", "17-02-2000");
            usedObjects.add(pooledObject);
            return pooledObject;
        } else {
            PooledObject pooledObject = freeObjects.get(0);
            usedObjects.add(pooledObject);
            freeObjects.remove(pooledObject);
            return pooledObject;
        }
    }

    public void releasePooledObject(PooledObject pooledObject) {
        freeObjects.add(pooledObject);
        usedObjects.remove(pooledObject);
    }
}
