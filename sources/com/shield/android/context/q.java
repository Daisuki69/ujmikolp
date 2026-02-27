package com.shield.android.context;

import Bj.C0142g0;
import Bj.E;
import Bj.H;
import Bj.InterfaceC0156n0;
import android.content.Context;
import bj.AbstractC1039j;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15172d = {49368698, 2015407957, 1432295270, 140530680, -268051836, 338463618, 610087419, 17459255};
    private static final String em;

    /* JADX INFO: renamed from: eh, reason: collision with root package name */
    private final NativeUtils f15173eh;

    /* JADX INFO: renamed from: ei, reason: collision with root package name */
    private final String f15174ei;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    private final com.shield.android.g.a f15175ej;
    private InterfaceC0156n0 ek;
    private final Bj.C el;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15176d = {1279957328};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15176d[0]) ^ 1279957329, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return q.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            Pair pairC = q.c(q.this);
            concurrentHashMapR.put(q.this.f15173eh.getKeyValue("cs"), pairC.f18160a);
            concurrentHashMapR.put(q.this.f15173eh.getKeyValue("fs"), pairC.f18161b);
            return concurrentHashMapR;
        }
    }

    public static final class c extends AbstractC1609c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15177d = {-979005523};
        int bE;
        /* synthetic */ Object bM;
        Object bO;
        long bT;

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.bM = obj;
            this.bE |= ((int) f15177d[0]) ^ 1168478125;
            return q.a(q.this, 0L, 0L, null, this);
        }
    }

    public static final class d extends kotlin.coroutines.a implements Bj.C {
        public d(Bj.B b8) {
            super(b8);
        }

        @Override // Bj.C
        public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    public static final class e extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15178d = {1400562284, 431080796, 1249400141};
        private int bE;
        private /* synthetic */ com.shield.android.d.h eo;

        /* JADX INFO: renamed from: com.shield.android.context.q$e$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC1616j implements Function1<InterfaceC1526a<? super Unit>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15179d = {505226850, 968953015};
            private /* synthetic */ q en;
            private /* synthetic */ com.shield.android.d.h eo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(q qVar, com.shield.android.d.h hVar, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
                super(((int) f15179d[0]) ^ 505226851, interfaceC1526a);
                this.en = qVar;
                this.eo = hVar;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
                return new AnonymousClass1(this.en, this.eo, interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return ((AnonymousClass1) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v4 */
            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                ?? ListenForFrida = ((int) f15179d[1]) ^ 968953015;
                if (com.shield.android.internal.f.bI()) {
                    ListenForFrida = this.en.f15173eh.listenForFrida();
                }
                if (ListenForFrida != 0) {
                    com.shield.android.d.h hVar = this.eo;
                    if (hVar != null) {
                        hVar.shouldSendSignature();
                    }
                    InterfaceC0156n0 interfaceC0156n0 = this.en.ek;
                    if (interfaceC0156n0 == null) {
                        kotlin.jvm.internal.j.n("");
                        throw null;
                    }
                    long j = f15179d[0];
                    interfaceC0156n0.b(null);
                }
                return Unit.f18162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.shield.android.d.h hVar, InterfaceC1526a<? super e> interfaceC1526a) {
            super(((int) f15178d[0]) ^ 1400562286, interfaceC1526a);
            this.eo = hVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return q.this.new e(this.eo, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((e) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                AbstractC1039j.b(obj);
                q qVar = q.this;
                long j = f15178d[1];
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(qVar, this.eo, null);
                this.bE = ((int) f15178d[2]) ^ 1249400140;
                if (q.a(qVar, j ^ 431087108, 431087108 ^ j, anonymousClass1, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return Unit.f18162a;
        }
    }

    static {
        new a((((int) 610087419) ^ 610087419) == true ? (byte) 1 : (byte) 0);
        em = "q";
    }

    public q(Context context, NativeUtils nativeUtils, String str) {
        kotlin.jvm.internal.j.g(context, g("둉둅둄둞둏둒둞"));
        kotlin.jvm.internal.j.g(nativeUtils, g("둄둋둞둃둜둏둿둞둃둆둙"));
        kotlin.jvm.internal.j.g(str, g("둙둃둞둏둣둎"));
        this.f15173eh = nativeUtils;
        this.f15174ei = str;
        this.f15175ej = new com.shield.android.g.a(nativeUtils, context);
        this.el = new d(Bj.B.f582a);
    }

    public static final /* synthetic */ Pair c(q qVar) {
        return qVar.f15175ej.cv();
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15172d[6]) ^ 610087419;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15172d;
            long j = jArr[7];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 17488925) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 17488925) + (((int) j6) ^ 49368699), i4 | (~(((int) j) ^ 17488925)), i6, (((int) j) ^ 17488925) + cCharAt + (((int) j6) ^ 49368699) + ((~(((int) j) ^ 17488925)) | i4)));
            long j7 = f15172d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 49368699) + (((int) j7) ^ 49368699) + ((~(((int) j7) ^ 49368699)) | i10) + (((((int) j7) ^ 49368699) + i) - ((((((int) j7) ^ 49368699) + i) + (((int) j7) ^ 49368699)) + ((~(((int) j7) ^ 49368699)) | i10)));
        }
        return sb2.toString();
    }

    public final void ba() {
        InterfaceC0156n0 interfaceC0156n0 = this.ek;
        if (interfaceC0156n0 != null) {
            long j = f15172d[0];
            interfaceC0156n0.b(null);
        }
    }

    public final List<g> bb() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        return cj.r.c(new g(em + ((((int) f15172d[2]) ^ 1432295255) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15172d[3]) ^ 140530686));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (Bj.O.b(r6, r0) != r11) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a4 -> B:16:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.shield.android.context.q r5, long r6, long r8, kotlin.jvm.functions.Function1 r10, gj.InterfaceC1526a r11) {
        /*
            boolean r0 = r11 instanceof com.shield.android.context.q.c
            if (r0 == 0) goto L1b
            r0 = r11
            com.shield.android.context.q$c r0 = (com.shield.android.context.q.c) r0
            int r1 = r0.bE
            long[] r2 = com.shield.android.context.q.f15172d
            r3 = 4
            r3 = r2[r3]
            int r2 = (int) r3
            r3 = 1879431812(0x7005da84, float:1.657027E29)
            r2 = r2 ^ r3
            r3 = r1 & r2
            if (r3 == 0) goto L1b
            int r1 = r1 - r2
            r0.bE = r1
            goto L20
        L1b:
            com.shield.android.context.q$c r0 = new com.shield.android.context.q$c
            r0.<init>(r11)
        L20:
            java.lang.Object r5 = r0.bM
            hj.a r11 = hj.EnumC1578a.f17050a
            int r1 = r0.bE
            r2 = 1
            if (r1 == 0) goto L5e
            if (r1 == r2) goto L53
            r6 = 2
            if (r1 == r6) goto L49
            r6 = 3
            if (r1 != r6) goto L3d
            long r6 = r0.bT
            java.lang.Object r8 = r0.bO
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            bj.AbstractC1039j.b(r5)
        L3a:
            r10 = r8
            r8 = r6
            goto L78
        L3d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "둉둋둆둆됊둞둅됊됍둘둏둙둟둇둏됍됊둈둏둌둅둘둏됊됍둃둄둜둅둁둏됍됊둝둃둞둂됊둉둅둘둅둟둞둃둄둏"
            java.lang.String r6 = g(r6)
            r5.<init>(r6)
            throw r5
        L49:
            long r6 = r0.bT
            java.lang.Object r8 = r0.bO
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            bj.AbstractC1039j.b(r5)
            goto L91
        L53:
            long r8 = r0.bT
            java.lang.Object r6 = r0.bO
            r10 = r6
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            bj.AbstractC1039j.b(r5)
            goto L78
        L5e:
            bj.AbstractC1039j.b(r5)
            r0.bO = r10
            r0.bT = r8
            long[] r5 = com.shield.android.context.q.f15172d
            r1 = 0
            r3 = r5[r1]
            int r5 = (int) r3
            r1 = 49368699(0x2f14e7b, float:3.5456813E-37)
            r5 = r5 ^ r1
            r0.bE = r5
            java.lang.Object r5 = Bj.O.b(r6, r0)
            if (r5 != r11) goto L78
            goto La6
        L78:
            r0.bO = r10
            r0.bT = r8
            long[] r5 = com.shield.android.context.q.f15172d
            r6 = 5
            r6 = r5[r6]
            int r5 = (int) r6
            r6 = 338463616(0x142c8b80, float:8.711292E-27)
            r5 = r5 ^ r6
            r0.bE = r5
            java.lang.Object r5 = r10.invoke(r0)
            if (r5 != r11) goto L8f
            goto La6
        L8f:
            r6 = r8
            r8 = r10
        L91:
            r0.bO = r8
            r0.bT = r6
            long[] r5 = com.shield.android.context.q.f15172d
            r9 = r5[r2]
            int r5 = (int) r9
            r9 = 2015407958(0x7820af56, float:1.3036308E34)
            r5 = r5 ^ r9
            r0.bE = r5
            java.lang.Object r5 = Bj.O.b(r6, r0)
            if (r5 != r11) goto L3a
        La6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.q.a(com.shield.android.context.q, long, long, kotlin.jvm.functions.Function1, gj.a):java.lang.Object");
    }

    public final void b(com.shield.android.d.h hVar) {
        if (this.f15175ej.cu()) {
            this.ek = H.w(H.c(new C0142g0(com.shield.android.internal.i.a(this.f15174ei, ((int) f15172d[0]) ^ 49368699, g("둠둋둃둆둈둘둅둁둏둄둩둅둄둞둏둒둞"))).plus(this.el)), null, null, new e(hVar, null), ((int) f15172d[1]) ^ 2015407958);
        }
    }
}
