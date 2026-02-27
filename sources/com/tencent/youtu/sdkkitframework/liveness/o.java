package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Rect;
import android.util.Base64;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f16018a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f16019b = 0;
    public static float c = 0.8f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static float f16020d = 0.8f;
    public static float e = 0.95f;
    public static float f = 0.95f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static float f16021g = 0.95f;

    public static String a(int i) {
        return i == 4 ? StringCode.FL_INCOMPLETE_FACE : i == 2 ? StringCode.FL_POSE_CLOSER : i == 3 ? StringCode.FL_POSE_FARER : i == 5 ? StringCode.FL_POSE_INCORRECT : i == 1 ? StringCode.FL_NO_FACE : i == 6 ? StringCode.FL_POSE_OPEN_EYE : i == 8 ? StringCode.FL_INCOMPLETE_FACE : i == 7 ? StringCode.FL_TOO_MANY_FACES : StringCode.FL_POSE_KEEP;
    }

    public static String b(int i) {
        return i == 1 ? StringCode.FL_NO_LEFT_FACE : i == 2 ? StringCode.FL_NO_CHIN : i == 3 ? StringCode.FL_NO_MOUTH : i == 4 ? StringCode.FL_NO_RIGHT_FACE : i == 5 ? StringCode.FL_NO_NOSE : i == 6 ? StringCode.FL_NO_RIGHT_EYE : i == 7 ? StringCode.FL_NO_LEFT_EYE : "";
    }

    public static YTFaceTracker.TrackedFace[] a(YTFaceTracker.TrackedFace[] trackedFaceArr) {
        int i = 14;
        int i4 = 0;
        while (i4 < trackedFaceArr.length) {
            YTFaceTracker.TrackedFace trackedFace = trackedFaceArr[i4];
            float[] fArr = trackedFace.faceShape;
            float[] fArr2 = new float[180];
            int[] iArr = {0, 4, 18, 19, 7, 8, 10, 11, 12, 14, 15, 21, 20};
            int i6 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i6 < 32) {
                fArr2[i10] = fArr[i11];
                i6++;
                i11++;
                i10++;
            }
            int i12 = 0;
            while (i12 < 32) {
                fArr2[i10] = fArr[i11];
                i12++;
                i11++;
                i10++;
            }
            float[] fArr3 = new float[44];
            int i13 = 0;
            while (i13 < 44) {
                fArr3[i13] = fArr[i11];
                i13++;
                i11++;
            }
            fArr3[16] = (fArr3[16] + fArr3[18]) / 2.0f;
            float f3 = fArr3[19];
            fArr3[19] = (f3 + f3) / 2.0f;
            fArr3[28] = (fArr3[28] + fArr3[26]) / 2.0f;
            fArr3[29] = (fArr3[29] + fArr3[27]) / 2.0f;
            for (int i14 = 0; i14 < 13; i14++) {
                int i15 = i10 + 1;
                int i16 = iArr[i14];
                fArr2[i10] = fArr3[i16 * 2];
                i10 += 2;
                fArr2[i15] = fArr3[(i16 * 2) + 1];
            }
            int i17 = 0;
            while (i17 < 44) {
                fArr2[i10] = fArr[i11];
                i17++;
                i11++;
                i10++;
            }
            int i18 = 0;
            while (i18 < 82) {
                if ((i18 / 2) % 2 != 1) {
                    fArr2[i10] = fArr[i11];
                    i10++;
                }
                i18++;
                i11++;
            }
            int i19 = 0;
            while (i19 < i) {
                i19++;
                i11++;
            }
            int i20 = 0;
            while (i20 < 4) {
                fArr2[i10] = fArr[i11];
                i20++;
                i11++;
                i10++;
            }
            trackedFace.faceShape = fArr2;
            YTFaceTracker.TrackedFace trackedFace2 = trackedFaceArr[i4];
            float[] fArr4 = trackedFace2.faceVisible;
            float[] fArr5 = new float[90];
            int[] iArr2 = {0, 4, 18, 19, 7, 8, 10, 11, 12, 14, 15, 21, 20};
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i21 < 16) {
                fArr5[i22] = fArr4[i23];
                i21++;
                i23++;
                i22++;
            }
            int i24 = 0;
            while (i24 < 16) {
                fArr5[i22] = fArr4[i23];
                i24++;
                i23++;
                i22++;
            }
            float[] fArr6 = new float[22];
            int i25 = i;
            int i26 = 0;
            while (i26 < 22) {
                fArr6[i26] = fArr4[i23];
                i26++;
                i23++;
            }
            fArr6[8] = (fArr6[8] + fArr6[9]) / 2.0f;
            fArr6[i25] = (fArr6[i25] + fArr6[13]) / 2.0f;
            int i27 = 0;
            while (i27 < 13) {
                fArr5[i22] = fArr6[iArr2[i27]];
                i27++;
                i22++;
            }
            int i28 = 0;
            while (i28 < 22) {
                fArr5[i22] = fArr4[i23];
                i28++;
                i23++;
                i22++;
            }
            int i29 = 0;
            while (i29 < 41) {
                if (i29 % 2 != 1) {
                    fArr5[i22] = fArr4[i23];
                    i22++;
                }
                i29++;
                i23++;
            }
            int i30 = 0;
            while (i30 < 7) {
                i30++;
                i23++;
            }
            int i31 = 0;
            while (i31 < 2) {
                fArr5[i22] = fArr4[i23];
                i31++;
                i23++;
                i22++;
            }
            trackedFace2.faceVisible = fArr5;
            i4++;
            i = i25;
        }
        return trackedFaceArr;
    }

    public static Rect a(YTFaceTracker.TrackedFace trackedFace) {
        float[] fArr = trackedFace.faceShape;
        float f3 = fArr[0];
        float fMax = fArr[1];
        float fMin = f3;
        float fMax2 = fMin;
        float fMin2 = fMax;
        for (int i = 0; i < 180; i += 2) {
            fMin = Math.min(fMin, trackedFace.faceShape[i]);
            fMax2 = Math.max(fMax2, trackedFace.faceShape[i]);
            int i4 = i + 1;
            fMin2 = Math.min(fMin2, trackedFace.faceShape[i4]);
            fMax = Math.max(fMax, trackedFace.faceShape[i4]);
        }
        int i6 = f16018a;
        float f7 = i6 - 1;
        float f10 = f7 - fMin;
        float f11 = f7 - fMax2;
        float f12 = (float) (((double) f11) - ((((double) (f10 - f11)) * 0.1d) / 2.0d));
        float f13 = (float) (((((double) (f10 - f12)) * 0.1d) / 2.0d) + ((double) f10));
        float f14 = (float) (((double) fMin2) - ((((double) (fMax - fMin2)) * 0.1d) / 2.0d));
        float f15 = (float) (((((double) (fMax - f14)) * 0.1d) / 2.0d) + ((double) fMax));
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        float f16 = i6 - 1;
        if (f12 > f16) {
            f12 = f16;
        }
        float f17 = i6 - 1;
        if (f13 > f17) {
            f13 = f17;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        int i10 = f16019b;
        float f18 = i10 - 1;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = i10 - 1;
        if (f15 > f19) {
            f15 = f19;
        }
        Rect rect = new Rect();
        rect.left = (int) f12;
        rect.top = (int) f14;
        rect.right = (int) f13;
        rect.bottom = (int) f15;
        return rect;
    }

    public static Rect a(Rect rect, Rect rect2) {
        return new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom));
    }

    public static int a(float[] fArr) {
        if (fArr == null) {
            YtLogger.e("o", "[YTFaceTraceInterface.blockJudge] input pointsVis is null.", null);
            return -1;
        }
        if (fArr.length != 90) {
            YtLogger.e("o", "[YTFaceTraceInterface.blockJudge] input pointsVis.length != 90. current pointsVis.length: " + fArr.length, null);
            return -2;
        }
        int i = 0;
        for (int i4 = 33; i4 <= 45; i4++) {
            if (fArr[i4 - 1] < c) {
                i++;
            }
        }
        if (i >= 4) {
            StringBuffer stringBuffer = new StringBuffer("[");
            for (int i6 = 33; i6 <= 45; i6++) {
                int i10 = i6 - 1;
                if (fArr[i10] < c) {
                    stringBuffer.append(i10);
                    stringBuffer.append(Global.HYPHEN);
                    stringBuffer.append(fArr[i10]);
                    stringBuffer.append(",");
                }
            }
            stringBuffer.append("]");
            YtLogger.o("o", a("SHELTER_NOSE", stringBuffer.toString(), c).toString());
            return 5;
        }
        int i11 = 0;
        for (int i12 = 46; i12 <= 67; i12++) {
            if (fArr[i12 - 1] < f16020d) {
                i11++;
            }
        }
        if (i11 >= 4) {
            StringBuffer stringBuffer2 = new StringBuffer("[");
            for (int i13 = 46; i13 <= 67; i13++) {
                int i14 = i13 - 1;
                if (fArr[i14] < f16020d) {
                    stringBuffer2.append(i14);
                    stringBuffer2.append(Global.HYPHEN);
                    stringBuffer2.append(fArr[i14]);
                    stringBuffer2.append(",");
                }
            }
            stringBuffer2.append("]");
            YtLogger.o("o", a("SHELTER_MOUTH", stringBuffer2.toString(), f16020d).toString());
            return 3;
        }
        int i15 = 0;
        for (int i16 = 9; i16 <= 16; i16++) {
            if (fArr[i16 - 1] < 0.9f) {
                i15++;
            }
        }
        for (int i17 = 25; i17 <= 32; i17++) {
            if (fArr[i17 - 1] < 0.9f) {
                i15++;
            }
        }
        if (fArr[89] < 0.7f) {
            i15++;
        }
        if (i15 >= 4) {
            return 6;
        }
        int i18 = 0;
        for (int i19 = 1; i19 <= 8; i19++) {
            if (fArr[i19 - 1] < 0.9f) {
                i18++;
            }
        }
        for (int i20 = 17; i20 <= 24; i20++) {
            if (fArr[i20 - 1] < 0.9f) {
                i18++;
            }
        }
        if (fArr[88] < 0.9f) {
            i18++;
        }
        if (i18 >= 4) {
            return 7;
        }
        int i21 = 0;
        for (int i22 = 68; i22 < 74; i22++) {
            if (fArr[i22 - 1] < e) {
                i21++;
            }
        }
        if (i21 >= 3) {
            StringBuffer stringBuffer3 = new StringBuffer("[");
            for (int i23 = 68; i23 < 74; i23++) {
                int i24 = i23 - 1;
                if (fArr[i24] < e) {
                    stringBuffer3.append(i24);
                    stringBuffer3.append(Global.HYPHEN);
                    stringBuffer3.append(fArr[i24]);
                    stringBuffer3.append(",");
                }
            }
            stringBuffer3.append("]");
            YtLogger.o("o", a("SHELTER_LEFT_FACE", stringBuffer3.toString(), e).toString());
            return 1;
        }
        int i25 = 0;
        for (int i26 = 82; i26 <= 88; i26++) {
            if (fArr[i26 - 1] < f) {
                i25++;
            }
        }
        if (i25 >= 3) {
            StringBuffer stringBuffer4 = new StringBuffer("[");
            for (int i27 = 82; i27 <= 88; i27++) {
                int i28 = i27 - 1;
                if (fArr[i28] < f) {
                    stringBuffer4.append(i28);
                    stringBuffer4.append(Global.HYPHEN);
                    stringBuffer4.append(fArr[i28]);
                    stringBuffer4.append(",");
                }
            }
            stringBuffer4.append("]");
            YtLogger.o("o", a("SHELTER_RIGHT_FACE", stringBuffer4.toString(), f).toString());
            return 4;
        }
        int i29 = 0;
        for (int i30 = 75; i30 <= 81; i30++) {
            if (fArr[i30 - 1] < f16021g) {
                i29++;
            }
        }
        if (i29 < 3) {
            return 0;
        }
        StringBuffer stringBuffer5 = new StringBuffer("[");
        for (int i31 = 75; i31 <= 81; i31++) {
            int i32 = i31 - 1;
            if (fArr[i32] < f16021g) {
                stringBuffer5.append(i32);
                stringBuffer5.append(Global.HYPHEN);
                stringBuffer5.append(fArr[i32]);
                stringBuffer5.append(Global.SEMICOLON);
            }
        }
        stringBuffer5.append("]");
        YtLogger.o("o", a("SHELTER_CHIN", stringBuffer5.toString(), f16021g).toString());
        return 2;
    }

    public static boolean a(YTFaceTracker.TrackedFace trackedFace, float f3, float f7, float f10) {
        float fAbs = Math.abs(trackedFace.yaw);
        float fAbs2 = Math.abs(trackedFace.pitch);
        float fAbs3 = Math.abs(trackedFace.roll);
        boolean z4 = fAbs <= f3 && fAbs2 <= f7 && fAbs3 <= f10;
        if (!z4) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("face_angle_force_check_result", false);
                jSONObject2.put("angle_yaw", fAbs);
                jSONObject2.put("angle_pitch", fAbs2);
                jSONObject2.put("angle_roll", fAbs3);
                jSONObject2.put("angle_yaw_thr", f3);
                jSONObject2.put("angle_pitch_thr", f7);
                jSONObject2.put("angle_roll_thr", f10);
                jSONObject.put("TraceType", "FaceAngleForceCheck");
                jSONObject.put("TraceData", jSONObject2);
            } catch (JSONException e7) {
                YtLogger.e("o", "make log json error", e7);
            }
            YtLogger.o("o", jSONObject);
        }
        return z4;
    }

    public static JSONArray a(Rect rect) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(rect.left);
        jSONArray.put(rect.top);
        jSONArray.put(rect.right);
        jSONArray.put(rect.bottom);
        return jSONArray;
    }

    public static JSONArray a(float[] fArr, boolean z4) {
        JSONArray jSONArray = new JSONArray();
        for (float f3 : fArr) {
            if (z4) {
                f3 *= 100.0f;
            }
            jSONArray.put(Math.round(f3));
        }
        return jSONArray;
    }

    public static String a(YTFaceTracker.TrackedFace[] trackedFaceArr, int i, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TraceType", "FaceTracker");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("detect_rect", a(YtSDKKitFramework.getInstance().getDetectRect()));
            jSONObject2.put("pose_state", i4);
            jSONObject2.put("shelter_state", i);
            JSONArray jSONArray = new JSONArray();
            jSONObject2.put("faces", jSONArray);
            if (trackedFaceArr != null) {
                for (YTFaceTracker.TrackedFace trackedFace : trackedFaceArr) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONArray.put(jSONObject3);
                    jSONObject3.put("frameId", trackedFace.frameId);
                    jSONObject3.put("traceId", trackedFace.traceId);
                    jSONObject3.put("rect", a(trackedFace.faceRect));
                    jSONObject3.put("points", a(trackedFace.faceShape, false));
                    jSONObject3.put("visible", a(trackedFace.faceVisible, true));
                    jSONObject3.put("angle_r", trackedFace.roll);
                    jSONObject3.put("angle_p", trackedFace.pitch);
                    jSONObject3.put("angle_y", trackedFace.yaw);
                }
            }
            jSONObject.put("TraceData", jSONObject2);
            YtLogger.d("o", "TraceJson: " + jSONObject);
            jSONObject.put("TraceData", Base64.encodeToString(a(jSONObject2.toString()), 2));
        } catch (JSONException e7) {
            YtLogger.e("o", "make log info error", e7);
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:15:0x0032 */
    public static byte[] a(String str) throws Throwable {
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        OutputStream outputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(str.getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                gZIPOutputStream.close();
                                return byteArray;
                            } catch (IOException e7) {
                                YtLogger.e("o", " gzip.close(): ", e7);
                                return byteArray;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            YtLogger.e("o", "compress Exception e: ", e);
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e11) {
                                    YtLogger.e("o", " gzip.close(): ", e11);
                                }
                            }
                            return null;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        gZIPOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e13) {
                                YtLogger.e("o", " gzip.close(): ", e13);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream2 = outputStream;
            }
        }
        return null;
    }

    public static String a(String str, String str2, float f3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("quality_type", str);
            jSONObject.put("quality_score", str2);
            jSONObject.put("quality_thr", f3);
        } catch (JSONException e7) {
            YtLogger.e("o", "make log json error", e7);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("TraceType", "FaceQuality");
            jSONObject2.put("TraceData", jSONObject);
        } catch (JSONException e10) {
            YtLogger.e("o", "make log info error", e10);
        }
        return jSONObject2.toString();
    }
}
