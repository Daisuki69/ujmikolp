package androidx.camera.core.processing;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import androidx.camera.core.processing.util.OutputSurface;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
public class OpenGlRenderer {
    private static final String TAG = "OpenGlRenderer";

    @Nullable
    protected Surface mCurrentSurface;

    @Nullable
    protected EGLConfig mEglConfig;

    @Nullable
    protected Thread mGlThread;
    protected final AtomicBoolean mInitialized = new AtomicBoolean(false);
    protected final Map<Surface, OutputSurface> mOutputSurfaceMap = new HashMap();

    @NonNull
    protected EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;

    @NonNull
    protected EGLContext mEglContext = EGL14.EGL_NO_CONTEXT;

    @NonNull
    protected int[] mSurfaceAttrib = GLUtils.EMPTY_ATTRIBS;

    @NonNull
    protected EGLSurface mTempSurface = EGL14.EGL_NO_SURFACE;

    @NonNull
    protected Map<GLUtils.InputFormat, GLUtils.Program2D> mProgramHandles = Collections.EMPTY_MAP;

    @Nullable
    protected GLUtils.Program2D mCurrentProgram = null;

    @NonNull
    protected GLUtils.InputFormat mCurrentInputformat = GLUtils.InputFormat.UNKNOWN;
    private int mExternalTextureId = -1;

    private void activateExternalTexture(int i) {
        GLES20.glActiveTexture(33984);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
    }

