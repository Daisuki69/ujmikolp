package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class LiveDataKt {
    @MainThread
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner lifecycleOwner, final Function1<? super T, Unit> function1) {
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t5) {
                function1.invoke(t5);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return observer;
    }
}
