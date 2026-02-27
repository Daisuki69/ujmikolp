package com.tencent.could.huiyansdk.overseas;

import We.s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.paymaya.R;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.tencent.could.component.common.ai.eventreport.utils.DeviceInfoUtil;
import com.tencent.could.component.common.ai.log.AiLog;
import com.tencent.could.component.common.ai.log.AiLogConfig;
import com.tencent.could.component.common.ai.log.AiLogger;
import com.tencent.could.component.common.ai.utils.CloudCrashHandler;
import com.tencent.could.huiyansdk.activitys.LandMainAuthActivity;
import com.tencent.could.huiyansdk.activitys.MainAuthActivity;
import com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack;
import com.tencent.could.huiyansdk.api.HuiYanResultDataCallBack;
import com.tencent.could.huiyansdk.api.b;
import com.tencent.could.huiyansdk.api.d;
import com.tencent.could.huiyansdk.api.f;
import com.tencent.could.huiyansdk.api.g;
import com.tencent.could.huiyansdk.api.h;
import com.tencent.could.huiyansdk.api.i;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.entity.CompareResult;
import com.tencent.could.huiyansdk.entity.HuiYanBaseConfig;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.entity.LiveTypeResult;
import com.tencent.could.huiyansdk.entity.OverSeaLiveRequest;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.FaceAngleValidation;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.enums.VideoSize;
import com.tencent.could.huiyansdk.helper.b;
import com.tencent.could.huiyansdk.manager.a;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.operate.HuiYanOperateBody;
import com.tencent.could.huiyansdk.operate.a;
import com.tencent.could.huiyansdk.turing.EmptyTuringHelper;
import com.tencent.could.huiyansdk.turing.f;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import com.tencent.could.huiyansdk.utils.c;
import com.tencent.could.huiyansdk.utils.d;
import com.tencent.could.huiyansdk.utils.m;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class HuiYanOsApiImp {
    public static final String PRE_PAGE_ClASS_NAME = "com.tencent.could.huiyansdk.overseas.fragment.GuideFragment";
    public static final String TAG = "HuiYanOsApiImp";
    public HuiYanAuthEventCallBack huiYanAuthEventCallBack;
    public HuiYanOsConfig osConfig;
    public String currentToken = "";
    public boolean isNeedCleanListener = true;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation;

        static {
            int[] iArr = new int[FaceAngleValidation.values().length];
            $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation;
                FaceAngleValidation faceAngleValidation = FaceAngleValidation.LevelLoose;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$tencent$could$huiyansdk$enums$FaceAngleValidation;
                FaceAngleValidation faceAngleValidation2 = FaceAngleValidation.LevelLoose;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class HuiYanOsApiImpHolder {
        public static final HuiYanOsApiImp INSTANCE = new HuiYanOsApiImp();
    }

    private HuiYanSdkConfig changeFaceAngleValidation(HuiYanSdkConfig huiYanSdkConfig, HuiYanOsConfig huiYanOsConfig) {
        int iOrdinal = huiYanOsConfig.getFaceAngleValidation().ordinal();
        if (iOrdinal == 0) {
            huiYanSdkConfig.setOpenAngleDetect(false);
            huiYanSdkConfig.setBestImageYaw(30.0f);
            huiYanSdkConfig.setBestImageRoll(30.0f);
            return huiYanSdkConfig;
        }
        if (iOrdinal == 1) {
            huiYanSdkConfig.setOpenAngleDetect(true);
            huiYanSdkConfig.setBestImageYaw(20.0f);
            huiYanSdkConfig.setBestImageRoll(20.0f);
            return huiYanSdkConfig;
        }
        if (iOrdinal != 2) {
            return huiYanSdkConfig;
        }
        huiYanSdkConfig.setOpenAngleDetect(true);
        huiYanSdkConfig.setBestImageYaw(10.0f);
        huiYanSdkConfig.setBestImageRoll(10.0f);
        return huiYanSdkConfig;
    }

    private LiveTypeResult checkLiveData(String str) {
        try {
            return (LiveTypeResult) new j().e(str, LiveTypeResult.class);
        } catch (JsonSyntaxException unused) {
            e.a.f15688a.a(2, TAG, "");
            return null;
        }
    }

    private HuiYanSdkConfig createHuiYanConfig(HuiYanOsConfig huiYanOsConfig) {
        e.a.f15688a.a(1, TAG, "create HuiYanSdkConfig by startConfig:" + huiYanOsConfig);
        HuiYanSdkConfig huiYanSdkConfig = new HuiYanSdkConfig();
        huiYanSdkConfig.setDeleteVideoCache(huiYanOsConfig.isDeleteVideoCache());
        huiYanSdkConfig.setAuthLicense(huiYanOsConfig.getAuthLicense());
        huiYanSdkConfig.setPageColorStyle(huiYanOsConfig.getPageColorStyle());
        huiYanSdkConfig.setPrepareFaceTimeOutMs(huiYanOsConfig.getAuthTimeOutMs());
        huiYanSdkConfig.setAuthTimeOutMs(huiYanOsConfig.getAuthTimeOutMs());
        huiYanSdkConfig.setLanguageStyle(huiYanOsConfig.getLanguageStyle());
        huiYanSdkConfig.setLanguageCode(huiYanOsConfig.getLanguageCode());
        huiYanSdkConfig.setCloseEncrypt(true);
        huiYanSdkConfig.setUseBackCamera(huiYanOsConfig.isUseBackCamera());
        huiYanSdkConfig.setStartActivityContext(huiYanOsConfig.getStartActivityContext());
        huiYanSdkConfig.setOpenLog(huiYanOsConfig.isOpenLog());
        huiYanSdkConfig.setOpenFullLog(huiYanOsConfig.isOpenFullLog());
        huiYanSdkConfig.setLongCheckTimeOutMs(huiYanOsConfig.getLongCheckTimeOutMs());
        huiYanSdkConfig.setOpenCheckRiskMode(false);
        if (huiYanOsConfig.isOpenBOTCheck()) {
            huiYanSdkConfig.setOpenLongCheck(huiYanOsConfig.isOpenBOTCheck());
            huiYanSdkConfig.setNeedCropBestImageMode(huiYanOsConfig.isOpenBOTCheck());
        }
        huiYanSdkConfig.setPolicyDialogResId(R.string.txy_huiyan_pro_confirm_tips);
        huiYanSdkConfig.setShowPrivacyPolicyDialog(huiYanOsConfig.isShowPrivacyPolicyDialog());
        huiYanSdkConfig.setSmallFaceRatioThreshold(huiYanOsConfig.getSmallFaceRatioThreshold());
        huiYanSdkConfig.setBigFaceRatioThreshold(huiYanOsConfig.getBigFaceRatioThreshold());
        huiYanSdkConfig.setDisableSystemRecordScreen(huiYanOsConfig.isDisableSystemRecordScreen());
        huiYanSdkConfig.setZoomLevel(huiYanOsConfig.getZoomLevel());
        huiYanSdkConfig.setDelayTimeMsOfLoadFragment(huiYanOsConfig.getDelayTimeMsOfLoadFragment());
        huiYanSdkConfig.setRelaxed(true);
        huiYanSdkConfig.setFaceOcclusionLevel(huiYanOsConfig.getFaceOcclusionLevel());
        huiYanSdkConfig.setOtherActionCheckMouthOpen(huiYanOsConfig.isOtherActionCheckMouthOpen());
        if (huiYanOsConfig.isShowGuidePage()) {
            a.C0083a.f15662a.f15660a = PRE_PAGE_ClASS_NAME;
        } else {
            a.C0083a.f15662a.f15660a = "";
        }
        return changeFaceAngleValidation(huiYanSdkConfig, huiYanOsConfig);
    }

    private String createLiveResultString(LiveTypeResult liveTypeResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorcode", 0);
        jSONObject.put(SessionDescription.ATTR_TYPE, 2);
        jSONObject.put("data", "0");
        jSONObject.put("errormsg", "OK");
        jSONObject.put("action_data", liveTypeResult.getActionData());
        jSONObject.put("color_data", liveTypeResult.getColorData());
        jSONObject.put("select_data", new JSONObject(liveTypeResult.getSelectData()));
        return jSONObject.toString();
    }

    public static HuiYanOsApiImp getInstance() {
        return HuiYanOsApiImpHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLiveTypeRequest(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("select_data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("select_data");
                OverSeaLiveRequest overSeaLiveRequest = new OverSeaLiveRequest();
                overSeaLiveRequest.setSelectData(jSONObject2.toString());
                HuiYanResultSender.getInstance().sendConfigSuccess(new j().k(overSeaLiveRequest));
            }
        } catch (JSONException unused) {
            e.a.f15688a.a(2, TAG, "do request content error!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.tencent.could.huiyansdk.base.HuiYanBaseApi] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.tencent.could.huiyansdk.base.HuiYanBaseApi] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    private void realStartGetAuthConfigData(boolean z4, HuiYanOsConfig huiYanOsConfig, HuiYanConfigCallback huiYanConfigCallback) {
        Context startActivityContext;
        HuiYanResultSender.getInstance().setConfigCallback(huiYanConfigCallback);
        com.tencent.could.huiyansdk.operate.a aVar = a.b.f15709a;
        Map<String, Long> map = aVar.f15706b;
        if (map != null) {
            map.clear();
        }
        HuiYanOperateBody huiYanOperateBody = aVar.f15705a;
        if (huiYanOperateBody != null) {
            huiYanOperateBody.reset();
        }
        this.isNeedCleanListener = true;
        if (huiYanOsConfig != null) {
            if (huiYanOsConfig.isOpenBOTCheck()) {
                AuthUiConfig authUiConfig = huiYanOsConfig.getAuthUiConfig();
                if (authUiConfig == null) {
                    authUiConfig = new AuthUiConfig();
                }
                authUiConfig.setVideoSize(VideoSize.SIZE_720P);
                huiYanOsConfig.setAuthUiConfig(authUiConfig);
            }
            j.a.f15618a.c = huiYanOsConfig.getAuthUiConfig();
        }
        this.osConfig = huiYanOsConfig;
        HuiYanSdkConfig huiYanSdkConfigCreateHuiYanConfig = createHuiYanConfig(huiYanOsConfig);
        huiYanSdkConfigCreateHuiYanConfig.setWaitingUserCompare(z4);
        ?? A4 = HuiYanBaseApi.a.f15622a;
        Context contextA = A4.a();
        HuiYanOperateBody huiYanOperateBody2 = aVar.f15705a;
        if (huiYanOperateBody2 != null) {
            huiYanOperateBody2.setNetWorkType(c.a(contextA));
        }
        String str = this.currentToken;
        HuiYanOperateBody huiYanOperateBody3 = aVar.f15705a;
        if (huiYanOperateBody3 != null) {
            huiYanOperateBody3.setToken(str);
        }
        b bVar = new b() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.1
            @Override // com.tencent.could.huiyansdk.api.b
            public void onBuriedPointCallBack(String str2, String str3, String str4) {
            }

            @Override // com.tencent.could.huiyansdk.api.b
            public void onOperateTimeEvent(String str2, int i, boolean z5, String str3) {
                a.b.f15709a.a(str2, i, z5, str3);
            }

            @Override // com.tencent.could.huiyansdk.api.b
            public void onPrepare(d dVar) {
                e.a.f15688a.a(2, HuiYanOsApiImp.TAG, "onPrepare!");
            }

            public void onStreamRiskDataSuccess(String str2) {
                e.a.f15688a.a(2, HuiYanOsApiImp.TAG, "onStreamRiskDataSuccess!");
            }

            @Override // com.tencent.could.huiyansdk.api.b
            public void onTuringFaceDataSuccess(String str2) {
                e.a.f15688a.a(2, HuiYanOsApiImp.TAG, "onTuringFaceDataSuccess!");
            }

            @Override // com.tencent.could.huiyansdk.api.b
            public void updateOperateInfo(String str2, int i, long j, String str3) {
                a.b.f15709a.a(str2, i, j, str3);
            }
        };
        com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
        jVar.f15617g = bVar;
        f fVar = new f() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.2
            @Override // com.tencent.could.huiyansdk.api.f
            public void onCompareSuccess(String str2, String str3) throws Throwable {
                HuiYanOperateBody huiYanOperateBody4 = a.b.f15709a.f15705a;
                if (huiYanOperateBody4 != null) {
                    huiYanOperateBody4.updateInfo("LocalCheck", 1, 1L, System.currentTimeMillis());
                }
                HuiYanResultSender.getInstance().sendResultSuccess(str2, str3);
            }

            @Override // com.tencent.could.huiyansdk.api.f
            public void onFail(int i, String str2) {
                a.b.f15709a.a("LocalCheck", 1, 0L, "code: " + i + " msg: " + str2);
                HuiYanResultSender.getInstance().sendFailBackCall(i, str2);
            }

            @Override // com.tencent.could.huiyansdk.api.f
            public void onSelectSuccess(String str2) {
                e.a.f15688a.a(2, HuiYanOsApiImp.TAG, "on select success!");
                HuiYanOsApiImp.this.getLiveTypeRequest(str2);
            }
        };
        jVar.f15615b = huiYanSdkConfigCreateHuiYanConfig;
        e eVar = e.a.f15688a;
        eVar.a(1, "HuiYanSdkImp", "sdkConfig getAuthTimeOutMs:" + jVar.f15615b.getAuthTimeOutMs() + " longCheckTimeOutMs:" + jVar.f15615b.getLongCheckTimeOutMs() + " prepareFaceTimeOutMs:" + jVar.f15615b.getPrepareFaceTimeOutMs());
        boolean z5 = false;
        jVar.f15616d = false;
        jVar.j = HuiYanAuthTipsEvent.NONE;
        jVar.f = fVar;
        jVar.e = false;
        if (A4.a() == null) {
            jVar.a(233, "context is illegal!");
            return;
        }
        A4.f15620b = new i(jVar);
        d.a.f15733a.f15731a = jVar.f15615b.isOpenLog();
        HuiYanBaseConfig huiYanBaseConfig = new HuiYanBaseConfig();
        huiYanBaseConfig.setLicense(jVar.f15615b.getAuthLicense());
        huiYanBaseConfig.setLicenseStr(jVar.f15615b.getAuthLicenseStr());
        huiYanBaseConfig.setModelPath(jVar.f15615b.getUseCustomerModelPath());
        huiYanBaseConfig.setOpenCheckRiskMode(jVar.f15615b.isOpenCheckRiskMode());
        huiYanBaseConfig.setHuiYanLiveMode(jVar.f15615b.getHuiYanLiveMode());
        if (!jVar.f15615b.isOpenCheckRiskMode()) {
            com.tencent.could.huiyansdk.turing.f fVar2 = f.a.f15724a;
            A4.a();
            if (fVar2.f15720g == null || !fVar2.j) {
                eVar.a(2, "TuringSdkHelper", "init turing module with auth not get instance");
            } else {
                fVar2.c = false;
                ((EmptyTuringHelper) fVar2.f15720g).getClass();
            }
        }
        b bVar2 = jVar.f15617g;
        if (bVar2 != null) {
            bVar2.onOperateTimeEvent("StartYTAuthUseTime", 1, false, "");
        }
        A4.c = huiYanBaseConfig;
        String license = huiYanBaseConfig.getLicense();
        String licenseStr = huiYanBaseConfig.getLicenseStr();
        try {
            A4 = !TextUtils.isEmpty(license) ? b.a.f15659a.a(license, false) : !TextUtils.isEmpty(licenseStr) ? b.a.f15659a.a(licenseStr, true) : b.a.f15659a.a("", false);
        } catch (com.tencent.could.huiyansdk.exception.a e) {
            e.a.f15688a.a(2, "HuiYanBaseApi", "init error:" + e.f15628b);
            HuiYanBaseCallBack huiYanBaseCallBack = A4.f15620b;
            if (huiYanBaseCallBack != null) {
                huiYanBaseCallBack.onFail(e.f15627a, e.f15628b);
            }
            A4 = -1;
        }
        if (A4 != 0) {
            String strF = s.f(A4, "error code: ");
            com.tencent.could.huiyansdk.api.b bVar3 = jVar.f15617g;
            if (bVar3 != null) {
                bVar3.onBuriedPointCallBack("InitSDKStage", "YouTuInitError", strF);
                return;
            }
            return;
        }
        com.tencent.could.huiyansdk.api.b bVar4 = jVar.f15617g;
        if (bVar4 != null) {
            bVar4.onBuriedPointCallBack("InitSDKStage", "YouTuInitSuccess", "");
        }
        Context contextA2 = HuiYanBaseApi.a.f15622a.a();
        if (contextA2 == null) {
            jVar.a(MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK, "please call init() function first!");
            return;
        }
        HuiYanSdkConfig huiYanSdkConfig = jVar.f15615b;
        if (huiYanSdkConfig == null || (startActivityContext = huiYanSdkConfig.getStartActivityContext()) == null || !(startActivityContext instanceof Activity)) {
            z5 = true;
        } else {
            contextA2 = startActivityContext;
        }
        Intent intent = jVar.f15615b.isLandMode() ? new Intent(contextA2, (Class<?>) LandMainAuthActivity.class) : new Intent(contextA2, (Class<?>) MainAuthActivity.class);
        e.a.f15688a.a(1, "HuiYanSdkImp", "useAppContext: " + z5);
        if (z5) {
            intent.addFlags(268435456);
        }
        contextA2.startActivity(intent);
        com.tencent.could.huiyansdk.api.b bVar5 = jVar.f15617g;
        if (bVar5 != null) {
            bVar5.onBuriedPointCallBack("InitSDKStage", "HuiYanInitSuccess", "");
        }
    }

    private void sendLiveData(String str) {
        LiveTypeResult liveTypeResultCheckLiveData = checkLiveData(str);
        if (liveTypeResultCheckLiveData == null) {
            CompareResult compareResult = new CompareResult();
            compareResult.setErrorCode(MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA);
            compareResult.setErrorMsg("check liveData string error!");
            com.tencent.could.huiyansdk.api.e.a(compareResult);
            return;
        }
        try {
            com.tencent.could.huiyansdk.api.e.a(createLiveResultString(liveTypeResultCheckLiveData));
        } catch (JSONException unused) {
            e.a.f15688a.a(2, TAG, "create lightData json error!");
            CompareResult compareResult2 = new CompareResult();
            compareResult2.setErrorCode(MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA);
            compareResult2.setErrorMsg("check liveData string error!");
            com.tencent.could.huiyansdk.api.e.a(compareResult2);
        }
    }

    public String getCurrentToken() {
        return this.currentToken;
    }

    public HuiYanOsConfig getOsConfig() {
        return this.osConfig;
    }

    public void init(Context context) {
        String strP;
        com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        huiYanBaseApi.getClass();
        if (context != null) {
            huiYanBaseApi.f15619a = new WeakReference<>(context.getApplicationContext());
            Context contextA = huiYanBaseApi.a();
            huiYanBaseApi.f15621d = contextA == null ? false : com.tencent.could.huiyansdk.utils.e.a(contextA, com.tencent.could.huiyansdk.utils.e.f15735b);
            com.tencent.could.huiyansdk.utils.d dVar = d.a.f15733a;
            if (!dVar.f15732b) {
                dVar.f15732b = true;
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(externalFilesDir);
                    String str = File.separator;
                    strP = androidx.camera.core.impl.a.p(sb2, str, "cloud-huiyan", str, "log");
                } else {
                    strP = "";
                }
                if (TextUtils.isEmpty(strP)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(context.getFilesDir());
                    String str2 = File.separator;
                    strP = androidx.camera.core.impl.a.p(sb3, str2, "cloud-huiyan", str2, "log");
                }
                AiLog.init(new AiLogger(context, new AiLogConfig.AiLogConfigBuilder().setDirLog(strP).setLogCat(true).setLogName("huiyan-log").setMinLevel(3).setDefaultTag("[hy-sdk-log]").setOpen(true).setFileOutTime(259200000L).create()));
            }
            e.a.f15688a.a(1, "HuiYanBaseApi", "call huiyan init");
            a.C0082a.f15626a.c = "v1.0.8.15";
            System.loadLibrary("YTLiveness");
        }
        com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
        try {
            fVar.f = new TuringResultCacheEntity();
            fVar.c();
            fVar.f15718b = false;
        } catch (ClassNotFoundException e) {
            e = e;
            e.a.f15688a.a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            fVar.f15720g = null;
            fVar.j = false;
            fVar.c = false;
        } catch (IllegalAccessException e7) {
            e = e7;
            e.a.f15688a.a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            fVar.f15720g = null;
            fVar.j = false;
            fVar.c = false;
        } catch (InstantiationException e10) {
            e = e10;
            e.a.f15688a.a(2, "TuringSdkHelper", "create and init turing help error " + e.getLocalizedMessage());
            fVar.f15720g = null;
            fVar.j = false;
            fVar.c = false;
        }
        if (((EmptyTuringHelper) fVar.f15720g) == null) {
            throw null;
        }
        e.a.f15688a.a(1, "TuringSdkHelper", "call turing interface init finish");
        CloudCrashHandler.instance().init(context, "huiyan", true, "com.tencent.could", false);
        CloudCrashHandler.instance().addCrashListener(new h(jVar));
        a.C0082a.f15626a.c = "v1.0.9.33";
        com.tencent.could.huiyansdk.operate.a aVar = a.b.f15709a;
        aVar.getClass();
        HuiYanOperateBody huiYanOperateBody = new HuiYanOperateBody();
        aVar.f15705a = huiYanOperateBody;
        huiYanOperateBody.setDeviceModel(DeviceInfoUtil.getDeviceModel());
        aVar.f15705a.setOsVersion("android-" + Build.VERSION.SDK_INT);
        aVar.f15705a.setSdkName("HuiYanSDK_Overseas");
        aVar.f15705a.setSdkVersion("v1.0.9.33");
        HuiYanOperateBody huiYanOperateBody2 = aVar.f15705a;
        HuiYanBaseApi.a.f15622a.getClass();
        b.a.f15659a.getClass();
        huiYanOperateBody2.setYouTuVersion(YtSDKKitFramework.getInstance().version());
        aVar.f15705a.setTuringVersion(f.a.f15724a.a());
        aVar.f15705a.setDeviceToken(DeviceInfoUtil.getDeviceUuid(context));
        aVar.f15705a.setPackageName(context.getPackageName());
        String packageName = context.getPackageName();
        aVar.f15705a.setPackageName(packageName);
        try {
            aVar.f15705a.setPackageVersion(context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        } catch (PackageManager.NameNotFoundException e11) {
            e.a.f15688a.a(2, "OperateInfoManager", "get package info error: " + e11.getLocalizedMessage());
        }
        aVar.a();
    }

    public boolean isNeedCleanListener() {
        return this.isNeedCleanListener;
    }

    public void release() {
        com.tencent.could.huiyansdk.api.j jVar = j.a.f15618a;
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.a.f15622a;
        if (huiYanBaseApi.f15620b != null) {
            huiYanBaseApi.f15620b = null;
        }
        d.a.f15733a.f15732b = false;
        AiLog.release();
        e eVar = e.a.f15688a;
        synchronized (eVar.f15686b) {
            try {
                Log.e("LoggerManager", "release");
                eVar.c = null;
                a.C0082a.f15626a.f = false;
                Map<String, Integer> map = eVar.f15685a;
                if (map != null) {
                    map.clear();
                }
                if (eVar.f15687d != null) {
                    eVar.f15687d.removeCallbacksAndMessages(null);
                    eVar.f15687d = null;
                }
            } finally {
            }
        }
        com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
        eVar.a(1, "TuringSdkHelper", "call release.");
        fVar.j = false;
        if (fVar.f15720g != null) {
            ((EmptyTuringHelper) fVar.f15720g).getClass();
            fVar.f15720g = null;
        }
        if (jVar.f != null) {
            jVar.f = null;
        }
        if (jVar.f15614a != null) {
            jVar.f15614a = null;
        }
        jVar.e = false;
        m mVarA = m.a();
        if (mVarA.f15751b == null) {
            return;
        }
        mVarA.f15751b.removeCallbacksAndMessages(null);
        mVarA.f15751b = null;
        HandlerThread handlerThread = mVarA.f15750a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        mVarA.f15750a.quitSafely();
    }

    public void setAuthEventCallBack(HuiYanAuthEventCallBack huiYanAuthEventCallBack) {
        if (huiYanAuthEventCallBack == null) {
            e.a.f15688a.a(2, TAG, "error set HuiYanAuthEventCallBack is null!");
        } else {
            this.huiYanAuthEventCallBack = huiYanAuthEventCallBack;
            j.a.f15618a.f15614a = new g() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.5
                @Override // com.tencent.could.huiyansdk.api.g
                public void onAuthEvent(HuiYanAuthEvent huiYanAuthEvent) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onAuthEvent(huiYanAuthEvent);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.g
                public void onAuthTipsEvent(HuiYanAuthTipsEvent huiYanAuthTipsEvent) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onAuthTipsEvent(huiYanAuthTipsEvent);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.g
                public void onBeginTransition() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onBeginTransition();
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.g
                public void onEndTransition() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onEndTransition();
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.g
                public void onMainViewCreate(View view) {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onMainViewCreate(view);
                    }
                }

                @Override // com.tencent.could.huiyansdk.api.g
                public void onMainViewDestroy() {
                    if (HuiYanOsApiImp.this.huiYanAuthEventCallBack != null) {
                        HuiYanOsApiImp.this.huiYanAuthEventCallBack.onMainViewDestroy();
                    }
                }
            };
        }
    }

    public void setCurrentToken(String str) {
        this.currentToken = str;
    }

    public void setResultDataCallBack(HuiYanResultDataCallBack huiYanResultDataCallBack) {
        HuiYanResultSender.getInstance().setResultDataCallBack(huiYanResultDataCallBack);
    }

    public void startAuthByLightData(String str, HuiYanResultCallBack huiYanResultCallBack) {
        if (j.a.f15618a.e) {
            e.a.f15688a.a(2, TAG, "current process is stopped！");
            return;
        }
        HuiYanResultSender.getInstance().setResultCallBack(huiYanResultCallBack);
        if (str != null) {
            sendLiveData(CommonUtils.base64DecodeToString(str));
            return;
        }
        e.a.f15688a.a(2, TAG, "lightData == null");
        CompareResult compareResult = new CompareResult();
        compareResult.setErrorCode(MfaTencentErrorResult.TENCENT_ERROR_APP_STOP);
        compareResult.setErrorMsg("app stop auth!");
        com.tencent.could.huiyansdk.api.e.a(compareResult);
    }

    public void startGetAuthConfigData(HuiYanOsConfig huiYanOsConfig, HuiYanConfigCallback huiYanConfigCallback) {
        realStartGetAuthConfigData(false, huiYanOsConfig, huiYanConfigCallback);
    }

    public void startHuiYanAuth(String str, HuiYanOsConfig huiYanOsConfig, HuiYanOsAuthCallBack huiYanOsAuthCallBack) {
        this.currentToken = str;
        e.a.f15688a.a(1, TAG, "startHuiYanAuth with: " + this.currentToken);
        HuiYanResultSender.getInstance().setAuthCallBack(huiYanOsAuthCallBack);
        j.a.f15618a.h = new com.tencent.could.huiyansdk.api.c() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.3
            @Override // com.tencent.could.huiyansdk.api.c
            public String getCurrentToken() {
                return HuiYanOsApiImp.this.currentToken;
            }

            @Override // com.tencent.could.huiyansdk.api.c
            public AnimationDrawable getWaitingAnimation() {
                return c.a(HuiYanBaseApi.a.f15622a.a().getResources());
            }
        };
        realStartGetAuthConfigData(true, huiYanOsConfig, new HuiYanConfigCallback() { // from class: com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp.4
            @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
            public void onFail(int i, String str2) {
                HuiYanResultSender.getInstance().sendAuthOnFail(i, str2);
            }

            @Override // com.tencent.could.huiyansdk.overseas.HuiYanConfigCallback
            public void onSuccess(String str2) {
                HuiYanResultSender.getInstance().sendAuthGetLive(str2);
            }
        });
        this.isNeedCleanListener = false;
    }
}
