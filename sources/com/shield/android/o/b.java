package com.shield.android.o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public final int pX;
    public final byte[] pY;
    public final byte[] pZ;

    public static class a {

        /* JADX INFO: renamed from: qa, reason: collision with root package name */
        public final int f15466qa;

        /* JADX INFO: renamed from: qb, reason: collision with root package name */
        public final byte f15467qb;

        /* JADX INFO: renamed from: qc, reason: collision with root package name */
        public final byte[] f15468qc;
        public final byte[] qd;

        public a(int i, byte b8, byte[] bArr, byte[] bArr2) {
            this.f15466qa = i;
            this.f15467qb = b8;
            this.f15468qc = bArr;
            this.qd = bArr2;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.o.b$b, reason: collision with other inner class name */
    public static class C0077b {
        public final byte[] qe;

        /* JADX INFO: renamed from: qf, reason: collision with root package name */
        public final byte[] f15469qf;

        /* JADX INFO: renamed from: qg, reason: collision with root package name */
        public final byte[] f15470qg;
        public final byte[] qh;

        /* JADX INFO: renamed from: qi, reason: collision with root package name */
        public final int f15471qi;

        /* JADX INFO: renamed from: qj, reason: collision with root package name */
        public final byte[] f15472qj;

        private C0077b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5) {
            this.qe = bArr;
            this.f15469qf = bArr2;
            this.f15470qg = bArr3;
            this.qh = bArr4;
            this.f15471qi = i;
            this.f15472qj = bArr5;
        }

        public static C0077b o(ByteBuffer byteBuffer) throws IOException {
            return new C0077b(b.n(byteBuffer), b.n(byteBuffer), b.n(byteBuffer), b.n(byteBuffer), byteBuffer.getInt(), b.n(byteBuffer));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: qk, reason: collision with root package name */
        public final byte[] f15473qk;

        public c(int i, byte[] bArr) {
            this.f15473qk = bArr;
        }
    }

    public b(int i, byte[] bArr, byte[] bArr2) {
        this.pX = i;
        this.pY = bArr;
        this.pZ = bArr2;
    }

    public static byte[] a(long j, a aVar, C0077b c0077b) {
        byte[] bArr = aVar.f15468qc;
        int length = (bArr == null ? 0 : bArr.length) + 21;
        byte[] bArr2 = aVar.qd;
        int length2 = (bArr2 == null ? 0 : bArr2.length) + 4 + length;
        byte[] bArr3 = c0077b.qe;
        int length3 = (bArr3 == null ? 0 : bArr3.length) + 4 + length2;
        byte[] bArr4 = c0077b.f15469qf;
        int length4 = (bArr4 == null ? 0 : bArr4.length) + 4 + length3;
        byte[] bArr5 = c0077b.f15470qg;
        int length5 = (bArr5 == null ? 0 : bArr5.length) + 4 + length4;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length5).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putInt(length5);
        byteBufferOrder.putLong(j);
        byteBufferOrder.putInt(aVar.f15466qa);
        byteBufferOrder.put(aVar.f15467qb);
        byte[] bArr6 = aVar.f15468qc;
        if (bArr6 == null) {
            byteBufferOrder.putInt(0);
        } else {
            byteBufferOrder.putInt(bArr6.length);
            byteBufferOrder.put(bArr6);
        }
        byte[] bArr7 = aVar.qd;
        if (bArr7 == null) {
            byteBufferOrder.putInt(0);
        } else {
            byteBufferOrder.putInt(bArr7.length);
            byteBufferOrder.put(bArr7);
        }
        byte[] bArr8 = c0077b.qe;
        if (bArr8 == null) {
            byteBufferOrder.putInt(0);
        } else {
            byteBufferOrder.putInt(bArr8.length);
            byteBufferOrder.put(bArr8);
        }
        byte[] bArr9 = c0077b.f15469qf;
        if (bArr9 == null) {
            byteBufferOrder.putInt(0);
        } else {
            byteBufferOrder.putInt(bArr9.length);
            byteBufferOrder.put(bArr9);
        }
        byte[] bArr10 = c0077b.f15470qg;
        if (bArr10 == null) {
            byteBufferOrder.putInt(0);
        } else {
            byteBufferOrder.putInt(bArr10.length);
            byteBufferOrder.put(bArr10);
        }
        return byteBufferOrder.array();
    }

    public static int b(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        a(inputStream, bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        try {
            byte[] bArr = new byte[4];
            a(inputStream, bArr);
            byte[] bArr2 = new byte[ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt()];
            a(inputStream, bArr2);
            return bArr2;
        } catch (EOFException unused) {
            return null;
        }
    }

    public static byte[] n(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new EOFException();
        }
        int i = byteBuffer.getInt();
        if (byteBuffer.remaining() < i) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static class d {
        public final C0077b ql;
        public final c[] qm;

        private d(C0077b c0077b) {
            this.ql = c0077b;
            this.qm = new c[0];
        }

        public static d g(byte[] bArr) throws IOException {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            C0077b c0077bO = C0077b.o(byteBufferOrder);
            if (!byteBufferOrder.hasRemaining()) {
                return new d(c0077bO);
            }
            ArrayList arrayList = new ArrayList(1);
            while (byteBufferOrder.hasRemaining()) {
                arrayList.add(new c(byteBufferOrder.getInt(), b.n(byteBufferOrder)));
            }
            return new d(c0077bO, (c[]) arrayList.toArray(new c[arrayList.size()]));
        }

        private d(C0077b c0077b, c... cVarArr) {
            this.ql = c0077b;
            this.qm = cVarArr;
        }
    }

    private static void a(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i4 = inputStream.read(bArr, i, length - i);
            if (i4 < 0) {
                throw new EOFException();
            }
            i += i4;
        }
    }
}
