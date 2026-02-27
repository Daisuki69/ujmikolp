package W3;

import androidx.media3.extractor.AacUtil;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends d {
    public abstract void e(int i, StringBuilder sb2);

    public abstract int f(int i);

    public final void g(StringBuilder sb2, int i, int i4) {
        int iM = U8.c.m(i, i4, (K3.a) ((U8.c) this.c).f5964b);
        e(iM, sb2);
        int iF = f(iM);
        int i6 = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
        for (int i10 = 0; i10 < 5; i10++) {
            if (iF / i6 == 0) {
                sb2.append('0');
            }
            i6 /= 10;
        }
        sb2.append(iF);
    }
}
