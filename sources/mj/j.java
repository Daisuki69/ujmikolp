package Mj;

import java.io.EOFException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f3440a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final void a(long j, long j6, long j7) {
        if (j6 < 0 || j7 > j) {
            StringBuilder sbS = androidx.camera.core.impl.a.s(j6, "startIndex (", ") and endIndex (");
            sbS.append(j7);
            sbS.append(") are not within the range [0..size(");
            sbS.append(j);
            sbS.append("))");
            throw new IndexOutOfBoundsException(sbS.toString());
        }
        if (j6 <= j7) {
            return;
        }
        StringBuilder sbS2 = androidx.camera.core.impl.a.s(j6, "startIndex (", ") > endIndex (");
        sbS2.append(j7);
        sbS2.append(')');
        throw new IllegalArgumentException(sbS2.toString());
    }

    public static final boolean b(g gVar) {
        kotlin.jvm.internal.j.g(gVar, "<this>");
        return gVar.b() == 0;
    }

    public static final byte[] c(i iVar, int i) {
        kotlin.jvm.internal.j.g(iVar, "<this>");
        long j = i;
        if (j >= 0) {
            return d(iVar, i);
        }
        throw new IllegalArgumentException(androidx.media3.datasource.cache.c.i(j, "byteCount (", ") < 0").toString());
    }

    public static final byte[] d(i iVar, int i) {
        if (i == -1) {
            for (long j = 2147483647L; iVar.getBuffer().c < 2147483647L && iVar.request(j); j *= (long) 2) {
            }
            if (iVar.getBuffer().c >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + iVar.getBuffer().c).toString());
            }
            i = (int) iVar.getBuffer().c;
        } else {
            iVar.require(i);
        }
        byte[] bArr = new byte[i];
        a buffer = iVar.getBuffer();
        kotlin.jvm.internal.j.g(buffer, "<this>");
        int i4 = 0;
        a(bArr.length, 0, i);
        while (i4 < i) {
            int iA = buffer.A(i4, i, bArr);
            if (iA == -1) {
                throw new EOFException(androidx.camera.core.impl.a.h("Source exhausted before reading ", i, " bytes. Only ", iA, " bytes were read."));
            }
            i4 += iA;
        }
        return bArr;
    }

    public static final String e(i iVar) throws EOFException {
        kotlin.jvm.internal.j.g(iVar, "<this>");
        iVar.request(Long.MAX_VALUE);
        a buffer = iVar.getBuffer();
        long j = iVar.getBuffer().c;
        if (j == 0) {
            return "";
        }
        g gVar = buffer.f3423a;
        if (gVar == null) {
            throw new IllegalStateException("Unreacheable");
        }
        if (gVar.b() < j) {
            byte[] bArrC = c(buffer, (int) j);
            return E1.c.e(bArrC, 0, bArrC.length);
        }
        int i = gVar.f3433b;
        String strE = E1.c.e(gVar.f3432a, i, Math.min(gVar.c, ((int) j) + i));
        buffer.skip(j);
        return strE;
    }
}
