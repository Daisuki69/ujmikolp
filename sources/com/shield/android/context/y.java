package com.shield.android.context;

import android.content.Context;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15188d = {400218689, 1164806547, 326112203, -275172778, 1062100533, 335611462, 2085329463, 1655500620, 1510260003};
    private static a eN = new a((((int) 326112203) ^ 326112203) == true ? 1 : 0);
    private final x eO;
    private final C1298a eP;
    private final C1299b eQ;
    private final j eR;
    private final r eS;
    private final A eT;
    private final UserRelatedInfoJobScheduler eU;
    private final n eV;
    private final l eW;
    private final v eX;
    private final q eY;
    private final k eZ;

    /* JADX INFO: renamed from: fa, reason: collision with root package name */
    private final TouchEventInfoJobScheduler f15189fa;
    private final z fb;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final long f15190fc;
    private boolean fd;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1609c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15191d = {-252598768};
        int bE;
        /* synthetic */ Object bM;
        Object bO;
        Object bP;

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.bM = obj;
            this.bE |= ((int) f15191d[0]) ^ 1894884880;
            return y.this.c(this);
        }
    }

    public /* synthetic */ y(ConcurrentMap concurrentMap, x xVar, C1298a c1298a, C1299b c1299b, j jVar, r rVar, A a8, UserRelatedInfoJobScheduler userRelatedInfoJobScheduler, n nVar, l lVar, v vVar, q qVar, k kVar, TouchEventInfoJobScheduler touchEventInfoJobScheduler, z zVar, byte b8) {
        this(concurrentMap, xVar, c1298a, c1299b, jVar, rVar, a8, userRelatedInfoJobScheduler, nVar, lVar, vVar, qVar, kVar, touchEventInfoJobScheduler, zVar);
    }

    public static final y a(Context context, String str, String str2, long j, String str3, NativeUtils nativeUtils, boolean z4, com.shield.android.h.a aVar, String str4, TouchEventInfoJobScheduler touchEventInfoJobScheduler) {
        kotlin.jvm.internal.j.g(context, d("鸔코\ue7f3\uf3ba禂벋帍"));
        kotlin.jvm.internal.j.g(str, d("鸄콒\ue7e9\uf3ab禮벗"));
        kotlin.jvm.internal.j.g(str2, d("鸄콞\ue7ee\uf3bd禎벜帗꽵ퟺ"));
        kotlin.jvm.internal.j.g(nativeUtils, d("鸙콚\ue7e9\uf3a7禑벖帬꽈ퟷ殣떔"));
        kotlin.jvm.internal.j.g(aVar, d("鸔콉\ue7e4\uf3be禓벜帬꽈ퟷ殣떔"));
        kotlin.jvm.internal.j.g(str4, d("鸂콈\ue7f8\uf3bc禮벗"));
        kotlin.jvm.internal.j.g(touchEventInfoJobScheduler, d("鸃코\ue7e8\uf3ad福벶帏꽙ퟰ殻떮\uda9d洟뛓\udb14淀㚵ᬸ跖욲\ue308燒㢮ᰁ๓ݩ"));
        z zVar = new z();
        com.shield.android.a.c cVar = new com.shield.android.a.c(context);
        r rVar = new r(context, z4, nativeUtils, str);
        com.shield.android.a.b bVar = new com.shield.android.a.b(context);
        return new y(new ConcurrentHashMap(), new x(nativeUtils, str, str2, String.valueOf(j / (f15188d[4] ^ 1062100445)), str4), new C1298a(new com.shield.android.a.a(context), nativeUtils), new C1299b(context, nativeUtils, aVar), new j(context, bVar, cVar, nativeUtils), rVar, new A(context, rVar, str3 == null ? d("") : str3, nativeUtils), new UserRelatedInfoJobScheduler(context, nativeUtils), new n(nativeUtils), new l(context, nativeUtils), new v(context, nativeUtils, new com.shield.android.a.d()), new q(context, nativeUtils, str), new k(context, nativeUtils, str), touchEventInfoJobScheduler, zVar, (((int) f15188d[2]) ^ 326112203) == true ? (byte) 1 : (byte) 0);
    }

    public static String d(String str) {
        int i = ((int) f15188d[5]) ^ 335624872;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15188d[2]) ^ 326112203;
        while (i4 < str.length()) {
            long[] jArr = f15188d;
            int i6 = (((i >> (((int) jArr[2]) ^ 326112203)) ^ (i >> (((int) jArr[6]) ^ 2085329461))) ^ (i >> (((int) jArr[7]) ^ 1655500623))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 1164806546)) | (((char) (i6 & (((int) j) ^ 1164806546))) << (((int) jArr[8]) ^ 1510260012)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15188d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1164806546, i11, i10, (((int) j6) ^ 1164806546) + i10 + i11));
            long j7 = f15188d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1164806546) + (((int) j7) ^ 1164806546) + ((~(((int) j7) ^ 1164806546)) | i12) + (((((int) j7) ^ 1164806546) + i4) - ((((((int) j7) ^ 1164806546) + i4) + (((int) j7) ^ 1164806546)) + ((~(((int) j7) ^ 1164806546)) | i12)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bm() {
        this.fd = ((int) f15188d[1]) ^ 1164806546;
    }

    public final void bn() {
        this.eY.ba();
    }

    public final void c(com.shield.android.d.h hVar) {
        this.eY.b(hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y(ConcurrentMap<String, Object> concurrentMap, x xVar, C1298a c1298a, C1299b c1299b, j jVar, r rVar, A a8, UserRelatedInfoJobScheduler userRelatedInfoJobScheduler, n nVar, l lVar, v vVar, q qVar, k kVar, TouchEventInfoJobScheduler touchEventInfoJobScheduler, z zVar) {
        super(concurrentMap);
        this.eO = xVar;
        this.eP = c1298a;
        this.eQ = c1299b;
        this.eR = jVar;
        this.eS = rVar;
        this.eT = a8;
        this.eU = userRelatedInfoJobScheduler;
        this.eV = nVar;
        this.eW = lVar;
        this.eX = vVar;
        this.eY = qVar;
        this.eZ = kVar;
        this.f15189fa = touchEventInfoJobScheduler;
        this.fb = zVar;
        this.f15190fc = f15188d[0] ^ 400225441;
        this.fd = !zj.z.o(d("鸑콎\ue7f1\uf3a2"), d("鸔콉\ue7f8\uf3aa禎벇帺꽔ퟱ殦떄\uda96"), ((int) f15188d[1]) ^ 1164806546) ? ((int) f15188d[1]) ^ 1164806546 : ((int) f15188d[2]) ^ 326112203;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.shield.android.context.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gj.InterfaceC1526a<? super java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Object>> r10) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.y.c(gj.a):java.lang.Object");
    }
}
