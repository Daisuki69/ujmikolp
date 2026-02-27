package com.tencent.youtu.sdkkitframework.liveness;

import We.s;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Base64;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.EncryptUtil;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.OperateInfoManager;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YTImageData;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import com.tencent.youtu.sdkkitframework.liveness.YtLivenessNetProtoHelper;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ActionReflectReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.ReflectLiveReq;
import com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo;
import com.tencent.youtu.ytposedetect.data.ActionData;
import com.tencent.youtu.ytposedetect.jni.YTPoseDetectJNIInterface;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class NetLivenessReqResultState extends YtFSMBaseState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15908a;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15910d;
    public YTImageData e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15909b = "";
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15911g = 70;
    public HashMap<String, String> h = new HashMap<>();
    public JSONObject i = null;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15912k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f15913l = "";
    public String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15914n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15915o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15916p = 0;

    public class a extends HashMap<String, Object> {
        public a(NetLivenessReqResultState netLivenessReqResultState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    public class b extends HashMap<String, Object> {
        public b(NetLivenessReqResultState netLivenessReqResultState) {
            put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.NET_REQ);
        }
    }

    public static void a(NetLivenessReqResultState netLivenessReqResultState) {
        if (netLivenessReqResultState.f) {
            try {
                YtFSM ytFSM = YtFSM.getInstance();
                YtSDKKitCommon.StateNameHelper.StateClassName stateClassName = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
                ytFSM.getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)).handleStateAction("reset_manual_trigger", null);
                if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName)) == -1) {
                    netLivenessReqResultState.sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(stateClassName));
                }
            } catch (Exception e) {
                String str = "on Check response manual failed " + e.getLocalizedMessage();
                YtLogger.e("NetLivenessReqResultState", "on Check response manual failed", e);
                YtSDKStats.getInstance().reportInfo(str);
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        String strMakeReflectLiveReq;
        String str;
        String str2;
        String str3;
        String str4;
        String strGenerateSMReq;
        super.enter();
        if (this.isPause.get()) {
            YtFSM.getInstance().sendFSMEvent(new a(this));
            try {
                Thread.sleep(30L);
            } catch (InterruptedException e) {
                YtLogger.e("NetLivenessReqResultState", "Thread sleep error", e);
            }
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_LIVENESS_REQ_RESULT_STATE));
            return;
        }
        YtFSM.getInstance().sendFSMEvent(new b(this));
        int iOrdinal = YtFSM.getInstance().getWorkMode().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            CommonUtils.benchMarkBegin("make_pack_use_time");
            YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            if (stateByName == null) {
                YtSDKStats.getInstance().reportInfo("action request action state is null");
                YtLogger.e("NetLivenessReqResultState", "action request action state is null", null);
                return;
            }
            try {
                this.e = (YTImageData) stateByName.getStateDataBy("best_frame");
                String str5 = stateByName.getStateDataBy("frames") instanceof String ? (String) stateByName.getStateDataBy("frames") : new String(Base64.encode(((ActionData) stateByName.getStateDataBy("frames")).video, 2));
                String strA = a((String[]) stateByName.getStateDataBy("action_seq"));
                a();
                YtLivenessNetProtoHelper.ActionLiveReqData actionLiveReqData = new YtLivenessNetProtoHelper.ActionLiveReqData();
                YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData = new YtLivenessNetProtoHelper.NetBaseInfoData();
                actionLiveReqData.baseInfo = netBaseInfoData;
                netBaseInfoData.appId = this.f15908a;
                netBaseInfoData.sessionId = UUID.randomUUID().toString();
                actionLiveReqData.bestImage = new String(Base64.encode(this.e.imgData, 2));
                actionLiveReqData.actionStr = strA;
                actionLiveReqData.actionVideo = str5;
                actionLiveReqData.needEyeDetect = true;
                actionLiveReqData.needMouthDetect = true;
                actionLiveReqData.reflectConfig = this.f15913l;
                actionLiveReqData.controlConfig = this.m;
                actionLiveReqData.colorNum = this.f15914n;
                String strMakeActionLiveReq = YtLivenessNetProtoHelper.makeActionLiveReq(actionLiveReqData);
                OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time"));
                YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.c, strMakeActionLiveReq, null, new h(this));
                return;
            } catch (Exception e7) {
                YtLogger.e("NetLivenessReqResultState", "action request failed", e7);
                YtSDKStats.getInstance().reportInfo("action request failed: " + e7.getLocalizedMessage());
                YtFSM.getInstance().sendFSMEvent(new i(this, e7));
                return;
            }
        }
        if (iOrdinal == 4) {
            CommonUtils.benchMarkBegin("make_pack_use_time");
            CommonUtils.benchMarkBegin("reflect_request_s1");
            YtFSMBaseState stateByName2 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE));
            YTImageData yTImageData = (YTImageData) stateByName2.getStateDataBy("best_image");
            this.e = yTImageData;
            byte[] bArrEncode = Base64.encode(yTImageData.imgData, 2);
            this.stateData.put("best_frame", this.e);
            YtFSMBaseState stateByName3 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            YtFSMBaseState stateByName4 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            ReflectLiveReq reflectLiveReq = (ReflectLiveReq) stateByName3.getStateDataBy("reflect_request_object");
            String str6 = (String) stateByName4.getStateDataBy("extra_config");
            if (str6 != null) {
                this.f15913l = str6;
            }
            String str7 = (String) stateByName3.getStateDataBy("refcontrol_begin");
            if (str7 != null) {
                StringBuilder sb2 = new StringBuilder();
                String str8 = this.f15913l;
                this.f15913l = s.q(sb2, str8 != null ? str8 : "", " refcontrol_begin ", str7);
            }
            String str9 = (String) stateByName4.getStateDataBy("cp_num");
            if (str9 != null) {
                this.f15914n = Integer.parseInt(str9);
            }
            reflectLiveReq.session_id = UUID.randomUUID().toString();
            YtLivenessNetProtoHelper.ReflectLiveReqData reflectLiveReqData = new YtLivenessNetProtoHelper.ReflectLiveReqData();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData2 = new YtLivenessNetProtoHelper.NetBaseInfoData();
            reflectLiveReqData.baseInfo = netBaseInfoData2;
            netBaseInfoData2.appId = this.f15908a;
            netBaseInfoData2.sessionId = UUID.randomUUID().toString();
            reflectLiveReqData.baseInfo.businessId = this.h.containsKey("business_id") ? this.h.get("business_id") : null;
            reflectLiveReqData.baseInfo.personId = this.h.containsKey("person_id") ? this.h.get("person_id") : null;
            reflectLiveReqData.baseInfo.personType = this.h.containsKey("person_type") ? this.h.get("person_type") : null;
            reflectLiveReqData.baseInfo.reqType = this.h.containsKey("req_type") ? this.h.get("req_type") : null;
            reflectLiveReqData.baseInfo.liveType = this.h.containsKey("live_type") ? Integer.parseInt(this.h.get("live_type")) : 0;
            reflectLiveReqData.colorData = reflectLiveReq.color_data;
            reflectLiveReqData.liveImage = new String(bArrEncode);
            reflectLiveReqData.reflectData = reflectLiveReq.reflect_data;
            reflectLiveReqData.config = this.f15913l;
            reflectLiveReqData.colorNum = this.f15914n;
            if (this.j == 2) {
                YuvImage yuvImage = (YuvImage) stateByName2.getStateDataBy("best_image");
                float[] fArr = (float[]) stateByName2.getStateDataBy("best_shape");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yuvImage.compressToJpeg(new Rect(0, 0, this.e.getWidth(), this.e.getHeight()), 95, byteArrayOutputStream);
                reflectLiveReqData.bestImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream.toByteArray(), fArr, (String) null);
                YuvImage yuvImage2 = (YuvImage) stateByName2.getStateDataBy("openmouth_image");
                float[] fArr2 = (float[]) stateByName2.getStateDataBy("openmouth_shape");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                yuvImage2.compressToJpeg(new Rect(0, 0, yuvImage2.getWidth(), yuvImage2.getHeight()), 95, byteArrayOutputStream2);
                reflectLiveReqData.openMouthImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream2.toByteArray(), fArr2, (String) null);
                YuvImage yuvImage3 = (YuvImage) stateByName2.getStateDataBy("closeeye_image");
                float[] fArr3 = (float[]) stateByName2.getStateDataBy("closeeye_shape");
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                yuvImage3.compressToJpeg(new Rect(0, 0, yuvImage3.getWidth(), yuvImage3.getHeight()), 95, byteArrayOutputStream3);
                reflectLiveReqData.closeEyeImage = new YtLivenessNetProtoHelper.ImageInfo(byteArrayOutputStream3.toByteArray(), fArr3, (String) null);
                strMakeReflectLiveReq = YtLivenessNetProtoHelper.makePersonLiveReq(reflectLiveReqData);
            } else {
                strMakeReflectLiveReq = YtLivenessNetProtoHelper.makeReflectLiveReq(reflectLiveReqData);
            }
            String str10 = strMakeReflectLiveReq;
            YtLogger.d("NetLivenessReqResultState", "begin request...uploadsize " + str10.length());
            CommonUtils.benchMarkEnd("reflect_request_s1");
            CommonUtils.benchMarkBegin("reflect_request_s2");
            OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time"));
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.c, str10, null, new j(this));
            return;
        }
        if (iOrdinal != 5) {
            return;
        }
        try {
            CommonUtils.benchMarkBegin("make_pack_use_time");
            YtFSMBaseState stateByName5 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
            YtFSMBaseState stateByName6 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.ACTION_STATE));
            YTImageData yTImageData2 = (YTImageData) stateByName6.getStateDataBy("best_frame");
            this.e = yTImageData2;
            this.stateData.put("best_frame", yTImageData2);
            YtFSMBaseState stateByName7 = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.REFLECT_STATE));
            ActionReflectReq actionReflectReq = (ActionReflectReq) stateByName7.getStateDataBy("reflect_request_object");
            if (stateByName6.getStateDataBy("frames") instanceof String) {
                str2 = stateByName6.getStateDataBy("frames").toString();
                str3 = null;
                str = null;
            } else {
                ActionData actionData = (ActionData) stateByName6.getStateDataBy("frames");
                String str11 = actionData.videoMD;
                str = actionData.sdMD;
                byte[] bArr = actionData.video;
                if (bArr == null) {
                    YtLogger.w("NetLivenessReqResultState", "action data is null", null);
                    str3 = str11;
                    str2 = null;
                } else {
                    str2 = new String(Base64.encode(bArr, 2));
                    str3 = str11;
                    str = str;
                }
            }
            String str12 = (String) stateByName5.getStateDataBy("control_config");
            if (str12 != null) {
                this.m = str12;
            }
            String str13 = (String) stateByName5.getStateDataBy("extra_config");
            if (str13 != null) {
                this.f15913l = str13;
                YtLogger.d("NetLivenessReqResultState", "extraconfig:" + this.f15913l);
            }
            String str14 = (String) stateByName7.getStateDataBy("refcontrol_begin");
            if (str14 != null) {
                StringBuilder sb3 = new StringBuilder();
                String str15 = this.f15913l;
                if (str15 == null) {
                    str15 = "";
                }
                sb3.append(str15);
                sb3.append(" refcontrol_begin ");
                sb3.append(str14);
                this.f15913l = sb3.toString();
            }
            String str16 = (String) stateByName5.getStateDataBy("cp_num");
            if (str16 != null) {
                this.f15914n = Integer.parseInt(str16);
                YtLogger.d("NetLivenessReqResultState", "cpnum:" + this.f15914n);
            }
            a();
            String strA2 = a((String[]) stateByName6.getStateDataBy("action_seq"));
            YtLivenessNetProtoHelper.ActionReflectLiveReqData actionReflectLiveReqData = new YtLivenessNetProtoHelper.ActionReflectLiveReqData();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData3 = new YtLivenessNetProtoHelper.NetBaseInfoData();
            actionReflectLiveReqData.baseInfo = netBaseInfoData3;
            netBaseInfoData3.sessionId = UUID.randomUUID().toString();
            YtLivenessNetProtoHelper.NetBaseInfoData netBaseInfoData4 = actionReflectLiveReqData.baseInfo;
            netBaseInfoData4.appId = this.f15908a;
            str4 = "";
            netBaseInfoData4.businessId = str4;
            actionReflectLiveReqData.colorData = actionReflectReq.color_data;
            actionReflectLiveReqData.actionVideo = str2 != null ? str2 : "";
            actionReflectLiveReqData.actionStr = strA2;
            YTImageInfo yTImageInfo = actionReflectReq.eye_image;
            actionReflectLiveReqData.eyeImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo.image, yTImageInfo.five_points, yTImageInfo.checksum);
            YTImageInfo yTImageInfo2 = actionReflectReq.mouth_image;
            actionReflectLiveReqData.mouthImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo2.image, yTImageInfo2.five_points, yTImageInfo2.checksum);
            YTImageInfo yTImageInfo3 = actionReflectReq.live_image;
            actionReflectLiveReqData.liveImage = new YtLivenessNetProtoHelper.ImageInfo(yTImageInfo3.image, yTImageInfo3.five_points, yTImageInfo3.checksum);
            actionReflectLiveReqData.reflectData = actionReflectReq.reflect_data;
            actionReflectLiveReqData.baseInfo.lux = actionReflectReq.select_data.android_data.lux;
            actionReflectLiveReqData.reflectConfig = this.f15913l;
            actionReflectLiveReqData.controlConfig = this.m;
            actionReflectLiveReqData.colorNum = this.f15914n;
            String version = YTPoseDetectJNIInterface.getVersion();
            if (str3 != null) {
                actionReflectLiveReqData.config = "videochecksum=" + str3 + "&&client_version=" + version;
            } else {
                actionReflectLiveReqData.config = "client_version=" + version;
            }
            String strMakeActionReflectLiveReq = YtLivenessNetProtoHelper.makeActionReflectLiveReq(actionReflectLiveReqData, str3, str);
            YtFSM.getInstance().sendFSMEvent(new k(this, str, str3));
            if (this.i != null) {
                try {
                    JSONObject jSONObject = new JSONObject(strMakeActionReflectLiveReq);
                    Iterator<String> itKeys = this.i.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, this.i.get(next));
                    }
                    strMakeActionReflectLiveReq = jSONObject.toString();
                } catch (JSONException e10) {
                    YtLogger.e("NetLivenessReqResultState", "lipread net request parse json failed ", e10);
                }
            }
            if (this.f15915o) {
                EncryptUtil encryptUtil = new EncryptUtil();
                int i = this.f15916p;
                if (i == 0) {
                    strGenerateSMReq = encryptUtil.generateEncReq(strMakeActionReflectLiveReq, this.f15908a, this.f15909b, "config");
                } else if (i == 1) {
                    strGenerateSMReq = encryptUtil.generateSMReq(strMakeActionReflectLiveReq, this.f15908a, this.f15909b);
                }
                strMakeActionReflectLiveReq = strGenerateSMReq;
            }
            String str17 = strMakeActionReflectLiveReq;
            OperateInfoManager.getInstance().setPackUseTime(CommonUtils.benchMarkEnd("make_pack_use_time"));
            YtFSM.getInstance().sendNetworkRequest(StringCode.NET_REPORTING, this.c, str17, null, new l(this));
        } catch (Exception e11) {
            YtLogger.e("NetLivenessReqResultState", "actrefl request failed", e11);
            YtSDKStats.getInstance().reportInfo("actrefl request failed: " + e11.getLocalizedMessage());
            YtFSM.getInstance().sendFSMEvent(new f(this, e11));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        try {
            this.f15908a = jSONObject.getString("app_id");
            String string = jSONObject.getString("result_api_url");
            this.c = string;
            if (string == null) {
                YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "yt_param_error");
                YtLogger.e("NetLivenessReqResultState", "parse url failed", null);
                return;
            }
            if (jSONObject.has("secret_key")) {
                jSONObject.getString("secret_key");
            }
            if (jSONObject.has("secret_id")) {
                jSONObject.getString("secret_id");
            }
            if (jSONObject.has("user_id")) {
                jSONObject.getString("user_id");
            }
            if (jSONObject.has("similarity_threshold")) {
                this.f15911g = jSONObject.getInt("similarity_threshold");
            }
            if (jSONObject.has("final_liveness_confidence_threshold")) {
                this.f15910d = jSONObject.getInt("final_liveness_confidence_threshold");
            } else {
                this.f15910d = 85;
            }
            if (jSONObject.has("extra_config")) {
                this.f15913l = jSONObject.getString("extra_config");
            } else {
                this.f15913l = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.m = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f15914n = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("request_options")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("request_options");
                this.i = jSONObject2;
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.h.put(next, this.i.getString(next));
                }
            }
            if (jSONObject.has("backend_proto_type")) {
                this.j = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("need_encrypt")) {
                this.f15915o = jSONObject.getBoolean("need_encrypt");
            }
            if (jSONObject.has("session_id")) {
                this.f15909b = jSONObject.getString("session_id");
            }
            if (jSONObject.has("enhance_encrypt_method")) {
                this.f15916p = jSONObject.getInt("enhance_encrypt_method");
            }
            if (jSONObject.has("resource_online")) {
                this.f15912k = jSONObject.getBoolean("resource_online");
            }
            if (!this.f15912k && this.f15915o && this.f15916p == 1) {
                FileUtils.loadLibrary("TencentSM");
            }
        } catch (JSONException e) {
            YtLogger.e("NetLivenessReqResultState", "Failed to parse json:", e);
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void unload() {
        super.unload();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState r18, java.util.HashMap r19, java.lang.Exception r20) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.a(com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState, java.util.HashMap, java.lang.Exception):void");
    }

    public final void a() {
        if (this.m.isEmpty()) {
            return;
        }
        String[] strArrSplit = this.m.split("&");
        if (strArrSplit.length > 0) {
            for (String str : strArrSplit) {
                String[] strArrSplit2 = str.split("=");
                if (strArrSplit2.length > 1 && strArrSplit2[0].equals("actref_ux_mode")) {
                    Integer.parseInt(strArrSplit2[1]);
                }
            }
        }
    }

    public final String a(String[] strArr) {
        String strI = "";
        for (int i = 0; i < strArr.length; i++) {
            int i4 = Integer.parseInt(strArr[i]);
            if (i4 == 0 || i4 == 1) {
                strI = s.i(strI, "blink");
            } else if (i4 == 2) {
                strI = s.i(strI, "mouth");
            } else if (i4 == 3) {
                strI = s.i(strI, "node");
            } else if (i4 == 4) {
                strI = s.i(strI, "shake");
            } else if (i4 == 5) {
                strI = s.i(strI, "silence");
            }
            if (i != strArr.length - 1) {
                strI = s.i(strI, ",");
            }
        }
        return strI;
    }
}
