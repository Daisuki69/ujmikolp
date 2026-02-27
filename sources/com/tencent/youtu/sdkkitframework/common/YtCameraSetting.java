package com.tencent.youtu.sdkkitframework.common;

import We.s;
import android.content.Context;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class YtCameraSetting {
    public static final String TAG = "YtCameraSetting";
    public static int customFPS = 15000;
    public static int mCameraFacing = 1;
    public static int mDesiredPreviewHeight = 480;
    public static int mDesiredPreviewWidth = 640;
    public static int mRotate;

    public static int chooseFixedPreviewFps(Camera.Parameters parameters, int i) {
        int i4;
        Iterator<int[]> it = parameters.getSupportedPreviewFpsRange().iterator();
        while (true) {
            if (!it.hasNext()) {
                int[] iArr = new int[2];
                parameters.getPreviewFpsRange(iArr);
                int i6 = iArr[0];
                int i10 = iArr[1];
                if (i6 != i10) {
                    if (i > i10) {
                        i = i10;
                    }
                    if (i >= i6) {
                        i6 = i;
                    }
                }
                String str = parameters.get("preview-frame-rate-values");
                if (!TextUtils.isEmpty(str)) {
                    if (!str.contains("" + (i6 / 1000))) {
                        String[] strArrSplit = str.split(",");
                        for (String str2 : strArrSplit) {
                            int i11 = Integer.parseInt(str2) * 1000;
                            if (i6 < i11) {
                                parameters.setPreviewFrameRate(i11 / 1000);
                                return i11;
                            }
                        }
                        if (strArrSplit.length > 0 && i6 > (i4 = Integer.parseInt(strArrSplit[strArrSplit.length - 1]) * 1000)) {
                            i6 = i4;
                        }
                    }
                }
                parameters.setPreviewFrameRate(i6 / 1000);
                return i6;
            }
            int[] next = it.next();
            String str3 = TAG;
            YtLogger.d(str3, "entry: " + next[0] + " - " + next[1]);
            int i12 = next[0];
            int i13 = next[1];
            if (i12 == i13 && i12 == i) {
                parameters.setPreviewFpsRange(i12, i13);
                YtLogger.d(str3, "use preview fps range: " + next[0] + Global.BLANK + next[1]);
                return next[0];
            }
        }
    }

    public static int getDesiredPreviewHeight() {
        return mDesiredPreviewHeight;
    }

    public static int getDesiredPreviewWidth() {
        return mDesiredPreviewWidth;
    }

    public static Camera.Size getOptimalPreviewSize(List<Camera.Size> list, int i, int i4) {
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        int iMax = Math.max(i, i4);
        int iMin = Math.min(i, i4);
        double d10 = ((double) iMax) / ((double) iMin);
        YtLogger.d(TAG, "sizes size=" + list.size());
        double dAbs = Double.MAX_VALUE;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d10) <= 0.001d && Math.abs(size2.height - iMin) < dAbs2) {
                dAbs2 = Math.abs(size2.height - iMin);
                size = size2;
            }
        }
        if (size == null) {
            YtLogger.d(TAG, "No preview size match the aspect ratio");
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - iMin) < dAbs) {
                    dAbs = Math.abs(size3.height - iMin);
                    size = size3;
                }
            }
        }
        return size;
    }

    public static int getRotate(Context context, int i, int i4) {
        return getRotateTag(getVideoRotate(context, i), i4);
    }

    public static int getRotateTag(int i, int i4) {
        int i6;
        if (i == 90) {
            i6 = 7;
        } else if (i == 180) {
            i6 = 3;
        } else if (i == 270) {
            i6 = 5;
        } else {
            YtLogger.i(TAG, "camera rotate not 90degree or 180degree, input: " + i);
            i6 = 1;
        }
        return i4 == 1 ? i6 : transBackFacingCameraRatateTag(i6);
    }

    public static int getVideoRotate(Context context, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i4 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i4 = 90;
            } else if (rotation == 2) {
                i4 = 180;
            } else if (rotation == 3) {
                i4 = 270;
            }
        }
        int i6 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i4) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS)) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS : ((cameraInfo.orientation - i4) + SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS) % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        YtLogger.i(TAG, "debug camera orientation is " + cameraInfo.orientation + " ui degrees is " + i4);
        return i6;
    }

    public static int initCamera(Context context, Camera camera, int i) {
        return initCamera(context, camera, i, 4, false);
    }

    public static void setCameraFacing(int i) {
        mCameraFacing = i;
    }

    public static void setCameraRotate(int i) {
        mRotate = i;
    }

    public static void setCustomFPS(int i) {
        customFPS = i;
    }

    public static void setVideoSize(Camera.Parameters parameters, CamcorderProfile camcorderProfile) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (parameters.getSupportedVideoSizes() == null) {
            String str = TAG;
            YtLogger.d(str, "video size from profile is : " + camcorderProfile.videoFrameWidth + Global.BLANK + camcorderProfile.videoFrameHeight);
            if (getOptimalPreviewSize(supportedPreviewSizes, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) == null) {
                YtLogger.d(str, "do not find proper preview size, use default");
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            boolean z4 = false;
            for (int i = 0; i < supportedVideoSizes.size(); i++) {
                Camera.Size size = supportedVideoSizes.get(i);
                if (size.width == camcorderProfile.videoFrameWidth && size.height == camcorderProfile.videoFrameHeight) {
                    z4 = true;
                }
            }
            if (!z4) {
                camcorderProfile.videoFrameWidth = 640;
                camcorderProfile.videoFrameHeight = 480;
            }
        }
        YtLogger.d(TAG, "select video size camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
    }

    public static int transBackFacingCameraRatateTag(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 8;
        }
        if (i == 6) {
            return 7;
        }
        if (i == 7) {
            return 6;
        }
        if (i == 8) {
            return 5;
        }
        YtLogger.w(TAG, "[YtCameraSetting.transBackFacingCameraRatateTag] unsurported rotateTag: " + i, null);
        return 0;
    }

    public static int initCamera(Context context, Camera camera, int i, int i4) {
        return initCamera(context, camera, i, i4, false);
    }

    /* JADX WARN: Finally extract failed */
    public static int initCamera(Context context, Camera camera, int i, int i4, boolean z4) {
        CamcorderProfile camcorderProfile;
        mDesiredPreviewWidth = 640;
        mDesiredPreviewHeight = 480;
        try {
            Camera.Parameters parameters = camera.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            for (int i6 = 0; i6 < supportedFocusModes.size(); i6++) {
                String str = TAG;
                StringBuilder sbT = s.t(i6, "suporrtedFocusModes ", " :");
                sbT.append(supportedFocusModes.get(i6));
                YtLogger.v(str, sbT.toString());
            }
            if (supportedFocusModes.indexOf("continuous-video") >= 0) {
                parameters.setFocusMode("continuous-video");
                YtLogger.d(TAG, "set camera focus mode continuous video");
            } else if (supportedFocusModes.indexOf(TtmlNode.TEXT_EMPHASIS_AUTO) >= 0) {
                parameters.setFocusMode(TtmlNode.TEXT_EMPHASIS_AUTO);
                YtLogger.d(TAG, "set camera focus mode auto");
            } else {
                YtLogger.d(TAG, "NOT set camera focus mode");
            }
            try {
                try {
                    camera.setParameters(parameters);
                } catch (Exception e) {
                    YtLogger.e(TAG, "Camera.setParameters.setPreviewSize failed!!: ", e);
                }
                Camera.Parameters parameters2 = camera.getParameters();
                int videoRotate = getVideoRotate(context, i);
                camera.setDisplayOrientation(videoRotate);
                String str2 = TAG;
                YtLogger.d(str2, "videoOrietation is" + videoRotate);
                if (CamcorderProfile.hasProfile(i, i4)) {
                    camcorderProfile = CamcorderProfile.get(i, i4);
                    YtLogger.d(str2, "custom camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
                } else if (CamcorderProfile.hasProfile(i, 4)) {
                    camcorderProfile = CamcorderProfile.get(i, 4);
                    YtLogger.d(str2, "480P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
                } else if (CamcorderProfile.hasProfile(i, 5)) {
                    camcorderProfile = CamcorderProfile.get(i, 5);
                    YtLogger.d(str2, "720P camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
                } else {
                    camcorderProfile = CamcorderProfile.get(i, 1);
                    YtLogger.d(str2, "High camcorderProfile:" + camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight);
                }
                List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
                List<Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
                for (int i10 = 0; i10 < supportedPictureSizes.size(); i10++) {
                    Camera.Size size = supportedPictureSizes.get(i10);
                    YtLogger.d("pictureSize", size.width + " x " + size.height);
                }
                for (int i11 = 0; i11 < supportedPreviewSizes.size(); i11++) {
                    Camera.Size size2 = supportedPreviewSizes.get(i11);
                    YtLogger.d("previewSize", size2.width + " x " + size2.height);
                }
                setVideoSize(parameters2, camcorderProfile);
                if (z4) {
                    mDesiredPreviewWidth = camcorderProfile.videoFrameWidth;
                    mDesiredPreviewHeight = camcorderProfile.videoFrameHeight;
                }
                YtLogger.d(TAG, "mDesiredPreviewWidth: " + mDesiredPreviewWidth + ", mDesiredPreviewHeight: " + mDesiredPreviewHeight);
                parameters2.setPreviewSize(mDesiredPreviewWidth, mDesiredPreviewHeight);
                parameters2.setPreviewFormat(17);
                try {
                    camera.setParameters(parameters2);
                } catch (Exception e7) {
                    YtLogger.e(TAG, "Camera.setParameters.setPreviewSize failed!!: ", e7);
                }
                Camera.Parameters parameters3 = camera.getParameters();
                int iChooseFixedPreviewFps = chooseFixedPreviewFps(parameters3, customFPS);
                YtLogger.d(TAG, "choose camera fps is : " + iChooseFixedPreviewFps);
                try {
                    camera.setParameters(parameters3);
                } catch (Exception e10) {
                    YtLogger.e(TAG, "Camera.setParameters.preview fps failed!!: ", e10);
                }
                Camera.Parameters parameters4 = camera.getParameters();
                int[] iArr = new int[2];
                parameters4.getPreviewFpsRange(iArr);
                int previewFrameRate = parameters4.getPreviewFrameRate();
                String str3 = TAG;
                YtLogger.d(str3, "after set parameters getPreviewFpsRange=" + iArr[0] + Global.HYPHEN + iArr[1] + " ;after set parameter fps=" + previewFrameRate);
                Camera.Size previewSize = parameters4.getPreviewSize();
                StringBuilder sb2 = new StringBuilder("camera preview size is ");
                sb2.append(previewSize.width);
                sb2.append(Global.BLANK);
                sb2.append(previewSize.height);
                YtLogger.d(str3, sb2.toString());
                return 0;
            } catch (Throwable th2) {
                camera.getParameters();
                throw th2;
            }
        } catch (Exception e11) {
            YtLogger.e(TAG, "get camera parameters failed. 1. Check Camera.getParameters() interface. 2. Get logs for more detail.", e11);
            return 1;
        }
    }
}
