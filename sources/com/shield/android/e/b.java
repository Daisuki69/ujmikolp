package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15244d = {2121283014, 45543658, 1383060147, 865344026, 1113579461, 51112319};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15245bf;
    private final String gO;
    private final String gP;
    private final String gQ;
    private final String gR;
    private Map<String, Object> gS;
    private HashMap<String, String> gT;
    private String gl;

    public b(String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.j.g(str, d("着㯰ᶸ\u0e83ܺϝ"));
        kotlin.jvm.internal.j.g(str2, d("着㯼ᶯດܖύ膗䂋ꀎ"));
        kotlin.jvm.internal.j.g(str3, d("着㯼ᶿຕܚϖ膲䂧ꀓ"));
        kotlin.jvm.internal.j.g(str4, d("睐㯵ᶥ\u0e83ܝύ膕䂊"));
        this.gO = str;
        this.gP = str2;
        this.gQ = str3;
        this.gR = str4;
        this.gl = d("");
        this.f15245bf = d("");
        this.gT = new HashMap<>();
    }

    public static String d(String str) {
        int i = ((int) f15244d[3]) ^ 865399932;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15244d[1]) ^ 45543658;
        while (i4 < str.length()) {
            long[] jArr = f15244d;
            int i6 = (((i >> (((int) jArr[1]) ^ 45543658)) ^ (i >> (((int) jArr[0]) ^ 2121283012))) ^ (i >> (((int) jArr[4]) ^ 1113579462))) ^ (i >> 5);
            long j = jArr[2];
            i = (char) ((i >> (((int) j) ^ 1383060146)) | (((char) (i6 & (((int) j) ^ 1383060146))) << (((int) jArr[5]) ^ 51112304)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15244d[2];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1383060146, i11, i10, (((int) j6) ^ 1383060146) + i10 + i11));
            long j7 = f15244d[2];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1383060146) + (((int) j7) ^ 1383060146) + ((~(((int) j7) ^ 1383060146)) | i12) + (((((int) j7) ^ 1383060146) + i4) - ((((((int) j7) ^ 1383060146) + i4) + (((int) j7) ^ 1383060146)) + ((~(((int) j7) ^ 1383060146)) | i12)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.gO;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        return d("眜㯪ᶤຏܖϕ膸䃃ꀖ큋\ue874\uf421穱㴲麮켣柈뎵妋ⲟ");
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        this.gT.putAll(g.c(this.gO, this.gQ));
        return this.gT;
    }

    @Override // com.shield.android.e.g
    public final String bW() {
        return this.gl;
    }

    @Override // com.shield.android.e.g
    public final g.a bX() {
        return g.a.hn;
    }

    @Override // com.shield.android.e.g
    public final g.b bY() {
        return g.b.hq;
    }

    @Override // com.shield.android.e.g
    public final Map<String, Object> bZ() {
        Map<String, Object> map = this.gS;
        return map != null ? map : new LinkedHashMap();
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        ShieldException.Kind kind;
        if (shieldException != null) {
            try {
                kind = shieldException.kind;
            } catch (Exception unused) {
                return;
            }
        } else {
            kind = null;
        }
        if (kind != ShieldException.Kind.HTTP) {
            com.shield.android.k.a.dL().a(shieldException, shieldException != null ? shieldException.message : null, new Object[((int) f15244d[1]) ^ 45543658]);
            return;
        }
        com.shield.android.k.a aVarDL = com.shield.android.k.a.dL();
        String strD = d("眖㯪໋ᷬݓΜ膯");
        long[] jArr = f15244d;
        Object[] objArr = new Object[((int) jArr[0]) ^ 2121283012];
        objArr[45543658 ^ ((int) jArr[1])] = shieldException.message;
        objArr[((int) jArr[2]) ^ 1383060146] = shieldException.body;
        aVarDL.a(shieldException, strD, objArr);
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15245bf;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
    }

    public final void s(String str) {
        if (str == null) {
            str = d("");
        }
        this.gl = str;
    }

    public final void t(String str) {
        if (str == null) {
            str = d("");
        }
        this.f15245bf = str;
    }
}
