package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import zj.C2581c;

/* JADX INFO: loaded from: classes5.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        j.g(str, "<this>");
        byte[] bytes = str.getBytes(C2581c.f21468b);
        j.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        j.g(bArr, "<this>");
        return new String(bArr, C2581c.f21468b);
    }

    public static final <T> T withLock(ReentrantLock reentrantLock, Function0<? extends T> action) {
        j.g(reentrantLock, "<this>");
        j.g(action, "action");
        reentrantLock.lock();
        try {
            return (T) action.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
