package h2;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: h2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1534d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16859b = f.h(UUID.randomUUID().toString() + System.currentTimeMillis());
    public static final AtomicLong c = new AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16860a;

    public C1534d() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b8 = bArrArray[0];
        byte b10 = bArrArray[1];
        byte b11 = bArrArray[2];
        byte b12 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b13 = bArrA[0];
        byte b14 = bArrA[1];
        byte[] bArrA2 = a(c.incrementAndGet());
        byte b15 = bArrA2[0];
        byte b16 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        String strE = f.e(new byte[]{b8, b10, b11, b12, b13, b14, b15, b16, bArrA3[0], bArrA3[1]});
        Locale locale = Locale.US;
        this.f16860a = String.format(locale, "%s%s%s%s", strE.substring(0, 12), strE.substring(12, 16), strE.subSequence(16, 20), f16859b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f16860a;
    }
}
