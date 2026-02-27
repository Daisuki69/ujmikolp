package com.shield.android.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.ShieldCallback;
import com.shield.android.ShieldException;
import dOYHB6.yFtIp6.svM7M6;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15337d = {776446013, 1673508322, 737579612};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private String f15338Q;

    /* JADX INFO: renamed from: ie, reason: collision with root package name */
    private boolean f15339ie;
    private SharedPreferences is;
    private com.shield.android.e.e it;
    private com.shield.android.e.i iu;
    private com.shield.android.e.m iw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private h f15340jg;

    /* JADX INFO: renamed from: jh, reason: collision with root package name */
    private b f15341jh;

    /* JADX INFO: renamed from: ji, reason: collision with root package name */
    private String f15342ji;

    public g(Context context, String str, com.shield.android.e.i iVar, String str2, String str3, boolean z4, String str4, String str5) {
        this.f15342ji = g("舱舺舰舤舻舽舺舠");
        try {
            this.is = com.shield.android.internal.i.k(context, str2);
            this.f15338Q = str;
            this.iw = new com.shield.android.e.m(str2, str3, str, z4, str4, str5);
            this.it = new com.shield.android.e.e(str2, str3, str4, str5);
            this.iu = iVar;
            this.f15339ie = z4;
            this.f15342ji = z4 ? g("舲舵舸舸舶舵舷舿舋舱舺舰舤舻舽舺舠") : g("舱舺舰舤舻舽舺舠");
        } catch (Exception unused) {
        }
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15337d[1]) ^ 1673508322;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15337d;
            long j = jArr[2];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 737546248) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 737546248) + (((int) j6) ^ 776446012), i4 | (~(((int) j) ^ 737546248)), i6, (((int) j) ^ 737546248) + cCharAt + (((int) j6) ^ 776446012) + ((~(((int) j) ^ 737546248)) | i4)));
            long j7 = f15337d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 776446012) + (((int) j7) ^ 776446012) + ((~(((int) j7) ^ 776446012)) | i10) + (((((int) j7) ^ 776446012) + i) - ((((((int) j7) ^ 776446012) + i) + (((int) j7) ^ 776446012)) + ((~(((int) j7) ^ 776446012)) | i10)));
        }
        return sb2.toString();
    }

    public final void ct() {
        this.f15341jh.ce();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(final ShieldCallback<Pair<com.shield.android.internal.d, com.shield.android.internal.c>> shieldCallback) {
        try {
            if (this.f15339ie) {
                SharedPreferences sharedPreferences = this.is;
                if (sharedPreferences == null) {
                    this.f15340jg = new e(this.iw, this.iu, null, 776446012 ^ ((int) f15337d[0]));
                } else if (com.shield.android.internal.i.a(svM7M6.getString(sharedPreferences, this.f15342ji, g("")))) {
                    this.f15340jg = new e(this.iw, this.iu, this.is, 776446012 ^ ((int) f15337d[0]));
                } else {
                    this.f15340jg = new com.shield.android.n.b(this.is, this.f15339ie);
                }
            } else {
                SharedPreferences sharedPreferences2 = this.is;
                if (sharedPreferences2 == null || !sharedPreferences2.contains(g("舱舺舢舽舦舻舺船舱舺舠")) || svM7M6.getString(this.is, g("舱舺舢舽舦舻舺船舱舺舠"), g("")).equalsIgnoreCase(this.f15338Q)) {
                    SharedPreferences sharedPreferences3 = this.is;
                    if (sharedPreferences3 == null || !sharedPreferences3.contains(this.f15342ji) || svM7M6.getString(this.is, this.f15342ji, g("")).length() <= 0) {
                        this.f15340jg = new e(this.iw, this.iu, this.is, this.f15339ie);
                    } else {
                        this.f15340jg = new com.shield.android.n.b(this.is, this.f15339ie);
                    }
                } else {
                    this.is.edit().putString(g("舱舺舢舽舦舻舺船舱舺舠"), this.f15338Q).apply();
                    this.is.edit().remove(this.f15342ji).apply();
                    this.f15340jg = new e(this.iw, this.iu, this.is, this.f15339ie);
                }
            }
            this.f15340jg.c(new ShieldCallback<com.shield.android.internal.d>() { // from class: com.shield.android.f.g.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15343d = {292707531, 1186154741, -598896897, 1934022239, 581961959, 1165172264, 116494559, 806738055};

                public static String d(String str) {
                    int i = ((int) f15343d[4]) ^ 581989144;
                    StringBuilder sb2 = new StringBuilder();
                    int i4 = ((int) f15343d[0]) ^ 292707531;
                    while (i4 < str.length()) {
                        long[] jArr = f15343d;
                        int i6 = (((i >> (((int) jArr[0]) ^ 292707531)) ^ (i >> (((int) jArr[5]) ^ 1165172266))) ^ (i >> (((int) jArr[6]) ^ 116494556))) ^ (i >> 5);
                        long j = jArr[3];
                        i = (char) ((i >> (((int) j) ^ 1934022238)) | (((char) (i6 & (((int) j) ^ 1934022238))) << (((int) jArr[7]) ^ 806738056)));
                        char cCharAt = str.charAt(i4);
                        int i10 = cCharAt + i;
                        long j6 = f15343d[3];
                        int i11 = (~cCharAt) | (~i);
                        sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1934022238, i11, i10, (((int) j6) ^ 1934022238) + i10 + i11));
                        long j7 = f15343d[3];
                        int i12 = ~i4;
                        i4 = i4 + (((int) j7) ^ 1934022238) + (((int) j7) ^ 1934022238) + ((~(((int) j7) ^ 1934022238)) | i12) + (((((int) j7) ^ 1934022238) + i4) - ((((((int) j7) ^ 1934022238) + i4) + (((int) j7) ^ 1934022238)) + ((~(((int) j7) ^ 1934022238)) | i12)));
                    }
                    return sb2.toString();
                }

                @Override // com.shield.android.ShieldCallback
                public final void onFailure(@Nullable ShieldException shieldException) {
                    shieldCallback.onFailure(shieldException);
                }

                @Override // com.shield.android.ShieldCallback
                public final /* synthetic */ void onSuccess(@Nullable com.shield.android.internal.d dVar) {
                    final com.shield.android.internal.d dVar2 = dVar;
                    if (dVar2 == null) {
                        com.shield.android.internal.a.a(d("㶬ặ༶ߺΓ膫䃗ꀽ큭栾㑟驕䵌ꛂ팅槳뒃婈ⴙᚤ譭엀抲넀\ud8d8氿뙉嬶귬嚠⬖闅䪱ꔂ틑楻㓘ᨤ赇"), new Object[292707531 ^ ((int) f15343d[0])]);
                        shieldCallback.onFailure(ShieldException.unexpectedError(new Throwable(d("㶑Ẑཟߊέ膃䃗ꀟ큜桪㑮騧䵥ꛮ팵槎뒴"))));
                        return;
                    }
                    com.shield.android.internal.a.a(d("㶬ặ༶ߺΓ膫䃗ꀽ큭栾㑟驕䵌ꛂ팅槳뒃婈ⴙᚤ譭엕抦넊\ud8d7氿뙞孥궫嚢⬇闅䪬ꔅ틘椼㒍ᨣ赙웹"), new Object[((int) f15343d[0]) ^ 292707531]);
                    try {
                        String strD = d("㶚ẑ༜߯Γ");
                        String strD2 = d("㶙ẏ༼ߐα膉䂞ꀜ큩桷㑢驢䵰꛵팡槍뒠娣ⵑᛣ");
                        int i = g.this.is.getInt(d("㶙ẏ༬ߚΫ膛䂞ꀕ큚桝㑮驤䵫ꛤ"), ((int) f15343d[1]) ^ 1186454293);
                        long j = g.this.is.getLong(strD2, f15343d[2] ^ 598896896);
                        if (((j == (f15343d[2] ^ 598896896) || System.currentTimeMillis() - j > ((long) i)) ? ((int) f15343d[0]) ^ 292707531 : ((int) f15343d[3]) ^ 1934022238) == 0 || g.this.is == null || !g.this.is.contains(strD)) {
                            com.shield.android.internal.a.a(d("㶬ặ༶ߺΓ膫䃗ꀽ큭栾㑟驕䵌ꛂ팅槳뒃婈ⴙᚤ譭엀抶넝\ud8d7氲뙄學귬囥⬌闔䪬ꔛ틙椩㓆᩶赈웺挤뇃\ud8bb氎뙇"), new Object[((int) f15343d[0]) ^ 292707531]);
                            g.this.it.v(dVar2.bG());
                            g.this.it.w(dVar2.bH());
                            g gVar = g.this;
                            gVar.f15341jh = new d(gVar.it, g.this.iu, g.this.is);
                        } else {
                            com.shield.android.internal.a.a(d("㶬ặ༶ߺΓ膫䃗ꀽ큭栾㑟驕䵌ꛂ팅槳뒃婈ⴙᚤ譭엀抶넝\ud8d7氲뙄學귬囥⬁闐䪻ꔄ틓椿㒍ᨵ资웻挬뇌\ud8b5氚"), new Object[((int) f15343d[0]) ^ 292707531]);
                            g gVar2 = g.this;
                            gVar2.f15341jh = new a(gVar2.is);
                        }
                        g.this.f15341jh.a(new ShieldCallback<com.shield.android.internal.c>() { // from class: com.shield.android.f.g.1.1

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            private static long[] f15346d = {1261950768, 1718192001, 222792713};

                            public static String g(String str) {
                                StringBuilder sb2 = new StringBuilder();
                                int i4 = ((int) f15346d[0]) ^ 1261950768;
                                while (i4 < str.length()) {
                                    char cCharAt = str.charAt(i4);
                                    long[] jArr = f15346d;
                                    long j6 = jArr[1];
                                    long j7 = jArr[2];
                                    int i6 = ~cCharAt;
                                    int i10 = (((int) j6) ^ 1718199952) + cCharAt;
                                    sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j6) ^ 1718199952) + (((int) j7) ^ 222792712), i6 | (~(((int) j6) ^ 1718199952)), i10, (((int) j6) ^ 1718199952) + cCharAt + (((int) j7) ^ 222792712) + ((~(((int) j6) ^ 1718199952)) | i6)));
                                    long j9 = f15346d[2];
                                    int i11 = ~i4;
                                    i4 = i4 + (((int) j9) ^ 222792712) + (((int) j9) ^ 222792712) + ((~(((int) j9) ^ 222792712)) | i11) + (((((int) j9) ^ 222792712) + i4) - ((((((int) j9) ^ 222792712) + i4) + (((int) j9) ^ 222792712)) + ((~(((int) j9) ^ 222792712)) | i11)));
                                }
                                return sb2.toString();
                            }

                            @Override // com.shield.android.ShieldCallback
                            public final void onFailure(@Nullable ShieldException shieldException) {
                                com.shield.android.k.a.dL().a(shieldException);
                                com.shield.android.internal.a.a(g("⅂⅙⅘⅔⅝⅕ℱ⅗⅁ℱ⅁⅃⅞⅒⅔⅂⅂ℱℼℯℱⅷⅰⅸⅽⅴⅵℱⅶⅴⅥⅥⅸⅿⅶℱⅲⅾⅿⅷⅸⅶⅢ"), new Object[((int) f15346d[0]) ^ 1261950768]);
                                shieldCallback.onSuccess(new Pair(dVar2, new com.shield.android.internal.c()));
                            }

                            @Override // com.shield.android.ShieldCallback
                            public final /* synthetic */ void onSuccess(@Nullable com.shield.android.internal.c cVar) {
                                com.shield.android.internal.a.a(g("⅂⅙⅘⅔⅝⅕ℱ⅗⅁ℱ⅁⅃⅞⅒⅔⅂⅂ℱℼℯℱⅢⅤⅲⅲⅴⅢⅢℱⅶⅴⅥⅥⅸⅿⅶℱⅲⅾⅿⅷⅸⅶⅢ"), new Object[((int) f15346d[0]) ^ 1261950768]);
                                shieldCallback.onSuccess(new Pair(dVar2, cVar));
                            }
                        });
                    } catch (Exception e) {
                        com.shield.android.internal.a.a(e, d("㶬ặ༶ߺΓ膫䃗ꀽ큭栾㑟驕䵌ꛂ팅槳뒃婈ⴙᚤ譭엃抡넛\ud8db氨똍孷귭嚱⬇闃䫸ꔋ틓椯㓙ᨿ赅웲捪뇐\ud8a0氅"), new Object[292707531 ^ ((int) f15343d[0])]);
                        com.shield.android.k.a.dL().a(e);
                    }
                }
            });
            SharedPreferences sharedPreferences4 = this.is;
            if (sharedPreferences4 == null || sharedPreferences4.contains(g("舱舺舢舽舦舻舺船舱舺舠"))) {
                return;
            }
            this.is.edit().putString(g("舱舺舢舽舦舻舺船舱舺舠"), this.f15338Q).apply();
        } catch (Exception e) {
            shieldCallback.onFailure(ShieldException.unexpectedError(e));
        }
    }
}
