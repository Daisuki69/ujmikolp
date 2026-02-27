package com.shield.android.t;

import We.s;
import com.shield.android.r.h;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static long A(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return ((long) byteBuffer.getInt(byteBuffer.position() + 12)) & KeyboardMap.kValueMask;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    public static int B(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return byteBuffer.getShort(byteBuffer.position() + 10) & 65535;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    private static int C(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i = iCapacity - 22;
        int iMin = Math.min(i, 65535);
        for (int i4 = 0; i4 <= iMin; i4++) {
            int i6 = i - i4;
            if (byteBuffer.getInt(i6) == 101010256 && (byteBuffer.getShort(i6 + 20) & 65535) == i4) {
                return i6;
            }
        }
        return -1;
    }

    private static h<ByteBuffer, Long> a(com.shield.android.u.b bVar, int i) throws IOException {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(s.f(i, "maxCommentSize: "));
        }
        long jEs = bVar.es();
        if (jEs < 22) {
            return null;
        }
        int iMin = ((int) Math.min(i, jEs - 22)) + 22;
        long j = jEs - ((long) iMin);
        ByteBuffer byteBufferA = bVar.a(j, iMin);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferA.order(byteOrder);
        int iC = C(byteBufferA);
        if (iC == -1) {
            return null;
        }
        byteBufferA.position(iC);
        ByteBuffer byteBufferSlice = byteBufferA.slice();
        byteBufferSlice.order(byteOrder);
        return h.a(byteBufferSlice, Long.valueOf(j + ((long) iC)));
    }

    public static h<ByteBuffer, Long> e(com.shield.android.u.b bVar) throws IOException {
        if (bVar.es() < 22) {
            return null;
        }
        h<ByteBuffer, Long> hVarA = a(bVar, 0);
        return hVarA != null ? hVarA : a(bVar, 65535);
    }

    public static long z(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & KeyboardMap.kValueMask;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    public static List<a> a(com.shield.android.u.b bVar, com.shield.android.v.b bVar2) throws IOException, com.shield.android.i.a {
        long jEH = bVar2.eH();
        if (jEH <= 2147483647L) {
            long jEG = bVar2.eG();
            ByteBuffer byteBufferA = bVar.a(jEG, (int) jEH);
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            int iEI = bVar2.eI();
            ArrayList arrayList = new ArrayList(iEI);
            for (int i = 0; i < iEI; i++) {
                int iPosition = byteBufferA.position();
                try {
                    a aVarY = a.y(byteBufferA);
                    if (!aVarY.ex().endsWith("/")) {
                        arrayList.add(aVarY);
                    }
                } catch (com.shield.android.v.a e) {
                    throw new com.shield.android.i.a("Malformed ZIP Central Directory record #" + (i + 1) + " at file offset " + (jEG + ((long) iPosition)), e);
                }
            }
            return arrayList;
        }
        throw new com.shield.android.i.a(androidx.camera.core.impl.a.f(jEH, "ZIP Central Directory too large: "));
    }

    public static void a(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            int iPosition = byteBuffer.position() + 16;
            if (j >= 0 && j <= KeyboardMap.kValueMask) {
                byteBuffer.putInt(iPosition, (int) j);
                return;
            }
            throw new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "uint32 value of out range: "));
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
}
