package com.tencent.could.component.common.ai.eventreport.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import com.tencent.could.component.common.ai.eventreport.api.EventReportConfig;
import com.tencent.could.component.common.ai.eventreport.api.EventReporter;
import com.tencent.could.component.common.ai.eventreport.entry.DeviceInfoEntry;
import dOYHB6.yFtIp6.svM7M6;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceInfoUtil {
    public static String createDeviceInfo() {
        DeviceInfoEntry deviceInfoEntry = new DeviceInfoEntry();
        deviceInfoEntry.setSdkVersion(EventReporter.getInstance().getEventReportConfig().getSdkVersion());
        deviceInfoEntry.setDeviceModel(Base64.encodeToString(getDeviceModel().getBytes(), 2));
        deviceInfoEntry.setOsVersion("android-" + Base64.encodeToString(String.valueOf(Build.VERSION.SDK_INT).getBytes(), 2));
        Context context = EventReporter.getInstance().getContext();
        if (context == null) {
            try {
                return deviceInfoEntry.toJsonString();
            } catch (JSONException unused) {
                Log.e("DeviceInfoUtil", "changeDeviceInfoToJson json error");
                return "";
            }
        }
        deviceInfoEntry.setPackageName(context.getPackageName());
        deviceInfoEntry.setDeviceToken(getDeviceUuid(context));
        try {
            return deviceInfoEntry.toJsonString();
        } catch (JSONException unused2) {
            Log.e("DeviceInfoUtil", "changeDeviceInfoToJson json error");
            return "";
        }
    }

    public static String getDeviceModel() {
        String deviceModel = EventReporter.getInstance().getDeviceModel();
        if (!TextUtils.isEmpty(deviceModel)) {
            return deviceModel;
        }
        Context context = EventReporter.getInstance().getContext();
        String string = context == null ? EventReportConfig.STRING_INIT : svM7M6.getString(context.getSharedPreferences("txy_comoon_share_data", 0), "txy_device_model", EventReportConfig.STRING_INIT);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String str = Build.MODEL;
        EventReporter.getInstance().setDeviceModel(str);
        Context context2 = EventReporter.getInstance().getContext();
        if (context2 == null) {
            return str;
        }
        context2.getSharedPreferences("txy_comoon_share_data", 0).edit().putString("txy_device_model", str).apply();
        return str;
    }

    public static String getDeviceUuid(Context context) {
        String str;
        String deviceId = EventReporter.getInstance().getDeviceId();
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        if (context == null) {
            str = EventReportConfig.STRING_INIT;
        } else {
            String string = svM7M6.getString(context.getSharedPreferences("txy_comoon_share_data", 0), "deviceId", EventReportConfig.STRING_INIT);
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString().replace(Global.HYPHEN, "");
                context.getSharedPreferences("txy_comoon_share_data", 0).edit().putString("deviceId", string).apply();
            }
            str = string;
            if (TextUtils.isEmpty(str)) {
                str = EventReportConfig.STRING_INIT;
            }
        }
        EventReporter.getInstance().setDeviceId(str);
        return str;
    }
}
