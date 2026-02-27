package androidx.datastore.core;

import gj.InterfaceC1526a;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, InterfaceC1526a<? super T> interfaceC1526a);

    Object writeTo(T t5, OutputStream outputStream, InterfaceC1526a<? super Unit> interfaceC1526a);
}
