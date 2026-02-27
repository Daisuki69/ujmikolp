package com.tencent.youtu.sdkkitframework.common;

import We.s;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import defpackage.AbstractC1414e;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CommonUtils {
    public static final String ALGORITHM = "TC3-HMAC-SHA256";
    public static final String CT_JSON = "application/json;";
    public static final String HOST = "ocr.tencentcloudapi.com";
    public static final int MAX_TIMEOUT_MS = 30000;
    public static final int MIN_TIMEOUT_MS = 0;
    public static final String SERVICE = "ocr";
    public static final String TAG = "CommonUtils";
    public static final String UTF8 = "UTF-8";
    public static ConcurrentHashMap<String, BenchMarkTime> benchMarkMaps = new ConcurrentHashMap<>();
    public static final char[] hexCode = "0123456789ABCDEF".toCharArray();

    public static class BenchMarkTime {
        public long begin;
        public long total = 0;
        public long tick = 0;
        public long cur = 0;
        public long avg = 0;
        public long min = Long.MAX_VALUE;
        public long max = Long.MIN_VALUE;

        private void update(long j) {
            this.tick++;
            this.min = Math.min(j, this.min);
            this.max = Math.max(j, this.max);
            long j6 = this.total + j;
            this.total = j6;
            this.avg = j6 / this.tick;
        }

        public void begin() {
            this.begin = System.currentTimeMillis();
        }

        public void end() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.begin;
            this.cur = jCurrentTimeMillis;
            update(jCurrentTimeMillis);
        }

        public String getTime() {
            StringBuilder sb2 = new StringBuilder("avg: ");
            sb2.append(this.avg);
            sb2.append("ms min: ");
            sb2.append(this.min);
            sb2.append("ms max: ");
            sb2.append(this.max);
            sb2.append("ms cur: ");
            return s.h(this.cur, "ms", sb2);
        }
    }

    public static String Base64Encode(byte[] bArr) {
        return Base64.getEncoder().encodeToString(bArr);
    }

    public static byte[] HmacSha1(byte[] bArr, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(str.getBytes(), "HmacSHA1"));
        return mac.doFinal(bArr);
    }

    public static void benchMarkBegin(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            benchMarkMaps.put(str, new BenchMarkTime());
        }
        benchMarkMaps.get(str).begin();
    }

    public static long benchMarkEnd(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return 0L;
        }
        BenchMarkTime benchMarkTime = benchMarkMaps.get(str);
        benchMarkTime.end();
        YtLogger.d(TAG, "benchMarkEnd -- " + str + " : " + benchMarkTime.cur + "ms");
        return benchMarkTime.cur;
    }

    public static String byteToHex(byte b8) {
        return new String(new char[]{Character.forDigit((b8 >> 4) & 15, 16), Character.forDigit(b8 & 15, 16)});
    }

    public static String bytesToHexFun(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b8 : bArr) {
            sb2.append(String.format("%02x", Integer.valueOf(b8 & 255)));
        }
        return sb2.toString();
    }

    public static String encodeHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b8 : bArr) {
            stringBuffer.append(byteToHex(b8));
        }
        return stringBuffer.toString();
    }

    public static HashMap<String, String> getAuthorization(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str8 = simpleDateFormat.format(new Date(Long.parseLong(strValueOf + "000")));
        String strH = AbstractC1414e.h("POST\n/\n\ncontent-type:application/json\nhost:ocr.tencentcloudapi.com\n\ncontent-type;host\n", sha256Hex(str));
        String strI = s.i(str8, "/ocr/tc3_request");
        String strSha256Hex = sha256Hex(strH);
        StringBuilder sbX = s.x("TC3-HMAC-SHA256\n", strValueOf, Global.NEWLINE, strI, Global.NEWLINE);
        sbX.append(strSha256Hex);
        String strBytesToHexFun = bytesToHexFun(hmac256(hmac256(hmac256(hmac256(("TC3" + str3).getBytes("UTF-8"), str8), SERVICE), "tc3_request"), sbX.toString()));
        StringBuilder sbX2 = s.x("TC3-HMAC-SHA256 Credential=", str2, "/", strI, ", SignedHeaders=content-type;host, Signature=");
        sbX2.append(strBytesToHexFun);
        String string = sbX2.toString();
        HashMap<String, String> map = new HashMap<>();
        if (str4 != null && !str4.isEmpty()) {
            map.put("X-TC-Token", str4);
        }
        map.put(RtspHeaders.AUTHORIZATION, string);
        map.put(RtspHeaders.CONTENT_TYPE, CT_JSON);
        map.put("Host", HOST);
        map.put("X-TC-Action", str5);
        map.put("X-TC-Timestamp", strValueOf);
        map.put("X-TC-Version", str6);
        map.put("X-TC-Region", str7);
        return map;
    }

    public static String getBenchMarkTime(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return "";
        }
        StringBuilder sbW = s.w("[", str, "]");
        sbW.append(benchMarkMaps.get(str).getTime());
        return sbW.toString();
    }

    public static byte[] getSignature(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(str2.getBytes(), mac.getAlgorithm()));
        return mac.doFinal(str.getBytes());
    }

    public static String getYouTuAppSign(long j, String str, String str2, String str3) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String str4 = String.format("a=%d&b=%s&k=%s&t=%d&e=%d&r=%d", Long.valueOf(j), str3, str, Long.valueOf(jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis + 2592000), Integer.valueOf(Math.abs(new Random().nextInt())));
        byte[] bArrHmacSha1 = HmacSha1(str4, str2);
        byte[] bArr = new byte[bArrHmacSha1.length + str4.getBytes().length];
        System.arraycopy(bArrHmacSha1, 0, bArr, 0, bArrHmacSha1.length);
        System.arraycopy(str4.getBytes(), 0, bArr, bArrHmacSha1.length, str4.getBytes().length);
        return Base64Encode(bArr);
    }

    public static String getYouTuAppSignTC3(String str, String str2, String str3, String str4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str5 = simpleDateFormat.format(new Date(Long.valueOf(str4 + "000").longValue()));
        String strH = AbstractC1414e.h("POST\n/\n\ncontent-type:application/json\nhost:ocr.tencentcloudapi.com\n\ncontent-type;host\n", sha256Hex(str3));
        String strI = s.i(str5, "/ocr/tc3_request");
        String strSha256Hex = sha256Hex(strH);
        StringBuilder sbX = s.x("TC3-HMAC-SHA256\n", str4, Global.NEWLINE, strI, Global.NEWLINE);
        sbX.append(strSha256Hex);
        String lowerCase = bytesToHexFun(hmac256(hmac256(hmac256(hmac256(("TC3" + str2).getBytes("UTF-8"), str5), SERVICE), "tc3_request"), sbX.toString())).toLowerCase();
        StringBuilder sbX2 = s.x("TC3-HMAC-SHA256 Credential=", str, "/", strI, ", SignedHeaders=content-type;host, Signature=");
        sbX2.append(lowerCase);
        return sbX2.toString();
    }

    public static String getYoutuOpenAppSign(String str, String str2, String str3, String str4) throws NoSuchAlgorithmException, InvalidKeyException {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        int iAbs = Math.abs(new Random().nextInt());
        StringBuilder sbX = s.x("a=", str, "&k=", str2, "&e=");
        sbX.append(2592000 + jCurrentTimeMillis);
        c.z(sbX, "&t=", jCurrentTimeMillis, "&r=");
        sbX.append(iAbs);
        sbX.append("&u=");
        sbX.append(str4);
        sbX.append("&f=");
        String string = sbX.toString();
        byte[] signature = getSignature(string, str3);
        byte[] bArr = new byte[signature.length + string.getBytes().length];
        System.arraycopy(signature, 0, bArr, 0, signature.length);
        System.arraycopy(string.getBytes(), 0, bArr, signature.length, string.getBytes().length);
        return new String(android.util.Base64.encode(bArr, 2));
    }

    public static byte[] hmac256(byte[] bArr, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, mac.getAlgorithm()));
        return mac.doFinal(str.getBytes("UTF-8"));
    }

    public static String makeMessageJson(int i, String str, String str2) {
        try {
            new JSONObject(str2);
            return str2;
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("{ \"errorcode\":");
            sb2.append(i);
            sb2.append(",\"errormsg\": \"");
            sb2.append(str);
            sb2.append("\",\"extrainfo\":\"");
            return s.p(sb2, str2, "\"}");
        }
    }

    public static String printHexBinary(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b8 : bArr) {
            char[] cArr = hexCode;
            sb2.append(cArr[(b8 >> 4) & 15]);
            sb2.append(cArr[b8 & 15]);
        }
        return sb2.toString();
    }

    public static void reportException(String str, Exception exc) {
        YtSDKStats ytSDKStats = YtSDKStats.getInstance();
        StringBuilder sbV = s.v(str, " cause exception: ");
        sbV.append(exc.getLocalizedMessage());
        ytSDKStats.reportInfo(sbV.toString());
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(exc) { // from class: com.tencent.youtu.sdkkitframework.common.CommonUtils.1
            public final /* synthetic */ Exception val$e;

            {
                this.val$e = exc;
                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
                put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_PARAM_ERROR, StringCode.RST_FAILED, exc.getLocalizedMessage()));
            }
        });
    }

    public static String sha256Hex(String str) {
        return printHexBinary(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"))).toLowerCase();
    }

    public static byte[] HmacSha1(String str, String str2) {
        return HmacSha1(str.getBytes(), str2);
    }
}
