package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> delegate) {
        j.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(BufferedSource bufferedSource, InterfaceC1526a<? super T> interfaceC1526a) {
        return this.delegate.readFrom(bufferedSource.inputStream(), interfaceC1526a);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t5, BufferedSink bufferedSink, InterfaceC1526a<? super Unit> interfaceC1526a) {
        Object objWriteTo = this.delegate.writeTo(t5, bufferedSink.outputStream(), interfaceC1526a);
        return objWriteTo == EnumC1578a.f17050a ? objWriteTo : Unit.f18162a;
    }
}
