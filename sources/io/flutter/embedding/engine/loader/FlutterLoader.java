package io.flutter.embedding.engine.loader;

import We.s;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.view.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import og.C1978b;
import x3.d;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterLoader {
    static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
    static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
    static final String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String DISABLE_SURFACE_CONTROL = "io.flutter.embedding.android.DisableSurfaceControl";
    private static final String ENABLED_MERGED_PLATFORM_UI_THREAD_KEY = "io.flutter.embedding.android.EnableMergedPlatformUIThread";
    private static final String ENABLE_IMPELLER_META_DATA_KEY = "io.flutter.embedding.android.EnableImpeller";
    private static final String ENABLE_VULKAN_VALIDATION_META_DATA_KEY = "io.flutter.embedding.android.EnableVulkanValidation";
    static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
    private static final String IMPELLER_BACKEND_META_DATA_KEY = "io.flutter.embedding.android.ImpellerBackend";
    private static final String IMPELLER_OPENGL_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableOpenGLGPUTracing";
    private static final String IMPELLER_VULKAN_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableVulkanGPUTracing";
    static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
    private static final String LEAK_VM_META_DATA_KEY = "io.flutter.embedding.android.LeakVM";
    private static final String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
    static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
    static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
    private static FlutterLoader instance;
    private ExecutorService executorService;
    private FlutterApplicationInfo flutterApplicationInfo;
    private FlutterJNI flutterJNI;

    @Nullable
    Future<InitResult> initResultFuture;
    private long initStartTimestampMillis;
    private boolean initialized;

    @Nullable
    private Settings settings;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1, reason: invalid class name */
    public class AnonymousClass1 implements Callable<InitResult> {
        final /* synthetic */ Context val$appContext;

        public AnonymousClass1(Context context) {
            this.val$appContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$call$0() {
            FlutterLoader.this.flutterJNI.prefetchDefaultFontManager();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public InitResult call() {
            String str;
            Trace.beginSection(ug.a.b("FlutterLoader initTask"));
            try {
                ResourceExtractor resourceExtractorInitResources = FlutterLoader.this.initResources(this.val$appContext);
                try {
                    FlutterLoader.this.flutterJNI.loadLibrary(this.val$appContext);
                    FlutterLoader.this.flutterJNI.updateRefreshRate();
                    FlutterLoader.this.executorService.execute(new Runnable() { // from class: io.flutter.embedding.engine.loader.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f17168a.lambda$call$0();
                        }
                    });
                    if (resourceExtractorInitResources != null) {
                        resourceExtractorInitResources.waitForCompletion();
                    }
                    Context context = this.val$appContext;
                    File filesDir = context.getFilesDir();
                    if (filesDir == null) {
                        filesDir = new File(d.n(context), "files");
                    }
                    String path = filesDir.getPath();
                    Context context2 = this.val$appContext;
                    File codeCacheDir = context2.getCodeCacheDir();
                    if (codeCacheDir == null) {
                        codeCacheDir = context2.getCacheDir();
                    }
                    if (codeCacheDir == null) {
                        codeCacheDir = new File(d.n(context2), "cache");
                    }
                    String path2 = codeCacheDir.getPath();
                    Context context3 = this.val$appContext;
                    File dir = context3.getDir("flutter", 0);
                    if (dir == null) {
                        dir = new File(d.n(context3), "app_flutter");
                    }
                    InitResult initResult = new InitResult(path, path2, dir.getPath(), null);
                    Trace.endSection();
                    return initResult;
                } catch (UnsatisfiedLinkError e) {
                    if (!e.toString().contains("couldn't find \"libflutter.so\"") && !e.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e;
                    }
                    String property = System.getProperty("os.arch");
                    File file = new File(FlutterLoader.this.flutterApplicationInfo.nativeLibraryDir);
                    String[] list = file.list();
                    StringBuilder sb2 = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                    sb2.append(property);
                    sb2.append(", and the native libraries directory (with path ");
                    sb2.append(file.getAbsolutePath());
                    sb2.append(") ");
                    if (file.exists()) {
                        str = "contains the following files: " + Arrays.toString(list);
                    } else {
                        str = "does not exist.";
                    }
                    sb2.append(str);
                    throw new UnsupportedOperationException(sb2.toString(), e);
                }
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static class InitResult {
        final String appStoragePath;
        final String dataDirPath;
        final String engineCachesPath;

        public /* synthetic */ InitResult(String str, String str2, String str3, AnonymousClass1 anonymousClass1) {
            this(str, str2, str3);
        }

        private InitResult(String str, String str2, String str3) {
            this.appStoragePath = str;
            this.engineCachesPath = str2;
            this.dataDirPath = str3;
        }
    }

    public static class Settings {
        private String logTag;

        @Nullable
        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String str) {
            this.logTag = str;
        }
    }

    public FlutterLoader() {
        this(C1978b.a().c.provideFlutterJNI());
    }

    @NonNull
    private String fullAssetPathFrom(@NonNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.flutterApplicationInfo.flutterAssetsDir);
        return s.p(sb2, File.separator, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResourceExtractor initResources(@NonNull Context context) {
        return null;
    }

    private static boolean isLeakVM(@Nullable Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean(LEAK_VM_META_DATA_KEY, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureInitializationCompleteAsync$0(Context context, String[] strArr, Handler handler, Runnable runnable) {
        ensureInitializationComplete(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$ensureInitializationCompleteAsync$1(Context context, String[] strArr, Handler handler, Runnable runnable) {
        try {
            this.initResultFuture.get();
            Looper mainLooper = Looper.getMainLooper();
            (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper)).post(new a(this, context, strArr, handler, runnable, 1));
        } catch (Exception e) {
            Log.e(TAG, "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public boolean automaticallyRegisterPlugins() {
        return this.flutterApplicationInfo.automaticallyRegisterPlugins;
    }

    public void ensureInitializationComplete(@NonNull Context context, @Nullable String[] strArr) {
        Context context2;
        if (this.initialized) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            Trace.beginSection(ug.a.b("FlutterLoader#ensureInitializationComplete"));
            try {
                InitResult initResult = this.initResultFuture.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb2 = new StringBuilder("--icu-native-lib-path=");
                sb2.append(this.flutterApplicationInfo.nativeLibraryDir);
                String str = File.separator;
                sb2.append(str);
                sb2.append(DEFAULT_LIBRARY);
                arrayList.add(sb2.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.aotSharedLibraryName);
                arrayList.add("--aot-shared-library-name=" + this.flutterApplicationInfo.nativeLibraryDir + str + this.flutterApplicationInfo.aotSharedLibraryName);
                StringBuilder sb3 = new StringBuilder("--cache-dir-path=");
                sb3.append(initResult.engineCachesPath);
                arrayList.add(sb3.toString());
                if (this.flutterApplicationInfo.domainNetworkPolicy != null) {
                    arrayList.add("--domain-network-policy=" + this.flutterApplicationInfo.domainNetworkPolicy);
                }
                if (this.settings.getLogTag() != null) {
                    arrayList.add("--log-tag=" + this.settings.getLogTag());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i = bundle != null ? bundle.getInt(OLD_GEN_HEAP_SIZE_META_DATA_KEY) : 0;
                if (i == 0) {
                    context2 = context;
                    ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i = (int) ((r10.totalMem / 1000000.0d) / 2.0d);
                } else {
                    context2 = context;
                }
                arrayList.add("--old-gen-heap-size=" + i);
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey(ENABLE_IMPELLER_META_DATA_KEY)) {
                        if (bundle.getBoolean(ENABLE_IMPELLER_META_DATA_KEY)) {
                            arrayList.add(FlutterShellArgs.ARG_ENABLE_IMPELLER);
                        } else {
                            arrayList.add(FlutterShellArgs.ARG_DISABLE_IMPELLER);
                        }
                    }
                    if (bundle.getBoolean(ENABLE_VULKAN_VALIDATION_META_DATA_KEY, false)) {
                        arrayList.add(FlutterShellArgs.ARG_ENABLE_VULKAN_VALIDATION);
                    }
                    if (bundle.getBoolean(IMPELLER_OPENGL_GPU_TRACING_DATA_KEY, false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean(IMPELLER_VULKAN_GPU_TRACING_DATA_KEY, false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean(DISABLE_SURFACE_CONTROL, false)) {
                        arrayList.add("--disable-surface-control");
                    }
                    if (bundle.containsKey(ENABLED_MERGED_PLATFORM_UI_THREAD_KEY)) {
                        if (bundle.getBoolean(ENABLED_MERGED_PLATFORM_UI_THREAD_KEY)) {
                            arrayList.add("--enable-merged-platform-ui-thread");
                        } else {
                            arrayList.add("--no-enable-merged-platform-ui-thread");
                        }
                    }
                    String string = bundle.getString(IMPELLER_BACKEND_META_DATA_KEY);
                    if (string != null) {
                        arrayList.add("--impeller-backend=".concat(string));
                    }
                }
                arrayList.add("--leak-vm=".concat(isLeakVM(bundle) ? "true" : "false"));
                this.flutterJNI.init(context2, (String[]) arrayList.toArray(new String[0]), null, initResult.appStoragePath, initResult.engineCachesPath, SystemClock.uptimeMillis() - this.initStartTimestampMillis);
                this.initialized = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e) {
            Log.e(TAG, "Flutter initialization failed.", e);
            throw new RuntimeException(e);
        }
    }

    public void ensureInitializationCompleteAsync(@NonNull Context context, @Nullable String[] strArr, @NonNull Handler handler, @NonNull Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.initialized) {
            handler.post(runnable);
        } else {
            this.executorService.execute(new a(this, context, strArr, handler, runnable, 0));
        }
    }

    @NonNull
    public String findAppBundlePath() {
        return this.flutterApplicationInfo.flutterAssetsDir;
    }

    @NonNull
    public String getLookupKeyForAsset(@NonNull String str) {
        return fullAssetPathFrom(str);
    }

    public boolean initialized() {
        return this.initialized;
    }

    public void startInitialization(@NonNull Context context) {
        startInitialization(context, new Settings());
    }

    @NonNull
    public String getLookupKeyForAsset(@NonNull String str, @NonNull String str2) {
        StringBuilder sb2 = new StringBuilder("packages");
        String str3 = File.separator;
        return getLookupKeyForAsset(androidx.camera.core.impl.a.p(sb2, str3, str2, str3, str));
    }

    public void startInitialization(@NonNull Context context, @NonNull Settings settings) {
        if (this.settings != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        Trace.beginSection(ug.a.b("FlutterLoader#startInitialization"));
        try {
            Context applicationContext = context.getApplicationContext();
            this.settings = settings;
            this.initStartTimestampMillis = SystemClock.uptimeMillis();
            this.flutterApplicationInfo = ApplicationInfoLoader.load(applicationContext);
            x xVarA = x.a((DisplayManager) applicationContext.getSystemService("display"), this.flutterJNI);
            xVarA.f17500b.setAsyncWaitForVsyncDelegate(xVarA.f17501d);
            this.initResultFuture = this.executorService.submit(new AnonymousClass1(applicationContext));
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public FlutterLoader(@NonNull FlutterJNI flutterJNI) {
        this(flutterJNI, C1978b.a().f18849d);
    }

    public FlutterLoader(@NonNull FlutterJNI flutterJNI, @NonNull ExecutorService executorService) {
        this.initialized = false;
        this.flutterJNI = flutterJNI;
        this.executorService = executorService;
    }
}
