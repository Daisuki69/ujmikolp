package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldException;
import com.shield.android.e.g;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15269d = {1508001553, 1480451498, 830373069, 265726534, 960746389};

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private String f15270bf;
    private ShieldException bp;
    private Map<String, Object> gS;
    private HashMap<String, String> gT;
    private String gl;
    private final String hC;
    private final String hD;
    private final String hE;
    private final String hF;

    public j(String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.j.g(str, f("ῒΈῗῇῬ῀"));
        kotlin.jvm.internal.j.g(str2, f("ῒ\u1fc5῀ῐ῀ῐῬῃῐ"));
        kotlin.jvm.internal.j.g(str3, f("ῒ\u1fc5ῐῑῌΉΈ`῍"));
        kotlin.jvm.internal.j.g(str4, f("ῂῌῊῇΉῐ΅ῂ"));
        this.hC = str;
        this.hD = str2;
        this.hE = str3;
        this.hF = str4;
        this.gl = f("");
        this.f15270bf = f("");
        this.gT = new HashMap<>();
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15269d[1]) ^ 1480451498;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15269d;
            long j = jArr[3];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 265729511) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 265729511)) + (((int) j6) ^ 830373068), (~(((int) j) ^ 265729511)) | i4, i6, (((((int) j) ^ 265729511) + cCharAt) + (((int) j6) ^ 830373068)) + ((~(((int) j) ^ 265729511)) | i4)) ^ (i % (((int) jArr[4]) ^ 960703594))));
            long j7 = f15269d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 830373068) + (((int) j7) ^ 830373068) + ((~(((int) j7) ^ 830373068)) | i10) + (((((int) j7) ^ 830373068) + i) - ((((((int) j7) ^ 830373068) + i) + (((int) j7) ^ 830373068)) + ((~(((int) j7) ^ 830373068)) | i10)));
        }
        return sb2.toString();
    }

    @Override // com.shield.android.e.g
    public final String ag() {
        return this.hC;
    }

    public final void b(Map<String, Object> map) {
        kotlin.jvm.internal.j.g(map, f("ῑ῁Ὶ῎Ὴ\u1fc5ῃ"));
        this.gS = map;
    }

    @Override // com.shield.android.e.g
    public final String bG() {
        return f("ᾎΐΉΉ῀Ὲῃᾋ῏Ῐᾄ\u1fdcᾜᾃ῎῞ῘᾟῚ\u1fdc῁ῑΊῚῐ῟῞\u1fd4῞Ῑᾐ῟ῢῴῪ῭Ύᾫῷῧ\u1ff0ῤῤΎῩᾡΏ`ῼῠῶῠ\u1ff0\u1ff0");
    }

    @Override // com.shield.android.e.g
    public final HashMap<String, String> bV() {
        this.gT.putAll(g.c(this.hC, this.hE));
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
        if (kind == ShieldException.Kind.HTTP) {
            com.shield.android.k.a aVarDL = com.shield.android.k.a.dL();
            String strF = f("ᾄΐᾃᾏᾅᾁ\u1fd4");
            long[] jArr = f15269d;
            Object[] objArr = new Object[((int) jArr[0]) ^ 1508001555];
            objArr[1480451498 ^ ((int) jArr[1])] = shieldException.message;
            objArr[((int) jArr[2]) ^ 830373068] = shieldException.body;
            aVarDL.a(shieldException, strF, objArr);
        } else {
            com.shield.android.k.a.dL().a(shieldException, shieldException != null ? shieldException.message : null, new Object[((int) f15269d[1]) ^ 1480451498]);
        }
        this.bp = shieldException;
    }

    public final ShieldException cd() {
        return this.bp;
    }

    @Override // com.shield.android.e.g
    public final String getVersion() {
        return this.f15270bf;
    }

    @Override // com.shield.android.e.g
    public final void r(String str) {
    }

    public final void x(String str) {
        if (str == null) {
            str = f("");
        }
        this.gl = str;
    }

    public final void y(String str) {
        if (str == null) {
            str = f("");
        }
        this.f15270bf = str;
    }
}
