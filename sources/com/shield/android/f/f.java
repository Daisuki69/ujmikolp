package com.shield.android.f;

import E8.RunnableC0219b;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.Shield;
import com.shield.android.ShieldCallback;
import com.shield.android.ShieldException;
import com.shield.android.common.ShieldModule;
import com.shield.android.context.TouchEventInfoJobScheduler;
import com.shield.android.context.y;
import com.shield.android.context.z;
import com.shield.android.e.i;
import com.shield.android.e.n;
import com.shield.android.e.o;
import com.shield.android.internal.NativeUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15308d = {453284061, 728059509, 1475965960, 25384295, 249187674, 762735646};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected String f15309L;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected String f15310O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected String f15311S;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private NativeUtils f15312cj;
    private com.shield.android.h.a co;
    private y iA;
    private com.shield.android.context.i iB;
    private ExecutorService iC;
    private ExecutorService iD;
    private ExecutorService iE;
    private o iF;
    private com.shield.android.e.k iG;
    private com.shield.android.e.l iH;
    private com.shield.android.e.d iI;
    private com.shield.android.e.j iJ;
    private g iK;
    private g iL;
    private com.shield.android.e.a iM;
    private final String iN;
    private final Context iO;
    private final long iP;
    private final String iQ;
    private final boolean iR;
    private final String iS;
    private final com.shield.android.d.i iT;
    private n iU;
    private final String iV;
    private final String iW;
    private final TouchEventInfoJobScheduler iX;
    private com.shield.android.e.i iu;

    /* JADX INFO: renamed from: com.shield.android.f.f$13, reason: invalid class name */
    public class AnonymousClass13 extends com.shield.android.internal.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15317d = {1735006025, 1702904381, 1067600984};
        private /* synthetic */ String bw;
        private /* synthetic */ HashMap bx;
        private /* synthetic */ ShieldCallback bz;

        public AnonymousClass13(ShieldCallback shieldCallback, String str, HashMap map) {
            this.bz = shieldCallback;
            this.bw = str;
            this.bx = map;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            String str = this.gm;
            if (str == null || str.length() <= 0) {
                return f.this.a(this.gl, this.f15426bf, this.gn, this.gp, this.bw, (HashMap<String, String>) this.bx, (ShieldCallback<Boolean>) this.bz);
            }
            ShieldCallback shieldCallback = this.bz;
            if (shieldCallback == null) {
                return null;
            }
            shieldCallback.onFailure(ShieldException.unexpectedError(new Throwable(this.gm)));
            return null;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.f.f$14, reason: invalid class name */
    public class AnonymousClass14 extends com.shield.android.internal.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15318d = {424415868, 1105570914, 1257144904};

        /* JADX INFO: renamed from: jc, reason: collision with root package name */
        private /* synthetic */ ShieldModule f15319jc;
        private /* synthetic */ WeakReference jd;

        /* JADX INFO: renamed from: je, reason: collision with root package name */
        private /* synthetic */ String f15320je;

        public AnonymousClass14(ShieldModule shieldModule, WeakReference weakReference, String str) {
            this.f15319jc = shieldModule;
            this.jd = weakReference;
            this.f15320je = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: cs, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                f.a(f.this).C(this.gl);
                f.a(f.this).D(this.f15319jc.getUrl());
                f.a(f.this).E(this.f15426bf);
                HashMap<String, String> map = new HashMap<>();
                map.put(g("錛鍮錅錓鍮錐錦錷錷錪錭錤鍮錕錦錱錰錪錬錭"), this.gp);
                f.a(f.this).d(map);
                if (this.gq.contains(this.f15319jc.getModuleName()) || ((Activity) this.jd.get()) == null) {
                    return null;
                }
                this.f15319jc.getContext(this.jd, new m(0, this, this.f15320je));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(final String str, final HashMap map) {
            try {
                f.b(f.this).submit(new Runnable() { // from class: com.shield.android.f.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15358a.e(str, map);
                    }
                });
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(String str, HashMap map) {
            try {
                HashMap map2 = new HashMap();
                map2.put(g("錆錕錆錍錗錜錍錂錎錆"), str);
                map2.putAll(map);
                f.a(f.this).e(map2);
                f.this.ch().a(f.a(f.this));
            } catch (Exception unused) {
            }
        }

        public static String g(String str) {
            StringBuilder sb2 = new StringBuilder();
            int i = ((int) f15318d[0]) ^ 424415868;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                long[] jArr = f15318d;
                long j = jArr[1];
                long j6 = jArr[2];
                int i4 = ~cCharAt;
                int i6 = (((int) j) ^ 1105542945) + cCharAt;
                sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1105542945) + (((int) j6) ^ 1257144905), i4 | (~(((int) j) ^ 1105542945)), i6, (((int) j) ^ 1105542945) + cCharAt + (((int) j6) ^ 1257144905) + ((~(((int) j) ^ 1105542945)) | i4)));
                long j7 = f15318d[2];
                int i10 = ~i;
                i = i + (((int) j7) ^ 1257144905) + (((int) j7) ^ 1257144905) + ((~(((int) j7) ^ 1257144905)) | i10) + (((((int) j7) ^ 1257144905) + i) - ((((((int) j7) ^ 1257144905) + i) + (((int) j7) ^ 1257144905)) + ((~(((int) j7) ^ 1257144905)) | i10)));
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.shield.android.f.f$6, reason: invalid class name */
    public class AnonymousClass6 implements ShieldCallback<Pair<com.shield.android.internal.d, com.shield.android.internal.c>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15330d = {604896542, 1855385794, 426689593};

        /* JADX INFO: renamed from: jb, reason: collision with root package name */
        private /* synthetic */ com.shield.android.internal.h f15331jb;

        public AnonymousClass6(com.shield.android.internal.h hVar) {
            this.f15331jb = hVar;
        }

        public static String g(String str) {
            StringBuilder sb2 = new StringBuilder();
            int i = ((int) f15330d[0]) ^ 604896542;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                long[] jArr = f15330d;
                long j = jArr[1];
                long j6 = jArr[2];
                int i4 = ~cCharAt;
                int i6 = (((int) j) ^ 1855365180) + cCharAt;
                sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1855365180) + (((int) j6) ^ 426689592), i4 | (~(((int) j) ^ 1855365180)), i6, (((int) j) ^ 1855365180) + cCharAt + (((int) j6) ^ 426689592) + ((~(((int) j) ^ 1855365180)) | i4)));
                long j7 = f15330d[2];
                int i10 = ~i;
                i = i + (((int) j7) ^ 426689592) + (((int) j7) ^ 426689592) + ((~(((int) j7) ^ 426689592)) | i10) + (((((int) j7) ^ 426689592) + i) - ((((((int) j7) ^ 426689592) + i) + (((int) j7) ^ 426689592)) + ((~(((int) j7) ^ 426689592)) | i10)));
            }
            return sb2.toString();
        }

        @Override // com.shield.android.ShieldCallback
        public final void onFailure(@Nullable ShieldException shieldException) {
            try {
                com.shield.android.k.a.dL().a(g("備傛傊傊傗傐備僞傋傌傒僞傎傌傑傈傗傚傛傌僄僞") + shieldException.getLocalizedMessage(), new Object[((int) f15330d[0]) ^ 604896542]);
                g("傫傐傕傑傉傐僞傛傌傌傑傌");
                String str = shieldException.code + g("僄僞") + shieldException.message;
                com.shield.android.internal.h hVar = this.f15331jb;
                hVar.gm = str;
                hVar.call();
            } catch (Exception unused) {
            }
        }

        @Override // com.shield.android.ShieldCallback
        public final /* synthetic */ void onSuccess(@Nullable Pair<com.shield.android.internal.d, com.shield.android.internal.c> pair) {
            Pair<com.shield.android.internal.d, com.shield.android.internal.c> pair2 = pair;
            if (pair2 != null) {
                try {
                    if (pair2.first != null && pair2.second != null) {
                        com.shield.android.k.a.dL().a(g("備傛傊傊傗傐備僞傋傌傒僞傎傌傑傈傗傚傛傌僄僞") + pair2.first, new Object[((int) f15330d[0]) ^ 604896542]);
                        ((com.shield.android.internal.c) pair2.second).bE();
                        this.f15331jb.a((com.shield.android.internal.d) pair2.first, (com.shield.android.internal.c) pair2.second);
                    }
                } catch (Exception e) {
                    com.shield.android.k.a.dL().a(g("備傛傊傊傗傐備僞傋傌傒僞傎傌傑傈傗傚傛傌僄僞") + e.getLocalizedMessage(), new Object[604896542 ^ ((int) f15330d[0])]);
                    this.f15331jb.gm = e.getLocalizedMessage();
                    try {
                        this.f15331jb.call();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            this.f15331jb.call();
        }
    }

    public f(Context context, String str, String str2, String str3, String str4, long j, String str5, String str6, Shield.LogLevel logLevel, com.shield.android.d.i iVar, boolean z4, String str7, String str8, TouchEventInfoJobScheduler touchEventInfoJobScheduler) {
        this.iO = context;
        this.iP = j;
        this.iS = str6;
        this.iR = z4;
        this.iQ = str5;
        this.f15309L = str;
        this.f15310O = str2;
        this.f15311S = str3;
        this.iN = str4;
        this.iT = iVar;
        this.iV = str7;
        this.iW = str8;
        this.iX = touchEventInfoJobScheduler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.shield.android.e.i ch() {
        if (this.iu == null) {
            this.iu = com.shield.android.e.i.a(com.shield.android.internal.i.b(this.f15309L, ((int) f15308d[0]) ^ 453284060, d("롍\udc64\uee74睷㯯ᶲ\u0e8b蜤쏐憮る頖챟")), this.iT);
        }
        return this.iu;
    }

    private com.shield.android.h.a ci() {
        if (this.co == null) {
            if (this.f15312cj == null) {
                this.f15312cj = new NativeUtils();
            }
            this.co = new com.shield.android.h.a(this.f15312cj);
        }
        return this.co;
    }

    private com.shield.android.e.l cj() {
        if (this.iH == null) {
            String str = this.f15309L;
            String str2 = this.f15311S;
            String str3 = this.f15310O;
            com.shield.android.h.a aVarCi = ci();
            if (this.f15312cj == null) {
                this.f15312cj = new NativeUtils();
            }
            this.iH = new com.shield.android.e.l(str, str2, str3, aVarCi, this.f15312cj, this.iS, this.iW, this.iP);
        }
        return this.iH;
    }

    private com.shield.android.e.k ck() {
        if (this.iG == null) {
            this.iG = new com.shield.android.e.k(this.f15309L, this.f15311S, ci(), this.iS, this.f15310O, this.iW);
        }
        return this.iG;
    }

    private com.shield.android.e.d cl() {
        if (this.iI == null) {
            this.iI = new com.shield.android.e.d(this.f15309L, this.f15311S, ci(), this.f15310O, this.iW);
        }
        return this.iI;
    }

    private o cm() {
        if (this.iF == null) {
            this.iF = new o(this.f15309L, this.f15311S, this.f15310O, this.iW);
        }
        return this.iF;
    }

    private com.shield.android.e.a cn() {
        if (this.iM == null) {
            this.iM = new com.shield.android.e.a(this.f15309L, this.f15311S, this.f15310O, this.iW);
        }
        return this.iM;
    }

    private com.shield.android.e.j co() {
        if (this.iJ == null) {
            this.iJ = new com.shield.android.e.j(this.f15309L, this.f15311S, this.f15310O, this.iW);
        }
        return this.iJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g cp() {
        if (this.iK == null) {
            this.iK = new g(this.iO, this.iS, ch(), this.f15309L, this.f15311S, 728059509 ^ ((int) f15308d[1]), this.f15310O, this.iW);
        }
        return this.iK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g cq() {
        if (this.iL == null) {
            this.iL = new g(this.iO, this.iS, ch(), this.f15309L, this.f15311S, 453284060 ^ ((int) f15308d[0]), this.f15310O, this.iW);
        }
        return this.iL;
    }

    private y cr() {
        if (this.iA == null) {
            Context context = this.iO;
            String str = this.f15309L;
            String str2 = this.f15310O;
            long j = this.iP;
            String str3 = this.iQ;
            if (this.f15312cj == null) {
                this.f15312cj = new NativeUtils();
            }
            this.iA = y.a(context, str, str2, j, str3, this.f15312cj, this.iR, ci(), this.iV, this.iX);
        }
        return this.iA;
    }

    @Override // com.shield.android.f.c
    public final void H(final String str) {
        a(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.4

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15326d = {1392231726, 598150789, 395358351};

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                String str2 = this.gm;
                if (str2 == null || str2.length() <= 0) {
                    return f.this.a(this.gl, this.f15426bf, (ShieldCallback<Boolean>) null, str);
                }
                return null;
            }
        });
    }

    @Override // com.shield.android.f.c
    public final void T() {
        cr().bn();
    }

    @Override // com.shield.android.f.c
    public final void cf() {
        a(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15323d = {998570728, 484493470, 1870673518, 1198226424, 37432972, 2082792288};

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                String str;
                if (this.fP || ((str = this.gm) != null && str.length() > 0)) {
                    return null;
                }
                return f.this.a(this.gl, this.f15426bf, (ShieldCallback<Boolean>) null);
            }
        });
    }

    @Override // com.shield.android.f.c
    public final void cg() {
        cp().ct();
        cq().ct();
    }

    @Override // com.shield.android.f.c
    public final void sendAttributes(@NonNull final String str, @Nullable final HashMap<String, String> map, @NonNull final ShieldCallback<Boolean> shieldCallback) {
        try {
            cp().n(new AnonymousClass6(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.12

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15316d = {1826976401, 523919996, 681379205, 1174346506};

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    String str2 = this.gm;
                    if (str2 == null || str2.length() <= 0) {
                        return f.this.a(this.gl, this.f15426bf, this.gn, this.gp, str, (HashMap<String, String>) map, (ShieldCallback<Boolean>) shieldCallback);
                    }
                    ShieldCallback shieldCallback2 = shieldCallback;
                    if (shieldCallback2 == null) {
                        return null;
                    }
                    shieldCallback2.onFailure(ShieldException.unexpectedError(new Throwable(this.gm)));
                    return null;
                }
            }));
        } catch (Exception unused) {
        }
    }

    @Override // com.shield.android.f.c
    public final void t(final boolean z4) {
        try {
            cp().n(new AnonymousClass6(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.15

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15321d = {1638375764, 1722122885, 2006391598};

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    return f.this.a(this.gl, this.f15426bf, z4);
                }
            }));
        } catch (Exception unused) {
        }
    }

    public static String d(String str) {
        int i = ((int) f15308d[2]) ^ 1475937294;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15308d[1]) ^ 728059509;
        while (i4 < str.length()) {
            long[] jArr = f15308d;
            int i6 = (((i >> (((int) jArr[1]) ^ 728059509)) ^ (i >> (((int) jArr[3]) ^ 25384293))) ^ (i >> (((int) jArr[4]) ^ 249187673))) ^ (i >> 5);
            long j = jArr[0];
            i = (char) ((i >> (((int) j) ^ 453284060)) | (((char) (i6 & (((int) j) ^ 453284060))) << (((int) jArr[5]) ^ 762735633)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15308d[0];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 453284060, i11, i10, (((int) j6) ^ 453284060) + i10 + i11));
            long j7 = f15308d[0];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 453284060) + (((int) j7) ^ 453284060) + ((~(((int) j7) ^ 453284060)) | i12) + (((((int) j7) ^ 453284060) + i4) - ((((((int) j7) ^ 453284060) + i4) + (((int) j7) ^ 453284060)) + ((~(((int) j7) ^ 453284060)) | i12)));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Looper looper, ShieldCallback shieldCallback, Thread thread, i.a aVar) {
        if (aVar == i.a.hB) {
            if (looper == null || looper != Looper.getMainLooper()) {
                new Thread(new i(this, shieldCallback, 1), thread.getName()).start();
            } else {
                new Handler(looper).post(new i(this, shieldCallback, 2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ShieldCallback shieldCallback) {
        if (ck().bp != null) {
            shieldCallback.onFailure(ck().bp);
        } else {
            shieldCallback.onSuccess(Boolean.valueOf(ck().gM));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(ShieldCallback shieldCallback) {
        if (ck().bp != null) {
            shieldCallback.onFailure(ck().bp);
        } else {
            shieldCallback.onSuccess(Boolean.valueOf(ck().gM));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(ShieldCallback shieldCallback) {
        if (cn().bp != null) {
            shieldCallback.onFailure(cn().bp);
        } else {
            cn();
            shieldCallback.onSuccess(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ShieldCallback shieldCallback) {
        if (cn().bp != null) {
            shieldCallback.onFailure(cn().bp);
        } else {
            cn();
            shieldCallback.onSuccess(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ShieldCallback shieldCallback) {
        if (cj().bp != null) {
            shieldCallback.onFailure(cj().bp);
        } else {
            shieldCallback.onSuccess(new Pair(cj().hQ, cj().bo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(ShieldCallback shieldCallback) {
        if (cj().bp != null) {
            shieldCallback.onFailure(cj().bp);
        } else {
            shieldCallback.onSuccess(new Pair(cj().hQ, cj().bo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ShieldCallback shieldCallback) {
        if (cl().bp != null) {
            shieldCallback.onFailure(cl().bp);
        } else {
            shieldCallback.onSuccess(Boolean.valueOf(cl().gM));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(ShieldCallback shieldCallback) {
        if (cl().bp != null) {
            shieldCallback.onFailure(cl().bp);
        } else {
            shieldCallback.onSuccess(Boolean.valueOf(cl().gM));
        }
    }

    @Override // com.shield.android.f.c
    public final void b(final ShieldCallback<Boolean> shieldCallback) {
        try {
            cp().n(new AnonymousClass6(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15313d = {86397393, 314545963, 707306754, 1927514026, 1017030799, 1937446112};

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    if (this.fP) {
                        return null;
                    }
                    String str = this.gm;
                    if (str == null || str.length() <= 0) {
                        return f.this.a(this.gl, this.f15426bf, (ShieldCallback<Boolean>) shieldCallback);
                    }
                    return null;
                }
            }));
        } catch (Exception unused) {
        }
    }

    @Override // com.shield.android.f.c
    public final void s(final boolean z4) {
        a(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.9

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15336d = {361863656, 1900455967, 764923572};

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                if (this.go) {
                    return f.a(f.this, this.gl, this.f15426bf, this.gn, this.gp, z4, (ShieldCallback) null);
                }
                return null;
            }
        });
    }

    @Override // com.shield.android.f.c
    public final void c(@NonNull final String str, @Nullable final HashMap<String, String> map, @NonNull final ShieldCallback<Pair<com.shield.android.internal.e, JSONObject>> shieldCallback) {
        try {
            cp().n(new AnonymousClass6(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.10

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15314d = {263828643, 1815075235, 1926212684, 1077294310};

                public static String f(String str2) {
                    StringBuilder sb2 = new StringBuilder();
                    int i = ((int) f15314d[0]) ^ 263828643;
                    while (i < str2.length()) {
                        char cCharAt = str2.charAt(i);
                        long[] jArr = f15314d;
                        long j = jArr[1];
                        long j6 = jArr[2];
                        int i4 = ~cCharAt;
                        int i6 = (((int) j) ^ 1815033993) + cCharAt;
                        sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1815033993)) + (((int) j6) ^ 1926212685), (~(((int) j) ^ 1815033993)) | i4, i6, (((((int) j) ^ 1815033993) + cCharAt) + (((int) j6) ^ 1926212685)) + ((~(((int) j) ^ 1815033993)) | i4)) ^ (i % (((int) jArr[3]) ^ 1077332761))));
                        long j7 = f15314d[2];
                        int i10 = ~i;
                        i = i + (((int) j7) ^ 1926212685) + (((int) j7) ^ 1926212685) + ((~(((int) j7) ^ 1926212685)) | i10) + (((((int) j7) ^ 1926212685) + i) - ((((((int) j7) ^ 1926212685) + i) + (((int) j7) ^ 1926212685)) + ((~(((int) j7) ^ 1926212685)) | i10)));
                    }
                    return sb2.toString();
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    com.shield.android.k.a.dL().a(f("\ue159\ue14e\ue146\ue14d\ue147\ue141\ue14b\ue10d\ue152\ue142\ue159\ue14d\ue149\ue146\ue140\ue105\ue149\ue152\ue15f\ue157\ue15f\ue14b\ue149\ue14f\ue157"), new Object[((int) f15314d[0]) ^ 263828643]);
                    String str2 = this.gm;
                    if (str2 == null || str2.length() <= 0) {
                        return f.a(f.this, this.gt, this.fL, this.go, this.fH, this.gl, this.f15426bf, this.gn, this.gp, str, map, shieldCallback, this.gu);
                    }
                    com.shield.android.k.a.dL().a(f("\ue159\ue14e\ue146\ue14d\ue147\ue141\ue14b\ue10d\ue152\ue142\ue159\ue14d\ue149\ue146\ue140\ue105\ue149\ue152\ue15f\ue157\ue15f\ue14b\ue149\ue14f\ue157\ue113\ue155\ue143\ue144\ue158\ue146\ue10f\ue12a") + this.gm.toString(), new Object[((int) f15314d[0]) ^ 263828643]);
                    shieldCallback.onFailure(ShieldException.unexpectedError(new Throwable(this.gm)));
                    return null;
                }
            }));
        } catch (Exception unused) {
        }
    }

    @Override // com.shield.android.f.c
    public final void d(@NonNull final String str, @Nullable final HashMap<String, String> map, @NonNull final ShieldCallback<Pair<com.shield.android.internal.e, JSONObject>> shieldCallback) {
        a(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.11

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15315d = {1978255166, 1003887192, 942748935, 2038409570};

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Void call() throws Exception {
                String str2 = this.gm;
                if (str2 == null || str2.length() <= 0) {
                    return f.a(f.this, this.gt, this.fL, this.go, this.fH, this.gl, this.f15426bf, this.gn, this.gp, str, map, shieldCallback, this.gu);
                }
                shieldCallback.onFailure(ShieldException.unexpectedError(new Throwable(this.gm)));
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Looper looper, ShieldCallback shieldCallback, Thread thread, i.a aVar) {
        if (aVar == i.a.hB) {
            if (looper != null && looper == Looper.getMainLooper()) {
                new Handler(looper).post(new i(this, shieldCallback, 6));
            } else {
                new Thread(new i(this, shieldCallback, 5), thread.getName()).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Looper looper, ShieldCallback shieldCallback, Thread thread, i.a aVar) {
        if (aVar == i.a.hB) {
            if (looper != null && looper == Looper.getMainLooper()) {
                new Handler(looper).post(new i(this, shieldCallback, 8));
            } else {
                new Thread(new i(this, shieldCallback, 7), thread.getName()).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Looper looper, ShieldCallback shieldCallback, Thread thread, i.a aVar) {
        if (aVar == i.a.hB) {
            if (looper != null && looper == Looper.getMainLooper()) {
                new Handler(looper).post(new i(this, shieldCallback, 4));
            } else {
                new Thread(new i(this, shieldCallback, 3), thread.getName()).start();
            }
        }
    }

    public static /* synthetic */ Void a(f fVar, String str, String str2, boolean z4, String str3, boolean z5, ShieldCallback shieldCallback) {
        return fVar.a(str, str2, z4, str3, (ShieldCallback<Boolean>) shieldCallback);
    }

    private Void a(String str, String str2, boolean z4, String str3, ShieldCallback<Boolean> shieldCallback) {
        cl().gl = str;
        cl().u(str2);
        HashMap<String, String> map = new HashMap<>();
        map.put(d("롻\udc2c\uee65睮㯣"), String.valueOf(z4));
        map.put(d("롛\udc2c\uee46睐㮭ᶓ\u0e85蜄쏌憵む預찖\ue64b\uf36b秵㲰鸈佟ꟶ"), str3);
        cl().a(map);
        cl().o(z4);
        try {
            Looper looperMyLooper = Looper.myLooper();
            Thread threadCurrentThread = Thread.currentThread();
            if (this.iD == null) {
                this.iD = com.shield.android.internal.i.b(this.f15309L, ((int) f15308d[0]) ^ 453284060, d("롇\udc64\uee76睩㯣ᶥມ蜄쏌憮ょ頕챎\ue669\uf36b秴㲗鸉佂ꟽ펭概"));
            }
            this.iD.submit(new RunnableC0219b(this, shieldCallback, looperMyLooper, threadCurrentThread, 8));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ShieldCallback shieldCallback) {
        if (co().cd() != null) {
            shieldCallback.onFailure(co().cd());
        } else {
            shieldCallback.onSuccess(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(ShieldCallback shieldCallback) {
        if (co().cd() != null) {
            shieldCallback.onFailure(co().cd());
        } else {
            shieldCallback.onSuccess(Boolean.TRUE);
        }
    }

    @Override // com.shield.android.f.c
    public final void b(@NonNull String str, @Nullable HashMap<String, String> map) {
        a(new AnonymousClass13(null, str, map));
    }

    @Override // com.shield.android.f.c
    public final void b(@NonNull String str, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<Boolean> shieldCallback) {
        a(new AnonymousClass13(shieldCallback, str, map));
    }

    public static /* synthetic */ ExecutorService b(f fVar) {
        if (fVar.iC == null) {
            fVar.iC = com.shield.android.internal.i.b(fVar.f15309L, ((int) f15308d[0]) ^ 453284060, d("롎\udc60\uee69睮㯓ᶨຉ蜕쏔憸ズ頟챉\ue678\uf36f秣"));
        }
        return fVar.iC;
    }

    @Override // com.shield.android.f.c
    public final void a(final boolean z4, @NonNull final ShieldCallback<Boolean> shieldCallback) {
        try {
            cp().n(new AnonymousClass6(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.8

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15335d = {846304368, 1879999502, 2031391820, 1994951305};

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    if (this.go) {
                        return f.a(f.this, this.gl, this.f15426bf, this.gn, this.gp, z4, shieldCallback);
                    }
                    return null;
                }
            }));
        } catch (Exception unused) {
        }
    }

    @Override // com.shield.android.f.c
    public final void a(@NonNull com.shield.android.d.h hVar) {
        cr().c(hVar);
    }

    @Override // com.shield.android.f.c
    public final void a(final ShieldCallback<Boolean> shieldCallback, final String str) {
        try {
            cp().n(new AnonymousClass6(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.3

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15324d = {421413852, 621930323, 1650286087, 1198291156};

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    String str2 = this.gm;
                    if (str2 == null || str2.length() <= 0) {
                        return f.this.a(this.gl, this.f15426bf, (ShieldCallback<Boolean>) shieldCallback, str);
                    }
                    return null;
                }
            }));
        } catch (Exception unused) {
        }
    }

    private void a(final com.shield.android.internal.h hVar) {
        try {
            cq().n(new ShieldCallback<Pair<com.shield.android.internal.d, com.shield.android.internal.c>>() { // from class: com.shield.android.f.f.5

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15328d = {336000880, 675658580, 378533796, 2093923246};

                public static String f(String str) {
                    StringBuilder sb2 = new StringBuilder();
                    int i = ((int) f15328d[0]) ^ 336000880;
                    while (i < str.length()) {
                        char cCharAt = str.charAt(i);
                        long[] jArr = f15328d;
                        long j = jArr[1];
                        long j6 = jArr[2];
                        int i4 = ~cCharAt;
                        int i6 = (((int) j) ^ 675674552) + cCharAt;
                        sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 675674552)) + (((int) j6) ^ 378533797), (~(((int) j) ^ 675674552)) | i4, i6, (((((int) j) ^ 675674552) + cCharAt) + (((int) j6) ^ 378533797)) + ((~(((int) j) ^ 675674552)) | i4)) ^ (i % (((int) jArr[3]) ^ 2093892689))));
                        long j7 = f15328d[2];
                        int i10 = ~i;
                        i = i + (((int) j7) ^ 378533797) + (((int) j7) ^ 378533797) + ((~(((int) j7) ^ 378533797)) | i10) + (((((int) j7) ^ 378533797) + i) - ((((((int) j7) ^ 378533797) + i) + (((int) j7) ^ 378533797)) + ((~(((int) j7) ^ 378533797)) | i10)));
                    }
                    return sb2.toString();
                }

                @Override // com.shield.android.ShieldCallback
                public final void onFailure(@Nullable ShieldException shieldException) {
                    try {
                        com.shield.android.k.a.dL().a(f("䊋䊈䊚䊛䊁䊇䊍䋋䊑䊗䊊䋇䊐䊓䊍䊕䊕䊙䊛䊍䋘䊜䊈䊉䊛䊇䋌䋗") + shieldException.getLocalizedMessage(), new Object[((int) f15328d[0]) ^ 336000880]);
                        f("䊹䊃䊅䊀䊟䊇䋊䊎䊖䊗䊉䊕");
                        String str = shieldException.code + f("䋖䋍") + shieldException.message;
                        com.shield.android.internal.h hVar2 = hVar;
                        hVar2.gm = str;
                        hVar2.call();
                    } catch (Exception unused) {
                    }
                }

                @Override // com.shield.android.ShieldCallback
                public final /* synthetic */ void onSuccess(@Nullable Pair<com.shield.android.internal.d, com.shield.android.internal.c> pair) {
                    Pair<com.shield.android.internal.d, com.shield.android.internal.c> pair2 = pair;
                    if (pair2 != null) {
                        try {
                            if (pair2.first != null && pair2.second != null) {
                                com.shield.android.k.a.dL().a(f("䊋䊈䊚䊛䊁䊇䊍䋋䊑䊗䊊䋇䊐䊓䊍䊕䊕䊙䊛䊍䋂䋙") + ((com.shield.android.internal.d) pair2.first).bG(), new Object[((int) f15328d[0]) ^ 336000880]);
                                ((com.shield.android.internal.c) pair2.second).bE();
                                hVar.a((com.shield.android.internal.d) pair2.first, (com.shield.android.internal.c) pair2.second);
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    hVar.call();
                }
            });
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(d("롤\udc64\uee74睴㯩ᶮງ蝐쏍憮も顗챋\ue66f\uf361秱㲪鸅何\ua7ea폶槆") + e.getLocalizedMessage(), new Object[((int) f15308d[1]) ^ 728059509]);
        }
    }

    @Override // com.shield.android.f.c
    public final void a(final Application application, final ShieldModule shieldModule) {
        try {
            cp().n(new AnonymousClass6(new com.shield.android.internal.h() { // from class: com.shield.android.f.f.7

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15332d = {383069531, 1034155934, 1260506983, 1225449446, 388993120, 1563785415};

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    if (this.gq.contains(shieldModule.getModuleName())) {
                        return null;
                    }
                    HashMap<String, String> map = new HashMap<>();
                    ShieldModule.ParameterKeys parameterKeys = ShieldModule.ParameterKeys;
                    map.put(parameterKeys.getSiteId(), f.this.f15309L);
                    map.put(parameterKeys.getSecretKey(), f.this.f15311S);
                    map.put(parameterKeys.getSessionId(), f.this.f15310O);
                    map.put(parameterKeys.getLocationTrackingTimeout(), this.gr);
                    map.put(parameterKeys.getLocationCollectionInterval(), this.gs);
                    map.put(parameterKeys.getLocationCollectionURL(), this.fO);
                    shieldModule.setModuleParams(map);
                    shieldModule.startTracking(application);
                    return null;
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Set set, boolean z4, boolean z5, String str, String str2, boolean z8, String str3, String str4, HashMap map, ShieldCallback shieldCallback, Set set2, i.a aVar) {
        if (aVar == i.a.hB) {
            com.shield.android.k.a.dL().a(d("롰\udc64\uee6e睤㯩ᶮງ蝐쏈憽\u3097頛챔\ue67c\uf36a禧㲰鸈佗ꟶ펭榒㒆ᨋ赙욾挼뇒\ud8b0\uec0a\uf651筩뷾\udee6\uef14矘㮬鶄컖朚돍妷ⳏᘔ譓엸\ue2ad焌뢓尪⹙靵쯨斠㊑餂"), new Object[((int) f15308d[1]) ^ 728059509]);
            a(set, z4, z5, str, str2, z8, str3, str4, map, shieldCallback, set2);
        }
        com.shield.android.k.a.dL().a(d("롰\udc64\uee6e睤㯩ᶮງ蝐쏈憽\u3097頛챔\ue67c\uf36a禧㲰鸈佗ꟶ펭榒㒆ᨋ赙욾挼뇒\ud8b0\uec0a\uf651筩뷾\udee6\uef14矘㮬鶄컖朚돍妷ⳏᘔ譓엸\ue2ad焌뢓尫⹙靸쯥斬㊌餖"), new Object[((int) f15308d[1]) ^ 728059509]);
    }

    private Void a(Set<String> set, boolean z4, boolean z5, String str, String str2, boolean z8, String str3, @NonNull String str4, @Nullable HashMap<String, String> map, @NonNull ShieldCallback<Pair<com.shield.android.internal.e, JSONObject>> shieldCallback, Set<String> set2) {
        boolean zEquals = Objects.equals(map != null ? map.get(d("롦\udc77\uee65睮㯴ᶟຎ蜑쏕憹")) : null, d("롮\udc60\uee6e睵㯡ᶬ\u0ebf蜄쏊憵ら預챞\ue66f\uf36b秣"));
        boolean zEquals2 = Objects.equals(map != null ? map.get(d("롦\udc77\uee65睮㯴ᶟຎ蜑쏕憹")) : null, d("론\udc60\uee6c睬㯟ᶳດ蜑쏌憹ケ頔챓\ue67c\uf360秠㲦鸾佔ꟽ편榃㒐ᨍ赙웺"));
        boolean zContains = set.contains(d("례\udc4e\uee4c睌㯅ᶃິ蜯쏻憝ア頻챤\ue64e\uf35a秆㲗鸤佯\ua7de펉榧㒧ᨬ赮웛"));
        if ((!z5 || zEquals) && (zContains || !zEquals2)) {
            com.shield.android.internal.a.a(d("롰\udc64\uee6e睤㯩ᶮງ蝐쏈憽\u3097頛챔\ue67c\uf36a禧㲰鸈佗ꟶ펭榒㒆ᨋ赙욾挼뇂\ud8bd\uec0d\uf65d筴뷪\udee6\uef07矐㮬鶍"), new Object[((int) f15308d[1]) ^ 728059509]);
            cj().A(str);
            cj().B(str2);
            HashMap<String, String> map2 = new HashMap<>();
            map2.put(d("롅\udc71\uee2d睔㯲ᶩງ蜗쏝憮ッ頣챒\ue670\uf36b"), String.valueOf(System.currentTimeMillis()));
            map2.put(d("롻\udc2c\uee65睮㯣"), String.valueOf(z8));
            map2.put(d("롛\udc2c\uee46睐㮭ᶓ\u0e85蜄쏌憵む預찖\ue64b\uf36b秵㲰鸈佟ꟶ"), str3);
            cj().c(map2);
            cj().q(z8);
            cj().a(set2);
            Looper looperMyLooper = Looper.myLooper();
            Thread threadCurrentThread = Thread.currentThread();
            try {
                if (this.iC == null) {
                    this.iC = com.shield.android.internal.i.b(this.f15309L, ((int) f15308d[0]) ^ 453284060, d("롎\udc60\uee69睮㯓ᶨຉ蜕쏔憸ズ頟챉\ue678\uf36f秣"));
                }
                this.iC.submit(new androidx.work.impl.g(this, z4, map, str4, looperMyLooper, shieldCallback, threadCurrentThread));
                return null;
            } catch (Exception e) {
                com.shield.android.internal.a.a(e, d("롰\udc64\uee6e睤㯩ᶮງ蝐쏈憽\u3097頛챔\ue67c\uf36a禧㲰鸈佗ꟶ펭榒㒆ᨋ赙욾挼뇂\ud8bd\uec0d\uf65d筴뷪\udee6\uef07矐㮬鶍컖朞돏妬Ⲁᘅ"), new Object[((int) f15308d[1]) ^ 728059509]);
                shieldCallback.onFailure(ShieldException.unexpectedError(e));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z4, HashMap map, String str, Looper looper, ShieldCallback shieldCallback, Thread thread) {
        com.shield.android.k.a.dL().a(d("롰\udc64\uee6e睤㯩ᶮງ蝐쏈憽\u3097頛챔\ue67c\uf36a禧㲰鸈佗ꟶ펭榒㒆ᨋ赙욾挽뇒\ud8bd\uec07\uf65d筴뷪\udee6\uef00矞㮶鶘캓會돉妻Ⲝ"), new Object[((int) f15308d[1]) ^ 728059509]);
        y yVarCr = cr();
        String strD = map != null ? (String) map.get(d("롦\udc77\uee65睮㯴ᶟຎ蜑쏕憹")) : d("");
        if (d("롥\udc74\uee6c睬").equalsIgnoreCase(d("론\udc73\uee65睤㯩ᶴຣ蜘쏗憵ろ頒")) && strD != null && strD.equalsIgnoreCase(d("롮\udc60\uee6e睵㯡ᶬ\u0ebf蜄쏊憵ら預챞\ue66f\uf36b秣"))) {
            yVarCr.bm();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map2 = new HashMap(yVarCr.az());
        if (com.shield.android.internal.f.bI() && !map2.containsKey(this.f15312cj.getKeyValue(d("론")))) {
            String keyValue = this.f15312cj.getKeyValue(d("론"));
            HashMap map3 = new HashMap();
            map3.put(this.f15312cj.getKeyValue(d("롦\udc73")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롦\udc67")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롧")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롩")), 0L);
            map3.put(this.f15312cj.getKeyValue(d("롫")), d(""));
            String keyValue2 = this.f15312cj.getKeyValue(d("롤"));
            Boolean bool = Boolean.FALSE;
            map3.put(keyValue2, bool);
            map3.put(this.f15312cj.getKeyValue(d("롪")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롦")), bool);
            map3.put(this.f15312cj.getKeyValue(d("롧\udc72")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롥")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롦\udc63")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롧\udc73")), bool);
            map3.put(this.f15312cj.getKeyValue(d("롦\udc62")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롦\udc66")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롦\udc69")), bool);
            map3.put(this.f15312cj.getKeyValue(d("롨")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롥\udc66")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롥\udc68")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롥\udc6b")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롥\udc6a")), d(""));
            map3.put(this.f15312cj.getKeyValue(d("롥\udc70")), UUID.randomUUID().toString());
            map2.put(keyValue, new JSONObject(map3).toString());
        }
        map2.put(d("롐\udc42\uee52睅㯅ᶎ\u0ebf蜾쏹憑カ"), str);
        String str2 = this.iN;
        if (str2 != null && str2.length() > 0) {
            map2.put(d("롳\udc60\uee72睴㯮ᶥຒ蜯쏑憸"), this.iN);
        }
        map2.put(d("론\udc6e\uee6e睴㯥ᶸດ蜯쏛憳も頛챞\ue67e\uf37a秮㲬鸏佯\ua7ec펥榋㒖"), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        if (map != null) {
            map2.putAll(map);
        }
        cj().d(map2);
        ch().a(cj(), new j(this, looper, shieldCallback, thread, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void a(String str, String str2, boolean z4) {
        try {
            cm().F(str);
            cm().G(str2);
            cm().r(z4);
            ch().a(cm());
            return null;
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void a(String str, String str2, ShieldCallback<Boolean> shieldCallback) {
        try {
            cn().p(str);
            cn().q(str2);
            Looper looperMyLooper = Looper.myLooper();
            Thread threadCurrentThread = Thread.currentThread();
            if (shieldCallback != null) {
                ch().a(cn(), new j(this, looperMyLooper, shieldCallback, threadCurrentThread, 0));
            } else {
                ch().a(cn());
            }
            return null;
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void a(java.lang.String r8, java.lang.String r9, boolean r10, java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r13, @androidx.annotation.Nullable com.shield.android.ShieldCallback<java.lang.Boolean> r14) {
        /*
            r7 = this;
            com.shield.android.e.k r0 = r7.ck()
            r0.gl = r8
            com.shield.android.e.k r8 = r7.ck()
            r8.z(r9)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r9 = "롻\udc2c\uee65睮㯣"
            java.lang.String r9 = d(r9)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r8.put(r9, r0)
            java.lang.String r9 = "롛\udc2c\uee46睐㮭ᶓ\u0e85蜄쏌憵む預찖\ue64b\uf36b秵㲰鸈佟ꟶ"
            java.lang.String r9 = d(r9)
            r8.put(r9, r11)
            com.shield.android.e.k r9 = r7.ck()
            r9.b(r8)
            com.shield.android.e.k r8 = r7.ck()
            r8.p(r10)
            android.os.Looper r5 = android.os.Looper.myLooper()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.util.concurrent.ExecutorService r8 = r7.iE     // Catch: java.lang.Exception -> L71
            if (r8 != 0) goto L5f
            java.lang.String r8 = r7.f15309L     // Catch: java.lang.Exception -> L5b
            long[] r9 = com.shield.android.f.f.f15308d     // Catch: java.lang.Exception -> L5b
            r10 = 0
            r10 = r9[r10]     // Catch: java.lang.Exception -> L5b
            int r9 = (int) r10     // Catch: java.lang.Exception -> L5b
            r10 = 453284060(0x1b0490dc, float:1.0965591E-22)
            r9 = r9 ^ r10
            java.lang.String r10 = "례\udc74\uee73睴㯯ᶭມ蜄쏌憮ょ頕챎\ue669\uf36b秴㲗鸉佂ꟽ펭概"
            java.lang.String r10 = d(r10)     // Catch: java.lang.Exception -> L5b
            com.shield.android.internal.i$a r8 = com.shield.android.internal.i.b(r8, r9, r10)     // Catch: java.lang.Exception -> L5b
            r7.iE = r8     // Catch: java.lang.Exception -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            r8 = r0
            r4 = r14
            goto L74
        L5f:
            java.util.concurrent.ExecutorService r8 = r7.iE     // Catch: java.lang.Exception -> L71
            W0.l r0 = new W0.l     // Catch: java.lang.Exception -> L71
            r1 = r7
            r2 = r12
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L6e
            r8.submit(r0)     // Catch: java.lang.Exception -> L6e
            goto L7d
        L6e:
            r0 = move-exception
        L6f:
            r8 = r0
            goto L74
        L71:
            r0 = move-exception
            r4 = r14
            goto L6f
        L74:
            if (r4 == 0) goto L7d
            com.shield.android.ShieldException r8 = com.shield.android.ShieldException.unexpectedError(r8)
            r4.onFailure(r8)
        L7d:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.f.f.a(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.HashMap, com.shield.android.ShieldCallback):java.lang.Void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, HashMap map, ShieldCallback shieldCallback, Looper looper, Thread thread) {
        HashMap map2 = new HashMap();
        map2.put(d("롰\udc62\uee72睥㯥ᶮ\u0ebf蜞쏙憱る"), str);
        map2.put(d("롰\udc68\uee74睥㯟ᶩຄ"), this.f15309L);
        String str2 = this.iN;
        if (str2 != null && str2.length() > 0) {
            map2.put(d("롳\udc60\uee72睴㯮ᶥຒ蜯쏑憸"), this.iN);
        }
        map2.put(d("롰\udc64\uee73睳㯩ᶯຎ蜯쏑憸"), this.f15310O);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3 != null) {
                    map2.put(str3.toLowerCase(), map.get(str3));
                }
            }
        }
        ck().c(map2);
        if (shieldCallback != null) {
            ch().a(ck(), new j(this, looper, shieldCallback, thread, 3));
        } else {
            ch().a(ck());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void a(String str, String str2, ShieldCallback<Boolean> shieldCallback, String str3) {
        try {
            co().x(str);
            co().y(str2);
            HashMap map = new HashMap();
            map.put(d("롰\udc64\uee73睳㯩ᶯຎ蜯쏑憸"), this.f15310O);
            map.put(d("롪\udc75\uee73"), str3);
            co().b(map);
            Looper looperMyLooper = Looper.myLooper();
            Thread threadCurrentThread = Thread.currentThread();
            if (shieldCallback != null) {
                ch().a(co(), new j(this, looperMyLooper, shieldCallback, threadCurrentThread, 4));
            } else {
                ch().a(co());
            }
            return null;
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Looper looper, ShieldCallback shieldCallback, Thread thread, i.a aVar) {
        if (aVar == i.a.hB) {
            if (looper != null && looper == Looper.getMainLooper()) {
                new Handler(looper).post(new i(this, shieldCallback, 9));
            } else {
                new Thread(new i(this, shieldCallback, 0), thread.getName()).start();
            }
        }
    }

    @Override // com.shield.android.f.c
    public final void a(@NonNull WeakReference<Activity> weakReference, @NonNull ShieldModule shieldModule, @NonNull String str) {
        try {
            cp().n(new AnonymousClass6(new AnonymousClass14(shieldModule, weakReference, str)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ShieldCallback shieldCallback, Looper looper, Thread thread) {
        if (this.iB == null) {
            this.iB = com.shield.android.context.i.a(this.iO, this.f15309L, this.f15312cj, new z());
        }
        ConcurrentMap<String, Object> concurrentMapAi = this.iB.ai();
        if (concurrentMapAi == null || concurrentMapAi.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        map.put(d("롰\udc68\uee74睥㯟ᶩຄ"), this.f15309L);
        String str = this.iN;
        if (str != null && str.length() > 0) {
            map.put(d("롳\udc60\uee72睴㯮ᶥຒ蜯쏑憸"), this.iN);
        }
        map.put(d("롰\udc64\uee73睳㯩ᶯຎ蜯쏑憸"), this.f15310O);
        map.putAll(concurrentMapAi);
        cl().a((Map<String, Object>) map);
        if (shieldCallback != null) {
            ch().a(cl(), new j(this, looper, shieldCallback, thread, 2));
        } else {
            ch().a(cl());
        }
    }

    public static /* synthetic */ Void a(final f fVar, final Set set, boolean z4, final boolean z5, final boolean z8, final String str, final String str2, final boolean z9, final String str3, final String str4, final HashMap map, final ShieldCallback shieldCallback, final Set set2) {
        String str5;
        if (z4 && ((str5 = com.shield.android.e.i.hu) == null || str5.length() == 0)) {
            com.shield.android.k.a.dL().a(d("롰\udc64\uee6e睤㯩ᶮງ蝐쏈憽\u3097頛챔\ue67c\uf36a禧㲰鸈佗ꟶ펭榒㒆ᨋ赙욾挼뇒\ud8b0\uec0a\uf651筩뷾\udee6\uef14矘㮬鶄컖朚돍妷ⳏᘔ譓엸\ue2ad焌"), new Object[((int) f15308d[1]) ^ 728059509]);
            com.shield.android.e.b bVar = new com.shield.android.e.b(fVar.f15309L, fVar.f15311S, fVar.f15310O, fVar.iW);
            bVar.s(str);
            bVar.t(str2);
            fVar.ch().a(bVar, new com.shield.android.e.h() { // from class: com.shield.android.f.k
                @Override // com.shield.android.e.h
                public final void notifyState(i.a aVar) {
                    this.f15352a.a(set, z5, z8, str, str2, z9, str3, str4, map, shieldCallback, set2, aVar);
                }
            });
            return null;
        }
        return fVar.a(set, z5, z8, str, str2, z9, str3, str4, map, shieldCallback, set2);
    }

    public static /* synthetic */ n a(f fVar) {
        if (fVar.iU == null) {
            fVar.iU = new n(fVar.f15309L, fVar.f15311S, fVar.f15310O, fVar.iW);
        }
        return fVar.iU;
    }
}
