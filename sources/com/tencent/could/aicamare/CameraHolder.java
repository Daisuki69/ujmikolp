package com.tencent.could.aicamare;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.callback.CameraLoggerCallBack;
import com.tencent.could.aicamare.entity.CameraConfig;
import com.tencent.could.aicamare.util.CameraLogger;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class CameraHolder {
    public static final int EVENT_AUTO_FOCUS_CAMERA = 3;
    public static final int EVENT_CHANGE_CAMERA_PARAMETER = 8;
    public static final int EVENT_CHANGE_ZOOM = 4;
    public static final int EVENT_CLOSE_CAMERA = 2;
    public static final int EVENT_LIFE_CYCLE_START_PREVIEW = 6;
    public static final int EVENT_LIFE_CYCLE_STOP_PREVIEW = 7;
    public static final int EVENT_OPEN_CAMERA = 1;
    public static final int EVENT_START_PREVIEW = 5;
    public static final String PARAMETER_EXPOSURE_COMPENSATION = "camera_param_exposure";
    public static final String PARAMETER_WHITE_BALANCE = "camera_param_white_balance";
    public static final String PARAMETER_ZOOM_VALUE = "camera_param_zoom";
    public static final String TAG = "CameraHolder";
    public CameraEventListener eventListener;
    public volatile Handler handler;
    public HandlerThread handlerThread;
    public CameraLoggerCallBack loggerCallBack;
    public SurfaceHolder surfaceHolder;
    public SurfaceTexture surfaceTexture;
    public Matrix transformMatrix;
    public volatile boolean isUseSurfaceHolder = true;
    public float oldDist = 1.0f;
    public CameraConfig cameraConfig = new CameraConfig();
    public d cameraHolderImp = new d();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    CameraHolder.this.doOpenCamera();
                    break;
                case 2:
                    CameraHolder.this.doCloseCamera();
                    break;
                case 3:
                    CameraHolder.this.doAutoFocus(message.arg1 == 1);
                    break;
                case 4:
                    CameraHolder.this.doChangeZoom(message.arg1 == 1);
                    break;
                case 5:
                    CameraHolder.this.doStartPreview();
                    break;
                case 6:
                    CameraHolder.this.doLifeResume();
                    break;
                case 7:
                    CameraHolder.this.doLifeOnPause();
                    break;
                case 8:
                    try {
                        CameraHolder.this.doEventChangeCameraParameter((Map) message.obj);
                    } catch (Exception e) {
                        CameraLogger.b(CameraHolder.TAG, "doEventChangeCameraParameter error " + e.getLocalizedMessage(), CameraHolder.this.loggerCallBack);
                        return;
                    }
                    break;
                default:
                    Log.d(CameraHolder.TAG, "default case");
                    break;
            }
        }
    }

    private void cleanAllListener() {
        if (this.loggerCallBack != null) {
            this.loggerCallBack = null;
        }
        if (this.eventListener != null) {
            this.eventListener = null;
        }
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            if (dVar.f15531b != null) {
                dVar.f15531b = null;
            }
            if (dVar.c != null) {
                dVar.c = null;
            }
        }
    }

    private Matrix computePreviewMatrix(TextureView textureView, Point point, Point point2) {
        float f;
        float f3;
        Matrix matrix = new Matrix();
        textureView.getTransform(matrix);
        matrix.reset();
        if (point.equals(point2)) {
            return matrix;
        }
        int displayRotate = getDisplayRotate();
        Point point3 = getCurrentCameraInfo().f;
        int i = point3.x;
        int i4 = point2.x;
        int i6 = (i - i4) / 2;
        int i10 = point3.y;
        int i11 = point2.y;
        int i12 = (i10 - i11) / 2;
        if (displayRotate % 180 != 0) {
            f = (i4 * 1.0f) / point.y;
            i12 = (i - i11) / 2;
            i6 = (i10 - i4) / 2;
            f3 = (i11 * 1.0f) / point.x;
        } else {
            f = (i4 * 1.0f) / point.x;
            f3 = (i11 * 1.0f) / point.y;
        }
        float fMax = Math.max(f, f3);
        matrix.preScale(1.0f / f, 1.0f / f3);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(-i6, -i12);
        return matrix;
    }

    private void createHandlerThread() {
        HandlerThread handlerThread = new HandlerThread("camera-preview");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new a(this.handlerThread.getLooper());
    }

    private Matrix createTransformMatrix(TextureView textureView) {
        if (this.transformMatrix == null) {
            Camera.Size cameraSize = getCameraSize();
            if (cameraSize == null) {
                CameraLogger.b(TAG, "createTransformMatrix size == null", this.loggerCallBack);
                CameraEventListener cameraEventListener = this.eventListener;
                if (cameraEventListener == null) {
                    return null;
                }
                cameraEventListener.onEventError(3, "createTransformMatrix size is null");
                return null;
            }
            this.transformMatrix = computePreviewMatrix(textureView, new Point(cameraSize.width, cameraSize.height), new Point(textureView.getWidth(), textureView.getHeight()));
        }
        return this.transformMatrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAutoFocus(boolean z4) {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            if (dVar.e) {
                dVar.a(4, "isFocusing!");
                return;
            }
            Camera camera = dVar.f15530a.f15533a;
            if (camera == null) {
                dVar.a(4, "current camera is null!");
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters == null) {
                    dVar.a(4, "current camera  parameters is null!");
                    return;
                }
                dVar.e = true;
                if (TtmlNode.TEXT_EMPHASIS_AUTO.equals(parameters.getFocusMode()) && !z4) {
                    dVar.e = false;
                    dVar.a(4, "there is no need change auto mode");
                    return;
                }
                if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                    camera.setParameters(parameters);
                }
                String focusMode = parameters.getFocusMode();
                if ("continuous-video".equals(focusMode)) {
                    dVar.e = false;
                    dVar.a(4, "there is no need change auto mode");
                } else {
                    if (!TtmlNode.TEXT_EMPHASIS_AUTO.equals(focusMode)) {
                        parameters.setFocusMode(TtmlNode.TEXT_EMPHASIS_AUTO);
                        camera.setParameters(parameters);
                    }
                    camera.autoFocus(new com.tencent.could.aicamare.a(dVar));
                }
            } catch (Exception e) {
                dVar.b("there is some error with set auto mode + e: " + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doChangeZoom(boolean z4) {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            Camera camera = dVar.f15530a.f15533a;
            if (camera == null) {
                dVar.a(4, "current camera is null");
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (!parameters.isZoomSupported()) {
                    CameraLogger.a("CameraHolderImp", "this camera do not support", dVar.c);
                    return;
                }
                int maxZoom = parameters.getMaxZoom();
                int zoom = parameters.getZoom();
                if (z4 && zoom < maxZoom) {
                    zoom++;
                } else if (zoom > 0) {
                    zoom--;
                }
                parameters.setZoom(zoom);
                camera.setParameters(parameters);
            } catch (Exception e) {
                dVar.b("doChangeZoom error: " + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCloseCamera() {
        CameraEventListener cameraEventListener;
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            CameraLogger.a("CameraHolderImp", "do close camera", dVar.c);
            Camera camera = dVar.f15530a.f15533a;
            if (camera == null) {
                CameraLogger.b("CameraHolderImp", "do close camera is null!", dVar.c);
                return;
            }
            synchronized (d.class) {
                try {
                    com.tencent.could.aicamare.entity.a aVar = dVar.f15530a;
                    aVar.f15533a = null;
                    aVar.f15535d = null;
                    aVar.f = null;
                    aVar.f15534b = 0;
                    aVar.c = 0;
                    aVar.e = 0;
                    camera.cancelAutoFocus();
                    camera.stopPreview();
                    camera.setOneShotPreviewCallback(null);
                    camera.setPreviewCallback(null);
                    camera.release();
                    CameraLogger.a("CameraHolderImp", "close camera success！", dVar.c);
                    cameraEventListener = dVar.f15531b;
                } catch (Exception e) {
                    String str = "some error happen in close e: " + e.getMessage();
                    dVar.b(str);
                    dVar.a(2, str);
                }
                if (cameraEventListener != null) {
                    cameraEventListener.onCameraClosed();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLifeOnPause() {
        com.tencent.could.aicamare.entity.a aVar;
        Camera camera;
        d dVar = this.cameraHolderImp;
        if (dVar == null || (aVar = dVar.f15530a) == null || (camera = aVar.f15533a) == null) {
            return;
        }
        try {
            camera.stopPreview();
        } catch (Exception e) {
            CameraLogger.b(TAG, "doLifeResume error: e " + e.getLocalizedMessage(), this.loggerCallBack);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLifeResume() {
        com.tencent.could.aicamare.entity.a aVar;
        Camera camera;
        d dVar = this.cameraHolderImp;
        if (dVar == null || (aVar = dVar.f15530a) == null || (camera = aVar.f15533a) == null) {
            return;
        }
        try {
            this.cameraHolderImp.a(camera);
            camera.startPreview();
        } catch (Exception e) {
            CameraLogger.b(TAG, "doLifeResume error: e " + e.getLocalizedMessage(), this.loggerCallBack);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0388 A[Catch: Exception -> 0x0348, TRY_ENTER, TryCatch #3 {Exception -> 0x0348, blocks: (B:143:0x0308, B:159:0x0354, B:161:0x035a, B:163:0x0367, B:165:0x036f, B:167:0x0375, B:172:0x0388, B:173:0x03a5, B:146:0x032d, B:147:0x0331, B:149:0x0337, B:151:0x0341), top: B:202:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03cf A[Catch: Exception -> 0x03d6, TRY_LEAVE, TryCatch #4 {Exception -> 0x03d6, blocks: (B:174:0x03c5, B:176:0x03cf), top: B:204:0x03c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doOpenCamera() {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.aicamare.CameraHolder.doOpenCamera():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartPreview() {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            boolean z4 = this.isUseSurfaceHolder;
            SurfaceHolder surfaceHolder = this.surfaceHolder;
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            CameraLogger.a("CameraHolderImp", "start camera preview", dVar.c);
            Camera camera = dVar.f15530a.f15533a;
            if (camera == null) {
                CameraLogger.b("CameraHolderImp", "start preview with currentCamera is null!", dVar.c);
                dVar.a(6, "current camera is null!");
                return;
            }
            if (!dVar.a(camera)) {
                dVar.a(6, "add camera preview fail!");
                return;
            }
            if (z4 && surfaceHolder != null) {
                try {
                    camera.setPreviewDisplay(surfaceHolder);
                } catch (IOException e) {
                    e = e;
                    dVar.a(6, "set preview display error : " + e.getMessage());
                    return;
                } catch (RuntimeException e7) {
                    e = e7;
                    dVar.a(6, "set preview display error : " + e.getMessage());
                    return;
                }
            }
            if (!z4 && surfaceTexture != null) {
                camera.setPreviewTexture(surfaceTexture);
            }
            camera.startPreview();
            CameraLogger.a("CameraHolderImp", "start camera preview success", dVar.c);
            CameraEventListener cameraEventListener = dVar.f15531b;
            if (cameraEventListener != null) {
                cameraEventListener.onPreviewSucceed();
            } else {
                CameraLogger.b("CameraHolderImp", "start preview fail eventListener is null", dVar.c);
            }
        }
    }

    private void stopCurrentThread() {
        if (this.handler == null) {
            return;
        }
        CameraLogger.a(TAG, "clean handler and thread", this.loggerCallBack);
        this.handler.removeMessages(1);
        this.handler.removeMessages(2);
        this.handler.removeMessages(3);
        this.handler.removeMessages(4);
        this.handler.removeMessages(5);
        this.handler.removeMessages(7);
        this.handler.removeMessages(6);
        this.handler = null;
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.handlerThread.quitSafely();
    }

    public void closeCamera() {
        if (this.cameraConfig.isMainThread()) {
            doCloseCamera();
            return;
        }
        if (this.handler == null) {
            CameraLogger.b(TAG, "close camera handler == null", this.loggerCallBack);
            doCloseCamera();
        } else {
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 2;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void doEventChangeCameraParameter(Map<String, Object> map) {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            Camera camera = dVar.f15530a.f15533a;
            if (camera == null || map == null) {
                CameraLogger.b("CameraHolderImp", "setEventChangeCameraParameter, currentCamera is null or parameter is null", dVar.c);
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (map.containsKey(PARAMETER_EXPOSURE_COMPENSATION)) {
                    parameters.setExposureCompensation(((Integer) map.get(PARAMETER_EXPOSURE_COMPENSATION)).intValue());
                }
                if (map.containsKey(PARAMETER_ZOOM_VALUE)) {
                    parameters.setZoom(((Integer) map.get(PARAMETER_ZOOM_VALUE)).intValue());
                }
                if (map.containsKey(PARAMETER_WHITE_BALANCE)) {
                    parameters.setWhiteBalance((String) map.get(PARAMETER_WHITE_BALANCE));
                }
                camera.setParameters(parameters);
            } catch (RuntimeException e) {
                dVar.b("changeCameraExposureInfo:" + e.getLocalizedMessage());
            }
        }
    }

    public void doFocus(boolean z4) {
        if (this.cameraConfig.isMainThread()) {
            doAutoFocus(z4);
            return;
        }
        if (this.handler == null) {
            CameraLogger.b(TAG, "do focus handler == null", this.loggerCallBack);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = 3;
        messageObtainMessage.arg1 = z4 ? 1 : 0;
        this.handler.sendMessage(messageObtainMessage);
    }

    public int getCameraId() {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f15530a.f15534b;
        }
        return 0;
    }

    public Camera.Size getCameraSize() {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f15530a.f15535d;
        }
        return null;
    }

    public Camera getCurrentCamera() {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f15530a.f15533a;
        }
        return null;
    }

    public com.tencent.could.aicamare.entity.a getCurrentCameraInfo() {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f15530a;
        }
        return null;
    }

    public int getCurrentRotate() {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f15530a.c;
        }
        return 0;
    }

    public int getDisplayRotate() {
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            return dVar.f15530a.e;
        }
        return 0;
    }

    public void initCameraHolder(Context context, CameraConfig cameraConfig) {
        if (cameraConfig != null) {
            this.cameraConfig = cameraConfig;
        }
        this.cameraHolderImp.a(context);
        this.cameraHolderImp.f15532d = cameraConfig;
        if (cameraConfig.isMainThread()) {
            return;
        }
        createHandlerThread();
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            doFocus(true);
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                return;
            }
            this.oldDist = com.tencent.could.aicamare.util.a.a(motionEvent);
            return;
        }
        float fA = com.tencent.could.aicamare.util.a.a(motionEvent);
        float f = this.oldDist;
        if (fA > f) {
            zoomCamera(true);
        } else if (fA < f) {
            zoomCamera(false);
        }
        this.oldDist = fA;
    }

    public void openCamera(Context context) {
        this.cameraHolderImp.a(context);
        if (this.cameraConfig.isMainThread()) {
            doOpenCamera();
        } else {
            if (this.handler == null) {
                CameraLogger.b(TAG, "open camera handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 1;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void release() {
        doCloseCamera();
        stopCurrentThread();
        cleanAllListener();
        if (this.surfaceTexture != null) {
            this.surfaceTexture = null;
        }
        if (this.surfaceHolder != null) {
            this.surfaceHolder = null;
        }
        if (this.transformMatrix != null) {
            this.transformMatrix = null;
        }
    }

    public void setEventChangeCameraParameter(Map<String, Object> map) {
        if (this.cameraConfig.isMainThread()) {
            doEventChangeCameraParameter(map);
            return;
        }
        if (this.handler == null) {
            CameraLogger.b(TAG, "set camera parameter handler == null", this.loggerCallBack);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = 8;
        messageObtainMessage.obj = map;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void setEventListener(CameraEventListener cameraEventListener) {
        this.eventListener = cameraEventListener;
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            dVar.f15531b = cameraEventListener;
        }
    }

    public void setLoggerCallBack(CameraLoggerCallBack cameraLoggerCallBack, CameraLogger.LOG_LEVEL log_level) {
        CameraLogger.f15536a = log_level;
        this.loggerCallBack = cameraLoggerCallBack;
        d dVar = this.cameraHolderImp;
        if (dVar != null) {
            dVar.c = cameraLoggerCallBack;
        }
    }

    public void startPreview(SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
        this.isUseSurfaceHolder = true;
        if (this.cameraConfig.isMainThread()) {
            doStartPreview();
        } else {
            if (this.handler == null) {
                CameraLogger.b(TAG, "start camera preview handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 5;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void startPreviewByResume() {
        if (this.cameraConfig.isMainThread()) {
            doLifeResume();
        } else {
            if (this.handler == null) {
                CameraLogger.b(TAG, "do focus handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 6;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void startPreviewWithTexture(TextureView textureView, SurfaceTexture surfaceTexture) {
        if (textureView != null) {
            createTransformMatrix(textureView);
            Matrix matrix = this.transformMatrix;
            if (matrix != null) {
                textureView.setTransform(matrix);
            } else {
                CameraLogger.b(TAG, "transformMatrix do not create is null", this.loggerCallBack);
            }
        }
        this.isUseSurfaceHolder = false;
        this.surfaceTexture = surfaceTexture;
        if (this.cameraConfig.isMainThread()) {
            doStartPreview();
        } else {
            if (this.handler == null) {
                CameraLogger.b(TAG, "start camera preview handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 5;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void stopPreviewByOnPause() {
        if (this.cameraConfig.isMainThread()) {
            doLifeOnPause();
        } else {
            if (this.handler == null) {
                CameraLogger.b(TAG, "do focus handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 7;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void zoomCamera(boolean z4) {
        if (this.cameraConfig.isMainThread()) {
            doChangeZoom(z4);
            return;
        }
        if (this.handler == null) {
            CameraLogger.b(TAG, "zoom camera handler == null", this.loggerCallBack);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = 4;
        messageObtainMessage.arg1 = z4 ? 1 : 0;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void setLoggerCallBack(CameraLoggerCallBack cameraLoggerCallBack) {
        setLoggerCallBack(cameraLoggerCallBack, CameraLogger.LOG_LEVEL.LEVEL_VERBOSE);
    }
}
