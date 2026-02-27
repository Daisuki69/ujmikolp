package com.tencent.youtu.sdkkitframework.framework;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.RelativeLayout;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.youtu.sdkkitframework.common.BytesPoolHelper;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFrameworkTool;
import com.tencent.youtu.sdkkitframework.net.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class YtSDKKitFramework {
    public static final String TAG = "YtSDKKitFramework";
    public static YtSDKKitFramework instance;
    public IYtSDKKitFrameworkEventListener eventListener;
    public Rect previewRect = new Rect(0, 0, 0, 0);
    public Rect detectRect = new Rect(0, 0, 0, 0);
    public Rect detectRectInset = new Rect(10, 110, 10, 110);
    public int networkRequestTimeoutMS = 60000;
    public long defaultUpdateTimeoutMS = RtspMediaSource.DEFAULT_TIMEOUT_MS;
    public AtomicBoolean sdkKitFrameworkStarted = new AtomicBoolean(false);

    public interface IYTBaseFunctionListener {
        String base64Encode(byte[] bArr, int i);

        void detectActionDone(int i);

        HashMap<String, Integer> getFrameResult(Object obj);

        byte[] getVoiceData();
    }

    public interface IYTReflectListener {
        float onGetAppBrightness();

        void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f);

        void onReflectStart(long j);
    }

    public interface IYtSDKKitFrameworkEventListener {
        void onFrameworkEvent(HashMap<String, Object> map);

        void onNetworkRequestEvent(String str, String str2, HashMap<String, String> map, IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser);
    }

    public interface IYtSDKKitNetResponseParser {
        void onNetworkResponseEvent(HashMap<String, String> map, Exception exc);
    }

    public enum YtFrameworkFireEventType {
        YT_EVENT_TRIGGER_BEGIN_LIVENESS,
        YT_EVENT_TRIGGER_CANCEL_LIVENESS
    }

    public enum YtSDKKitFrameworkWorkMode {
        YT_FW_UNKNOWN(0),
        YT_FW_OCR_TYPE(1),
        YT_FW_SILENT_TYPE(2),
        YT_FW_ACTION_TYPE(3),
        YT_FW_REFLECT_TYPE(4),
        YT_FW_ACTREFLECT_TYPE(5),
        YT_FW_DETECTONLY_TYPE(6),
        YT_FW_OCR_VIID_TYPE(7);

        public static HashMap<Integer, YtSDKKitFrameworkWorkMode> map = new HashMap<>();
        public int value;

        static {
            for (YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode : values()) {
                map.put(Integer.valueOf(ytSDKKitFrameworkWorkMode.value), ytSDKKitFrameworkWorkMode);
            }
        }

        YtSDKKitFrameworkWorkMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static YtSDKKitFrameworkWorkMode valueOf(int i) {
            return map.get(Integer.valueOf(i)) == null ? YT_FW_UNKNOWN : map.get(Integer.valueOf(i));
        }
    }

    public static class YtSDKPlatformContext {
        public IYTBaseFunctionListener baseFunctionListener;
        public Context currentAppContext;
        public Camera currentCamera;
        public int currentCameraId;
        public int currentRotateState;
        public int imageToComapreType = 0;
        public Bitmap imageToCompare;
        public RelativeLayout reflectLayout;
        public IYTReflectListener reflectListener;
    }

    public static synchronized void clearInstance() {
        instance = null;
    }

    public static synchronized YtSDKKitFramework getInstance() {
        try {
            if (instance == null) {
                instance = new YtSDKKitFramework();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return instance;
    }

    private YtFSMBaseState parseStateFrom(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        YtFSMBaseState ytFSMBaseState = null;
        try {
            YtFSMBaseState ytFSMBaseState2 = (YtFSMBaseState) Class.forName(str).getConstructor(null).newInstance(null);
            try {
                ytFSMBaseState2.loadStateWith(str, jSONObject, ytSdkConfig);
                return ytFSMBaseState2;
            } catch (Throwable th2) {
                th = th2;
                ytFSMBaseState = ytFSMBaseState2;
                YtLogger.e(TAG, "Parse state " + str + "failed:", th);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(th));
                return ytFSMBaseState;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public int deInit() {
        if (!this.sdkKitFrameworkStarted.get()) {
            YtLogger.e(TAG, "YouTu SDK Kit framework is not started!!!", null);
            return -2048;
        }
        this.sdkKitFrameworkStarted.set(false);
        YtLogger.o(TAG, "sdk framework  deInit");
        synchronized (a.class) {
            try {
                a aVar = a.f16026b;
                if (aVar != null) {
                    Iterator<Map.Entry<Integer, Thread>> it = aVar.f16027a.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<Integer, Thread> next = it.next();
                        if (next.getValue() == null) {
                            aVar.f16027a.remove(next.getKey());
                            YtLogger.d(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "network remove " + next.getKey());
                            break;
                        }
                    }
                }
                a.f16026b = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        YtFSM.getInstance().stop();
        YtFSM.clearInstance();
        BytesPoolHelper.getInstance().recycleAll();
        YtSDKStats.getInstance().exitState();
        YtSDKStats.clearInstance();
        OperateInfoManager.getInstance().clear();
        return 0;
    }

    public void doPause() {
        YtLogger.o(TAG, "sdk framework  doPause");
        YtFSM.getInstance().handlePauseEvent();
    }

    public void doResume() {
        YtLogger.o(TAG, "sdk framework  doResume");
        YtFSM.getInstance().handleResumeEvent();
    }

    public void fireEvent(YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        YtFSM.getInstance().handleEvent(ytFrameworkFireEventType, obj);
    }

    public Rect getDetectRect() {
        return this.detectRect;
    }

    public int getNetworkRequestTimeoutMS() {
        return this.networkRequestTimeoutMS;
    }

    public YtSDKPlatformContext getPlatformContext() {
        return YtFSM.getInstance().getContext();
    }

    public Rect getPreviewRect() {
        return this.previewRect;
    }

    public int init(YtSDKPlatformContext ytSDKPlatformContext, JSONObject jSONObject, YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, ArrayList<String> arrayList, IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) throws Throwable {
        boolean z4;
        int i;
        int i4;
        int i6;
        String str = TAG;
        YtLogger.o(str, "SDK init sdk config JSON:" + jSONObject.toString());
        if (this.sdkKitFrameworkStarted.get()) {
            YtLogger.e(str, "YouTu SDK Kit framework is started!!!", null);
            return -2048;
        }
        this.sdkKitFrameworkStarted.set(true);
        if (ytSDKPlatformContext == null) {
            YtLogger.e(str, "Context cannot be null", null);
            return -1;
        }
        if (arrayList.isEmpty()) {
            YtLogger.e(str, "Pipeline state name cannot be empty", null);
            return -1;
        }
        if (iYtSDKKitFrameworkEventListener == null) {
            YtLogger.e(str, "Event listener cannot be null", null);
            return -1;
        }
        YtSdkConfig ytSdkConfig = new YtSdkConfig();
        ytSdkConfig.updateSDKConfig(ytSDKKitFrameworkWorkMode, jSONObject);
        if (jSONObject.has("resource_online")) {
            try {
                if (jSONObject.getBoolean("resource_online")) {
                    YtLogger.o(str, "model validity md5 start");
                    if (!jSONObject.has("resource_download_path")) {
                        YtLogger.e(str, "resource_download_path is null", null);
                        return -2;
                    }
                    YtSDKKitFrameworkTool.ModelValidityCode modelValidityCodeMd5ValidityByDir = new YtSDKKitFrameworkTool().md5ValidityByDir(jSONObject.getString("resource_download_path"));
                    if (modelValidityCodeMd5ValidityByDir != YtSDKKitFrameworkTool.ModelValidityCode.VALIDITY_OK) {
                        YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模型初始化失败");
                        iYtSDKKitFrameworkEventListener.onFrameworkEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.1
                            {
                                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
                                put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
                            }
                        });
                        YtLogger.e(str, "init module error:" + modelValidityCodeMd5ValidityByDir.name(), null);
                        return -2;
                    }
                }
                YtLogger.o(str, "model validity md5 done");
            } catch (JSONException e) {
                YtLogger.e(TAG, "parse json error:", e);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
                return -2;
            }
        }
        if (jSONObject.has("resource_online")) {
            try {
                z4 = jSONObject.getBoolean("resource_online");
            } catch (JSONException e7) {
                YtLogger.e(TAG, "json getBoolean 'resource_online' error", e7);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e7));
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (!z4) {
            FileUtils.loadLibrary("YTLiveness");
        }
        if (jSONObject.has("need_bugly_shared")) {
            try {
                if (jSONObject.getBoolean("need_bugly_shared")) {
                    YtSDKKitFrameworkTool.openBuglyShared(ytSDKPlatformContext.currentAppContext);
                }
                YtLogger.o(TAG, "update bugly shared data");
            } catch (JSONException e10) {
                YtLogger.e(TAG, "parse json error:", e10);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e10));
                return -3;
            }
        }
        if (jSONObject.has("screen_orientation")) {
            try {
                i = jSONObject.getInt("screen_orientation");
            } catch (JSONException e11) {
                YtLogger.e(TAG, "parse json error:", e11);
                i = 0;
            }
        } else {
            i = 0;
        }
        if (jSONObject.has("rear_camera_tag")) {
            try {
                i4 = jSONObject.getInt("rear_camera_tag");
            } catch (JSONException e12) {
                YtLogger.e(TAG, "parse json error:", e12);
                i4 = 0;
            }
        } else {
            i4 = 0;
        }
        YtFSM.getInstance().stop();
        YtFSM.getInstance().setEventListener(iYtSDKKitFrameworkEventListener);
        YtFSM.getInstance().setContext(ytSDKPlatformContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            YtFSM.getInstance().registerState(parseStateFrom(it.next(), jSONObject, ytSdkConfig));
        }
        if (jSONObject.has("thread_priority")) {
            try {
                i6 = jSONObject.getInt("thread_priority");
            } catch (JSONException e13) {
                YtLogger.e(TAG, "failed to get priority ", e13);
                OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e13));
                i6 = -20;
            }
        } else {
            i6 = -20;
        }
        YtFSM.getInstance().start(arrayList.get(0), ytSDKKitFrameworkWorkMode, i6, jSONObject.optLong("frame_update_timeout_ms", this.defaultUpdateTimeoutMS), i, i4);
        return 0;
    }

    public void reset() {
        YtLogger.o(TAG, "sdk framework  reset");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.2
            @Override // java.lang.Runnable
            public void run() {
                YtSDKStats.getInstance().reset();
                YtFSM.getInstance().reset();
            }
        });
    }

    public void setDetectRect(Rect rect) {
        if (rect == null) {
            throw new IllegalArgumentException("detectRect is null");
        }
        YtLogger.o(TAG, "sdk framework detectRect：" + rect.toString());
        this.detectRect = rect;
    }

    public void setNetworkRequestTimeoutMS(int i) {
        if (i < 0) {
            i = 0;
        }
        this.networkRequestTimeoutMS = i;
    }

    public void setPreviewRect(Rect rect) {
        if (rect == null) {
            throw new IllegalArgumentException("previewRect is null");
        }
        YtLogger.o(TAG, "sdk framework previewRect：" + rect.toString());
        this.previewRect = rect;
        int i = rect.left;
        Rect rect2 = this.detectRectInset;
        this.detectRect = new Rect(i + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        YtFSM.getInstance().updateSDKSetting(jSONObject);
    }

    public int updateWithFrameData(byte[] bArr, int i, int i4, int i6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis <= 946684800000L) {
            return ErrorCode.YT_SDK_TIMETICK_ERROR;
        }
        YtFSM.getInstance().update(bArr, i, i4, jCurrentTimeMillis);
        return 0;
    }

    public String version() {
        try {
            return YtSDKKitFrameworkTool.getFrameworkVersion();
        } catch (Exception e) {
            YtLogger.e(TAG, "so not load", e);
            OperateInfoManager.getInstance().setCatchErrorData(Log.getStackTraceString(e));
            return "";
        }
    }
}
