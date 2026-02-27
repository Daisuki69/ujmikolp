package com.shield.android.t;

import We.s;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private static final ByteBuffer f15492se = ByteBuffer.allocate(0);
    private final String rY;
    private final long rZ;
    private final int sa;

    /* JADX INFO: renamed from: sb, reason: collision with root package name */
    private final long f15493sb;

    /* JADX INFO: renamed from: sc, reason: collision with root package name */
    private final boolean f15494sc;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final long f15495sd;

    public static class a implements com.shield.android.u.a, Closeable, AutoCloseable {

        /* JADX INFO: renamed from: sf, reason: collision with root package name */
        private final com.shield.android.u.a f15496sf;

        /* JADX INFO: renamed from: sg, reason: collision with root package name */
        private Inflater f15497sg;

        /* JADX INFO: renamed from: sh, reason: collision with root package name */
        private byte[] f15498sh;

        /* JADX INFO: renamed from: si, reason: collision with root package name */
        private byte[] f15499si;

        /* JADX INFO: renamed from: sj, reason: collision with root package name */
        private long f15500sj;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private boolean f15501sk;

        public /* synthetic */ a(com.shield.android.u.a aVar, byte b8) {
            this(aVar);
        }

        @Override // com.shield.android.u.a
        public final void a(byte[] bArr, int i, int i4) throws IOException {
            if (this.f15501sk) {
                throw new IllegalStateException("Closed");
            }
            this.f15497sg.setInput(bArr, i, i4);
            if (this.f15498sh == null) {
                this.f15498sh = new byte[65536];
            }
            while (!this.f15497sg.finished()) {
                try {
                    int iInflate = this.f15497sg.inflate(this.f15498sh);
                    if (iInflate == 0) {
                        return;
                    }
                    this.f15496sf.a(this.f15498sh, 0, iInflate);
                    this.f15500sj += (long) iInflate;
                } catch (DataFormatException e) {
                    throw new IOException("Failed to inflate data", e);
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f15501sk = true;
            this.f15499si = null;
            this.f15498sh = null;
            Inflater inflater = this.f15497sg;
            if (inflater != null) {
                inflater.end();
                this.f15497sg = null;
            }
        }

        public final long eF() {
            return this.f15500sj;
        }

        @Override // com.shield.android.u.a
        public final void v(ByteBuffer byteBuffer) throws IOException {
            if (this.f15501sk) {
                throw new IllegalStateException("Closed");
            }
            if (byteBuffer.hasArray()) {
                a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            if (this.f15499si == null) {
                this.f15499si = new byte[65536];
            }
            while (byteBuffer.hasRemaining()) {
                int iMin = Math.min(byteBuffer.remaining(), this.f15499si.length);
                byteBuffer.get(this.f15499si, 0, iMin);
                a(this.f15499si, 0, iMin);
            }
        }

        private a(com.shield.android.u.a aVar) {
            this.f15497sg = new Inflater(true);
            this.f15496sf = aVar;
        }
    }

    private b(String str, int i, ByteBuffer byteBuffer, long j, long j6, int i4, long j7, boolean z4, long j9) {
        this.rY = str;
        this.rZ = j;
        this.sa = i4;
        this.f15493sb = j7;
        this.f15494sc = z4;
        this.f15495sd = j9;
    }

    private static b a(com.shield.android.u.b bVar, com.shield.android.t.a aVar, long j, boolean z4, boolean z5) throws com.shield.android.v.a, IOException {
        String strEx = aVar.ex();
        int iEy = aVar.ey();
        int i = iEy + 30;
        long jEE = aVar.eE();
        long j6 = ((long) i) + jEE;
        if (j6 > j) {
            StringBuilder sb2 = new StringBuilder("Local File Header of ");
            sb2.append(strEx);
            sb2.append(" extends beyond start of Central Directory. LFH end: ");
            sb2.append(j6);
            throw new com.shield.android.v.a(androidx.media3.datasource.cache.c.j(j, ", CD start: ", sb2));
        }
        try {
            ByteBuffer byteBufferA = bVar.a(jEE, i);
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            int i4 = byteBufferA.getInt();
            if (i4 != 67324752) {
                StringBuilder sbW = s.w("Not a Local File Header record for entry ", strEx, ". Signature: 0x");
                sbW.append(Long.toHexString(((long) i4) & KeyboardMap.kValueMask));
                throw new com.shield.android.v.a(sbW.toString());
            }
            boolean z8 = (byteBufferA.getShort(6) & 8) != 0;
            boolean z9 = (aVar.ez() & 8) != 0;
            if (z8 != z9) {
                throw new com.shield.android.v.a("Data Descriptor presence mismatch between Local File Header and Central Directory for entry " + strEx + ". LFH: " + z8 + ", CD: " + z9);
            }
            long jEB = aVar.eB();
            long jEC = aVar.eC();
            long jED = aVar.eD();
            if (!z8) {
                long j7 = ((long) byteBufferA.getInt(14)) & KeyboardMap.kValueMask;
                if (j7 != jEB) {
                    StringBuilder sb3 = new StringBuilder("CRC-32 mismatch between Local File Header and Central Directory for entry ");
                    sb3.append(strEx);
                    sb3.append(". LFH: ");
                    sb3.append(j7);
                    throw new com.shield.android.v.a(androidx.media3.datasource.cache.c.j(jEB, ", CD: ", sb3));
                }
                long j9 = ((long) byteBufferA.getInt(18)) & KeyboardMap.kValueMask;
                if (j9 != jEC) {
                    StringBuilder sb4 = new StringBuilder("Compressed size mismatch between Local File Header and Central Directory for entry ");
                    sb4.append(strEx);
                    sb4.append(". LFH: ");
                    sb4.append(j9);
                    throw new com.shield.android.v.a(androidx.media3.datasource.cache.c.j(jEC, ", CD: ", sb4));
                }
                long j10 = ((long) byteBufferA.getInt(22)) & KeyboardMap.kValueMask;
                if (j10 != jED) {
                    StringBuilder sb5 = new StringBuilder("Uncompressed size mismatch between Local File Header and Central Directory for entry ");
                    sb5.append(strEx);
                    sb5.append(". LFH: ");
                    sb5.append(j10);
                    throw new com.shield.android.v.a(androidx.media3.datasource.cache.c.j(jED, ", CD: ", sb5));
                }
            }
            int i6 = byteBufferA.getShort(26) & 65535;
            if (i6 > iEy) {
                throw new com.shield.android.v.a(s.o(androidx.camera.core.impl.a.r(i6, "Name mismatch between Local File Header and Central Directory for entry", strEx, ". LFH: ", " bytes, CD: "), " bytes", iEy));
            }
            String strC = com.shield.android.t.a.c(byteBufferA, 30, i6);
            if (!strEx.equals(strC)) {
                throw new com.shield.android.v.a(s.l("Name mismatch between Local File Header and Central Directory. LFH: \"", strC, "\", CD: \"", strEx, "\""));
            }
            int i10 = byteBufferA.getShort(28) & 65535;
            long j11 = jEE + 30 + ((long) i6) + ((long) i10);
            boolean z10 = aVar.eA() != 0;
            if (!z10) {
                jEC = jED;
            }
            long j12 = j11 + jEC;
            if (j12 <= j) {
                return new b(strEx, iEy, f15492se, jEE, j12 - jEE, 30 + i6 + i10, jEC, z10, jED);
            }
            StringBuilder sb6 = new StringBuilder("Local File Header data of ");
            sb6.append(strEx);
            sb6.append(" overlaps with Central Directory. LFH data start: ");
            sb6.append(j11);
            androidx.media3.datasource.cache.c.z(sb6, ", LFH data end: ", j12, ", CD start: ");
            sb6.append(j);
            throw new com.shield.android.v.a(sb6.toString());
        } catch (IOException e) {
            throw new IOException(AbstractC1414e.h("Failed to read Local File Header of ", strEx), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: IOException -> 0x00aa, TryCatch #0 {IOException -> 0x00aa, blocks: (B:6:0x002d, B:33:0x00ae, B:26:0x0087, B:28:0x008f, B:29:0x00a9, B:32:0x00ad, B:8:0x0031, B:13:0x0048, B:25:0x0086, B:24:0x0083), top: B:46:0x002d, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[Catch: IOException -> 0x00aa, TryCatch #0 {IOException -> 0x00aa, blocks: (B:6:0x002d, B:33:0x00ae, B:26:0x0087, B:28:0x008f, B:29:0x00a9, B:32:0x00ad, B:8:0x0031, B:13:0x0048, B:25:0x0086, B:24:0x0083), top: B:46:0x002d, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(com.shield.android.u.b r14, com.shield.android.t.a r15, long r16) throws com.shield.android.v.a, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.t.b.a(com.shield.android.u.b, com.shield.android.t.a, long):byte[]");
    }
}
