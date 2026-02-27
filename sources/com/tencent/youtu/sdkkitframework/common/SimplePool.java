package com.tencent.youtu.sdkkitframework.common;

/* JADX INFO: loaded from: classes4.dex */
public class SimplePool<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f15823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15824b;

    public SimplePool(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f15823a = new Object[i];
    }

    public T acquire() {
        int i = this.f15824b;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f15823a;
        T t5 = (T) objArr[i4];
        objArr[i4] = null;
        this.f15824b = i4;
        return t5;
    }

    public boolean release(T t5) {
        int i = 0;
        while (true) {
            int i4 = this.f15824b;
            if (i >= i4) {
                Object[] objArr = this.f15823a;
                if (i4 >= objArr.length) {
                    return false;
                }
                objArr[i4] = t5;
                this.f15824b = i4 + 1;
                return true;
            }
            if (this.f15823a[i] == t5) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }
}
