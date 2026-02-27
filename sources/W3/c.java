package W3;

import androidx.media3.extractor.AacUtil;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6232d;
    public final String e;

    public c(K3.a aVar, String str, String str2) {
        super(aVar);
        this.f6232d = str2;
        this.e = str;
    }

    @Override // Ng.j
    public final String b() throws NotFoundException {
        if (((K3.a) this.f4431b).f2588b != 84) {
            throw NotFoundException.c;
        }
        StringBuilder sb2 = new StringBuilder();
        c(8, sb2);
        g(sb2, 48, 20);
        int iM = U8.c.m(68, 16, (K3.a) ((U8.c) this.c).f5964b);
        if (iM != 38400) {
            sb2.append('(');
            sb2.append(this.f6232d);
            sb2.append(')');
            int i = iM % 32;
            int i4 = iM / 32;
            int i6 = (i4 % 12) + 1;
            int i10 = i4 / 12;
            if (i10 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i10);
            if (i6 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i6);
            if (i / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i);
        }
        return sb2.toString();
    }

    @Override // W3.e
    public final void e(int i, StringBuilder sb2) {
        sb2.append('(');
        sb2.append(this.e);
        sb2.append(i / AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND);
        sb2.append(')');
    }

    @Override // W3.e
    public final int f(int i) {
        return i % AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
    }
}
