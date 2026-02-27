package com.shield.android.t;

import We.s;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private final short rQ;
    private final short rR;
    private final long rS;
    private final long rT;
    private final long rU;
    private final long rV;
    private final String rW;
    private final int rX;

    /* JADX INFO: renamed from: com.shield.android.t.a$a, reason: collision with other inner class name */
    public static class C0080a implements Comparator<a> {
        private C0080a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(a aVar, a aVar2) {
            long jEE = aVar.eE();
            long jEE2 = aVar2.eE();
            if (jEE > jEE2) {
                return 1;
            }
            return jEE < jEE2 ? -1 : 0;
        }

        public /* synthetic */ C0080a(byte b8) {
            this();
        }
    }

    static {
        new C0080a((byte) 0);
    }

    private a(ByteBuffer byteBuffer, short s9, short s10, int i, int i4, long j, long j6, long j7, long j9, String str, int i6) {
        this.rQ = s9;
        this.rR = s10;
        this.rS = j;
        this.rT = j6;
        this.rU = j7;
        this.rV = j9;
        this.rW = str;
        this.rX = i6;
    }

    public static String c(ByteBuffer byteBuffer, int i, int i4) {
        byte[] bArrArray;
        int iArrayOffset;
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iArrayOffset = byteBuffer.arrayOffset() + i;
        } else {
            bArrArray = new byte[i4];
            int iPosition = byteBuffer.position();
            try {
                byteBuffer.position(i);
                byteBuffer.get(bArrArray);
                byteBuffer.position(iPosition);
                iArrayOffset = 0;
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                throw th2;
            }
        }
        return new String(bArrArray, iArrayOffset, i4, StandardCharsets.UTF_8);
    }

    public static a y(ByteBuffer byteBuffer) throws com.shield.android.v.a {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        if (byteBuffer.remaining() < 46) {
            throw new com.shield.android.v.a("Input too short. Need at least: 46 bytes, available: " + byteBuffer.remaining() + " bytes", new BufferUnderflowException());
        }
        int iPosition = byteBuffer.position();
        int i = byteBuffer.getInt();
        if (i != 33639248) {
            throw new com.shield.android.v.a("Not a Central Directory record. Signature: 0x" + Long.toHexString(((long) i) & KeyboardMap.kValueMask));
        }
        byteBuffer.position(iPosition + 8);
        short s9 = byteBuffer.getShort();
        short s10 = byteBuffer.getShort();
        int i4 = byteBuffer.getShort() & 65535;
        int i6 = byteBuffer.getShort() & 65535;
        long j = ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
        long j6 = ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
        long j7 = ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
        int i10 = byteBuffer.getShort() & 65535;
        int i11 = byteBuffer.getShort() & 65535;
        int i12 = 65535 & byteBuffer.getShort();
        byteBuffer.position(iPosition + 42);
        long j9 = ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
        byteBuffer.position(iPosition);
        int i13 = i10 + 46 + i11 + i12;
        if (i13 > byteBuffer.remaining()) {
            StringBuilder sbT = s.t(i13, "Input too short. Need: ", " bytes, available: ");
            sbT.append(byteBuffer.remaining());
            sbT.append(" bytes");
            throw new com.shield.android.v.a(sbT.toString(), new BufferUnderflowException());
        }
        String strC = c(byteBuffer, iPosition + 46, i10);
        byteBuffer.position(iPosition);
        int iLimit = byteBuffer.limit();
        int i14 = iPosition + i13;
        try {
            byteBuffer.limit(i14);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBuffer.limit(iLimit);
            byteBuffer.position(i14);
            return new a(byteBufferSlice, s9, s10, i4, i6, j, j6, j7, j9, strC, i10);
        } catch (Throwable th2) {
            byteBuffer.limit(iLimit);
            throw th2;
        }
    }

    public final short eA() {
        return this.rR;
    }

    public final long eB() {
        return this.rS;
    }

    public final long eC() {
        return this.rT;
    }

    public final long eD() {
        return this.rU;
    }

    public final long eE() {
        return this.rV;
    }

    public final String ex() {
        return this.rW;
    }

    public final int ey() {
        return this.rX;
    }

    public final short ez() {
        return this.rQ;
    }
}
