package com.tencent.could.component.common.ai.eventreport.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.ai.eventreport.utils.DeviceInfoUtil;
import com.tencent.could.component.common.ai.eventreport.utils.a;
import com.tencent.could.component.common.ai.eventreport.utils.b;
import com.tencent.could.component.common.ai.eventreport.utils.c;
import com.tencent.could.component.common.ai.eventreport.utils.e;
import com.tencent.could.component.common.ai.net.HttpMethod;
import com.tencent.could.component.common.ai.net.TXCHttp;
import com.tencent.could.component.common.ai.utils.ThreadPoolUtil;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class EventReporter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f15543d = EventReportConfig.STRING_INIT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f15544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EventReportConfig f15545b;
    public String c = EventReportConfig.STRING_INIT;

    public static final class EventReporterHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EventReporter f15546a = new EventReporter();
    }

    public static EventReporter getInstance() {
        return EventReporterHolder.f15546a;
    }

    public void doReportDeviceInfo(String str) {
        String strA = e.a(getInstance().getEventReportConfig().getDeviceInfoUrl(), str);
        String strCreateDeviceInfo = DeviceInfoUtil.createDeviceInfo();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(strA).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(strCreateDeviceInfo).setRequestHeaders(null).createNetWorkParam(), new a());
    }

    public void doReportErrorInfo(String str, String str2, String str3) {
        ThreadPoolUtil.getInstance().addWork(new c(str, str2, str3));
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.f15544a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getDeviceId() {
        return this.c;
    }

    public String getDeviceModel() {
        return f15543d;
    }

    public EventReportConfig getEventReportConfig() {
        EventReportConfig eventReportConfig = this.f15545b;
        return eventReportConfig == null ? EventReportConfig.builder().create() : eventReportConfig;
    }

    public void initEventReporter(Context context, EventReportConfig eventReportConfig) {
        this.f15544a = new WeakReference<>(context);
        this.f15545b = eventReportConfig;
    }

    public void setDeviceId(String str) {
        this.c = str;
    }

    public void setDeviceModel(String str) {
        f15543d = str;
    }

    public void doReportDeviceInfo(String str, String str2) {
        String strA = e.a(getInstance().getEventReportConfig().getDeviceInfoUrl(), str);
        String strCreateDeviceInfo = DeviceInfoUtil.createDeviceInfo();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        String lowerCase = "";
        if (!TextUtils.isEmpty(strCreateDeviceInfo) && !TextUtils.isEmpty(str2)) {
            String strSubstring = str2.substring(1, Integer.parseInt(str2.substring(0, 1)) + 1);
            byte[] bytes = strCreateDeviceInfo.getBytes();
            byte[] bytes2 = strSubstring.getBytes();
            if (bytes == null) {
                bytes = bytes2;
            } else if (bytes2 != null) {
                byte[] bArr = new byte[bytes.length + bytes2.length];
                System.arraycopy(bytes, 0, bArr, 0, bytes.length);
                System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
                bytes = bArr;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                if (bArrDigest != null && bArrDigest.length > 0) {
                    for (byte b8 : bArrDigest) {
                        String hexString = Integer.toHexString(b8 & 255);
                        if (hexString.length() < 2) {
                            sb2.append(0);
                        }
                        sb2.append(hexString);
                    }
                    lowerCase = sb2.toString().toLowerCase();
                }
            } catch (NoSuchAlgorithmException e) {
                Log.e(CommonUtils.TAG, "md5 error: " + e.getLocalizedMessage());
            }
        }
        map.put("summary", lowerCase);
        TXCHttp.sendRequest(NetWorkParam.NetWorkParamBuilder.newBuilder().setUrl(strA).setGzip(true).setHttpMethod(HttpMethod.POST).setRequestData(strCreateDeviceInfo).setRequestHeaders(map).createNetWorkParam(), new b());
    }
}
