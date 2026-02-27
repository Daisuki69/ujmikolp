package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface Schema<T> {
    boolean equals(T t5, T t10);

    int getSerializedSize(T t5);

    int hashCode(T t5);

    boolean isInitialized(T t5);

    void makeImmutable(T t5);

    void mergeFrom(T t5, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t5, T t10);

    void mergeFrom(T t5, byte[] bArr, int i, int i4, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t5, Writer writer) throws IOException;
}
