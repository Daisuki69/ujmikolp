package io.flutter.embedding.engine;

import E1.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.BackGestureChannel;
import io.flutter.embedding.engine.systemchannels.DeferredComponentChannel;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.MouseCursorChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import io.flutter.embedding.engine.systemchannels.RestorationChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.platform.u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import og.C1978b;
import qg.C2174b;
import sg.C2258a;
import ug.b;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterEngine implements b {
    private static final String TAG = "FlutterEngine";

    @NonNull
    private final AccessibilityChannel accessibilityChannel;

    @NonNull
    private final BackGestureChannel backGestureChannel;

    @NonNull
    private final DartExecutor dartExecutor;

    @NonNull
    private final DeferredComponentChannel deferredComponentChannel;

    @NonNull
    private final EngineLifecycleListener engineLifecycleListener;

    @NonNull
    private final Set<EngineLifecycleListener> engineLifecycleListeners;

    @NonNull
    private final FlutterJNI flutterJNI;

    @NonNull
    private final LifecycleChannel lifecycleChannel;

    @NonNull
    private final LocalizationChannel localizationChannel;

    @NonNull
    private final C2174b localizationPlugin;

    @NonNull
    private final MouseCursorChannel mouseCursorChannel;

    @NonNull
    private final NavigationChannel navigationChannel;

    @NonNull
    private final PlatformChannel platformChannel;

    @NonNull
    private final u platformViewsController;

    @NonNull
    private final FlutterEngineConnectionRegistry pluginRegistry;

    @NonNull
    private final ProcessTextChannel processTextChannel;

    @NonNull
    private final FlutterRenderer renderer;

    @NonNull
    private final RestorationChannel restorationChannel;

    @NonNull
    private final SettingsChannel settingsChannel;

    @NonNull
    private final SpellCheckChannel spellCheckChannel;

    @NonNull
    private final SystemChannel systemChannel;

    @NonNull
    private final TextInputChannel textInputChannel;

    public interface EngineLifecycleListener {
        void onEngineWillDestroy();

        void onPreEngineRestart();
    }

    public FlutterEngine(@NonNull Context context) {
        this(context, null);
    }

    private void attachToJni() {
        this.flutterJNI.attachToNative();
        if (!isAttachedToJni()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean isAttachedToJni() {
        return this.flutterJNI.isAttached();
    }

    public void addEngineLifecycleListener(@NonNull EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void destroy() {
        Iterator<EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onEngineWillDestroy();
        }
        this.pluginRegistry.destroy();
        u uVar = this.platformViewsController;
        while (true) {
            SparseArray sparseArray = uVar.f17251k;
            if (sparseArray.size() <= 0) {
                break;
            }
            uVar.f17261v.dispose(sparseArray.keyAt(0));
        }
        this.dartExecutor.onDetachedFromJNI();
        this.flutterJNI.removeEngineLifecycleListener(this.engineLifecycleListener);
        this.flutterJNI.setDeferredComponentManager(null);
        this.flutterJNI.detachFromNativeAndReleaseResources();
        if (C1978b.a().f18848b != null) {
            C1978b.a().f18848b.destroy();
            this.deferredComponentChannel.setDeferredComponentManager(null);
        }
    }

    @NonNull
    public AccessibilityChannel getAccessibilityChannel() {
        return this.accessibilityChannel;
    }

    @NonNull
    public ActivityControlSurface getActivityControlSurface() {
        return this.pluginRegistry;
    }

    @NonNull
    public BackGestureChannel getBackGestureChannel() {
        return this.backGestureChannel;
    }

    @NonNull
    public BroadcastReceiverControlSurface getBroadcastReceiverControlSurface() {
        return this.pluginRegistry;
    }

    @NonNull
    public ContentProviderControlSurface getContentProviderControlSurface() {
        return this.pluginRegistry;
    }

    @NonNull
    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    @NonNull
    public DeferredComponentChannel getDeferredComponentChannel() {
        return this.deferredComponentChannel;
    }

    @NonNull
    public LifecycleChannel getLifecycleChannel() {
        return this.lifecycleChannel;
    }

    @NonNull
    public LocalizationChannel getLocalizationChannel() {
        return this.localizationChannel;
    }

    @NonNull
    public C2174b getLocalizationPlugin() {
        return this.localizationPlugin;
    }

    @NonNull
    public MouseCursorChannel getMouseCursorChannel() {
        return this.mouseCursorChannel;
    }

    @NonNull
    public NavigationChannel getNavigationChannel() {
        return this.navigationChannel;
    }

    @NonNull
    public PlatformChannel getPlatformChannel() {
        return this.platformChannel;
    }

    @NonNull
    public u getPlatformViewsController() {
        return this.platformViewsController;
    }

    @NonNull
    public PluginRegistry getPlugins() {
        return this.pluginRegistry;
    }

    @NonNull
    public ProcessTextChannel getProcessTextChannel() {
        return this.processTextChannel;
    }

    @NonNull
    public FlutterRenderer getRenderer() {
        return this.renderer;
    }

    @NonNull
    public RestorationChannel getRestorationChannel() {
        return this.restorationChannel;
    }

    @NonNull
    public ServiceControlSurface getServiceControlSurface() {
        return this.pluginRegistry;
    }

    @NonNull
    public SettingsChannel getSettingsChannel() {
        return this.settingsChannel;
    }

    @NonNull
    public SpellCheckChannel getSpellCheckChannel() {
        return this.spellCheckChannel;
    }

    @NonNull
    public SystemChannel getSystemChannel() {
        return this.systemChannel;
    }

    @NonNull
    public TextInputChannel getTextInputChannel() {
        return this.textInputChannel;
    }

    public void removeEngineLifecycleListener(@NonNull EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    @NonNull
    public FlutterEngine spawn(@NonNull Context context, @NonNull DartExecutor.DartEntrypoint dartEntrypoint, @Nullable String str, @Nullable List<String> list, @Nullable u uVar, boolean z4, boolean z5) {
        if (isAttachedToJni()) {
            return new FlutterEngine(context, null, this.flutterJNI.spawn(dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, str, list), uVar, null, z4, z5);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override // ug.b
    public void updateDisplayMetrics(float f, float f3, float f7) {
        this.flutterJNI.updateDisplayMetrics(0, f, f3, f7);
    }

    public FlutterEngine(@NonNull Context context, @Nullable String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public FlutterEngine(@NonNull Context context, @Nullable String[] strArr, boolean z4) {
        this(context, null, null, strArr, z4);
    }

    public FlutterEngine(@NonNull Context context, @Nullable String[] strArr, boolean z4, boolean z5) {
        this(context, null, null, new u(), strArr, z4, z5);
    }

    public FlutterEngine(@NonNull Context context, @Nullable FlutterLoader flutterLoader, @NonNull FlutterJNI flutterJNI) {
        this(context, flutterLoader, flutterJNI, null, true);
    }

    public FlutterEngine(@NonNull Context context, @Nullable FlutterLoader flutterLoader, @NonNull FlutterJNI flutterJNI, @Nullable String[] strArr, boolean z4) {
        this(context, flutterLoader, flutterJNI, new u(), strArr, z4);
    }

    public FlutterEngine(@NonNull Context context, @Nullable FlutterLoader flutterLoader, @NonNull FlutterJNI flutterJNI, @NonNull u uVar, @Nullable String[] strArr, boolean z4) {
        this(context, flutterLoader, flutterJNI, uVar, strArr, z4, false);
    }

    public FlutterEngine(@NonNull Context context, @Nullable FlutterLoader flutterLoader, @NonNull FlutterJNI flutterJNI, @NonNull u uVar, @Nullable String[] strArr, boolean z4, boolean z5) {
        this(context, flutterLoader, flutterJNI, uVar, strArr, z4, z5, null);
    }

    @VisibleForTesting(otherwise = 3)
    public FlutterEngine(@NonNull Context context, @Nullable FlutterLoader flutterLoader, @NonNull FlutterJNI flutterJNI, @NonNull u uVar, @Nullable String[] strArr, boolean z4, boolean z5, @Nullable FlutterEngineGroup flutterEngineGroup) {
        AssetManager assets;
        this.engineLifecycleListeners = new HashSet();
        this.engineLifecycleListener = new EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngine.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
                Iterator it = FlutterEngine.this.engineLifecycleListeners.iterator();
                while (it.hasNext()) {
                    ((EngineLifecycleListener) it.next()).onPreEngineRestart();
                }
                u uVar2 = FlutterEngine.this.platformViewsController;
                while (true) {
                    SparseArray sparseArray = uVar2.f17251k;
                    if (sparseArray.size() <= 0) {
                        FlutterEngine.this.restorationChannel.clearData();
                        return;
                    } else {
                        uVar2.f17261v.dispose(sparseArray.keyAt(0));
                    }
                }
            }
        };
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C1978b c1978bA = C1978b.a();
        flutterJNI = flutterJNI == null ? c1978bA.c.provideFlutterJNI() : flutterJNI;
        this.flutterJNI = flutterJNI;
        DartExecutor dartExecutor = new DartExecutor(flutterJNI, assets);
        this.dartExecutor = dartExecutor;
        dartExecutor.onAttachedToJNI();
        PlayStoreDeferredComponentManager playStoreDeferredComponentManager = C1978b.a().f18848b;
        this.accessibilityChannel = new AccessibilityChannel(dartExecutor, flutterJNI);
        DeferredComponentChannel deferredComponentChannel = new DeferredComponentChannel(dartExecutor);
        this.deferredComponentChannel = deferredComponentChannel;
        this.lifecycleChannel = new LifecycleChannel(dartExecutor);
        LocalizationChannel localizationChannel = new LocalizationChannel(dartExecutor);
        this.localizationChannel = localizationChannel;
        this.mouseCursorChannel = new MouseCursorChannel(dartExecutor);
        this.navigationChannel = new NavigationChannel(dartExecutor);
        this.backGestureChannel = new BackGestureChannel(dartExecutor);
        this.platformChannel = new PlatformChannel(dartExecutor);
        this.processTextChannel = new ProcessTextChannel(dartExecutor, context.getPackageManager());
        this.restorationChannel = new RestorationChannel(dartExecutor, z5);
        this.settingsChannel = new SettingsChannel(dartExecutor);
        this.spellCheckChannel = new SpellCheckChannel(dartExecutor);
        this.systemChannel = new SystemChannel(dartExecutor);
        this.textInputChannel = new TextInputChannel(dartExecutor);
        if (playStoreDeferredComponentManager != null) {
            playStoreDeferredComponentManager.setDeferredComponentChannel(deferredComponentChannel);
        }
        C2174b c2174b = new C2174b(context, localizationChannel);
        this.localizationPlugin = c2174b;
        flutterLoader = flutterLoader == null ? c1978bA.f18847a : flutterLoader;
        if (!flutterJNI.isAttached()) {
            flutterLoader.startInitialization(context.getApplicationContext());
            flutterLoader.ensureInitializationComplete(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.engineLifecycleListener);
        flutterJNI.setPlatformViewsController(uVar);
        flutterJNI.setLocalizationPlugin(c2174b);
        flutterJNI.setDeferredComponentManager(c1978bA.f18848b);
        if (!flutterJNI.isAttached()) {
            attachToJni();
        }
        this.renderer = new FlutterRenderer(flutterJNI);
        this.platformViewsController = uVar;
        uVar.getClass();
        FlutterEngineConnectionRegistry flutterEngineConnectionRegistry = new FlutterEngineConnectionRegistry(context.getApplicationContext(), this, flutterLoader, flutterEngineGroup);
        this.pluginRegistry = flutterEngineConnectionRegistry;
        c2174b.b(context.getResources().getConfiguration());
        if (z4 && flutterLoader.automaticallyRegisterPlugins()) {
            GeneratedPluginRegister.registerGeneratedPlugins(this);
        }
        c.c(context, this);
        flutterEngineConnectionRegistry.add(new C2258a(getProcessTextChannel()));
    }
}
