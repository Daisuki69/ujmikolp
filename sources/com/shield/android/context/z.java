package com.shield.android.context;

import Bj.D0;
import Bj.E;
import Bj.H;
import Bj.I0;
import Bj.InterfaceC0160s;
import bj.AbstractC1039j;
import com.paymaya.common.utility.AbstractC1213b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15193d = {185245566, 533866178, 2117202330, 1978772510};

    /* JADX INFO: renamed from: ff, reason: collision with root package name */
    private final List<g> f15194ff = new ArrayList();

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    private final E f15195fg;

    /* JADX INFO: renamed from: fh, reason: collision with root package name */
    private final InterfaceC0160s f15196fh;

    public static final class a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super ConcurrentHashMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15197d = {660036519, 1465207803};
        private int bE;
        private /* synthetic */ long fj;

        /* JADX INFO: renamed from: com.shield.android.context.z$a$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super ConcurrentHashMap<String, Object>>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15199d = {2010406129};
            private /* synthetic */ Object bO;

            /* JADX INFO: renamed from: fi, reason: collision with root package name */
            private /* synthetic */ z f15200fi;
            private /* synthetic */ long fj;
            private /* synthetic */ ConcurrentHashMap<String, Object> fk;
            private /* synthetic */ Bj.C fl;

            /* JADX INFO: renamed from: com.shield.android.context.z$a$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00611 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15201d = {1540630723, -1952512393, 2116773222, 1193105724};
                private int bE;
                private /* synthetic */ Object bO;
                private /* synthetic */ long fj;
                private /* synthetic */ ConcurrentHashMap<String, Object> fk;
                private /* synthetic */ g fm;

                /* JADX INFO: renamed from: com.shield.android.context.z$a$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00621 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15202d = {1510865725, 1860700741, 879940236};
                    private int bE;
                    private long bT;
                    private /* synthetic */ ConcurrentHashMap<String, Object> fk;
                    private /* synthetic */ g fm;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00621(g gVar, ConcurrentHashMap<String, Object> concurrentHashMap, InterfaceC1526a<? super C00621> interfaceC1526a) {
                        super(((int) f15202d[0]) ^ 1510865727, interfaceC1526a);
                        this.fm = gVar;
                        this.fk = concurrentHashMap;
                    }

                    @Override // ij.AbstractC1607a
                    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                        return new C00621(this.fm, this.fk, interfaceC1526a);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return ((C00621) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                    }

                    @Override // ij.AbstractC1607a
                    public final Object invokeSuspend(Object obj) {
                        long j;
                        EnumC1578a enumC1578a = EnumC1578a.f17050a;
                        int i = this.bE;
                        if (i == 0) {
                            AbstractC1039j.b(obj);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            com.shield.android.k.a.dL().a("SHIELD FP PROCESS: " + this.fm.av() + " time start " + jCurrentTimeMillis + " on " + Thread.currentThread().getName(), new Object[((int) f15202d[1]) ^ 1860700741]);
                            try {
                                Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> function1Ay = this.fm.ay();
                                this.bT = jCurrentTimeMillis;
                                this.bE = ((int) f15202d[2]) ^ 879940237;
                                obj = function1Ay.invoke(this);
                                if (obj == enumC1578a) {
                                    return enumC1578a;
                                }
                                j = jCurrentTimeMillis;
                            } catch (Exception e) {
                                e = e;
                                j = jCurrentTimeMillis;
                                com.shield.android.k.a.dL().a(e);
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = this.bT;
                            try {
                                AbstractC1039j.b(obj);
                            } catch (Exception e7) {
                                e = e7;
                                com.shield.android.k.a.dL().a(e);
                            }
                        }
                        this.fk.putAll((ConcurrentMap) obj);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                        com.shield.android.k.a.dL().a("SHIELD FP PROCESS: " + this.fm.av() + " time take " + jCurrentTimeMillis2 + " on " + Thread.currentThread().getName(), new Object[((int) f15202d[1]) ^ 1860700741]);
                        return Unit.f18162a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00611(long j, g gVar, ConcurrentHashMap<String, Object> concurrentHashMap, InterfaceC1526a<? super C00611> interfaceC1526a) {
                    super(((int) f15201d[0]) ^ 1540630721, interfaceC1526a);
                    this.fj = j;
                    this.fm = gVar;
                    this.fk = concurrentHashMap;
                }

                @Override // ij.AbstractC1607a
                public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                    C00611 c00611 = new C00611(this.fj, this.fm, this.fk, interfaceC1526a);
                    c00611.bO = obj;
                    return c00611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return ((C00611) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                }

                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) {
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    int i = this.bE;
                    try {
                        if (i == 0) {
                            AbstractC1039j.b(obj);
                            if (!H.t((E) this.bO)) {
                                return Unit.f18162a;
                            }
                            long jAw = this.fj;
                            if (jAw == (f15201d[1] ^ 1952512392)) {
                                jAw = this.fm.aw();
                            }
                            C00621 c00621 = new C00621(this.fm, this.fk, null);
                            this.bE = ((int) f15201d[2]) ^ 2116773223;
                            if (I0.b(jAw, c00621, this) == enumC1578a) {
                                return enumC1578a;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1039j.b(obj);
                        }
                    } catch (Exception e) {
                        com.shield.android.k.a.dL().a("Timeout in " + this.fm.av(), new Object[((int) f15201d[3]) ^ 1193105724]);
                        com.shield.android.k.a.dL().a(e);
                    }
                    return Unit.f18162a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(z zVar, ConcurrentHashMap<String, Object> concurrentHashMap, Bj.C c, long j, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
                super(((int) f15199d[0]) ^ 2010406131, interfaceC1526a);
                this.f15200fi = zVar;
                this.fk = concurrentHashMap;
                this.fl = c;
                this.fj = j;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15200fi, this.fk, this.fl, this.fj, interfaceC1526a);
                anonymousClass1.bO = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                E e = (E) this.bO;
                for (g gVar : this.f15200fi.f15194ff) {
                    if (!H.u(this.f15200fi.f15195fg.getCoroutineContext())) {
                        return this.fk;
                    }
                    H.w(e, gVar.ax().plus(this.fl), null, new C00611(this.fj, gVar, this.fk, null), ((int) f15199d[0]) ^ 2010406131);
                }
                this.f15200fi.f15194ff.clear();
                return this.fk;
            }
        }

        /* JADX INFO: renamed from: com.shield.android.context.z$a$a, reason: collision with other inner class name */
        public static final class C0063a extends kotlin.coroutines.a implements Bj.C {
            public C0063a(Bj.B b8) {
                super(b8);
            }

            @Override // Bj.C
            public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, InterfaceC1526a<? super a> interfaceC1526a) {
            super(((int) f15197d[0]) ^ 660036517, interfaceC1526a);
            this.fj = j;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return z.this.new a(this.fj, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            if (!H.u(z.this.f15195fg.getCoroutineContext())) {
                return concurrentHashMapR;
            }
            C0063a c0063a = new C0063a(Bj.B.f582a);
            CoroutineContext coroutineContextPlus = z.this.f15195fg.getCoroutineContext().plus(c0063a);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(z.this, concurrentHashMapR, c0063a, this.fj, null);
            this.bE = ((int) f15197d[1]) ^ 1465207802;
            Object objC = H.C(anonymousClass1, coroutineContextPlus, this);
            return objC == enumC1578a ? enumC1578a : objC;
        }
    }

    public z() {
        D0 d0E = H.e(((int) f15193d[0]) ^ 185245567);
        this.f15196fh = d0E;
        this.f15195fg = H.c(d0E);
        new Object(this) { // from class: com.shield.android.context.z.1
        };
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15193d[1]) ^ 533866178;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15193d;
            long j = jArr[2];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 2117177064) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 2117177064)) + (((int) j6) ^ 185245567), (~(((int) j) ^ 2117177064)) | i4, i6, (((((int) j) ^ 2117177064) + cCharAt) + (((int) j6) ^ 185245567)) + ((~(((int) j) ^ 2117177064)) | i4)) ^ (i % (((int) jArr[3]) ^ 1978749921))));
            long j7 = f15193d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 185245567) + (((int) j7) ^ 185245567) + ((~(((int) j7) ^ 185245567)) | i10) + (((((int) j7) ^ 185245567) + i) - ((((((int) j7) ^ 185245567) + i) + (((int) j7) ^ 185245567)) + ((~(((int) j7) ^ 185245567)) | i10)));
        }
        return sb2.toString();
    }

    public final void a(List<g> list) {
        kotlin.jvm.internal.j.g(list, f("缑缜缞缅缓缏缀缿缕缙缋"));
        this.f15194ff.addAll(list);
    }
}
