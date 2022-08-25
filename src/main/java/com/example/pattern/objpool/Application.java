package com.example.pattern.objpool;

import com.example.pattern.objpool.model.PooledObject;
import com.example.pattern.objpool.pool.ObjectPool;

public class Application {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject();
        System.out.println(pooledObject);
        objectPool.releasePooledObject(pooledObject);
    }
}
