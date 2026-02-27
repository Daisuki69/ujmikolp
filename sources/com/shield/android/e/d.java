package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15246d = {107862386, 505942850, 1565409478, 802210639, 879840345, 1968554298};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15247bf;
    public ShieldException bp;
    public boolean gM;
    private final HashMap<String, Object> gX = new HashMap<>();
    private final com.shield.android.h.a gY;
    private final String gZ;
    public String gl;

    /* JADX INFO: renamed from: ha, reason: collision with root package name */
    private final String f15248ha;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private boolean f15249hb;

    /* JADX INFO: renamed from: hc, reason: collision with root package name */
    private final HashMap<String, String> f15250hc;

    /* JADX INFO: renamed from: hd, reason: collision with root package name */
    private final String f15251hd;
    private final String he;

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, String str2, com.shield.android.h.a aVar, String str3, String str4) {
        long[] jArr = f15246d;
        this.gM = ((int) jArr[0]) ^ 107862386;
        this.f15249hb = ((int) jArr[1]) ^ 505942851;
        HashMap<String, String> map = new HashMap<>();
        this.f15250hc = map;
        this.gZ = str;
        this.gY = aVar;
        this.f15248ha = str2;
        this.f15251hd = str3;
        map.put(d("꼲埚ꮿ喋ꪇ픏\uea90甛㫁ᴴໄ蜱䏃↻ႍ"), d("꼔埃ꮵ喞"));
        this.he = str4;
    }

    public static String d(String str) {
        int i = ((int) f15246d[3]) ^ 802201000;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15246d[0]) ^ 107862386;
        while (i4 < str.length()) {
            long[] jArr = f15246d;
            int i6 = (((i >> (((int) jArr[0]) ^ 107862386)) ^ (i >> (((int) jArr[2]) ^ 1565409476))) ^ (i >> (((int) jArr[4]) ^ 879840346))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 505942851)) | (((char) (i6 & (((int) j) ^ 505942851))) << (((int) jArr[5]) ^ 1968554293)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15246d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 505942851, i11, i10, (((int) j6) ^ 505942851) + i10 + i11));
            long j7 = f15246d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 505942851) + (((int) j7) ^ 505942851) + ((~(((int) j7) ^ 505942851)) | i12) + (((((int) j7) ^ 505942851) + i4) - ((((((int) j7) ^ 505942851) + i4) + (((int) j7) ^ 505942851)) + ((~(((int) j7) ^ 505942851)) | i12)));
        }
        return sb2.toString();
    }

    public final void a(HashMap<String, String> map) {
        this.f15250hc.putAll(map);
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.gZ;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        return d("꽜埝ꮹ喘ꪞ픘\uead8畱㫙ᵥຄ蜸䏅↷ႃ࠙葟䈲ꅪ僢⠵鑈䩳╭銩줣擕㈤ᥚ\u0cfd蘨썐\ue1e6炬㠗");
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        this.f15250hc.putAll(g.c(this.gZ, this.f15251hd));
        return this.f15250hc;
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
        return this.gX;
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        try {
            if (shieldException.kind == ShieldException.Kind.HTTP) {
                String strD = d("꼷埜ꮪ喇ꪔ픞\uea9d甿㫛ᴣ໙蜼䏈↠႞ࠐ萚䉸ꅼ僵⠬鑓䨰┭鋷쥢撌㉰ᤍ೧");
                long[] jArr = f15246d;
                Object[] objArr = new Object[((int) jArr[2]) ^ 1565409476];
                objArr[107862386 ^ ((int) jArr[0])] = shieldException.message;
                objArr[((int) jArr[1]) ^ 505942851] = shieldException.body;
                com.shield.android.internal.a.a(shieldException, strD, objArr);
            } else {
                String strD2 = d("꼷埜ꮪ喇ꪔ픞\uea9d甿㫛ᴣ໙蜼䏈↠႞ࠐ萚䉸ꅼ僵⠬鑓䨰┭鋷");
                long[] jArr2 = f15246d;
                Object[] objArr2 = new Object[505942851 ^ ((int) jArr2[1])];
                objArr2[((int) jArr2[0]) ^ 107862386] = shieldException.message;
                com.shield.android.internal.a.a(shieldException, strD2, objArr2);
            }
            this.bp = shieldException;
        } catch (Exception unused) {
        }
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15247bf;
    }

    public final void o(boolean z4) {
        this.f15249hb = z4;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
        try {
            com.shield.android.k.a.dL().a(d("꼷埜ꮪ喇ꪔ픞\uea9d生㫛ᴣ໙蜼䏈↠႞ࠐ葉䈽ꅼ僢⠰鑑䩿╦鋷줧撁㈹ᥛ\u0cb4") + str, new Object[((int) f15246d[0]) ^ 107862386]);
            this.bp = null;
            this.gM = new JSONObject(str).getBoolean(d("꼀埌ꮿ喍ꪒ픈\ueace"));
        } catch (JSONException e) {
            com.shield.android.internal.a.a(e, d("꼷埜ꮪ喇ꪔ픞\uea9d甿㫛ᴣ໙蜼䏈↠႞ࠐ萚䉻ꅧ僩⠪鑒䩸┨鋡줰擓㈿ᥚ"), new Object[107862386 ^ ((int) f15246d[0])]);
            this.bp = ShieldException.unexpectedError(e);
            com.shield.android.k.a.dL().a(e);
        }
    }

    public final void u(String str) {
        this.f15247bf = str;
    }

    public final void a(Map<String, Object> map) {
        String strD = d("");
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), entry.getValue().toString());
                } else {
                    jSONObject.put(entry.getKey(), JSONObject.NULL);
                }
            }
            String string = jSONObject.toString();
            strD = this.f15249hb ? this.gY.J(string) : string;
        } catch (Exception e) {
            com.shield.android.internal.a.a(e, d("꼷埜ꮪ喇ꪔ픞\uea9d甿㫛ᴣ໙蜼䏈↠႞ࠐ萚䉸ꅼ僵⠬鑓䨰╻鋡줰擈㈱᥄\u0cfd蘰썌\ue1fc炮㡄᱖蹸䝸⏧"), new Object[((int) f15246d[0]) ^ 107862386]);
        }
        this.gX.clear();
        this.gX.put(d("꼗埘ꮨ喏"), strD);
    }
}
