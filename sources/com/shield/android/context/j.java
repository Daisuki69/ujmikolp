package com.shield.android.context;

import Bj.E;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.provider.Settings;
import android.system.Os;
import android.system.OsConstants;
import androidx.camera.video.AudioStats;
import bj.AbstractC1039j;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import cj.M;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.c.a;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15127d = {1044467157, 1039933283, 2133424417, 1186834599, 49914520, 1301708153, 1619080134, 829331991, -1968095213, 422320827, 133468308, 1810647774, 1464756621, 1908743087, 1716864306, 397643361, 1537962332, 934460245, 1045185409, 1641427388, 1263879368, 1698767647, 1908860512, 1478209349, 79445479, 635318624};

    /* JADX INFO: renamed from: dj, reason: collision with root package name */
    private final Context f15128dj;

    /* JADX INFO: renamed from: dk, reason: collision with root package name */
    private final com.shield.android.a.b f15129dk;
    private final com.shield.android.a.c dl;
    private final NativeUtils dm;
    private final String dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final String[] f0do;
    private final String[] dp;
    private final String dq;
    private ArrayList<com.google.gson.q> dr;

    public static final class a extends AbstractC1609c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15130d = {-891232010};
        int bE;
        /* synthetic */ Object bM;

        public a(InterfaceC1526a<? super a> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.bM = obj;
            this.bE |= ((int) f15130d[0]) ^ 1256251638;
            return j.this.d(this);
        }
    }

    public static final class b extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15131d = {730847009, 224675982};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15131d[0]) ^ 730847011, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            try {
                if (Build.VERSION.SDK_INT < (((int) f15131d[1]) ^ 224675998)) {
                    return j.b(j.this);
                }
                JSONObject jSONObject = new JSONObject();
                Object systemService = j.this.f15128dj.getSystemService("activity");
                kotlin.jvm.internal.j.d(systemService);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                long j = memoryInfo.totalMem;
                long j6 = memoryInfo.availMem;
                NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.ENGLISH);
                numberInstance.setMinimumFractionDigits(((int) f15131d[0]) ^ 730847011);
                numberInstance.setMaximumFractionDigits(((int) f15131d[0]) ^ 730847011);
                String str = numberInstance.format(j / 1.0E9f);
                String str2 = numberInstance.format(j6 / 1.0E9f);
                try {
                    jSONObject.put("total", str);
                    jSONObject.put("free", str2);
                    return jSONObject.toString();
                } catch (JSONException e) {
                    com.shield.android.k.a.dL().a(e);
                    return "";
                }
            } catch (Throwable th2) {
                com.shield.android.k.a.dL().a(th2);
                return "";
            }
        }
    }

    public static final class c extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15132d = {922001185};
        private int bE;
        private Object bO;

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(((int) f15132d[0]) ^ 922001184, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new c(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((c) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            ConcurrentHashMap concurrentHashMap;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
                try {
                    com.shield.android.a.b bVar = j.this.f15129dk;
                    this.bO = concurrentHashMapR;
                    this.bE = ((int) f15132d[0]) ^ 922001184;
                    Object objZ = bVar.Z();
                    if (objZ == enumC1578a) {
                        return enumC1578a;
                    }
                    concurrentHashMap = concurrentHashMapR;
                    obj = objZ;
                } catch (Throwable unused) {
                    return concurrentHashMapR;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                concurrentHashMap = (ConcurrentHashMap) this.bO;
                try {
                    AbstractC1039j.b(obj);
                } catch (Throwable unused2) {
                    return concurrentHashMap;
                }
            }
            concurrentHashMap.put(j.this.dm.getKeyValue("au"), (String) obj);
            return concurrentHashMap;
        }
    }

    public static final class d extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15133d = {198925860};

        public d(InterfaceC1526a<? super d> interfaceC1526a) {
            super(((int) f15133d[0]) ^ 198925861, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new d(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((d) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = j.this.dm.getKeyValue("as");
            j jVar = j.this;
            concurrentHashMapR.put(keyValue, j.e(jVar, jVar.f15128dj));
            String keyValue2 = j.this.dm.getKeyValue("ai");
            j jVar2 = j.this;
            concurrentHashMapR.put(keyValue2, jVar2.E(jVar2.f15128dj));
            String keyValue3 = j.this.dm.getKeyValue("aj");
            j jVar3 = j.this;
            concurrentHashMapR.put(keyValue3, jVar3.F(jVar3.f15128dj));
            return concurrentHashMapR;
        }
    }

    public static final class e extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15134d = {486876923};

        public e(InterfaceC1526a<? super e> interfaceC1526a) {
            super(((int) f15134d[0]) ^ 486876922, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new e(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((e) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(j.this.dm.getKeyValue("aq"), j.this.aB());
            j.e(j.this);
            concurrentHashMapR.put(j.this.dm.getKeyValue("ek"), j.this.dr);
            return concurrentHashMapR;
        }
    }

    public static final class f extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15135d = {35688277};

        public f(InterfaceC1526a<? super f> interfaceC1526a) {
            super(((int) f15135d[0]) ^ 35688276, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new f(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((f) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(j.this.dm.getKeyValue("ar"), j.this.aG());
            return concurrentHashMapR;
        }
    }

    public static final class g extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15136d = {1586528420};

        public g(InterfaceC1526a<? super g> interfaceC1526a) {
            super(((int) f15136d[0]) ^ 1586528421, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new g(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((g) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            j jVar = j.this;
            String strB = jVar.B(jVar.f15128dj);
            if (strB != null) {
                concurrentHashMapR.put(j.this.dm.getKeyValue("ea"), strB);
            }
            return concurrentHashMapR;
        }
    }

    public static final class h extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15137d = {924174514, 812788818};

        public h(InterfaceC1526a<? super h> interfaceC1526a) {
            super(((int) f15137d[0]) ^ 924174515, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new h(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((h) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            j jVar = j.this;
            String strA = j.a(jVar, jVar.f15128dj);
            String keyValue = j.this.dm.getKeyValue("Z");
            if (Build.VERSION.SDK_INT >= (((int) f15137d[1]) ^ 812788815)) {
                concurrentHashMapR.put(keyValue, strA);
                return concurrentHashMapR;
            }
            j jVar2 = j.this;
            j.a(jVar2, jVar2.f15128dj, strA);
            j jVar3 = j.this;
            concurrentHashMapR.put(keyValue, jVar3.z(jVar3.f15128dj));
            return concurrentHashMapR;
        }
    }

    public static final class i extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15138d = {481820892};
        private int bE;
        private Object bO;
        private Object bP;
        private Object bQ;

        public i(InterfaceC1526a<? super i> interfaceC1526a) {
            super(((int) f15138d[0]) ^ 481820893, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new i(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((i) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            Map mapR;
            String str;
            Map map;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                mapR = AbstractC1213b.R(obj);
                String keyValue = j.this.dm.getKeyValue("al");
                com.shield.android.a.c cVar = j.this.dl;
                this.bO = mapR;
                this.bP = mapR;
                this.bQ = keyValue;
                this.bE = ((int) f15138d[0]) ^ 481820893;
                Object objB = cVar.b(this);
                if (objB == enumC1578a) {
                    return enumC1578a;
                }
                str = keyValue;
                obj = objB;
                map = mapR;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.bQ;
                mapR = (Map) this.bP;
                map = (ConcurrentHashMap) this.bO;
                AbstractC1039j.b(obj);
            }
            mapR.put(str, obj);
            return map;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.j$j, reason: collision with other inner class name */
    public static final class C0057j extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15139d = {474144380};
        private int bE;
        private Object bO;

        public C0057j(InterfaceC1526a<? super C0057j> interfaceC1526a) {
            super(((int) f15139d[0]) ^ 474144381, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new C0057j(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((C0057j) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            ConcurrentHashMap concurrentHashMap;
            com.google.gson.o oVarM;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
                a.C0050a c0050a = com.shield.android.c.a.fz;
                this.bO = concurrentHashMapR;
                this.bE = ((int) f15139d[0]) ^ 474144381;
                Object objH = a.C0050a.h(this);
                if (objH == enumC1578a) {
                    return enumC1578a;
                }
                concurrentHashMap = concurrentHashMapR;
                obj = objH;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                concurrentHashMap = (ConcurrentHashMap) this.bO;
                AbstractC1039j.b(obj);
            }
            Callable callable = (Callable) obj;
            if (callable != null) {
                ArrayList arrayList = (ArrayList) callable.call();
                concurrentHashMap.put(j.this.dm.getKeyValue("el"), arrayList);
                String keyValue = j.this.dm.getKeyValue("ap");
                com.google.gson.q qVar = (com.google.gson.q) C1110A.B(arrayList);
                String strJ = (qVar == null || (oVarM = qVar.m("value")) == null) ? null : oVarM.j();
                if (strJ == null) {
                    strJ = "";
                }
                concurrentHashMap.put(keyValue, strJ);
            }
            return concurrentHashMap;
        }
    }

    public static final class k extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15140d = {595780215, 1693247945};
        private int bE;
        private Object bO;
        private Object bP;
        private Object bQ;

        public k(InterfaceC1526a<? super k> interfaceC1526a) {
            super(((int) f15140d[0]) ^ 595780214, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new k(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((k) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            ConcurrentHashMap concurrentHashMapR;
            String keyValue;
            Map map;
            String str;
            Map map2;
            Map map3;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                concurrentHashMapR = AbstractC1213b.R(obj);
                concurrentHashMapR.put(j.this.dm.getKeyValue("fl"), j.j(j.this));
                concurrentHashMapR.put(j.this.dm.getKeyValue("em"), j.this.aF());
                keyValue = j.this.dm.getKeyValue("at");
                a.C0050a c0050a = com.shield.android.c.a.fz;
                this.bO = concurrentHashMapR;
                this.bP = concurrentHashMapR;
                this.bQ = keyValue;
                this.bE = ((int) f15140d[0]) ^ 595780214;
                obj = a.C0050a.f(this);
                if (obj != enumC1578a) {
                    map = concurrentHashMapR;
                }
                return enumC1578a;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.bQ;
                map2 = (Map) this.bP;
                map3 = (ConcurrentHashMap) this.bO;
                AbstractC1039j.b(obj);
                map2.put(str, obj);
                return map3;
            }
            keyValue = (String) this.bQ;
            Map map4 = (Map) this.bP;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.bO;
            AbstractC1039j.b(obj);
            map = map4;
            concurrentHashMapR = concurrentHashMap;
            map.put(keyValue, String.valueOf(((Number) obj).longValue()));
            concurrentHashMapR.put(j.this.dm.getKeyValue("ex"), j.this.dm.getHostsModifiedTime());
            String keyValue2 = j.this.dm.getKeyValue("ee");
            a.C0050a c0050a2 = com.shield.android.c.a.fz;
            this.bO = concurrentHashMapR;
            this.bP = concurrentHashMapR;
            this.bQ = keyValue2;
            this.bE = ((int) f15140d[1]) ^ 1693247947;
            Object objG = a.C0050a.g(this);
            if (objG != enumC1578a) {
                str = keyValue2;
                obj = objG;
                map2 = concurrentHashMapR;
                map3 = map2;
                map2.put(str, obj);
                return map3;
            }
            return enumC1578a;
        }
    }

    public static final class l extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15141d = {1066606937};

        public l(InterfaceC1526a<? super l> interfaceC1526a) {
            super(((int) f15141d[0]) ^ 1066606936, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new l(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((l) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            String keyValue = j.this.dm.getKeyValue("ez");
            com.shield.android.internal.g gVar = com.shield.android.internal.g.f15419gd;
            concurrentHashMapR.put(keyValue, new Long(gVar.bL()));
            concurrentHashMapR.put(j.this.dm.getKeyValue("fa"), new Long(gVar.bM()));
            concurrentHashMapR.put(j.this.dm.getKeyValue("fb"), new Long(gVar.bN()));
            concurrentHashMapR.put(j.this.dm.getKeyValue("fc"), new Long(gVar.bO()));
            concurrentHashMapR.put(j.this.dm.getKeyValue("fd"), new Long(gVar.bP()));
            concurrentHashMapR.put(j.this.dm.getKeyValue("fe"), new Long(gVar.bQ()));
            return concurrentHashMapR;
        }
    }

    public static final class m extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15142d = {1190338387};

        public m(InterfaceC1526a<? super m> interfaceC1526a) {
            super(((int) f15142d[0]) ^ 1190338386, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new m(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((m) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(j.this.dm.getKeyValue("ae"), Build.FINGERPRINT);
            String keyValue = j.this.dm.getKeyValue("an");
            j jVar = j.this;
            concurrentHashMapR.put(keyValue, jVar.A(jVar.f15128dj));
            return concurrentHashMapR;
        }
    }

    public static final class n extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15143d = {333245337, 1576852047};

        public n(InterfaceC1526a<? super n> interfaceC1526a) {
            super(((int) f15143d[0]) ^ 333245336, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new n(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((n) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            if (Build.VERSION.SDK_INT >= (((int) f15143d[1]) ^ 1576852058)) {
                concurrentHashMapR.put(j.this.dm.getKeyValue("fh"), new Long(Os.sysconf(OsConstants._SC_PAGE_SIZE)));
            }
            return concurrentHashMapR;
        }
    }

    public static final class o extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15144d = {610842703};
        private int bE;
        private Object bO;
        private Object bP;
        private Object bQ;

        public o(InterfaceC1526a<? super o> interfaceC1526a) {
            super(((int) f15144d[0]) ^ 610842702, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return j.this.new o(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((o) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map mapR;
            String str;
            Map map;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                mapR = AbstractC1213b.R(obj);
                mapR.put(j.this.dm.getKeyValue("ak"), com.shield.android.c.a.fz.J(j.this.f15128dj));
                String keyValue = j.this.dm.getKeyValue("am");
                j jVar = j.this;
                this.bO = mapR;
                this.bP = mapR;
                this.bQ = keyValue;
                this.bE = ((int) f15144d[0]) ^ 610842702;
                Object objD = jVar.d(this);
                if (objD == enumC1578a) {
                    return enumC1578a;
                }
                str = keyValue;
                obj = objD;
                map = mapR;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.bQ;
                mapR = (Map) this.bP;
                map = (ConcurrentHashMap) this.bO;
                AbstractC1039j.b(obj);
            }
            mapR.put(str, obj);
            String keyValue2 = j.this.dm.getKeyValue("af");
            a.C0050a c0050a = com.shield.android.c.a.fz;
            String property = System.getProperty("os.arch");
            if (property == null) {
                property = "";
            }
            map.put(keyValue2, property);
            map.put(j.this.dm.getKeyValue("ac"), Build.BRAND);
            map.put(j.this.dm.getKeyValue("ad"), Build.MODEL);
            map.put(j.this.dm.getKeyValue("ah"), j.this.aD());
            String keyValue3 = j.this.dm.getKeyValue("ag");
            j jVar2 = j.this;
            map.put(keyValue3, j.d(jVar2, jVar2.f15128dj));
            return map;
        }
    }

    public j(Context context, com.shield.android.a.b bVar, com.shield.android.a.c cVar, NativeUtils nativeUtils) {
        kotlin.jvm.internal.j.g(context, g("ꝪꝦꝧꝽꝬꝱꝽ"));
        kotlin.jvm.internal.j.g(bVar, g("ꝨꝹꝹꝚꝬꝽꝀꝍꝊꝦꝥꝥꝬꝪꝽꝦꝻ"));
        kotlin.jvm.internal.j.g(cVar, g("ꝭꝠꝺꝢꝺꝹꝨꝪꝬꝍꝨꝽꝨꝊꝦꝥꝥꝬꝪꝽꝦꝻ"));
        kotlin.jvm.internal.j.g(nativeUtils, g("ꝧꝨꝽꝠꝿꝬꝜꝽꝠꝥꝺ"));
        this.f15128dj = context;
        this.f15129dk = bVar;
        this.dl = cVar;
        this.dm = nativeUtils;
        this.dn = "j";
        long[] jArr = f15127d;
        String[] strArr = new String[((int) jArr[0]) ^ 1044467158];
        strArr[((int) jArr[1]) ^ 1039933283] = g("ꜦꝺꝰꝺꜦꝭꝬꝿꝠꝪꝬꝺꜦꝺꝦꝪꜹꜦꝺꝬꝻꝠꝨꝥꝖꝧꝼꝤꝫꝬꝻ");
        strArr[((int) f15127d[2]) ^ 2133424416] = g("ꜦꝺꝰꝺꜦꝭꝬꝿꝠꝪꝬꝺꜦꝺꝰꝺꝽꝬꝤꜦꝪꝡꝠꝹꜤꝠꝭꜦꝼꝧꝠꝸꝼꝬꝖꝠꝭ");
        strArr[((int) f15127d[3]) ^ 1186834597] = g("ꜦꝹꝻꝦꝪꜦꝺꝬꝻꝠꝨꝥꝖꝧꝼꝤ");
        this.f0do = strArr;
        long[] jArr2 = f15127d;
        String[] strArr2 = new String[((int) jArr2[0]) ^ 1044467158];
        strArr2[((int) jArr2[1]) ^ 1039933283] = g("ꝺꝰꝺꜦꝫꝥꝦꝪꝢꜦꝤꝤꝪꝫꝥꝢꜹꜦꝭꝬꝿꝠꝪꝬꜦꝪꝠꝭ");
        strArr2[((int) f15127d[2]) ^ 2133424416] = g("ꝺꝰꝺꜦꝫꝥꝦꝪꝢꜦꝤꝤꝪꝫꝥꝢꜹꜦꝭꝬꝿꝠꝪꝬꜦꝺꝬꝻꝠꝨꝥ");
        strArr2[((int) f15127d[3]) ^ 1186834597] = g("ꝺꝰꝺꜦꝫꝥꝦꝪꝢꜦꝤꝤꝪꝫꝥꝢꜹꜦꝭꝬꝿꝠꝪꝬꜦꝼꝧꝠꝸꝼꝬꝖꝧꝼꝤꝫꝬꝻ");
        this.dp = strArr2;
        this.dq = g("ꜦꝮꝼꝬꝺꝽꝆꝚꝀꝧꝯꝦ");
        this.dr = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String A(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            String absolutePath2 = context.getCacheDir().getAbsolutePath();
            String absolutePath3 = Build.VERSION.SDK_INT >= (((int) f15127d[6]) ^ 1619080158) ? context.getDataDir().getAbsolutePath() : g("");
            String str = context.getApplicationInfo().publicSourceDir;
            jSONObject.put(this.dm.getKeyValue(g("Ꝩꝱ")), absolutePath);
            jSONObject.put(this.dm.getKeyValue(g("Ꝩꝰ")), absolutePath2);
            jSONObject.put(this.dm.getKeyValue(g("ꝫꝫ")), absolutePath3);
            jSONObject.put(this.dm.getKeyValue(g("Ꝭꝸ")), str);
        } catch (Throwable th2) {
            com.shield.android.k.a.dL().a(th2);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String B(Context context) {
        String strN;
        String string;
        String strG = g("");
        try {
            strN = com.shield.android.internal.i.n(context.getFilesDir().getAbsolutePath());
        } catch (Exception e7) {
            com.shield.android.k.a.dL().a(e7);
        }
        if (strN != null) {
            String str = g("ꜦꝭꝨꝽꝨꜦꝭꝨꝽꝨꜦ") + strN + g("ꜦꝪꝨꝪꝡꝬꜦꝪꝥꝦꝧꝬꝻꝚꝬꝽꝽꝠꝧꝮꝺꝱꝼꝿꜧꝽꝱꝽ");
            strG = this.dm.getClonerFileData(str);
            if (strG == null) {
                try {
                    string = new zj.o(g("ꝒꝗꝨꜤꝳꝈꜤꝓꜹꜤꜰꝔ")).f(g(""), UUID.randomUUID().toString());
                } catch (Exception unused) {
                    string = UUID.randomUUID().toString();
                }
                strG = string;
                this.dm.setClonerFileData(str, strG);
                return strG;
            }
        }
        return strG;
    }

    @SuppressLint({"HardwareIds"})
    private static String C(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), g("ꝨꝧꝭꝻꝦꝠꝭꝖꝠꝭ"));
            return com.shield.android.internal.i.a(string) ? g("") : string;
        } catch (Exception e7) {
            com.shield.android.k.a.dL().a(e7);
            return g("");
        }
    }

    @SuppressLint({"MissingPermission"})
    private static String D(Context context) {
        String strG;
        try {
            if (com.shield.android.internal.i.b(context, g("ꝨꝧꝭꝻꝦꝠꝭꜧꝹꝬꝻꝤꝠꝺꝺꝠꝦꝧꜧꝋꝅꝜꝌꝝꝆꝆꝝꝁ"))) {
                try {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    strG = (defaultAdapter == null || defaultAdapter.getName() == null) ? g("") : defaultAdapter.getName();
                } catch (Throwable unused) {
                    strG = g("ꝬꝻꝻꝦꝻ");
                }
            } else {
                strG = g("ꝭꝠꝺꝨꝫꝥꝬꝭ");
            }
            return strG;
        } catch (Throwable th2) {
            com.shield.android.k.a.dL().a(th2);
            return g("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(Context context) {
        try {
            return g(((SensorManager) com.shield.android.internal.i.c(context, g("ꝺꝬꝧꝺꝦꝻ"))).getDefaultSensor(((int) f15127d[7]) ^ 829331999) == null ? "ꜹ" : "Ꜹ");
        } catch (Throwable th2) {
            com.shield.android.k.a.K(this.dn).a(th2);
            return g("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    @android.annotation.SuppressLint({"HardwareIds", "MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String F(android.content.Context r19) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.j.F(android.content.Context):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String aB() {
        char c10;
        int i4;
        int i6;
        char c11;
        int i10;
        int i11;
        int i12;
        char c12;
        int i13;
        String strG = g("");
        String[] strArr = this.f0do;
        char c13 = 1;
        int i14 = 1039933283;
        int i15 = ((int) f15127d[1]) ^ 1039933283;
        int length = strArr.length;
        while (i15 < length) {
            String str = strArr[i15];
            try {
                long[] jArr = f15127d;
                String[] strArr2 = new String[((int) jArr[3]) ^ 1186834597];
                c10 = c13;
                i4 = i14;
                try {
                    strArr2[((int) jArr[c10]) ^ i4] = g("ꜦꝺꝰꝺꝽꝬꝤꜦꝫꝠꝧꜦꝪꝨꝽ");
                    try {
                        strArr2[((int) f15127d[2]) ^ 2133424416] = str;
                        String strF = new zj.o(g("ꝒꝗꝈꜤꝓꝨꜤꝳꜹꜤꜰꜩꝕꝺꝕꜤꝖꜧꝔꜢ")).f(g(""), com.shield.android.internal.i.a(strArr2));
                        if (strF.length() > 0) {
                            c11 = 2;
                            i11 = length;
                            try {
                                i13 = ((int) f15127d[2]) ^ 2133424416;
                                i12 = 2133424416;
                                c12 = 3;
                            } catch (Throwable unused) {
                                i6 = i11;
                                i10 = 2133424416;
                            }
                        } else {
                            c11 = 2;
                            i11 = length;
                            i12 = 2133424416;
                            c12 = 3;
                            i13 = ((int) f15127d[c10]) ^ i4;
                        }
                        if (i13 != 0) {
                            try {
                                if ((strG.length() == 0 ? ((int) f15127d[c11]) ^ i12 : ((int) f15127d[c10]) ^ i4) != 0) {
                                    strG = strF;
                                }
                                String string = C2576A.b0(strF).toString();
                                com.google.gson.q qVar = new com.google.gson.q();
                                long[] jArr2 = f15127d;
                                i10 = i12;
                                i6 = i11;
                                try {
                                    int i16 = ((int) jArr2[5]) ^ 1301708118;
                                    int i17 = ((int) jArr2[c12]) ^ 1186834597;
                                    qVar.l(g("ꝹꝻꝦꝿꝠꝭꝬꝻ"), C2576A.W(i16 == true ? (char) 1 : (char) 0, str, (2 & 2) != 0 ? str : null));
                                    qVar.l(g("ꝿꝨꝥꝼꝬ"), string);
                                    this.dr.add(qVar);
                                } catch (Throwable unused2) {
                                }
                            } catch (Throwable unused3) {
                                i10 = i12;
                                i6 = i11;
                            }
                        } else {
                            i10 = i12;
                            i6 = i11;
                        }
                    } catch (Throwable unused4) {
                        c11 = 2;
                        i6 = length;
                    }
                } catch (Throwable unused5) {
                    i6 = length;
                    c11 = 2;
                    i10 = 2133424416;
                }
            } catch (Throwable unused6) {
                c10 = c13;
                i4 = i14;
            }
            int i18 = ((int) f15127d[c11]) ^ i10;
            int i19 = i15 + i18;
            int i20 = i19 + i18 + ((~i15) | (~i18));
            i15 = (i19 - i20) + i20;
            c13 = c10;
            i14 = i4;
            length = i6;
        }
        return strG;
    }

    private static String aC() {
        String strG = g("");
        try {
            long[] jArr = f15127d;
            String[] strArr = new String[((int) jArr[3]) ^ 1186834597];
            strArr[((int) jArr[1]) ^ 1039933283] = g("ꜦꝺꝰꝺꝽꝬꝤꜦꝫꝠꝧꜦꝪꝨꝽ");
            strArr[((int) f15127d[2]) ^ 2133424416] = g("ꜦꝹꝻꝦꝪꜦꝺꝰꝺꜦꝢꝬꝻꝧꝬꝥꜦꝻꝨꝧꝭꝦꝤꜦꝫꝦꝦꝽꝖꝠꝭ");
            return new zj.o(g("ꝒꝗꝈꜤꝓꝨꜤꝳꜹꜤꜰꜩꝕꝺꝕꜤꝖꜧꝔꜢ")).f(g(""), com.shield.android.internal.i.a(strArr));
        } catch (Throwable unused) {
            return strG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String aD() {
        try {
            long[] jArr = f15127d;
            String[] strArr = new String[((int) jArr[3]) ^ 1186834597];
            strArr[((int) jArr[1]) ^ 1039933283] = g("ꜦꝺꝰꝺꝽꝬꝤꜦꝫꝠꝧꜦꝪꝨꝽ");
            strArr[((int) f15127d[2]) ^ 2133424416] = g("ꜦꝹꝻꝦꝪꜦꝪꝹꝼꝠꝧꝯꝦ");
            return new zj.o(g("ꝒꝗꝈꜤꝓꝨꜤꝳꜹꜤꜰꜩꝕꝺꝕꜤꝖꜧꝔꜢ")).f(g(""), com.shield.android.internal.i.a(strArr));
        } catch (Throwable th2) {
            com.shield.android.k.a.K(this.dn).a(th2);
            return g("");
        }
    }

    private static String aE() {
        DecimalFormat decimalFormat = new DecimalFormat(g("ꜪꜧꜪꜪ"));
        JSONObject jSONObject = new JSONObject();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(g("ꜦꝹꝻꝦꝪꜦꝤꝬꝤꝠꝧꝯꝦ"), g("Ꝼ"));
            String line = randomAccessFile.readLine();
            Pattern patternCompile = Pattern.compile(g("꜡ꝕꝭꜢ꜠"));
            Matcher matcher = patternCompile.matcher(line);
            String strG = g("");
            String strG2 = g("");
            while (matcher.find()) {
                strG = matcher.group(((int) f15127d[2]) ^ 2133424416);
            }
            Matcher matcher2 = patternCompile.matcher(randomAccessFile.readLine());
            while (matcher2.find()) {
                strG2 = matcher2.group(((int) f15127d[2]) ^ 2133424416);
            }
            randomAccessFile.close();
            double d10 = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d11 = strG != null ? Double.parseDouble(strG) : 0.0d;
            if (strG2 != null) {
                d10 = Double.parseDouble(strG2);
            }
            jSONObject.put(g("ꝽꝦꝽꝨꝥ"), decimalFormat.format(d11 / 1000000.0d));
            jSONObject.put(g("ꝯꝻꝬꝬ"), decimalFormat.format(d10 / 1000000.0d));
        } catch (Throwable th2) {
            com.shield.android.k.a.dL().a(th2);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String aF() {
        try {
            long[] jArr = f15127d;
            String[] strArr = new String[((int) jArr[3]) ^ 1186834597];
            strArr[((int) jArr[1]) ^ 1039933283] = g("ꜦꝺꝰꝺꝽꝬꝤꜦꝫꝠꝧꜦꝪꝨꝽ");
            strArr[((int) f15127d[2]) ^ 2133424416] = this.dq;
            String strF = new zj.o(g("ꝒꝗꝈꜤꝓꝨꜤꝳꜹꜤꜰꜥꜫꝲꜳꝴꝔ")).f(g(""), com.shield.android.internal.i.a(strArr));
            if ((strF.length() > 0 ? ((int) f15127d[2]) ^ 2133424416 : ((int) f15127d[1]) ^ 1039933283) != 0) {
                return strF;
            }
        } catch (Throwable unused) {
        }
        return g("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String aG() {
        try {
            return new JSONObject(M.m(com.shield.android.c.a.fz.a(this.dm))).toString();
        } catch (Exception e7) {
            com.shield.android.k.a.dL().a(e7);
            return new JSONObject().toString();
        }
    }

    public static final /* synthetic */ String b(j jVar) {
        return aE();
    }

    public static final /* synthetic */ String e(j jVar, Context context) {
        return y(context);
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15127d[1]) ^ 1039933283;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            long[] jArr = f15127d;
            long j = jArr[25];
            long j6 = jArr[2];
            int i6 = ~cCharAt;
            int i10 = (((int) j) ^ 635344489) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 635344489) + (((int) j6) ^ 2133424416), i6 | (~(((int) j) ^ 635344489)), i10, (((int) j) ^ 635344489) + cCharAt + (((int) j6) ^ 2133424416) + ((~(((int) j) ^ 635344489)) | i6)));
            long j7 = f15127d[2];
            int i11 = ~i4;
            i4 = i4 + (((int) j7) ^ 2133424416) + (((int) j7) ^ 2133424416) + ((~(((int) j7) ^ 2133424416)) | i11) + (((((int) j7) ^ 2133424416) + i4) - ((((((int) j7) ^ 2133424416) + i4) + (((int) j7) ^ 2133424416)) + ((~(((int) j7) ^ 2133424416)) | i11)));
        }
        return sb2.toString();
    }

    public static final /* synthetic */ String j(j jVar) {
        return aC();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:7:0x0027, B:9:0x0051, B:11:0x006e, B:15:0x007c, B:17:0x0081, B:23:0x00a8, B:25:0x00b0, B:41:0x0139, B:42:0x013c, B:38:0x0125, B:40:0x0135, B:33:0x0112, B:35:0x011e, B:28:0x0105, B:30:0x010b, B:21:0x009a, B:18:0x008c, B:43:0x0164), top: B:52:0x0027, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String y(android.content.Context r20) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.j.y(android.content.Context):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String z(Context context) {
        try {
            File obbDir = context.getObbDir();
            if (obbDir.exists()) {
                File file = new File(obbDir, g("ꝺꝡꝤꝥꝼꝺꝻꜧꝽꝱꝽ"));
                if (file.exists()) {
                    try {
                        try {
                            FileReader fileReader = new FileReader(file);
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    int i4 = fileReader.read();
                                    if (i4 == -1) {
                                        String string = sb2.toString();
                                        fileReader.close();
                                        return string;
                                    }
                                    sb2.append((char) i4);
                                }
                            } finally {
                            }
                        } catch (FileNotFoundException e7) {
                            com.shield.android.k.a.dL().a(e7);
                        }
                    } catch (IOException e10) {
                        com.shield.android.k.a.dL().a(e10);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return C(context);
    }

    public final List<com.shield.android.context.g> aH() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        com.shield.android.context.g gVar = new com.shield.android.context.g(this.dn + ((((int) f15127d[9]) ^ 422320778) == true ? (char) 1 : (char) 0), 0L, null, new h(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar2 = new com.shield.android.context.g(this.dn + ((((int) f15127d[11]) ^ 1810647788) == true ? (char) 1 : (char) 0), 0L, null, new e(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar3 = new com.shield.android.context.g(this.dn + ((((int) f15127d[12]) ^ 1464756670) == true ? (char) 1 : (char) 0), 0L, null, new i(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar4 = new com.shield.android.context.g(this.dn + ((((int) f15127d[13]) ^ 1908743067) == true ? (char) 1 : (char) 0), 0L, null, new m(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar5 = new com.shield.android.context.g(this.dn + ((((int) f15127d[14]) ^ 1716864263) == true ? (char) 1 : (char) 0), 0L, null, new o(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar6 = new com.shield.android.context.g(this.dn + ((((int) f15127d[15]) ^ 397643351) == true ? (char) 1 : (char) 0), 0L, null, new c(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar7 = new com.shield.android.context.g(this.dn + ((((int) f15127d[16]) ^ 1537962347) == true ? (char) 1 : (char) 0), 0L, null, new C0057j(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar8 = new com.shield.android.context.g(this.dn + ((((int) f15127d[17]) ^ 934460269) == true ? (char) 1 : (char) 0), 0L, null, new d(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar9 = new com.shield.android.context.g(this.dn + ((((int) f15127d[18]) ^ 1045185464) == true ? (char) 1 : (char) 0), 0L, null, new k(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar10 = new com.shield.android.context.g(this.dn + g("Ꜹꜹ"), 0L, null, new f(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar11 = new com.shield.android.context.g(this.dn + g("ꜸꜸ"), 0L, null, new g(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar12 = new com.shield.android.context.g(this.dn + g("ꜸꜸ"), 0L, null, new l(null), ((int) f15127d[10]) ^ 133468306);
        com.shield.android.context.g gVar13 = new com.shield.android.context.g(this.dn + g("Ꜹꜻ"), 0L, null, new n(null), ((int) f15127d[10]) ^ 133468306);
        long[] jArr = f15127d;
        com.shield.android.context.g[] gVarArr = new com.shield.android.context.g[((int) jArr[19]) ^ 1641427377];
        gVarArr[((int) jArr[1]) ^ 1039933283] = gVar;
        gVarArr[((int) jArr[2]) ^ 2133424416] = gVar2;
        gVarArr[((int) jArr[3]) ^ 1186834597] = gVar3;
        gVarArr[((int) jArr[0]) ^ 1044467158] = gVar4;
        gVarArr[4] = gVar5;
        gVarArr[5] = gVar8;
        gVarArr[((int) jArr[10]) ^ 133468306] = gVar6;
        gVarArr[((int) jArr[20]) ^ 1263879375] = gVar7;
        gVarArr[((int) jArr[7]) ^ 829331999] = gVar9;
        gVarArr[((int) jArr[21]) ^ 1698767638] = gVar10;
        gVarArr[((int) jArr[22]) ^ 1908860522] = gVar11;
        gVarArr[((int) jArr[23]) ^ 1478209358] = gVar12;
        gVarArr[((int) jArr[24]) ^ 79445483] = gVar13;
        return C1132s.g(gVarArr);
    }

    public static final /* synthetic */ String d(j jVar, Context context) {
        return D(context);
    }

    public static final /* synthetic */ void e(j jVar) {
        String[] strArr = jVar.dp;
        char c10 = 1;
        int i4 = 1039933283;
        int i6 = ((int) f15127d[1]) ^ 1039933283;
        int length = strArr.length;
        while (i6 < length) {
            String str = strArr[i6];
            try {
                long[] jArr = f15127d;
                String[] strArr2 = new String[((int) jArr[3]) ^ 1186834597];
                strArr2[((int) jArr[c10]) ^ i4] = g("ꜦꝺꝰꝺꝽꝬꝤꜦꝫꝠꝧꜦꝪꝨꝽ");
                strArr2[((int) f15127d[2]) ^ 2133424416] = str;
                String strF = new zj.o(g("ꝒꝗꝈꜤꝓꝨꜤꝳꜹꜤꜰꜩꝕꝺꝕꜤꝖꜧꝔꜢ")).f(g(""), com.shield.android.internal.i.a(strArr2));
                if ((strF.length() > 0 ? ((int) f15127d[2]) ^ 2133424416 : ((int) f15127d[c10]) ^ i4) != 0) {
                    String string = C2576A.b0(strF).toString();
                    com.google.gson.q qVar = new com.google.gson.q();
                    long[] jArr2 = f15127d;
                    int i10 = ((int) jArr2[5]) ^ 1301708118;
                    int i11 = ((int) jArr2[3]) ^ 1186834597;
                    qVar.l(g("ꝹꝻꝦꝿꝠꝭꝬꝻ"), C2576A.W(i10 == true ? (char) 1 : (char) 0, str, (2 & 2) != 0 ? str : null));
                    qVar.l(g("ꝿꝨꝥꝼꝬ"), string);
                    jVar.dr.add(qVar);
                }
            } catch (Throwable unused) {
            }
            int i12 = ((int) f15127d[2]) ^ 2133424416;
            int i13 = i6 + i12;
            int i14 = i13 + i12 + ((~i6) | (~i12));
            i6 = (i13 - i14) + i14;
            c10 = 1;
            i4 = 1039933283;
        }
    }

    public static final /* synthetic */ String a(j jVar, Context context) {
        return C(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gj.InterfaceC1526a<? super java.lang.String> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.shield.android.context.j.a
            if (r0 == 0) goto L1c
            r0 = r7
            com.shield.android.context.j$a r0 = (com.shield.android.context.j.a) r0
            int r1 = r0.bE
            long[] r2 = com.shield.android.context.j.f15127d
            r3 = 8
            r3 = r2[r3]
            int r2 = (int) r3
            r3 = 179388435(0xab14013, float:1.7068582E-32)
            r2 = r2 ^ r3
            r3 = r1 & r2
            if (r3 == 0) goto L1c
            int r1 = r1 - r2
            r0.bE = r1
            goto L21
        L1c:
            com.shield.android.context.j$a r0 = new com.shield.android.context.j$a
            r0.<init>(r7)
        L21:
            java.lang.Object r7 = r0.bM
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.bE
            if (r2 == 0) goto L3c
            r0 = 1
            if (r2 != r0) goto L30
            bj.AbstractC1039j.b(r7)
            return r7
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "ꝪꝨꝥꝥꜩꝽꝦꜩꜮꝻꝬꝺꝼꝤꝬꜮꜩꝫꝬꝯꝦꝻꝬꜩꜮꝠꝧꝿꝦꝢꝬꜮꜩꝾꝠꝽꝡꜩꝪꝦꝻꝦꝼꝽꝠꝧꝬ"
            java.lang.String r0 = g(r0)
            r7.<init>(r0)
            throw r7
        L3c:
            bj.AbstractC1039j.b(r7)
            Ij.e r7 = Bj.U.f603a
            com.shield.android.context.j$b r2 = new com.shield.android.context.j$b
            r3 = 0
            r2.<init>(r3)
            long[] r3 = com.shield.android.context.j.f15127d
            r4 = 2
            r4 = r3[r4]
            int r3 = (int) r4
            r4 = 2133424416(0x7f297920, float:2.2526845E38)
            r3 = r3 ^ r4
            r0.bE = r3
            java.lang.Object r7 = Bj.H.C(r2, r7, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.j.d(gj.a):java.lang.Object");
    }

    public static final /* synthetic */ void a(j jVar, Context context, String str) {
        try {
            File obbDir = context.getObbDir();
            if (obbDir.exists()) {
                File file = new File(obbDir, g("ꝺꝡꝤꝥꝼꝺꝻꜧꝽꝱꝽ"));
                if (file.exists() || file.getParentFile() == null) {
                    return;
                }
                File parentFile = file.getParentFile();
                if (kotlin.jvm.internal.j.b(parentFile != null ? Boolean.valueOf(parentFile.mkdirs()) : null, Boolean.TRUE)) {
                    try {
                        FileWriter fileWriter = new FileWriter(file);
                        fileWriter.append((CharSequence) str);
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (IOException e7) {
                        com.shield.android.k.a.dL().a(e7);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
