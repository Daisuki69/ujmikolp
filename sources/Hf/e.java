package hf;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import df.k;
import of.C1976a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    static {
        C1976a.d("\"\\");
        C1976a.d("\t ,=");
    }

    public static int a(int i, String str) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int b(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static long c(k kVar) {
        String strG = kVar.f.g(RtspHeaders.CONTENT_LENGTH);
        if (strG == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strG);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c6, code lost:
    
        r37 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cf, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d1, code lost:
    
        r14 = Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d6, code lost:
    
        if (r18 == (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01df, code lost:
    
        if (r18 > 9223372036854775L) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e1, code lost:
    
        r29 = r18 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e5, code lost:
    
        r29 = r11 + r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e9, code lost:
    
        if (r29 < r11) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ed, code lost:
    
        if (r29 <= okhttp3.internal.http.DatesKt.MAX_DATE) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f0, code lost:
    
        r14 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f3, code lost:
    
        r14 = 253402300799999L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f6, code lost:
    
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f8, code lost:
    
        r0 = r36.f16508d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fc, code lost:
    
        if (r6 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01fe, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0204, code lost:
    
        if (r0.equals(r6) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x020b, code lost:
    
        if (r0.endsWith(r6) == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021e, code lost:
    
        if (r0.charAt((r0.length() - r6.length()) - 1) != '.') goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x022a, code lost:
    
        if (ef.c.j.matcher(r0).matches() != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0234, code lost:
    
        if (r0.length() == r6.length()) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0236, code lost:
    
        r10 = mf.C1863a.h;
        r10.getClass();
        r11 = java.net.IDN.toUnicode(r6).split("\\.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024b, code lost:
    
        if (r10.f18407a.get() != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0255, code lost:
    
        if (r10.f18407a.compareAndSet(false, true) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0257, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x028c, code lost:
    
        r29 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x028e, code lost:
    
        r10.f18408b.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0294, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0393, code lost:
    
        r29 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026f A[PHI: r29
  0x026f: PHI (r29v11 java.util.List) = (r29v9 java.util.List), (r29v12 java.util.List) binds: [B:144:0x026d, B:138:0x025d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0365 A[LOOP:10: B:215:0x0362->B:217:0x0365, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0395 A[PHI: r29
  0x0395: PHI (r29v6 java.util.List) = (r29v5 java.util.List), (r29v8 java.util.List) binds: [B:227:0x0393, B:219:0x0383] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x029c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[PHI: r29
  0x00d1: PHI (r29v14 java.util.List) = (r29v8 java.util.List), (r29v15 java.util.List) binds: [B:219:0x0383, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(N4.d r35, df.z r36, df.x r37) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.e.d(N4.d, df.z, df.x):void");
    }

    public static boolean e(k kVar) {
        if (kVar.f16450a.f16440b.equals("HEAD")) {
            return false;
        }
        int i = kVar.c;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && c(kVar) == -1 && !"chunked".equalsIgnoreCase(kVar.b("Transfer-Encoding"))) ? false : true;
    }
}
