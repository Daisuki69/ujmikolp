package com.shield.android.context;

import Bj.D0;
import Bj.E;
import Bj.H;
import Bj.I0;
import Bj.InterfaceC0156n0;
import Bj.U;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15156d = {1339934507, 579723941};
    private final InterfaceC0156n0 dT;
    private final E dU;
    private final Kj.a dV;

    public static final class a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Map<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15157d = {2118840252, 161176029};
        private int bE;
        private /* synthetic */ List<p> dW;
        private /* synthetic */ Pair<String, com.shield.android.h.a> dX;
        private /* synthetic */ o dY;

        /* JADX INFO: renamed from: com.shield.android.context.o$a$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Map<String, Object>>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15158d = {1845086718, 75920085, 851086751};
            private int bE;
            private /* synthetic */ Object bO;
            private Object bP;
            private Object bQ;
            private /* synthetic */ List<p> dW;
            private /* synthetic */ Pair<String, com.shield.android.h.a> dX;
            private /* synthetic */ o dY;

            /* JADX INFO: renamed from: com.shield.android.context.o$a$1$a, reason: collision with other inner class name */
            public static final class C0058a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Map<String, Object>>, Object> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15159d = {952763024, 473925209};
                private int bE;
                private Object bO;
                private /* synthetic */ o dY;
                private /* synthetic */ long dZ;

                /* JADX INFO: renamed from: ea, reason: collision with root package name */
                private /* synthetic */ List<String> f15160ea;

                /* JADX INFO: renamed from: eb, reason: collision with root package name */
                private /* synthetic */ Function1<InterfaceC1526a<? super List<? extends Object>>, Object> f15161eb;

                /* JADX INFO: renamed from: com.shield.android.context.o$a$1$a$1, reason: invalid class name and collision with other inner class name */
                public static final class C00591 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Map<String, Object>>, Object> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15162d = {776346920, 1630786249, 2045427046};
                    private int bE;
                    private Object bO;
                    private Object bP;
                    private /* synthetic */ o dY;

                    /* JADX INFO: renamed from: ea, reason: collision with root package name */
                    private /* synthetic */ List<String> f15163ea;

                    /* JADX INFO: renamed from: eb, reason: collision with root package name */
                    private /* synthetic */ Function1<InterfaceC1526a<? super List<? extends Object>>, Object> f15164eb;
                    private /* synthetic */ Map<String, Object> ec;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C00591(o oVar, List<String> list, Map<String, Object> map, Function1<? super InterfaceC1526a<? super List<? extends Object>>, ? extends Object> function1, InterfaceC1526a<? super C00591> interfaceC1526a) {
                        super(((int) f15162d[0]) ^ 776346922, interfaceC1526a);
                        this.dY = oVar;
                        this.f15163ea = list;
                        this.ec = map;
                        this.f15164eb = function1;
                    }

                    @Override // ij.AbstractC1607a
                    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                        return new C00591(this.dY, this.f15163ea, this.ec, this.f15164eb, interfaceC1526a);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return ((C00591) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
                    @Override // ij.AbstractC1607a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
                        /*
                            r12 = this;
                            hj.a r0 = hj.EnumC1578a.f17050a
                            int r1 = r12.bE
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            r5 = 1630786248(0x6133d2c8, float:2.0732222E20)
                            if (r1 == 0) goto L30
                            if (r1 == r4) goto L23
                            if (r1 != r3) goto L1b
                            java.lang.Object r0 = r12.bO
                            Kj.a r0 = (Kj.a) r0
                            bj.AbstractC1039j.b(r13)     // Catch: java.lang.Throwable -> L18
                            goto L69
                        L18:
                            r13 = move-exception
                            goto Lb6
                        L1b:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L23:
                            java.lang.Object r1 = r12.bP
                            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                            java.lang.Object r6 = r12.bO
                            Kj.a r6 = (Kj.a) r6
                            bj.AbstractC1039j.b(r13)
                            r13 = r6
                            goto L50
                        L30:
                            bj.AbstractC1039j.b(r13)
                            com.shield.android.context.o r13 = r12.dY
                            Kj.a r13 = com.shield.android.context.o.a(r13)
                            kotlin.jvm.functions.Function1<gj.a<? super java.util.List<? extends java.lang.Object>>, java.lang.Object> r1 = r12.f15164eb
                            r12.bO = r13
                            r12.bP = r1
                            long[] r6 = com.shield.android.context.o.a.AnonymousClass1.C0058a.C00591.f15162d
                            r7 = r6[r4]
                            int r6 = (int) r7
                            r6 = r6 ^ r5
                            r12.bE = r6
                            Kj.d r13 = (Kj.d) r13
                            java.lang.Object r6 = r13.d(r12)
                            if (r6 != r0) goto L50
                            goto L66
                        L50:
                            r12.bO = r13     // Catch: java.lang.Throwable -> Lb2
                            r12.bP = r2     // Catch: java.lang.Throwable -> Lb2
                            long[] r6 = com.shield.android.context.o.a.AnonymousClass1.C0058a.C00591.f15162d     // Catch: java.lang.Throwable -> Lb2
                            r7 = 0
                            r7 = r6[r7]     // Catch: java.lang.Throwable -> Lb2
                            int r6 = (int) r7     // Catch: java.lang.Throwable -> Lb2
                            r7 = 776346922(0x2e461d2a, float:4.504589E-11)
                            r6 = r6 ^ r7
                            r12.bE = r6     // Catch: java.lang.Throwable -> Lb2
                            java.lang.Object r1 = r1.invoke(r12)     // Catch: java.lang.Throwable -> Lb2
                            if (r1 != r0) goto L67
                        L66:
                            return r0
                        L67:
                            r0 = r13
                            r13 = r1
                        L69:
                            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L18
                            Kj.d r0 = (Kj.d) r0
                            r0.f(r2)
                            java.util.List<java.lang.String> r0 = r12.f15163ea
                            java.lang.Iterable r0 = (java.lang.Iterable) r0
                            java.util.Map<java.lang.String, java.lang.Object> r1 = r12.ec
                            long[] r6 = com.shield.android.context.o.a.AnonymousClass1.C0058a.C00591.f15162d
                            r7 = r6[r3]
                            int r3 = (int) r7
                            r6 = 2045427046(0x79eabd66, float:1.5235487E35)
                            r3 = r3 ^ r6
                            java.util.Iterator r0 = r0.iterator()
                        L83:
                            boolean r6 = r0.hasNext()
                            if (r6 == 0) goto Laf
                            java.lang.Object r6 = r0.next()
                            long[] r7 = com.shield.android.context.o.a.AnonymousClass1.C0058a.C00591.f15162d
                            r8 = r7[r4]
                            int r7 = (int) r8
                            r7 = r7 ^ r5
                            int r8 = r3 + r7
                            int r9 = r8 + r7
                            int r10 = ~r3
                            int r7 = ~r7
                            r7 = r7 | r10
                            int r9 = r9 + r7
                            int r8 = r8 - r9
                            int r7 = r8 + r9
                            if (r3 < 0) goto Lab
                            java.lang.String r6 = (java.lang.String) r6
                            java.lang.Object r3 = r13.get(r3)
                            r1.put(r6, r3)
                            r3 = r7
                            goto L83
                        Lab:
                            cj.C1132s.k()
                            throw r2
                        Laf:
                            java.util.Map<java.lang.String, java.lang.Object> r13 = r12.ec
                            return r13
                        Lb2:
                            r0 = move-exception
                            r11 = r0
                            r0 = r13
                            r13 = r11
                        Lb6:
                            Kj.d r0 = (Kj.d) r0
                            r0.f(r2)
                            throw r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.o.a.AnonymousClass1.C0058a.C00591.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: renamed from: com.shield.android.context.o$a$1$a$a, reason: collision with other inner class name */
                public static final class C0060a extends kotlin.jvm.internal.k implements Function0<Map<String, Object>> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15165d = {1388498752};

                    /* JADX INFO: renamed from: ea, reason: collision with root package name */
                    private /* synthetic */ List<String> f15166ea;
                    private /* synthetic */ Map<String, Object> ec;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0060a(List<String> list, Map<String, Object> map) {
                        super(((int) f15165d[0]) ^ 1388498752);
                        this.f15166ea = list;
                        this.ec = map;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ Object invoke() {
                        List<String> list = this.f15166ea;
                        Map<String, Object> map = this.ec;
                        for (String str : list) {
                            if (!map.containsKey(str)) {
                                map.put(str, "");
                            }
                        }
                        return this.ec;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0058a(long j, List<String> list, o oVar, Function1<? super InterfaceC1526a<? super List<? extends Object>>, ? extends Object> function1, InterfaceC1526a<? super C0058a> interfaceC1526a) {
                    super(((int) f15159d[0]) ^ 952763026, interfaceC1526a);
                    this.dZ = j;
                    this.f15160ea = list;
                    this.dY = oVar;
                    this.f15161eb = function1;
                }

                @Override // ij.AbstractC1607a
                public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                    return new C0058a(this.dZ, this.f15160ea, this.dY, this.f15161eb, interfaceC1526a);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return ((C0058a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                }

                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Function0 function0;
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    int i = this.bE;
                    if (i == 0) {
                        AbstractC1039j.b(obj);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C0060a c0060a = new C0060a(this.f15160ea, linkedHashMap);
                        try {
                            long j = this.dZ;
                            C00591 c00591 = new C00591(this.dY, this.f15160ea, linkedHashMap, this.f15161eb, null);
                            this.bO = c0060a;
                            this.bE = ((int) f15159d[1]) ^ 473925208;
                            Object objB = I0.b(j, c00591, this);
                            if (objB == enumC1578a) {
                                return enumC1578a;
                            }
                            function0 = c0060a;
                            obj = objB;
                        } catch (TimeoutCancellationException unused) {
                            function0 = c0060a;
                            return (Map) function0.invoke();
                        } catch (Exception unused2) {
                            function0 = c0060a;
                            return (Map) function0.invoke();
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (Function0) this.bO;
                        try {
                            AbstractC1039j.b(obj);
                        } catch (TimeoutCancellationException unused3) {
                            return (Map) function0.invoke();
                        } catch (Exception unused4) {
                            return (Map) function0.invoke();
                        }
                    }
                    return (Map) obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(List<p> list, Pair<String, ? extends com.shield.android.h.a> pair, o oVar, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
                super(((int) f15158d[0]) ^ 1845086716, interfaceC1526a);
                this.dW = list;
                this.dX = pair;
                this.dY = oVar;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.dW, this.dX, this.dY, interfaceC1526a);
                anonymousClass1.bO = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[Catch: Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:18:0x0084, B:20:0x008a), top: B:49:0x0084 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a9 -> B:24:0x00aa). Please report as a decompilation issue!!! */
            @Override // ij.AbstractC1607a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 315
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.o.a.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<p> list, Pair<String, ? extends com.shield.android.h.a> pair, o oVar, InterfaceC1526a<? super a> interfaceC1526a) {
            super(((int) f15157d[0]) ^ 2118840254, interfaceC1526a);
            this.dW = list;
            this.dX = pair;
            this.dY = oVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new a(this.dW, this.dX, this.dY, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.dW, this.dX, this.dY, null);
            this.bE = ((int) f15157d[1]) ^ 161176028;
            Object objZ = H.z(anonymousClass1, this);
            return objZ == enumC1578a ? enumC1578a : objZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        D0 d0E = H.e(((int) f15156d[0]) ^ 1339934506);
        this.dT = d0E;
        Ij.e eVar = U.f603a;
        this.dU = H.c(kotlin.coroutines.e.d(d0E, Ij.d.f2362a));
        long[] jArr = f15156d;
        this.dV = Kj.e.a(((int) jArr[0]) ^ 1339934506, ((int) jArr[1]) ^ 579723941);
    }

    public final Object a(List<p> list, Pair<String, ? extends com.shield.android.h.a> pair, InterfaceC1526a<? super Map<String, Object>> interfaceC1526a) {
        return H.C(new a(list, pair, this, null), this.dU.getCoroutineContext(), interfaceC1526a);
    }
}
