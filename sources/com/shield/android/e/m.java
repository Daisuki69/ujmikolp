package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15277d = {1797047670, 713228352, 236298705, 373906327, 1879783919, 2126451710};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15278bf;
    public ShieldException bp;

    /* JADX INFO: renamed from: ia, reason: collision with root package name */
    private final String f15279ia;
    private final String ib;

    /* JADX INFO: renamed from: ic, reason: collision with root package name */
    public com.shield.android.internal.d f15280ic;
    private final String id;

    /* JADX INFO: renamed from: ie, reason: collision with root package name */
    private final boolean f15281ie;

    /* JADX INFO: renamed from: if, reason: not valid java name */
    private final String f1if;

    /* JADX INFO: renamed from: ig, reason: collision with root package name */
    private final String f15282ig;

    public m(String str, String str2, String str3, boolean z4, String str4, String str5) {
        this.f15279ia = str;
        this.ib = str2;
        this.id = str3;
        this.f15281ie = z4;
        this.f1if = str4;
        this.f15282ig = str5;
    }

    public static String d(String str) {
        int i = ((int) f15277d[3]) ^ 373925838;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15277d[1]) ^ 713228352;
        while (i4 < str.length()) {
            long[] jArr = f15277d;
            int i6 = (((i >> (((int) jArr[1]) ^ 713228352)) ^ (i >> (((int) jArr[2]) ^ 236298707))) ^ (i >> (((int) jArr[4]) ^ 1879783916))) ^ (i >> 5);
            long j = jArr[0];
            i = (char) ((i >> (((int) j) ^ 1797047671)) | (((char) (i6 & (((int) j) ^ 1797047671))) << (((int) jArr[5]) ^ 2126451697)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15277d[0];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1797047671, i11, i10, (((int) j6) ^ 1797047671) + i10 + i11));
            long j7 = f15277d[0];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1797047671) + (((int) j7) ^ 1797047671) + ((~(((int) j7) ^ 1797047671)) | i12) + (((((int) j7) ^ 1797047671) + i4) - ((((((int) j7) ^ 1797047671) + i4) + (((int) j7) ^ 1797047671)) + ((~(((int) j7) ^ 1797047671)) | i12)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.f15279ia;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        if (!this.f15281ie) {
            String strD = d("縃뽲\udfe2澶㞁鮞䶎⚙錌짆擰눙夆겴嘨ꭈ嗷ꪹ唋⫛锷䫘ꕩ틘\ue93c瓎㩨ᴏ\u0ee6");
            long[] jArr = f15277d;
            Object[] objArr = new Object[1797047671 ^ ((int) jArr[0])];
            objArr[713228352 ^ ((int) jArr[1])] = this.f15279ia;
            return String.format(strD, objArr);
        }
        String str = d("縃뽲\udfe2澶㞁鮞䶎⚙錌짆擰눙夆겴嘨ꭈ嗷ꪹ唋⫛锷䫘ꕹ틍\ue934瓆㨹ᵈ\u0ef4ܩ菎쇭悚뀝塞Ⱐ阫䭴▥銢줒\ue4d5\uf239菱ﳳ︯缘") + System.currentTimeMillis();
        long[] jArr2 = f15277d;
        Object[] objArr2 = new Object[1797047671 ^ ((int) jArr2[0])];
        objArr2[713228352 ^ ((int) jArr2[1])] = this.f15279ia;
        return String.format(str, objArr2);
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        return new HashMap<>(g.c(this.f15279ia, this.f1if));
    }

    @Override // com.shield.android.e.g
    public final String bW() {
        return d("繿뽂\udfca澂㞫鮿䶿").equalsIgnoreCase(this.id) ? d("繄뽢\udfff澵㞑鯋䷗⛓錍짉撼뉂奓곲嘾ꭅ嗼꪿唁⫀锠䪁ꔥ틟\ue934瓍㨼ᵄ\u0ef2ݤ菖솺悀뀑塖ⱹ阠䭤◬銬") : d("繄뽢\udfff澵㞑鯋䷗⛓錍짚播눙奞곸嘨ꬋ嗷ꪠ唗⫑锶䫚ꔳ틙\ue92c璄㨦ᵂ\u0efcܯ菉솶惇뀗塕Ɒ");
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
        return null;
    }

    @Override // com.shield.android.e.g
    public final void c(ShieldException shieldException) {
        if (shieldException.kind == ShieldException.Kind.HTTP) {
            String strD = d("繿뽳\udff9澳㞋鮒䶝⛜錚짖撬눌奘곭嘨ꭔ嗪ꫩ唁⫀锫䫃ꔤ튋\ue970瓙㩵ᴇີݯ菖");
            long[] jArr = f15277d;
            Object[] objArr = new Object[((int) jArr[2]) ^ 236298707];
            objArr[713228352 ^ ((int) jArr[1])] = shieldException.message;
            objArr[((int) jArr[0]) ^ 1797047671] = shieldException.body;
            com.shield.android.internal.a.a(shieldException, strD, objArr);
        } else {
            String strD2 = d("繿뽳\udff9澳㞋鮒䶝⛜錚짖撬눌奘곭嘨ꭔ嗪ꫩ唁⫀锫䫃ꔤ튋\ue970瓙");
            long[] jArr2 = f15277d;
            Object[] objArr2 = new Object[1797047671 ^ ((int) jArr2[0])];
            objArr2[((int) jArr2[1]) ^ 713228352] = shieldException.message;
            com.shield.android.internal.a.a(shieldException, strD2, objArr2);
        }
        this.bp = shieldException;
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15278bf;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
        try {
            com.shield.android.k.a.dL().a(d("繿뽳\udff9澳㞋鮒䶝⛜錚짖撬눌奘곭嘨ꭔ嗪ꫩ唖⫗锪䫜ꔹ틅\ue926瓏㩵ᴗີ") + str, new Object[((int) f15277d[1]) ^ 713228352]);
            this.bp = null;
            com.shield.android.k.a.dL().a(str, new Object[((int) f15277d[1]) ^ 713228352]);
            JSONObject jSONObject = new JSONObject(str);
            this.f15280ic = new com.shield.android.internal.d(jSONObject.optString(d("繉뽸\udfef澵㞍鮘䶖⚈")), String.valueOf(jSONObject.optInt(d("繚뽳\udff9澶㞋鮞䶖"), ((int) f15277d[1]) ^ 713228352)));
        } catch (Exception e) {
            com.shield.android.internal.a.a(e, d("繿뽳\udff9澳㞋鮒䶝⛜錚짖撬눌奘곭嘨ꭔ嗪ꫩ唂⫛锷䫅ꔥ틃\ue975瓏㨧ᵘ\u0efaܸ"), new Object[713228352 ^ ((int) f15277d[1])]);
            this.bp = ShieldException.unexpectedError(e);
        }
    }
}
