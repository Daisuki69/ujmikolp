package androidx.camera.view;

import We.s;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.AnyThread;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.impl.ZoomGestureDetector;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.transform.OutputTransform;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    @ColorRes
    static final int DEFAULT_BACKGROUND_COLOR = 17170444;
    private static final ImplementationMode DEFAULT_IMPL_MODE = ImplementationMode.PERFORMANCE;
    private static final String TAG = "PreviewView";

    @Nullable
    final AtomicReference<PreviewStreamStateObserver> mActiveStreamStateObserver;
    CameraController mCameraController;

    @Nullable
    CameraInfoInternal mCameraInfoInternal;

    @NonNull
    private final DisplayRotationListener mDisplayRotationListener;

    @Nullable
    @VisibleForTesting
    PreviewViewImplementation mImplementation;

    @NonNull
    ImplementationMode mImplementationMode;

    @Nullable
    OnFrameUpdateListener mOnFrameUpdateListener;

    @Nullable
    Executor mOnFrameUpdateListenerExecutor;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener;

    @NonNull
    final MutableLiveData<StreamState> mPreviewStreamStateLiveData;

    @NonNull
    final PreviewTransformation mPreviewTransform;

    @NonNull
    PreviewViewMeteringPointFactory mPreviewViewMeteringPointFactory;

    @NonNull
    final ScreenFlashView mScreenFlashView;
    final Preview.SurfaceProvider mSurfaceProvider;

    @Nullable
    private MotionEvent mTouchUpEvent;
    boolean mUseDisplayRotation;

    @NonNull
    private final ZoomGestureDetector mZoomGestureDetector;

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$1, reason: invalid class name */
    public class AnonymousClass1 implements Preview.SurfaceProvider {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceRequested$0(SurfaceRequest surfaceRequest) {
            PreviewView.this.mSurfaceProvider.onSurfaceRequested(surfaceRequest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceRequested$1(CameraInternal cameraInternal, SurfaceRequest surfaceRequest, SurfaceRequest.TransformationInfo transformationInfo) {
            PreviewView previewView;
            PreviewViewImplementation previewViewImplementation;
            Logger.d(PreviewView.TAG, "Preview transformation info updated. " + transformationInfo);
            PreviewView.this.mPreviewTransform.setTransformationInfo(transformationInfo, surfaceRequest.getResolution(), cameraInternal.getCameraInfoInternal().getLensFacing() == 0);
            if (transformationInfo.getTargetRotation() == -1 || ((previewViewImplementation = (previewView = PreviewView.this).mImplementation) != null && (previewViewImplementation instanceof SurfaceViewImplementation))) {
                PreviewView.this.mUseDisplayRotation = true;
            } else {
                previewView.mUseDisplayRotation = false;
            }
            PreviewView.this.redrawPreview();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceRequested$2(PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
            AtomicReference<PreviewStreamStateObserver> atomicReference = PreviewView.this.mActiveStreamStateObserver;
            while (true) {
                if (atomicReference.compareAndSet(previewStreamStateObserver, null)) {
                    previewStreamStateObserver.updatePreviewStreamState(StreamState.IDLE);
                    break;
                } else if (atomicReference.get() != previewStreamStateObserver) {
                    break;
                }
            }
            previewStreamStateObserver.clear();
            cameraInternal.getCameraState().removeObserver(previewStreamStateObserver);
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        @AnyThread
        public void onSurfaceRequested(@NonNull SurfaceRequest surfaceRequest) {
            Executor executor;
            PreviewViewImplementation surfaceViewImplementation;
            if (!Threads.isMainThread()) {
                ContextCompat.getMainExecutor(PreviewView.this.getContext()).execute(new i(0, this, surfaceRequest));
                return;
            }
            Logger.d(PreviewView.TAG, "Surface requested by Preview.");
            CameraInternal camera = surfaceRequest.getCamera();
            PreviewView.this.mCameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView.this.mPreviewViewMeteringPointFactory.setSensorRect(camera.getCameraControlInternal().getSensorRect());
            surfaceRequest.setTransformationInfoListener(ContextCompat.getMainExecutor(PreviewView.this.getContext()), new f(this, camera, surfaceRequest));
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.shouldReuseImplementation(previewView.mImplementation, surfaceRequest, previewView.mImplementationMode)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.shouldUseTextureView(surfaceRequest, previewView2.mImplementationMode)) {
                    PreviewView previewView3 = PreviewView.this;
                    surfaceViewImplementation = new TextureViewImplementation(previewView3, previewView3.mPreviewTransform);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    surfaceViewImplementation = new SurfaceViewImplementation(previewView4, previewView4.mPreviewTransform);
                }
                previewView2.mImplementation = surfaceViewImplementation;
            }
            CameraInfoInternal cameraInfoInternal = camera.getCameraInfoInternal();
            PreviewView previewView5 = PreviewView.this;
            PreviewStreamStateObserver previewStreamStateObserver = new PreviewStreamStateObserver(cameraInfoInternal, previewView5.mPreviewStreamStateLiveData, previewView5.mImplementation);
            PreviewView.this.mActiveStreamStateObserver.set(previewStreamStateObserver);
            camera.getCameraState().addObserver(ContextCompat.getMainExecutor(PreviewView.this.getContext()), previewStreamStateObserver);
            PreviewView.this.mImplementation.onSurfaceRequested(surfaceRequest, new f(this, previewStreamStateObserver, camera));
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.mScreenFlashView) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.mScreenFlashView);
            }
            PreviewView previewView8 = PreviewView.this;
            OnFrameUpdateListener onFrameUpdateListener = previewView8.mOnFrameUpdateListener;
            if (onFrameUpdateListener == null || (executor = previewView8.mOnFrameUpdateListenerExecutor) == null) {
                return;
            }
            previewView8.mImplementation.setFrameUpdateListener(executor, onFrameUpdateListener);
        }
    }

    public class DisplayRotationListener implements DisplayManager.DisplayListener {
        public DisplayRotationListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            PreviewView.this.redrawPreview();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode fromId(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException(s.f(i, "Unknown implementation mode id "));
        }

        public int getId() {
            return this.mId;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnFrameUpdateListener {
        void onFrameUpdate(long j);
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType fromId(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException(s.f(i, "Unknown scale type id "));
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    @UiThread
    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    @MainThread
    private void attachToControllerIfReady(boolean z4) {
        Threads.checkMainThread();
        ViewPort viewPort = getViewPort();
        if (this.mCameraController == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.mCameraController.attachPreviewSurface(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z4) {
                throw e;
            }
            Logger.e(TAG, e.toString(), e);
        }
    }

    @Nullable
    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    @Nullable
    @UiThread
    private ImageCapture.ScreenFlash getScreenFlashInternal() {
        return this.mScreenFlashView.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
        if (i6 - i == i13 - i11 && i10 - i4 == i14 - i12) {
            return;
        }
        redrawPreview();
        attachToControllerIfReady(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$1(ZoomGestureDetector.ZoomEvent zoomEvent) {
        CameraController cameraController;
        if (!(zoomEvent instanceof ZoomGestureDetector.ZoomEvent.Move) || (cameraController = this.mCameraController) == null) {
            return true;
        }
        cameraController.onPinchToZoom(((ZoomGestureDetector.ZoomEvent.Move) zoomEvent).getIncrementalScaleFactor());
        return true;
    }

    private void setScreenFlashUiInfo(ImageCapture.ScreenFlash screenFlash) {
        CameraController cameraController = this.mCameraController;
        if (cameraController == null) {
            Logger.d(TAG, "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cameraController.setScreenFlashUiInfo(new ScreenFlashUiInfo(ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW, screenFlash));
        }
    }

    @VisibleForTesting
    public static boolean shouldReuseImplementation(@Nullable PreviewViewImplementation previewViewImplementation, @NonNull SurfaceRequest surfaceRequest, @NonNull ImplementationMode implementationMode) {
        return (previewViewImplementation instanceof SurfaceViewImplementation) && !shouldUseTextureView(surfaceRequest, implementationMode);
    }

    public static boolean shouldUseTextureView(@NonNull SurfaceRequest surfaceRequest, @NonNull ImplementationMode implementationMode) {
        boolean zEquals = surfaceRequest.getCamera().getCameraInfoInternal().getImplementationType().equals(CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        boolean z4 = (DeviceQuirks.get(SurfaceViewStretchedQuirk.class) == null && DeviceQuirks.get(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z4) {
            return true;
        }
        int iOrdinal = implementationMode.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    private void startListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.mDisplayRotationListener, new Handler(Looper.getMainLooper()));
    }

    private void stopListeningToDisplayChange() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.mDisplayRotationListener);
    }

    @Nullable
    @UiThread
    public Bitmap getBitmap() {
        Threads.checkMainThread();
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation == null) {
            return null;
        }
        return previewViewImplementation.getBitmap();
    }

    @Nullable
    @UiThread
    public CameraController getController() {
        Threads.checkMainThread();
        return this.mCameraController;
    }

    @NonNull
    @UiThread
    public ImplementationMode getImplementationMode() {
        Threads.checkMainThread();
        return this.mImplementationMode;
    }

    @NonNull
    @UiThread
    public MeteringPointFactory getMeteringPointFactory() {
        Threads.checkMainThread();
        return this.mPreviewViewMeteringPointFactory;
    }

    @Nullable
    @TransformExperimental
    public OutputTransform getOutputTransform() {
        Matrix surfaceToPreviewViewMatrix;
        Threads.checkMainThread();
        try {
            surfaceToPreviewViewMatrix = this.mPreviewTransform.getSurfaceToPreviewViewMatrix(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            surfaceToPreviewViewMatrix = null;
        }
        Rect surfaceCropRect = this.mPreviewTransform.getSurfaceCropRect();
        if (surfaceToPreviewViewMatrix == null || surfaceCropRect == null) {
            Logger.d(TAG, "Transform info is not ready");
            return null;
        }
        surfaceToPreviewViewMatrix.preConcat(TransformUtils.getNormalizedToBuffer(surfaceCropRect));
        if (this.mImplementation instanceof TextureViewImplementation) {
            surfaceToPreviewViewMatrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            Logger.w(TAG, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new OutputTransform(surfaceToPreviewViewMatrix, new Size(surfaceCropRect.width(), surfaceCropRect.height()));
    }

    @NonNull
    public LiveData<StreamState> getPreviewStreamState() {
        return this.mPreviewStreamStateLiveData;
    }

    @NonNull
    @UiThread
    public ScaleType getScaleType() {
        Threads.checkMainThread();
        return this.mPreviewTransform.getScaleType();
    }

    @Nullable
    @ExperimentalPreviewViewScreenFlash
    @UiThread
    public ImageCapture.ScreenFlash getScreenFlash() {
        return getScreenFlashInternal();
    }

    @Nullable
    @UiThread
    public Matrix getSensorToViewTransform() {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.mPreviewTransform.getSensorToViewTransform(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    @NonNull
    @UiThread
    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.checkMainThread();
        return this.mSurfaceProvider;
    }

    @Nullable
    @UiThread
    public ViewPort getViewPort() {
        Threads.checkMainThread();
        if (getDisplay() == null) {
            return null;
        }
        return getViewPort(getDisplay().getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        startListeningToDisplayChange();
        addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onAttachedToWindow();
        }
        attachToControllerIfReady(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.onDetachedFromWindow();
        }
        CameraController cameraController = this.mCameraController;
        if (cameraController != null) {
            cameraController.clearPreviewSurface();
        }
        stopListeningToDisplayChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (this.mCameraController == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z4 = motionEvent.getPointerCount() == 1;
        boolean z5 = motionEvent.getAction() == 1;
        boolean z8 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z4 || !z5 || !z8) {
            return this.mZoomGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.mTouchUpEvent = motionEvent;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.mCameraController != null) {
            MotionEvent motionEvent = this.mTouchUpEvent;
            float x6 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.mTouchUpEvent;
            this.mCameraController.onTapToFocus(this.mPreviewViewMeteringPointFactory, x6, motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f);
        }
        this.mTouchUpEvent = null;
        return super.performClick();
    }

    @OptIn(markerClass = {TransformExperimental.class})
    @MainThread
    public void redrawPreview() {
        Threads.checkMainThread();
        if (this.mImplementation != null) {
            updateDisplayRotationIfNeeded();
            this.mImplementation.redrawPreview();
        }
        this.mPreviewViewMeteringPointFactory.recalculate(new Size(getWidth(), getHeight()), getLayoutDirection());
        CameraController cameraController = this.mCameraController;
        if (cameraController != null) {
            cameraController.updatePreviewViewTransform(getSensorToViewTransform());
        }
    }

    @UiThread
    public void setController(@Nullable CameraController cameraController) {
        Threads.checkMainThread();
        CameraController cameraController2 = this.mCameraController;
        if (cameraController2 != null && cameraController2 != cameraController) {
            cameraController2.clearPreviewSurface();
            setScreenFlashUiInfo(null);
        }
        this.mCameraController = cameraController;
        attachToControllerIfReady(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFrameUpdateListener(@NonNull Executor executor, @NonNull OnFrameUpdateListener onFrameUpdateListener) {
        if (this.mImplementationMode == ImplementationMode.PERFORMANCE) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
        this.mOnFrameUpdateListener = onFrameUpdateListener;
        this.mOnFrameUpdateListenerExecutor = executor;
        PreviewViewImplementation previewViewImplementation = this.mImplementation;
        if (previewViewImplementation != null) {
            previewViewImplementation.setFrameUpdateListener(executor, onFrameUpdateListener);
        }
    }

    @UiThread
    public void setImplementationMode(@NonNull ImplementationMode implementationMode) {
        Threads.checkMainThread();
        this.mImplementationMode = implementationMode;
        if (implementationMode == ImplementationMode.PERFORMANCE && this.mOnFrameUpdateListener != null) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
    }

    @UiThread
    public void setScaleType(@NonNull ScaleType scaleType) {
        Threads.checkMainThread();
        this.mPreviewTransform.setScaleType(scaleType);
        redrawPreview();
        attachToControllerIfReady(false);
    }

    @ExperimentalPreviewViewScreenFlash
    public void setScreenFlashOverlayColor(@ColorInt int i) {
        this.mScreenFlashView.setBackgroundColor(i);
    }

    @UiThread
    public void setScreenFlashWindow(@Nullable Window window) {
        Threads.checkMainThread();
        this.mScreenFlashView.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void updateDisplayRotationIfNeeded() {
        Display display;
        CameraInfoInternal cameraInfoInternal;
        if (!this.mUseDisplayRotation || (display = getDisplay()) == null || (cameraInfoInternal = this.mCameraInfoInternal) == null) {
            return;
        }
        this.mPreviewTransform.overrideWithDisplayRotation(cameraInfoInternal.getSensorRotationDegrees(display.getRotation()), display.getRotation());
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
        ImplementationMode implementationMode = DEFAULT_IMPL_MODE;
        this.mImplementationMode = implementationMode;
        PreviewTransformation previewTransformation = new PreviewTransformation();
        this.mPreviewTransform = previewTransformation;
        this.mUseDisplayRotation = true;
        this.mPreviewStreamStateLiveData = new MutableLiveData<>(StreamState.IDLE);
        this.mActiveStreamStateObserver = new AtomicReference<>();
        this.mPreviewViewMeteringPointFactory = new PreviewViewMeteringPointFactory(previewTransformation);
        this.mDisplayRotationListener = new DisplayRotationListener();
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                this.f7727a.lambda$new$0(view, i6, i10, i11, i12, i13, i14, i15, i16);
            }
        };
        this.mSurfaceProvider = new AnonymousClass1();
        Threads.checkMainThread();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R.styleable.PreviewView;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i4);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, i4);
        try {
            setScaleType(ScaleType.fromId(typedArrayObtainStyledAttributes.getInteger(R.styleable.PreviewView_scaleType, previewTransformation.getScaleType().getId())));
            setImplementationMode(ImplementationMode.fromId(typedArrayObtainStyledAttributes.getInteger(R.styleable.PreviewView_implementationMode, implementationMode.getId())));
            typedArrayObtainStyledAttributes.recycle();
            this.mZoomGestureDetector = new ZoomGestureDetector(context, new o(this));
            if (getBackground() == null) {
                setBackgroundColor(ContextCompat.getColor(getContext(), 17170444));
            }
            ScreenFlashView screenFlashView = new ScreenFlashView(context);
            this.mScreenFlashView = screenFlashView;
            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Nullable
    @SuppressLint({"WrongConstant"})
    @UiThread
    public ViewPort getViewPort(int i) {
        Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new ViewPort.Builder(new Rational(getWidth(), getHeight()), i).setScaleType(getViewPortScaleType()).setLayoutDirection(getLayoutDirection()).build();
    }
}
