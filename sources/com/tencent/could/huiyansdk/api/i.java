package com.tencent.could.huiyansdk.api;

import android.text.TextUtils;
import com.tencent.could.huiyansdk.base.HuiYanBaseCallBack;
import com.tencent.could.huiyansdk.entity.HuiYanSdkConfig;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanLiveMode;
import com.tencent.could.huiyansdk.helper.b;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.CommonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class i implements HuiYanBaseCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f15613a;

    public i(j jVar) {
        this.f15613a = jVar;
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void a() {
        b.C0084b.f15678a.a(AuthState.ON_EXIT_BOT, (Object) null);
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void b(String str) {
        e.a.f15688a.a(2, "HuiYanSdkImp", "get compare result data.");
        this.f15613a.getClass();
        b.C0084b.f15678a.a(str);
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void c() {
        b.C0084b.f15678a.a(AuthState.ON_ENTRY_BOT, (Object) null);
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void onFail(int i, String str) {
        this.f15613a.getClass();
        CommonUtils.closeCurrentFragment();
        this.f15613a.a(i, str);
        String str2 = "code: " + i + " msg: " + str;
        b bVar = this.f15613a.f15617g;
        if (bVar != null) {
            bVar.onBuriedPointCallBack("InitSDKStage", "HuiYanInitError", str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void onOperateTimeEvent(String str, int i, boolean z4, String str2) {
        b bVar = this.f15613a.f15617g;
        if (bVar != null) {
            bVar.onOperateTimeEvent(str, i, z4, str2);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void updateOperateInfo(String str, int i, long j, String str2) {
        b bVar = this.f15613a.f15617g;
        if (bVar != null) {
            bVar.updateOperateInfo(str, i, j, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.HashMap<java.lang.String, java.lang.Object> r13) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.huiyansdk.api.i.a(java.util.HashMap):void");
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void b() {
        int[] iArrChangeActions;
        int iOrdinal;
        j jVar = this.f15613a;
        HuiYanSdkConfig huiYanSdkConfig = jVar.f15615b;
        if (huiYanSdkConfig != null) {
            try {
                com.tencent.could.huiyansdk.helper.b bVar = b.a.f15659a;
                bVar.a("change_point_num", huiYanSdkConfig.getChangePointNum());
                int i = 1;
                e.a.f15688a.a(1, "HuiYanSdkImp", "update you tu config!");
                bVar.c = huiYanSdkConfig.isOpenFullLog();
                bVar.a("timeout_countdown_ms", huiYanSdkConfig.getAuthTimeOutMs());
                try {
                    iOrdinal = huiYanSdkConfig.getPackageTest().ordinal();
                } catch (Exception unused) {
                }
                long j = (iOrdinal == 0 || iOrdinal == 1) ? 8L : 20L;
                bVar.a("action_frame_num", j);
                com.tencent.could.huiyansdk.helper.b bVar2 = b.a.f15659a;
                bVar2.a("secondary_roll_threshold", huiYanSdkConfig.getBestImageRoll());
                bVar2.a("secondary_yaw_threshold", huiYanSdkConfig.getBestImageYaw());
                bVar2.a("secondary_pitch_threshold", huiYanSdkConfig.getBestImagePitch());
                bVar2.a("continuous_angle_num_threshold", jVar.f15615b.getBestImageContinuousFrameNum());
                bVar2.b("need_angle_detect_reflection", huiYanSdkConfig.isOpenAngleDetect());
                bVar2.a("bigface_ratio_threshold", huiYanSdkConfig.getBigFaceRatioThreshold());
                if (huiYanSdkConfig.isOpenAngleDetect()) {
                    bVar2.b("correction_angle_action_type", "1,5");
                } else if (bVar2.f15657a != null) {
                    String strA = bVar2.a();
                    if (bVar2.f15657a.has(strA)) {
                        JSONObject jSONObject = bVar2.f15657a.getJSONObject(strA);
                        jSONObject.remove("correction_angle_action_type");
                        bVar2.f15657a.put(strA, jSONObject);
                    }
                }
                if (huiYanSdkConfig.isLandMode()) {
                    bVar2.a("screen_orientation", 1L);
                    bVar2.a("smallface_ratio_threshold", huiYanSdkConfig.getLandCloseRatio());
                } else {
                    bVar2.a("screen_orientation", 0L);
                    bVar2.a("smallface_ratio_threshold", huiYanSdkConfig.getPortraitCloseRatio());
                }
                if (huiYanSdkConfig.isOpenLongCheck()) {
                    bVar2.b("need_face_quality", true);
                    bVar2.b("need_local_face_best_image", true);
                    bVar2.a("local_face_best_image_quality", huiYanSdkConfig.getLongCheckBestImageQuality());
                    if (huiYanSdkConfig.isLongCheckUseLocalCloseMouthThreshold()) {
                        bVar2.b("need_local_close_mouth_threshold", true);
                    }
                    if (huiYanSdkConfig.isNeedCropBestImageMode()) {
                        bVar2.a("quality_face_real_min_height_threshold", huiYanSdkConfig.getLongCheckFaceRealMinHeightThreshold());
                    } else {
                        bVar2.a("quality_face_real_min_height_threshold", huiYanSdkConfig.getLongCheckFaceMinHeightThreshold());
                    }
                    bVar2.a("continuous_quality_num_threshold", 10L);
                }
                if (huiYanSdkConfig.isUseBestFaceImage()) {
                    bVar2.b("need_face_quality", true);
                    bVar2.b("need_local_face_best_image", false);
                }
                if (huiYanSdkConfig.isOpenLongCheck() || huiYanSdkConfig.isUseBestFaceImage()) {
                    bVar2.a("quality_face_max_height_threshold", huiYanSdkConfig.getLongCheckFaceMaxHeightThreshold());
                    bVar2.a("quality_face_min_height_threshold", huiYanSdkConfig.getLongCheckFaceMinHeightThreshold());
                    bVar2.a("quality_close_mouth_threshold", huiYanSdkConfig.getLongCheckCloseMouthThreshold());
                    bVar2.a("quality_close_eye_right_threshold", huiYanSdkConfig.getLongCheckCloseEyeRightThreshold());
                    bVar2.a("quality_close_eye_left_threshold", huiYanSdkConfig.getLongCheckCloseEyeLeftThreshold());
                }
                if (huiYanSdkConfig.isUseBackCamera()) {
                    bVar2.a("rear_camera_tag", 1L);
                }
                bVar2.a("need_best_original_size", huiYanSdkConfig.getLongCheckNeedBestOriginalSize());
                String useCustomerModelPath = huiYanSdkConfig.getUseCustomerModelPath();
                if (bVar2 != null) {
                    if (TextUtils.isEmpty(useCustomerModelPath)) {
                        e.a.f15688a.a(1, "YouTuSdkHelper", "no need load model!");
                    } else {
                        bVar2.b("resource_online", true);
                        if (!useCustomerModelPath.endsWith("/")) {
                            useCustomerModelPath = useCustomerModelPath.concat("/");
                        }
                        bVar2.b("resource_download_path", useCustomerModelPath);
                    }
                    HuiYanLiveMode huiYanLiveMode = huiYanSdkConfig.getHuiYanLiveMode();
                    if (huiYanLiveMode == HuiYanLiveMode.ACTION_REFLECT_MODE) {
                        bVar2.b("need_encrypt", !huiYanSdkConfig.isCloseEncrypt());
                        if (!huiYanSdkConfig.isCloseEncrypt()) {
                            bVar2.a("enhance_encrypt_method", huiYanSdkConfig.getEncryptMode().ordinal() != 1 ? 0 : 1);
                        }
                    }
                    bVar2.b("relaxed_shelter_threshold", huiYanSdkConfig.isRelaxed());
                    int iOrdinal2 = jVar.f15615b.getFaceOcclusionLevel().ordinal();
                    if (iOrdinal2 == 1) {
                        i = 2;
                    } else if (iOrdinal2 == 2) {
                        i = 3;
                    } else if (iOrdinal2 == 3) {
                        i = 4;
                    }
                    bVar2.a("shelter_judge_level", i);
                    bVar2.b("need_pose_check_mouth_open", huiYanSdkConfig.isOtherActionCheckMouthOpen());
                    if (huiYanLiveMode == HuiYanLiveMode.ACTION_MODE && (iArrChangeActions = CommonUtils.changeActions(huiYanSdkConfig.getActions())) != null) {
                        bVar2.a("action_default_seq", iArrChangeActions);
                    }
                } else {
                    throw null;
                }
            } catch (Exception unused2) {
                e.a.f15688a.a(2, "HuiYanSdkImp", "update you tu config error!");
            }
        }
        b bVar3 = this.f15613a.f15617g;
        if (bVar3 != null) {
            bVar3.onOperateTimeEvent("StartYTAuthUseTime", 2, false, "");
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void a(int i, boolean z4, boolean z5) {
        HuiYanAuthEvent huiYanAuthEvent;
        j jVar = this.f15613a;
        jVar.getClass();
        switch (i) {
            case 1:
                huiYanAuthEvent = !z4 ? HuiYanAuthEvent.BLINK_CHECK : HuiYanAuthEvent.BLINK_CHECK_DONE;
                break;
            case 2:
                huiYanAuthEvent = !z4 ? HuiYanAuthEvent.OPEN_MOUTH_CHECK : HuiYanAuthEvent.OPEN_MOUTH_CHECK_DONE;
                break;
            case 3:
                huiYanAuthEvent = !z4 ? HuiYanAuthEvent.NOD_HEAD_CHECK : HuiYanAuthEvent.NOD_HEAD_CHECK_DONE;
                break;
            case 4:
                huiYanAuthEvent = !z4 ? HuiYanAuthEvent.SHAKE_HEAD_CHECK : HuiYanAuthEvent.SHAKE_HEAD_CHECK_DONE;
                break;
            case 5:
                huiYanAuthEvent = !z4 ? HuiYanAuthEvent.SILENCE_CHECK : HuiYanAuthEvent.SILENCE_CHECK_DONE;
                break;
            case 6:
                huiYanAuthEvent = HuiYanAuthEvent.ALL_ACTION_DONE;
                break;
            default:
                huiYanAuthEvent = HuiYanAuthEvent.NONE;
                break;
        }
        jVar.a(huiYanAuthEvent, z5);
        if (z4) {
            return;
        }
        com.tencent.could.huiyansdk.manager.b bVar = b.C0084b.f15678a;
        if (bVar.f15665d) {
            bVar.a(AuthState.ON_ENTRY_OTHER_ACTION, (Object) null);
        }
    }

    @Override // com.tencent.could.huiyansdk.base.HuiYanBaseCallBack
    public void a(String str) {
        j jVar = this.f15613a;
        if (jVar.e) {
            e.a.f15688a.a(2, "HuiYanSdkImp", "ConfigDataSuccess but isCurrentFinish is ture!");
            return;
        }
        f fVar = jVar.f;
        if (fVar != null) {
            fVar.onSelectSuccess(str);
        }
    }
}
