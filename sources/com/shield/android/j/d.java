package com.shield.android.j;

import A7.l;
import We.s;
import com.shield.android.i.d;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final char[] oR = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: com.shield.android.j.d$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] oS;

        static {
            int[] iArr = new int[f.values().length];
            oS = iArr;
            try {
                iArr[f.CHUNKED_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                oS[f.CHUNKED_SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                oS[f.VERITY_CHUNKED_SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static <T extends e> List<T> a(List<T> list, int i, int i4, boolean z4) throws g {
        HashMap map = new HashMap();
        int i6 = Integer.MAX_VALUE;
        for (T t5 : list) {
            h hVar = t5.oT;
            int iDK = z4 ? hVar.dK() : hVar.dJ();
            if (iDK <= i4) {
                if (iDK < i6) {
                    i6 = iDK;
                }
                e eVar = (e) map.get(Integer.valueOf(iDK));
                if (eVar != null) {
                    h hVar2 = eVar.oT;
                    f fVarDG = hVar.dG();
                    f fVarDG2 = hVar2.dG();
                    int[] iArr = AnonymousClass1.oS;
                    int i10 = iArr[fVarDG.ordinal()];
                    if (i10 == 1) {
                        int i11 = iArr[fVarDG2.ordinal()];
                        if (i11 != 1 && i11 != 2 && i11 != 3) {
                            throw new IllegalArgumentException("Unknown alg2: " + fVarDG2);
                        }
                    } else if (i10 == 2) {
                        int i12 = iArr[fVarDG2.ordinal()];
                        if (i12 != 1) {
                            if (i12 == 2) {
                                continue;
                            } else if (i12 != 3) {
                                throw new IllegalArgumentException("Unknown alg2: " + fVarDG2);
                            }
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalArgumentException("Unknown alg1: " + fVarDG);
                        }
                        int i13 = iArr[fVarDG2.ordinal()];
                        if (i13 != 1) {
                            if (i13 != 2 && i13 != 3) {
                                throw new IllegalArgumentException("Unknown alg2: " + fVarDG2);
                            }
                        }
                    }
                }
                map.put(Integer.valueOf(iDK), t5);
            }
        }
        if (i < i6) {
            throw new g(androidx.camera.core.impl.a.c(i6, i, "Minimum provided signature version ", " > minSdkVersion "));
        }
        if (map.isEmpty()) {
            throw new g("No supported signature");
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new l(7));
        return arrayList;
    }

    private static ByteBuffer c(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(s.f(i, "size: "));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i4 = i + iPosition;
        if (i4 < iPosition || i4 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i4);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i4);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static String f(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length << 1);
        for (byte b8 : bArr) {
            char[] cArr = oR;
            sb2.append(cArr[(b8 & 255) >>> 4]);
            sb2.append(cArr[b8 & 15]);
        }
        return sb2.toString();
    }

    public static byte[] g(List<com.shield.android.r.h<Integer, byte[]>> list) {
        Iterator<com.shield.android.r.h<Integer, byte[]>> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().eu().length + 12;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (com.shield.android.r.h<Integer, byte[]> hVar : list) {
            byte[] bArrEu = hVar.eu();
            byteBufferAllocate.putInt(bArrEu.length + 8);
            byteBufferAllocate.putInt(hVar.et().intValue());
            byteBufferAllocate.putInt(bArrEu.length);
            byteBufferAllocate.put(bArrEu);
        }
        return byteBufferAllocate.array();
    }

    public static void j(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static ByteBuffer k(ByteBuffer byteBuffer) throws com.shield.android.i.a {
        if (byteBuffer.remaining() < 4) {
            throw new com.shield.android.i.a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return c(byteBuffer, i);
        }
        StringBuilder sbT = s.t(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        sbT.append(byteBuffer.remaining());
        throw new com.shield.android.i.a(sbT.toString());
    }

    public static byte[] l(ByteBuffer byteBuffer) throws com.shield.android.i.a {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new com.shield.android.i.a("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbT = s.t(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbT.append(byteBuffer.remaining());
        throw new com.shield.android.i.a(sbT.toString());
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) throws j {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i4 = 0;
        while (byteBufferA.hasRemaining()) {
            i4++;
            if (byteBufferA.remaining() < 8) {
                throw new j(s.f(i4, "Insufficient data to read size of APK Signing Block entry #"));
            }
            long j = byteBufferA.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new j("APK Signing Block entry #" + i4 + " size out of range: " + j);
            }
            int i6 = (int) j;
            int iPosition = byteBufferA.position() + i6;
            if (i6 > byteBufferA.remaining()) {
                StringBuilder sbU = s.u("APK Signing Block entry #", i4, " size out of range: ", i6, ", available: ");
                sbU.append(byteBufferA.remaining());
                throw new j(sbU.toString());
            }
            if (byteBufferA.getInt() == i) {
                return c(byteBufferA, i6 - 4);
            }
            byteBufferA.position(iPosition);
        }
        throw new j(s.f(i, "No APK Signature Scheme block in APK Signing Block with ID: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(e eVar, e eVar2) {
        return Integer.compare(eVar.oT.dF(), eVar2.oT.dF());
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i4) {
        if (i4 >= 8) {
            int iCapacity = byteBuffer.capacity();
            if (i4 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i4);
                    byteBuffer.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i4, iCapacity, "end > capacity: ", " > "));
        }
        throw new IllegalArgumentException(s.g(i4, "end < start: ", " < 8"));
    }

    public static i a(com.shield.android.u.b bVar, com.shield.android.v.b bVar2, int i) throws j, IOException {
        try {
            long jEG = bVar2.eG();
            long jEH = bVar2.eH() + jEG;
            long jEJ = bVar2.eJ();
            if (jEH != jEJ) {
                throw new com.shield.android.i.b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + jEH + ", EoCD start: " + jEJ);
            }
            if (jEG >= 32) {
                ByteBuffer byteBufferA = bVar.a(jEG - 24, 24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferA.order(byteOrder);
                if (byteBufferA.getLong(8) == 2334950737559900225L && byteBufferA.getLong(16) == 3617552046287187010L) {
                    long j = byteBufferA.getLong(0);
                    if (j < byteBufferA.capacity() || j > 2147483639) {
                        throw new com.shield.android.i.b("APK Signing Block size out of range: " + j);
                    }
                    long j6 = (int) (8 + j);
                    long j7 = jEG - j6;
                    if (j7 >= 0) {
                        ByteBuffer byteBufferA2 = bVar.a(j7, 8);
                        byteBufferA2.order(byteOrder);
                        long j9 = byteBufferA2.getLong(0);
                        if (j9 == j) {
                            d.a aVar = new d.a(j7, bVar.b(j7, j6));
                            long jDc = aVar.dc();
                            com.shield.android.u.b bVarDd = aVar.dd();
                            ByteBuffer byteBufferA3 = bVarDd.a(0L, (int) bVarDd.es());
                            byteBufferA3.order(byteOrder);
                            return new i(b(byteBufferA3, i), jDc, bVar2.eG(), bVar2.eJ(), bVar2.eK());
                        }
                        throw new com.shield.android.i.b("APK Signing Block sizes in header and footer do not match: " + j9 + " vs " + j);
                    }
                    throw new com.shield.android.i.b("APK Signing Block offset out of range: " + j7);
                }
                throw new com.shield.android.i.b("No APK Signing Block before ZIP Central Directory");
            }
            throw new com.shield.android.i.b("APK too small for APK Signing Block. ZIP Central Directory offset: " + jEG);
        } catch (com.shield.android.i.b e) {
            throw new j(e.getMessage(), e);
        }
    }
}
