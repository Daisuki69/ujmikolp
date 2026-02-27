package io.flutter.embedding.engine;

import Cg.c;
import M2.b;
import N4.d;
import We.s;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.getkeepsafe.relinker.MissingLibraryException;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.platform.C1620d;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.u;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import pg.C2037D;
import qg.C2174b;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";

    @Nullable
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;

    @Nullable
    private static String vmServiceUri;

    @Nullable
    private AccessibilityDelegate accessibilityDelegate;

    @Nullable
    private DeferredComponentManager deferredComponentManager;

    @Nullable
    private C2174b localizationPlugin;

    @Nullable
    private Long nativeShellHolderId;

    @Nullable
    private PlatformMessageHandler platformMessageHandler;

    @Nullable
    private u platformViewsController;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();

    @NonNull
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();

    @NonNull
    private final Looper mainLooper = Looper.getMainLooper();

    public interface AccessibilityDelegate {
        void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr);

        void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr);
    }

    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j);
    }

    public static class Factory {
        public FlutterJNI provideFlutterJNI() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        asyncWaitForVsyncDelegate2.asyncWaitForVsync(j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.embedding.engine.a] */
    @Nullable
    @VisibleForTesting
    public static Bitmap decodeImage(@NonNull ByteBuffer byteBuffer, final long j) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder$OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.a
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    FlutterJNI.lambda$decodeImage$0(j, imageDecoder, imageInfo, source);
                }
            });
        } catch (IOException e) {
            Log.e(TAG, "Failed to decode image", e);
            return null;
        }
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Nullable
    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    @Nullable
    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i, ByteBuffer byteBuffer) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handlePlatformMessageResponse(i, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named unused = ColorSpace.Named.SRGB;
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(@NonNull FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j);

    private native void nativeDeferredComponentInstallFailure(int i, @NonNull String str, boolean z4);

    private native void nativeDestroy(long j);

    private native void nativeDispatchEmptyPlatformMessage(long j, @NonNull String str, int i);

    private native void nativeDispatchPlatformMessage(long j, @NonNull String str, @Nullable ByteBuffer byteBuffer, int i, int i4);

    private native void nativeDispatchPointerDataPacket(long j, @NonNull ByteBuffer byteBuffer, int i);

    private native void nativeDispatchSemanticsAction(long j, int i, int i4, @Nullable ByteBuffer byteBuffer, int i6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i);

    private native Bitmap nativeGetBitmap(long j);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j, int i, int i4);

    private static native void nativeInit(@NonNull Context context, @NonNull String[] strArr, @Nullable String str, @NonNull String str2, @NonNull String str3, long j);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j, int i);

    private native void nativeInvokePlatformMessageResponseCallback(long j, int i, @Nullable ByteBuffer byteBuffer, int i4);

    private native void nativeLoadDartDeferredLibrary(long j, int i, @NonNull String[] strArr);

    @NonNull
    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j);

    private native void nativeMarkTextureFrameAvailable(long j, long j6);

    private native void nativeNotifyLowMemoryWarning(long j);

    private native void nativeOnVsync(long j, long j6, long j7);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j, long j6, @NonNull WeakReference<TextureRegistry$ImageConsumer> weakReference);

    private native void nativeRegisterTexture(long j, long j6, @NonNull WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j, @NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull AssetManager assetManager, @Nullable List<String> list);

    private native void nativeScheduleFrame(long j);

    private native void nativeSetAccessibilityFeatures(long j, int i);

    private native void nativeSetSemanticsEnabled(long j, boolean z4);

    private native void nativeSetViewportMetrics(long j, float f, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3);

    private native boolean nativeShouldDisableAHB();

    private native FlutterJNI nativeSpawn(long j, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list);

    private native void nativeSurfaceChanged(long j, int i, int i4);

    private native void nativeSurfaceCreated(long j, @NonNull Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeSurfaceWindowChanged(long j, @NonNull Surface surface);

    private native void nativeUnregisterTexture(long j, long j6);

    private native void nativeUpdateDisplayMetrics(long j);

    private native void nativeUpdateJavaAssetManager(long j, @NonNull AssetManager assetManager, @NonNull String str);

    private native void nativeUpdateRefreshRate(float f);

    private void onPreEngineRestart() {
        Iterator<FlutterEngine.EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreEngineRestart();
        }
    }

    @UiThread
    private void updateCustomAccessibilityActions(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    @UiThread
    private void updateSemantics(@NonNull ByteBuffer byteBuffer, @NonNull String[] strArr, @NonNull ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean ShouldDisableAHB() {
        return nativeShouldDisableAHB();
    }

    @UiThread
    public void addEngineLifecycleListener(@NonNull FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    @UiThread
    public void addIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    @UiThread
    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j) {
        nativeCleanupMessageData(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        if (r4.hasNext() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0146, code lost:
    
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        if (r4.hasNext() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0165, code lost:
    
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
    
        r2 = r2 + 1;
     */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] computePlatformResolvedLocale(@androidx.annotation.NonNull java.lang.String[] r10) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    @UiThread
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        uVar.getClass();
        C1620d c1620d = new C1620d(uVar.f17249d.getContext(), uVar.f17249d.getWidth(), uVar.f17249d.getHeight(), FlutterImageView.SurfaceKind.overlay);
        c1620d.f17223a = uVar.h;
        int i = uVar.f17254o;
        uVar.f17254o = i + 1;
        uVar.m.put(i, c1620d);
        return new FlutterOverlaySurface(i, c1620d.getSurface());
    }

    @UiThread
    public void deferredComponentInstallFailure(int i, @NonNull String str, boolean z4) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i, str, z4);
    }

    @UiThread
    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        uVar.c();
    }

    @UiThread
    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    @UiThread
    public void dispatchEmptyPlatformMessage(@NonNull String str, int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i);
    }

    @UiThread
    public void dispatchPlatformMessage(@NonNull String str, @Nullable ByteBuffer byteBuffer, int i, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    @UiThread
    public void dispatchPointerDataPacket(@NonNull ByteBuffer byteBuffer, int i) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i);
    }

    public void dispatchSemanticsAction(int i, @NonNull e eVar) {
        dispatchSemanticsAction(i, eVar, null);
    }

    @UiThread
    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    @Nullable
    public float getScaledFontSize(float f, int i) {
        DisplayMetrics pastDisplayMetrics = SettingsChannel.getPastDisplayMetrics(i);
        if (pastDisplayMetrics != null) {
            return TypedValue.applyDimension(2, f, pastDisplayMetrics) / pastDisplayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i) + ", which can't be found.");
        return -1.0f;
    }

    @VisibleForTesting
    public void handlePlatformMessage(@NonNull String str, ByteBuffer byteBuffer, int i, long j) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handleMessageFromDart(str, byteBuffer, i, j);
        } else {
            nativeCleanupMessageData(j);
        }
    }

    public void init(@NonNull Context context, @NonNull String[] strArr, @Nullable String str, @NonNull String str2, @NonNull String str3, long j) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th2) {
            this.shellHolderLock.readLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.flutter.embedding.engine.FlutterJNI] */
    public void invokePlatformMessageResponseCallback(int i, @NonNull ByteBuffer byteBuffer, int i4) {
        FlutterJNI flutterJNIIsAttached;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            flutterJNIIsAttached = isAttached();
            try {
                if (flutterJNIIsAttached != 0) {
                    FlutterJNI flutterJNI = this;
                    flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i, byteBuffer, i4);
                    flutterJNIIsAttached = flutterJNI;
                } else {
                    flutterJNIIsAttached = this;
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i);
                }
                flutterJNIIsAttached.shellHolderLock.readLock().unlock();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                flutterJNIIsAttached.shellHolderLock.readLock().unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            flutterJNIIsAttached = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i) {
        return nativeFlutterTextUtilsIsEmoji(i);
    }

    public boolean isCodePointEmojiModifier(int i) {
        return nativeFlutterTextUtilsIsEmojiModifier(i);
    }

    public boolean isCodePointEmojiModifierBase(int i) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i);
    }

    public boolean isCodePointRegionalIndicator(int i) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i);
    }

    public boolean isCodePointVariantSelector(int i) {
        return nativeFlutterTextUtilsIsVariationSelector(i);
    }

    @UiThread
    public void loadDartDeferredLibrary(int i, @NonNull String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [Lh.c] */
    public void loadLibrary(Context context) throws Throwable {
        Object obj;
        ?? r9;
        String[] strArrY;
        ZipFile zipFile;
        ?? r92;
        ?? inputStream;
        ?? fileOutputStream;
        ?? r16;
        char c = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        c cVar = new c(18);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        c.n("Beginning load of %s...", "flutter");
        d dVar = (d) cVar.c;
        HashSet hashSet = (HashSet) cVar.f768b;
        if (hashSet.contains("flutter")) {
            c.n("%s already loaded previously!", "flutter");
        } else {
            Object obj2 = null;
            try {
                dVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                c.n("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e) {
                c.n("Loading the library normally failed: %s", Log.getStackTraceString(e));
                c.n("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File fileM = cVar.m(context);
                if (fileM.exists()) {
                    obj = null;
                } else {
                    File dir = context.getDir("lib", 0);
                    File fileM2 = cVar.m(context);
                    dVar.getClass();
                    File[] fileArrListFiles = dir.listFiles(new O0.a(System.mapLibraryName("flutter")));
                    if (fileArrListFiles != null) {
                        int length = fileArrListFiles.length;
                        int i = 0;
                        while (i < length) {
                            File file = fileArrListFiles[i];
                            Object obj3 = obj2;
                            if (!file.getAbsolutePath().equals(fileM2.getAbsolutePath())) {
                                file.delete();
                            }
                            i++;
                            obj2 = obj3;
                        }
                    }
                    obj = obj2;
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName("flutter");
                    ((b) cVar.f769d).getClass();
                    try {
                        Lh.c cVarU = b.U(context, strArr, strMapLibraryName, cVar);
                        try {
                            if (cVarU == null) {
                                try {
                                    strArrY = b.Y(context, strMapLibraryName);
                                } catch (Exception e7) {
                                    strArrY = new String[]{e7.toString()};
                                }
                                StringBuilder sbW = s.w("Could not find '", strMapLibraryName, "'. Looked for: ");
                                sbW.append(Arrays.toString(strArr));
                                sbW.append(", but only found: ");
                                throw new MissingLibraryException(s.p(sbW, Arrays.toString(strArrY), "."));
                            }
                            int i4 = 0;
                            while (true) {
                                int i6 = i4 + 1;
                                zipFile = (ZipFile) cVarU.f2990b;
                                if (i4 < 5) {
                                    Object[] objArr = new Object[1];
                                    objArr[c] = strMapLibraryName;
                                    c.n("Found %s! Extracting...", objArr);
                                    try {
                                        if (fileM.exists() || fileM.createNewFile()) {
                                            try {
                                                inputStream = zipFile.getInputStream((ZipEntry) cVarU.c);
                                                try {
                                                    fileOutputStream = new FileOutputStream(fileM);
                                                } catch (FileNotFoundException unused) {
                                                    fileOutputStream = obj;
                                                } catch (IOException unused2) {
                                                    fileOutputStream = obj;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r92 = inputStream;
                                                    r16 = obj;
                                                }
                                            } catch (FileNotFoundException unused3) {
                                                inputStream = obj;
                                                fileOutputStream = inputStream;
                                            } catch (IOException unused4) {
                                                inputStream = obj;
                                                fileOutputStream = inputStream;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r92 = obj;
                                                r16 = obj;
                                            }
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j = 0;
                                                while (true) {
                                                    int i10 = inputStream.read(bArr);
                                                    if (i10 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i10);
                                                    j += (long) i10;
                                                }
                                                fileOutputStream.flush();
                                                fileOutputStream.getFD().sync();
                                                if (j == fileM.length()) {
                                                    b.S(inputStream);
                                                    b.S(fileOutputStream);
                                                    fileM.setReadable(true, false);
                                                    fileM.setExecutable(true, false);
                                                    fileM.setWritable(true);
                                                    break;
                                                }
                                                b.S(inputStream);
                                                b.S(fileOutputStream);
                                            } catch (FileNotFoundException unused5) {
                                                b.S(inputStream);
                                                b.S(fileOutputStream);
                                                i4 = i6;
                                                c = 0;
                                            } catch (IOException unused6) {
                                                b.S(inputStream);
                                                b.S(fileOutputStream);
                                                i4 = i6;
                                                c = 0;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r92 = inputStream;
                                                r16 = fileOutputStream;
                                                b.S(r92);
                                                b.S(r16);
                                                throw th;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                    }
                                    i4 = i6;
                                    c = 0;
                                }
                            }
                            try {
                                zipFile.close();
                                break;
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r9 = cVarU;
                            if (r9 != 0) {
                                try {
                                    ((ZipFile) r9.f2990b).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r9 = obj;
                    }
                }
                String absolutePath = fileM.getAbsolutePath();
                dVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                c.n("%s (%s) was re-linked!", "flutter", obj);
            }
        }
        loadLibraryCalled = true;
    }

    @UiThread
    public void markTextureFrameAvailable(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j);
    }

    @UiThread
    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public void onBeginFrame() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        uVar.f17257r.clear();
        uVar.f17258s.clear();
    }

    @UiThread
    public void onDisplayOverlaySurface(int i, int i4, int i6, int i10, int i11) {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = uVar.m;
        if (sparseArray.get(i) == null) {
            throw new IllegalStateException(s.g(i, "The overlay surface (id:", ") doesn't exist"));
        }
        if (uVar.f17256q && !uVar.f17255p) {
            uVar.f17249d.convertToImageView();
            uVar.f17255p = true;
        }
        View view = (C1620d) sparseArray.get(i);
        if (view.getParent() == null) {
            uVar.f17249d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i6;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        uVar.f17257r.add(Integer.valueOf(i));
    }

    @UiThread
    public void onDisplayPlatformView(final int i, int i4, int i6, int i10, int i11, int i12, int i13, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        final u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (uVar.f17256q && !uVar.f17255p) {
            uVar.f17249d.convertToImageView();
            uVar.f17255p = true;
        }
        SparseArray sparseArray = uVar.f17251k;
        k kVar = (k) sparseArray.get(i);
        if (kVar == null) {
            return;
        }
        SparseArray sparseArray2 = uVar.f17252l;
        if (sparseArray2.get(i) == null) {
            View view = kVar.getView();
            if (view == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            }
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            Activity activity = uVar.c;
            FlutterMutatorView flutterMutatorView = new FlutterMutatorView(activity, activity.getResources().getDisplayMetrics().density, uVar.f17248b);
            flutterMutatorView.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.q
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z4) {
                    u uVar2 = uVar;
                    int i14 = i;
                    if (z4) {
                        uVar2.f17250g.invokeViewFocused(i14);
                        return;
                    }
                    io.flutter.plugin.editing.k kVar2 = uVar2.f;
                    if (kVar2 != null) {
                        kVar2.b(i14);
                    }
                }
            });
            sparseArray2.put(i, flutterMutatorView);
            view.setImportantForAccessibility(4);
            flutterMutatorView.addView(view);
            uVar.f17249d.addView(flutterMutatorView);
        }
        FlutterMutatorView flutterMutatorView2 = (FlutterMutatorView) sparseArray2.get(i);
        flutterMutatorView2.readyToDisplay(flutterMutatorsStack, i4, i6, i10, i11);
        flutterMutatorView2.setVisibility(0);
        flutterMutatorView2.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        View view2 = ((k) sparseArray.get(i)).getView();
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
            view2.bringToFront();
        }
        uVar.f17258s.add(Integer.valueOf(i));
    }

    @UiThread
    public void onEndFrame() {
        ensureRunningOnMainThread();
        u uVar = this.platformViewsController;
        if (uVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z4 = false;
        if (uVar.f17255p && uVar.f17258s.isEmpty()) {
            uVar.f17255p = false;
            uVar.f17249d.revertImageView(new androidx.window.layout.adapter.extensions.a(uVar, 16));
        } else {
            if (uVar.f17255p && uVar.f17249d.acquireLatestImageViewFrame()) {
                z4 = true;
            }
            uVar.e(z4);
        }
    }

    @UiThread
    @VisibleForTesting
    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiDisplayed();
        }
    }

    @UiThread
    @VisibleForTesting
    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiNoLongerDisplayed();
        }
    }

    @UiThread
    public void onSurfaceChanged(int i, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i, i4);
    }

    @UiThread
    public void onSurfaceCreated(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    @UiThread
    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public void onSurfaceWindowChanged(@NonNull Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j, long j6, long j7) {
        nativeOnVsync(j, j6, j7);
    }

    @VisibleForTesting
    public long performNativeAttach(@NonNull FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    @UiThread
    public void registerImageTexture(long j, @NonNull TextureRegistry$ImageConsumer textureRegistry$ImageConsumer) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(textureRegistry$ImageConsumer));
    }

    @UiThread
    public void registerTexture(long j, @NonNull SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j, new WeakReference<>(surfaceTextureWrapper));
    }

    @UiThread
    public void removeEngineLifecycleListener(@NonNull FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    @UiThread
    public void removeIsDisplayingFlutterUiListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    @UiThread
    public void requestDartDeferredLibrary(int i) {
        DeferredComponentManager deferredComponentManager = this.deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.installDeferredComponent(i, null);
        } else {
            Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    @UiThread
    public void runBundleAndSnapshotFromLibrary(@NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull AssetManager assetManager, @Nullable List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list);
    }

    @UiThread
    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    @UiThread
    public void setAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }

    @UiThread
    public void setAccessibilityFeatures(int i) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i);
        }
    }

    @VisibleForTesting
    public void setAccessibilityFeaturesInNative(int i) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i);
    }

    public void setAsyncWaitForVsyncDelegate(@Nullable AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    @UiThread
    public void setDeferredComponentManager(@Nullable DeferredComponentManager deferredComponentManager) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.setJNI(this);
        }
    }

    @UiThread
    public void setLocalizationPlugin(@Nullable C2174b c2174b) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c2174b;
    }

    @UiThread
    public void setPlatformMessageHandler(@Nullable PlatformMessageHandler platformMessageHandler) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }

    @UiThread
    public void setPlatformViewsController(@NonNull u uVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = uVar;
    }

    public void setRefreshRateFPS(float f) {
        refreshRateFPS = f;
        updateRefreshRate();
    }

    @UiThread
    public void setSemanticsEnabled(boolean z4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z4);
        }
    }

    @VisibleForTesting
    public void setSemanticsEnabledInNative(boolean z4) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z4);
    }

    @UiThread
    public void setViewportMetrics(float f, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f, i, i4, i6, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, iArr, iArr2, iArr3);
    }

    @NonNull
    @UiThread
    public FlutterJNI spawn(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list);
        Long l6 = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l6 == null || l6.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @UiThread
    public void unregisterTexture(long j) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j);
    }

    public void updateDisplayMetrics(int i, float f, float f3, float f7) {
        displayWidth = f;
        displayHeight = f3;
        displayDensity = f7;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    @UiThread
    public void updateJavaAssetManager(@NonNull AssetManager assetManager, @NonNull String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i, @NonNull e eVar, @Nullable Object obj) {
        ByteBuffer byteBufferEncodeMessage;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferEncodeMessage = C2037D.INSTANCE.encodeMessage(obj);
            iPosition = byteBufferEncodeMessage.position();
        } else {
            byteBufferEncodeMessage = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i, eVar.f17420a, byteBufferEncodeMessage, iPosition);
    }

    @UiThread
    public void dispatchSemanticsAction(int i, int i4, @Nullable ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i, i4, byteBuffer, i6);
    }
}
