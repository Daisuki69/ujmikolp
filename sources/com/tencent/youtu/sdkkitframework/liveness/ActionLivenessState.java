package com.tencent.youtu.sdkkitframework.liveness;

import We.s;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import com.tencent.youtu.ytposedetect.data.PoseDetectData;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ActionLivenessState extends YtFSMBaseState {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f15839E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f15840F;
    public int J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15844K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f15845L;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f15852S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f15857X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f15858Y;
    public YTFaceTracker.TrackedFace[] c;
    public YTPoseDetectInterface.b f;
    public String[] h;
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public YtSDKKitCommon.StateNameHelper.StateClassName f15863k;
    public p m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public YTActRefData f15867p;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public YTFaceTracker.Param f15876y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public YTFaceTracker f15877z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15859a = "3.7.5";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15860b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15861d = -1;
    public int e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15862g = 1;
    public int j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15864l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15865n = Environment.getExternalStorageDirectory().getPath() + "/temp.mp4";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15866o = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15868q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15869r = 2097152;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15870s = 30;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15871t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f15872u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f15873v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f15874w = StateEvent.ActionValue.STAGE_PASS;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15875x = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15835A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f15836B = 5;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f15837C = "";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15838D = 20;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15841G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15842H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f15843I = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f15846M = 50.0f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f15847N = 50.0f;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public float f15848O = 50.0f;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f15849P = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f15850Q = -1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f15851R = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f15853T = 0.38f;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f15854U = false;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f15855V = 10;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f15856W = false;

    public class a extends HashMap<String, Object> {
        public a() {
            put(StateEvent.Name.ACTION_DETECT_TYPE, Integer.valueOf(ActionLivenessState.this.f15862g));
        }
    }

    public class b extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15879a;

        public b(String str) {
            this.f15879a = str;
            put(StateEvent.Name.UI_EXTRA_TIPS, ActionLivenessState.this.f15872u);
            put(StateEvent.Name.UI_TIPS, ActionLivenessState.this.f15873v != null ? ActionLivenessState.this.f15873v : str);
            put(StateEvent.Name.UI_ACTION, ActionLivenessState.this.f15874w);
        }
    }

    public class c extends HashMap<String, Object> {
        public c(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.RESET_CUSTOM_TIMEOUT);
        }
    }

    public class d extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15881a;

        public d(String str) {
            this.f15881a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.f15859a + " 当前版本：" + str);
        }
    }

    public class e extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15883a;

        public e(String str) {
            this.f15883a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本异常！目标版本：" + ActionLivenessState.this.f15859a + " 当前版本：" + str);
        }
    }

    public class f extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15885a;

        public f(String str) {
            this.f15885a = str;
            put(StateEvent.Name.WARNING_TIPS, "动作库版本过低！目标版本：" + ActionLivenessState.this.f15859a + " 当前版本：" + str);
        }
    }

    public class g extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15887a;

        public g(ActionLivenessState actionLivenessState, int i) {
            this.f15887a = i;
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_POSEDETECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YtPose SDK failed with " + i));
        }
    }

    public class h implements YTPoseDetectJNIInterface.IYtLoggerListener {
        public h(ActionLivenessState actionLivenessState) {
        }

        @Override // com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
            YtLogger.d("[SUNNY]", str + "---" + str2);
            Log.e("sunny-->", "~~~~~" + str + "||||" + str2);
        }
    }

    public class i extends HashMap<String, Object> {
        public i(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
        }
    }

    public class k implements YTPoseDetectInterface.c {
        public k(ActionLivenessState actionLivenessState) {
        }

        @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.c
        public void a() {
            YtLogger.d("ActionLivenessState", "start success");
        }

        @Override // com.tencent.youtu.ytposedetect.YTPoseDetectInterface.c
        public void onFailed(int i, String str, String str2) {
        }
    }

    public class l extends HashMap<String, Object> {
        public l(ActionLivenessState actionLivenessState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
        try {
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            this.f15860b = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.c = (YTFaceTracker.TrackedFace[]) stateByName.getStateDataBy("face_status");
            this.f15861d = ((Integer) stateByName.getStateDataBy("pose_state")).intValue();
            this.e = ((Integer) stateByName.getStateDataBy("shelter_state")).intValue();
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null && !this.f15868q) {
                String str = (String) stateByName2.getStateDataBy("action_data");
                if (TextUtils.isEmpty(str)) {
                    throw new Exception("action_data is empty");
                }
                String[] strArrSplit = str.split(",");
                this.h = strArrSplit;
                int length = strArrSplit.length;
                int i4 = this.i;
                if (length > i4) {
                    int i6 = Integer.parseInt(strArrSplit[i4]);
                    switch (i6) {
                        case 0:
                        case 1:
                            this.f15862g = 1;
                            break;
                        case 2:
                            this.f15862g = 2;
                            break;
                        case 3:
                            this.f15862g = 3;
                            break;
                        case 4:
                            this.f15862g = 4;
                            break;
                        case 5:
                            this.f15862g = 5;
                            break;
                        case 6:
                            this.f15862g = 6;
                            break;
                        case 7:
                            this.f15862g = 7;
                            break;
                        case 8:
                            this.f15862g = 8;
                            break;
                        case 9:
                            this.f15862g = 9;
                            break;
                    }
                    this.stateData.put("current_action_type", Integer.valueOf(i6));
                }
            }
            if (this.f15841G == 1) {
                this.f15862g = 5;
                this.h = new String[]{"5"};
            }
            this.stateData.put("action_seq", this.h);
            if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
                String[] strArrSplit2 = YtSDKKitFramework.getInstance().version().split(Global.HYPHEN);
                String strA = com.tencent.could.huiyansdk.api.e.a(this.h);
                if (stateByName2 != null && !this.f15856W) {
                    String str2 = (String) stateByName2.getStateDataBy("color_data");
                    if (TextUtils.isEmpty(str2)) {
                        throw new Exception("color_data is empty");
                    }
                    YTPoseDetectJNIInterface.setColorData(str2, strArrSplit2[0], strA, this.f15865n, (String) stateByName2.getStateDataBy("sd_data"));
                    this.f15856W = true;
                }
            } else {
                YTPoseDetectJNIInterface.setColorData("NULL", "NULL", "NULL", this.f15865n, "NULL");
            }
        } catch (Exception e7) {
            YtLogger.e("ActionLivenessState", "action enter failed ", e7);
            CommonUtils.reportException("action enter failed ", e7);
        }
        YtFSM.getInstance().updateCacheStrategy(YtFSM.YtFSMUpdateStrategy.CacheStrategy);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[PHI: r8
  0x00db: PHI (r8v11 int) = (r8v7 int), (r8v8 int) binds: [B:41:0x00d9, B:44:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enterFirst() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState.enterFirst():void");
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f15875x && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            a();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        JSONArray jSONArray;
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        String version = YTPoseDetectJNIInterface.getVersion();
        YtLogger.i("ActionLivenessState", "YTPose Version: " + version);
        String[] strArrSplit = version.split("\\.");
        String str2 = this.f15859a;
        YtLogger.i("ActionLivenessState", "Wanted YTPose Version: " + str2);
        String[] strArrSplit2 = str2.split("\\.");
        if (Integer.parseInt(strArrSplit[0]) != Integer.parseInt(strArrSplit2[0])) {
            YtFSM.getInstance().sendFSMEvent(new d(version));
        } else if (Integer.parseInt(strArrSplit[1]) != Integer.parseInt(strArrSplit2[1])) {
            YtFSM.getInstance().sendFSMEvent(new e(version));
        } else if (Integer.parseInt(strArrSplit[2]) < Integer.parseInt(strArrSplit2[2])) {
            YtFSM.getInstance().sendFSMEvent(new f(version));
        }
        int iInitModel = YTPoseDetectInterface.initModel();
        if (iInitModel != 0) {
            YtLogger.e("ActionLivenessState", "action load failed2: " + iInitModel, null);
            YtFSM.getInstance().sendFSMEvent(new g(this, iInitModel));
            return;
        }
        this.f15860b = 0;
        this.stateData.put("action_type", Integer.valueOf(this.f15862g));
        try {
            if (jSONObject.has("action_security_level")) {
                this.f15866o = jSONObject.getInt("action_security_level");
            }
            jSONArray = jSONObject.getJSONArray("action_default_seq");
        } catch (JSONException e7) {
            YtLogger.e("ActionLivenessState", "action load failed3: ", e7);
            this.h = "0".split(Global.BLANK);
        }
        if (jSONArray == null) {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
            return;
        }
        this.h = new String[jSONArray.length()];
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            this.h[i4] = jSONArray.getString(i4);
        }
        YtLogger.d("ActionLivenessState", "load action sequence from sdkconfig " + jSONObject.getString("action_default_seq") + " size :" + this.h.length);
        try {
            if (jSONObject.has("action_inner_settings")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("action_inner_settings");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    YTPoseDetectJNIInterface.updateParam(next, jSONObject2.getString(next));
                }
            }
        } catch (JSONException e10) {
            YtLogger.e("ActionLivenessState", "action load failed4: ", e10);
        }
        YTPoseDetectJNIInterface.setLoggerListener(new h(this));
        YTPoseDetectJNIInterface.configNativeLog(true);
        YTPoseDetectJNIInterface.updateParam("log_level", ExifInterface.GPS_MEASUREMENT_3D);
        YTPoseDetectJNIInterface.updateParam("frame_num", "" + this.f15838D);
        YTPoseDetectJNIInterface.updateParam("last_frame_num", "" + this.f15839E);
        YTPoseDetectJNIInterface.updateParam("anchor_widths", this.f15840F);
        YTPoseDetectJNIInterface.updateParam("need_best_original_size", String.valueOf(this.f15852S));
        YTPoseDetectJNIInterface.updateParam("action_close_mouth_threshold", String.valueOf(this.f15853T));
        YTPoseDetectJNIInterface.updateParam("need_frame_quality", String.valueOf(this.f15854U ? 1 : 0));
        YTPoseDetectJNIInterface.updateParam("continuous_quality_num_threshold", String.valueOf(this.f15855V));
        YTPoseDetectJNIInterface.updateParam("secondary_yaw_threshold", String.valueOf(this.f15846M));
        YTPoseDetectJNIInterface.updateParam("secondary_pitch_threshold", String.valueOf(this.f15847N));
        YTPoseDetectJNIInterface.updateParam("secondary_roll_threshold", String.valueOf(this.f15848O));
        int i6 = YtFSM.getInstance().getContext().currentRotateState;
        this.f15863k = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        YTPoseDetectJNIInterface.setSafetyLevel(this.f15866o);
        reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.f15863k == YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f15863k)) == -1) {
                sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f15863k));
            }
        } else {
            this.f15845L = true;
            YTPoseDetectInterface.stop();
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f15863k));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        a();
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        YtVideoEncoder ytVideoEncoder;
        super.unload();
        if (YTPoseDetectInterface.isDetecting()) {
            YTPoseDetectInterface.stop();
        }
        YTPoseDetectInterface.releaseModel();
        p pVar = this.m;
        if (pVar == null || (ytVideoEncoder = pVar.f16022a) == null) {
            return;
        }
        pVar.i = false;
        try {
            try {
                ytVideoEncoder.abortEncoding();
                pVar.f16022a.stopEncoding();
            } catch (Exception e7) {
                YtLogger.e(TtmlNode.TAG_P, "video release error:", e7);
            }
        } finally {
            pVar.f16022a = null;
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j6) {
        int i4;
        boolean z4;
        String str;
        super.update(yTImageData, j6);
        if (this.f15843I && this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new l(this));
            try {
                Thread.sleep(30L);
                return;
            } catch (InterruptedException e7) {
                YtLogger.e("ActionLivenessState", "Thread sleep error", e7);
                return;
            }
        }
        YTFaceTracker.TrackedFace[] trackedFaceArr = this.c;
        if (trackedFaceArr != null && trackedFaceArr.length > 0 && (i4 = this.f15860b) > 0) {
            if (i4 <= 1 || (this.f15842H && this.f15861d == 7)) {
                this.f15835A = this.f15836B;
                YTPoseDetectInterface.reset();
                this.f15864l = false;
            }
            if (this.f == null) {
                YtLogger.e("ActionLivenessState", "FrameHandle is null, check init first", null);
                return;
            }
            YtLogger.d("ActionLivenessState", "pose count" + this.f15835A + " stable " + this.f15836B + " isAction" + this.f15864l);
            if (this.J != this.f15862g && this.f15843I) {
                YtFSM.getInstance().sendFSMEvent(new a());
                this.J = this.f15862g;
            }
            int i6 = this.f15862g;
            if ((i6 == this.f15849P || i6 == this.f15850Q) && !o.a(this.c[0], this.f15846M, this.f15847N, this.f15848O)) {
                this.f15835A = this.f15836B;
                YTPoseDetectInterface.reset();
                this.f15864l = false;
                YtLogger.o("ActionLivenessState", "action correction face failure:" + this.f15862g);
                HashMap<String, Object> map = new HashMap<>();
                map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS);
                map.put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT);
                YtFSM.getInstance().sendFSMEvent(map);
                z4 = false;
            } else {
                z4 = true;
            }
            if (this.f15862g == 3 && Math.abs(this.c[0].yaw) > 20.0f) {
                this.f15835A = this.f15836B;
                this.f15864l = false;
                YtFSM.getInstance().sendFSMEvent(androidx.media3.datasource.cache.c.q(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS, StateEvent.Name.UI_TIPS, StringCode.FL_POSE_INCORRECT));
                z4 = false;
            }
            if (this.f15858Y && this.f15862g != 2) {
                float[] fArr = this.c[0].faceShape;
                float fAbs = Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / Math.abs(fArr[90] - fArr[102]);
                YtLogger.o("ActionLivenessState", "action nod head mouth not close!ret:" + fAbs + "|threshold=" + this.f15853T + ",action type:" + this.f15862g);
                StringBuilder sb2 = new StringBuilder("isMouthCLose  rat=");
                sb2.append(fAbs);
                sb2.append("|threshold=");
                sb2.append(this.f15853T);
                YtLogger.d("ActionLivenessState", sb2.toString());
                if (fAbs >= this.f15853T) {
                    this.f15835A = this.f15836B;
                    this.f15864l = false;
                    YtFSM.getInstance().sendFSMEvent(androidx.media3.datasource.cache.c.q(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.STAGE_NOTPASS, StateEvent.Name.UI_TIPS, StringCode.FL_CLOSE_MOUTH));
                    z4 = false;
                }
            }
            if (z4 && this.f15835A > this.f15836B + 10) {
                if (!this.f15864l && !this.f15845L) {
                    int i10 = this.f15862g;
                    if (i10 == 1) {
                        str = StringCode.FL_ACT_BLINK;
                    } else if (i10 == 2) {
                        str = StringCode.FL_ACT_OPEN_MOUTH;
                    } else if (i10 == 4) {
                        str = StringCode.FL_ACT_SHAKE_HEAD;
                    } else if (i10 == 3) {
                        str = StringCode.FL_ACT_NOD_HEAD;
                    } else if (i10 == 5) {
                        str = StringCode.FL_POSE_KEEP;
                    } else if (i10 == 6) {
                        str = StringCode.FL_ACT_TURN_LEFT;
                    } else if (i10 == 7) {
                        str = StringCode.FL_ACT_TURN_RIGHT;
                    } else if (i10 == 8) {
                        str = StringCode.FL_ACT_CLOSER_FAR;
                    } else if (i10 == 9) {
                        str = StringCode.FL_ACT_FAR_CLOSER;
                    } else {
                        YtLogger.e("ActionLivenessState", "Action liveness state getTipsByPoseType action error", null);
                        str = StringCode.FL_POSE_KEEP;
                    }
                    YtFSM.getInstance().sendFSMEvent(new b(str));
                }
                YTFaceTracker.TrackedFace trackedFace = this.c[0];
                YTPoseDetectInterface.poseDetect(new PoseDetectData(trackedFace.faceShape, trackedFace.faceVisible, this.f15862g, yTImageData.imgData, trackedFace.pitch, trackedFace.yaw, trackedFace.roll, this.f15861d, this.e, trackedFace.faceRect, yTImageData.width, yTImageData.height, false), this.f, 1);
            }
            this.f15835A++;
        } else if ((trackedFaceArr == null || trackedFaceArr.length == 0) && this.f15857X) {
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = this.f15863k;
            YtSDKKitCommon.StateNameHelper.StateClassName stateClassName2 = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            if (stateClassName == stateClassName2) {
                reset();
                ((FaceQualityState) YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE))).reset();
                YTPoseDetectInterface.reset();
                if (this.f15843I) {
                    YtFSM.getInstance().sendFSMEvent(new c(this));
                } else {
                    YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName2)).handleStateAction("reset_timeout", null);
                }
            }
        }
        moveToNextState();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        String[] strArrSplit;
        try {
            if (jSONObject.has("quality_close_eye_left_threshold")) {
                jSONObject.getDouble("quality_close_eye_left_threshold");
            }
            if (jSONObject.has("quality_close_eye_right_threshold")) {
                jSONObject.getDouble("quality_close_eye_right_threshold");
            }
            if (jSONObject.has("quality_close_mouth_threshold")) {
                jSONObject.getDouble("quality_close_mouth_threshold");
            }
            if (jSONObject.has("need_face_quality")) {
                this.f15854U = jSONObject.getBoolean("need_face_quality");
            }
            if (jSONObject.has("video_path")) {
                this.f15865n = jSONObject.getString("video_path");
            } else {
                this.f15865n = YtFSM.getInstance().getContext().currentAppContext.getFilesDir() + "/temp.mp4";
            }
            if (jSONObject.has("local_config_flag")) {
                this.f15868q = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("video_bitrate")) {
                this.f15869r = jSONObject.getInt("video_bitrate");
            }
            if (jSONObject.has("video_framerate")) {
                this.f15870s = jSONObject.getInt("video_framerate");
            }
            if (jSONObject.has("video_iframeinterval")) {
                this.f15871t = jSONObject.getInt("video_iframeinterval");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f15875x = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f15836B = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("control_config")) {
                this.f15837C = jSONObject.getString("control_config");
            }
            if (jSONObject.has("need_close_timeout")) {
                this.f15843I = jSONObject.getBoolean("need_close_timeout");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f15846M = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f15847N = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f15848O = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("continuous_quality_num_threshold")) {
                this.f15855V = jSONObject.getInt("continuous_quality_num_threshold");
            }
            if (jSONObject.has("screen_orientation")) {
                this.f15851R = jSONObject.getInt("screen_orientation");
            }
            if (jSONObject.has("need_best_original_size")) {
                this.f15852S = jSONObject.getInt("need_best_original_size");
            }
            if (jSONObject.has("action_close_mouth_threshold")) {
                this.f15853T = (float) jSONObject.getDouble("action_close_mouth_threshold");
            }
            if (jSONObject.has("need_local_face_best_image")) {
                this.f15857X = jSONObject.getBoolean("need_local_face_best_image");
            }
            if (jSONObject.has("correction_angle_action_type") && (strArrSplit = jSONObject.getString("correction_angle_action_type").split(",")) != null && strArrSplit.length > 0) {
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    if (i4 == 0) {
                        this.f15849P = Integer.parseInt(strArrSplit[i4]);
                    } else if (i4 == 1) {
                        this.f15850Q = Integer.parseInt(strArrSplit[i4]);
                    }
                }
            }
            this.f15838D = jSONObject.optInt("action_frame_num", 20);
            this.f15839E = jSONObject.optInt("last_action_frame_num", 3);
            this.f15840F = jSONObject.optString("anchor_widths", "480,240,240");
            this.f15842H = jSONObject.optBoolean("need_check_multiface", false);
            this.f15858Y = jSONObject.optBoolean("need_pose_check_mouth_open", false);
        } catch (JSONException e7) {
            e7.printStackTrace();
            YtLogger.e("ActionLivenessState", "action load failed1:", e7);
        }
    }

    public final void a() {
        this.j = 0;
        this.f15864l = false;
        this.f15835A = 0;
        this.f15861d = -1;
        this.f15845L = false;
        this.f15856W = false;
        String[] strArr = this.h;
        this.i = 0;
        a(strArr, 0);
        this.f15863k = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        try {
            p pVar = this.m;
            if (pVar != null) {
                pVar.f16022a.abortEncoding();
            }
        } catch (Exception e7) {
            YtLogger.e("ActionLivenessState", "video error:", e7);
        }
        this.f = new j();
        YTPoseDetectInterface.start(YtFSM.getInstance().getContext().currentAppContext, YtFSM.getInstance().getContext().currentRotateState, new k(this));
    }

    public class j implements YTPoseDetectInterface.b {
        public j() {
        }

        public void a(int i, String str, String str2) {
            YtSDKStats.getInstance().reportInfo("pose state " + i);
            YtLogger.d("ActionLivenessState", "YTPoseDetectInterface.poseDetect.onFailed: " + i + " s: " + str);
            ActionLivenessState actionLivenessState = ActionLivenessState.this;
            actionLivenessState.j = actionLivenessState.j + 1;
        }

        public boolean a(byte[] bArr, int i, int i4, int i6) {
            StringBuilder sbU = s.u("codec info: rotatedWith: ", i, "rotatedHeight: ", i4, " bitrate: ");
            sbU.append(ActionLivenessState.this.f15869r);
            sbU.append(" framerate");
            sbU.append(ActionLivenessState.this.f15870s);
            sbU.append(" iframeinterval");
            sbU.append(ActionLivenessState.this.f15871t);
            YtLogger.i("ActionLivenessState", sbU.toString());
            ActionLivenessState actionLivenessState = ActionLivenessState.this;
            p pVar = actionLivenessState.m;
            if (!pVar.i) {
                int i10 = actionLivenessState.f15851R;
                pVar.i = true;
                if (pVar.j) {
                    if (!pVar.f16022a.isEncodingStarted()) {
                        try {
                            pVar.f16022a.startEncoding(i, i4, new File(pVar.f16023b), pVar.c, pVar.f16024d, pVar.e, i10);
                        } catch (Exception unused) {
                        }
                    }
                }
                YtLogger.e(TtmlNode.TAG_P, "sunny-start video encode error", null);
                return false;
            }
            p pVar2 = ActionLivenessState.this.m;
            pVar2.getClass();
            try {
                pVar2.f16022a.queueFrame(new YTImageData(bArr, i, i4));
                pVar2.f16022a.encode(pVar2.f16024d);
                return true;
            } catch (Exception e) {
                YtLogger.e(TtmlNode.TAG_P, "encode frame error:", e);
                return false;
            }
        }
    }

    public final boolean a(String[] strArr, int i4) {
        if (strArr.length == 0) {
            return false;
        }
        this.i = i4;
        if (i4 >= strArr.length) {
            return false;
        }
        int i6 = Integer.parseInt(strArr[i4]);
        YtSDKStats.getInstance().reportEvent(i6);
        if (i6 == 0 || i6 == 1) {
            this.f15862g = 1;
        } else if (i6 == 2) {
            this.f15862g = 2;
        } else if (i6 == 3) {
            this.f15862g = 3;
        } else if (i6 == 4) {
            this.f15862g = 4;
        } else if (i6 == 5) {
            this.f15862g = 5;
        }
        this.stateData.put("current_action_type", Integer.valueOf(i6));
        YtLogger.o("ActionLivenessState", "action check rounds: " + this.i + "start check pose: " + this.f15862g);
        if (!this.f15843I) {
            YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE)).handleStateAction("reset_timeout", null);
        }
        this.f15835A = 0;
        return true;
    }
}
