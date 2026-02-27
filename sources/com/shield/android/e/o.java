package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15287d = {2128909722, 1356910061, 575041809, 807308361, 590885153, 1768235264};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15288bf;
    private String gl;
    private final String in;

    /* JADX INFO: renamed from: io, reason: collision with root package name */
    private final String f15289io;
    private final String ip;
    private int iq = ((int) f15287d[0]) ^ 2128909722;
    private final String ir;

    public o(String str, String str2, String str3, String str4) {
        this.in = str3;
        this.f15289io = str;
        this.ip = str2;
        this.ir = str4;
    }

    public static String d(String str) {
        int i = ((int) f15287d[3]) ^ 807309501;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15287d[0]) ^ 2128909722;
        while (i4 < str.length()) {
            long[] jArr = f15287d;
            int i6 = (((i >> (((int) jArr[0]) ^ 2128909722)) ^ (i >> (((int) jArr[2]) ^ 575041811))) ^ (i >> (((int) jArr[4]) ^ 590885154))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 1356910060)) | (((char) (i6 & (((int) j) ^ 1356910060))) << (((int) jArr[5]) ^ 1768235279)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15287d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1356910060, i11, i10, (((int) j6) ^ 1356910060) + i10 + i11));
            long j7 = f15287d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1356910060) + (((int) j7) ^ 1356910060) + ((~(((int) j7) ^ 1356910060)) | i12) + (((((int) j7) ^ 1356910060) + i4) - ((((((int) j7) ^ 1356910060) + i4) + (((int) j7) ^ 1356910060)) + ((~(((int) j7) ^ 1356910060)) | i12)));
        }
        return sb2.toString();
    }

    public final void F(String str) {
        this.gl = str;
    }

    public final void G(String str) {
        this.f15288bf = str;
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.f15289io;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        String strD = d("๕ݎ϶Ʀ肂쀟恝뀱塨ⱷᘬ護얱拯\u3101飀찱\ue603\uf37f痢粱㸇齝俴ꞥ厁⦖ᒗ訟앛\ue2b0\uf16a\uf8d4ﱬ﹛ｱ￩ﾤ羒뾅徛⾔鞟쯂旚㊛");
        long[] jArr = f15287d;
        Object[] objArr = new Object[((int) jArr[2]) ^ 575041811];
        objArr[((int) jArr[0]) ^ 2128909722] = this.in;
        objArr[((int) jArr[1]) ^ 1356910060] = Integer.valueOf(this.iq);
        return String.format(strD, objArr);
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        return new HashMap<>(g.c(this.f15289io, this.in));
    }

    @Override // com.shield.android.e.g
    public final String bW() {
        return this.gl;
    }

    @Override // com.shield.android.e.g
    public final g.a bX() {
        return g.a.ho;
    }

    @Override // com.shield.android.e.g
    public final g.b bY() {
        return g.b.hs;
    }

    @Override // com.shield.android.e.g
    public final Map<String, Object> bZ() {
        return new HashMap();
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        com.shield.android.k.a.dL().a(shieldException);
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15288bf;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
    }

    public final void r(boolean z4) {
        if (z4) {
            this.iq = ((int) f15287d[1]) ^ 1356910060;
        } else {
            this.iq = ((int) f15287d[0]) ^ 2128909722;
        }
    }
}
