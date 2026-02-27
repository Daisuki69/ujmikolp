package mx_com.mixpanel.android.mpmetrics;

/* JADX INFO: loaded from: classes7.dex */
class SynchronizedReference<T> {
    private T mContents = null;

    public synchronized void set(T t5) {
        this.mContents = t5;
    }

    public synchronized T getAndClear() {
        T t5;
        t5 = this.mContents;
        this.mContents = null;
        return t5;
    }

    public synchronized T get() {
        return this.mContents;
    }
}
