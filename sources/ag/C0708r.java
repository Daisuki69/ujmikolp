package ag;

import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;

/* JADX INFO: renamed from: ag.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0708r {
    public static final String[] i = {numX49.tnTj78("buePP"), numX49.tnTj78("buePb"), numX49.tnTj78("bueP2"), numX49.tnTj78("buePL"), numX49.tnTj78("bueW"), numX49.tnTj78("bueP9")};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U8.c f7227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7228b = new HashMap();
    public byte[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f7229d;
    public int[] e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7230g;
    public int h;

    public final int a(int i4) {
        byte[] bArr = this.c;
        if (bArr == null) {
            kotlin.jvm.internal.j.l();
        }
        int i6 = (bArr[i4 + 3] << 24) & (-16777216);
        byte[] bArr2 = this.c;
        if (bArr2 == null) {
            kotlin.jvm.internal.j.l();
        }
        int i10 = i6 | ((bArr2[i4 + 2] << 16) & 16711680);
        byte[] bArr3 = this.c;
        if (bArr3 == null) {
            kotlin.jvm.internal.j.l();
        }
        int i11 = i10 | ((bArr3[i4 + 1] << 8) & 65280);
        byte[] bArr4 = this.c;
        if (bArr4 == null) {
            kotlin.jvm.internal.j.l();
        }
        return (bArr4[i4] & 255) | i11;
    }

    public final void b(boolean z4) {
        int iA = a(this.h + 16);
        String strC = c(a(this.h + 20));
        String strC2 = c(iA);
        HashMap map = this.f7228b;
        if (z4) {
            U8.c cVar = this.f7227a;
            if (cVar == null) {
                kotlin.jvm.internal.j.l();
            }
            cVar.getClass();
            map.put(strC, strC2);
        } else {
            U8.c cVar2 = this.f7227a;
            if (cVar2 == null) {
                kotlin.jvm.internal.j.l();
            }
            cVar2.getClass();
            map.remove(strC);
        }
        this.h += 24;
    }

    public final String c(int i4) {
        String[] strArr;
        int i6 = this.f;
        if (i4 >= 0 && i6 > i4 && (strArr = this.f7229d) != null) {
            return strArr[i4];
        }
        return null;
    }
}
