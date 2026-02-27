package com.tencent.could.component.common.ai.utils;

/* JADX INFO: loaded from: classes4.dex */
public class SimplePool<T> {
    public static final String TAG = "SimplePool";
    public final Object[] pool;
    public String poolName;
    public int poolSize;

    public SimplePool(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.pool = new Object[i];
        this.poolName = str;
    }

    private boolean isInPool(T t5) {
        for (int i = 0; i < this.poolSize; i++) {
            if (this.pool[i] == t5) {
                return true;
            }
        }
        return false;
    }

    public T acquire() {
        int i = this.poolSize;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.pool;
        T t5 = (T) objArr[i4];
        objArr[i4] = null;
        this.poolSize = i4;
        return t5;
    }

    public boolean release(T t5) {
        if (isInPool(t5)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.poolSize;
        Object[] objArr = this.pool;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t5;
        this.poolSize = i + 1;
        return true;
    }
}
