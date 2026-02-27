package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Rect;
import androidx.webkit.ProxyConfig;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.TimeoutCounter;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SilentLivenessState extends YtFSMBaseState {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f15972X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15977b;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15980d;
    public int e = 0;
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15984g = -1;
    public boolean h = false;
    public String i = "";
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TimeoutCounter f15989k = new TimeoutCounter("Liveness timeout counter");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TimeoutCounter f15990l = new TimeoutCounter("Predetect timeout counter");
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15991n = 0.22f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15992o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15993p = 30;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15994q = 25;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15995r = 25;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f15996s = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f15997t = 0.5f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15998u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15999v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16000w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16001x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16002y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16003z = 5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f15950A = -1.0E10f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f15951B = 1.0E10f;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f15952C = -1.0E10f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f15953D = 1.0E10f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f15954E = -1.0E10f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f15955F = true;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f15956G = 0.7f;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f15957H = -1.0E10f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f15958I = 0.05f;
    public float J = 0.05f;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f15959K = 0.05f;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f15960L = 0.9f;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15961M = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Rect f15962N = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f15963O = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f15964P = false;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f15965Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f15966R = 5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f15967S = -1.0E10f;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public YTFaceTracker f15968T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f15969U = -1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f15970V = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f15971W = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f15973Y = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f15974Z = "";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15976a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f15978b0 = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f15979c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f15981d0 = "yt_model_config.ini";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f15982e0 = 50.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f15983f0 = 50.0f;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f15985g0 = 50.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f15986h0 = false;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f15987i0 = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f15988j0 = 0;

    public class a extends HashMap<String, Object> {
        public a(SilentLivenessState silentLivenessState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    public final void a(String str, int i, String str2) {
        HashMap<String, Object> mapP = androidx.media3.datasource.cache.c.p(StateEvent.Name.PROCESS_RESULT, str);
        mapP.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(i));
        mapP.put("message", str2);
        YtFSM.getInstance().sendFSMEvent(mapP);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.o("SilentLivenessState", makeStateInfo("SilentLivenessState", 1));
        this.stateData.put("detect_instance", this.f15968T);
        if (this.f15979c0) {
            return;
        }
        if (this.m) {
            this.f15990l.start();
        } else {
            this.f15989k.start();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.m) {
            if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS) {
                this.e = 0;
                this.f16000w = true;
                if (this.f15979c0) {
                    return;
                }
                this.f15989k.reset();
                return;
            }
            if (ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
                this.e = 0;
                this.f16000w = false;
                if (this.f15979c0) {
                    return;
                }
                this.f15989k.cancel();
                this.f15990l.reset();
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleStateAction(String str, Object obj) {
        super.handleStateAction(str, null);
        if (this.f15979c0) {
            return;
        }
        if (!str.equals("reset_timeout")) {
            if (str.equals("reset_manual_trigger")) {
                this.f16000w = false;
                this.f15989k.cancel();
                return;
            }
            return;
        }
        YtLogger.d("SilentLivenessState", "predetect status:" + this.f15990l.isRunning());
        if (this.f15990l.isRunning()) {
            return;
        }
        this.f15989k.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        this.f15977b = YtSDKKitFramework.getInstance().getPreviewRect().width();
        int iHeight = YtSDKKitFramework.getInstance().getPreviewRect().height();
        this.f15975a = iHeight;
        int i = this.f15977b;
        if (i == 0 || iHeight == 0) {
            throw new IllegalArgumentException("Preview size is invalid!");
        }
        o.f16018a = i;
        o.f16019b = iHeight;
        this.f15980d = 1.0f;
        this.c = 1.0f;
        YtLogger.o("SilentLivenessState", "Camera size:" + this.f15977b + ProxyConfig.MATCH_ALL_SCHEMES + this.f15975a + "|mask size:" + this.f15980d + ProxyConfig.MATCH_ALL_SCHEMES + this.c);
        try {
            if (this.h) {
                YtLogger.i("SilentLivenessState", "init from filesystem use local path : " + this.i);
                this.f15968T = new YTFaceTracker(this.i, this.f15981d0);
            } else {
                YtLogger.i("SilentLivenessState", "init from asset");
                this.f15968T = new YTFaceTracker(YtFSM.getInstance().getContext().currentAppContext.getAssets(), "models/face-tracker-v003", this.f15981d0);
            }
            YTFaceTracker.Param param = this.f15968T.getParam();
            YtLogger.i("SilentLivenessState", "big face mode" + this.f16001x);
            param.biggerFaceMode = this.f16001x ? 1 : 0;
            param.minFaceSize = Math.max(Math.min(this.f15977b, this.f15975a) / 5, 40);
            param.detInterval = this.f16002y;
            this.f15968T.setParam(param);
            YtLogger.o("SilentLivenessState", "Detect version:" + YTFaceTracker.getVersion());
        } catch (Throwable th2) {
            a(StateEvent.ProcessResult.FAILED, ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
            th2.printStackTrace();
        }
        reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        int i;
        int i4;
        super.moveToNextState();
        boolean z4 = this.m;
        if (!z4 || ((!this.f15964P || (i4 = this.f) == 0 || i4 == 9) && !((this.f15978b0 && this.f == 7) || (i = this.f) == 8 || i == 1))) {
            this.f15965Q = 0;
        } else {
            int i6 = this.f15965Q + 1;
            this.f15965Q = i6;
            if (i6 > this.f15966R) {
                String strMakeMessageJson = CommonUtils.makeMessageJson(4194304, o.a(this.f), "action check failed");
                HashMap<String, Object> mapQ = androidx.media3.datasource.cache.c.q(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED, StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                mapQ.put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                mapQ.put(StateEvent.Name.ERROR_CODE, 4194304);
                mapQ.put(StateEvent.Name.ERROR_REASON_CODE, 4194304);
                mapQ.put("message", strMakeMessageJson);
                YtFSM.getInstance().sendFSMEvent(mapQ);
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE));
                return;
            }
        }
        if (!this.f15979c0 && z4 && this.f15990l.checkTimeout()) {
            YtLogger.d("SilentLivenessState", "predectcountdowner.checkTimeout(): " + this.f15990l.checkTimeout());
            this.f15990l.cancel();
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (!this.f15979c0 && this.f15989k.checkTimeout()) {
            this.f15989k.cancel();
            YtLogger.d("SilentLivenessState", "liveness timeout");
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_TIMEOUT, "yt_verify_step_timeout");
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.TIMEOUT_STATE));
            return;
        }
        if (this.m || this.j || this.e > this.f16003z) {
            this.j = true;
            if (!this.f15979c0) {
                this.f15990l.cancel();
            }
            int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE));
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        this.f = -1;
        this.e = 0;
        this.f15998u = 0;
        this.f15976a0 = 0;
        this.f16000w = false;
        this.f15999v = 0;
        this.f15950A = -1.0E10f;
        this.f15953D = 1.0E10f;
        this.f15951B = 1.0E10f;
        this.f15952C = -1.0E10f;
        this.f15957H = -1.0E10f;
        this.j = false;
        this.f15965Q = 0;
        this.f15972X = 0;
        this.f15954E = -1.0E10f;
        this.f15961M = 0;
        this.f15969U = -1;
        this.f15962N = null;
        this.f15986h0 = false;
        this.f15988j0 = 0;
        if (!this.f15979c0) {
            this.f15989k.cancel();
            this.f15990l.cancel();
            if (this.m) {
                this.f15990l.reset();
            } else {
                this.f15989k.reset();
            }
        }
        super.reset();
        this.stateData.put("detect_instance", this.f15968T);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        YTFaceTracker yTFaceTracker = this.f15968T;
        if (yTFaceTracker != null) {
            yTFaceTracker.destroy();
        }
        this.f15968T = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0629 A[LOOP:1: B:240:0x0624->B:242:0x0629, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x062f A[EDGE_INSN: B:295:0x062f->B:243:0x062f BREAK  A[LOOP:1: B:240:0x0624->B:242:0x0629], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0261  */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(com.tencent.youtu.sdkkitframework.common.YTImageData r22, long r23) {
        /*
            Method dump skipped, instruction units count: 2015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState.update(com.tencent.youtu.sdkkitframework.common.YTImageData, long):void");
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        try {
            if (jSONObject.has("check_eye_open")) {
                this.f15992o = jSONObject.getBoolean("check_eye_open");
            }
            if (jSONObject.has("open_eye_threshold")) {
                this.f15991n = (float) jSONObject.getDouble("open_eye_threshold");
            }
            if (jSONObject.has("pitch_threshold")) {
                this.f15993p = jSONObject.getInt("pitch_threshold");
            }
            if (jSONObject.has("yaw_threshold")) {
                this.f15994q = jSONObject.getInt("yaw_threshold");
            }
            if (jSONObject.has("roll_threshold")) {
                this.f15995r = jSONObject.getInt("roll_threshold");
            }
            if (jSONObject.has("smallface_ratio_threshold")) {
                this.f15997t = (float) jSONObject.getDouble("smallface_ratio_threshold");
            }
            if (jSONObject.has("bigface_ratio_threshold")) {
                this.f15996s = (float) jSONObject.getDouble("bigface_ratio_threshold");
            }
            if (jSONObject.has("blur_detect_threshold")) {
                jSONObject.getDouble("blur_detect_threshold");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.f16001x = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("detect_interval")) {
                this.f16002y = jSONObject.getInt("detect_interval");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f16003z = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                YtSDKKitFramework.getInstance().setNetworkRequestTimeoutMS(jSONObject.getInt("net_request_timeout_ms"));
            }
            if (jSONObject.has("force_pose_check")) {
                this.f15964P = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("novalid_face_count")) {
                this.f15966R = jSONObject.getInt("novalid_face_count");
            }
            if (jSONObject.has("in_rect_ratio_threshold")) {
                this.f15956G = (float) jSONObject.getDouble("in_rect_ratio_threshold");
            }
            if (jSONObject.has("need_check_shelter")) {
                this.f15963O = jSONObject.getBoolean("need_check_shelter");
            }
            if (jSONObject.has("stable_roi_threshold")) {
                this.f15960L = (float) jSONObject.getDouble("stable_roi_threshold");
            }
            if (jSONObject.has("need_close_timeout")) {
                this.f15979c0 = jSONObject.getBoolean("need_close_timeout");
            }
            if (jSONObject.has("resource_online")) {
                this.h = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.i = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("timeout_countdown_ms")) {
                this.f15989k.init(Math.max(0, Math.min(30000, jSONObject.getInt("timeout_countdown_ms"))), true);
            }
            if (jSONObject.has("predetect_countdown_ms")) {
                this.f15990l.init(jSONObject.getInt("predetect_countdown_ms"), true);
            } else {
                this.f15990l.init(25000L, true);
            }
            if (jSONObject.has("same_tips_filter")) {
                this.f15955F = jSONObject.getBoolean("same_tips_filter");
            }
            if (jSONObject.has("manual_trigger")) {
                this.m = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f15982e0 = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f15983f0 = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f15985g0 = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("continuous_angle_num_threshold")) {
                this.f15987i0 = jSONObject.getInt("continuous_angle_num_threshold");
            }
            boolean zOptBoolean = jSONObject.optBoolean("need_local_face_best_image", false);
            boolean zOptBoolean2 = jSONObject.optBoolean("relaxed_shelter_threshold", false);
            if (zOptBoolean || zOptBoolean2) {
                o.c = 0.3f;
                o.f16020d = 0.5f;
                o.e = 0.3f;
                o.f = 0.3f;
                o.f16021g = 0.3f;
            }
            this.f15981d0 = jSONObject.optString("model_config_ini_name", "yt_model_config.ini");
            this.f15978b0 = jSONObject.optBoolean("need_check_multiface", false);
            this.f15958I = (float) jSONObject.optDouble("bigface_ratio_buffer", 0.05000000074505806d);
            this.J = (float) jSONObject.optDouble("smallface_ratio_buffer", 0.05000000074505806d);
            this.f15959K = (float) jSONObject.optDouble("pose_ratio_buffer", 0.05000000074505806d);
            this.f15960L = (float) jSONObject.optDouble("stable_roi_threshold", 0.8999999761581421d);
        } catch (JSONException e) {
            YtLogger.e("SilentLivenessState", "Failed to parse json:", e);
        }
    }
}