    private void createEglContext(@NonNull DynamicRange dynamicRange, @Nullable GraphicDeviceInfo.Builder builder) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEglDisplay = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.mEglDisplay, iArr, 0, iArr, 1)) {
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (builder != null) {
            builder.setEglVersion(iArr[0] + "." + iArr[1]);
        }
        int i = dynamicRange.is10BitHdr() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.mEglDisplay, new int[]{12324, i, 12323, i, 12322, i, 12321, dynamicRange.is10BitHdr() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.is10BitHdr() ? 64 : 4, 12610, dynamicRange.is10BitHdr() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.mEglDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, dynamicRange.is10BitHdr() ? 3 : 2, 12344}, 0);
        GLUtils.checkEglErrorOrThrow("eglCreateContext");
        this.mEglConfig = eGLConfig;
        this.mEglContext = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.mEglDisplay, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d(TAG, "EGLContext created, client version " + iArr2[0]);
    }

    private void createTempSurface() {
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLConfig eGLConfig = this.mEglConfig;
        Objects.requireNonNull(eGLConfig);
        this.mTempSurface = GLUtils.createPBufferSurface(eGLDisplay, eGLConfig, 1, 1);
    }

    @NonNull
    private Pair<String, String> getExtensionsBeforeInitialized(@NonNull DynamicRange dynamicRange) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        try {
            createEglContext(dynamicRange, null);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.mEglDisplay, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new Pair<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            Logger.w(TAG, "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new Pair<>("", "");
        } finally {
            releaseInternal();
        }
    }

    private void releaseInternal() {
        Iterator<GLUtils.Program2D> it = this.mProgramHandles.values().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        this.mProgramHandles = Collections.EMPTY_MAP;
        this.mCurrentProgram = null;
        if (!Objects.equals(this.mEglDisplay, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (OutputSurface outputSurface : this.mOutputSurfaceMap.values()) {
                if (!Objects.equals(outputSurface.getEglSurface(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.mEglDisplay, outputSurface.getEglSurface())) {
                    GLUtils.checkEglErrorOrLog("eglDestroySurface");
                }
            }
            this.mOutputSurfaceMap.clear();
            if (!Objects.equals(this.mTempSurface, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.mEglDisplay, this.mTempSurface);
                this.mTempSurface = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.mEglContext, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
        }
        this.mEglConfig = null;
        this.mExternalTextureId = -1;
        this.mCurrentInputformat = GLUtils.InputFormat.UNKNOWN;
        this.mCurrentSurface = null;
        this.mGlThread = null;
    }

    @Nullable
    public OutputSurface createOutputSurfaceInternal(@NonNull Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLConfig eGLConfig = this.mEglConfig;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceCreateWindowSurface = GLUtils.createWindowSurface(eGLDisplay, eGLConfig, surface, this.mSurfaceAttrib);
            Size surfaceSize = GLUtils.getSurfaceSize(this.mEglDisplay, eGLSurfaceCreateWindowSurface);
            return OutputSurface.of(eGLSurfaceCreateWindowSurface, surfaceSize.getWidth(), surfaceSize.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            Logger.w(TAG, "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    @NonNull
    public OutputSurface getOutSurfaceOrThrow(@NonNull Surface surface) {
        Preconditions.checkState(this.mOutputSurfaceMap.containsKey(surface), "The surface is not registered.");
        OutputSurface outputSurface = this.mOutputSurfaceMap.get(surface);
        Objects.requireNonNull(outputSurface);
        return outputSurface;
    }

    public int getTextureName() {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return this.mExternalTextureId;
    }

    @NonNull
    public GraphicDeviceInfo init(@NonNull DynamicRange dynamicRange) {
        return init(dynamicRange, Collections.EMPTY_MAP);
    }

    public void makeCurrent(@NonNull EGLSurface eGLSurface) {
        Preconditions.checkNotNull(this.mEglDisplay);
        Preconditions.checkNotNull(this.mEglContext);
        if (!EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void registerOutputSurface(@NonNull Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mOutputSurfaceMap.containsKey(surface)) {
            return;
        }
        this.mOutputSurfaceMap.put(surface, GLUtils.NO_OUTPUT_SURFACE);
    }

    public void release() {
        if (this.mInitialized.getAndSet(false)) {
            GLUtils.checkGlThreadOrThrow(this.mGlThread);
            releaseInternal();
        }
    }

    public void removeOutputSurfaceInternal(@NonNull Surface surface, boolean z4) {
        if (this.mCurrentSurface == surface) {
            this.mCurrentSurface = null;
            makeCurrent(this.mTempSurface);
        }
        OutputSurface outputSurfaceRemove = z4 ? this.mOutputSurfaceMap.remove(surface) : this.mOutputSurfaceMap.put(surface, GLUtils.NO_OUTPUT_SURFACE);
        if (outputSurfaceRemove == null || outputSurfaceRemove == GLUtils.NO_OUTPUT_SURFACE) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.mEglDisplay, outputSurfaceRemove.getEglSurface());
        } catch (RuntimeException e) {
            Logger.w(TAG, "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    public void render(long j, @NonNull float[] fArr, @NonNull Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        OutputSurface outSurfaceOrThrow = getOutSurfaceOrThrow(surface);
        if (outSurfaceOrThrow == GLUtils.NO_OUTPUT_SURFACE) {
            outSurfaceOrThrow = createOutputSurfaceInternal(surface);
            if (outSurfaceOrThrow == null) {
                return;
            } else {
                this.mOutputSurfaceMap.put(surface, outSurfaceOrThrow);
            }
        }
        if (surface != this.mCurrentSurface) {
            makeCurrent(outSurfaceOrThrow.getEglSurface());
            this.mCurrentSurface = surface;
            GLES20.glViewport(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
            GLES20.glScissor(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
        }
        GLUtils.Program2D program2D = (GLUtils.Program2D) Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outSurfaceOrThrow.getEglSurface(), j);
        if (EGL14.eglSwapBuffers(this.mEglDisplay, outSurfaceOrThrow.getEglSurface())) {
            return;
        }
        Logger.w(TAG, "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        removeOutputSurfaceInternal(surface, false);
    }

    public void setInputFormat(@NonNull GLUtils.InputFormat inputFormat) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mCurrentInputformat != inputFormat) {
            this.mCurrentInputformat = inputFormat;
            useAndConfigureProgramWithTexture(this.mExternalTextureId);
        }
    }

    @NonNull
    public Bitmap snapshot(@NonNull Size size, @NonNull float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getHeight() * size.getWidth() * 4);
        snapshot(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.copyByteBufferToBitmap(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public void unregisterOutputSurface(@NonNull Surface surface) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        removeOutputSurfaceInternal(surface, true);
    }

    public void useAndConfigureProgramWithTexture(int i) {
        GLUtils.Program2D program2D = this.mProgramHandles.get(this.mCurrentInputformat);
        if (program2D == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.mCurrentInputformat);
        }
        if (this.mCurrentProgram != program2D) {
            this.mCurrentProgram = program2D;
            program2D.use();
            Log.d(TAG, "Using program for input format " + this.mCurrentInputformat + ": " + this.mCurrentProgram);
        }
        activateExternalTexture(i);
    }

    @NonNull
    public GraphicDeviceInfo init(@NonNull DynamicRange dynamicRange, @NonNull Map<GLUtils.InputFormat, ShaderProvider> map) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        GraphicDeviceInfo.Builder builder = GraphicDeviceInfo.builder();
        try {
            if (dynamicRange.is10BitHdr()) {
                Pair<String, String> extensionsBeforeInitialized = getExtensionsBeforeInitialized(dynamicRange);
                String str = (String) Preconditions.checkNotNull(extensionsBeforeInitialized.first);
                String str2 = (String) Preconditions.checkNotNull(extensionsBeforeInitialized.second);
                if (!str.contains("GL_EXT_YUV_target")) {
                    Logger.w(TAG, "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dynamicRange = DynamicRange.SDR;
                }
                this.mSurfaceAttrib = GLUtils.chooseSurfaceAttrib(str2, dynamicRange);
                builder.setGlExtensions(str);
                builder.setEglExtensions(str2);
            }
            createEglContext(dynamicRange, builder);
            createTempSurface();
            makeCurrent(this.mTempSurface);
            builder.setGlVersion(GLUtils.getGlVersionNumber());
            this.mProgramHandles = GLUtils.createPrograms(dynamicRange, map);
            int iCreateTexture = GLUtils.createTexture();
            this.mExternalTextureId = iCreateTexture;
            useAndConfigureProgramWithTexture(iCreateTexture);
            this.mGlThread = Thread.currentThread();
            this.mInitialized.set(true);
            return builder.build();
        } catch (IllegalArgumentException e) {
            e = e;
            releaseInternal();
            throw e;
        } catch (IllegalStateException e7) {
            e = e7;
            releaseInternal();
            throw e;
        }
    }

    private void snapshot(@NonNull ByteBuffer byteBuffer, @NonNull Size size, @NonNull float[] fArr) {
        Preconditions.checkArgument(byteBuffer.capacity() == (size.getHeight() * size.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        Preconditions.checkArgument(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iGenerateTexture = GLUtils.generateTexture();
        GLES20.glActiveTexture(33985);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(3553, iGenerateTexture);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        GLUtils.checkGlErrorOrThrow("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iGenerateFbo = GLUtils.generateFbo();
        GLES20.glBindFramebuffer(36160, iGenerateFbo);
        GLUtils.checkGlErrorOrThrow("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iGenerateTexture, 0);
        GLUtils.checkGlErrorOrThrow("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        GLUtils.checkGlErrorOrThrow("glActiveTexture");
        GLES20.glBindTexture(36197, this.mExternalTextureId);
        GLUtils.checkGlErrorOrThrow("glBindTexture");
        this.mCurrentSurface = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        GLUtils.Program2D program2D = (GLUtils.Program2D) Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        GLUtils.checkGlErrorOrThrow("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLUtils.deleteTexture(iGenerateTexture);
        GLUtils.deleteFbo(iGenerateFbo);
        activateExternalTexture(this.mExternalTextureId);
    }
}
