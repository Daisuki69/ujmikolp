package T3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.google.zxing.ChecksumException;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends k {
    public static final char[] c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5771d;
    public static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f5772a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5773b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, 404, TypedValues.CycleType.TYPE_VISIBILITY, 394, SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f5771d = iArr;
        e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i, int i4) throws ChecksumException {
        int iIndexOf = 0;
        int i6 = 1;
        for (int i10 = i - 1; i10 >= 0; i10--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i10)) * i6;
            i6++;
            if (i6 > i4) {
                i6 = 1;
            }
        }
        if (charSequence.charAt(i) != c[iIndexOf % 47]) {
            throw ChecksumException.a();
        }
    }

    public static int h(int[] iArr) {
        int i = 0;
        for (int i4 : iArr) {
            i += i4;
        }
        int length = iArr.length;
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int iRound = Math.round((iArr[i10] * 9.0f) / i);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i10 & 1) == 0) {
                for (int i11 = 0; i11 < iRound; i11++) {
                    i6 = (i6 << 1) | 1;
                }
            } else {
                i6 <<= iRound;
            }
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r10 = T3.e.c[r11];
        r9.append(r10);
        r11 = r7.length;
        r12 = 0;
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r12 >= r11) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        r13 = r13 + r7[r12];
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r11 = r18.e(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r10 != '*') goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r9.deleteCharAt(r9.length() - 1);
        r10 = r7.length;
        r12 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r12 >= r10) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r13 = r13 + r7[r12];
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r11 == r8) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r18.d(r11) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r9.length() < 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        r1 = r9.length();
        g(r9, r1 - 2, 20);
        g(r9, r1 - 1, 15);
        r9.setLength(r9.length() - 2);
        r1 = r9.length();
        r7 = new java.lang.StringBuilder(r1);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r8 >= r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        r10 = r9.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        if (r10 < 'a') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r10 > 'd') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (r8 >= (r1 - 1)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        r8 = r8 + 1;
        r11 = r9.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        switch(r10) {
            case 97: goto L80;
            case 98: goto L56;
            case 99: goto L49;
            case 100: goto L43;
            default: goto L42;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
    
        if (r11 < 'A') goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        if (r11 > 'Z') goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        r11 = r11 + ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        r10 = (char) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:
    
        if (r11 < 'A') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
    
        if (r11 > 'O') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
    
        r11 = r11 - ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        if (r11 != 'Z') goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        r10 = ':';
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        if (r11 < 'A') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        if (r11 > 'E') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        r11 = r11 - '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
    
        if (r11 < 'F') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        if (r11 > 'J') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0108, code lost:
    
        r11 = r11 - 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010d, code lost:
    
        if (r11 < 'K') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
    
        if (r11 > 'O') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0111, code lost:
    
        r11 = r11 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (r11 < 'P') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
    
        if (r11 > 'S') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011c, code lost:
    
        r11 = r11 + '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0121, code lost:
    
        if (r11 < 'T') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0123, code lost:
    
        if (r11 > 'Z') goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0125, code lost:
    
        r10 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        if (r11 < 'A') goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012f, code lost:
    
        if (r11 > 'Z') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0131, code lost:
    
        r11 = r11 - '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0134, code lost:
    
        r7.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0141, code lost:
    
        throw com.google.zxing.FormatException.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0142, code lost:
    
        r7.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0145, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0148, code lost:
    
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0174, code lost:
    
        return new C3.j(r7.toString(), null, new C3.l[]{new C3.l((r5[1] + r5[0]) / 2.0f, r9), new C3.l((r13 / 2.0f) + r6, r9)}, C3.a.f691d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0177, code lost:
    
        throw com.google.zxing.NotFoundException.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017a, code lost:
    
        throw com.google.zxing.NotFoundException.c;
     */
    @Override // T3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C3.j b(int r17, K3.a r18, java.util.EnumMap r19) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.e.b(int, K3.a, java.util.EnumMap):C3.j");
    }
}
