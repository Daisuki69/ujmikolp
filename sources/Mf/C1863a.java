package mf;

import dOYHB6.tiZVw8.numX49;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import of.c;
import of.i;
import of.k;
import of.n;
import of.u;

/* JADX INFO: renamed from: mf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1863a {
    public static final byte[] e = {42};
    public static final String[] f = new String[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f18406g = {numX49.tnTj78("bO1P")};
    public static final C1863a h = new C1863a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f18407a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f18408b = new CountDownLatch(1);
    public byte[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f18409d;

    public static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i4;
        boolean z4;
        int i6;
        int i10;
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = (i11 + length) / 2;
            while (i12 > -1 && bArr[i12] != 10) {
                i12--;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i4 = i13 + i14;
                if (bArr[i4] == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i4 - i13;
            int i16 = i;
            boolean z5 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z5) {
                    i6 = 46;
                    z4 = false;
                } else {
                    z4 = z5;
                    i6 = bArr2[i16][i17] & 255;
                }
                i10 = i6 - (bArr[i13 + i18] & 255);
                if (i10 == 0) {
                    i18++;
                    i17++;
                    if (i18 == i15) {
                        break;
                    }
                    if (bArr2[i16].length != i17) {
                        z5 = z4;
                    } else {
                        if (i16 == bArr2.length - 1) {
                            break;
                        }
                        i16++;
                        i17 = -1;
                        z5 = true;
                    }
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                if (i10 <= 0) {
                    int i19 = i15 - i18;
                    int length2 = bArr2[i16].length - i17;
                    while (true) {
                        i16++;
                        if (i16 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i19) {
                        if (length2 <= i19) {
                            return new String(bArr, i13, i15, StandardCharsets.UTF_8);
                        }
                    }
                }
                i11 = i4 + 1;
            }
            length = i12;
        }
        return null;
    }

    public final void b() {
        InputStream resourceAsStream = C1863a.class.getResourceAsStream(numX49.tnTj78("bO1b"));
        if (resourceAsStream == null) {
            return;
        }
        u uVar = new u();
        Logger logger = k.f18829a;
        n nVar = new n(new i(new c(uVar, resourceAsStream)));
        try {
            byte[] bArr = new byte[nVar.readInt()];
            nVar.readFully(bArr);
            byte[] bArr2 = new byte[nVar.readInt()];
            nVar.readFully(bArr2);
            nVar.close();
            synchronized (this) {
                this.c = bArr;
                this.f18409d = bArr2;
            }
            this.f18408b.countDown();
        } catch (Throwable th2) {
            try {
                nVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
