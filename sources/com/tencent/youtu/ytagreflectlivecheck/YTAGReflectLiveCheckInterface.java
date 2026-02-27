package com.tencent.youtu.ytagreflectlivecheck;

import We.s;
import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.hardware.Camera;
import android.text.TextUtils;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import com.tencent.youtu.sdkkitframework.liveness.ReflectLivenessState;
import com.tencent.youtu.ytagreflectlivecheck.jni.JNIUtils;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.DataPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.FullPack;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class YTAGReflectLiveCheckInterface {
    public static int ERRCODE_GET_ACTREFLECTDATA_FAILED = 4;
    public static int ERRCODE_JNI_DETECT_FAILED = 3;
    public static int ERRCODE_JSON_DECODE_FAILED = 2;
    public static int ERRCODE_NET_RETURN_PARSE_NULL = 0;
    public static int ERRCODE_UPLOAD_VIDEO_FAILED = 1;
    public static final String TAG = "YoutuLightLiveCheck";
    public static final String VERSION = "3.6.9.2";
    public static String mAppId = "";
    public static Camera mCamera;
    public static int mCameraRotatedTag;
    public static LightLiveCheckResult mCheckResult;
    public static String mColorSeq;
    public static int mOnGetValueCount;
    public static IYTReflectListener mReflectListener;
    public static com.tencent.youtu.ytagreflectlivecheck.notice.a mReflectNotice;
    public static int mState;
    public static YTAGReflectSettings mAGSettings = new YTAGReflectSettings();
    public static int mInitModel = 0;
    public static Lock initLock = new ReentrantLock();
    public static int mOverlayAlpha = 0;

    public interface IYTReflectListener {
        float onGetAppBrightness();

        void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f);

        void onReflectStart(long j);
    }

    public interface LightLiveCheckResult {
        public static final int AUTH_FAILED = 1;
        public static final int COLOR_DATA_ERROR = 500;
        public static final int FINISH_ERRORBASE = 300;
        public static final int INIT_ERROR = 400;
        public static final int INIT_ERRORBASE = 100;
        public static final int NOT_INIT_MODEL = 2;
        public static final int NOT_SET_RGBREQUEST = 4;
        public static final int NOT_SET_UPLOADREQUEST = 5;
        public static final int REFLECT_ERRORBASE = 200;
        public static final int SUCCESS = 0;
        public static final int USER_CANCEL = 3;

        void onFailed(int i, String str, String str2);

        void onReflectLiveImgData(RawImgData rawImgData);

        void onSuccess(a aVar);
    }

    public interface LightLiveProcessState {
        public static final int GET_RGBCONFIG = 1;
        public static final int HANGUP = 0;
        public static final int REFLECTING = 2;
        public static final int UPLOAD = 3;
    }

    public interface YTSAFETYLEVEL {
        public static final int SAFETY_HIGH = 2;
        public static final int SAFETY_LOW = 1;
        public static final int SAFETY_RECOMMEND = 0;
    }

    public static void cancel() {
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "[YTAGReflectLiveCheckInterface.cancel] --- ");
        YTAGReflectLiveCheckJNIInterface.getInstance().FRRelease();
    }

    public static YTAGReflectSettings getAGSettings() {
        return mAGSettings;
    }

    public static IYTReflectListener getReflectListener() {
        return mReflectListener;
    }

    public static synchronized int initModel(String str, String str2) {
        int i;
        try {
            try {
                try {
                    initLock.lock();
                    if (mInitModel > 0) {
                        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "initModel repeated calls.");
                    } else {
                        mAppId = str;
                        if (str == null) {
                            mAppId = "";
                        }
                    }
                    mInitModel++;
                    initLock.unlock();
                    i = 0;
                } catch (Exception e) {
                    YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "initModel failed. message: " + Log.getStackTraceString(e));
                    initLock.unlock();
                    i = -1;
                }
                YTAGReflectLiveCheckJNIInterface.SetPipelineVersion(str2);
            } catch (Throwable th2) {
                initLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return i;
    }

    public static void onCameraChanged(int i) {
        Log.d("YoutuLightLiveCheck", "on Camera changed " + i);
        try {
            Camera.Parameters parameters = mCamera.getParameters();
            parameters.setExposureCompensation(i);
            mCamera.setParameters(parameters);
        } catch (Exception e) {
            Log.e("YoutuLightLiveCheck", "on camera changed failed:" + Log.getStackTraceString(e));
        }
    }

    public static int[] onFetchCameraInfo() {
        int minExposureCompensation;
        int exposureCompensation;
        int maxExposureCompensation = 0;
        try {
            Camera.Parameters parameters = mCamera.getParameters();
            exposureCompensation = parameters.getExposureCompensation();
            try {
                try {
                    String str = parameters.get("iso");
                    if (!TextUtils.isEmpty(str)) {
                        exposureCompensation = Integer.parseInt(str);
                    }
                } catch (Exception e) {
                    Log.d("YoutuLightLiveCheck", "on fectch camera compoensation failed:" + Log.getStackTraceString(e));
                }
                minExposureCompensation = parameters.getMinExposureCompensation();
            } catch (Exception e7) {
                e = e7;
                minExposureCompensation = 0;
                Log.d("YoutuLightLiveCheck", "on fectch camera info failed:" + Log.getStackTraceString(e));
                StringBuilder sbU = s.u("on fetch camera exp:", exposureCompensation, " min:", minExposureCompensation, " max:");
                sbU.append(maxExposureCompensation);
                Log.d("YoutuLightLiveCheck", sbU.toString());
                return new int[]{exposureCompensation, minExposureCompensation, maxExposureCompensation};
            }
            try {
                maxExposureCompensation = parameters.getMaxExposureCompensation();
            } catch (Exception e10) {
                e = e10;
                Log.d("YoutuLightLiveCheck", "on fectch camera info failed:" + Log.getStackTraceString(e));
            }
        } catch (Exception e11) {
            e = e11;
            minExposureCompensation = 0;
            exposureCompensation = 0;
        }
        StringBuilder sbU2 = s.u("on fetch camera exp:", exposureCompensation, " min:", minExposureCompensation, " max:");
        sbU2.append(maxExposureCompensation);
        Log.d("YoutuLightLiveCheck", sbU2.toString());
        return new int[]{exposureCompensation, minExposureCompensation, maxExposureCompensation};
    }

    public static void onFinish() {
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "on finished");
        int iFRDoDetectionYuvs = YTAGReflectLiveCheckJNIInterface.getInstance().FRDoDetectionYuvs(false, mCameraRotatedTag);
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "on finished " + iFRDoDetectionYuvs);
        if (iFRDoDetectionYuvs != 0) {
            mCheckResult.onFailed(-1, s.g(iFRDoDetectionYuvs, "JNI return failed.[", "]"), "Please make sure you have called the YTAGReflectLiveCheckInterface.onPreviewFrame during the hole reflecting process. Check log for more information. code: " + iFRDoDetectionYuvs);
            return;
        }
        FullPack fullPackFRGetAGin = YTAGReflectLiveCheckJNIInterface.getInstance().FRGetAGin();
        a aVar = new a();
        DataPack dataPack = fullPackFRGetAGin.AGin;
        if (dataPack != null) {
            RawImgData[] rawImgDataArr = dataPack.videoData;
            long j = dataPack.beginTime;
            long j6 = dataPack.changePointTime;
            long[] jArr = dataPack.changePointTimeList;
            float f = dataPack.offsetSys;
            int i = dataPack.frameNum;
            int i4 = dataPack.landMarkNum;
            int i6 = dataPack.width;
            int i10 = dataPack.height;
            int i11 = dataPack.config_begin;
            byte[] bArr = dataPack.log;
            aVar.f16028a = rawImgDataArr;
            aVar.f16029b = j;
            aVar.c = j6;
            aVar.f16030d = jArr;
            aVar.e = f;
            aVar.f = i;
            aVar.f16031g = i4;
            aVar.h = i6;
            aVar.i = i10;
            aVar.j = i11;
            aVar.f16032k = bArr;
        }
        mCheckResult.onSuccess(aVar);
    }

    public static void onReflectLiveImgData(RawImgData rawImgData) {
        mCheckResult.onReflectLiveImgData(rawImgData);
    }

    public static void onScreenChanged(int i, int i4, int i6, int i10, float f) {
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(mOverlayAlpha != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, i4, 0.0f, 0.0f, 0.0f, 0.0f, i6, 0.0f, 0.0f, 0.0f, 0.0f, i10, 0.0f, 0.0f, 0.0f, i, 0.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, i4, 0.0f, 0.0f, 0.0f, 0.0f, i6, 0.0f, 0.0f, 0.0f, 0.0f, i10, 0.0f, 0.0f, 0.0f, 0.0f, i});
        IYTReflectListener iYTReflectListener = mReflectListener;
        if (iYTReflectListener == null) {
            YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "On reflection screen change failed:mReflectListener is null");
        } else {
            iYTReflectListener.onReflectEvent(colorMatrixColorFilter, f);
        }
    }

    public static void onStateChanged(int i) {
        mState = i;
        Log.d("YoutuLightLiveCheck", "on state changed call " + mState);
        try {
            if (i == 0) {
                Camera.Parameters parameters = mCamera.getParameters();
                parameters.setAutoWhiteBalanceLock(true);
                mCamera.setParameters(parameters);
                return;
            }
            if (i == 1) {
                com.tencent.youtu.ytagreflectlivecheck.notice.a aVar = mReflectNotice;
                if (aVar != null) {
                    ReflectLivenessState.this.f15926k = false;
                    return;
                }
                return;
            }
            if (i == 2) {
                try {
                    try {
                        Camera.Parameters parameters2 = mCamera.getParameters();
                        parameters2.setAutoWhiteBalanceLock(false);
                        mCamera.setParameters(parameters2);
                    } catch (Exception e) {
                        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "on finish get param failed:" + Log.getStackTraceString(e));
                    }
                    onFinish();
                } catch (Throwable th2) {
                    onFinish();
                    throw th2;
                }
            }
        } catch (Exception e7) {
            YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "on state changed failed:" + Log.getStackTraceString(e7));
        }
    }

    public static void pushImageData(byte[] bArr, int i, int i4, long j, int i6, float[] fArr, float f, float f3, float f7) {
        int i10 = mState;
        if (i10 != 0) {
            if (i10 == 1) {
                YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "[ReflectController.onPreviewFrameReceived] record ios");
                YTAGReflectLiveCheckJNIInterface.getInstance().FRPushISOImgYuv(bArr, i, i4);
                YTAGReflectLiveCheckJNIInterface.getInstance().FRPushISOCaptureTime(JNIUtils.getTimeval(j));
                return;
            }
            return;
        }
        int iFRGetConfigBegin = YTAGReflectLiveCheckJNIInterface.getInstance().FRGetConfigBegin() - 2;
        int iFRGetConfigEnd = YTAGReflectLiveCheckJNIInterface.getInstance().FRGetConfigEnd() + 4;
        int iFRGetTriggerTime = YTAGReflectLiveCheckJNIInterface.getInstance().FRGetTriggerTime();
        StringBuilder sbU = s.u("onPreviewFrameReceived. beginFrame: ", iFRGetConfigBegin, " endFrame: ", iFRGetConfigEnd, " currentFrame: ");
        sbU.append(iFRGetTriggerTime);
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", sbU.toString());
        if (iFRGetTriggerTime <= iFRGetConfigBegin || iFRGetTriggerTime >= iFRGetConfigEnd) {
            return;
        }
        System.currentTimeMillis();
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "onPreviewFrameReceived. insertYuv and time");
        YTAGReflectLiveCheckJNIInterface.getInstance().FRPushYuv(bArr, i, i4, JNIUtils.getTimeval(j), i6, fArr);
        YTAGReflectLiveCheckJNIInterface.getInstance().FRPushCaptureTime(JNIUtils.getTimeval(j));
    }

    public static synchronized void releaseModel() {
        try {
            initLock.lock();
            int i = mInitModel - 1;
            mInitModel = i;
            if (i <= 0) {
                mInitModel = 0;
                mReflectNotice = null;
                mReflectListener = null;
                mCamera = null;
            }
            initLock.unlock();
            YTAGReflectLiveCheckJNIInterface.clearInstance();
        } catch (Throwable th2) {
            initLock.unlock();
            throw th2;
        }
    }

    public static void setAGSettings(YTAGReflectSettings yTAGReflectSettings) {
        mAGSettings = yTAGReflectSettings;
    }

    public static void setReflectListener(IYTReflectListener iYTReflectListener) {
        mReflectListener = iYTReflectListener;
    }

    public static void setReflectNotice(com.tencent.youtu.ytagreflectlivecheck.notice.a aVar) {
        mReflectNotice = aVar;
    }

    public static void setSafetyLevel(int i) {
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "[YTAGReflectLiveCheckInterface.setSafetyLevel] --- level: " + i);
        mAGSettings.safetylevel = i;
    }

    public static void setupConfig(String str, String str2) {
        if (str == "overlay_alpha") {
            try {
                mOverlayAlpha = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                mOverlayAlpha = 0;
            }
        }
    }

    public static void start(Context context, Camera camera, int i, String str, LightLiveCheckResult lightLiveCheckResult) {
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "[YTAGReflectLiveCheckInterface.start] ---");
        if (lightLiveCheckResult == null) {
            YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "On reflection start failed:checkResult is null");
            return;
        }
        mCheckResult = lightLiveCheckResult;
        if (mInitModel <= 0) {
            lightLiveCheckResult.onFailed(2, "Not init model.", "Call YTAGReflectLiveCheckInterface.initModel() before.");
            return;
        }
        mCameraRotatedTag = i;
        mColorSeq = str;
        mCamera = camera;
        long[] jArr = new long[2];
        if (mReflectListener == null) {
            YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "On reflection start failed:mReflectListener is null");
        }
        IYTReflectListener iYTReflectListener = mReflectListener;
        int iFRInit = YTAGReflectLiveCheckJNIInterface.getInstance().FRInit(false, str, mAGSettings.safetylevel, jArr, iYTReflectListener != null ? iYTReflectListener.onGetAppBrightness() : -1.0f);
        YTAGReflectLiveCheckJNIInterface.nativeLog("YoutuLightLiveCheck", "output duration ms" + jArr[0] + Global.BLANK + jArr[1]);
        if (iFRInit == 0) {
            IYTReflectListener iYTReflectListener2 = mReflectListener;
            if (iYTReflectListener2 != null) {
                iYTReflectListener2.onReflectStart(jArr[0]);
                return;
            }
            return;
        }
        if (iFRInit == -1 || iFRInit == -2 || iFRInit == -3) {
            lightLiveCheckResult.onFailed(500, "Color Data Error", "Check Color Data Format");
        } else {
            lightLiveCheckResult.onFailed(LightLiveCheckResult.INIT_ERROR, "Reflection Init Error", "");
        }
    }
}
