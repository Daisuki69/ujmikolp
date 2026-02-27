package androidx.core.util;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T t5);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] pool;
        private int poolSize;

        public SimplePool(@IntRange(from = 1) int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.pool = new Object[i];
        }

        private final boolean isInPool(T t5) {
            int i = this.poolSize;
            for (int i4 = 0; i4 < i; i4++) {
                if (this.pool[i4] == t5) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i = this.poolSize;
            if (i <= 0) {
                return null;
            }
            int i4 = i - 1;
            T t5 = (T) this.pool[i4];
            j.e(t5, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i4] = null;
            this.poolSize--;
            return t5;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            j.g(instance, "instance");
            if (isInPool(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i = this.poolSize;
            Object[] objArr = this.pool;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = instance;
            this.poolSize = i + 1;
            return true;
        }
    }

    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object lock;

        public SynchronizedPool(int i) {
            super(i);
            this.lock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t5;
            synchronized (this.lock) {
                t5 = (T) super.acquire();
            }
            return t5;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            boolean zRelease;
            j.g(instance, "instance");
            synchronized (this.lock) {
                zRelease = super.release(instance);
            }
            return zRelease;
        }
    }

    private Pools() {
    }
}
