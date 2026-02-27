package com.tencent.youtu.sdkkitframework.liveness;

import android.text.TextUtils;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSdkConfig;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FaceQualityState extends YtFSMBaseState {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f15892q = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public YtSDKKitCommon.StateNameHelper.StateClassName f15893a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15898l;
    public int m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15894b = 25.0f;
    public float c = 25.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15895d = 25.0f;
    public float e = 0.6f;
    public float f = 0.1f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15896g = 0.95f;
    public float h = 0.25f;
    public float i = 0.25f;
    public float j = 0.25f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15899n = 99;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15900o = 90;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15901p = false;

    public class a extends HashMap<String, Object> {
        public a(FaceQualityState faceQualityState) {
            put(StateEvent.Name.FSM_STATE_PAUSE, YtSDKKitCommon.StateNameHelper.StateClassName.QUALITY_STATE);
            put(StateEvent.Name.UI_TIPS, StringCode.MSG_FSM_PAUSE);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f15902a;

        public b(byte[] bArr, int i, int i4) {
            this.f15902a = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.tencent.youtu.liveness.YTFaceTracker.TrackedFace r12, float r13, float r14) {
        /*
            r11 = this;
            java.lang.String r0 = "FaceQualityState"
            java.lang.String r1 = "x:"
            android.graphics.Rect r2 = r12.faceRect
            int r2 = r2.height()
            android.graphics.Rect r3 = r12.faceRect
            int r3 = r3.width()
            float r4 = r11.e
            float r5 = r14 * r4
            float r2 = (float) r2
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r6 = 1
            if (r5 >= 0) goto Lc1
            float r5 = r13 / r14
            float r7 = r2 / r14
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 >= 0) goto L34
            float r8 = r11.f
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 >= 0) goto L34
            float r7 = r7 - r8
            float r4 = r4 - r8
            float r7 = r7 / r4
            double r7 = (double) r7
            r9 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r7 = r7 * r9
            float r4 = (float) r7
            goto L37
        L34:
            r4 = 1008981770(0x3c23d70a, float:0.01)
        L37:
            r7 = 1058810102(0x3f1c28f6, float:0.61)
            float r4 = r4 + r7
            float r2 = r2 / r4
            float r5 = r5 * r2
            float r3 = (float) r3
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 <= 0) goto L43
            r5 = r3
        L43:
            android.graphics.Rect r3 = r12.faceRect
            int r3 = r3.width()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            android.graphics.Rect r7 = r12.faceRect
            int r8 = r7.left
            float r8 = (float) r8
            float r3 = r3 + r8
            int r7 = r7.height()
            float r7 = (float) r7
            float r7 = r7 / r4
            android.graphics.Rect r12 = r12.faceRect
            int r12 = r12.top
            float r12 = (float) r12
            float r7 = r7 + r12
            float r12 = r2 / r4
            float r7 = r7 - r12
            float r12 = r5 / r4
            float r3 = r3 - r12
            float r12 = r5 + r3
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L7b
            float r12 = r2 + r7
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L7b
            r12 = 0
            int r13 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r13 <= 0) goto L7b
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 <= 0) goto L7b
            goto L7c
        L7b:
            r6 = 0
        L7c:
            if (r6 != 0) goto Lc1
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r13 = "quality_type"
            java.lang.String r14 = "face_not_center"
            r12.put(r13, r14)     // Catch: org.json.JSONException -> Lb4
            java.lang.String r13 = "quality_score"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lb4
            r14.<init>(r1)     // Catch: org.json.JSONException -> Lb4
            r14.append(r3)     // Catch: org.json.JSONException -> Lb4
            java.lang.String r1 = ",y:"
            r14.append(r1)     // Catch: org.json.JSONException -> Lb4
            r14.append(r7)     // Catch: org.json.JSONException -> Lb4
            java.lang.String r1 = "height:"
            r14.append(r1)     // Catch: org.json.JSONException -> Lb4
            r14.append(r2)     // Catch: org.json.JSONException -> Lb4
            java.lang.String r1 = ",width:"
            r14.append(r1)     // Catch: org.json.JSONException -> Lb4
            r14.append(r5)     // Catch: org.json.JSONException -> Lb4
            java.lang.String r14 = r14.toString()     // Catch: org.json.JSONException -> Lb4
            r12.put(r13, r14)     // Catch: org.json.JSONException -> Lb4
            goto Lba
        Lb4:
            r13 = move-exception
            java.lang.String r14 = "make log json error"
            com.tencent.youtu.sdkkitframework.common.YtLogger.e(r0, r14, r13)
        Lba:
            java.lang.String r12 = r12.toString()
            com.tencent.youtu.sdkkitframework.common.YtLogger.o(r0, r12)
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.FaceQualityState.a(com.tencent.youtu.liveness.YTFaceTracker$TrackedFace, float, float):boolean");
    }

    public final boolean b(YTFaceTracker.TrackedFace trackedFace) {
        float[] fArr = trackedFace.faceShape;
        float fAbs = Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / Math.abs(fArr[90] - fArr[102]);
        boolean z4 = fAbs < this.j;
        if (!z4) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("quality_type", "mouth_cLose");
                jSONObject.put("quality_score", fAbs);
                jSONObject.put("quality_thr", this.j);
            } catch (JSONException e) {
                YtLogger.e("FaceQualityState", "make log json error", e);
            }
            YtLogger.o("FaceQualityState", jSONObject.toString());
        }
        return z4;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enter() {
        super.enter();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void enterFirst() {
        YtLogger.o("FaceQualityState", makeStateInfo("FaceQualityState", 1));
        YtFSMBaseState stateByName = YtFSM.getInstance().getStateByName(YtSDKKitCommon.StateNameHelper.classNameOfState(YtSDKKitCommon.StateNameHelper.StateClassName.NET_FETCH_STATE));
        if (stateByName == null) {
            return;
        }
        String str = (String) stateByName.getStateDataBy("control_config");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length > 1 && strArrSplit[0].equals("quality_close_mouth_threshold")) {
                this.j = Float.parseFloat(strArrSplit[1]);
            }
            if (strArrSplit.length > 1 && strArrSplit[0].equals("compress_pose_image_score")) {
                int i = Integer.parseInt(strArrSplit[1]);
                this.f15899n = i;
                if (i < 80) {
                    this.f15899n = 80;
                } else if (i > 100) {
                    this.f15899n = 99;
                }
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void exit() {
        super.exit();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void loadStateWith(String str, JSONObject jSONObject, YtSdkConfig ytSdkConfig) {
        super.loadStateWith(str, jSONObject, ytSdkConfig);
        this.f15893a = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
        this.m = 0;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void moveToNextState() {
        super.moveToNextState();
        if (this.f15893a != YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE) {
            YtFSM.getInstance().transitNow(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f15893a));
        } else if (YtFSM.getInstance().transitNextRound(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f15893a)) == -1) {
            sendFSMTransitError(YtSDKKitCommon.StateNameHelper.classNameOfState(this.f15893a));
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void reset() {
        super.reset();
        this.m = 0;
        this.f15893a = YtSDKKitCommon.StateNameHelper.StateClassName.SILENT_STATE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf  */
    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(com.tencent.youtu.sdkkitframework.common.YTImageData r17, long r18) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.sdkkitframework.liveness.FaceQualityState.update(com.tencent.youtu.sdkkitframework.common.YTImageData, long):void");
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState
    public void updateSDKSetting(JSONObject jSONObject) {
        String str;
        String str2;
        super.updateSDKSetting(jSONObject);
        try {
            if (jSONObject.has("quality_close_eye_left_threshold")) {
                str = "need_close_timeout";
                str2 = "quality_face_real_min_height_threshold";
                this.h = (float) jSONObject.getDouble("quality_close_eye_left_threshold");
            } else {
                str = "need_close_timeout";
                str2 = "quality_face_real_min_height_threshold";
            }
            if (jSONObject.has("quality_close_eye_right_threshold")) {
                this.i = (float) jSONObject.getDouble("quality_close_eye_right_threshold");
            }
            if (jSONObject.has("quality_close_mouth_threshold")) {
                this.j = (float) jSONObject.getDouble("quality_close_mouth_threshold");
            }
            if (jSONObject.has("quality_face_min_height_threshold")) {
                this.e = (float) jSONObject.getDouble("quality_face_min_height_threshold");
            }
            if (jSONObject.has("quality_face_max_height_threshold")) {
                this.f15896g = (float) jSONObject.getDouble("quality_face_max_height_threshold");
            }
            if (jSONObject.has("secondary_yaw_threshold")) {
                this.f15894b = (float) jSONObject.getDouble("secondary_yaw_threshold");
            }
            if (jSONObject.has("secondary_pitch_threshold")) {
                this.c = (float) jSONObject.getDouble("secondary_pitch_threshold");
            }
            if (jSONObject.has("secondary_roll_threshold")) {
                this.f15895d = (float) jSONObject.getDouble("secondary_roll_threshold");
            }
            if (jSONObject.has("need_face_quality")) {
                this.f15897k = jSONObject.getBoolean("need_face_quality");
            }
            if (jSONObject.has("need_local_face_best_image")) {
                this.f15898l = jSONObject.getBoolean("need_local_face_best_image");
            }
            if (jSONObject.has("local_face_best_image_quality")) {
                this.f15900o = jSONObject.getInt("local_face_best_image_quality");
            }
            if (jSONObject.has("continuous_quality_num_threshold")) {
                f15892q = jSONObject.getInt("continuous_quality_num_threshold");
            }
            String str3 = str2;
            if (jSONObject.has(str3)) {
                this.f = (float) jSONObject.getDouble(str3);
            }
            String str4 = str;
            if (jSONObject.has(str4)) {
                this.f15901p = jSONObject.getBoolean(str4);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final boolean a(YTFaceTracker.TrackedFace trackedFace) {
        float[] fArr = trackedFace.faceShape;
        float f = fArr[32] - fArr[40];
        float f3 = fArr[33] - fArr[41];
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f * f));
        float f7 = fArr[36] - fArr[44];
        float f10 = fArr[37] - fArr[45];
        float fSqrt2 = ((float) Math.sqrt((f10 * f10) + (f7 * f7))) / fSqrt;
        float f11 = fArr[56] - fArr[48];
        float f12 = fArr[57] - fArr[49];
        float fSqrt3 = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        float f13 = fArr[52] - fArr[60];
        float f14 = fArr[53] - fArr[61];
        float fSqrt4 = ((float) Math.sqrt((f14 * f14) + (f13 * f13))) / fSqrt3;
        boolean z4 = fSqrt2 > this.h && fSqrt4 > this.i;
        if (!z4) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("quality_type", "eye_close");
                jSONObject.put("quality_score", fSqrt2 + "," + fSqrt4);
                jSONObject.put("quality_thr", this.h + "," + this.i);
            } catch (JSONException e) {
                YtLogger.e("FaceQualityState", "make log json error", e);
            }
            YtLogger.o("FaceQualityState", jSONObject.toString());
        }
        return z4;
    }

    public final void a(String str, String str2) {
        YtFSM.getInstance().sendFSMEvent(androidx.media3.datasource.cache.c.q(StateEvent.Name.UI_ACTION, str, StateEvent.Name.UI_TIPS, str2));
    }
}
