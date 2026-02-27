package androidx.datastore.core.okio;

import gj.InterfaceC1526a;
import kotlin.Unit;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(BufferedSource bufferedSource, InterfaceC1526a<? super T> interfaceC1526a);

    Object writeTo(T t5, BufferedSink bufferedSink, InterfaceC1526a<? super Unit> interfaceC1526a);
}
