package com.tencent.youtu.ytposedetect.jni;

import android.graphics.Bitmap;
import com.tencent.youtu.ytposedetect.data.ActionData;
import com.tencent.youtu.ytposedetect.data.PoseDetectData;
import com.tencent.youtu.ytposedetect.data.YTActRefData;
import com.tencent.youtu.ytposedetect.data.YTFaceDistanceDetectData;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class YTPoseDetectJNIInterface {
    public static final int CHECKSUM_BEST = 0;
    public static final int CHECKSUM_EYE = 1;
    public static final int CHECKSUM_MOUTH = 2;
    public static int compressPoseImageScore = 99;
    public static int compressVideoScore = 80;
    public static IYtLoggerListener loggerListener;

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    public static native boolean canReflect();

    public static native void configNativeLog(boolean z4);

    public static byte[] encodeJpeg(Bitmap bitmap, boolean z4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, z4 ? compressPoseImageScore : compressVideoScore, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static native ActionData getActionData();

    public static native YTActRefData getActionReflectData(int i);

    public static native byte[] getBestImage();

    public static native byte[] getEyeImage(int i);

    public static native String getFaceDetectDistanceRectParam();

    public static native YTFaceDistanceDetectData getFaceDistanceDetectData();

    public static native float getFar2NearRectChangeScore();

    public static native byte[][] getFrameList();

    public static native byte[] getMouthImage(int i);

    public static native void getOneActionFrame(int i, int i4);

    public static native String getVersion();

    public static native void initFaceDistanceDetect(int i, int i4, int i6, float f, float f3);

    public static native int initModel(String str);

    public static native boolean isFrameListNull();

    public static native boolean isRecordingDone();

    public static void nativeLog(String str, String str2) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log(str, str2);
        }
    }

    public static native int poseDetect(PoseDetectData poseDetectData);

    public static native void releaseAll();

    public static native void resetDetect();

    public static native void resetQualityContinuousCount();

    public static native void setColorData(String str, String str2, String str3, String str4, String str5);

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public static native void setSafetyLevel(int i);

    public static native int updateParam(String str, String str2);

    public static void nativeLog(int i, String str) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTPoseDetectJNIInterface.nativeLog]", str);
        }
    }
}
