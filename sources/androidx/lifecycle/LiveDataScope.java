package androidx.lifecycle;

import Bj.W;
import gj.InterfaceC1526a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface LiveDataScope<T> {
    Object emit(T t5, InterfaceC1526a<? super Unit> interfaceC1526a);

    Object emitSource(LiveData<T> liveData, InterfaceC1526a<? super W> interfaceC1526a);

    T getLatestValue();
}
