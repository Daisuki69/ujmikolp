package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class AFa1xSDK {
    private static char[] AFInAppEventParameterName = null;
    private static int AFInAppEventType = 0;
    private static int AFKeystoreWrapper = 1;
    private static long valueOf;
    private static char values;

    public static class AFa1wSDK extends HashMap<String, Object> {
        private static char[] AFInAppEventParameterName = null;
        private static int AFKeystoreWrapper = 0;
        private static int afErrorLog = 1;
        private static int[] values;
        private final Context AFInAppEventType;
        private final Map<String, Object> valueOf;

        /* JADX INFO: renamed from: com.appsflyer.internal.AFa1xSDK$AFa1wSDK$AFa1wSDK, reason: collision with other inner class name */
        public static class C0022AFa1wSDK {
            private static int AFInAppEventParameterName = 0;
            private static int valueOf = 1;
            private static char[] AFKeystoreWrapper = {'0'};
            private static long AFInAppEventType = 5639895074563951386L;

            @NonNull
            private static byte[] AFInAppEventParameterName(@NonNull String str) throws Exception {
                int i = valueOf + 117;
                AFInAppEventParameterName = i % 128;
                int i4 = i % 2;
                byte[] bytes = str.getBytes();
                if (i4 != 0) {
                    int i6 = 70 / 0;
                }
                int i10 = AFInAppEventParameterName + 33;
                valueOf = i10 % 128;
                if (i10 % 2 != 0) {
                    return bytes;
                }
                throw null;
            }

            private static byte[] AFKeystoreWrapper(@NonNull byte[] bArr) throws Exception {
                int i = AFInAppEventParameterName + 121;
                valueOf = i % 128;
                for (int i4 = i % 2 == 0 ? 1 : 0; i4 < bArr.length; i4++) {
                    AFInAppEventParameterName = (valueOf + 89) % 128;
                    bArr[i4] = (byte) (bArr[i4] ^ ((i4 % 2) + 42));
                }
                return bArr;
            }

            @NonNull
            public static String valueOf(String str) throws Exception {
                int i = AFInAppEventParameterName + 115;
                valueOf = i % 128;
                int i4 = i % 2;
                byte[] bArrAFInAppEventParameterName = AFInAppEventParameterName(str);
                if (i4 == 0) {
                    valueOf(AFKeystoreWrapper(bArrAFInAppEventParameterName));
                    throw null;
                }
                String strValueOf = valueOf(AFKeystoreWrapper(bArrAFInAppEventParameterName));
                int i6 = valueOf + 125;
                AFInAppEventParameterName = i6 % 128;
                if (i6 % 2 == 0) {
                    return strValueOf;
                }
                throw null;
            }

            @NonNull
            private static String valueOf(@NonNull byte[] bArr) throws Exception {
                StringBuilder sb2 = new StringBuilder();
                for (byte b8 : bArr) {
                    valueOf = (AFInAppEventParameterName + 109) % 128;
                    String hexString = Integer.toHexString(b8);
                    if (hexString.length() == 1) {
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr = new Object[1];
                        valueOf((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777217, TextUtils.lastIndexOf("", '0', 0) + 1, objArr);
                        sb3.append(((String) objArr[0]).intern());
                        sb3.append(hexString);
                        hexString = sb3.toString();
                    }
                    sb2.append(hexString);
                }
                String string = sb2.toString();
                int i = valueOf + 59;
                AFInAppEventParameterName = i % 128;
                if (i % 2 != 0) {
                    int i4 = 81 / 0;
                }
                return string;
            }

            private static void valueOf(char c, int i, int i4, Object[] objArr) {
                String str;
                synchronized (AFg1ySDK.values) {
                    try {
                        char[] cArr = new char[i];
                        AFg1ySDK.AFInAppEventParameterName = 0;
                        while (true) {
                            int i6 = AFg1ySDK.AFInAppEventParameterName;
                            if (i6 < i) {
                                cArr[i6] = (char) ((((long) AFKeystoreWrapper[i4 + i6]) ^ (((long) i6) * AFInAppEventType)) ^ ((long) c));
                                AFg1ySDK.AFInAppEventParameterName = i6 + 1;
                            } else {
                                str = new String(cArr);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                objArr[0] = str;
            }
        }

        static {
            AFKeystoreWrapper();
            ViewConfiguration.getMinimumFlingVelocity();
            Process.getGidForName("");
            ExpandableListView.getPackedPositionGroup(0L);
            afErrorLog = (AFKeystoreWrapper + 23) % 128;
        }

        public AFa1wSDK(Map<String, Object> map, Context context) {
            this.valueOf = map;
            this.AFInAppEventType = context;
            put(AFInAppEventType(), valueOf());
        }

        private static StringBuilder AFInAppEventParameterName(@NonNull String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
            }
            Collections.sort(arrayList);
            int iIntValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb2 = new StringBuilder();
            for (int i4 = 0; i4 < iIntValue; i4++) {
                int i6 = AFKeystoreWrapper + 111;
                afErrorLog = i6 % 128;
                Integer numValueOf = null;
                for (int i10 = i6 % 2 == 0 ? 1 : 0; i10 < 3; i10++) {
                    int iCharAt = strArr[i10].charAt(i4);
                    if (numValueOf == null) {
                        int i11 = AFKeystoreWrapper + 29;
                        afErrorLog = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = 46 / 0;
                        }
                    } else {
                        iCharAt ^= numValueOf.intValue();
                    }
                    numValueOf = Integer.valueOf(iCharAt);
                }
                sb2.append(Integer.toHexString(numValueOf.intValue()));
            }
            return sb2;
        }

        @NonNull
        private String AFInAppEventType() {
            String str;
            try {
                String string = Integer.toString(Build.VERSION.SDK_INT);
                Map<String, Object> map = this.valueOf;
                Object[] objArr = new Object[1];
                AFKeystoreWrapper(true, new int[]{0, 12, 0, 10}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr);
                String string2 = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.valueOf;
                Object[] objArr2 = new Object[1];
                AFKeystoreWrapper(false, new int[]{12, 5, 119, 0}, "\u0001\u0000\u0001\u0001\u0000", objArr2);
                String string3 = map2.get(((String) objArr2[0]).intern()).toString();
                if (string3 == null) {
                    int i = AFKeystoreWrapper + 37;
                    afErrorLog = i % 128;
                    if (i % 2 == 0) {
                        Object[] objArr3 = new Object[1];
                        AFInAppEventParameterName(new int[]{-185009702, 814761491, 889804739, 159950017}, View.MeasureSpec.getMode(0) * 96, objArr3);
                        str = (String) objArr3[0];
                    } else {
                        Object[] objArr4 = new Object[1];
                        AFInAppEventParameterName(new int[]{-185009702, 814761491, 889804739, 159950017}, View.MeasureSpec.getMode(0) + 8, objArr4);
                        str = (String) objArr4[0];
                    }
                    string3 = str.intern();
                }
                StringBuilder sb2 = new StringBuilder(string2);
                sb2.reverse();
                StringBuilder sbAFInAppEventParameterName = AFInAppEventParameterName(string, string3, sb2.toString());
                int length = sbAFInAppEventParameterName.length();
                if (length > 4) {
                    sbAFInAppEventParameterName.delete(4, length);
                } else {
                    while (length < 4) {
                        int i4 = AFKeystoreWrapper + 61;
                        afErrorLog = i4 % 128;
                        if (i4 % 2 == 0) {
                            length += 70;
                            sbAFInAppEventParameterName.append('G');
                        } else {
                            length++;
                            sbAFInAppEventParameterName.append('1');
                        }
                    }
                }
                Object[] objArr5 = new Object[1];
                AFInAppEventParameterName(new int[]{479745625, -911572060}, 3 - View.combineMeasuredStates(0, 0), objArr5);
                sbAFInAppEventParameterName.insert(0, ((String) objArr5[0]).intern());
                return sbAFInAppEventParameterName.toString();
            } catch (Exception e) {
                Object[] objArr6 = new Object[1];
                AFInAppEventParameterName(new int[]{-313597705, -1223157848, 1703069443, 1086604617, -1802294387, 905836089, 501716371, 146042606, -122304965, 2047281632, -2094472739, 1410773666, 1535399413, -75392512, -1747142911, 463651728, -22032580, 554270556, -17389835, 711063768}, 40 - View.MeasureSpec.getMode(0), objArr6);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr7 = new Object[1];
                AFInAppEventParameterName(new int[]{-1031350329, -1926823177, -1117164457, 2068829882, 103737569, 785788842, -681035320, 1623474263, 415632383, 905193416, -993906031, -225962672, -1524547355, 950195748, -408652111, -1947227154, -548700269, -1640041852, -1879713941, 198059000, -1229741009, -650259523}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, objArr7);
                sb3.append(((String) objArr7[0]).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                Object[] objArr8 = new Object[1];
                AFInAppEventParameterName(new int[]{-720932365, -1658395331, -1537623768, -493898848}, Drawable.resolveOpacity(0, 0) + 7, objArr8);
                return ((String) objArr8[0]).intern();
            }
        }

        public static void AFKeystoreWrapper() {
            AFInAppEventParameterName = new char[]{'0', 'j', 's', 'l', 'i', 'k', 'n', 'i', 'b', 'c', 'h', 'n', 'l', 225, 224, 222, 224, '+', 'U', 'X', 'Y', 'U', 'U', 22, 'O', 'j', 'H', ',', '2', 'm', 'p', 'f', 'k', 'K', 'C', 'e', 'h', 'E', 'C', 'j', 'k', 'n', 'j', 'i', 'k', 'i', 'i', 'f', 'C', 'B', 'd', 'h', 'j', 'e', 'c', 'C', 'B', 'm', 'p', 'f', '[', 'D', 'D', 'e', 'l', 'f', 16, '-', 'T', 'n', 'l', 'n', 'r', 'j', 'd', 'm', 'n', 'B', 'D', 'n', 'n', 'p', 'K', 'B', 'm', 'p', 'f', 'k', 'K', 'C', 'e', 'h', 'E', 'C', 'j', 'k', 'n', 'j', 'i', 'k', 'i', 'i', 'f', 'C', 'B', 'd', 'h', 'j', 'e', 'c', 'M', 153, 153, 155, 155, 155, 130, 'j', 'l', 'j', 130, 134, 'm', 131, 132, 'i', 'h', 'l', 'y', 236, 233, 240, 241, 240, '<', 'O', 'T', 129, '8', 'K', '4', 'e', 'J', '2', 'Q', 'P', 'P', 'P', 'Q', 'P', 'P', 'P', 'K', 'i', 'g', 'j'};
            values = new int[]{-1388372888, 730060278, -700306791, 553267489, 547523278, 111398165, 2085722005, -1221695000, -1407410925, 1615167168, -935189461, -2132672286, 237688354, -495771612, 1864882095, -1584933433, 599543370, -1536263435};
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x01cf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.String valueOf() throws java.io.UnsupportedEncodingException {
            /*
                Method dump skipped, instruction units count: 852
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1xSDK.AFa1wSDK.valueOf():java.lang.String");
        }

        private static void AFKeystoreWrapper(boolean z4, int[] iArr, String str, Object[] objArr) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (AFf1dSDK.values) {
                try {
                    int i = iArr[0];
                    int i4 = iArr[1];
                    int i6 = iArr[2];
                    int i10 = iArr[3];
                    char[] cArr = new char[i4];
                    System.arraycopy(AFInAppEventParameterName, i, cArr, 0, i4);
                    if (bArr != null) {
                        char[] cArr2 = new char[i4];
                        AFf1dSDK.AFInAppEventParameterName = 0;
                        char c = 0;
                        while (true) {
                            int i11 = AFf1dSDK.AFInAppEventParameterName;
                            if (i11 >= i4) {
                                break;
                            }
                            if (bArr[i11] == 1) {
                                cArr2[i11] = (char) (((cArr[i11] << 1) + 1) - c);
                            } else {
                                cArr2[i11] = (char) ((cArr[i11] << 1) - c);
                            }
                            c = cArr2[i11];
                            AFf1dSDK.AFInAppEventParameterName = i11 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i10 > 0) {
                        char[] cArr3 = new char[i4];
                        System.arraycopy(cArr, 0, cArr3, 0, i4);
                        int i12 = i4 - i10;
                        System.arraycopy(cArr3, 0, cArr, i12, i10);
                        System.arraycopy(cArr3, i10, cArr, 0, i12);
                    }
                    if (z4) {
                        char[] cArr4 = new char[i4];
                        AFf1dSDK.AFInAppEventParameterName = 0;
                        while (true) {
                            int i13 = AFf1dSDK.AFInAppEventParameterName;
                            if (i13 >= i4) {
                                break;
                            }
                            cArr4[i13] = cArr[(i4 - i13) - 1];
                            AFf1dSDK.AFInAppEventParameterName = i13 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i6 > 0) {
                        AFf1dSDK.AFInAppEventParameterName = 0;
                        while (true) {
                            int i14 = AFf1dSDK.AFInAppEventParameterName;
                            if (i14 >= i4) {
                                break;
                            }
                            cArr[i14] = (char) (cArr[i14] - iArr[2]);
                            AFf1dSDK.AFInAppEventParameterName = i14 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[0] = str2;
        }

        private static void AFInAppEventParameterName(int[] iArr, int i, Object[] objArr) {
            String str;
            synchronized (AFg1xSDK.AFInAppEventParameterName) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) values.clone();
                    AFg1xSDK.AFInAppEventType = 0;
                    while (true) {
                        int i4 = AFg1xSDK.AFInAppEventType;
                        if (i4 < iArr.length) {
                            int i6 = iArr[i4];
                            char c = (char) (i6 >> 16);
                            cArr[0] = c;
                            char c10 = (char) i6;
                            cArr[1] = c10;
                            char c11 = (char) (iArr[i4 + 1] >> 16);
                            cArr[2] = c11;
                            char c12 = (char) iArr[i4 + 1];
                            cArr[3] = c12;
                            AFg1xSDK.valueOf = (c << 16) + c10;
                            AFg1xSDK.values = (c11 << 16) + c12;
                            AFg1xSDK.AFKeystoreWrapper(iArr2);
                            for (int i10 = 0; i10 < 16; i10++) {
                                int i11 = AFg1xSDK.valueOf ^ iArr2[i10];
                                AFg1xSDK.valueOf = i11;
                                int iValueOf = AFg1xSDK.valueOf(i11) ^ AFg1xSDK.values;
                                int i12 = AFg1xSDK.valueOf;
                                AFg1xSDK.valueOf = iValueOf;
                                AFg1xSDK.values = i12;
                            }
                            int i13 = AFg1xSDK.valueOf;
                            int i14 = AFg1xSDK.values;
                            AFg1xSDK.valueOf = i14;
                            AFg1xSDK.values = i13;
                            int i15 = i13 ^ iArr2[16];
                            AFg1xSDK.values = i15;
                            int i16 = i14 ^ iArr2[17];
                            AFg1xSDK.valueOf = i16;
                            cArr[0] = (char) (i16 >>> 16);
                            cArr[1] = (char) i16;
                            cArr[2] = (char) (i15 >>> 16);
                            cArr[3] = (char) i15;
                            AFg1xSDK.AFKeystoreWrapper(iArr2);
                            int i17 = AFg1xSDK.AFInAppEventType;
                            cArr2[i17 << 1] = cArr[0];
                            cArr2[(i17 << 1) + 1] = cArr[1];
                            cArr2[(i17 << 1) + 2] = cArr[2];
                            cArr2[(i17 << 1) + 3] = cArr[3];
                            AFg1xSDK.AFInAppEventType = i17 + 2;
                        } else {
                            str = new String(cArr2, 0, i);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[0] = str;
        }
    }

    static {
        AFKeystoreWrapper();
        TextUtils.indexOf("", "", 0, 0);
        KeyEvent.getMaxKeyCode();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getKeyRepeatTimeout();
        Color.green(0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        Drawable.resolveOpacity(0, 0);
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.getTrimmedLength("");
        KeyEvent.keyCodeFromString("");
        Color.alpha(0);
        AFKeystoreWrapper = (AFInAppEventType + 51) % 128;
    }

    private static String AFInAppEventParameterName(String str) {
        AFInAppEventType = (AFKeystoreWrapper + 109) % 128;
        String strValues = AFb1ySDK.values(AFb1ySDK.AFInAppEventParameterName(str));
        int i = AFKeystoreWrapper + 49;
        AFInAppEventType = i % 128;
        if (i % 2 == 0) {
            return strValues;
        }
        throw null;
    }

    private static void AFInAppEventType(StringBuilder sb2) {
        Object obj;
        Object obj2;
        String strIntern;
        String strIntern2;
        AFKeystoreWrapper("釟醾┱뮁䝒翿馥ᦄ켙뿰\uf7abᆅ臘圷漭褽ढ\udfec\ue743Ŗ녽ꞕ弦復㢵⹁훸炾ꂕ", View.resolveSize(0, 0) + 1, new Object[1]);
        if (!(!valueOf(((String) r3[0]).intern()))) {
            int i = AFInAppEventType + 51;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                Object[] objArr = new Object[1];
                AFKeystoreWrapper("圽圌闿纤鮍", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            AFKeystoreWrapper("圽圌闿纤鮍", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            AFKeystoreWrapper("㘌", (ViewConfiguration.getTapTimeout() >> 16) + 1, (byte) (97 - ExpandableListView.getPackedPositionChild(0L)), objArr3);
            obj = objArr3[0];
        }
        sb2.append(((String) obj).intern());
        Object[] objArr4 = new Object[1];
        AFKeystoreWrapper("ೳಒ↜腇䏿䔹\uf3fd蒨쮴햨쵭篝ᳳ厈喷\ue343鐘\ue5183欎Ⰽꌒ旈錱ꖄ⫢\uec2b", TextUtils.getTrimmedLength("") + 1, objArr4);
        if (valueOf(((String) objArr4[0]).intern())) {
            AFInAppEventType = (AFKeystoreWrapper + 95) % 128;
            Object[] objArr5 = new Object[1];
            AFKeystoreWrapper("圽圌闿纤鮍", -MotionEvent.axisFromString(""), objArr5);
            obj2 = objArr5[0];
        } else {
            Object[] objArr6 = new Object[1];
            AFKeystoreWrapper("㘌", -MotionEvent.axisFromString(""), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 97), objArr6);
            obj2 = objArr6[0];
        }
        sb2.append(((String) obj2).intern());
        Object[] objArr7 = new Object[1];
        AFKeystoreWrapper("\u0016\u0007\u000e\b\"\u0002\u0007\u0002\u001e\u0002\u0002\u0019\u0005\u0018\u0006\u001c\u0007\u0017\u0001\f", ExpandableListView.getPackedPositionGroup(0L) + 20, (byte) (TextUtils.indexOf("", "", 0, 0) + 51), objArr7);
        if (valueOf(((String) objArr7[0]).intern())) {
            AFKeystoreWrapper = (AFInAppEventType + 23) % 128;
            Object[] objArr8 = new Object[1];
            AFKeystoreWrapper("圽圌闿纤鮍", -TextUtils.lastIndexOf("", '0', 0, 0), objArr8);
            strIntern = ((String) objArr8[0]).intern();
            AFKeystoreWrapper = (AFInAppEventType + 69) % 128;
        } else {
            Object[] objArr9 = new Object[1];
            AFKeystoreWrapper("㘌", ((Process.getThreadPriority(0) + 20) >> 6) + 1, (byte) (99 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr9);
            strIntern = ((String) objArr9[0]).intern();
        }
        sb2.append(strIntern);
        Object[] objArr10 = new Object[1];
        AFKeystoreWrapper("賈異⺜ႊ䳿퓴啟煘쒴猊岠\udd7f\ue905岌쑼䖫懊푇䱕", ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr10);
        if (valueOf(((String) objArr10[0]).intern())) {
            Object[] objArr11 = new Object[1];
            AFKeystoreWrapper("圽圌闿纤鮍", View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr11);
            strIntern2 = ((String) objArr11[0]).intern();
        } else {
            Object[] objArr12 = new Object[1];
            AFKeystoreWrapper("㘌", View.MeasureSpec.getMode(0) + 1, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 99), objArr12);
            strIntern2 = ((String) objArr12[0]).intern();
            AFKeystoreWrapper = (AFInAppEventType + 39) % 128;
        }
        sb2.append(strIntern2);
    }

    public static void AFKeystoreWrapper() {
        values = (char) 6;
        AFInAppEventParameterName = new char[]{13801, 13748, 13800, 13794, 13811, 13738, 13791, 13751, 13822, 13814, 13812, 13774, 13765, 13809, 13807, 13805, 13760, 13810, 13820, 13819, 13728, 13815, 13788, 13802, 13817, 13821, 13787, 13806, 13778, 13795, 13769, 13783, 13813, 13823, 13785, 13754};
        valueOf = -9125393380829404659L;
    }

    @Nullable
    public static String valueOf(Context context, long j) {
        String strIntern;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("\u0016\u0007\u000e\b\"\u0002\u0007\u0002!\u0003\u000f\u0003\u001d\u0017\"\b\u0019\u0005\t#\u000f\u0003\u001d\u0017\"\b\u0019#\u0016\u0007\u0019\u001f \u0003", 33 - MotionEvent.axisFromString(""), (byte) (53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
        if (!valueOf(((String) objArr[0]).intern())) {
            Object[] objArr2 = new Object[1];
            AFKeystoreWrapper("㘌", KeyEvent.keyCodeFromString("") + 1, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 98), objArr2);
            strIntern = ((String) objArr2[0]).intern();
        } else {
            int i = AFInAppEventType + 123;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                Object[] objArr3 = new Object[1];
                AFKeystoreWrapper("圽圌闿纤鮍", (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), objArr3);
                strIntern = ((String) objArr3[0]).intern();
            } else {
                Object[] objArr4 = new Object[1];
                AFKeystoreWrapper("圽圌闿纤鮍", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
                strIntern = ((String) objArr4[0]).intern();
            }
            AFKeystoreWrapper = (AFInAppEventType + 73) % 128;
        }
        sb3.append(strIntern);
        sb2.append(AFKeystoreWrapper(context, sb3));
        try {
            long j6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            Object[] objArr5 = new Object[1];
            AFKeystoreWrapper("㙈㙈㙈㙈\r\u0001\u0001\r㙣㙣\u0010\u0018\u001b\u0016\u0012\u0003\u0004\f", 18 - (Process.myTid() >> 22), (byte) (101 - TextUtils.indexOf("", "", 0, 0)), objArr5);
            sb2.append(new SimpleDateFormat(((String) objArr5[0]).intern(), Locale.US).format(new Date(j6)));
            sb2.append(j);
            AFInAppEventType(sb4);
            return AFKeystoreWrapper(values(values(AFInAppEventParameterName(sb2.toString()), sb3.toString(), 17), sb4.toString(), 27), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr6 = new Object[1];
            AFKeystoreWrapper("\u001b\u001f\u001c!\u000f#\u0019\f \f\u0017!\u000b\u001f\u0007\u0016\u001b\u0003\"\u000b!\u001a\u001e\u0017\u0002\u0014\u000b\t", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, (byte) ((-16777121) - Color.rgb(0, 0, 0)), objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
            Object[] objArr7 = new Object[1];
            AFKeystoreWrapper("渓湱䌴\ue985⅘ⷽ臺\ue646ꤐꞸꗻ\u09d6繂ㄥ㴲鄄\uf6ee맿딊᥈价솏൛\ue12a윣䡀蒯梣彏큈᳦\uf081흍塽鐲砚", 1 - ExpandableListView.getPackedPositionGroup(0L), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static String values(String str, String str2, int i) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.setCharAt(i, values(str2).charAt(0));
        String string = sb2.toString();
        AFKeystoreWrapper = (AFInAppEventType + 45) % 128;
        return string;
    }

    private static String AFKeystoreWrapper(String str, Long l6) {
        Object obj;
        if (str != null && l6 != null) {
            AFKeystoreWrapper = (AFInAppEventType + 111) % 128;
            if (str.length() == 32) {
                StringBuilder sb2 = new StringBuilder(str);
                String string = l6.toString();
                int numericValue = 0;
                for (int i = 0; i < string.length(); i++) {
                    AFInAppEventType = (AFKeystoreWrapper + 21) % 128;
                    numericValue += Character.getNumericValue(string.charAt(i));
                }
                String hexString = Integer.toHexString(numericValue);
                sb2.replace(7, hexString.length() + 7, hexString);
                long numericValue2 = 0;
                for (int i4 = 0; i4 < sb2.length(); i4++) {
                    numericValue2 += (long) Character.getNumericValue(sb2.charAt(i4));
                }
                while (numericValue2 > 100) {
                    numericValue2 %= 100;
                }
                sb2.insert(23, (int) numericValue2);
                if (numericValue2 < 10) {
                    int i6 = AFKeystoreWrapper + 113;
                    AFInAppEventType = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        AFKeystoreWrapper("㘌", 1 >> KeyEvent.normalizeMetaState(0), (byte) ((TypedValue.complexToFraction(0, 0.0f, 1.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 1.0f) == 0.0f ? 0 : -1)) * 108), objArr);
                        obj = objArr[0];
                    } else {
                        Object[] objArr2 = new Object[1];
                        AFKeystoreWrapper("㘌", KeyEvent.normalizeMetaState(0) + 1, (byte) (98 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
                        obj = objArr2[0];
                    }
                    sb2.insert(23, ((String) obj).intern());
                }
                return sb2.toString();
            }
        }
        Object[] objArr3 = new Object[1];
        AFKeystoreWrapper("渓湱䌴\ue985⅘ⷽ臺\ue646ꤐꞸꗻ\u09d6繂ㄥ㴲鄄\uf6ee맿딊᥈价솏൛\ue12a윣䡀蒯梣彏큈᳦\uf081흍塽鐲砚", 1 - View.resolveSizeAndState(0, 0, 0), objArr3);
        return ((String) objArr3[0]).intern();
    }

    private static String values(String str) {
        AFKeystoreWrapper = (AFInAppEventType + 33) % 128;
        String string = Integer.toString(Integer.parseInt(str, 2), 16);
        AFKeystoreWrapper = (AFInAppEventType + 123) % 128;
        return string;
    }

    private static String values(Context context) {
        Properties properties = System.getProperties();
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("ӳҙ\ue14e谾茢䡒騽賩୦뱻쀟ሎᓯ鍖壌誐鰆ᮕ", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        if (properties.containsKey(((String) objArr[0]).intern())) {
            try {
                String path = context.getCacheDir().getPath();
                Object[] objArr2 = new Object[1];
                AFKeystoreWrapper("븽븒儝ን㍳훮\u0a43㙡묹Ⰷ", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                String strReplace = path.replace(((String) objArr2[0]).intern(), "");
                Object[] objArr3 = new Object[1];
                AFKeystoreWrapper("埫埅礵椺ᬒ괏\u173a\udfac鍞ㅁ╜鼴䞩୩", 1 - View.resolveSize(0, 0), objArr3);
                Matcher matcher = Pattern.compile(((String) objArr3[0]).intern()).matcher(strReplace);
                if (!matcher.find()) {
                    return null;
                }
                AFKeystoreWrapper = (AFInAppEventType + 55) % 128;
                String strGroup = matcher.group(1);
                AFKeystoreWrapper = (AFInAppEventType + 7) % 128;
                return strGroup;
            } catch (Exception e) {
                Object[] objArr4 = new Object[1];
                AFKeystoreWrapper("䒅䓃\uf4cdࡾ隡찍⛶쳔Ứ½䐐꺒咂蚘\udc9b㙗\udc6dไ咫븟搶癸\uecf1䙪\uedf1ﾽ攔쿾", -TextUtils.lastIndexOf("", '0', 0), objArr4);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr4[0]).intern(), e);
                AFb1rSDK level = AFb1wSDK.AFKeystoreWrapper().valueOf().getLevel();
                Object[] objArr5 = new Object[1];
                AFKeystoreWrapper("#\u0010\u001e\u001b\f\u0001\u000f\u0014\t\u0000\u001b\u001e\u0015\u001d\u0002\"㙤", (ViewConfiguration.getTouchSlop() >> 8) + 17, (byte) (112 - KeyEvent.normalizeMetaState(0)), objArr5);
                String strIntern = ((String) objArr5[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFKeystoreWrapper("\u0017\u0014\u0003\n \t!\u001d!\u001e\u001b\u001f\u001d!\u0019\u0012\u001d\f\"\u001e\u0012\u0014\u001d\u000f!\u0011\u0003\u001c\u0017\u0005\u0003\t\u001b\u001e\u0015\u001d\u0002\"\b\u0016㘑", ExpandableListView.getPackedPositionGroup(0L) + 41, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 87), objArr6);
                sb2.append(((String) objArr6[0]).intern());
                sb2.append(e);
                level.AFInAppEventParameterName(strIntern, sb2.toString());
            }
        }
        return null;
    }

    private static String AFKeystoreWrapper(String str) {
        AFKeystoreWrapper = (AFInAppEventType + 105) % 128;
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("캐캾㠰녞ꈸ", (Process.myPid() >> 22) + 1, objArr);
        if (!str.contains(((String) objArr[0]).intern())) {
            int i = (AFKeystoreWrapper + 75) % 128;
            AFInAppEventType = i;
            int i4 = i + 21;
            AFKeystoreWrapper = i4 % 128;
            if (i4 % 2 == 0) {
                int i6 = 64 / 0;
            }
            return str;
        }
        Object[] objArr2 = new Object[1];
        AFKeystoreWrapper("餉饕錠\uf0de\uf103苼", 1 - TextUtils.indexOf("", "", 0, 0), objArr2);
        String[] strArrSplit = str.split(((String) objArr2[0]).intern());
        int length = strArrSplit.length;
        StringBuilder sb2 = new StringBuilder();
        int i10 = length - 1;
        sb2.append(strArrSplit[i10]);
        Object[] objArr3 = new Object[1];
        AFKeystoreWrapper("캐캾㠰녞ꈸ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        for (int i11 = 1; i11 < i10; i11++) {
            AFKeystoreWrapper = (AFInAppEventType + 87) % 128;
            sb2.append(strArrSplit[i11]);
            Object[] objArr4 = new Object[1];
            AFKeystoreWrapper("캐캾㠰녞ꈸ", Color.blue(0) + 1, objArr4);
            sb2.append(((String) objArr4[0]).intern());
        }
        sb2.append(strArrSplit[0]);
        return sb2.toString();
    }

    private static boolean valueOf(String str) {
        int i = AFKeystoreWrapper + 63;
        AFInAppEventType = i % 128;
        try {
            if (i % 2 != 0) {
                Class.forName(str);
                return false;
            }
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            Object[] objArr = new Object[1];
            AFKeystoreWrapper("廻庒粝㡌ợﰕ뙌횮隯逇瑱㹼亾່\ueca0ꛧ옓蘔撜⺫繞︮\udcc2", 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return false;
        }
    }

    private static String AFKeystoreWrapper(Context context) {
        PackageInfo packageInfo;
        int i = AFInAppEventType + 83;
        AFKeystoreWrapper = i % 128;
        try {
            if (i % 2 == 0) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            }
            String str = packageInfo.packageName;
            AFInAppEventType = (AFKeystoreWrapper + 5) % 128;
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr = new Object[1];
            AFKeystoreWrapper("㏩㎹㺍吭峡達彌뮼풫礀᠆휝⏳䲗胂係ꬔ쑊ࣲ장\u135c밣낳㿗骃㗳㥇똋ʷ궧ꄊ⸱諡", KeyEvent.normalizeMetaState(0) + 1, objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return null;
        }
    }

    private static String AFKeystoreWrapper(Context context, StringBuilder sb2) {
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        String packageName = context.getPackageName();
        String strAFKeystoreWrapper = AFKeystoreWrapper(packageName);
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("圽圌闿纤鮍", Drawable.resolveOpacity(0, 0) + 1, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb3.append(strAFKeystoreWrapper);
        if (values(context) == null) {
            int i = AFInAppEventType + 81;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                Object[] objArr2 = new Object[1];
                AFKeystoreWrapper("㘌", 0 / (Process.myPid() << 51), (byte) (5 >> (ViewConfiguration.getMaximumDrawingCacheSize() * 123)), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                AFKeystoreWrapper("㘌", 1 - (Process.myPid() >> 22), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 98), objArr3);
                obj = objArr3[0];
            }
            sb2.append(((String) obj).intern());
            sb3.append(packageName);
        } else {
            Object[] objArr4 = new Object[1];
            AFKeystoreWrapper("圽圌闿纤鮍", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr4);
            sb2.append(((String) objArr4[0]).intern());
            sb3.append(packageName);
        }
        String strAFKeystoreWrapper2 = AFKeystoreWrapper(context);
        if (strAFKeystoreWrapper2 == null) {
            Object[] objArr5 = new Object[1];
            AFKeystoreWrapper("㘌", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (KeyEvent.getDeadChar(0, 0) + 98), objArr5);
            sb2.append(((String) objArr5[0]).intern());
            sb3.append(packageName);
            AFKeystoreWrapper = (AFInAppEventType + 115) % 128;
        } else {
            Object[] objArr6 = new Object[1];
            AFKeystoreWrapper("圽圌闿纤鮍", 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb3.append(strAFKeystoreWrapper2);
        }
        sb3.append(Boolean.TRUE.toString());
        return sb3.toString();
    }

    private static void AFKeystoreWrapper(String str, int i, byte b8, Object[] objArr) {
        int i4;
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1zSDK.AFLogger) {
            try {
                char[] cArr2 = AFInAppEventParameterName;
                char c = values;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i4 = i - 1;
                    cArr3[i4] = (char) (cArr[i4] - b8);
                } else {
                    i4 = i;
                }
                if (i4 > 1) {
                    AFg1zSDK.valueOf = 0;
                    while (true) {
                        int i6 = AFg1zSDK.valueOf;
                        if (i6 >= i4) {
                            break;
                        }
                        AFg1zSDK.values = cArr[i6];
                        AFg1zSDK.AFInAppEventType = cArr[AFg1zSDK.valueOf + 1];
                        if (AFg1zSDK.values == AFg1zSDK.AFInAppEventType) {
                            cArr3[AFg1zSDK.valueOf] = (char) (AFg1zSDK.values - b8);
                            cArr3[AFg1zSDK.valueOf + 1] = (char) (AFg1zSDK.AFInAppEventType - b8);
                        } else {
                            AFg1zSDK.AFInAppEventParameterName = AFg1zSDK.values / c;
                            AFg1zSDK.afRDLog = AFg1zSDK.values % c;
                            AFg1zSDK.AFKeystoreWrapper = AFg1zSDK.AFInAppEventType / c;
                            AFg1zSDK.afErrorLog = AFg1zSDK.AFInAppEventType % c;
                            if (AFg1zSDK.afRDLog == AFg1zSDK.afErrorLog) {
                                AFg1zSDK.AFInAppEventParameterName = ((AFg1zSDK.AFInAppEventParameterName + c) - 1) % c;
                                AFg1zSDK.AFKeystoreWrapper = ((AFg1zSDK.AFKeystoreWrapper + c) - 1) % c;
                                int i10 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afRDLog;
                                int i11 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afErrorLog;
                                int i12 = AFg1zSDK.valueOf;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            } else if (AFg1zSDK.AFInAppEventParameterName == AFg1zSDK.AFKeystoreWrapper) {
                                AFg1zSDK.afRDLog = ((AFg1zSDK.afRDLog + c) - 1) % c;
                                AFg1zSDK.afErrorLog = ((AFg1zSDK.afErrorLog + c) - 1) % c;
                                int i13 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afRDLog;
                                int i14 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afErrorLog;
                                int i15 = AFg1zSDK.valueOf;
                                cArr3[i15] = cArr2[i13];
                                cArr3[i15 + 1] = cArr2[i14];
                            } else {
                                int i16 = (AFg1zSDK.AFInAppEventParameterName * c) + AFg1zSDK.afErrorLog;
                                int i17 = (AFg1zSDK.AFKeystoreWrapper * c) + AFg1zSDK.afRDLog;
                                int i18 = AFg1zSDK.valueOf;
                                cArr3[i18] = cArr2[i16];
                                cArr3[i18 + 1] = cArr2[i17];
                            }
                        }
                        AFg1zSDK.valueOf += 2;
                    }
                }
                for (int i19 = 0; i19 < i; i19++) {
                    cArr3[i19] = (char) (cArr3[i19] ^ 13722);
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }

    private static void AFKeystoreWrapper(String str, int i, Object[] objArr) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFf1eSDK.valueOf) {
            try {
                char[] cArrValues = AFf1eSDK.values(valueOf, cArr, i);
                AFf1eSDK.AFInAppEventType = 4;
                while (true) {
                    int i4 = AFf1eSDK.AFInAppEventType;
                    if (i4 < cArrValues.length) {
                        AFf1eSDK.values = i4 - 4;
                        cArrValues[i4] = (char) (((long) (cArrValues[i4] ^ cArrValues[i4 % 4])) ^ (((long) r2) * valueOf));
                        AFf1eSDK.AFInAppEventType = i4 + 1;
                    } else {
                        str2 = new String(cArrValues, 4, cArrValues.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }
}
