package com.tencent.youtu.sdkkitframework.liveness;

import We.s;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.TimeoutCounter;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectSettings;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectData;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ColorImgData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectColorData;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo;
import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.data.YTActRefImage;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ReflectLivenessState extends YtFSMBaseState {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15917A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15923b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public YTActRefData f15924d;
    public LiveStyleRequester.SeleceData e;
    public YTFaceTracker.TrackedFace[] i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f15929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public YTFaceTracker.Param f15930p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15922a = "3.6.2";
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f15925g = l.RPT_INIT;
    public int h = 0;
    public YtSDKKitCommon.StateNameHelper.StateClassName j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15926k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15927l = 2;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15928n = 5;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15931q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f15932r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15933s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15934t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15935u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public YTFaceTracker f15936v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f15937w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15938x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TimeoutCounter f15939y = new TimeoutCounter("reflect tips timeout counter");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15940z = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15918B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f15919C = 50.0f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f15920D = 50.0f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f15921E = 50.0f;

    public class a extends HashMap<String, Object> {
        public a(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECTION_ANGLE_DETECT_FAIL, StringCode.YT_FACE_REF_ANGLE_DETECT_ERROR, "reflection angle detect fail"));
        }
    }

    public class b extends HashMap<String, Object> {
        public b(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
        }
    }

    public class c extends HashMap<String, Object> {
        public c() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.f15922a + " 当前版本：3.6.9.2");
        }
    }

    public class d extends HashMap<String, Object> {
        public d() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本异常！目标版本：" + ReflectLivenessState.this.f15922a + " 当前版本：3.6.9.2");
        }
    }

    public class e extends HashMap<String, Object> {
        public e() {
            put(StateEvent.Name.WARNING_TIPS, "反光库版本过低！目标版本：" + ReflectLivenessState.this.f15922a + " 当前版本：3.6.9.2");
        }
    }

    public class f extends HashMap<String, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15944a;

        public f(ReflectLivenessState reflectLivenessState, int i) {
            this.f15944a = i;
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECT_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECT_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTReflect SDK failed with " + i));
        }
    }

    public class g implements com.tencent.youtu.ytagreflectlivecheck.notice.a {
        public g() {
        }
    }

    public class h implements YTAGReflectLiveCheckInterface.IYTReflectListener {
        public h() {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public float onGetAppBrightness() {
            try {
                return YtFSM.getInstance().getContext().reflectListener.onGetAppBrightness();
            } catch (Exception e) {
                YtLogger.e("ReflectLivenessState", "onGetAppBrightness error", e);
                return -1.0f;
            }
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
            try {
                if (!ReflectLivenessState.this.stateData.containsKey("refcontrol_begin")) {
                    ReflectLivenessState.this.stateData.put("refcontrol_begin", String.valueOf(System.currentTimeMillis() * 1000));
                }
                YtFSM.getInstance().getContext().reflectListener.onReflectEvent(colorMatrixColorFilter, f);
            } catch (Exception e) {
                YtLogger.e("ReflectLivenessState", "onReflectEvent error", e);
            }
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.IYTReflectListener
        public void onReflectStart(long j) {
            try {
                YtFSM.getInstance().getContext().reflectListener.onReflectStart(j);
            } catch (Exception e) {
                YtLogger.e("ReflectLivenessState", "onReflectStart error", e);
            }
        }
    }

    public class i implements YTAGReflectLiveCheckJNIInterface.IYtLoggerListener {
        public i(ReflectLivenessState reflectLivenessState) {
        }

        @Override // com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.IYtLoggerListener
        public void log(String str, String str2) {
            YtLogger.d(str, str2);
        }
    }

    public class j extends HashMap<String, Object> {
        public j(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
            put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
            put("message", CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "Init YTFaceTrack SDK failed with "));
        }
    }

    public class k extends HashMap<String, Object> {
        public k(ReflectLivenessState reflectLivenessState) {
            put(StateEvent.Name.UI_TIPS, StringCode.FL_POSE_KEEP);
        }
    }

    public enum l {
        RPT_TIPWAIT,
        RPT_INIT,
        RPT_REFLECT,
        RPT_FINISH
    }

    public final ReflectColorData b(com.tencent.youtu.ytagreflectlivecheck.a aVar) {
        CommonUtils.benchMarkBegin("make_pack_use_time_reflection");
        YtLogger.d("ReflectLivenessState", "translation reflectImagesShortenStrategy：" + this.f15917A);
        int i4 = 0;
        if (this.f15917A == 1) {
            int i6 = 0;
            while (true) {
                RawImgData[] rawImgDataArr = aVar.f16028a;
                if (i6 >= rawImgDataArr.length) {
                    break;
                }
                if (i6 > 2 && i6 < rawImgDataArr.length - 2 && i6 % 2 != 0) {
                    rawImgDataArr[i6].frameBuffer = new byte[0];
                }
                i6++;
            }
        }
        ReflectColorData reflectColorData = new ReflectColorData();
        ArrayList<ColorImgData> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            RawImgData[] rawImgDataArr2 = aVar.f16028a;
            if (i10 >= rawImgDataArr2.length) {
                break;
            }
            RawImgData rawImgData = rawImgDataArr2[i10];
            ColorImgData colorImgData = new ColorImgData();
            colorImgData.setImage(new String(Base64.encode(rawImgData.frameBuffer, 2)));
            colorImgData.checksum = rawImgData.checksum;
            colorImgData.setCapture_time(rawImgData.captureTime);
            colorImgData.setX(rawImgData.f16033x);
            colorImgData.setY(rawImgData.f16034y);
            arrayList.add(colorImgData);
            i10++;
        }
        reflectColorData.setImages_data(arrayList);
        reflectColorData.setBegin_time(aVar.f16029b);
        reflectColorData.setChangepoint_time(aVar.c);
        reflectColorData.changepoint_time_list = new ArrayList<>();
        while (true) {
            long[] jArr = aVar.f16030d;
            if (i4 >= jArr.length) {
                break;
            }
            reflectColorData.changepoint_time_list.add(Long.valueOf(jArr[i4]));
            i4++;
        }
        reflectColorData.setOffset_sys(aVar.e);
        reflectColorData.setFrame_num(aVar.f);
        reflectColorData.setLandmark_num(aVar.f16031g);
        reflectColorData.setWidth(aVar.h);
        reflectColorData.setHeight(aVar.i);
        reflectColorData.version = YTAGReflectLiveCheckInterface.VERSION;
        try {
            reflectColorData.setLog(new String(aVar.f16032k, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
        }
        reflectColorData.setConfig_begin(aVar.j);
        OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time_reflection"));
        return reflectColorData;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        YTFaceTracker.TrackedFace[] trackedFaceArr;
        super.enter();
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        try {
            this.f = ((Integer) stateByName.getStateDataBy("pose_state")).intValue();
            this.h = ((Integer) stateByName.getStateDataBy("continuous_detect_count")).intValue();
            this.i = (YTFaceTracker.TrackedFace[]) stateByName.getStateDataBy("face_status");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            if (stateByName2 != null) {
                this.e = (LiveStyleRequester.SeleceData) stateByName2.getStateDataBy("select_data");
                if (!this.m) {
                    this.f15923b = (String) stateByName2.getStateDataBy("color_data");
                } else if (this.f15934t) {
                    this.f15923b = this.f15929o;
                }
                String str = (String) stateByName2.getStateDataBy("control_config");
                if (str != null) {
                    this.f15937w = str;
                }
            }
            if (!this.f15937w.isEmpty()) {
                String[] strArrSplit = this.f15937w.split("&");
                if (strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        String[] strArrSplit2 = str2.split("=");
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                            this.f15938x = Integer.parseInt(strArrSplit2[1]);
                        }
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("reflect_images_shorten_strategy")) {
                            this.f15917A = Integer.parseInt(strArrSplit2[1]);
                        }
                        if (strArrSplit2.length > 1 && strArrSplit2[0].equals("compress_reflection_image_score")) {
                            int i4 = Integer.parseInt(strArrSplit2[1]);
                            int i6 = 80;
                            if (i4 < 80) {
                                i4 = i6;
                                YTAGReflectLiveCheckJNIInterface.compressReflectionImageScore = i4;
                            } else {
                                i6 = 99;
                                if (i4 > 99) {
                                    i4 = i6;
                                }
                                YTAGReflectLiveCheckJNIInterface.compressReflectionImageScore = i4;
                            }
                        }
                    }
                }
            }
            YtFSMBaseState stateByName3 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName3 != null) {
                this.f15924d = (YTActRefData) stateByName3.getStateDataBy("act_reflect_data");
            }
            if (this.h > this.f15928n && this.f == 0 && (trackedFaceArr = this.i) != null && trackedFaceArr.length > 0) {
                YtFSM.getInstance().sendFSMEvent(new k(this));
            }
            if (this.f15938x == 2) {
                this.f15925g = l.RPT_FINISH;
                a((com.tencent.youtu.ytagreflectlivecheck.a) null);
            }
        } catch (Exception e7) {
            YtLogger.e("ReflectLivenessState", "reflection enter failed ", e7);
            CommonUtils.reportException("reflection enter failed ", e7);
        }
        YtFSM.getInstance().updateCacheStrategy(YtFSM.YtFSMUpdateStrategy.CacheStrategy);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.o("ReflectLivenessState", makeStateInfo("ReflectLivenessState", 1));
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
        stateByName.handleStateAction("reset_timeout", null);
        YTFaceTracker yTFaceTracker = (YTFaceTracker) stateByName.getStateDataBy("detect_instance");
        this.f15936v = yTFaceTracker;
        if (yTFaceTracker != null) {
            YTFaceTracker.Param param = yTFaceTracker.getParam();
            this.f15930p = param;
            if (param != null) {
                param.detInterval = -1;
                this.f15936v.setParam(param);
            }
        } else {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_VERIFY_MODEL_INIT_FAIL, "模式初始化失败");
            YtFSM.getInstance().sendFSMEvent(new j(this));
        }
        this.f15939y.reset();
        YtFSM.getInstance().cleanUpQueue();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        super.handleEvent(ytFrameworkFireEventType, obj);
        if (this.f15935u && ytFrameworkFireEventType == YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS) {
            a();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        YtLogger.i("ReflectLivenessState", "Reflection version:3.6.9.2");
        String[] strArrSplit = YTAGReflectLiveCheckInterface.VERSION.split("\\.");
        String str2 = this.f15922a;
        YtLogger.i("ReflectLivenessState", "Wanted Reflection Version: " + str2);
        String[] strArrSplit2 = str2.split("\\.");
        if (Integer.parseInt(strArrSplit[0]) != Integer.parseInt(strArrSplit2[0])) {
            YtFSM.getInstance().sendFSMEvent(new c());
        } else if (Integer.parseInt(strArrSplit[1]) != Integer.parseInt(strArrSplit2[1])) {
            YtFSM.getInstance().sendFSMEvent(new d());
        } else if (Integer.parseInt(strArrSplit[2]) < Integer.parseInt(strArrSplit2[2])) {
            YtFSM.getInstance().sendFSMEvent(new e());
        }
        int iInitModel = YTAGReflectLiveCheckInterface.initModel(this.c, YtSDKKitFramework.getInstance().version().split(Global.HYPHEN)[0]);
        if (iInitModel != 0) {
            YtLogger.e("ReflectLivenessState", "failed to init reflect sdk " + iInitModel, null);
            YtSDKStats.getInstance().reportError(iInitModel, "failed to init reflect sdk");
            YtFSM.getInstance().sendFSMEvent(new f(this, iInitModel));
        }
        if (this.f15934t) {
            this.f15929o = YTAGReflectLiveCheckJNIInterface.FRGenConfigData(this.f15933s, this.f15932r);
        }
        YTAGReflectLiveCheckInterface.setReflectNotice(new g());
        if (YtFSM.getInstance().getContext().reflectListener != null) {
            YTAGReflectLiveCheckInterface.setReflectListener(new h());
        } else {
            YTAGReflectLiveCheckInterface.setReflectListener(null);
        }
        YTAGReflectLiveCheckJNIInterface.configNativeLog(true);
        YTAGReflectLiveCheckJNIInterface.updateParam("log_level", ExifInterface.GPS_MEASUREMENT_3D);
        YTAGReflectLiveCheckJNIInterface.updateParam("is_alone_raw_push", "0");
        YTAGReflectLiveCheckJNIInterface.setLoggerListener(new i(this));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.j != YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.j));
        } else if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.j)) == -1) {
            sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.j));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        a();
        super.reset();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
        YTAGReflectLiveCheckInterface.cancel();
        YTAGReflectLiveCheckInterface.releaseModel();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void update(YTImageData yTImageData, long j6) {
        int i4;
        YTFaceTracker.TrackedFace[] trackedFaceArr;
        int i6;
        YTFaceTracker.TrackedFace[] trackedFaceArr2;
        super.update(yTImageData, j6);
        if (this.f15918B && (trackedFaceArr2 = this.i) != null && trackedFaceArr2.length > 0 && !o.a(trackedFaceArr2[0], this.f15919C, this.f15920D, this.f15921E)) {
            YtLogger.o("ReflectLivenessState", "reflect face angle error");
            YtFSM.getInstance().sendFSMEvent(new a(this));
            this.j = YtSDKKitCommon.StateNameHelper.StateClassName.IDLE_STATE;
        }
        int iOrdinal = this.f15925g.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.h > this.f15928n && (((i4 = this.f) == 0 || i4 == 9) && (trackedFaceArr = this.i) != null && trackedFaceArr.length > 0)) {
                    YtFSM.getInstance().sendFSMEvent(new m(this));
                    this.f15925g = l.RPT_REFLECT;
                    YTAGReflectSettings aGSettings = YTAGReflectLiveCheckInterface.getAGSettings();
                    aGSettings.safetylevel = this.f15927l;
                    aGSettings.isEncodeReflectData = false;
                    aGSettings.isActionReflect = YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
                    YTAGReflectLiveCheckInterface.setAGSettings(aGSettings);
                    YtLogger.i("ReflectLivenessState", "Settings: safetyLevel " + aGSettings.safetylevel);
                    YtLogger.i("ReflectLivenessState", "Settings: isEncodeReflectData " + aGSettings.isEncodeReflectData);
                    YtLogger.i("ReflectLivenessState", "Settings: isActionReflect " + aGSettings.isActionReflect);
                    YtSDKKitFramework.YtSDKPlatformContext context = YtFSM.getInstance().getContext();
                    YTAGReflectLiveCheckInterface.start(context.currentAppContext, context.currentCamera, context.currentRotateState, this.f15923b, new n(this));
                }
                this.j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
            } else if (iOrdinal == 2) {
                StringBuilder sb2 = new StringBuilder("reflect continuous_detect_count ");
                sb2.append(this.h);
                sb2.append("pass flag ");
                sb2.append(this.f != 0);
                YtLogger.d("ReflectLivenessState", sb2.toString());
                YtLogger.d("ReflectLivenessState", "reflect pose state " + this.f);
                if (this.f15926k && ((this.f15931q && (i6 = this.f) != 0 && i6 != 9) || ((this.f15940z && this.f == 1) || this.f == 1))) {
                    YtLogger.o("ReflectLivenessState", "reflect error: no face");
                    YTAGReflectLiveCheckInterface.cancel();
                    a(-1, "检测异常", "请保持姿态");
                }
                if (this.i != null) {
                    byte[] bArr = yTImageData.imgData;
                    int i10 = yTImageData.width;
                    int i11 = yTImageData.height;
                    int i12 = YtFSM.getInstance().getContext().currentRotateState;
                    YTFaceTracker.TrackedFace trackedFace = this.i[0];
                    YTAGReflectLiveCheckInterface.pushImageData(bArr, i10, i11, j6, i12, trackedFace.faceShape, trackedFace.pitch, trackedFace.yaw, trackedFace.roll);
                }
            }
        } else if (!this.f15939y.isRunning() || this.f15939y.checkTimeout()) {
            this.f15939y.cancel();
            this.f15925g = l.RPT_INIT;
        } else if (this.h <= 1) {
            this.f15939y.reset();
        } else {
            YtFSM.getInstance().sendFSMEvent(new b(this));
        }
        moveToNextState();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        try {
            if (jSONObject.has("similarity_threshold")) {
                jSONObject.getInt("similarity_threshold");
            }
            if (jSONObject.has("reflect_security_level")) {
                this.f15927l = jSONObject.getInt("reflect_security_level");
            }
            if (jSONObject.has("local_config_flag")) {
                this.m = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("color_data")) {
                this.f15923b = jSONObject.getString("color_data");
            }
            if (jSONObject.has("stable_frame_num")) {
                this.f15928n = jSONObject.getInt("stable_frame_num");
            }
            if (jSONObject.has("backend_proto_type")) {
                jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("force_pose_check")) {
                this.f15931q = jSONObject.getBoolean("force_pose_check");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f15935u = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("reflect_tips_countdown_ms")) {
                this.f15939y.init(Math.max(0, Math.min(10000, jSONObject.getInt("reflect_tips_countdown_ms"))), false);
            }
            if (jSONObject.has("control_config")) {
                this.f15937w = jSONObject.getString("control_config");
            }
            this.c = jSONObject.getString("app_id");
            if (jSONObject.has("extra_config")) {
                this.f15932r = jSONObject.getString("extra_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f15933s = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("need_random_flag")) {
                this.f15934t = jSONObject.getBoolean("need_random_flag");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f15919C = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.f15920D = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f15921E = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            this.f15918B = jSONObject.optBoolean("need_angle_detect_reflection", false);
            this.f15940z = jSONObject.optBoolean("need_check_multiface", false);
        } catch (JSONException e7) {
            e7.printStackTrace();
            YtLogger.e("ReflectLivenessState", "Failed to parse json:", e7);
        }
    }

    public final void a() {
        this.f15925g = l.RPT_TIPWAIT;
        this.h = 0;
        this.f = -1;
        this.f15926k = true;
        this.j = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        YTAGReflectLiveCheckInterface.cancel();
    }

    public static Bitmap a(Bitmap bitmap, int i4, int i6) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i4 / width, i6 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public final void a(com.tencent.youtu.ytagreflectlivecheck.a aVar) {
        String str;
        if (YtFSM.getInstance().getWorkMode() == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE) {
            try {
                YTActRefImage yTActRefImage = this.f15924d.best;
                YTActReflectImage yTActReflectImage = new YTActReflectImage(yTActRefImage.image, yTActRefImage.xys, yTActRefImage.checksum);
                YTActRefImage yTActRefImage2 = this.f15924d.eye;
                YTActReflectImage yTActReflectImage2 = new YTActReflectImage(yTActRefImage2.image, yTActRefImage2.xys, yTActRefImage2.checksum);
                YTActRefImage yTActRefImage3 = this.f15924d.mouth;
                ActionReflectReq actionReflectReqA = a(aVar, new YTActReflectData(yTActReflectImage, yTActReflectImage2, new YTActReflectImage(yTActRefImage3.image, yTActRefImage3.xys, yTActRefImage3.checksum), this.e), this.f15923b);
                actionReflectReqA.app_id = this.c;
                Bitmap bitmapA = YtFSM.getInstance().getContext().imageToCompare;
                if (bitmapA != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int width = bitmapA.getWidth();
                    int height = bitmapA.getHeight();
                    int i4 = width > height ? width : height;
                    if (i4 > 640) {
                        bitmapA = a(bitmapA, (width * 640) / i4, (height * 640) / i4);
                        YtLogger.d("ReflectLivenessState", "resize image. from w:" + width + " h:" + height + " to w:" + bitmapA.getWidth() + " h:" + bitmapA.getHeight());
                    }
                    bitmapA.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
                    actionReflectReqA.compare_image = new YTImageInfo(new YTActReflectImage(byteArrayOutputStream.toByteArray(), null, null));
                }
                actionReflectReqA.color_data = this.f15923b;
                this.stateData.put("reflect_request_object", actionReflectReqA);
            } catch (Exception e7) {
                YtLogger.e("ReflectLivenessState", "Handle actref data failed:", e7);
            }
        } else {
            String str2 = this.f15923b;
            ReflectLiveReq reflectLiveReq = new ReflectLiveReq();
            reflectLiveReq.color_data = str2;
            reflectLiveReq.platform = 2;
            if (aVar != null) {
                reflectLiveReq.reflect_data = b(aVar);
                str = null;
                reflectLiveReq.live_image = null;
            } else {
                str = null;
            }
            reflectLiveReq.compare_image = str;
            reflectLiveReq.session_id = str;
            reflectLiveReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
            Bitmap bitmapA2 = YtFSM.getInstance().getContext().imageToCompare;
            if (bitmapA2 != null) {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                int width2 = bitmapA2.getWidth();
                int height2 = bitmapA2.getHeight();
                int i6 = width2 > height2 ? width2 : height2;
                if (i6 > 640) {
                    bitmapA2 = a(bitmapA2, (width2 * 640) / i6, (height2 * 640) / i6);
                    StringBuilder sbU = s.u("resize image. from w:", width2, " h:", height2, " to w:");
                    sbU.append(bitmapA2.getWidth());
                    sbU.append(" h:");
                    sbU.append(bitmapA2.getHeight());
                    YtLogger.d("ReflectLivenessState", sbU.toString());
                }
                bitmapA2.compress(Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream2);
                reflectLiveReq.compare_image = new String(Base64.encode(byteArrayOutputStream2.toByteArray(), 2));
            }
            YtLogger.d("ReflectLivenessState", "on Request...");
            reflectLiveReq.color_data = this.f15923b;
            reflectLiveReq.select_data = this.e;
            this.stateData.put("reflect_request_object", reflectLiveReq);
        }
        this.j = YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE;
    }

    public final void a(int i4, String str, String str2) {
        StringBuilder sbX = s.x("message:", str, "\ntips:", str2, "\ncode:");
        sbX.append(i4);
        YtLogger.e("ReflectLivenessState", "failed :" + sbX.toString(), null);
        String strMakeMessageJson = CommonUtils.makeMessageJson(4194304, str, str);
        YtSDKStats.getInstance().reportError(i4, str);
        HashMap<String, Object> map = new HashMap<>();
        map.put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
        map.put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
        map.put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
        if (i4 == 500) {
            strMakeMessageJson = CommonUtils.makeMessageJson(ErrorCode.YT_SDK_REFLECTION_COLOR_DATA_PARSE_ERROR, str, str);
            map.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_REFLECTION_COLOR_DATA_PARSE_ERROR));
        } else {
            map.put(StateEvent.Name.ERROR_CODE, 4194304);
        }
        map.put(StateEvent.Name.ERROR_REASON_CODE, Integer.valueOf(i4));
        map.put("message", strMakeMessageJson);
        YtFSM.getInstance().sendFSMEvent(map);
        this.f15925g = l.RPT_FINISH;
    }

    public final ActionReflectReq a(com.tencent.youtu.ytagreflectlivecheck.a aVar, YTActReflectData yTActReflectData, String str) {
        ActionReflectReq actionReflectReq = new ActionReflectReq();
        actionReflectReq.app_id = YTAGReflectLiveCheckInterface.mAppId;
        actionReflectReq.color_data = str;
        actionReflectReq.platform = 2;
        actionReflectReq.select_data = yTActReflectData.select_data;
        if (aVar != null) {
            actionReflectReq.reflect_data = b(aVar);
        }
        actionReflectReq.live_image = new YTImageInfo(yTActReflectData.best);
        actionReflectReq.eye_image = new YTImageInfo(yTActReflectData.eye);
        actionReflectReq.mouth_image = new YTImageInfo(yTActReflectData.mouth);
        actionReflectReq.compare_image = null;
        actionReflectReq.mode = 0;
        actionReflectReq.session_id = null;
        return actionReflectReq;
    }
}
