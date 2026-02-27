package com.tencent.could.huiyansdk.helper;

import We.s;
import android.content.Context;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.i;
import com.tencent.youtu.liveness.YTCommonInterface;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFrameworkTool;
import df.o;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f15657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public YtSDKKitFramework.IYtSDKKitNetResponseParser f15658b;
    public boolean c = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15659a = new b();
    }

    public b() {
        System.loadLibrary("YTCommonLiveness");
    }

    public final void b(Context context) {
        i.a.f15743a.a(new io.flutter.plugins.firebase.core.a(11, this, context));
    }

    public final int a(YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext, YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        com.tencent.could.huiyansdk.common.a aVar = a.C0082a.f15626a;
        YtSDKKitFrameworkTool.setHuiYanVersion(aVar.c);
        e eVar = e.a.f15688a;
        eVar.a(1, "YouTuSdkHelper", "[huiyan version]: " + aVar.c);
        eVar.a(1, "YouTuSdkHelper", "[yt version]: " + YtSDKKitFramework.getInstance().version());
        if (aVar.f) {
            YtLogger.setLogLevel(-1000);
        } else if (this.c) {
            YtLogger.setLogLevel(4);
        } else {
            YtLogger.setLogLevel(0);
        }
        YtLogger.setLoggerListener(new o(18, (byte) 0));
        try {
            return YtSDKKitFramework.getInstance().init(ytSDKPlatformContext, YtSDKKitConfigHelper.getSDKConfig(ytSDKKitFrameworkWorkMode, this.f15657a), ytSDKKitFrameworkWorkMode, YtSDKKitConfigHelper.getPipleStateNames(ytSDKKitFrameworkWorkMode), iYtSDKKitFrameworkEventListener);
        } catch (Exception e) {
            e.a.f15688a.a(2, "YouTuSdkHelper", "startCheckAuth init error: " + e.getLocalizedMessage());
            return -1;
        }
    }

    public final YtSDKKitFramework.YtSDKKitFrameworkWorkMode b() {
        int iOrdinal = HuiYanBaseApi.a.f15622a.b().ordinal();
        if (iOrdinal == 0) {
            return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE;
        }
        if (iOrdinal != 1) {
            return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        }
        return YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE;
    }

    public void b(String str, boolean z4) throws JSONException {
        if (this.f15657a == null) {
            return;
        }
        String strA = a();
        if (this.f15657a.has(strA)) {
            JSONObject jSONObject = this.f15657a.getJSONObject(strA);
            jSONObject.put(str, z4);
            this.f15657a.put(strA, jSONObject);
        }
    }

    public void b(String str, String str2) throws JSONException {
        if (this.f15657a == null) {
            return;
        }
        String strA = a();
        if (this.f15657a.has(strA)) {
            JSONObject jSONObject = this.f15657a.getJSONObject(strA);
            jSONObject.put(str, str2);
            this.f15657a.put(strA, jSONObject);
        }
    }

    public final String a() {
        int iOrdinal = HuiYanBaseApi.a.f15622a.b().ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? "action+reflect_settings" : "silent_settings" : "action_settings";
    }

    public int a(String str, boolean z4) throws com.tencent.could.huiyansdk.exception.a {
        int iInitAuthByAssets;
        Context contextA = HuiYanBaseApi.a.f15622a.a();
        if (contextA == null) {
            com.tencent.could.huiyansdk.exception.a aVar = new com.tencent.could.huiyansdk.exception.a("init youtu with null context");
            aVar.f15627a = MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED;
            throw aVar;
        }
        if (z4) {
            iInitAuthByAssets = YTCommonInterface.initAuthByString(str, "");
        } else {
            iInitAuthByAssets = YTCommonInterface.initAuthByAssets(str, "");
        }
        if (iInitAuthByAssets == 0) {
            b(contextA);
            return iInitAuthByAssets;
        }
        throw new com.tencent.could.huiyansdk.exception.a(MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, s.f(iInitAuthByAssets, "init youtu init auth return code : "));
    }

    public static void a(String str, String str2) {
        e.a.f15688a.a(1, "YouTuSdkHelper", s.k("YT_TAG: ", str, ", Msg: ", str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            this.f15657a = new JSONObject(FileUtils.readAssetFile(context, "configs/TxyHyYtSDKSettings.json").toString()).getJSONObject("sdk_settings");
            Context contextA = HuiYanBaseApi.a.f15622a.a();
            if (contextA != null) {
                try {
                    b("video_path", contextA.getCacheDir().getCanonicalPath() + File.separator + "temp.mp4");
                } catch (IOException unused) {
                    e.a.f15688a.a(2, "YouTuSdkHelper", "failed to get cache path.");
                }
            }
            HuiYanBaseCallBack huiYanBaseCallBack = HuiYanBaseApi.a.f15622a.f15620b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.b();
            }
        } catch (JSONException unused2) {
            e.a.f15688a.a(2, "YouTuSdkHelper", "init youtu sdk config error!");
        }
    }

    public void a(String str, float f) throws JSONException {
        if (this.f15657a == null) {
            return;
        }
        String strA = a();
        if (this.f15657a.has(strA)) {
            JSONObject jSONObject = this.f15657a.getJSONObject(strA);
            jSONObject.put(str, f);
            this.f15657a.put(strA, jSONObject);
        }
    }

    public void a(String str, long j) throws JSONException {
        if (this.f15657a == null) {
            return;
        }
        String strA = a();
        if (this.f15657a.has(strA)) {
            JSONObject jSONObject = this.f15657a.getJSONObject(strA);
            jSONObject.put(str, j);
            this.f15657a.put(strA, jSONObject);
        }
    }

    public void a(String str, int[] iArr) throws JSONException {
        if (this.f15657a == null) {
            return;
        }
        String strA = a();
        if (!this.f15657a.has(strA) || iArr.length <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i : iArr) {
            jSONArray.put(i);
        }
        JSONObject jSONObject = this.f15657a.getJSONObject(strA);
        jSONObject.put(str, jSONArray);
        this.f15657a.put(strA, jSONObject);
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has("event_id") ? jSONObject.getString("event_id") : "";
            if ("".equals(string)) {
                e.a.f15688a.a(2, "YouTuSdkHelper", "get a empty action");
                return;
            }
            HuiYanBaseApi.a.f15622a.a(string, jSONObject.has("Done") ? jSONObject.getInt("Done") : 1, jSONObject.has("value") ? jSONObject.getLong("value") : 0L, jSONObject.has("info") ? jSONObject.getString("info") : "");
        } catch (NullPointerException e) {
            e = e;
            Throwable th2 = e;
            e.a.f15688a.a(2, "YouTuSdkHelper", "decodeOperateInfo error: " + th2.getLocalizedMessage());
            th2.printStackTrace();
        } catch (JSONException e7) {
            e = e7;
            Throwable th22 = e;
            e.a.f15688a.a(2, "YouTuSdkHelper", "decodeOperateInfo error: " + th22.getLocalizedMessage());
            th22.printStackTrace();
        }
    }
}
