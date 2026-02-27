package com.shield.android.e;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldCrossPlatformHelper;
import com.shield.android.ShieldException;
import com.shield.android.shieldsignature.ShieldSignature;
import com.shield.android.shieldsignature.ShieldSignatureGenerator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15262d = {398969377, 1952547374, 1175590558, 1150804168, 1014993774};
        public static final a hm;
        public static final a hn;
        public static final a ho;
        private static final /* synthetic */ a[] hp;

        static {
            a aVar = new a(g("\ue277\ue275\ue264"), ((int) f15262d[0]) ^ 398969377);
            hm = aVar;
            a aVar2 = new a(g("\ue260\ue27f\ue263\ue264"), ((int) f15262d[1]) ^ 1952547375);
            hn = aVar2;
            a aVar3 = new a(g("\ue260\ue265\ue264"), ((int) f15262d[2]) ^ 1175590556);
            ho = aVar3;
            long[] jArr = f15262d;
            a[] aVarArr = new a[((int) jArr[3]) ^ 1150804171];
            aVarArr[((int) jArr[0]) ^ 398969377] = aVar;
            aVarArr[((int) jArr[1]) ^ 1952547375] = aVar2;
            aVarArr[((int) jArr[2]) ^ 1175590556] = aVar3;
            hp = aVarArr;
        }

        private a(String str, int i) {
        }

        public static a[] cc() {
            return (a[]) hp.clone();
        }

        public static String g(String str) {
            StringBuilder sb2 = new StringBuilder();
            int i = ((int) f15262d[0]) ^ 398969377;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                long[] jArr = f15262d;
                long j = jArr[4];
                long j6 = jArr[1];
                int i4 = ~cCharAt;
                int i6 = (((int) j) ^ 1014985054) + cCharAt;
                sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1014985054) + (((int) j6) ^ 1952547375), i4 | (~(((int) j) ^ 1014985054)), i6, (((int) j) ^ 1014985054) + cCharAt + (((int) j6) ^ 1952547375) + ((~(((int) j) ^ 1014985054)) | i4)));
                long j7 = f15262d[1];
                int i10 = ~i;
                i = i + (((int) j7) ^ 1952547375) + (((int) j7) ^ 1952547375) + ((~(((int) j7) ^ 1952547375)) | i10) + (((((int) j7) ^ 1952547375) + i) - ((((((int) j7) ^ 1952547375) + i) + (((int) j7) ^ 1952547375)) + ((~(((int) j7) ^ 1952547375)) | i10)));
            }
            return sb2.toString();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15263d = {1752363832, 404503900, 158166092, 1991449130, 1490186160, 1460972652};
        public static final b hq;
        private static b hr;
        public static final b hs;
        final String ht;

        static {
            b bVar = new b(f("䶶䶮䶱䶱"), ((int) f15263d[0]) ^ 1752363832, f("䶝䶍䶎䶓䶑䶚䶛䶏䶝䶚䶘䷘䶚䶂䶝䶝"));
            hq = bVar;
            hr = new b(f("䶺䶲䶬䶲䶧䶬䶨䶷䶫䶰䶸䶴䶿䶵䶷䶷"), ((int) f15263d[1]) ^ 404503901, f("䶝䶍䶎䶓䶑䶚䶛䶏䶝䶚䶘䷘䶈䷜䶅䶄䶛䷀䶈䶀䶚䶄䷇䶞䶖䶉䶃䶉䶃䶎䶆䶆䶸"));
            b bVar2 = new b(f("䶨䶸䶦䶫"), ((int) f15263d[2]) ^ 158166094, f("䶈䶘䶆䶋䷗䶉䶖䶚䶝䶛"));
            hs = bVar2;
            long[] jArr = f15263d;
            b[] bVarArr = new b[((int) jArr[3]) ^ 1991449129];
            bVarArr[((int) jArr[0]) ^ 1752363832] = bVar;
            bVarArr[((int) jArr[1]) ^ 404503901] = hr;
            bVarArr[((int) jArr[2]) ^ 158166094] = bVar2;
        }

        private b(String str, int i, String str2) {
            this.ht = str2;
        }

        public static String f(String str) {
            StringBuilder sb2 = new StringBuilder();
            int i = ((int) f15263d[0]) ^ 1752363832;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                long[] jArr = f15263d;
                long j = jArr[4];
                long j6 = jArr[1];
                int i4 = ~cCharAt;
                int i6 = (((int) j) ^ 1490166348) + cCharAt;
                sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1490166348)) + (((int) j6) ^ 404503901), (~(((int) j) ^ 1490166348)) | i4, i6, (((((int) j) ^ 1490166348) + cCharAt) + (((int) j6) ^ 404503901)) + ((~(((int) j) ^ 1490166348)) | i4)) ^ (i % (((int) jArr[5]) ^ 1460949907))));
                long j7 = f15263d[1];
                int i10 = ~i;
                i = i + (((int) j7) ^ 404503901) + (((int) j7) ^ 404503901) + ((~(((int) j7) ^ 404503901)) | i10) + (((((int) j7) ^ 404503901) + i) - ((((((int) j7) ^ 404503901) + i) + (((int) j7) ^ 404503901)) + ((~(((int) j7) ^ 404503901)) | i10)));
            }
            return sb2.toString();
        }
    }

    public static HashMap<String, String> c(String str, String str2) {
        ShieldSignature shieldSignature = ShieldSignatureGenerator.getShieldSignature(str, str);
        HashMap<String, String> map = new HashMap<>();
        map.put(d("ݝϭƿ"), String.valueOf(shieldSignature.isNTP()));
        map.put(d("ݧϰơ\u0083\u0000M聽䁣⁷"), String.valueOf(shieldSignature.getTimestamp()));
        map.put(d("ݠϱƥ\u0083\u001f]耱䁝\u206eၤ衯쑡扴ㅵᣲథ"), shieldSignature.getSignature());
        map.put(d("ݠϰƸ\u0083^p聸"), str);
        if (ShieldCrossPlatformHelper.getCrossPlatformParameters() != null) {
            map.put(d("\u074bδƯ\u0096"), ShieldCrossPlatformHelper.getCrossPlatformParameters().getName());
            map.put(d("\u074bδƯ\u0096\u0005"), ShieldCrossPlatformHelper.getCrossPlatformParameters().getVersion());
        }
        map.put(d("ݠϜƟµ:v聒䁑⁎၇"), str2);
        map.put(d("݀ϽƧË\u0005X聮䁧\u2066ၭ衵"), d("ݒϫƨ"));
        return map;
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        char c = 3686;
        int i = 0;
        while (i < str.length()) {
            c = (char) ((c >> 1) | (((char) (((((c >> 2) ^ c) ^ (c >> 3)) ^ (c >> 5)) & 1)) << 15));
            char cCharAt = str.charAt(i);
            int i4 = cCharAt + c;
            int i6 = i4 + 1 + ((~cCharAt) | (~c));
            sb2.append((char) (i6 - (i4 - i6)));
            int i10 = i + 2 + ((~i) | (-2));
            i = ((i + 1) - i10) + i10;
        }
        return sb2.toString();
    }

    public abstract String ag();

    public abstract String bG();

    public abstract HashMap<String, String> bV();

    public abstract String bW();

    public abstract a bX();

    public abstract b bY();

    public abstract Map<String, Object> bZ();

    public abstract void c(ShieldException shieldException);

    public abstract String getVersion();

    public abstract void r(String str);
}
