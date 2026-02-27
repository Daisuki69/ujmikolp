package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15242d = {895185555, 1607579138, 999585125, 2131628998};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15243bf;
    public ShieldException bp;
    private final String gJ;
    private final String gK;
    private final String gL;
    public boolean gM = ((int) f15242d[0]) ^ 895185555;
    private final String gN;
    private String gl;

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, String str2, String str3, String str4) {
        this.gJ = str3;
        this.gK = str;
        this.gL = str2;
        this.gN = str4;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15242d[0]) ^ 895185555;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15242d;
            long j = jArr[3];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 2131667665) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 2131667665) + (((int) j6) ^ 1607579139), i4 | (~(((int) j) ^ 2131667665)), i6, (((int) j) ^ 2131667665) + cCharAt + (((int) j6) ^ 1607579139) + ((~(((int) j) ^ 2131667665)) | i4)));
            long j7 = f15242d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1607579139) + (((int) j7) ^ 1607579139) + ((~(((int) j7) ^ 1607579139)) | i10) + (((((int) j7) ^ 1607579139) + i) - ((((((int) j7) ^ 1607579139) + i) + (((int) j7) ^ 1607579139)) + ((~(((int) j7) ^ 1607579139)) | i10)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.gK;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        String strG = g("뤸륤륿륾륲륻륳뤺륱륧뤸륡뤦뤸륶륧륾뤸륾륹륣륲륻륻륾륰륲륹르륲뤸뤲륤");
        long[] jArr = f15242d;
        Object[] objArr = new Object[((int) jArr[1]) ^ 1607579139];
        objArr[((int) jArr[0]) ^ 895185555] = this.gJ;
        return String.format(strG, objArr);
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        return g.c(this.gK, this.gJ);
    }

    @Override // com.shield.android.e.g
    public final String bW() {
        return this.gl;
    }

    @Override // com.shield.android.e.g
    public final g.a bX() {
        return g.a.hm;
    }

    @Override // com.shield.android.e.g
    public final g.b bY() {
        return null;
    }

    @Override // com.shield.android.e.g
    public final Map<String, Object> bZ() {
        HashMap map = new HashMap();
        map.put(g("륧륻륶륣륱른륥륺"), g("륖륇륇"));
        map.put(g("륤륳를"), Boolean.TRUE);
        return map;
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        try {
            if (shieldException.kind == ShieldException.Kind.HTTP) {
                com.shield.android.k.a aVarDL = com.shield.android.k.a.dL();
                String strG = g("뤲륤뤷뤺뤷뤲륤");
                long[] jArr = f15242d;
                Object[] objArr = new Object[((int) jArr[2]) ^ 999585127];
                objArr[895185555 ^ ((int) jArr[0])] = shieldException.message;
                objArr[((int) jArr[1]) ^ 1607579139] = shieldException.body;
                aVarDL.a(shieldException, strG, objArr);
            } else {
                com.shield.android.k.a.dL().a(shieldException, shieldException.message, new Object[895185555 ^ ((int) f15242d[0])]);
            }
            this.bp = shieldException;
        } catch (Exception unused) {
        }
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15243bf;
    }

    public final void p(String str) {
        this.gl = str;
    }

    public final void q(String str) {
        this.f15243bf = str;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
    }
}
