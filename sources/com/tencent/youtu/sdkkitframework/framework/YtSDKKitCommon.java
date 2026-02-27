package com.tencent.youtu.sdkkitframework.framework;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class YtSDKKitCommon {

    public static class ProcessHelper {
        public static float[] calcEyeScore(float[] fArr) {
            float f = fArr[32] - fArr[40];
            float f3 = fArr[33] - fArr[41];
            float fSqrt = (float) Math.sqrt((f3 * f3) + (f * f));
            float f7 = fArr[44];
            float f10 = fArr[40];
            float f11 = fArr[45];
            float f12 = fArr[41];
            float fAbs = (Math.abs(crossProduct(f, f3, fArr[36] - f10, fArr[37] - f12)) + Math.abs(crossProduct(f, f3, f7 - f10, f11 - f12))) / (fSqrt * fSqrt);
            float f13 = fArr[56] - fArr[48];
            float f14 = fArr[57] - fArr[49];
            float fSqrt2 = (float) Math.sqrt((f14 * f14) + (f13 * f13));
            float f15 = fArr[60];
            float f16 = fArr[48];
            float f17 = fArr[61];
            float f18 = fArr[49];
            return new float[]{fAbs, (Math.abs(crossProduct(f13, f14, fArr[52] - f16, fArr[53] - f18)) + Math.abs(crossProduct(f13, f14, f15 - f16, f17 - f18))) / (fSqrt2 * fSqrt2)};
        }

        public static float calcMouthScore(float[] fArr) {
            return Math.abs(((fArr[129] + fArr[109]) / 2.0f) - ((fArr[119] + fArr[97]) / 2.0f)) / Math.abs(fArr[90] - fArr[102]);
        }

        public static float[] convert90PTo5P(float[] fArr) {
            YtLogger.d("ProcessHelper", "90 to 5 convert size:" + fArr.length);
            return new float[]{fArr[176], fArr[177], fArr[178], fArr[179], fArr[64], fArr[65], fArr[90], fArr[91], fArr[102], fArr[103]};
        }

        public static float crossProduct(float f, float f3, float f7, float f10) {
            return (f * f10) - (f7 * f3);
        }

        public static float preCheckCloseEyeScore(float[] fArr) {
            float f = fArr[32] - fArr[40];
            float f3 = fArr[33] - fArr[41];
            float fSqrt = (float) Math.sqrt((f3 * f3) + (f * f));
            float f7 = fArr[44];
            float f10 = fArr[40];
            float f11 = fArr[45];
            float f12 = fArr[41];
            float fAbs = (Math.abs(crossProduct(f, f3, fArr[36] - f10, fArr[37] - f12)) + Math.abs(crossProduct(f, f3, f7 - f10, f11 - f12))) / (fSqrt * fSqrt);
            float f13 = fArr[56] - fArr[48];
            float f14 = fArr[57] - fArr[49];
            float fSqrt2 = (float) Math.sqrt((f14 * f14) + (f13 * f13));
            float f15 = fArr[60];
            float f16 = fArr[48];
            float f17 = fArr[61];
            float f18 = fArr[49];
            float fAbs2 = (Math.abs(crossProduct(f13, f14, fArr[52] - f16, fArr[53] - f18)) + Math.abs(crossProduct(f13, f14, f15 - f16, f17 - f18))) / (fSqrt2 * fSqrt2);
            return fAbs > fAbs2 ? fAbs2 : fAbs;
        }
    }

    public static class StateNameHelper {
        public static HashMap<StateClassName, String> _stateNameMap = new HashMap<StateClassName, String>() { // from class: com.tencent.youtu.sdkkitframework.framework.YtSDKKitCommon.StateNameHelper.1
            {
                put(StateClassName.UNKNOWN_STATE, "com.tencent.youtu.sdkkitframework.liveness.Unknown");
                put(StateClassName.TIMEOUT_STATE, "com.tencent.youtu.sdkkitframework.framework.TimeoutState");
                put(StateClassName.IDLE_STATE, "com.tencent.youtu.sdkkitframework.framework.IdleState");
                put(StateClassName.SILENT_STATE, "com.tencent.youtu.sdkkitframework.liveness.SilentLivenessState");
                put(StateClassName.QUALITY_STATE, "com.tencent.youtu.sdkkitframework.liveness.FaceQualityState");
                put(StateClassName.ACTION_STATE, "com.tencent.youtu.sdkkitframework.liveness.ActionLivenessState");
                put(StateClassName.REFLECT_STATE, "com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState");
                put(StateClassName.OCR_AUTO_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardAutoDetectState");
                put(StateClassName.OCR_MANUAL_DETECT_STATE, "com.tencent.youtu.sdkkitframework.ocr.OcrCardManualDetectState");
                put(StateClassName.NET_FETCH_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetFetchState");
                put(StateClassName.NET_LIVENESS_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState");
                put(StateClassName.NET_OCR_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.ocr.NetOcrReqResultState");
                put(StateClassName.DETECTONLY_STATE, "com.tencent.youtu.sdkkitframework.liveness.DetectOnlyState");
                put(StateClassName.OCR_VIID_STATE, "com.tencent.youtu.sdkkitframework.viid.OcrVideoIdentState");
                put(StateClassName.NET_VIID_REQ_RESULT_STATE, "com.tencent.youtu.sdkkitframework.viid.NetOcrReqResultState");
            }
        };

        public enum StateClassName {
            UNKNOWN_STATE,
            TIMEOUT_STATE,
            IDLE_STATE,
            SILENT_STATE,
            QUALITY_STATE,
            ACTION_STATE,
            REFLECT_STATE,
            OCR_AUTO_DETECT_STATE,
            OCR_MANUAL_DETECT_STATE,
            NET_FETCH_STATE,
            NET_LIVENESS_REQ_RESULT_STATE,
            NET_OCR_REQ_RESULT_STATE,
            NET_VIID_REQ_RESULT_STATE,
            DETECTONLY_STATE,
            OCR_VIID_STATE,
            STATE_COUNT
        }

        public static String classNameOfState(StateClassName stateClassName) {
            return _stateNameMap.get(stateClassName);
        }

        public static StateClassName typeOfClassName(String str) {
            for (Map.Entry<StateClassName, String> entry : _stateNameMap.entrySet()) {
                if (entry.getValue().equals(str)) {
                    return entry.getKey();
                }
            }
            return StateClassName.UNKNOWN_STATE;
        }
    }
}
