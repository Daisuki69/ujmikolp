package com.shield.android.a;

import Bj.E;
import Bj.H;
import Bj.I0;
import Bj.InterfaceC0156n0;
import Bj.U;
import Ij.e;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.StatFs;
import android.os.storage.StorageManager;
import bj.AbstractC1039j;
import com.paymaya.common.utility.AbstractC1213b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import java.io.File;
import java.util.LinkedList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.x;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15023d = {599039143, 1786022408, 2014531284, 1262651759, -340398800, 1962522598, 1419391181};
    private final Context bK;
    private final String[] bL;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1609c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15024d = {-998452983};
        int bE;
        /* synthetic */ Object bM;

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.bM = obj;
            this.bE |= ((int) f15024d[0]) ^ 1149030665;
            return c.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.a.c$c, reason: collision with other inner class name */
    public static final class C0042c extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15025d = {1143870344, 777940359, 795964302, 714653448, 498514309};
        private int bE;
        private /* synthetic */ c bN;
        private Object bO;
        private Object bP;
        private Object bQ;
        private Object bR;
        private Object bS;
        private long bT;
        private long bU;
        private /* synthetic */ Context bV;

        /* JADX INFO: renamed from: com.shield.android.a.c$c$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super InterfaceC0156n0>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15026d = {625474139};
            private /* synthetic */ c bN;
            private /* synthetic */ Object bO;
            private /* synthetic */ x bW;
            private /* synthetic */ StorageStatsManager bX;
            private /* synthetic */ x bY;
            private /* synthetic */ x bZ;

            /* JADX INFO: renamed from: ca, reason: collision with root package name */
            private /* synthetic */ StatFs f15027ca;

            /* JADX INFO: renamed from: cb, reason: collision with root package name */
            private /* synthetic */ x f15028cb;

            /* JADX INFO: renamed from: com.shield.android.a.c$c$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00431 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15029d = {498052997, 683878616, 1678438930, 231102119};
                private int bE;
                private Object bO;
                private Object bP;
                private /* synthetic */ x bW;
                private /* synthetic */ StorageStatsManager bX;

                /* JADX INFO: renamed from: com.shield.android.a.c$c$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00441 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Long>, Object> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15030d = {341240830};
                    private /* synthetic */ StorageStatsManager bX;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00441(StorageStatsManager storageStatsManager, InterfaceC1526a<? super C00441> interfaceC1526a) {
                        super(((int) f15030d[0]) ^ 341240828, interfaceC1526a);
                        this.bX = storageStatsManager;
                    }

                    @Override // ij.AbstractC1607a
                    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                        return new C00441(this.bX, interfaceC1526a);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return ((C00441) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                    }

                    @Override // ij.AbstractC1607a
                    public final Object invokeSuspend(Object obj) {
                        EnumC1578a enumC1578a = EnumC1578a.f17050a;
                        AbstractC1039j.b(obj);
                        StorageStatsManager storageStatsManager = this.bX;
                        UUID unused = StorageManager.UUID_DEFAULT;
                        return new Long(storageStatsManager.getTotalBytes(StorageManager.UUID_DEFAULT));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00431(x xVar, StorageStatsManager storageStatsManager, InterfaceC1526a<? super C00431> interfaceC1526a) {
                    super(((int) f15029d[0]) ^ 498052999, interfaceC1526a);
                    this.bW = xVar;
                    this.bX = storageStatsManager;
                }

                @Override // ij.AbstractC1607a
                public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                    return new C00431(this.bW, this.bX, interfaceC1526a);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return ((C00431) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                }

                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    x xVar;
                    Exception e;
                    x xVar2;
                    long jLongValue;
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    int i = this.bE;
                    if (i == 0) {
                        AbstractC1039j.b(obj);
                        x xVar3 = this.bW;
                        try {
                            long j = f15029d[1] ^ 683883344;
                            C00441 c00441 = new C00441(this.bX, null);
                            this.bO = xVar3;
                            this.bP = xVar3;
                            this.bE = ((int) f15029d[2]) ^ 1678438931;
                            Object objB = I0.b(j, c00441, this);
                            if (objB == enumC1578a) {
                                return enumC1578a;
                            }
                            xVar2 = xVar3;
                            obj = objB;
                        } catch (Exception e7) {
                            xVar = xVar3;
                            e = e7;
                            com.shield.android.k.a.dL().a(e, "DISKSPACE TOTAL", new Object[((int) f15029d[3]) ^ 231102119]);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar2 = (x) this.bP;
                        xVar = (x) this.bO;
                        try {
                            AbstractC1039j.b(obj);
                        } catch (Exception e10) {
                            e = e10;
                            com.shield.android.k.a.dL().a(e, "DISKSPACE TOTAL", new Object[((int) f15029d[3]) ^ 231102119]);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    }
                    jLongValue = ((Number) obj).longValue();
                    xVar2.f18194a = jLongValue;
                    return Unit.f18162a;
                }
            }

            /* JADX INFO: renamed from: com.shield.android.a.c$c$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15031d = {2075558049, 692639308, 1559106564, 729022808};
                private int bE;
                private Object bO;
                private Object bP;
                private /* synthetic */ StorageStatsManager bX;
                private /* synthetic */ x bY;

                /* JADX INFO: renamed from: com.shield.android.a.c$c$1$2$1, reason: invalid class name and collision with other inner class name */
                public static final class C00451 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Long>, Object> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15032d = {1164171154};
                    private /* synthetic */ StorageStatsManager bX;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00451(StorageStatsManager storageStatsManager, InterfaceC1526a<? super C00451> interfaceC1526a) {
                        super(((int) f15032d[0]) ^ 1164171152, interfaceC1526a);
                        this.bX = storageStatsManager;
                    }

                    @Override // ij.AbstractC1607a
                    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                        return new C00451(this.bX, interfaceC1526a);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return ((C00451) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                    }

                    @Override // ij.AbstractC1607a
                    public final Object invokeSuspend(Object obj) {
                        EnumC1578a enumC1578a = EnumC1578a.f17050a;
                        AbstractC1039j.b(obj);
                        StorageStatsManager storageStatsManager = this.bX;
                        UUID unused = StorageManager.UUID_DEFAULT;
                        return new Long(storageStatsManager.getFreeBytes(StorageManager.UUID_DEFAULT));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(x xVar, StorageStatsManager storageStatsManager, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
                    super(((int) f15031d[0]) ^ 2075558051, interfaceC1526a);
                    this.bY = xVar;
                    this.bX = storageStatsManager;
                }

                @Override // ij.AbstractC1607a
                public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                    return new AnonymousClass2(this.bY, this.bX, interfaceC1526a);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                }

                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    x xVar;
                    Exception e;
                    x xVar2;
                    long jLongValue;
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    int i = this.bE;
                    if (i == 0) {
                        AbstractC1039j.b(obj);
                        x xVar3 = this.bY;
                        try {
                            long j = f15031d[1] ^ 692635076;
                            C00451 c00451 = new C00451(this.bX, null);
                            this.bO = xVar3;
                            this.bP = xVar3;
                            this.bE = ((int) f15031d[2]) ^ 1559106565;
                            Object objB = I0.b(j, c00451, this);
                            if (objB == enumC1578a) {
                                return enumC1578a;
                            }
                            xVar2 = xVar3;
                            obj = objB;
                        } catch (Exception e7) {
                            xVar = xVar3;
                            e = e7;
                            com.shield.android.k.a.dL().a(e, "DISKSPACE FREE", new Object[((int) f15031d[3]) ^ 729022808]);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar2 = (x) this.bP;
                        xVar = (x) this.bO;
                        try {
                            AbstractC1039j.b(obj);
                        } catch (Exception e10) {
                            e = e10;
                            com.shield.android.k.a.dL().a(e, "DISKSPACE FREE", new Object[((int) f15031d[3]) ^ 729022808]);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    }
                    jLongValue = ((Number) obj).longValue();
                    xVar2.f18194a = jLongValue;
                    return Unit.f18162a;
                }
            }

            /* JADX INFO: renamed from: com.shield.android.a.c$c$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15033d = {862244063, 2071703947, 944624067};
                private int bE;
                private Object bO;
                private Object bP;
                private /* synthetic */ x bZ;

                /* JADX INFO: renamed from: ca, reason: collision with root package name */
                private /* synthetic */ StatFs f15034ca;

                /* JADX INFO: renamed from: com.shield.android.a.c$c$1$3$1, reason: invalid class name and collision with other inner class name */
                public static final class C00461 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Long>, Object> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15035d = {1219457667};

                    /* JADX INFO: renamed from: ca, reason: collision with root package name */
                    private /* synthetic */ StatFs f15036ca;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00461(StatFs statFs, InterfaceC1526a<? super C00461> interfaceC1526a) {
                        super(((int) f15035d[0]) ^ 1219457665, interfaceC1526a);
                        this.f15036ca = statFs;
                    }

                    @Override // ij.AbstractC1607a
                    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                        return new C00461(this.f15036ca, interfaceC1526a);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return ((C00461) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                    }

                    @Override // ij.AbstractC1607a
                    public final Object invokeSuspend(Object obj) {
                        EnumC1578a enumC1578a = EnumC1578a.f17050a;
                        AbstractC1039j.b(obj);
                        return new Long(((long) this.f15036ca.getBlockCount()) * ((long) this.f15036ca.getBlockSize()));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(x xVar, StatFs statFs, InterfaceC1526a<? super AnonymousClass3> interfaceC1526a) {
                    super(((int) f15033d[0]) ^ 862244061, interfaceC1526a);
                    this.bZ = xVar;
                    this.f15034ca = statFs;
                }

                @Override // ij.AbstractC1607a
                public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                    return new AnonymousClass3(this.bZ, this.f15034ca, interfaceC1526a);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass3) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                }

                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    x xVar;
                    Exception e;
                    x xVar2;
                    long jLongValue;
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    int i = this.bE;
                    if (i == 0) {
                        AbstractC1039j.b(obj);
                        x xVar3 = this.bZ;
                        try {
                            long j = f15033d[1] ^ 2071699971;
                            C00461 c00461 = new C00461(this.f15034ca, null);
                            this.bO = xVar3;
                            this.bP = xVar3;
                            this.bE = ((int) f15033d[2]) ^ 944624066;
                            Object objB = I0.b(j, c00461, this);
                            if (objB == enumC1578a) {
                                return enumC1578a;
                            }
                            xVar2 = xVar3;
                            obj = objB;
                        } catch (Exception e7) {
                            xVar = xVar3;
                            e = e7;
                            com.shield.android.k.a.dL().a(e);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar2 = (x) this.bP;
                        xVar = (x) this.bO;
                        try {
                            AbstractC1039j.b(obj);
                        } catch (Exception e10) {
                            e = e10;
                            com.shield.android.k.a.dL().a(e);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    }
                    jLongValue = ((Number) obj).longValue();
                    xVar2.f18194a = jLongValue;
                    return Unit.f18162a;
                }
            }

            /* JADX INFO: renamed from: com.shield.android.a.c$c$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static long[] f15037d = {1501499667, 691836403, 1405559400};
                private int bE;
                private /* synthetic */ c bN;
                private Object bO;
                private Object bP;

                /* JADX INFO: renamed from: cb, reason: collision with root package name */
                private /* synthetic */ x f15038cb;

                /* JADX INFO: renamed from: com.shield.android.a.c$c$1$4$1, reason: invalid class name and collision with other inner class name */
                public static final class C00471 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Long>, Object> {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static long[] f15039d = {109735497};
                    private /* synthetic */ c bN;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00471(c cVar, InterfaceC1526a<? super C00471> interfaceC1526a) {
                        super(((int) f15039d[0]) ^ 109735499, interfaceC1526a);
                        this.bN = cVar;
                    }

                    @Override // ij.AbstractC1607a
                    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                        return new C00471(this.bN, interfaceC1526a);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return ((C00471) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                    }

                    @Override // ij.AbstractC1607a
                    public final Object invokeSuspend(Object obj) {
                        EnumC1578a enumC1578a = EnumC1578a.f17050a;
                        AbstractC1039j.b(obj);
                        return new Long(this.bN.aa());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(x xVar, c cVar, InterfaceC1526a<? super AnonymousClass4> interfaceC1526a) {
                    super(((int) f15037d[0]) ^ 1501499665, interfaceC1526a);
                    this.f15038cb = xVar;
                    this.bN = cVar;
                }

                @Override // ij.AbstractC1607a
                public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                    return new AnonymousClass4(this.f15038cb, this.bN, interfaceC1526a);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass4) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
                }

                @Override // ij.AbstractC1607a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    x xVar;
                    Exception e;
                    x xVar2;
                    long jLongValue;
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    int i = this.bE;
                    if (i == 0) {
                        AbstractC1039j.b(obj);
                        x xVar3 = this.f15038cb;
                        try {
                            long j = f15037d[1] ^ 691832443;
                            C00471 c00471 = new C00471(this.bN, null);
                            this.bO = xVar3;
                            this.bP = xVar3;
                            this.bE = ((int) f15037d[2]) ^ 1405559401;
                            Object objB = I0.b(j, c00471, this);
                            if (objB == enumC1578a) {
                                return enumC1578a;
                            }
                            xVar2 = xVar3;
                            obj = objB;
                        } catch (Exception e7) {
                            xVar = xVar3;
                            e = e7;
                            com.shield.android.k.a.dL().a(e);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar2 = (x) this.bP;
                        xVar = (x) this.bO;
                        try {
                            AbstractC1039j.b(obj);
                        } catch (Exception e10) {
                            e = e10;
                            com.shield.android.k.a.dL().a(e);
                            xVar2 = xVar;
                            jLongValue = 0;
                        }
                    }
                    jLongValue = ((Number) obj).longValue();
                    xVar2.f18194a = jLongValue;
                    return Unit.f18162a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(x xVar, StorageStatsManager storageStatsManager, x xVar2, x xVar3, StatFs statFs, x xVar4, c cVar, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
                super(((int) f15026d[0]) ^ 625474137, interfaceC1526a);
                this.bW = xVar;
                this.bX = storageStatsManager;
                this.bY = xVar2;
                this.bZ = xVar3;
                this.f15027ca = statFs;
                this.f15028cb = xVar4;
                this.bN = cVar;
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.bW, this.bX, this.bY, this.bZ, this.f15027ca, this.f15028cb, this.bN, interfaceC1526a);
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
                e eVar = U.f603a;
                Ij.d dVar = Ij.d.f2362a;
                H.w(e, dVar, null, new C00431(this.bW, this.bX, null), ((int) f15026d[0]) ^ 625474137);
                H.w(e, dVar, null, new AnonymousClass2(this.bY, this.bX, null), ((int) f15026d[0]) ^ 625474137);
                H.w(e, dVar, null, new AnonymousClass3(this.bZ, this.f15027ca, null), ((int) f15026d[0]) ^ 625474137);
                return H.w(e, dVar, null, new AnonymousClass4(this.f15028cb, this.bN, null), ((int) f15026d[0]) ^ 625474137);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0042c(Context context, c cVar, InterfaceC1526a<? super C0042c> interfaceC1526a) {
            super(((int) f15025d[0]) ^ 1143870346, interfaceC1526a);
            this.bV = context;
            this.bN = cVar;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C0042c(this.bV, this.bN, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((C0042c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:58|(1:(3:5|6|7)(2:10|11))(15:12|13|14|56|15|(3:17|(2:18|(1:60)(2:20|(3:61|22|(2:24|(1:26)(1:27))(0))(1:62)))|31)(2:32|(1:34)(1:35))|36|54|37|50|40|52|41|45|63)|28|36|54|37|50|40|52|41|45|63) */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x01db, code lost:
        
            r7 = mx_android.support.v7.media.MediaRouteProviderProtocol.SERVICE_DATA_ERROR;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01fa, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01fb, code lost:
        
            com.shield.android.k.a.dL().a(r0, "DISKSPACE JSON ERROR", new java.lang.Object[((int) com.shield.android.a.c.C0042c.f15025d[r21]) ^ r20]);
         */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 551
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.shield.android.a.c.C0042c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a((((int) 1786022408) ^ 1786022408) == true ? (byte) 1 : (byte) 0);
    }

    public c(Context context) {
        j.g(context, d("婭\u2d68᛭謵업\ue2a8焜"));
        this.bK = context;
        long[] jArr = f15023d;
        String[] strArr = new String[((int) jArr[0]) ^ 599039140];
        strArr[((int) jArr[1]) ^ 1786022408] = d("娡\u2d77ᛱ謮엄\ue2a5焋㣀ᱵ蹂䝦ꏮ冷⢃鐅䩗╮ኡदӓȡ");
        strArr[((int) f15023d[2]) ^ 2014531285] = d("娡\u2d77ᛱ謮엄\ue2a5焋㣀ᱵ蹌䝦ꏻ");
        strArr[((int) f15023d[3]) ^ 1262651757] = d("娡\u2d77ᛱ謮엄\ue2a5焋㣀ᱵ蹝䝤ꏢ决⣏鐐䩈╬");
        this.bL = strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long aa() {
        try {
            String[] strArr = this.bL;
            int i = ((int) f15023d[1]) ^ 1786022408;
            int length = strArr.length;
            long jA = 0;
            while (i < length) {
                File file = new File(strArr[i]);
                if (file.exists()) {
                    jA += a(file);
                }
                long j = f15023d[2];
                int i4 = ~i;
                i = i + (((int) j) ^ 2014531285) + (((int) j) ^ 2014531285) + ((~(((int) j) ^ 2014531285)) | i4) + (((((int) j) ^ 2014531285) + i) - ((((((int) j) ^ 2014531285) + i) + (((int) j) ^ 2014531285)) + ((~(((int) j) ^ 2014531285)) | i4)));
            }
            return jA;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String d(String str) {
        int i = ((int) f15023d[5]) ^ 1962476538;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15023d[1]) ^ 1786022408;
        while (i4 < str.length()) {
            long[] jArr = f15023d;
            int i6 = (((i >> (((int) jArr[1]) ^ 1786022408)) ^ (i >> (((int) jArr[3]) ^ 1262651757))) ^ (i >> (((int) jArr[0]) ^ 599039140))) ^ (i >> 5);
            long j = jArr[2];
            i = (char) ((i >> (((int) j) ^ 2014531285)) | (((char) (i6 & (((int) j) ^ 2014531285))) << (((int) jArr[6]) ^ 1419391170)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15023d[2];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 2014531285, i11, i10, (((int) j6) ^ 2014531285) + i10 + i11));
            long j7 = f15023d[2];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 2014531285) + (((int) j7) ^ 2014531285) + ((~(((int) j7) ^ 2014531285)) | i12) + (((((int) j7) ^ 2014531285) + i4) - ((((((int) j7) ^ 2014531285) + i4) + (((int) j7) ^ 2014531285)) + ((~(((int) j7) ^ 2014531285)) | i12)));
        }
        return sb2.toString();
    }

    public final Object b(InterfaceC1526a<? super String> interfaceC1526a) {
        return a(this.bK, interfaceC1526a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r6, gj.InterfaceC1526a<? super java.lang.String> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.shield.android.a.c.b
            if (r0 == 0) goto L1b
            r0 = r7
            com.shield.android.a.c$b r0 = (com.shield.android.a.c.b) r0
            int r1 = r0.bE
            long[] r2 = com.shield.android.a.c.f15023d
            r3 = 4
            r3 = r2[r3]
            int r2 = (int) r3
            r3 = 1807084848(0x6bb5ed30, float:4.3987132E26)
            r2 = r2 ^ r3
            r3 = r1 & r2
            if (r3 == 0) goto L1b
            int r1 = r1 - r2
            r0.bE = r1
            goto L20
        L1b:
            com.shield.android.a.c$b r0 = new com.shield.android.a.c$b
            r0.<init>(r7)
        L20:
            java.lang.Object r7 = r0.bM
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.bE
            if (r2 == 0) goto L3b
            r6 = 1
            if (r2 != r6) goto L2f
            bj.AbstractC1039j.b(r7)
            return r7
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "婭ⵦᛯ謭얀\ue2a4焇㢔ᱽ蹟䝳ꏸ冰⢏鐔䨟┼ዬढӅȾ腚䃱ꁪ퀂\ue87b瑧㩲鵭仪ꜥ厇꧰咟⨝ᕎ\u0af5蕮䋄ꄼ탛\ue83b\uf45f穡㵣黫伧"
            java.lang.String r7 = d(r7)
            r6.<init>(r7)
            throw r6
        L3b:
            bj.AbstractC1039j.b(r7)
            Ij.e r7 = Bj.U.f603a
            Ij.d r7 = Ij.d.f2362a
            com.shield.android.a.c$c r2 = new com.shield.android.a.c$c
            r3 = 0
            r2.<init>(r6, r5, r3)
            long[] r6 = com.shield.android.a.c.f15023d
            r3 = 2
            r3 = r6[r3]
            int r6 = (int) r3
            r3 = 2014531285(0x78134ed5, float:1.195104E34)
            r6 = r6 ^ r3
            r0.bE = r6
            java.lang.Object r6 = Bj.H.C(r2, r7, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.a.c.a(android.content.Context, gj.a):java.lang.Object");
    }

    private static long a(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.exists()) {
                return 0L;
            }
            if (!file.isDirectory()) {
                return file.length();
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            long length = 0;
            while (true) {
                if ((!linkedList.isEmpty() ? ((int) f15023d[2]) ^ 2014531285 : ((int) f15023d[1]) ^ 1786022408) == 0) {
                    return length;
                }
                File file2 = (File) linkedList.remove(((int) f15023d[1]) ^ 1786022408);
                if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                    int i = 1786022408 ^ ((int) f15023d[1]);
                    int length2 = fileArrListFiles.length;
                    while (i < length2) {
                        File file3 = fileArrListFiles[i];
                        length += file3.length();
                        if (file3.isDirectory()) {
                            linkedList.add(file3);
                        }
                        long j = f15023d[2];
                        int i4 = ~i;
                        i = i + (((int) j) ^ 2014531285) + (((int) j) ^ 2014531285) + ((~(((int) j) ^ 2014531285)) | i4) + (((((int) j) ^ 2014531285) + i) - ((((((int) j) ^ 2014531285) + i) + (((int) j) ^ 2014531285)) + ((~(((int) j) ^ 2014531285)) | i4)));
                    }
                }
            }
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
