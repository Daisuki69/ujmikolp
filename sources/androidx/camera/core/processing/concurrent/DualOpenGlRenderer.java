package androidx.camera.core.processing.concurrent;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.LayoutSettings;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.ShaderProvider;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.processing.util.GraphicDeviceInfo;
import androidx.camera.core.processing.util.OutputSurface;
import androidx.core.util.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
public final class DualOpenGlRenderer extends OpenGlRenderer {
    private static final String TAG = "DualOpenGlRenderer";

    @NonNull
    private final LayoutSettings mPrimaryLayoutSettings;

    @NonNull
    private final LayoutSettings mSecondaryLayoutSettings;
    private int mPrimaryExternalTextureId = -1;
    private int mSecondaryExternalTextureId = -1;

    public DualOpenGlRenderer(@NonNull LayoutSettings layoutSettings, @NonNull LayoutSettings layoutSettings2) {
        this.mPrimaryLayoutSettings = layoutSettings;
        this.mSecondaryLayoutSettings = layoutSettings2;
    }

    @NonNull
    private static float[] getTransformMatrix(@NonNull Size size, @NonNull Size size2, @NonNull LayoutSettings layoutSettings) {
        float[] fArrCreate4x4IdentityMatrix = GLUtils.create4x4IdentityMatrix();
        float[] fArrCreate4x4IdentityMatrix2 = GLUtils.create4x4IdentityMatrix();
        float[] fArrCreate4x4IdentityMatrix3 = GLUtils.create4x4IdentityMatrix();
        Matrix.scaleM(fArrCreate4x4IdentityMatrix, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArrCreate4x4IdentityMatrix2, 0, layoutSettings.getOffsetX() / layoutSettings.getWidth(), layoutSettings.getOffsetY() / layoutSettings.getHeight(), 0.0f);
        Matrix.multiplyMM(fArrCreate4x4IdentityMatrix3, 0, fArrCreate4x4IdentityMatrix, 0, fArrCreate4x4IdentityMatrix2, 0);
        return fArrCreate4x4IdentityMatrix3;
    }

    private void renderInternal(@NonNull OutputSurface outputSurface, @NonNull SurfaceOutput surfaceOutput, @NonNull SurfaceTexture surfaceTexture, @NonNull LayoutSettings layoutSettings, int i, boolean z4) {
        useAndConfigureProgramWithTexture(i);
        GLES20.glViewport(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        GLES20.glScissor(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        surfaceOutput.updateTransformMatrix(fArr2, fArr, z4);
        GLUtils.Program2D program2D = (GLUtils.Program2D) Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof GLUtils.SamplerShaderProgram) {
            ((GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr2);
        }
        program2D.updateTransformMatrix(getTransformMatrix(new Size((int) (layoutSettings.getWidth() * outputSurface.getWidth()), (int) (layoutSettings.getHeight() * outputSurface.getHeight())), new Size(outputSurface.getWidth(), outputSurface.getHeight()), layoutSettings));
        program2D.updateAlpha(layoutSettings.getAlpha());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        GLUtils.checkGlErrorOrThrow("glDrawArrays");
        GLES20.glDisable(3042);
    }

    public int getTextureName(boolean z4) {
        GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return z4 ? this.mPrimaryExternalTextureId : this.mSecondaryExternalTextureId;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    @NonNull
    public GraphicDeviceInfo init(@NonNull DynamicRange dynamicRange, @NonNull Map<GLUtils.InputFormat, ShaderProvider> map) {
        GraphicDeviceInfo graphicDeviceInfoInit = super.init(dynamicRange, map);
        this.mPrimaryExternalTextureId = GLUtils.createTexture();
        this.mSecondaryExternalTextureId = GLUtils.createTexture();
        return graphicDeviceInfoInit;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public void release() {
        super.release();
        this.mPrimaryExternalTextureId = -1;
        this.mSecondaryExternalTextureId = -1;
    }

    public void render(long j, @NonNull Surface surface, @NonNull SurfaceOutput surfaceOutput, @NonNull SurfaceTexture surfaceTexture, @NonNull SurfaceTexture surfaceTexture2) {
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
        OutputSurface outputSurface = outSurfaceOrThrow;
        if (surface != this.mCurrentSurface) {
            makeCurrent(outputSurface.getEglSurface());
            this.mCurrentSurface = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        renderInternal(outputSurface, surfaceOutput, surfaceTexture, this.mPrimaryLayoutSettings, this.mPrimaryExternalTextureId, true);
        renderInternal(outputSurface, surfaceOutput, surfaceTexture2, this.mSecondaryLayoutSettings, this.mSecondaryExternalTextureId, true);
        EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outputSurface.getEglSurface(), j);
        if (EGL14.eglSwapBuffers(this.mEglDisplay, outputSurface.getEglSurface())) {
            return;
        }
        Logger.w(TAG, "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        removeOutputSurfaceInternal(surface, false);
    }
}
