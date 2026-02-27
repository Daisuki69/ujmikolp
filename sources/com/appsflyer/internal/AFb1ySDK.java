package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1ySDK {
    private static int AFKeystoreWrapper = 0;
    private static int values = 1;
    private static char[] AFInAppEventType = {'a', 3178, 6215, 9296, 12377, 15441, 18477, 21543, 24596, 27661, 30741, 34036};
    private static long AFInAppEventParameterName = 189887543684172812L;

    public static String AFInAppEventParameterName(String str) {
        String strAFKeystoreWrapper;
        AFKeystoreWrapper = (values + 73) % 128;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            strAFKeystoreWrapper = AFKeystoreWrapper(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA-256");
            AFLogger.afErrorLog(sb2.toString(), e);
            strAFKeystoreWrapper = null;
        }
        values = (AFKeystoreWrapper + 95) % 128;
        return strAFKeystoreWrapper;
    }

    public static String AFInAppEventType(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String lowerCase = AFKeystoreWrapper(mac.doFinal(str.getBytes())).toLowerCase();
            int i = values + 9;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                return lowerCase;
            }
            throw null;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    private static String AFKeystoreWrapper(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i4 = AFKeystoreWrapper + 125;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                sb2.append(Integer.toString((bArr[i] & 21045) - 2697, 119).substring(1));
                i += 41;
            } else {
                sb2.append(Integer.toString((bArr[i] & 255) + 256, 16).substring(1));
                i++;
            }
        }
        return sb2.toString();
    }

    public static String valueOf(String str) {
        AFKeystoreWrapper = (values + 41) % 128;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            String strValueOf = valueOf(messageDigest.digest());
            values = (AFKeystoreWrapper + 29) % 128;
            return strValueOf;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA1");
            AFLogger.afErrorLog(sb2.toString(), e);
            return null;
        }
    }

    public static String values(String str) {
        int i = AFKeystoreWrapper + 83;
        values = i % 128;
        String strValueOf = null;
        try {
            if (i % 2 == 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.reset();
                messageDigest.update(str.getBytes("UTF-8"));
                strValueOf = valueOf(messageDigest.digest());
                int i4 = 4 / 0;
            } else {
                MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                messageDigest2.reset();
                messageDigest2.update(str.getBytes("UTF-8"));
                strValueOf = valueOf(messageDigest2.digest());
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to MD5");
            AFLogger.afErrorLog(sb2.toString(), e);
        }
        AFKeystoreWrapper = (values + 107) % 128;
        return strValueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4.isEmpty() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r1 = r5.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r2 >= r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r4.containsKey(r5[r2]) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        r5 = (java.lang.String) r4.remove("sig");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r0 = com.appsflyer.internal.AFb1bSDK.AFKeystoreWrapper();
        r1 = new java.lang.StringBuilder();
        r1.append(new org.json.JSONObject(r4));
        r1.append(r0);
        r4 = AFInAppEventType(r1.toString(), com.appsflyer.internal.AFb1zSDK.AFInAppEventParameterName(new java.lang.ref.WeakReference(r6.values.AFKeystoreWrapper))).equals(r5);
        com.appsflyer.internal.AFb1ySDK.AFKeystoreWrapper = (com.appsflyer.internal.AFb1ySDK.values + 11) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4.isEmpty() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean AFInAppEventParameterName(java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.String[] r5, com.appsflyer.internal.AFb1bSDK r6) throws java.lang.IllegalStateException {
        /*
            r0 = 0
            if (r4 == 0) goto L72
            int r1 = com.appsflyer.internal.AFb1ySDK.values
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.appsflyer.internal.AFb1ySDK.AFKeystoreWrapper = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L19
            boolean r1 = r4.isEmpty()
            r2 = 32
            int r2 = r2 / r0
            if (r1 == 0) goto L20
            goto L72
        L19:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L20
            goto L72
        L20:
            int r1 = r5.length
            r2 = r0
        L22:
            if (r2 >= r1) goto L30
            r3 = r5[r2]
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L2d
            return r0
        L2d:
            int r2 = r2 + 1
            goto L22
        L30:
            java.lang.String r5 = "sig"
            java.lang.Object r5 = r4.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L3c
            return r0
        L3c:
            java.lang.String r0 = com.appsflyer.internal.AFb1bSDK.AFKeystoreWrapper()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r4)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            com.appsflyer.internal.AFc1xSDK r6 = r6.values
            android.content.Context r6 = r6.AFKeystoreWrapper
            r0.<init>(r6)
            java.lang.String r6 = com.appsflyer.internal.AFb1zSDK.AFInAppEventParameterName(r0)
            java.lang.String r4 = AFInAppEventType(r4, r6)
            boolean r4 = r4.equals(r5)
            int r5 = com.appsflyer.internal.AFb1ySDK.values
            int r5 = r5 + 11
            int r5 = r5 % 128
            com.appsflyer.internal.AFb1ySDK.AFKeystoreWrapper = r5
            return r4
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1ySDK.AFInAppEventParameterName(java.util.Map, java.lang.String[], com.appsflyer.internal.AFb1bSDK):boolean");
    }

    private static String valueOf(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i4 = AFKeystoreWrapper + 119;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[0];
                objArr[1] = Byte.valueOf(bArr[i]);
                formatter.format("%02x", objArr);
                i += 36;
            } else {
                formatter.format("%02x", Byte.valueOf(bArr[i]));
                i++;
            }
            values = (AFKeystoreWrapper + 57) % 128;
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    public static String values(String... strArr) {
        values = (AFKeystoreWrapper + 109) % 128;
        String strJoin = TextUtils.join("\u2063", strArr);
        int i = values + 117;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            return strJoin;
        }
        throw null;
    }

    private static void values(char c, int i, int i4, Object[] objArr) {
        String str;
        synchronized (AFg1ySDK.values) {
            try {
                char[] cArr = new char[i4];
                AFg1ySDK.AFInAppEventParameterName = 0;
                while (true) {
                    int i6 = AFg1ySDK.AFInAppEventParameterName;
                    if (i6 < i4) {
                        cArr[i6] = (char) ((((long) AFInAppEventType[i + i6]) ^ (((long) i6) * AFInAppEventParameterName)) ^ ((long) c));
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

    public static String valueOf(Map<String, Object> map) {
        StringBuilder sbW = androidx.camera.core.impl.a.w((String) map.get("appsflyerKey"));
        Object[] objArr = new Object[1];
        values((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (-1) - TextUtils.lastIndexOf("", '0'), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        sbW.append(map.get(((String) objArr[0]).intern()));
        StringBuilder sbW2 = androidx.camera.core.impl.a.w(sbW.toString());
        sbW2.append(map.get("uid"));
        StringBuilder sbW3 = androidx.camera.core.impl.a.w(sbW2.toString());
        sbW3.append(map.get("installDate"));
        StringBuilder sbW4 = androidx.camera.core.impl.a.w(sbW3.toString());
        sbW4.append(map.get("counter"));
        StringBuilder sbW5 = androidx.camera.core.impl.a.w(sbW4.toString());
        sbW5.append(map.get("iaecounter"));
        String strValueOf = valueOf(values(sbW5.toString()));
        AFKeystoreWrapper = (values + 75) % 128;
        return strValueOf;
    }

    public static String AFInAppEventParameterName(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        Object[] objArr = new Object[1];
        values((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Process.myTid() >> 22, ((Process.getThreadPriority(0) + 20) >> 6) + 12, objArr);
        String str2 = (String) map.get(((String) objArr[0]).intern());
        String str3 = (String) map.get("uid");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 7));
        sb2.append(str3.substring(0, 7));
        sb2.append(str2.substring(str2.length() - 7));
        String strValueOf = valueOf(sb2.toString());
        int i = AFKeystoreWrapper + 29;
        values = i % 128;
        if (i % 2 == 0) {
            int i4 = 73 / 0;
        }
        return strValueOf;
    }
}
