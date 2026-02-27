package com.shield.android.context;

import Bj.E;
import android.os.Build;
import bj.AbstractC1039j;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15151d = {1558934972, 1767672554, 1266013109, 214692541, 579598958, 1797309538, 239435078, 1095204233, 1473025338, 942874097, 1781029468, 314398876, 181652593, 1324243561, 1859977305, 1364679969, 137912100, 2117858179, 1838727368, 1937533109, 87730628, 530573664, 4574188, 1467812553, 592901132, 1889492281, 1800338439, 2037853742, 1016238434, 678337022, 474367344, 2027104902, 1809473141, 1572556363, 893936430, 523359665, -815283387, 1504827811, 575667100, 1330266387, 352997691};
    private static final String dR;
    private final NativeUtils dO;
    private final StringBuilder dP;
    private final String[] dQ;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1609c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15152d = {-1792498786};
        int bE;
        /* synthetic */ Object bM;

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.bM = obj;
            this.bE |= ((int) f15152d[0]) ^ 354984862;
            return n.this.e(this);
        }
    }

    public static final class c extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15153d = {609490946, 1177484400, 1678011082};

        public c(InterfaceC1526a<? super c> interfaceC1526a) {
            super(((int) f15153d[0]) ^ 609490944, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return n.this.new c(interfaceC1526a);
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
            if (com.shield.android.internal.f.bI()) {
                try {
                    com.shield.android.i.d dVar = new com.shield.android.i.d();
                    dVar.no = n.this.dO.isFridaDetected();
                    dVar.np = n.this.dO.isSandHookDetected();
                    dVar.nq = n.this.dO.isFoundSubstrate();
                    dVar.nr = n.this.dO.isVirtualXposedDetected();
                    dVar.ns = (n.this.dO.isVirtualAndroidDetected() || com.shield.android.c.k()) ? ((int) f15153d[1]) ^ 1177484401 : ((int) f15153d[2]) ^ 1678011082;
                    dVar.nt = n.this.dO.isTaichiDetected();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(n.this.dO.getKeyValue("cl"), (dVar.no || n.this.dO.isFridaDetected()) ? ((int) f15153d[1]) ^ 1177484401 : ((int) f15153d[2]) ^ 1678011082);
                        jSONObject.put(n.this.dO.getKeyValue("cm"), dVar.nq);
                        jSONObject.put(n.this.dO.getKeyValue("cn"), dVar.np);
                        jSONObject.put(n.this.dO.getKeyValue("co"), dVar.nr);
                        jSONObject.put(n.this.dO.getKeyValue("cp"), dVar.ns);
                        jSONObject.put(n.this.dO.getKeyValue("cq"), dVar.nt);
                        jSONObject.put(n.this.dO.getKeyValue("cr"), "");
                        boolean zAR = n.this.aR();
                        jSONObject.put(n.this.dO.getKeyValue("ei"), zAR ? ((int) f15153d[1]) ^ 1177484401 : ((int) f15153d[2]) ^ 1678011082);
                        jSONObject.put(n.this.dO.getKeyValue("eu"), zAR ? ((int) f15153d[1]) ^ 1177484401 : ((int) f15153d[2]) ^ 1678011082);
                        jSONObject.put(n.this.dO.getKeyValue("ej"), n.this.dP.toString());
                        jSONObject.put(n.this.dO.getKeyValue("ey"), n.this.dO.isLsplantDetected());
                        jSONObject.put(n.this.dO.getKeyValue("ard_b"), n.d(n.this));
                        jSONObject.put(n.this.dO.getKeyValue("ard_c"), n.this.aT());
                    } catch (Exception e) {
                        com.shield.android.k.a.dL().a(e);
                    }
                    return jSONObject.toString();
                } catch (Exception e7) {
                    com.shield.android.k.a.dL().a(e7);
                }
            }
            return "";
        }
    }

    public static final class d extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15154d = {2034941998};
        private int bE;
        private Object bO;
        private Object bP;
        private Object bQ;

        public d(InterfaceC1526a<? super d> interfaceC1526a) {
            super(((int) f15154d[0]) ^ 2034941999, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return n.this.new d(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((d) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
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
                String keyValue = n.this.dO.getKeyValue("ck");
                n nVar = n.this;
                this.bO = mapR;
                this.bP = mapR;
                this.bQ = keyValue;
                this.bE = ((int) f15154d[0]) ^ 2034941999;
                Object objE = nVar.e(this);
                if (objE == enumC1578a) {
                    return enumC1578a;
                }
                str = keyValue;
                obj = objE;
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

    public static final class e extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15155d = {162620584};

        public e(InterfaceC1526a<? super e> interfaceC1526a) {
            super(((int) f15155d[0]) ^ 162620585, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return n.this.new e(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((e) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(n.this.dO.getKeyValue("ff"), new Integer(n.this.dO.jitCacheCount()));
            return concurrentHashMapR;
        }
    }

    static {
        new a((((int) 1767672554) ^ 1767672554) == true ? (byte) 1 : (byte) 0);
        dR = "n";
    }

    public n(NativeUtils nativeUtils) {
        kotlin.jvm.internal.j.g(nativeUtils, g("壨壧売壯声壣壓売壯壪壵"));
        this.dO = nativeUtils;
        this.dP = new StringBuilder();
        long[] jArr = f15151d;
        String[] strArr = new String[((int) jArr[0]) ^ 1558934937];
        strArr[((int) jArr[1]) ^ 1767672554] = g("墩壢壣声墩壡壩壪壢壠壯壵壮壙壶壯壶壣");
        strArr[((int) f15151d[2]) ^ 1266013108] = g("墩壢壣声墩壡壩壪壢壠壯壵壮壙壶壯壶壣壙壢壶壴壥売壢");
        strArr[((int) f15151d[3]) ^ 214692543] = g("墩壵壿壵墩士壩壢壳壪壣墩壡壩壪壢壠壯壵壮壙壶壯壶壣");
        strArr[((int) f15151d[4]) ^ 579598957] = g("墩壵壿壵売壣士墩壪壯壤墩声壤壩壾壡壳壣壵売墨壭壩");
        strArr[4] = g("墨墩壵壿壵売壣士墩壪壯壤墩声壤壩壾壵壠墨壭壩");
        strArr[5] = g("壠壵売壧壤墨壧壨壢壿");
        strArr[((int) f15151d[5]) ^ 1797309540] = g("壳壣声壣壨売壢墨壧壨壢壿墨壴壥");
        strArr[((int) f15151d[6]) ^ 239435073] = g("壠壵売壧壤墨壨壩壾");
        strArr[((int) f15151d[7]) ^ 1095204225] = g("壯壨壯売墨壨壩壾墨壴壥");
        strArr[((int) f15151d[8]) ^ 1473025331] = g("壳壣声壣壨売壢墨壨壩壾墨壴壥");
        strArr[((int) f15151d[9]) ^ 942874107] = g("墩壵壿壵売壣士墩壤壯壨墩士壯壥壴壩声壯壴売壢");
        strArr[((int) f15151d[10]) ^ 1781029463] = g("墩壵壿壵売壣士墩壪壯壤墩士壣士壳壡壳壣壵売墨壭壩");
        strArr[((int) f15151d[11]) ^ 314398864] = g("墩壵壿壵売壣士墩壤壯壨墩壨壩壾墫壶壴壩壶");
        strArr[((int) f15151d[12]) ^ 181652604] = g("墩壵壿壵売壣士墩壤壯壨墩壨壩壾壢");
        strArr[((int) f15151d[13]) ^ 1324243559] = g("墩壵壿壵売壣士墩壪壯壤墩壪壯壤壨壩壾壢墨壵壩");
        strArr[((int) f15151d[14]) ^ 1859977302] = g("墩壵壿壵売壣士墩壪壯壤墩壪壯壤壨壩壾壵壶壣壣壢壳壶墨壵壩");
        strArr[((int) f15151d[15]) ^ 1364679985] = g("墩壵壿壵売壣士墩壣売壥墩壯壨壯売墨壨壩壾墨壵壮");
        strArr[((int) f15151d[16]) ^ 137912117] = g("墩壵壿壵売壣士墩壤壯壨墩壨壩壾");
        strArr[((int) f15151d[17]) ^ 2117858193] = g("墩壢壧売壧墩墨壤壪壳壣壵売壧壥壭壵墨壶壴壩壶");
        strArr[((int) f15151d[18]) ^ 1838727387] = g("墩壢壧売壧墩墨壤壵売壥壩壨壠墨壶壴壩壶");
        strArr[((int) f15151d[19]) ^ 1937533089] = g("墩士壨売墩壱壯壨壢壩壱壵墩壄壵売壕壮壧壴壣壢壀壩壪壢壣壴");
        strArr[((int) f15151d[20]) ^ 87730641] = g("墩壪壯壤墩声壤壩壾壡壳壣壵売墨壭壩");
        strArr[((int) f15151d[21]) ^ 530573686] = g("墩壪壯壤墩声壤壩壾壵壠墨壭壩");
        strArr[((int) f15151d[22]) ^ 4574203] = g("墩壢壧売壧墩壢壧売壧墩壥壩士墨壤壪壳壣壵売壧壥壭壵墨壤壵売壠壩壪壢壣壴");
        strArr[((int) f15151d[23]) ^ 1467812561] = g("墩壢壧売壧墩壢壧売壧墩壥壩士墨壤壪壳壣壵売壧壥壭壵墨壧壶壶士壧壴売");
        strArr[((int) f15151d[24]) ^ 592901141] = g("墩壢壧売壧墩壢壧売壧墩壥壩士墨壤壪壳壣壵売壧壥壭壵墨壮壩士壣");
        strArr[((int) f15151d[25]) ^ 1889492259] = g("墩壢壧売壧墩壢壧売壧墩壥壩士墨壤壪壳壣壵売壧壥壭壵墨壪壧壳壨壥壮壣壴");
        strArr[((int) f15151d[26]) ^ 1800338460] = g("墩壵壿壵売壣士墩壾壤壯壨墩壤壵売壭墩壵壳");
        strArr[((int) f15151d[27]) ^ 2037853746] = g("墩壵壿壵売壣士墩壾壤壯壨墩壤壵売壭");
        strArr[((int) f15151d[28]) ^ 1016238463] = g("墩壵壿壵売壣士墩壤壯壨墩壧壨壢壴壩壯壢壐壋墫声壤壩壾墫壵壠");
        strArr[((int) f15151d[29]) ^ 678336992] = g("墩壵壿壵墩士壩壢壳壪壣墩声壤壩壾壶壥壯壵士声");
        strArr[((int) f15151d[30]) ^ 474367343] = g("墩壵壿壵墩士壩壢壳壪壣墩壨壣士壳壵壠");
        strArr[((int) f15151d[31]) ^ 2027104934] = g("墩壵壿壵売壣士墩壣売壥墩士壳士壳墫壥壩壨壠壯壡壵");
        strArr[((int) f15151d[32]) ^ 1809473108] = g("墩壵壿壵売壣士墩壤壯壨墩壨壣士壳壯壨壯売");
        strArr[((int) f15151d[33]) ^ 1572556393] = g("墩壵壿壵売壣士墩壤壯壨墩壡壣壨壿壤壧壵壣壤壧壨壢");
        strArr[((int) f15151d[34]) ^ 893936397] = g("墩壵壿壵売壣士墩壤壯壨墩壢壴壩壯壢墲壾墫声壤壩壾墫壵壠");
        strArr[((int) f15151d[35]) ^ 523359637] = g("墩壵壿壵売壣士墩壤壯壨墩壢壴壩壯壢墲壾");
        this.dQ = strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    public final boolean aR() {
        char c10;
        int i;
        char c11;
        int i4;
        Collection collectionR;
        char c12 = 1;
        int i6 = 1767672554;
        ?? r22 = ((int) f15151d[1]) ^ 1767672554;
        char c13 = 2;
        int i10 = 1266013108;
        try {
            Process processExec = Runtime.getRuntime().exec(g("壪壩壡壥壧売墦墫壢"));
            if (processExec.getInputStream() != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                String line = bufferedReader.readLine();
                r22 = r22;
                while (line != null) {
                    String strG = g("壊壕壖壩壵壣壢墫壄壴壯壢壡壣");
                    long[] jArr = f15151d;
                    if (C2576A.z(line, strG, ((int) jArr[c12]) ^ i6, ((int) jArr[3]) ^ 214692543)) {
                        r22 = ((int) f15151d[c13]) ^ i10;
                        String strG2 = g("士壩壢壳壪壣");
                        long[] jArr2 = f15151d;
                        c10 = c12;
                        i = i6;
                        try {
                            c11 = c13;
                            i4 = i10;
                            try {
                                if (C2576A.z(line, strG2, ((int) jArr2[c10]) ^ i, ((int) jArr2[3]) ^ 214692543)) {
                                    String strG3 = g("壤壧壵壣墨壧壶壭");
                                    long[] jArr3 = f15151d;
                                    if (C2576A.z(line, strG3, ((int) jArr3[c10]) ^ i, ((int) jArr3[3]) ^ 214692543)) {
                                        String strG4 = g("士壩壢壳壪壣");
                                        long[] jArr4 = f15151d;
                                        ?? r62 = ((int) jArr4[c10]) ^ i;
                                        int iF = C2576A.F(line, strG4, r62 == true ? 1 : 0, r62, ((int) jArr4[5]) ^ 1797309540);
                                        if (iF != -1) {
                                            long[] jArr5 = f15151d;
                                            int i11 = ((int) jArr5[5]) ^ 1797309540;
                                            int i12 = iF + i11;
                                            int i13 = (((int) jArr5[c11]) ^ i4) + i12 + ((~iF) | (~i11));
                                            String strSubstring = line.substring(i13 + (i12 - i13));
                                            int i14 = ((int) f15151d[c10]) ^ i;
                                            int length = strSubstring.length();
                                            long[] jArr6 = f15151d;
                                            int i15 = length - (((int) jArr6[c11]) ^ i4);
                                            int i16 = ((int) jArr6[c10]) ^ i;
                                            while (i14 <= i15) {
                                                int i17 = kotlin.jvm.internal.j.i(strSubstring.charAt(i16 == 0 ? i14 : i15), ((int) f15151d[31]) ^ 2027104934) <= 0 ? ((int) f15151d[c11]) ^ i4 : ((int) f15151d[c10]) ^ i;
                                                if (i16 != 0) {
                                                    if (i17 == 0) {
                                                        break;
                                                    }
                                                    int i18 = i15 - 1;
                                                    int i19 = (((int) f15151d[c11]) ^ i4) + i18 + (~i15);
                                                    i15 = (i18 - i19) + i19;
                                                } else if (i17 == 0) {
                                                    i16 = ((int) f15151d[c11]) ^ i4;
                                                } else {
                                                    int i20 = ((int) f15151d[c11]) ^ i4;
                                                    int i21 = i14 + i20;
                                                    int i22 = i21 + i20 + ((~i14) | (~i20));
                                                    i14 = (i21 - i22) + i22;
                                                }
                                            }
                                            int i23 = ((int) f15151d[c11]) ^ i4;
                                            int i24 = i15 + i23;
                                            int i25 = i24 + i23 + ((~i15) | (~i23));
                                            List listI = new zj.o(g("墦墭")).i(((int) f15151d[c10]) ^ i, strSubstring.subSequence(i14, i25 + (i24 - i25)).toString());
                                            if (listI.isEmpty()) {
                                                collectionR = C1112C.f9377a;
                                                String str = ((String[]) collectionR.toArray(new String[((int) f15151d[c10]) ^ i]))[((int) f15151d[c10]) ^ i];
                                                StringBuilder sb2 = this.dP;
                                                sb2.append(str);
                                                sb2.append(g("墪"));
                                            } else {
                                                ListIterator listIterator = listI.listIterator(listI.size());
                                                while (listIterator.hasPrevious()) {
                                                    if ((((String) listIterator.previous()).length() == 0 ? ((int) f15151d[c11]) ^ i4 : ((int) f15151d[c10]) ^ i) == 0) {
                                                        collectionR = C1110A.R(listI, listIterator.nextIndex() + (((int) f15151d[c11]) ^ i4));
                                                        break;
                                                    }
                                                }
                                                collectionR = C1112C.f9377a;
                                                String str2 = ((String[]) collectionR.toArray(new String[((int) f15151d[c10]) ^ i]))[((int) f15151d[c10]) ^ i];
                                                StringBuilder sb22 = this.dP;
                                                sb22.append(str2);
                                                sb22.append(g("墪"));
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            c11 = c13;
                            i4 = i10;
                        }
                    } else {
                        c10 = c12;
                        i = i6;
                        c11 = c13;
                        i4 = i10;
                    }
                    line = bufferedReader.readLine();
                    c13 = c11;
                    c12 = c10;
                    i6 = i;
                    i10 = i4;
                    r22 = r22;
                }
                c10 = c12;
                i = i6;
                c11 = c13;
                i4 = i10;
                bufferedReader.close();
                r22 = r22;
            } else {
                c10 = 1;
                i = 1767672554;
                c11 = 2;
                i4 = 1266013108;
                r22 = r22;
            }
            int i26 = Build.VERSION.SDK_INT;
            long[] jArr7 = f15151d;
            if (i26 >= (((int) jArr7[25]) ^ 1889492259)) {
                long j = jArr7[37] ^ 1504827479;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!processExec.waitFor(j, TimeUnit.MILLISECONDS)) {
                    processExec.destroyForcibly();
                }
            } else {
                processExec.waitFor();
            }
        } catch (Exception unused3) {
            c10 = c12;
            i = i6;
        }
        if ((this.dP.length() > 0 ? ((int) f15151d[c11]) ^ i4 : ((int) f15151d[c10]) ^ i) != 0) {
            StringBuilder sb3 = this.dP;
            sb3.setLength(sb3.length() - (((int) f15151d[c11]) ^ i4));
        }
        return r22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    private static boolean aS() {
        ?? r02 = 1767672554;
        try {
            File[] fileArrListFiles = new File(g("墩壢壧売壧墩壵壿壵売壣士墩")).listFiles();
            if (fileArrListFiles != null) {
                if (((fileArrListFiles.length == 0 ? ((int) f15151d[2]) ^ 1266013108 : ((int) f15151d[1]) ^ 1767672554) == 0 ? ((int) f15151d[2]) ^ 1266013108 : ((int) f15151d[1]) ^ 1767672554) != 0) {
                    int i = ((int) f15151d[1]) ^ 1767672554;
                    int length = fileArrListFiles.length;
                    while (i < length) {
                        String name = fileArrListFiles[i].getName();
                        String strG = g("壮壯壢壣壙士壿壙壧壶壶壪壯壵売");
                        long[] jArr = f15151d;
                        if (C2576A.z(name, strG, ((int) jArr[1]) ^ 1767672554, ((int) jArr[3]) ^ 214692543)) {
                            r02 = ((int) f15151d[2]) ^ 1266013108;
                            return r02;
                        }
                        int i4 = ((int) f15151d[2]) ^ 1266013108;
                        int i6 = i + i4;
                        int i10 = i6 + i4 + ((~i) | (~i4));
                        i = (i6 - i10) + i10;
                    }
                }
            }
            return 1767672554 ^ ((int) f15151d[1]);
        } catch (Exception unused) {
            return r02 ^ ((int) f15151d[1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public final boolean aT() {
        ?? r02 = 1767672554;
        try {
            String[] strArr = this.dQ;
            int i = ((int) f15151d[1]) ^ 1767672554;
            int length = strArr.length;
            while (i < length) {
                if (new File(strArr[i]).exists()) {
                    r02 = ((int) f15151d[2]) ^ 1266013108;
                    return r02;
                }
                long j = f15151d[2];
                int i4 = ~i;
                i = i + (((int) j) ^ 1266013108) + (((int) j) ^ 1266013108) + ((~(((int) j) ^ 1266013108)) | i4) + (((((int) j) ^ 1266013108) + i) - ((((((int) j) ^ 1266013108) + i) + (((int) j) ^ 1266013108)) + ((~(((int) j) ^ 1266013108)) | i4)));
            }
            return 1767672554 ^ ((int) f15151d[1]);
        } catch (Exception unused) {
            return r02 ^ ((int) f15151d[1]);
        }
    }

    public static final /* synthetic */ boolean d(n nVar) {
        return aS();
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15151d[1]) ^ 1767672554;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15151d;
            long j = jArr[40];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 352979389) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 352979389) + (((int) j6) ^ 1266013108), i4 | (~(((int) j) ^ 352979389)), i6, (((int) j) ^ 352979389) + cCharAt + (((int) j6) ^ 1266013108) + ((~(((int) j) ^ 352979389)) | i4)));
            long j7 = f15151d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1266013108) + (((int) j7) ^ 1266013108) + ((~(((int) j7) ^ 1266013108)) | i10) + (((((int) j7) ^ 1266013108) + i) - ((((((int) j7) ^ 1266013108) + i) + (((int) j7) ^ 1266013108)) + ((~(((int) j7) ^ 1266013108)) | i10)));
        }
        return sb2.toString();
    }

    public final List<g> aU() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        StringBuilder sb2 = new StringBuilder();
        String str = dR;
        sb2.append(str);
        sb2.append((((int) f15151d[38]) ^ 575667117) == true ? (char) 1 : (char) 0);
        g gVar = new g(sb2.toString(), 0L, null, new d(null), ((int) f15151d[5]) ^ 1797309540);
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append((((int) f15151d[39]) ^ 1330266401) == true ? (char) 1 : (char) 0);
        g gVar2 = new g(sbW.toString(), 0L, null, new e(null), ((int) f15151d[5]) ^ 1797309540);
        long[] jArr = f15151d;
        g[] gVarArr = new g[((int) jArr[3]) ^ 214692543];
        gVarArr[((int) jArr[1]) ^ 1767672554] = gVar;
        gVarArr[((int) jArr[2]) ^ 1266013108] = gVar2;
        return C1132s.g(gVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gj.InterfaceC1526a<? super java.lang.String> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.shield.android.context.n.b
            if (r0 == 0) goto L1c
            r0 = r7
            com.shield.android.context.n$b r0 = (com.shield.android.context.n.b) r0
            int r1 = r0.bE
            long[] r2 = com.shield.android.context.n.f15151d
            r3 = 36
            r3 = r2[r3]
            int r2 = (int) r3
            r3 = 1332200261(0x4f67c345, float:3.888334E9)
            r2 = r2 ^ r3
            r3 = r1 & r2
            if (r3 == 0) goto L1c
            int r1 = r1 - r2
            r0.bE = r1
            goto L21
        L1c:
            com.shield.android.context.n$b r0 = new com.shield.android.context.n$b
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
            java.lang.String r0 = "壥壧壪壪墦売壩墦墡壴壣壵壳士壣墡墦壤壣壠壩壴壣墦墡壯壨声壩壭壣墡墦壱壯売壮墦壥壩壴壩壳売壯壨壣"
            java.lang.String r0 = g(r0)
            r7.<init>(r0)
            throw r7
        L3c:
            bj.AbstractC1039j.b(r7)
            Ij.e r7 = Bj.U.f603a
            Ij.d r7 = Ij.d.f2362a
            com.shield.android.context.n$c r2 = new com.shield.android.context.n$c
            r3 = 0
            r2.<init>(r3)
            long[] r3 = com.shield.android.context.n.f15151d
            r4 = 2
            r4 = r3[r4]
            int r3 = (int) r4
            r4 = 1266013108(0x4b75d3b4, float:1.6110516E7)
            r3 = r3 ^ r4
            r0.bE = r3
            java.lang.Object r7 = Bj.H.C(r2, r7, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.n.e(gj.a):java.lang.Object");
    }
}
