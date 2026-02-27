package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
final class Pools {
    private static final boolean DEBUG = false;

    public interface Pool<T> {
        T acquire();

        boolean release(T t5);

        void releaseAll(T[] tArr, int i);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[i];
        }

        private boolean isInPool(T t5) {
            for (int i = 0; i < this.mPoolSize; i++) {
                if (this.mPool[i] == t5) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public T acquire() {
            int i = this.mPoolSize;
            if (i <= 0) {
                return null;
            }
            int i4 = i - 1;
            Object[] objArr = this.mPool;
            T t5 = (T) objArr[i4];
            objArr[i4] = null;
            this.mPoolSize = i - 1;
            return t5;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t5) {
            int i = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t5;
            this.mPoolSize = i + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i4 = 0; i4 < i; i4++) {
                T t5 = tArr[i4];
                int i6 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i6 < objArr.length) {
                    objArr[i6] = t5;
                    this.mPoolSize = i6 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
