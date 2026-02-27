package com.shield.android.e;

import com.google.gson.q;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import com.shield.android.internal.NativeUtils;
import com.shield.android.shieldsignature.ShieldSignature;
import com.shield.android.shieldsignature.ShieldSignatureGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15274d = {1762088532, 1254028897, 822015619, 1879421058, 1812284993, 1755059623};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15275bf;
    public ShieldException bp;
    private String gl;
    private Set<String> gu;
    private final com.shield.android.h.a hP;
    public com.shield.android.internal.e hQ;
    private final String hR;
    private final HashMap<String, String> hS;
    private final String hT;
    private final String hU;
    private final String hV;
    private Map<String, Object> hW;
    private final NativeUtils hX;
    private final String hY;
    private final long hZ;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private boolean f15276hb;
    private final HashMap<String, Object> hO = new HashMap<>();
    public JSONObject bo = new JSONObject();

    /* JADX WARN: Multi-variable type inference failed */
    public l(String str, String str2, String str3, com.shield.android.h.a aVar, NativeUtils nativeUtils, String str4, String str5, long j) {
        HashMap<String, String> map = new HashMap<>();
        this.hS = map;
        this.f15276hb = ((int) f15274d[0]) ^ 1762088533;
        this.hV = str3;
        this.hT = str;
        this.hU = str2;
        this.hP = aVar;
        this.hX = nativeUtils;
        this.hR = str4;
        map.put(d("㉷\u1978೮蘣썓懥냥\ud821汜뙺季ⷢ險쬏旗"), d("㉑ᥡ\u0ce4蘶"));
        this.hY = str5;
        this.hZ = j;
    }

    public static String d(String str) {
        int i = ((int) f15274d[3]) ^ 1879430383;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15274d[1]) ^ 1254028897;
        while (i4 < str.length()) {
            long[] jArr = f15274d;
            int i6 = (((i >> (((int) jArr[1]) ^ 1254028897)) ^ (i >> (((int) jArr[2]) ^ 822015617))) ^ (i >> (((int) jArr[4]) ^ 1812284994))) ^ (i >> 5);
            long j = jArr[0];
            i = (char) ((i >> (((int) j) ^ 1762088533)) | (((char) (i6 & (((int) j) ^ 1762088533))) << (((int) jArr[5]) ^ 1755059624)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15274d[0];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1762088533, i11, i10, (((int) j6) ^ 1762088533) + i10 + i11));
            long j7 = f15274d[0];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1762088533) + (((int) j7) ^ 1762088533) + ((~(((int) j7) ^ 1762088533)) | i12) + (((((int) j7) ^ 1762088533) + i4) - ((((((int) j7) ^ 1762088533) + i4) + (((int) j7) ^ 1762088533)) + ((~(((int) j7) ^ 1762088533)) | i12)));
        }
        return sb2.toString();
    }

    public final void A(String str) {
        this.gl = str;
    }

    public final void B(String str) {
        this.f15275bf = str;
    }

    public final void a(Set<String> set) {
        this.gu = set;
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.hT;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        return d("㈙\u197f೨蘰썊懲낭\ud84b汄똫嬣ⷫ隬쬃旙늴\ud909");
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        this.hS.putAll(g.c(this.hT, this.hV));
        return this.hS;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.shield.android.e.g
    public final Map<String, Object> bZ() {
        String strD = d("");
        try {
            JSONObject jSONObject = new JSONObject();
            String strD2 = d("㉂\u197e\u0cfe蘲");
            String str = this.hR;
            jSONObject.put(strD2, (str == null || !str.equalsIgnoreCase(d("㉲\u197e\u0cfb"))) ? ((int) f15274d[1]) ^ 1254028897 : ((int) f15274d[0]) ^ 1762088533);
            for (Map.Entry<String, Object> entry : this.hW.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), entry.getValue().toString());
                } else {
                    jSONObject.put(entry.getKey(), d(""));
                }
            }
            if (this.gu.contains(d("㉺ᥔ\u0cce蘇썷懘낇\ud82a汭뙉孉ⷔ階쬨旣늋\ud925\uecf9瘕"))) {
                jSONObject.put(this.hX.getKeyValue(d("㉕\u196f")), d(""));
            }
            String string = jSONObject.toString();
            if (this.f15276hb) {
                strD = this.hP.J(string);
            } else {
                q qVarA = com.shield.android.internal.e.a(jSONObject, ((int) f15274d[0]) ^ 1762088533);
                ShieldSignature shieldSignature = ShieldSignatureGenerator.getShieldSignature(qVarA.toString(), this.hT);
                String signature = shieldSignature.getSignature();
                long timestamp = shieldSignature.getTimestamp();
                String strB = f.b(qVarA.toString(), this.hU);
                HashMap map = new HashMap();
                map.put(d("㉂ᥲೠ蘣썐懥납\ud809求똴孺ⶴ"), String.valueOf(timestamp));
                map.put(d("㉎ᤶ\u0cfd蘮"), strB);
                map.put(d("㉎ᤶ\u0cfd蘮쌎懧냺"), signature);
                this.hS.putAll(map);
                strD = string;
            }
        } catch (Exception e) {
            com.shield.android.internal.a.a(e, d("㉥\u197eೣ蘢쌃懢낡\ud803汜뙸學ⷳ隱쬄斐늽\ud91e\uecc4瘴㭟ᶶ躸䜀ꏀ톰梍됚婒굧훧欩㗄\u1af1贌䛕⌮里"), new Object[((int) f15274d[1]) ^ 1254028897]);
        }
        this.hO.clear();
        this.hO.put(d("㉒\u197a\u0cf9蘧"), strD);
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.shield.android.k.a.dL().a(d("㉥ᥓೄ蘃썯懕냨\ud822汢똹孜ⷔ隌쬢旵늋\ud93f\uec96癶㬓ᶶ躻䜄ꏋ통梃됗婟괽훾欵㗌᪲贍䛇〈釈䢲ꑋ퉔\ue974\uf4e9辶ﵐ维뼦\udfd0濲㞝鮛䷚⚎ጛ觍䒩ꈊ充ꢻ听꩒唳") + jCurrentTimeMillis + d("㈖\u197a೫蘲썆懣냨") + (System.currentTimeMillis() - this.hZ) + d("㈖\u1976\u0ce4蘪썏懸낻\ud801汑뙶孢ⷢ隰"), new Object[((int) f15274d[1]) ^ 1254028897]);
        return this.hO;
    }

    public final void c(HashMap<String, String> map) {
        this.hS.putAll(map);
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15275bf;
    }

    public final void q(boolean z4) {
        this.f15276hb = z4;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
        try {
            com.shield.android.k.a.dL().a(d("㉥\u197eೣ蘢쌃懵낭\ud812汛뙺孩ⶦ隰쬈旗늶\ud90d\uecc2瘮㭟ᷳ軫䜗ꏗ톪梜됙婕굮훫歧㗊᪢赈") + str, new Object[((int) f15274d[1]) ^ 1254028897]);
            this.bp = null;
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.getBoolean(d("㉅\u196f೬蘲썖懢"));
            String strOptString = jSONObject.optString(d("㉕ᥴ೩蘣"), d(""));
            if (this.hQ == null) {
                this.hQ = new com.shield.android.internal.e();
            }
            boolean zOptBoolean = jSONObject.optBoolean(d("㉗\u196e\u0cf9蘩썼懳낤\ud80b汑뙲"), this.hQ.fW);
            boolean zOptBoolean2 = jSONObject.optBoolean(d("㉗\u196e\u0cf9蘩썼懲납\ud814汆뙺孤ⷧ"), this.hQ.fX);
            boolean zOptBoolean3 = jSONObject.optBoolean(d("㉕\u197aೡ蘪썁懰낫\ud80f"), this.hQ.fY);
            long jOptLong = jSONObject.optLong(d("㉐\u197e೬蘲썖懣낭\ud83b汄뙼孾ⷵ險쬎旞"), this.hQ.fZ);
            boolean zOptBoolean4 = jSONObject.optBoolean(d("㉛ᥲ\u0cfe蘫썂懥낫\ud80c氟뙿孼ⶫ隰쬄旄늬\ud905\uecd8瘼㬀ᷠ躮䜗ꏁ톰梃되"), this.hQ.f15414ga);
            com.shield.android.internal.e eVar = this.hQ;
            eVar.fW = zOptBoolean;
            eVar.fX = zOptBoolean2;
            eVar.fY = zOptBoolean3;
            eVar.fZ = jOptLong;
            eVar.f15414ga = zOptBoolean4;
            if (strOptString.equals(d("㈆ᤫ಼"))) {
                this.bo = jSONObject.optJSONObject(d("㉄\u197e\u0cfe蘳썏懥"));
            } else {
                this.bp = ShieldException.unexpectedError(new Throwable(jSONObject.optString(d("㉛\u197e\u0cfe蘵썂懶낭"))));
            }
        } catch (JSONException e) {
            com.shield.android.internal.a.a(e, d("㉥\u197eೣ蘢쌃懢낡\ud803汜뙸學ⷳ隱쬄斐늾\ud905\uecd8瘲㭞᷾軫䜀ꏀ톫梃됄"), new Object[1254028897 ^ ((int) f15274d[1])]);
            this.bp = ShieldException.unexpectedError(e);
            com.shield.android.k.a.dL().a(e);
        }
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        if (shieldException.kind == ShieldException.Kind.HTTP) {
            String strD = d("㉥\u197eೣ蘢쌃懢낡\ud803汜뙸學ⷳ隱쬄斐늽\ud91e\uecc4瘴㭟ᶶ軮䜖ꎒ퇴棌둓婈");
            long[] jArr = f15274d;
            Object[] objArr = new Object[((int) jArr[2]) ^ 822015617];
            objArr[1254028897 ^ ((int) jArr[1])] = shieldException.message;
            objArr[((int) jArr[0]) ^ 1762088533] = shieldException.body;
            com.shield.android.internal.a.a(shieldException, strD, objArr);
        } else {
            String strD2 = d("㉥\u197eೣ蘢쌃懢낡\ud803汜뙸學ⷳ隱쬄斐늽\ud91e\uecc4瘴㭟ᶶ軮䜖");
            long[] jArr2 = f15274d;
            Object[] objArr2 = new Object[1762088533 ^ ((int) jArr2[0])];
            objArr2[((int) jArr2[1]) ^ 1254028897] = shieldException.message;
            com.shield.android.internal.a.a(shieldException, strD2, objArr2);
        }
        this.bp = shieldException;
    }

    public final void d(Map<String, Object> map) {
        this.hW = map;
    }
}
