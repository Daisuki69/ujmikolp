package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15271d = {1821891773, 920292146, 2107409134, 1285425970, 1540900961};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15272bf;
    public ShieldException bp;
    public boolean gM;
    public String gl;
    private final HashMap<String, Object> hG = new HashMap<>();
    private final com.shield.android.h.a hH;
    private final HashMap<String, String> hI;
    private final String hJ;
    private final String hK;
    private final String hL;
    private final String hM;
    private final String hN;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private boolean f15273hb;

    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, String str2, com.shield.android.h.a aVar, String str3, String str4, String str5) {
        HashMap<String, String> map = new HashMap<>();
        this.hI = map;
        long[] jArr = f15271d;
        this.gM = ((int) jArr[0]) ^ 1821891773;
        this.f15273hb = ((int) jArr[1]) ^ 920292147;
        this.hJ = str;
        this.hK = str2;
        this.hH = aVar;
        this.hL = str3;
        this.hM = str4;
        map.put(f("摒摱摲摵摧摢搸摑摵摹摶摼摶摰摺"), f("摴摨摸摠"));
        this.hN = str5;
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15271d[0]) ^ 1821891773;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15271d;
            long j = jArr[3];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1285451553) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1285451553)) + (((int) j6) ^ 920292147), (~(((int) j) ^ 1285451553)) | i4, i6, (((((int) j) ^ 1285451553) + cCharAt) + (((int) j6) ^ 920292147)) + ((~(((int) j) ^ 1285451553)) | i4)) ^ (i % (((int) jArr[4]) ^ 1540929438))));
            long j7 = f15271d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 920292147) + (((int) j7) ^ 920292147) + ((~(((int) j7) ^ 920292147)) | i10) + (((((int) j7) ^ 920292147) + i) - ((((((int) j7) ^ 920292147) + i) + (((int) j7) ^ 920292147)) + ((~(((int) j7) ^ 920292147)) | i10)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.hJ;
    }

    public final void b(HashMap<String, String> map) {
        this.hI.putAll(map);
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        return f("搼摶摴摦摾摵摰搻摭搨搶摹摯摷搲摽摷摶摳摩摥摳摱摡摸");
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        this.hI.putAll(g.c(this.hJ, this.hM));
        return this.hI;
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
        return this.hG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Map<String, Object> map) {
        String strF = f("");
        try {
            JSONObject jSONObject = new JSONObject();
            String strF2 = f("摧摷摢摤");
            String str = this.hL;
            jSONObject.put(strF2, (str == null || !str.equalsIgnoreCase(f("摗摷摧"))) ? ((int) f15271d[0]) ^ 1821891773 : ((int) f15271d[1]) ^ 920292147);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), entry.getValue().toString());
                } else {
                    jSONObject.put(entry.getKey(), JSONObject.NULL);
                }
            }
            String string = jSONObject.toString();
            strF = this.f15273hb ? this.hH.J(string) : string;
        } catch (Exception e) {
            com.shield.android.internal.a.a(e, f("摀摷摿摴搷摷摡摠摩摳摻摭摫摻搽摹摱摰摮摲搧摵摠摶摢摫摥摡摵摧摣摫搓摖摐摄摖"), new Object[1821891773 ^ ((int) f15271d[0])]);
        }
        this.hG.clear();
        this.hG.put(f("摷摳摥摱"), strF);
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15272bf;
    }

    public final void p(boolean z4) {
        this.f15273hb = z4;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
        try {
            com.shield.android.k.a.dL().a(f("摀摷摿摴搷摷摡摠摩摳摻摭摫摻搽摮摦摱摱摯摩摵摠搤摢摹搩") + str, new Object[((int) f15271d[0]) ^ 1821891773]);
            this.bp = null;
            this.gM = new JSONObject(str).getBoolean(f("摠摦摰摤摢摥"));
        } catch (JSONException e) {
            com.shield.android.internal.a.a(e, f("摀摷摿摴搷摷摡摠摩摳摻摭摫摻搽摺摪摬摨摳摯搦摠摶摹摥摻"), new Object[1821891773 ^ ((int) f15271d[0])]);
            this.bp = ShieldException.unexpectedError(e);
            com.shield.android.k.a.dL().a(e);
        }
    }

    public final void z(String str) {
        this.f15272bf = str;
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        try {
            if (shieldException.kind == ShieldException.Kind.HTTP) {
                String strF = f("摀摷摿摴搷摷摡摠摩摳摻摭摫摻搽摹摱摰摮摲搧搣摶搤搦搪搬摻");
                long[] jArr = f15271d;
                Object[] objArr = new Object[((int) jArr[2]) ^ 2107409132];
                objArr[1821891773 ^ ((int) jArr[0])] = shieldException.message;
                objArr[((int) jArr[1]) ^ 920292147] = shieldException.body;
                com.shield.android.internal.a.a(shieldException, strF, objArr);
            } else {
                String strF2 = f("摀摷摿摴搷摷摡摠摩摳摻摭摫摻搽摹摱摰摮摲搧搣摶");
                long[] jArr2 = f15271d;
                Object[] objArr2 = new Object[920292147 ^ ((int) jArr2[1])];
                objArr2[((int) jArr2[0]) ^ 1821891773] = shieldException.message;
                com.shield.android.internal.a.a(shieldException, strF2, objArr2);
            }
            this.bp = shieldException;
        } catch (Exception unused) {
        }
    }
}
