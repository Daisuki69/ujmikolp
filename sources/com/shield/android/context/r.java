package com.shield.android.context;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.Shield;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15180d = {1629879214, 734567355, 1724497, 272706079, 2017168506, 1405724920, 134862948, 956002413, 1673595194, 1309843051};
    private static final String ev;
    private final Context ep;
    private final boolean eq;
    private final NativeUtils er;
    private final String es;
    private t et;
    private Location eu;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15181d = {324045803, 430140784, 447220018, 649001899, 1034859371, 1748212974};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15181d[0]) ^ 324045802, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return r.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            if ((!com.shield.android.internal.i.b(r.this.ep, "android.permission.ACCESS_FINE_LOCATION") && !com.shield.android.internal.i.b(r.this.ep, "android.permission.ACCESS_COARSE_LOCATION")) || !com.shield.android.internal.i.L(r.this.ep)) {
                concurrentHashMapR.put(r.this.er.getKeyValue("ct"), "disabled");
                return concurrentHashMapR;
            }
            try {
                tVar = r.this.et;
            } catch (Exception e) {
                com.shield.android.k.a.dL().a(e);
            }
            if (tVar == null) {
                kotlin.jvm.internal.j.n("");
                throw null;
            }
            tVar.aM();
            r rVar = r.this;
            t tVar2 = rVar.et;
            if (tVar2 == null) {
                kotlin.jvm.internal.j.n("");
                throw null;
            }
            rVar.eu = tVar2.aP();
            Location location = r.this.eu;
            if (location != null) {
                String keyValue = r.this.er.getKeyValue("ct");
                Locale locale = Locale.ENGLISH;
                long[] jArr = f15181d;
                Object[] objArr = new Object[((int) jArr[1]) ^ 430140790];
                objArr[((int) jArr[2]) ^ 447220018] = new Double(location.getLatitude());
                objArr[((int) f15181d[0]) ^ 324045802] = new Double(location.getLongitude());
                objArr[((int) f15181d[3]) ^ 649001897] = new Double(location.getAltitude());
                objArr[((int) f15181d[4]) ^ 1034859368] = new Float(location.getSpeed());
                objArr[4] = new Float(location.getAccuracy());
                objArr[5] = new Float(Build.VERSION.SDK_INT >= (((int) f15181d[5]) ^ 1748212980) ? location.getVerticalAccuracyMeters() : 0.0f);
                concurrentHashMapR.put(keyValue, String.format(locale, "%.6f,%.6f,%.6f,%.6f,%.6f,%.6f", Arrays.copyOf(objArr, ((int) f15181d[1]) ^ 430140790)));
                return concurrentHashMapR;
            }
            return concurrentHashMapR;
        }
    }

    static {
        new a((((int) 734567355) ^ 734567355) == true ? (byte) 1 : (byte) 0);
        ev = "r";
    }

    public r(Context context, boolean z4, NativeUtils nativeUtils, String str) {
        kotlin.jvm.internal.j.g(context, d("䘱⍆釺좾\ue400\uf24a省"));
        kotlin.jvm.internal.j.g(nativeUtils, d("䘼⍈釠좣\ue413\uf257樓糸㸯齏俢"));
        kotlin.jvm.internal.j.g(str, d("䘡⍀釠좯\ue42c\uf256"));
        this.ep = context;
        this.eq = z4;
        this.er = nativeUtils;
        this.es = str;
        try {
            if (com.shield.android.internal.i.M(context)) {
                this.et = new m(context, str);
            } else {
                this.et = new s(context);
            }
            t tVar = this.et;
            if (tVar != null) {
                tVar.a(this);
            } else {
                kotlin.jvm.internal.j.n(d("䘠⍌釥좿\ue400\uf241省糄㸣齏信Ɬ펖"));
                throw null;
            }
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
        }
    }

    public static String d(String str) {
        int i = ((int) f15180d[6]) ^ 134829248;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15180d[1]) ^ 734567355;
        while (i4 < str.length()) {
            long[] jArr = f15180d;
            int i6 = (((i >> (((int) jArr[1]) ^ 734567355)) ^ (i >> (((int) jArr[7]) ^ 956002415))) ^ (i >> (((int) jArr[8]) ^ 1673595193))) ^ (i >> 5);
            long j = jArr[0];
            i = (char) ((i >> (((int) j) ^ 1629879215)) | (((char) (i6 & (((int) j) ^ 1629879215))) << (((int) jArr[9]) ^ 1309843044)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15180d[0];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1629879215, i11, i10, (((int) j6) ^ 1629879215) + i10 + i11));
            long j7 = f15180d[0];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1629879215) + (((int) j7) ^ 1629879215) + ((~(((int) j7) ^ 1629879215)) | i12) + (((((int) j7) ^ 1629879215) + i4) - ((((((int) j7) ^ 1629879215) + i4) + (((int) j7) ^ 1629879215)) + ((~(((int) j7) ^ 1629879215)) | i12)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0004, B:5:0x0008, B:9:0x0016, B:11:0x0022, B:18:0x0034, B:12:0x0025, B:13:0x0028, B:16:0x002c, B:20:0x003b, B:22:0x0042, B:23:0x004c), top: B:26:0x0004 }] */
    @androidx.annotation.RequiresApi(api = 18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bc() {
        /*
            r9 = this;
            r0 = 734567355(0x2bc89bbb, float:1.4254079E-12)
            r1 = 1
            com.shield.android.context.t r2 = r9.et     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L42
            android.location.Location r2 = r2.aP()     // Catch: java.lang.Exception -> L2a
            r9.eu = r2     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L3b
            r3 = 0
            r4 = 1629879215(0x6125fbaf, float:1.9136553E20)
            if (r2 == 0) goto L2c
            boolean r2 = r2.isFromMockProvider()     // Catch: java.lang.Exception -> L2a
            long[] r5 = com.shield.android.context.r.f15180d     // Catch: java.lang.Exception -> L2a
            r6 = r5[r3]     // Catch: java.lang.Exception -> L2a
            int r8 = (int) r6     // Catch: java.lang.Exception -> L2a
            r8 = r8 ^ r4
            if (r2 != r8) goto L25
            int r2 = (int) r6     // Catch: java.lang.Exception -> L2a
            r2 = r2 ^ r4
            goto L32
        L25:
            r6 = r5[r1]     // Catch: java.lang.Exception -> L2a
            int r2 = (int) r6     // Catch: java.lang.Exception -> L2a
        L28:
            r2 = r2 ^ r0
            goto L32
        L2a:
            r2 = move-exception
            goto L4d
        L2c:
            long[] r2 = com.shield.android.context.r.f15180d     // Catch: java.lang.Exception -> L2a
            r5 = r2[r1]     // Catch: java.lang.Exception -> L2a
            int r2 = (int) r5     // Catch: java.lang.Exception -> L2a
            goto L28
        L32:
            if (r2 == 0) goto L3b
            long[] r2 = com.shield.android.context.r.f15180d     // Catch: java.lang.Exception -> L2a
            r0 = r2[r3]     // Catch: java.lang.Exception -> L2a
            int r0 = (int) r0     // Catch: java.lang.Exception -> L2a
            r0 = r0 ^ r4
            return r0
        L3b:
            long[] r2 = com.shield.android.context.r.f15180d     // Catch: java.lang.Exception -> L2a
            r1 = r2[r1]     // Catch: java.lang.Exception -> L2a
            int r1 = (int) r1     // Catch: java.lang.Exception -> L2a
            r0 = r0 ^ r1
            return r0
        L42:
            java.lang.String r2 = "䘠⍌釥좿\ue400\uf241省糄㸣齏信Ɬ펖"
            java.lang.String r2 = d(r2)     // Catch: java.lang.Exception -> L2a
            kotlin.jvm.internal.j.n(r2)     // Catch: java.lang.Exception -> L2a
            r2 = 0
            throw r2     // Catch: java.lang.Exception -> L2a
        L4d:
            com.shield.android.k.a r3 = com.shield.android.k.a.dL()
            r3.a(r2)
            long[] r2 = com.shield.android.context.r.f15180d
            r1 = r2[r1]
            int r1 = (int) r1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.r.bc():boolean");
    }

    public final List<g> bd() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        return cj.r.c(new g(ev + ((((int) f15180d[4]) ^ 2017168459) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15180d[5]) ^ 1405724926));
    }

    @Override // com.shield.android.context.u
    @SuppressLint({"DefaultLocale"})
    public final void getLocation(Location location) {
        try {
            if (this.eu != null && Build.VERSION.SDK_INT >= (((int) f15180d[2]) ^ 1724483)) {
                Boolean boolValueOf = location != null ? Boolean.valueOf(location.isFromMockProvider()) : null;
                Location location2 = this.eu;
                if (!kotlin.jvm.internal.j.b(boolValueOf, location2 != null ? Boolean.valueOf(location2.isFromMockProvider()) : null)) {
                    Shield.getInstance().sendDeviceSignature(d("䘡⍁釽좯\ue409\uf256牢糫㸶齐俎Ꞹ펖榝뒏\uda15\ued5a\uf6fa\ufb3dﷸﺫ０ￎ"));
                }
            }
            this.eu = location;
            if (!this.eq || (Build.VERSION.SDK_INT >= (((int) f15180d[3]) ^ 272706050) && !com.shield.android.internal.i.j(this.ep, d("䘳⍇釰좸\ue40a\uf25b諒粢㸶齆俣ꞥ펍榁뒊\uda15\ued51\uf6f1ﭡ\ufde6ﺐＪ\ufff1羉뾾復⾹鞼䮽ꖴ劸⤭ᓰਊ蕡䋓℔ჩ蠝䑪ꉕ텞\ue8cc琍㩯")))) {
                t tVar = this.et;
                if (tVar != null) {
                    tVar.aN();
                } else {
                    kotlin.jvm.internal.j.n(d("䘠⍌釥좿\ue400\uf241省糄㸣齏信Ɬ펖"));
                    throw null;
                }
            }
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
        }
    }
}
