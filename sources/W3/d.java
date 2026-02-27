package W3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends Ng.j {
    public /* synthetic */ d(K3.a aVar) {
        super(aVar);
    }

    public final void c(int i, StringBuilder sb2) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        d(sb2, i, length);
    }

    public final void d(StringBuilder sb2, int i, int i4) {
        for (int i6 = 0; i6 < 4; i6++) {
            int iM = U8.c.m((i6 * 10) + i, 10, (K3.a) ((U8.c) this.c).f5964b);
            if (iM / 100 == 0) {
                sb2.append('0');
            }
            if (iM / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(iM);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int iCharAt = sb2.charAt(i11 + i4) - '0';
            if ((i11 & 1) == 0) {
                iCharAt *= 3;
            }
            i10 += iCharAt;
        }
        int i12 = 10 - (i10 % 10);
        sb2.append(i12 != 10 ? i12 : 0);
    }
}
