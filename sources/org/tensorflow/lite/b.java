package org.tensorflow.lite;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NativeInterpreterWrapperExperimental f18928a;

    public b(MappedByteBuffer mappedByteBuffer, a aVar) {
        NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = new NativeInterpreterWrapperExperimental(mappedByteBuffer, aVar);
        this.f18928a = nativeInterpreterWrapperExperimental;
        nativeInterpreterWrapperExperimental.f();
    }

    public final c b() {
        NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = this.f18928a;
        if (nativeInterpreterWrapperExperimental != null) {
            return nativeInterpreterWrapperExperimental.c(0);
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final void c(ByteBuffer byteBuffer, Object obj) {
        Object[] objArr = {byteBuffer};
        HashMap map = new HashMap();
        map.put(0, obj);
        NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = this.f18928a;
        if (nativeInterpreterWrapperExperimental == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
        nativeInterpreterWrapperExperimental.g(objArr, map);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental = this.f18928a;
        if (nativeInterpreterWrapperExperimental != null) {
            nativeInterpreterWrapperExperimental.close();
            this.f18928a = null;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
