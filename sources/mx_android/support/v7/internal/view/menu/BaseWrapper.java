package mx_android.support.v7.internal.view.menu;

/* JADX INFO: loaded from: classes7.dex */
class BaseWrapper<T> {
    final T mWrappedObject;

    BaseWrapper(T t5) {
        if (t5 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.mWrappedObject = t5;
    }

    public T getWrappedObject() {
        return this.mWrappedObject;
    }
}
