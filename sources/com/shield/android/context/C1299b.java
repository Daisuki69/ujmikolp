package com.shield.android.context;

import Bj.E;
import Bj.H;
import Bj.U;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.exoplayer.upstream.CmcdData;
import bj.AbstractC1039j;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.b.a;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import zj.C2576A;

/* JADX INFO: renamed from: com.shield.android.context.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1299b {
    private static final String cq;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15084d = {2072524508, 1752415430, 2056218329, 2131093442, 1253442715, 597328298, 685108594};
    private final Context cm;
    private final NativeUtils cn;
    private final com.shield.android.h.a co;
    private com.shield.android.context.o cp;

    /* JADX INFO: renamed from: com.shield.android.context.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$b, reason: collision with other inner class name */
    public static final class C0053b extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15085d = {1282827617, 938161711, 173415297, 602259830};
        private /* synthetic */ Context bV;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0053b(Context context, InterfaceC1526a<? super C0053b> interfaceC1526a) {
            super(((int) f15085d[0]) ^ 1282827619, interfaceC1526a);
            this.bV = context;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return new C0053b(this.bV, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((C0053b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            Signature[] apkContentsSigners;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            ArrayList arrayList = new ArrayList();
            try {
                PackageManager packageManager = this.bV.getPackageManager();
                String packageName = this.bV.getPackageName();
                int i = Build.VERSION.SDK_INT;
                long[] jArr = f15085d;
                if (i >= (((int) jArr[1]) ^ 938161715)) {
                    try {
                        apkContentsSigners = packageManager.getPackageInfo(packageName, ((int) jArr[2]) ^ 39197569).signingInfo.getApkContentsSigners();
                    } catch (Throwable th2) {
                        com.shield.android.k.a.K(C1299b.cq).a(th2);
                        return "";
                    }
                } else {
                    apkContentsSigners = null;
                }
                if (apkContentsSigners == null) {
                    apkContentsSigners = this.bV.getPackageManager().getPackageInfo(packageName, ((int) f15085d[3]) ^ 602259766).signatures;
                }
                if (apkContentsSigners != null) {
                    Rj.f fVarF = D.f(apkContentsSigners);
                    while (fVarF.hasNext()) {
                        Signature signature = (Signature) fVarF.next();
                        a.C0048a c0048a = com.shield.android.b.a.fw;
                        String strA = a.C0048a.a(signature.toByteArray(), C1299b.cq);
                        if (!TextUtils.isEmpty(strA)) {
                            arrayList.add(strA);
                        }
                    }
                }
                return TextUtils.join(",", arrayList);
            } catch (Throwable th3) {
                com.shield.android.k.a.K(C1299b.cq).a(th3);
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$c */
    public static final class c extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Boolean>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15086d = {1874425057, 171832763, 1156949307};

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(((int) f15086d[0]) ^ 1874425059, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new c(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            try {
                if (com.shield.android.internal.f.bI()) {
                    return Boolean.valueOf(C1299b.this.cn.isPathExists(C1299b.this.cm.getFilesDir().getAbsolutePath()) == -1 ? ((int) f15086d[1]) ^ 171832762 : ((int) f15086d[2]) ^ 1156949307);
                }
            } catch (Throwable unused) {
            }
            return Boolean.valueOf(1156949307 ^ ((int) f15086d[2]));
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$d */
    public static final class d extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15087d = {205948668, 1898019510, 1206857710};

        public d(InterfaceC1526a<? super d> interfaceC1526a) {
            super(((int) f15087d[0]) ^ 205948669, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new d(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((d) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            PackageInfo packageInfo;
            String string;
            String string2;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            try {
                packageInfo = C1299b.this.cm.getPackageManager().getPackageInfo(C1299b.this.cm.getPackageName(), ((int) f15087d[1]) ^ 1898019510);
            } catch (Throwable th2) {
                com.shield.android.k.a.dL().a(th2);
                packageInfo = null;
            }
            String keyValue = C1299b.this.cn.getKeyValue(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
            String str = packageInfo != null ? packageInfo.versionName : null;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            concurrentHashMapR.put(keyValue, str);
            if (Build.VERSION.SDK_INT >= (((int) f15087d[2]) ^ 1206857714)) {
                String keyValue2 = C1299b.this.cn.getKeyValue("b");
                if (packageInfo != null && (string2 = new Long(packageInfo.getLongVersionCode()).toString()) != null) {
                    str2 = string2;
                }
                concurrentHashMapR.put(keyValue2, str2);
            } else {
                String keyValue3 = C1299b.this.cn.getKeyValue("b");
                if (packageInfo != null && (string = new Integer(packageInfo.versionCode).toString()) != null) {
                    str2 = string;
                }
                concurrentHashMapR.put(keyValue3, str2);
            }
            return concurrentHashMapR;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$e */
    public static final class e extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15088d = {965381750, 9404873, 914438498, 2051342776, 525705507, 755364877, 685407004, 188828310, 1338676627, 2079898759, 1113553653};
        private int bE;
        private Object bO;
        private /* synthetic */ com.shield.android.context.p cA;
        private /* synthetic */ com.shield.android.context.p cB;
        private /* synthetic */ com.shield.android.context.p cC;
        private /* synthetic */ com.shield.android.context.p cD;
        private /* synthetic */ com.shield.android.context.p cs;
        private /* synthetic */ com.shield.android.context.p ct;
        private /* synthetic */ com.shield.android.context.p cu;
        private /* synthetic */ com.shield.android.context.p cv;
        private /* synthetic */ com.shield.android.context.p cw;
        private /* synthetic */ com.shield.android.context.p cx;
        private /* synthetic */ com.shield.android.context.p cy;
        private /* synthetic */ com.shield.android.context.p cz;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.shield.android.context.p pVar, com.shield.android.context.p pVar2, com.shield.android.context.p pVar3, com.shield.android.context.p pVar4, com.shield.android.context.p pVar5, com.shield.android.context.p pVar6, com.shield.android.context.p pVar7, com.shield.android.context.p pVar8, com.shield.android.context.p pVar9, com.shield.android.context.p pVar10, com.shield.android.context.p pVar11, com.shield.android.context.p pVar12, InterfaceC1526a<? super e> interfaceC1526a) {
            super(((int) f15088d[0]) ^ 965381751, interfaceC1526a);
            this.cs = pVar;
            this.ct = pVar2;
            this.cu = pVar3;
            this.cv = pVar4;
            this.cw = pVar5;
            this.cx = pVar6;
            this.cy = pVar7;
            this.cz = pVar8;
            this.cA = pVar9;
            this.cB = pVar10;
            this.cC = pVar11;
            this.cD = pVar12;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new e(this.cs, this.ct, this.cu, this.cv, this.cw, this.cx, this.cy, this.cz, this.cA, this.cB, this.cC, this.cD, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((e) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:5)(2:6|7))(8:8|(2:10|(1:12)(1:13))|17|18|25|19|23|24)|14|(2:16|17)|18|25|19|23|24) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0111, code lost:
        
            r11 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0112, code lost:
        
            com.shield.android.k.a.dL().a(r11);
            r11 = "";
         */
        @Override // ij.AbstractC1607a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.C1299b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$f */
    public static final class f extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15089d = {1312659078, 1224769418, 2140415053};
        private int bE;

        public f(InterfaceC1526a<? super f> interfaceC1526a) {
            super(((int) f15089d[0]) ^ 1312659079, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new f(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((f) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                AbstractC1039j.b(obj);
                a.C0048a c0048a = com.shield.android.b.a.fw;
                NativeUtils nativeUtils = C1299b.this.cn;
                Context context = C1299b.this.cm;
                this.bE = ((int) f15089d[0]) ^ 1312659079;
                obj = a.C0048a.a(nativeUtils, context, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            Pair pair = (Pair) obj;
            long[] jArr = f15089d;
            Object[] objArr = new Object[((int) jArr[1]) ^ 1224769416];
            objArr[((int) jArr[2]) ^ 2140415053] = pair.first;
            objArr[((int) jArr[0]) ^ 1312659079] = pair.second;
            return C1132s.g(objArr);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$g */
    public static final class g extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15090d = {244279271};

        public g(InterfaceC1526a<? super g> interfaceC1526a) {
            super(((int) f15090d[0]) ^ 244279270, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new g(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((g) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            String strA;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            try {
                C1299b c1299b = C1299b.this;
                strA = C1299b.a(c1299b, c1299b.cm);
            } catch (Throwable th2) {
                com.shield.android.k.a.dL().a(th2);
                strA = "";
            }
            return cj.r.c(strA);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$h */
    public static final class h extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15091d = {1452716176, 809499957, 1757235893};
        private int bE;

        public h(InterfaceC1526a<? super h> interfaceC1526a) {
            super(((int) f15091d[0]) ^ 1452716177, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new h(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((h) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                AbstractC1039j.b(obj);
                a.C0048a c0048a = com.shield.android.b.a.fw;
                Context context = C1299b.this.cm;
                this.bE = ((int) f15091d[0]) ^ 1452716177;
                obj = c0048a.b(context, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            Pair pair = (Pair) obj;
            long[] jArr = f15091d;
            Object[] objArr = new Object[((int) jArr[1]) ^ 809499959];
            objArr[((int) jArr[2]) ^ 1757235893] = pair.first;
            int i4 = ((int) jArr[0]) ^ 1452716177;
            String str = (String) pair.second;
            if (str == null) {
                str = "";
            }
            objArr[i4] = str;
            return C1132s.g(objArr);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$i */
    public static final class i extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15092d = {337771246};
        private int bE;

        public i(InterfaceC1526a<? super i> interfaceC1526a) {
            super(((int) f15092d[0]) ^ 337771247, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new i(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((i) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                AbstractC1039j.b(obj);
                a.C0048a c0048a = com.shield.android.b.a.fw;
                NativeUtils nativeUtils = C1299b.this.cn;
                this.bE = ((int) f15092d[0]) ^ 337771247;
                obj = a.C0048a.a(nativeUtils, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return cj.r.c(obj);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$j */
    public static final class j extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15093d = {1051021563, 759477172, 1016918486, 1568390021};

        public j(InterfaceC1526a<? super j> interfaceC1526a) {
            super(((int) f15093d[0]) ^ 1051021562, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new j(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((j) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            String installerPackageName;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            String str = "";
            if (Build.VERSION.SDK_INT < (((int) f15093d[1]) ^ 759477162) ? (installerPackageName = C1299b.this.cm.getPackageManager().getInstallerPackageName(C1299b.this.cm.getPackageName())) != null : (installerPackageName = C1299b.this.cm.getPackageManager().getInstallSourceInfo(C1299b.this.cm.getPackageName()).getInitiatingPackageName()) != null) {
                str = installerPackageName;
            }
            long[] jArr = f15093d;
            Object[] objArr = new Object[((int) jArr[2]) ^ 1016918484];
            objArr[((int) jArr[3]) ^ 1568390021] = str;
            int i = ((int) jArr[0]) ^ 1051021562;
            String keyValue = C1299b.this.cn.getKeyValue("dt");
            long[] jArr2 = f15093d;
            objArr[i] = Boolean.valueOf(zj.z.w(str, ((int) jArr2[2]) ^ 1016918484, keyValue, ((int) jArr2[3]) ^ 1568390021));
            return C1132s.g(objArr);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$k */
    public static final class k extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15094d = {174487604, 1045840193, 771460294, 2015636261};

        public k(InterfaceC1526a<? super k> interfaceC1526a) {
            super(((int) f15094d[0]) ^ 174487605, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new k(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((k) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            long[] jArr = f15094d;
            String[] strArr = new String[((int) jArr[1]) ^ 1045840194];
            strArr[((int) jArr[2]) ^ 771460294] = C1299b.this.cn.getNativeAppVersion(C1299b.this.cm);
            strArr[((int) f15094d[0]) ^ 174487605] = C1299b.this.cn.getNativePackage(C1299b.this.cm);
            strArr[((int) f15094d[3]) ^ 2015636263] = C1299b.this.cn.getNativeSignature(C1299b.this.cm);
            return C1132s.g(strArr);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$l */
    public static final class l extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15095d = {864889119, 1261793544, 1015845426};

        public l(InterfaceC1526a<? super l> interfaceC1526a) {
            super(((int) f15095d[0]) ^ 864889118, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new l(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((l) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            int i;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            String packageName = C1299b.this.cm.getPackageName();
            long[] jArr = f15095d;
            Object[] objArr = new Object[((int) jArr[1]) ^ 1261793546];
            objArr[((int) jArr[2]) ^ 1015845426] = packageName;
            long j = 0;
            try {
                i = ((int) jArr[0]) ^ 864889118;
                PackageInfo packageInfo = C1299b.this.cm.getPackageManager().getPackageInfo(packageName, ((int) f15095d[2]) ^ 1015845426);
                if (packageInfo != null) {
                    j = packageInfo.firstInstallTime;
                }
            } catch (Throwable th2) {
                i = ((int) f15095d[0]) ^ 864889118;
                com.shield.android.k.a.dL().a(th2);
            }
            objArr[i] = new Long(j);
            return C1132s.g(objArr);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$m */
    public static final class m extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15096d = {1070641855, 1231049801};

        public m(InterfaceC1526a<? super m> interfaceC1526a) {
            super(((int) f15096d[0]) ^ 1070641854, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return new m(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((m) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            String str = "";
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("getProcessName", new Class[((int) f15096d[1]) ^ 1231049801]).invoke(cls.getMethod("currentActivityThread", new Class[((int) f15096d[1]) ^ 1231049801]).invoke(null, new Object[((int) f15096d[1]) ^ 1231049801]), new Object[((int) f15096d[1]) ^ 1231049801]);
                if (objInvoke != null) {
                    String string = objInvoke.toString();
                    if (string != null) {
                        str = string;
                    }
                }
            } catch (Exception e) {
                com.shield.android.k.a.dL().a(e);
            }
            return cj.r.c(str);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$n */
    public static final class n extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15097d = {597498012, 1491416301, 162188182, 2028136053};

        public n(InterfaceC1526a<? super n> interfaceC1526a) {
            super(((int) f15097d[0]) ^ 597498013, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new n(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((n) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            ArrayList arrayList = new ArrayList();
            try {
                PackageInfo packageInfo = C1299b.this.cm.getPackageManager().getPackageInfo(C1299b.this.cm.getPackageName(), 4096);
                if ((packageInfo != null ? packageInfo.requestedPermissions : null) != null) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (((strArr.length == 0 ? ((int) f15097d[0]) ^ 597498013 : ((int) f15097d[1]) ^ 1491416301) == 0 ? ((int) f15097d[0]) ^ 597498013 : ((int) f15097d[1]) ^ 1491416301) != 0) {
                        int i = ((int) f15097d[1]) ^ 1491416301;
                        int length = strArr.length;
                        while (i < length) {
                            int i4 = packageInfo.requestedPermissionsFlags[i];
                            long[] jArr = f15097d;
                            if ((i4 & (((int) jArr[2]) ^ 162188180)) != 0) {
                                String str = packageInfo.requestedPermissions[i];
                                boolean z4 = ((int) jArr[1]) ^ 1491416301;
                                int iJ = C2576A.J(str, z4 ? 1 : 0, ((int) jArr[3]) ^ 2028136051, z4, ".") + (((int) f15097d[0]) ^ 597498013);
                                if (str.length() > iJ) {
                                    arrayList.add(str.substring(iJ).toLowerCase(Locale.getDefault()));
                                }
                            }
                            int i6 = ((int) f15097d[0]) ^ 597498013;
                            int i10 = i + i6;
                            int i11 = i10 + i6 + ((~i) | (~i6));
                            i = (i10 - i11) + i11;
                        }
                    }
                }
            } catch (Throwable th2) {
                com.shield.android.k.a.dL().a(th2);
            }
            return cj.r.c(TextUtils.join(",", arrayList));
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$o */
    public static final class o extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15098d = {576891573, 1614464191, 1311079923};
        private int bE;
        private Object bO;
        private Object bP;
        private int cE;

        public o(InterfaceC1526a<? super o> interfaceC1526a) {
            super(((int) f15098d[0]) ^ 576891572, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new o(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((o) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            int i;
            Object[] objArr2;
            int i4;
            Object[] objArr3;
            Object[] objArr4;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i6 = this.bE;
            if (i6 == 0) {
                AbstractC1039j.b(obj);
                long[] jArr = f15098d;
                Object[] objArr5 = new Object[((int) jArr[1]) ^ 1614464189];
                int i10 = ((int) jArr[2]) ^ 1311079923;
                a.C0048a c0048a = com.shield.android.b.a.fw;
                NativeUtils nativeUtils = C1299b.this.cn;
                this.bO = objArr5;
                this.bP = objArr5;
                long[] jArr2 = f15098d;
                this.cE = ((int) jArr2[2]) ^ 1311079923;
                this.bE = ((int) jArr2[0]) ^ 576891572;
                Object objB = a.C0048a.b(nativeUtils, this);
                if (objB != enumC1578a) {
                    objArr = objArr5;
                    i = i10;
                    obj = objB;
                    objArr2 = objArr;
                }
                return enumC1578a;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = this.cE;
                objArr3 = (Object[]) this.bP;
                objArr4 = (Object[]) this.bO;
                AbstractC1039j.b(obj);
                objArr3[i4] = obj;
                return C1132s.g(objArr4);
            }
            i = this.cE;
            objArr2 = (Object[]) this.bP;
            objArr = (Object[]) this.bO;
            AbstractC1039j.b(obj);
            objArr2[i] = obj;
            long[] jArr3 = f15098d;
            long j = jArr3[0];
            int i11 = ((int) j) ^ 576891572;
            C1299b c1299b = C1299b.this;
            this.bO = objArr;
            this.bP = objArr;
            this.cE = ((int) j) ^ 576891572;
            this.bE = ((int) jArr3[1]) ^ 1614464189;
            obj = C1299b.a(c1299b, this);
            if (obj != enumC1578a) {
                i4 = i11;
                objArr3 = objArr;
                objArr4 = objArr3;
                objArr3[i4] = obj;
                return C1132s.g(objArr4);
            }
            return enumC1578a;
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$p */
    public static final class p extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15099d = {1852902427};
        private int bE;

        public p(InterfaceC1526a<? super p> interfaceC1526a) {
            super(((int) f15099d[0]) ^ 1852902426, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new p(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((p) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                AbstractC1039j.b(obj);
                C1299b c1299b = C1299b.this;
                Context context = c1299b.cm;
                this.bE = ((int) f15099d[0]) ^ 1852902426;
                obj = C1299b.a(c1299b, context, this);
                if (obj == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            return cj.r.c(obj);
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.b$q */
    public static final class q extends AbstractC1616j implements Function1<InterfaceC1526a<? super List<? extends Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15100d = {1857628241, 1229396282, 43904859};

        public q(InterfaceC1526a<? super q> interfaceC1526a) {
            super(((int) f15100d[0]) ^ 1857628240, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1299b.this.new q(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((q) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            AbstractC1039j.b(obj);
            String baseApkPath = C1299b.this.cn.getBaseApkPath();
            long[] jArr = f15100d;
            String[] strArr = new String[((int) jArr[1]) ^ 1229396280];
            strArr[((int) jArr[2]) ^ 43904859] = baseApkPath;
            int i = ((int) jArr[0]) ^ 1857628240;
            C1299b c1299b = C1299b.this;
            strArr[i] = C1299b.a(c1299b, baseApkPath, c1299b.co);
            return C1132s.g(strArr);
        }
    }

    static {
        new a((((int) 2072524508) ^ 2072524508) == true ? (byte) 1 : (byte) 0);
        cq = "b";
    }

    public C1299b(Context context, NativeUtils nativeUtils, com.shield.android.h.a aVar) {
        kotlin.jvm.internal.j.g(context, g("啄啈啉啓啂啟啓"));
        kotlin.jvm.internal.j.g(nativeUtils, g("啉商啓啎啑啂啲啓啎啋啔"));
        kotlin.jvm.internal.j.g(aVar, g("啄啕啞啗啓啈啲啓啎啋啔"));
        this.cm = context;
        this.cn = nativeUtils;
        this.co = aVar;
    }

    public static final Object a(C1299b c1299b, Context context, InterfaceC1526a interfaceC1526a) {
        return H.C(new C0053b(context, null), U.f603a, interfaceC1526a);
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15084d[0]) ^ 2072524508;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            long[] jArr = f15084d;
            long j6 = jArr[6];
            long j7 = jArr[3];
            int i6 = ~cCharAt;
            int i10 = (((int) j6) ^ 685094997) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j6) ^ 685094997) + (((int) j7) ^ 2131093443), i6 | (~(((int) j6) ^ 685094997)), i10, (((int) j6) ^ 685094997) + cCharAt + (((int) j7) ^ 2131093443) + ((~(((int) j6) ^ 685094997)) | i6)));
            long j9 = f15084d[3];
            int i11 = ~i4;
            i4 = i4 + (((int) j9) ^ 2131093443) + (((int) j9) ^ 2131093443) + ((~(((int) j9) ^ 2131093443)) | i11) + (((((int) j9) ^ 2131093443) + i4) - ((((((int) j9) ^ 2131093443) + i4) + (((int) j9) ^ 2131093443)) + ((~(((int) j9) ^ 2131093443)) | i11)));
        }
        return sb2.toString();
    }

    public final List<com.shield.android.context.g> ad() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        long[] jArr = f15084d;
        String[] strArr = new String[((int) jArr[2]) ^ 2056218331];
        strArr[((int) jArr[0]) ^ 2072524508] = this.cn.getKeyValue(g("啂啕"));
        strArr[((int) f15084d[3]) ^ 2131093443] = this.cn.getKeyValue(g("啂啁"));
        com.shield.android.context.p pVar = new com.shield.android.context.p(C1132s.g(strArr), U.f603a, 0L, new q(null), 4);
        long[] jArr2 = f15084d;
        String[] strArr2 = new String[((int) jArr2[2]) ^ 2056218331];
        strArr2[((int) jArr2[0]) ^ 2072524508] = this.cn.getKeyValue(g("啃"));
        strArr2[((int) f15084d[3]) ^ 2131093443] = this.cn.getKeyValue(g("啍"));
        com.shield.android.context.p pVar2 = new com.shield.android.context.p(C1132s.g(strArr2), null, 0L, new l(null), ((int) f15084d[4]) ^ 1253442717);
        long[] jArr3 = f15084d;
        String[] strArr3 = new String[((int) jArr3[2]) ^ 2056218331];
        strArr3[((int) jArr3[0]) ^ 2072524508] = this.cn.getKeyValue(g("問"));
        strArr3[((int) f15084d[3]) ^ 2131093443] = this.cn.getKeyValue(g("啀"));
        com.shield.android.context.p pVar3 = new com.shield.android.context.p(C1132s.g(strArr3), null, 0L, new j(null), ((int) f15084d[4]) ^ 1253442717);
        com.shield.android.context.p pVar4 = new com.shield.android.context.p(cj.r.c(this.cn.getKeyValue(g("啎"))), null, 0L, new g(null), ((int) f15084d[4]) ^ 1253442717);
        long[] jArr4 = f15084d;
        String[] strArr4 = new String[((int) jArr4[2]) ^ 2056218331];
        strArr4[((int) jArr4[0]) ^ 2072524508] = this.cn.getKeyValue(g("啂"));
        strArr4[((int) f15084d[3]) ^ 2131093443] = this.cn.getKeyValue(g("啃啔"));
        com.shield.android.context.p pVar5 = new com.shield.android.context.p(C1132s.g(strArr4), null, 0L, new f(null), ((int) f15084d[4]) ^ 1253442717);
        com.shield.android.context.p pVar6 = new com.shield.android.context.p(cj.r.c(this.cn.getKeyValue(g("啁"))), null, 0L, new p(null), ((int) f15084d[4]) ^ 1253442717);
        com.shield.android.context.p pVar7 = new com.shield.android.context.p(cj.r.c(this.cn.getKeyValue(g("啂啅"))), null, 0L, new i(null), ((int) f15084d[4]) ^ 1253442717);
        long[] jArr5 = f15084d;
        String[] strArr5 = new String[((int) jArr5[2]) ^ 2056218331];
        strArr5[((int) jArr5[0]) ^ 2072524508] = this.cn.getKeyValue(g("啃啕"));
        strArr5[((int) f15084d[3]) ^ 2131093443] = this.cn.getKeyValue(g("啂啄"));
        com.shield.android.context.p pVar8 = new com.shield.android.context.p(C1132s.g(strArr5), null, 0L, new h(null), ((int) f15084d[4]) ^ 1253442717);
        long[] jArr6 = f15084d;
        String[] strArr6 = new String[((int) jArr6[2]) ^ 2056218331];
        strArr6[((int) jArr6[0]) ^ 2072524508] = this.cn.getKeyValue(g("啂啀"));
        strArr6[((int) f15084d[3]) ^ 2131093443] = this.cn.getKeyValue(g("啂問"));
        com.shield.android.context.p pVar9 = new com.shield.android.context.p(C1132s.g(strArr6), null, 0L, new o(null), ((int) f15084d[4]) ^ 1253442717);
        com.shield.android.context.p pVar10 = new com.shield.android.context.p(cj.r.c(this.cn.getKeyValue(g("啌"))), null, 0L, new n(null), ((int) f15084d[4]) ^ 1253442717);
        com.shield.android.context.p pVar11 = new com.shield.android.context.p(cj.r.c(this.cn.getKeyValue(g("啁啀"))), null, 0L, new m(null), ((int) f15084d[4]) ^ 1253442717);
        long[] jArr7 = f15084d;
        String[] strArr7 = new String[((int) jArr7[5]) ^ 597328297];
        strArr7[((int) jArr7[0]) ^ 2072524508] = this.cn.getKeyValue(g("啁啎"));
        strArr7[((int) f15084d[3]) ^ 2131093443] = this.cn.getKeyValue(g("啁啍"));
        strArr7[((int) f15084d[2]) ^ 2056218331] = this.cn.getKeyValue(g("啁啌"));
        com.shield.android.context.p pVar12 = new com.shield.android.context.p(C1132s.g(strArr7), null, 0L, new k(null), ((int) f15084d[4]) ^ 1253442717);
        this.cp = new com.shield.android.context.o();
        long[] jArr8 = f15084d;
        com.shield.android.context.g[] gVarArr = new com.shield.android.context.g[((int) jArr8[2]) ^ 2056218331];
        int i4 = ((int) jArr8[0]) ^ 2072524508;
        StringBuilder sb2 = new StringBuilder();
        String str = cq;
        sb2.append(str);
        sb2.append(g("唖唓"));
        gVarArr[i4] = new com.shield.android.context.g(sb2.toString(), 0L, null, new d(null), ((int) f15084d[4]) ^ 1253442717);
        int i6 = ((int) f15084d[3]) ^ 2131093443;
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append(g("唖唒"));
        gVarArr[i6] = new com.shield.android.context.g(sbW.toString(), 0L, null, new e(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, null), ((int) f15084d[4]) ^ 1253442717);
        return C1132s.g(gVarArr);
    }

    public static final /* synthetic */ String b(C1299b c1299b, Context context) {
        return d(context);
    }

    private static String c(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, ((int) f15084d[0]) ^ 2072524508);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        CharSequence applicationLabel = applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : g("啲啉啌啉啈啐啉");
        kotlin.jvm.internal.j.e(applicationLabel, g("啉啒啋啋唇啄商啉啉啈啓唇啅啂唇啄商啔啓唇啓啈唇啉啈啉唊啉啒啋啋唇啓啞啗啂唇啌啈啓啋啎啉唉啴啓啕啎啉啀"));
        return (String) applicationLabel;
    }

    private static String d(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), ((int) f15084d[0]) ^ 2072524508);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            return g("啲啉啌啉啈啐啉");
        }
        if (Build.VERSION.SDK_INT >= (((int) f15084d[1]) ^ 1752415447)) {
            Configuration configuration = new Configuration();
            configuration.setLocale(Locale.ENGLISH);
            return context.createConfigurationContext(configuration).getResources().getString(applicationInfo.labelRes);
        }
        CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
        kotlin.jvm.internal.j.e(applicationLabel, g("啉啒啋啋唇啄商啉啉啈啓唇啅啂唇啄商啔啓唇啓啈唇啉啈啉唊啉啒啋啋唇啓啞啗啂唇啌啈啓啋啎啉唉啴啓啕啎啉啀"));
        return (String) applicationLabel;
    }

    public static final /* synthetic */ String a(C1299b c1299b, Context context) {
        return c(context);
    }

    public static final /* synthetic */ Object a(C1299b c1299b, InterfaceC1526a interfaceC1526a) {
        return H.C(c1299b.new c(null), interfaceC1526a.getContext(), interfaceC1526a);
    }

    public static final /* synthetic */ String a(C1299b c1299b, String str, com.shield.android.h.a aVar) {
        return com.shield.android.internal.i.a(str, aVar);
    }
}
