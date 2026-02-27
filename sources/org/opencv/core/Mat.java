package org.opencv.core;

import We.s;
import androidx.media3.datasource.cache.c;
import androidx.webkit.ProxyConfig;
import lk.a;

/* JADX INFO: loaded from: classes5.dex */
public class Mat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18918a;

    public Mat(long j) {
        if (j == 0) {
            throw new UnsupportedOperationException("Native object address is NULL");
        }
        this.f18918a = j;
    }

    private static native double[] nGet(long j, int i, int i4);

    private static native long n_Mat();

    private static native long n_clone(long j);

    private static native int n_cols(long j);

    private static native long n_dataAddr(long j);

    private static native void n_delete(long j);

    private static native boolean n_empty(long j);

    private static native boolean n_isContinuous(long j);

    private static native boolean n_isSubmatrix(long j);

    private static native int n_rows(long j);

    private static native int n_type(long j);

    public final boolean a() {
        return n_empty(this.f18918a);
    }

    public final double[] b() {
        return nGet(this.f18918a, 0, 0);
    }

    public final Object clone() {
        return new Mat(n_clone(this.f18918a));
    }

    public final void finalize() throws Throwable {
        n_delete(this.f18918a);
        super.finalize();
    }

    public final String toString() {
        String str;
        String strH;
        StringBuilder sb2 = new StringBuilder("Mat [ ");
        long j = this.f18918a;
        sb2.append(n_rows(j));
        sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
        sb2.append(n_cols(j));
        sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
        int iN_type = n_type(j);
        int i = a.f18326a;
        switch (iN_type & 7) {
            case 0:
                str = "CV_8U";
                break;
            case 1:
                str = "CV_8S";
                break;
            case 2:
                str = "CV_16U";
                break;
            case 3:
                str = "CV_16S";
                break;
            case 4:
                str = "CV_32S";
                break;
            case 5:
                str = "CV_32F";
                break;
            case 6:
                str = "CV_64F";
                break;
            case 7:
                str = "CV_USRTYPE1";
                break;
            default:
                throw new UnsupportedOperationException(s.f(iN_type, "Unsupported CvType value: "));
        }
        int i4 = (iN_type >> 3) + 1;
        if (i4 <= 4) {
            strH = c.h(i4, str, "C");
        } else {
            strH = str + "C(" + i4 + ")";
        }
        sb2.append(strH);
        sb2.append(", isCont=");
        sb2.append(n_isContinuous(j));
        sb2.append(", isSubmat=");
        sb2.append(n_isSubmatrix(j));
        sb2.append(", nativeObj=0x");
        sb2.append(Long.toHexString(j));
        sb2.append(", dataAddr=0x");
        sb2.append(Long.toHexString(n_dataAddr(j)));
        sb2.append(" ]");
        return sb2.toString();
    }

    public Mat() {
        this.f18918a = n_Mat();
    }
}
