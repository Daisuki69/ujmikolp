package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15283d = {208386898, 1870054019, 1650634547, 1643708236, 1549337914, 229567679};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15284bf;
    private String gl;
    private com.shield.android.internal.e hQ;
    private Map<String, Object> hW;

    /* JADX INFO: renamed from: ih, reason: collision with root package name */
    private final HashMap<String, Object> f15285ih = new HashMap<>();
    private final HashMap<String, String> ii;

    /* JADX INFO: renamed from: ij, reason: collision with root package name */
    private final String f15286ij;
    private final String ik;
    private final String il;
    private final String im;
    private String url;

    public n(String str, String str2, String str3, String str4) {
        new JSONObject();
        HashMap<String, String> map = new HashMap<>();
        this.ii = map;
        this.il = str3;
        this.f15286ij = str;
        this.ik = str2;
        map.put(d("㠸鱟칽杪돷妷곌嘵ꭖ嗿⪡ᔃ諚䔷⋋"), d("㠞鱆칷板"));
        this.im = str4;
    }

    public static String d(String str) {
        int i = ((int) f15283d[3]) ^ 1643679679;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15283d[0]) ^ 208386898;
        while (i4 < str.length()) {
            long[] jArr = f15283d;
            int i6 = (((i >> (((int) jArr[0]) ^ 208386898)) ^ (i >> (((int) jArr[1]) ^ 1870054017))) ^ (i >> (((int) jArr[4]) ^ 1549337913))) ^ (i >> 5);
            long j = jArr[2];
            i = (char) ((i >> (((int) j) ^ 1650634546)) | (((char) (i6 & (((int) j) ^ 1650634546))) << (((int) jArr[5]) ^ 229567664)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15283d[2];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1650634546, i11, i10, (((int) j6) ^ 1650634546) + i10 + i11));
            long j7 = f15283d[2];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1650634546) + (((int) j7) ^ 1650634546) + ((~(((int) j7) ^ 1650634546)) | i12) + (((((int) j7) ^ 1650634546) + i4) - ((((((int) j7) ^ 1650634546) + i4) + (((int) j7) ^ 1650634546)) + ((~(((int) j7) ^ 1650634546)) | i12)));
        }
        return sb2.toString();
    }

    public final void C(String str) {
        this.gl = str;
    }

    public final void D(String str) {
        this.url = str;
    }

    public final void E(String str) {
        this.f15284bf = str;
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.f15286ij;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        return this.url;
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        this.ii.putAll(g.c(this.f15286ij, this.il));
        return this.ii;
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
        return g.b.hs;
    }

    @Override // com.shield.android.e.g
    public final Map<String, Object> bZ() {
        String strD = d("");
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : this.hW.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } else {
                    jSONObject.put(entry.getKey(), JSONObject.NULL);
                }
            }
            strD = jSONObject.toString();
        } catch (Exception e) {
            com.shield.android.internal.a.a(e, d("㠴鱓칺杺돫妦곁嘕ꭊ嗮⪡ᔕ誓䔪⋉鄤죂\ue434牆㥼ᳰ踬䝌ꏶ퇨\ue880琓멍\udd7d"), new Object[((int) f15283d[0]) ^ 208386898]);
        }
        this.f15285ih.clear();
        this.f15285ih.put(d("㠝鱝칪杮"), strD);
        return this.f15285ih;
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        if (shieldException.kind != ShieldException.Kind.HTTP) {
            String strD = d("㠴鱓칺杺돫妦곁嘕ꭊ嗮⪡ᔕ誓䕼⋟");
            long[] jArr = f15283d;
            Object[] objArr = new Object[1650634546 ^ ((int) jArr[2])];
            objArr[((int) jArr[0]) ^ 208386898] = shieldException.message;
            com.shield.android.internal.a.a(shieldException, strD, objArr);
            return;
        }
        String strD2 = d("㠴鱓칺杺돫妦곁嘕ꭊ嗮⪡ᔕ誓䕼⋟酶좆\ue475爏㥦");
        long[] jArr2 = f15283d;
        Object[] objArr2 = new Object[((int) jArr2[1]) ^ 1870054017];
        objArr2[208386898 ^ ((int) jArr2[0])] = shieldException.message;
        objArr2[((int) jArr2[2]) ^ 1650634546] = shieldException.body;
        com.shield.android.internal.a.a(shieldException, strD2, objArr2);
    }

    public final void e(Map<String, Object> map) {
        this.hW = map;
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15284bf;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
        try {
            com.shield.android.k.a.dL().a(d("㠴鱓칺杺돫妦곁嘔ꭙ嗨⪯ᕇ諁䔼⋟鄦죄\ue43b牙㥰Ც踬䝑ꎱ") + str, new Object[((int) f15283d[0]) ^ 208386898]);
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(d("㠚鱓칺杪"), d(""));
            if (this.hQ == null) {
                this.hQ = new com.shield.android.internal.e();
            }
            boolean zOptBoolean = jSONObject.optBoolean(d("㠘鱉칪杠돘妡겍嘟꭛嗷"), this.hQ.fW);
            boolean zOptBoolean2 = jSONObject.optBoolean(d("㠘鱉칪杠돘妠검嘀ꭌ嗿⪦ᔆ"), this.hQ.fX);
            boolean zOptBoolean3 = jSONObject.optBoolean(d("㠚鱝칲杣돥妢겂嘛"), this.hQ.fY);
            long jOptLong = jSONObject.optLong(d("㠟鱙칿杻돲妱겄嘯ꭎ嗹⪼ᔔ諚䔶⋂"), this.hQ.fZ);
            boolean zOptBoolean4 = jSONObject.optBoolean(d("㠔鱕칭杢돦妷겂嘘ꬕ嗺⪾ᕊ諀䔼⋘鄢죂\ue43b牍㤸\u1cfc踠䝐ꏢ톡\ue88b琜"), this.hQ.f15414ga);
            com.shield.android.internal.e eVar = this.hQ;
            eVar.fW = zOptBoolean;
            eVar.fX = zOptBoolean2;
            eVar.fY = zOptBoolean3;
            eVar.fZ = jOptLong;
            eVar.f15414ga = zOptBoolean4;
            if (strOptString.equals(d("㡉鰌츯"))) {
                jSONObject.optJSONObject(d("㠋鱙칭杺돫妷"));
            } else {
                ShieldException.unexpectedError(new Throwable(jSONObject.optString(d("㠔鱙칭杼돦妤겄"))));
            }
        } catch (JSONException e) {
            com.shield.android.internal.a.a(e, d("㠴鱓칺杺돫妦곁嘖ꭑ嗲⪧ᔔ諛䕹⋉鄤죙\ue43a牘"), new Object[208386898 ^ ((int) f15283d[0])]);
            ShieldException.unexpectedError(e);
            com.shield.android.k.a.dL().a(e);
        }
    }

    public final void d(HashMap<String, String> map) {
        this.ii.putAll(map);
    }
}
