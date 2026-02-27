package com.tencent.could.huiyansdk.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes4.dex */
public class h<T> implements Pools.Pool<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f15740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15741b;

    public h(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f15740a = new Object[i];
    }

    @Override // androidx.core.util.Pools.Pool
    @Nullable
    public T acquire() {
        int i = this.f15741b;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f15740a;
        T t5 = (T) objArr[i4];
        objArr[i4] = null;
        this.f15741b = i4;
        return t5;
    }

    @Override // androidx.core.util.Pools.Pool
    public boolean release(@NonNull T t5) {
        int i = 0;
        while (true) {
            int i4 = this.f15741b;
            if (i >= i4) {
                Object[] objArr = this.f15740a;
                if (i4 >= objArr.length) {
                    return false;
                }
                objArr[i4] = t5;
                this.f15741b = i4 + 1;
                return true;
            }
            if (this.f15740a[i] == t5) {
                throw new IllegalStateException("Already in the pool!");
            }
            i++;
        }
    }
}
