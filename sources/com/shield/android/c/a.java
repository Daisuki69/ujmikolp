package com.shield.android.c;

import Bj.E;
import Bj.H;
import Bj.U;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import bj.AbstractC1039j;
import com.google.gson.q;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.c.a;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import zj.C2579a;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15062d = {745004815, 497439836, 186878193, 1028048752, 723531038};
    public static final C0050a fz = new C0050a((((int) 745004815) ^ 745004815) == true ? 1 : 0);

    /* JADX INFO: renamed from: com.shield.android.c.a$a, reason: collision with other inner class name */
    public static final class C0050a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15063d = {1383870825, 1230109953, 1479300489, 192744559, 459215457, 2140165325, 429509835, 1800423372};

        /* JADX INFO: renamed from: com.shield.android.c.a$a$a, reason: collision with other inner class name */
        public static final class C0051a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Long>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15064d = {1232312003, -520487951, 1429115486, 1183980536, 751826835, 1011265254};

            public C0051a(InterfaceC1526a<? super C0051a> interfaceC1526a) {
                super(((int) f15064d[0]) ^ 1232312001, interfaceC1526a);
            }

            public static String f(String str) {
                StringBuilder sb2 = new StringBuilder();
                int i = ((int) f15064d[2]) ^ 1429115486;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    long[] jArr = f15064d;
                    long j = jArr[3];
                    long j6 = jArr[4];
                    int i4 = ~cCharAt;
                    int i6 = (((int) j) ^ 1184009165) + cCharAt;
                    sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1184009165)) + (((int) j6) ^ 751826834), (~(((int) j) ^ 1184009165)) | i4, i6, (((((int) j) ^ 1184009165) + cCharAt) + (((int) j6) ^ 751826834)) + ((~(((int) j) ^ 1184009165)) | i4)) ^ (i % (((int) jArr[5]) ^ 1011241241))));
                    long j7 = f15064d[4];
                    int i10 = ~i;
                    i = i + (((int) j7) ^ 751826834) + (((int) j7) ^ 751826834) + ((~(((int) j7) ^ 751826834)) | i10) + (((((int) j7) ^ 751826834) + i) - ((((((int) j7) ^ 751826834) + i) + (((int) j7) ^ 751826834)) + ((~(((int) j7) ^ 751826834)) | i10)));
                }
                return sb2.toString();
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new C0051a(interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((C0051a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                long jLastModified = f15064d[1] ^ 520487950;
                try {
                    File file = new File(f("通遇過遅遅違遞逝遟遉遖遒遝逖運遈遊達"));
                    if (file.exists()) {
                        jLastModified = file.lastModified();
                    }
                } catch (Throwable unused) {
                }
                return new Long(jLastModified);
            }
        }

        /* JADX INFO: renamed from: com.shield.android.c.a$a$b */
        public static final class b extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Callable<ArrayList<q>>>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15065d = {1037991302, 1580994506, 1186680826863514676L, -5988876979662500371L, -2129748145328723801L, 8654423356353434181L, -1301668208252041368L, -6645017421872588557L, -7348484285606338164L, -6083546864742577120L, 1573540162, 64791094, 1486116124, 1204046723, 1179167972, 1337210139};

            public b(InterfaceC1526a<? super b> interfaceC1526a) {
                super(((int) f15065d[0]) ^ 1037991300, interfaceC1526a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0061 A[PHI: r5
  0x0061: PHI (r5v2 android.media.MediaDrm) = (r5v1 android.media.MediaDrm), (r5v5 android.media.MediaDrm) binds: [B:24:0x0081, B:9:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final java.util.ArrayList a(java.util.HashMap r8, java.util.ArrayList r9) throws java.lang.Throwable {
                /*
                    java.util.Set r8 = r8.entrySet()
                    java.util.Iterator r8 = r8.iterator()
                    r0 = 0
                L9:
                    boolean r1 = r8.hasNext()
                    if (r1 == 0) goto L98
                    java.lang.Object r1 = r8.next()
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    java.lang.Object r2 = r1.getKey()
                    java.util.UUID r2 = (java.util.UUID) r2
                    java.lang.Object r1 = r1.getValue()
                    java.lang.String r1 = (java.lang.String) r1
                    r3 = 1573540190(0x5dca515e, float:1.8223171E18)
                    r4 = 10
                    android.media.MediaDrm r5 = new android.media.MediaDrm     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
                    r5.<init>(r2)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
                    java.lang.String r0 = "㡚鱺칹\ue76e珠릤\udcb5\uee1e\uf751篭㶻Ẃ輺䟝"
                    java.lang.String r0 = d(r0)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    byte[] r0 = r5.getPropertyByteArray(r0)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    java.lang.String r0 = com.shield.android.e.f.c(r0)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    com.google.gson.q r2 = new com.google.gson.q     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    r2.<init>()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    java.lang.String r6 = "㡎鱭칠\ue771珪릥\udc85\uee02"
                    java.lang.String r6 = d(r6)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    r2.l(r6, r1)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    java.lang.String r1 = "㡈鱾칣\ue772珦"
                    java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    r2.l(r1, r0)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    r9.add(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L69
                    int r0 = android.os.Build.VERSION.SDK_INT
                    long[] r1 = com.shield.android.c.a.C0050a.b.f15065d
                    r6 = r1[r4]
                    int r1 = (int) r6
                    r1 = r1 ^ r3
                    if (r0 < r1) goto L61
                L5d:
                    r5.release()
                    goto L64
                L61:
                    r5.release()
                L64:
                    r0 = r5
                    goto L9
                L66:
                    r8 = move-exception
                    r0 = r5
                    goto L84
                L69:
                    r0 = move-exception
                    goto L70
                L6b:
                    r8 = move-exception
                    goto L84
                L6d:
                    r1 = move-exception
                    r5 = r0
                    r0 = r1
                L70:
                    com.shield.android.k.a r1 = com.shield.android.k.a.dL()     // Catch: java.lang.Throwable -> L66
                    r1.a(r0)     // Catch: java.lang.Throwable -> L66
                    if (r5 == 0) goto L64
                    int r0 = android.os.Build.VERSION.SDK_INT
                    long[] r1 = com.shield.android.c.a.C0050a.b.f15065d
                    r6 = r1[r4]
                    int r1 = (int) r6
                    r1 = r1 ^ r3
                    if (r0 < r1) goto L61
                    goto L5d
                L84:
                    if (r0 == 0) goto L97
                    int r9 = android.os.Build.VERSION.SDK_INT
                    long[] r1 = com.shield.android.c.a.C0050a.b.f15065d
                    r4 = r1[r4]
                    int r1 = (int) r4
                    r1 = r1 ^ r3
                    if (r9 < r1) goto L94
                    r0.release()
                    goto L97
                L94:
                    r0.release()
                L97:
                    throw r8
                L98:
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.shield.android.c.a.C0050a.b.a(java.util.HashMap, java.util.ArrayList):java.util.ArrayList");
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new b(interfaceC1526a);
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
                    final ArrayList arrayList = new ArrayList();
                    if (Build.VERSION.SDK_INT < (((int) f15065d[1]) ^ 1580994520)) {
                        return null;
                    }
                    final HashMap map = new HashMap();
                    long[] jArr = f15065d;
                    map.put(new UUID(jArr[2] ^ 2051356982, jArr[3] ^ 1565603494), d("㡝鱰칢\ue76a珬릯\udcb0\uee03\uf74b篴㶛Ẓ輚䟝"));
                    long[] jArr2 = f15065d;
                    map.put(new UUID(jArr2[4] ^ 690477934, jArr2[5] ^ 741507403), d("㡝鱳칪\ue766珱릊\udc85\uee09\uf76d篩㶧ẃ"));
                    long[] jArr3 = f15065d;
                    map.put(new UUID(jArr3[6] ^ 1180798374, jArr3[7] ^ 1176353054), d("㡉鱶칫\ue762珕릨\udc8e\uee15\uf76d篩㶧ẃ"));
                    long[] jArr4 = f15065d;
                    map.put(new UUID(jArr4[8] ^ 2124718858, jArr4[9] ^ 672895925), d("㡎鱳칮\ue77e珑릤\udc81\uee14\uf741築㶻Ẏ輗"));
                    return new Callable() { // from class: com.shield.android.c.b
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return a.C0050a.b.a(map, arrayList);
                        }
                    };
                } catch (Exception e) {
                    com.shield.android.k.a.dL().a(e);
                    return null;
                }
            }

            public static String d(String str) {
                int i = ((int) f15065d[11]) ^ 64803403;
                StringBuilder sb2 = new StringBuilder();
                int i4 = ((int) f15065d[12]) ^ 1486116124;
                while (i4 < str.length()) {
                    long[] jArr = f15065d;
                    int i6 = (((i >> (((int) jArr[12]) ^ 1486116124)) ^ (i >> (((int) jArr[0]) ^ 1037991300))) ^ (i >> (((int) jArr[13]) ^ 1204046720))) ^ (i >> 5);
                    long j = jArr[14];
                    i = (char) ((i >> (((int) j) ^ 1179167973)) | (((char) (i6 & (((int) j) ^ 1179167973))) << (((int) jArr[15]) ^ 1337210132)));
                    char cCharAt = str.charAt(i4);
                    int i10 = cCharAt + i;
                    long j6 = f15065d[14];
                    int i11 = (~cCharAt) | (~i);
                    sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1179167973, i11, i10, (((int) j6) ^ 1179167973) + i10 + i11));
                    long j7 = f15065d[14];
                    int i12 = ~i4;
                    i4 = i4 + (((int) j7) ^ 1179167973) + (((int) j7) ^ 1179167973) + ((~(((int) j7) ^ 1179167973)) | i12) + (((((int) j7) ^ 1179167973) + i4) - ((((((int) j7) ^ 1179167973) + i4) + (((int) j7) ^ 1179167973)) + ((~(((int) j7) ^ 1179167973)) | i12)));
                }
                return sb2.toString();
            }
        }

        /* JADX INFO: renamed from: com.shield.android.c.a$a$c */
        public static final class c extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super String>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15066d = {203006416, 438361216, 1783268602, 1059212133, 574524959, 620404288, 583676267, 1185943510};

            public c(InterfaceC1526a<? super c> interfaceC1526a) {
                super(((int) f15066d[0]) ^ 203006418, interfaceC1526a);
            }

            public static String f(String str) {
                StringBuilder sb2 = new StringBuilder();
                int i = ((int) f15066d[2]) ^ 1783268602;
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    long[] jArr = f15066d;
                    long j = jArr[6];
                    long j6 = jArr[3];
                    int i4 = ~cCharAt;
                    int i6 = (((int) j) ^ 583664477) + cCharAt;
                    sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 583664477)) + (((int) j6) ^ 1059212132), (~(((int) j) ^ 583664477)) | i4, i6, (((((int) j) ^ 583664477) + cCharAt) + (((int) j6) ^ 1059212132)) + ((~(((int) j) ^ 583664477)) | i4)) ^ (i % (((int) jArr[7]) ^ 1186000937))));
                    long j7 = f15066d[3];
                    int i10 = ~i;
                    i = i + (((int) j7) ^ 1059212132) + (((int) j7) ^ 1059212132) + ((~(((int) j7) ^ 1059212132)) | i10) + (((((int) j7) ^ 1059212132) + i) - ((((((int) j7) ^ 1059212132) + i) + (((int) j7) ^ 1059212132)) + ((~(((int) j7) ^ 1059212132)) | i10)));
                }
                return sb2.toString();
            }

            @Override // ij.AbstractC1607a
            public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
                return new c(interfaceC1526a);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return ((c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
            }

            @Override // ij.AbstractC1607a
            public final Object invokeSuspend(Object obj) {
                CharSequence charSequenceSubSequence = "";
                EnumC1578a enumC1578a = EnumC1578a.f17050a;
                AbstractC1039j.b(obj);
                String strF = f("㉅㉃㉕㉁㈒㈜㉃㉈㉍㈐㉚㉎㈕㉈㉝㉕㉏㉉㉑㉝㈍㉏㉏㉀㉊㈏㉐㈍㉍㉙㉍㉙㈶㈰㉙㉺㉶㉺㉶㉨㈹");
                try {
                    long[] jArr = f15066d;
                    String[] strArr = new String[((int) jArr[1]) ^ 438361219];
                    strArr[((int) jArr[2]) ^ 1783268602] = f("㈙㉕㉝㉛㈝㉀㉘");
                    strArr[((int) f15066d[3]) ^ 1059212132] = f("㈛㉔");
                    strArr[((int) f15066d[0]) ^ 203006418] = strF;
                    Process processStart = new ProcessBuilder(strArr).start();
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), C2581c.f21468b), 8192);
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    sb2.append(line);
                                    sb2.append(f("㈼"));
                                } finally {
                                }
                            }
                            Unit unit = Unit.f18162a;
                            bufferedReader.close();
                            int i = Build.VERSION.SDK_INT;
                            long[] jArr2 = f15066d;
                            if (i >= (((int) jArr2[4]) ^ 574524933)) {
                                long j = jArr2[5] ^ 620404660;
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                if (!processStart.waitFor(j, TimeUnit.MILLISECONDS)) {
                                    processStart.destroyForcibly();
                                }
                            } else {
                                processStart.waitFor();
                            }
                            processStart.destroy();
                            if ((sb2.length() > 0 ? ((int) f15066d[3]) ^ 1059212132 : ((int) f15066d[2]) ^ 1783268602) == 0) {
                                return f("");
                            }
                            int length = sb2.length() - 1;
                            if (length >= 0) {
                                while (true) {
                                    int i4 = length - 1;
                                    if (!C2579a.b(sb2.charAt(length))) {
                                        charSequenceSubSequence = sb2.subSequence(0, length + 1);
                                        break;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    length = i4;
                                }
                            }
                            return charSequenceSubSequence.toString();
                        } finally {
                            processStart.destroy();
                        }
                    } catch (IOException e) {
                        com.shield.android.k.a.dL().b(f("㈖㉲㉆㉇㉝㉁㈐㉔㉆㉚㉟㉈㉎㉒㉖㉞㈆㉄㉋㉈㉏㉂㉎㉅㈔㈏") + e.getMessage(), new Object[1783268602 ^ ((int) f15066d[2])]);
                        String strF2 = f("");
                        processStart.destroy();
                        return strF2;
                    } catch (InterruptedException e7) {
                        com.shield.android.k.a.dL().b(f("㈖㉴㉛㉘㉟㉒㉞㉕㈞㉖㉒㉉㉟㉉㉊㉌㉖㉓㉁㉁㈘㈃") + e7.getMessage(), new Object[1783268602 ^ ((int) f15066d[2])]);
                        String strF3 = f("");
                        processStart.destroy();
                        return strF3;
                    }
                } catch (Exception e10) {
                    com.shield.android.k.a.dL().b(f("㈖㉲㉆㉇㉝㉁㈐㉂㉊㉞㉎㉉㉓㉕㉟㈙㉖㉕㉋㉆㉇㉐㉓㈛㈎") + e10.getMessage(), new Object[1783268602 ^ ((int) f15066d[2])]);
                    return f("");
                }
            }
        }

        private C0050a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
        private static boolean K(Context context) {
            int i;
            int i4 = 192744559;
            ?? r1 = 3;
            r1 = 3;
            try {
                int i6 = context.getResources().getConfiguration().screenLayout;
                long[] jArr = f15063d;
                if ((i6 & (((int) jArr[0]) ^ 1383870822)) >= (((int) jArr[1]) ^ 1230109954)) {
                    i = (int) jArr[2];
                    i4 = 1479300488;
                } else {
                    long j = jArr[3];
                    i = (int) j;
                    r1 = j;
                }
                return i ^ i4;
            } catch (Throwable unused) {
                return ((int) f15063d[r1]) ^ i4;
            }
        }

        private static String bo() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(d("\uef11矜뮸嶁꺓坛ꮐ喿")).getInputStream()));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Exception e) {
                return d("\uef21矠뮋嶣꺤坁ꮝ") + e.getMessage();
            }
        }

        private static HashMap<String, String> bp() {
            try {
                Process processExec = Runtime.getRuntime().exec(d("\uef03矗뮭嶜꺄圔ꯍ"));
                HashMap<String, String> map = new HashMap<>();
                if (processExec.getInputStream() == null) {
                    if (processExec.getErrorStream() != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getErrorStream()));
                        map.put(d("\uef06矇뮰嶀꺒圤ꯘ喬⪝ᔘ諉"), bufferedReader.readLine());
                        bufferedReader.close();
                    }
                    return map;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                Pattern patternCompile = Pattern.compile(d("\uef4c瞍믥巑꺪圠ꮔ嗰⫄ᕈ誓앢\ue293\uf10b磶뱼"));
                for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                    Matcher matcher = patternCompile.matcher(line);
                    int i = ((int) f15063d[3]) ^ 192744559;
                    String strD = d("");
                    while (matcher.find()) {
                        if (i == 0) {
                            strD = matcher.group();
                        } else {
                            map.put(strD, matcher.group());
                        }
                        long j = f15063d[2];
                        int i4 = ~i;
                        i = i + (((int) j) ^ 1479300488) + (((int) j) ^ 1479300488) + ((~(((int) j) ^ 1479300488)) | i4) + (((((int) j) ^ 1479300488) + i) - ((((((int) j) ^ 1479300488) + i) + (((int) j) ^ 1479300488)) + ((~(((int) j) ^ 1479300488)) | i4)));
                    }
                }
                bufferedReader2.close();
                return map;
            } catch (Throwable unused) {
                return null;
            }
        }

        private final HashMap<String, String> bq() {
            HashMap<String, String> map = new HashMap<>();
            try {
                map.put(d("\uef06矇뮰嶀꺒圹ꯜ喽⪄ᔂ請씍\ue2dc\uf138磛"), d("\uef01矜뮸嶎꺚圞ꯙ"));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씿\ue2c1\uf136磙백"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씿\ue2c1\uf136磙백")));
                map.put(d("\uef16矝믷嶎꺙圔ꯉ喲⪀ᔖ諟씸\ue2dc"), j(d("\uef16矝믷嶎꺙圔ꯉ喲⪀ᔖ諟씸\ue2dc")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씿\ue2dc\uf136磅백"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씿\ue2dc\uf136磅백")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씮\ue2d7\uf124磟배幇⼻៨讷䖃ꊟ儜"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씮\ue2d7\uf124磟배幇⼻៨讷䖃ꊟ儜")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씲\ue2ca\uf13a碅밷幘⽴៤计"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씲\ue2ca\uf13a碅밷幘⽴៤计")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씾\ue2de\uf122碅밴幈⽼៦讬䖑ꊅ"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씾\ue2de\uf122碅밴幈⽼៦讬䖑ꊅ")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씾\ue2de\uf122碅밴幈⽼"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씾\ue2de\uf122碅밴幈⽼")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씾\ue2de\uf122碅밴幈⽼ី"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씾\ue2de\uf122碅밴幈⽼ី")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씹\ue2cb\uf121磂밶幏"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씹\ue2cb\uf121磂밶幏")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔓ諒씮\ue2de\uf13b磊밬帄⽼\u17ee"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔓ諒씮\ue2de\uf13b磊밬帄⽼\u17ee")));
                map.put(d("\uef16矝믷嶄꺗圉ꯙ喩⪎ᔅ諞"), j(d("\uef16矝믷嶄꺗圉ꯙ喩⪎ᔅ諞")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔟ諔씮\ue2da"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔟ諔씮\ue2da")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔞ諟"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔞ諟")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씰\ue2cf\uf139磞밳幋⽶\u17fe记䖐ꊔ儊"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씰\ue2cf\uf139磞밳幋⽶\u17fe记䖐ꊔ儊")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씫\ue2cb\uf139磏밺幘⼻៧认䖌ꊄ儞⣝鐽䩛╢ዹठӐ"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씫\ue2cb\uf139磏밺幘⼻៧认䖌ꊄ儞⣝鐽䩛╢ዹठӐ")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씰\ue2c1\uf133磎밹"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씰\ue2c1\uf133磎밹")));
                map.put(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씳\ue2cf\uf13a磎"), j(d("\uef16矝믷嶜꺄圔ꯙ喫⪌ᔃ誕씳\ue2cf\uf13a磎")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔃ諚씺\ue2dd"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔃ諚씺\ue2dd")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔓ諚씩\ue2cb\uf179磞밡幉"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔓ諚씩\ue2cb\uf179磞밡幉")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔃ諂씭\ue2cb"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔃ諂씭\ue2cb")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔁ諞씯\ue2dd\uf13e磄밻帄⽶៥计䖇ꊟ儙⣑鐻"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔁ諞씯\ue2dd\uf13e磄밻帄⽶៥计䖇ꊟ儙⣑鐻")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔁ諞씯\ue2dd\uf13e磄밻帄⽼៤讦䖐ꊔ儕⣙鐰䩛╶ዧ"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔁ諞씯\ue2dd\uf13e磄밻帄⽼៤讦䖐ꊔ儕⣙鐰䩛╶ዧ")));
                map.put(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔁ諞씯\ue2dd\uf13e磄밻帄⽧\u17ef让䖇ꊐ儋⣙"), j(d("\uef16矝믷嶎꺃園ꯑ喺⫁ᔁ諞씯\ue2dd\uf13e磄밻帄⽧\u17ef让䖇ꊐ儋⣙")));
                map.put(d("\uef12矗뮷嶈꺙圉ꮓ喹⪜ᔚ誕씮\ue2cb\uf125磂밴幆"), j(d("\uef12矗뮷嶈꺙圉ꮓ喹⪜ᔚ誕씮\ue2cb\uf125磂밴幆")));
                map.put(d("\uef16矝믷嶎꺙圔ꯉ嗰⪎ᔇ諤씮\ue2cb\uf125磂밴幆"), j(d("\uef16矝믷嶎꺙圔ꯉ嗰⪎ᔇ諤씮\ue2cb\uf125磂밴幆")));
                map.put(d("\uef16矝믷嶎꺙圔ꯉ嗰⪊ᔚ誕씹\ue2c7\uf133"), j(d("\uef16矝믷嶎꺙圔ꯉ嗰⪊ᔚ誕씹\ue2c7\uf133")));
                map.put(d("\uef16矝믷嶎꺙圔ꯉ嗰⪍ᔄ諕"), j(d("\uef16矝믷嶎꺙圔ꯉ嗰⪍ᔄ諕")));
                map.put(d("\uef16矝믷嶎꺙圔ꯉ嗰⪚ᔙ"), j(d("\uef16矝믷嶎꺙圔ꯉ嗰⪚ᔙ")));
                map.put(d("\uef03矁뮴巂꺅圞ꯏ喷⪎ᔛ"), j(d("\uef03矁뮴巂꺅圞ꯏ喷⪎ᔛ")));
            } catch (Exception unused) {
            }
            return map;
        }

        public static String d(String str) {
            int i = ((int) f15063d[7]) ^ 1800444164;
            StringBuilder sb2 = new StringBuilder();
            int i4 = ((int) f15063d[3]) ^ 192744559;
            while (i4 < str.length()) {
                long[] jArr = f15063d;
                int i6 = (((i >> (((int) jArr[3]) ^ 192744559)) ^ (i >> (((int) jArr[4]) ^ 459215459))) ^ (i >> (((int) jArr[1]) ^ 1230109954))) ^ (i >> 5);
                long j = jArr[2];
                i = (char) ((i >> (((int) j) ^ 1479300488)) | (((char) (i6 & (((int) j) ^ 1479300488))) << (((int) jArr[0]) ^ 1383870822)));
                char cCharAt = str.charAt(i4);
                int i10 = cCharAt + i;
                long j6 = f15063d[2];
                int i11 = (~cCharAt) | (~i);
                sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1479300488, i11, i10, (((int) j6) ^ 1479300488) + i10 + i11));
                long j7 = f15063d[2];
                int i12 = ~i4;
                i4 = i4 + (((int) j7) ^ 1479300488) + (((int) j7) ^ 1479300488) + ((~(((int) j7) ^ 1479300488)) | i12) + (((((int) j7) ^ 1479300488) + i4) - ((((((int) j7) ^ 1479300488) + i4) + (((int) j7) ^ 1479300488)) + ((~(((int) j7) ^ 1479300488)) | i12)));
            }
            return sb2.toString();
        }

        public static Object f(InterfaceC1526a<? super Long> interfaceC1526a) {
            return H.C(new C0051a(null), interfaceC1526a.getContext(), interfaceC1526a);
        }

        public static Object g(InterfaceC1526a<? super String> interfaceC1526a) {
            return H.C(new c(null), interfaceC1526a.getContext(), interfaceC1526a);
        }

        public static Object h(InterfaceC1526a<? super Callable<ArrayList<q>>> interfaceC1526a) {
            return H.C(new b(null), U.f603a, interfaceC1526a);
        }

        private static String j(String str) {
            try {
                Class<?> cls = Class.forName(d("\uef05矜뮽嶞꺙園ꯙ嗰⪀ᔄ誕씎\ue2d7\uf124磟배幇⽅៸讪䖒ꊔ儊⣈鐷䩊╤"));
                String strD = d("\uef03矗뮭");
                long[] jArr = f15063d;
                Class<?>[] clsArr = new Class[((int) jArr[2]) ^ 1479300488];
                clsArr[((int) jArr[3]) ^ 192744559] = String.class;
                Method method = cls.getMethod(strD, clsArr);
                long[] jArr2 = f15063d;
                Object[] objArr = new Object[((int) jArr2[2]) ^ 1479300488];
                objArr[((int) jArr2[3]) ^ 192744559] = str;
                Object objInvoke = method.invoke(null, objArr);
                j.e(objInvoke, d("\uef0a矇뮵嶀껖團ꯜ喰⪁ᔘ諏약\ue2cc\uf132碋밶幋⽦\u17fe该䖖ꊞ兘⣒鐱䩁┺ዥरӎ舽섈惠뀳\ud855\uec77瘩㭯鷭亵꜌폙\ue9b6\uf4c2逸絏뻯\udf27濉랴"));
                return (String) objInvoke;
            } catch (Exception unused) {
                return d("");
            }
        }

        public final String J(Context context) {
            j.g(context, d("\uef07矝뮷嶘꺓圃ꯉ"));
            try {
                Object systemService = context.getSystemService(d("\uef11矛뮴嶃꺒圞"));
                j.e(systemService, d("\uef0a矇뮵嶀껖團ꯜ喰⪁ᔘ諏약\ue2cc\uf132碋밶幋⽦\u17fe该䖖ꊞ兘⣒鐱䩁┺ዥरӎ舽섈惠뀳\ud855\uec77瘩㭥鷬亥꜒폟\ue9b1\uf488縉絚뻭\udf3e澉랆\udb80\uedb9皕㬙ᷛ躒윎揙놺墊Ⱃᙉ"));
                if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                    return d("\uef10矄");
                }
            } catch (Throwable th2) {
                com.shield.android.k.a.dL().a(th2);
            }
            return K(context) ? d("\uef10矓뮻嶀꺓圏") : d("\uef14矚뮶嶂꺓");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:343:0x05a3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:384:0x0040 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.HashMap<java.lang.String, java.lang.String> a(com.shield.android.internal.NativeUtils r19) {
            /*
                Method dump skipped, instruction units count: 1846
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.shield.android.c.a.C0050a.a(com.shield.android.internal.NativeUtils):java.util.HashMap");
        }

        public /* synthetic */ C0050a(byte b8) {
            this();
        }
    }

    static {
        long[] jArr = f15062d;
        String[] strArr = new String[((int) jArr[1]) ^ 497439839];
        strArr[((int) jArr[0]) ^ 745004815] = g("鏔鎋鎉鎔鎟鎎鎘鎏鏔鎔鎋鎞鎉鎚鎏鎔鎉鏔鎚鎋鎋");
        strArr[((int) f15062d[2]) ^ 186878192] = g("鏔鎋鎉鎔鎟鎎鎘鎏鏔鎚鎋鎋");
        strArr[((int) f15062d[3]) ^ 1028048754] = g("鏔鎋鎉鎔鎟鎎鎘鎏鏔鎋鎉鎒鎍鏖鎚鎋鎋");
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15062d[0]) ^ 745004815;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15062d;
            long j = jArr[4];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 723560165) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 723560165) + (((int) j6) ^ 186878192), i4 | (~(((int) j) ^ 723560165)), i6, (((int) j) ^ 723560165) + cCharAt + (((int) j6) ^ 186878192) + ((~(((int) j) ^ 723560165)) | i4)));
            long j7 = f15062d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 186878192) + (((int) j7) ^ 186878192) + ((~(((int) j7) ^ 186878192)) | i10) + (((((int) j7) ^ 186878192) + i) - ((((((int) j7) ^ 186878192) + i) + (((int) j7) ^ 186878192)) + ((~(((int) j7) ^ 186878192)) | i10)));
        }
        return sb2.toString();
    }
}
