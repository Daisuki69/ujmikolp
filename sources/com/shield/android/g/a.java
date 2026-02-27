package com.shield.android.g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import cj.C1128n;
import cj.M;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import com.shield.android.internal.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import org.json.JSONObject;
import yj.C2536a;
import zj.C2576A;
import zj.C2581c;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15363d = {1067173001, 1944236273, 681683232, 536939587, 785224008, 1057931177, 1193154210, 733805946, 1231307649, 1967406903, 1725054970};
    private static final String[] jH;
    private boolean jA;
    private boolean jB;
    private boolean jC;
    private boolean jD;
    private boolean jE;
    private boolean jF;
    private final Map<String, String> jG;
    private final NativeUtils jn;
    private final Context jo;
    private boolean jp;
    private boolean jq;
    private boolean jr;
    private boolean js;
    private boolean jt;
    private boolean ju;
    private boolean jv;
    private boolean jw;
    private boolean jx;
    private boolean jy;
    private boolean jz;

    /* JADX INFO: renamed from: com.shield.android.g.a$a, reason: collision with other inner class name */
    public static final class C0065a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15364d = {1066715272, 2015168029, 818842119};

        private C0065a() {
        }

        public /* synthetic */ C0065a(byte b8) {
            this();
        }
    }

    static {
        new C0065a((((int) 1067173001) ^ 1067173001) == true ? (byte) 1 : (byte) 0);
        long[] jArr = f15363d;
        String[] strArr = new String[((int) jArr[6]) ^ 1193154209];
        strArr[((int) jArr[0]) ^ 1067173001] = d("鰮칀杷㏡馷첉");
        strArr[((int) f15363d[1]) ^ 1944236272] = d("鱬칒杲㏡馪쳍\ue65f獕㧽Ჩฎ蝀䏲⇣");
        strArr[((int) f15363d[2]) ^ 681683234] = d("鱬칒杲㏡馪쳍\ue65f獛㧳\u1cbcข蜜䏽↮\u10cbࡃЖ艱䅯⃠ဪ衒䑻∦酠죠");
        jH = strArr;
    }

    public a(NativeUtils nativeUtils, Context context) {
        j.g(nativeUtils, d("鰭칀杤㏡馲첇\ue624獌㧵Ტด"));
        j.g(context, d("鰠칎松㏼馡첚\ue605"));
        this.jn = nativeUtils;
        this.jo = context;
        this.jG = new LinkedHashMap();
    }

    private static String I(String str) {
        String strD;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(d("鰰칕東㏼駤쳏\ue612猘㦻ᳫฃ蜔䎹") + str).getInputStream()));
            try {
                String line = bufferedReader.readLine();
                if (line == null || (strD = C2576A.b0(line).toString()) == null) {
                    strD = d("");
                }
                bufferedReader.close();
                return strD;
            } finally {
            }
        } catch (Exception unused) {
            return d("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f1 A[Catch: Exception -> 0x022f, TryCatch #0 {Exception -> 0x022f, blocks: (B:4:0x0077, B:5:0x0097, B:7:0x009d, B:12:0x00c2, B:14:0x00d4, B:16:0x00e0, B:20:0x00f1, B:22:0x00f5, B:24:0x00fe, B:27:0x010c, B:29:0x0110, B:34:0x0123, B:36:0x0127, B:41:0x013a, B:43:0x013e, B:45:0x014d, B:46:0x0151, B:39:0x0131, B:32:0x011a, B:25:0x0103, B:18:0x00e8, B:10:0x00bb, B:49:0x0159, B:50:0x0178, B:52:0x017e, B:57:0x01a3, B:59:0x01b6, B:61:0x01bf, B:64:0x01cd, B:66:0x01d1, B:68:0x01da, B:71:0x01e8, B:73:0x01ec, B:78:0x01ff, B:80:0x0203, B:85:0x0216, B:87:0x021a, B:89:0x0229, B:83:0x020d, B:76:0x01f6, B:69:0x01df, B:62:0x01c4, B:55:0x019c), top: B:93:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103 A[Catch: Exception -> 0x022f, TryCatch #0 {Exception -> 0x022f, blocks: (B:4:0x0077, B:5:0x0097, B:7:0x009d, B:12:0x00c2, B:14:0x00d4, B:16:0x00e0, B:20:0x00f1, B:22:0x00f5, B:24:0x00fe, B:27:0x010c, B:29:0x0110, B:34:0x0123, B:36:0x0127, B:41:0x013a, B:43:0x013e, B:45:0x014d, B:46:0x0151, B:39:0x0131, B:32:0x011a, B:25:0x0103, B:18:0x00e8, B:10:0x00bb, B:49:0x0159, B:50:0x0178, B:52:0x017e, B:57:0x01a3, B:59:0x01b6, B:61:0x01bf, B:64:0x01cd, B:66:0x01d1, B:68:0x01da, B:71:0x01e8, B:73:0x01ec, B:78:0x01ff, B:80:0x0203, B:85:0x0216, B:87:0x021a, B:89:0x0229, B:83:0x020d, B:76:0x01f6, B:69:0x01df, B:62:0x01c4, B:55:0x019c), top: B:93:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a A[Catch: Exception -> 0x022f, TryCatch #0 {Exception -> 0x022f, blocks: (B:4:0x0077, B:5:0x0097, B:7:0x009d, B:12:0x00c2, B:14:0x00d4, B:16:0x00e0, B:20:0x00f1, B:22:0x00f5, B:24:0x00fe, B:27:0x010c, B:29:0x0110, B:34:0x0123, B:36:0x0127, B:41:0x013a, B:43:0x013e, B:45:0x014d, B:46:0x0151, B:39:0x0131, B:32:0x011a, B:25:0x0103, B:18:0x00e8, B:10:0x00bb, B:49:0x0159, B:50:0x0178, B:52:0x017e, B:57:0x01a3, B:59:0x01b6, B:61:0x01bf, B:64:0x01cd, B:66:0x01d1, B:68:0x01da, B:71:0x01e8, B:73:0x01ec, B:78:0x01ff, B:80:0x0203, B:85:0x0216, B:87:0x021a, B:89:0x0229, B:83:0x020d, B:76:0x01f6, B:69:0x01df, B:62:0x01c4, B:55:0x019c), top: B:93:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131 A[Catch: Exception -> 0x022f, TryCatch #0 {Exception -> 0x022f, blocks: (B:4:0x0077, B:5:0x0097, B:7:0x009d, B:12:0x00c2, B:14:0x00d4, B:16:0x00e0, B:20:0x00f1, B:22:0x00f5, B:24:0x00fe, B:27:0x010c, B:29:0x0110, B:34:0x0123, B:36:0x0127, B:41:0x013a, B:43:0x013e, B:45:0x014d, B:46:0x0151, B:39:0x0131, B:32:0x011a, B:25:0x0103, B:18:0x00e8, B:10:0x00bb, B:49:0x0159, B:50:0x0178, B:52:0x017e, B:57:0x01a3, B:59:0x01b6, B:61:0x01bf, B:64:0x01cd, B:66:0x01d1, B:68:0x01da, B:71:0x01e8, B:73:0x01ec, B:78:0x01ff, B:80:0x0203, B:85:0x0216, B:87:0x021a, B:89:0x0229, B:83:0x020d, B:76:0x01f6, B:69:0x01df, B:62:0x01c4, B:55:0x019c), top: B:93:0x0075 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean P(android.content.Context r17) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.g.a.P(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (zj.C2576A.z(r5, r8, ((int) r9[0]) ^ r0, ((int) r9[2]) ^ 681683234) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean cA() {
        /*
            r0 = 1067173001(0x3f9bc489, float:1.2169353)
            r1 = 0
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch: java.lang.Exception -> L75
            r2.<init>()     // Catch: java.lang.Exception -> L75
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()     // Catch: java.lang.Exception -> L75
            long[] r3 = com.shield.android.g.a.f15363d     // Catch: java.lang.Exception -> L75
            r4 = r3[r1]     // Catch: java.lang.Exception -> L75
            int r3 = (int) r4     // Catch: java.lang.Exception -> L75
            r3 = r3 ^ r0
            int r4 = r2.length     // Catch: java.lang.Exception -> L75
        L14:
            if (r3 >= r4) goto L75
            r5 = r2[r3]     // Catch: java.lang.Exception -> L75
            r6 = 1
            r7 = 1944236272(0x73e2b0f0, float:3.5920648E31)
            java.lang.String r5 = r5.getClassName()     // Catch: java.lang.Exception -> L63
            if (r5 == 0) goto L63
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L63
            java.lang.String r9 = r5.toLowerCase(r8)     // Catch: java.lang.Exception -> L63
            java.lang.String r10 = "鰻칑板㏻馡첆"
            java.lang.String r10 = d(r10)     // Catch: java.lang.Exception -> L63
            long[] r11 = com.shield.android.g.a.f15363d     // Catch: java.lang.Exception -> L63
            r12 = r11[r1]     // Catch: java.lang.Exception -> L63
            int r12 = (int) r12     // Catch: java.lang.Exception -> L63
            r12 = r12 ^ r0
            r13 = 2
            r14 = r11[r13]     // Catch: java.lang.Exception -> L63
            int r11 = (int) r14     // Catch: java.lang.Exception -> L63
            r14 = 681683234(0x28a1a922, float:1.794794E-14)
            r11 = r11 ^ r14
            boolean r9 = zj.C2576A.z(r9, r10, r12, r11)     // Catch: java.lang.Exception -> L63
            if (r9 != 0) goto L5c
            java.lang.String r5 = r5.toLowerCase(r8)     // Catch: java.lang.Exception -> L63
            java.lang.String r8 = "鰯칒杠㏠馫첍\ue61a獝㧮"
            java.lang.String r8 = d(r8)     // Catch: java.lang.Exception -> L63
            long[] r9 = com.shield.android.g.a.f15363d     // Catch: java.lang.Exception -> L63
            r10 = r9[r1]     // Catch: java.lang.Exception -> L63
            int r10 = (int) r10     // Catch: java.lang.Exception -> L63
            r10 = r10 ^ r0
            r11 = r9[r13]     // Catch: java.lang.Exception -> L63
            int r9 = (int) r11     // Catch: java.lang.Exception -> L63
            r9 = r9 ^ r14
            boolean r5 = zj.C2576A.z(r5, r8, r10, r9)     // Catch: java.lang.Exception -> L63
            if (r5 == 0) goto L63
        L5c:
            long[] r5 = com.shield.android.g.a.f15363d     // Catch: java.lang.Exception -> L63
            r0 = r5[r6]     // Catch: java.lang.Exception -> L63
            int r0 = (int) r0
            r0 = r0 ^ r7
            return r0
        L63:
            long[] r5 = com.shield.android.g.a.f15363d     // Catch: java.lang.Exception -> L75
            r8 = r5[r6]     // Catch: java.lang.Exception -> L75
            int r5 = (int) r8
            r5 = r5 ^ r7
            int r6 = r3 + r5
            int r7 = r6 + r5
            int r3 = ~r3
            int r5 = ~r5
            r3 = r3 | r5
            int r7 = r7 + r3
            int r6 = r6 - r7
            int r3 = r6 + r7
            goto L14
        L75:
            long[] r2 = com.shield.android.g.a.f15363d
            r1 = r2[r1]
            int r1 = (int) r1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.g.a.cA():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.Pair<java.lang.Boolean, java.lang.Boolean> cw() {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.g.a.cw():kotlin.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [long[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.BufferedReader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    private final boolean cx() throws IOException {
        ?? bufferedReader;
        int iMyPid = Process.myPid();
        Locale locale = Locale.ENGLISH;
        String str = d("鱬칑杢㏧馧쳍") + iMyPid + d("鱬칀杤㏼馶쳍\ue601獊㧹Ჸ");
        int i = 1067173001;
        int i4 = ((int) f15363d[0]) ^ 1067173001;
        String str2 = String.format(locale, str, Arrays.copyOf(new Object[i4], i4));
        com.shield.android.k.a.dL().b(d("鰷칓杩㎨馰첍\ue651獗㧬Ძฉ蜓䏂") + str2 + ((((int) f15363d[4]) ^ 785223957) == true ? (char) 1 : (char) 0), new Object[((int) f15363d[0]) ^ 1067173001]);
        String strD = d("鰹치杷㏧馰첇\ue64b獋㦬");
        File file = new File(str2);
        if (file.exists()) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C2581c.f21468b), 8192);
            try {
                Iterator it = new C2536a(new C1128n(bufferedReader, 2)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Unit unit = Unit.f18162a;
                        bufferedReader.close();
                        this.jG.put(d("鰊칳朣㏪"), i.n((boolean) (((int) f15363d[0]) ^ 1067173001)));
                        bufferedReader = f15363d[0];
                        break;
                    }
                    String str3 = (String) it.next();
                    if (str3.length() >= strD.length()) {
                        long[] jArr = f15363d;
                        if (C2576A.z(str3, strD, ((int) jArr[0]) ^ 1067173001, ((int) jArr[2]) ^ 681683234)) {
                            com.shield.android.k.a.dL().b(d("鰹치杷㏧馰첇\ue651獞㧳\u1cbbฉ蝗"), new Object[((int) f15363d[0]) ^ 1067173001]);
                            i = 1944236272;
                            this.jG.put(d("鰊칳朣㏪"), i.n((boolean) (((int) f15363d[1]) ^ 1944236272)));
                            bufferedReader.close();
                            bufferedReader = f15363d[1];
                            break;
                        }
                    }
                }
            } finally {
            }
        } else {
            com.shield.android.k.a.dL().b(d("鰅칀杹㏤馡첆\ue651獌㧳ᳮจ蝃䏼↢\u10c6ࠨ") + str2 + ((((int) f15363d[4]) ^ 785223957) == true ? (char) 1 : (char) 0), new Object[((int) f15363d[0]) ^ 1067173001]);
            this.jG.put(d("鰊칳朣㏪"), i.n((boolean) (((int) f15363d[0]) ^ 1067173001)));
            bufferedReader = f15363d[0];
        }
        return ((int) bufferedReader) ^ i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean cy() {
        try {
            Process processExec = Runtime.getRuntime().exec(d("鰴칉杹㏫馬쳂\ue61c獙㧻Ყด蝘"));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            char[] cArr = new char[4096];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i <= 0) {
                    break;
                }
                sb2.append(cArr, ((int) f15363d[0]) ^ 1067173001, i);
            }
            bufferedReader.close();
            int i4 = Build.VERSION.SDK_INT;
            long[] jArr = f15363d;
            if (i4 >= (((int) jArr[3]) ^ 536939609)) {
                long j = jArr[5] ^ 1057930845;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!processExec.waitFor(j, TimeUnit.MILLISECONDS)) {
                    processExec.destroyForcibly();
                }
            } else {
                processExec.waitFor();
            }
            return sb2.toString().length() > 0 ? ((int) f15363d[1]) ^ 1944236272 : 1067173001 ^ ((int) f15363d[0]);
        } catch (Exception unused) {
            return 1067173001 ^ ((int) f15363d[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean cz() {
        try {
            Process processExec = Runtime.getRuntime().exec(d("鰴칉杹㏫馬쳂\ue602獍"));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            char[] cArr = new char[4096];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i <= 0) {
                    break;
                }
                sb2.append(cArr, ((int) f15363d[0]) ^ 1067173001, i);
            }
            bufferedReader.close();
            int i4 = Build.VERSION.SDK_INT;
            long[] jArr = f15363d;
            if (i4 >= (((int) jArr[3]) ^ 536939609)) {
                long j = jArr[5] ^ 1057930845;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!processExec.waitFor(j, TimeUnit.MILLISECONDS)) {
                    processExec.destroyForcibly();
                }
            } else {
                processExec.waitFor();
            }
            return sb2.toString().length() > 0 ? ((int) f15363d[1]) ^ 1944236272 : 1067173001 ^ ((int) f15363d[0]);
        } catch (Exception unused) {
            return 1067173001 ^ ((int) f15363d[0]);
        }
    }

    public static String d(String str) {
        int i = ((int) f15363d[9]) ^ 1967392689;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15363d[0]) ^ 1067173001;
        while (i4 < str.length()) {
            long[] jArr = f15363d;
            int i6 = (((i >> (((int) jArr[0]) ^ 1067173001)) ^ (i >> (((int) jArr[2]) ^ 681683234))) ^ (i >> (((int) jArr[6]) ^ 1193154209))) ^ (i >> 5);
            long j = jArr[1];
            i = (char) ((i >> (((int) j) ^ 1944236272)) | (((char) (i6 & (((int) j) ^ 1944236272))) << (((int) jArr[10]) ^ 1725054965)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15363d[1];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1944236272, i11, i10, (((int) j6) ^ 1944236272) + i10 + i11));
            long j7 = f15363d[1];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1944236272) + (((int) j7) ^ 1944236272) + ((~(((int) j7) ^ 1944236272)) | i12) + (((((int) j7) ^ 1944236272) + i4) - ((((((int) j7) ^ 1944236272) + i4) + (((int) j7) ^ 1944236272)) + ((~(((int) j7) ^ 1944236272)) | i12)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean cu() {
        String strO = i.o(d("鰱칎朾㏪馫첍\ue605猖㧪Ძต蝚䏿↥ႃࠗћ艳䅡\u20f3ူ衕䑱≼酡"));
        com.shield.android.k.a.dL().b(d("鰡칎板㏼馈첍\ue610獜㧹\u1cbcิ蝇䏸↸ႃࡓ") + strO, new Object[((int) f15363d[0]) ^ 1067173001]);
        this.jG.put(d("鰒칻朠㏎"), strO);
        return (((z.o(d("鰬칓東㏦馣첇"), strO, ((int) f15363d[1]) ^ 1944236272) || z.o(d("鰱칄杴"), strO, ((int) f15363d[1]) ^ 1944236272)) ? ((int) f15363d[1]) ^ 1944236272 : ((int) f15363d[0]) ^ 1067173001) != 0 || this.ju || this.jv || this.jw || this.jy || this.jz || this.jB || this.jA || this.jD || this.jF) ? ((int) f15363d[1]) ^ 1944236272 : ((int) f15363d[0]) ^ 1067173001;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, String> cv() {
        String strN;
        try {
            this.jp = this.jn.isDetectedDevKeys();
            this.jG.put(d("鱱칦杆㏒"), i.n(this.jp));
            this.jq = this.jn.isDetectedTestKeys();
            this.jG.put(d("鰂칅杪㏞"), i.n(this.jq));
            this.jr = this.jn.isNotFoundReleaseKeys();
            this.jG.put(d("鰒칻杪㏎"), i.n(this.jr));
            this.js = this.jn.isFoundDangerousProps();
            this.jG.put(d("鱰칃杉㏾"), i.n(this.js));
            this.jt = this.jn.isPermissiveSelinux();
            this.jG.put(d("鰔칀杣㏞"), i.n(this.jt));
            this.ju = this.jn.isSuExists();
            this.jG.put(d("鰤칢杞㏉"), i.n(this.ju));
            this.jv = this.jn.isAccessedSuperuserApk();
            this.jG.put(d("鰧칆杙㏐"), i.n(this.jv));
            this.jw = this.jn.isFoundSuBinary();
            this.jG.put(d("鰈츑杷㏫"), i.n(this.jw));
            this.jx = this.jn.isFoundBusyboxBinary();
            this.jG.put(d("鰀칯杷㎽"), i.n(this.jx));
            this.jz = this.jn.isFoundResetprop();
            this.jG.put(d("鰹칷杽㏫"), i.n(this.jz));
            this.jA = this.jn.isFoundWrongPathPermission();
            this.jG.put(d("鰵칍朢㏋"), i.n(this.jA));
            this.jy = this.jn.isFoundXposed();
            this.jG.put(d("鰍칎杁㏌"), i.n(this.jy));
            this.jE = cx();
            Pair<Boolean, Boolean> pairCw = cw();
            this.jB = ((Boolean) pairCw.f18160a).booleanValue();
            this.jF = ((Boolean) pairCw.f18161b).booleanValue();
            this.jC = cz();
            this.jG.put(d("鰢칏杖㏟"), i.n(this.jC));
            if (!this.jy) {
                this.jy = cA();
                this.jG.put(d("鰍칎杁㏌"), i.n(this.jy));
            }
            this.jD = P(this.jo);
            this.jG.put(d("鰇칓杞㎿"), i.n(this.jD));
            Map<String, String> map = this.jG;
            String strD = d("鰒칻杺㏤");
            String strO = i.o(d("鰱칎朾㏪馫첍\ue605猖㧪Წช蝖䏭↭\u10c8ࠗќ艪䅧⃤ဦ衾䑣≼酥죶搤"));
            if ((strO.length() > 0 ? ((int) f15363d[1]) ^ 1944236272 : ((int) f15363d[0]) ^ 1067173001) == 0) {
                strO = null;
            }
            if (strO == null) {
                strO = d("鰳칒杤㏧馶첇\ue651猗㧯Ჷด蜜䏿↿\u10c9ࠃъ艨䅡\u20f5ဦ蠁䑠≻酰죭搳뉅\ud930泺똳\udb0e\uede2\uf6ad\ufb07緞뺸弎꿓垷⯁ᖘઔ蔎䋋ꄶ탋桻㑅驺䵮ꛠ匴⦍ᒾਇՑˢ脨샅恿끛\ud871\uec66\uf664筶㷨麭伅Ꞑ폨\ue9cc\uf4c6");
            }
            map.put(strD, strO);
            Map<String, String> map2 = this.jG;
            String strD2 = d("鰬칯杗㏬");
            try {
                this.jo.getPackageManager().getPackageInfo(d("鰮칄朾㏪馩첃\ue609猖㧽Ჾฆ蝇䏺↤"), ((int) f15363d[0]) ^ 1067173001);
                strN = i.n(((int) f15363d[1]) ^ 1944236272);
            } catch (PackageManager.NameNotFoundException unused) {
                strN = i.n(((int) f15363d[0]) ^ 1067173001);
            }
            map2.put(strD2, strN);
        } catch (Exception unused2) {
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.jn.getKeyValue(d("鰧칂")), this.jp);
            jSONObject.put(this.jn.getKeyValue(d("鰧칅")), this.jq);
            jSONObject.put(this.jn.getKeyValue(d("鰧칄")), this.jr);
            jSONObject.put(this.jn.getKeyValue(d("鰧칇")), this.js);
            jSONObject.put(this.jn.getKeyValue(d("鰧칆")), this.jt);
            jSONObject.put(this.jn.getKeyValue(d("鰧칉")), this.ju);
            jSONObject.put(this.jn.getKeyValue(d("鰧칈")), this.jv);
            jSONObject.put(this.jn.getKeyValue(d("鰧칋")), this.jw);
            jSONObject.put(this.jn.getKeyValue(d("鰧칊")), this.jx);
            jSONObject.put(this.jn.getKeyValue(d("鰧칍")), this.jy);
            jSONObject.put(this.jn.getKeyValue(d("鰧칌")), this.jz);
            jSONObject.put(this.jn.getKeyValue(d("鰧칏")), this.jA);
            jSONObject.put(this.jn.getKeyValue(d("鰧칎")), this.jB);
            jSONObject.put(this.jn.getKeyValue(d("鰧칑")), this.jC);
            jSONObject.put(this.jn.getKeyValue(d("鰧칐")), this.jE);
            jSONObject.put(this.jn.getKeyValue(d("鰥칓")), this.jF);
            jSONObject.put(this.jn.getKeyValue(d("鰢칓杴㏗馥")), this.jD);
            return new Pair<>(jSONObject.toString(), new JSONObject(M.m(this.jG)).toString());
        } catch (Exception unused3) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : this.jG.entrySet()) {
                sb2.append(entry.getKey());
                sb2.append(d("鱹"));
                sb2.append(entry.getValue());
                sb2.append(d("鱠츂"));
            }
            return new Pair<>(d(""), sb2.toString());
        }
    }
}
