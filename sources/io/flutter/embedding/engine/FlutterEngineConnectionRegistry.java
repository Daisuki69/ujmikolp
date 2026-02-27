package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.tracing.Trace;
import d4.AbstractC1331a;
import io.flutter.embedding.android.ExclusiveAppComponent;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.plugins.service.ServiceAware;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.platform.u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import pg.InterfaceC2034A;
import pg.InterfaceC2036C;
import pg.w;
import pg.x;
import pg.z;

/* JADX INFO: loaded from: classes4.dex */
class FlutterEngineConnectionRegistry implements PluginRegistry, ActivityControlSurface, ServiceControlSurface, BroadcastReceiverControlSurface, ContentProviderControlSurface {
    private static final String TAG = "FlutterEngineCxnRegstry";

    @Nullable
    private FlutterEngineActivityPluginBinding activityPluginBinding;

    @Nullable
    private BroadcastReceiver broadcastReceiver;

    @Nullable
    private FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;

    @Nullable
    private ContentProvider contentProvider;

    @Nullable
    private FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;

    @Nullable
    private ExclusiveAppComponent<Activity> exclusiveActivity;

    @NonNull
    private final FlutterEngine flutterEngine;

    @NonNull
    private final FlutterPlugin.FlutterPluginBinding pluginBinding;

    @Nullable
    private Service service;

    @Nullable
    private FlutterEngineServicePluginBinding servicePluginBinding;

    @NonNull
    private final Map<Class<? extends FlutterPlugin>, FlutterPlugin> plugins = new HashMap();

    @NonNull
    private final Map<Class<? extends FlutterPlugin>, ActivityAware> activityAwarePlugins = new HashMap();
    private boolean isWaitingForActivityReattachment = false;

    @NonNull
    private final Map<Class<? extends FlutterPlugin>, ServiceAware> serviceAwarePlugins = new HashMap();

    @NonNull
    private final Map<Class<? extends FlutterPlugin>, BroadcastReceiverAware> broadcastReceiverAwarePlugins = new HashMap();

    @NonNull
    private final Map<Class<? extends FlutterPlugin>, ContentProviderAware> contentProviderAwarePlugins = new HashMap();

    public static class DefaultFlutterAssets implements FlutterPlugin.FlutterAssets {
        final FlutterLoader flutterLoader;

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathByName(@NonNull String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathBySubpath(@NonNull String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        private DefaultFlutterAssets(@NonNull FlutterLoader flutterLoader) {
            this.flutterLoader = flutterLoader;
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathByName(@NonNull String str, @NonNull String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public String getAssetFilePathBySubpath(@NonNull String str, @NonNull String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }
    }

    public static class FlutterEngineActivityPluginBinding implements ActivityPluginBinding {

        @NonNull
        private final Activity activity;

        @NonNull
        private final HiddenLifecycleReference hiddenLifecycleReference;

        @NonNull
        private final Set<z> onRequestPermissionsResultListeners = new HashSet();

        @NonNull
        private final Set<w> onActivityResultListeners = new HashSet();

        @NonNull
        private final Set<x> onNewIntentListeners = new HashSet();

        @NonNull
        private final Set<InterfaceC2034A> onUserLeaveHintListeners = new HashSet();

        @NonNull
        private final Set<InterfaceC2036C> onWindowFocusChangedListeners = new HashSet();

        @NonNull
        private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();

        public FlutterEngineActivityPluginBinding(@NonNull Activity activity, @NonNull Lifecycle lifecycle) {
            this.activity = activity;
            this.hiddenLifecycleReference = new HiddenLifecycleReference(lifecycle);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addActivityResultListener(@NonNull w wVar) {
            this.onActivityResultListeners.add(wVar);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnNewIntentListener(@NonNull x xVar) {
            this.onNewIntentListeners.add(xVar);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnSaveStateListener(@NonNull ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.add(onSaveInstanceStateListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnUserLeaveHintListener(@NonNull InterfaceC2034A interfaceC2034A) {
            this.onUserLeaveHintListeners.add(interfaceC2034A);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnWindowFocusChangedListener(@NonNull InterfaceC2036C interfaceC2036C) {
            this.onWindowFocusChangedListeners.add(interfaceC2036C);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addRequestPermissionsResultListener(@NonNull z zVar) {
            this.onRequestPermissionsResultListeners.add(zVar);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        @NonNull
        public Activity getActivity() {
            return this.activity;
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        @NonNull
        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        public boolean onActivityResult(int i, int i4, @Nullable Intent intent) {
            Iterator it = new HashSet(this.onActivityResultListeners).iterator();
            while (true) {
                boolean z4 = false;
                while (it.hasNext()) {
                    if (((w) it.next()).onActivityResult(i, i4, intent) || z4) {
                        z4 = true;
                    }
                }
                return z4;
            }
        }

        public void onNewIntent(@Nullable Intent intent) {
            Iterator<x> it = this.onNewIntentListeners.iterator();
            if (it.hasNext()) {
                throw AbstractC1331a.n(it);
            }
        }

        public boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
            Iterator<z> it = this.onRequestPermissionsResultListeners.iterator();
            while (true) {
                boolean z4 = false;
                while (it.hasNext()) {
                    if (it.next().onRequestPermissionsResult(i, strArr, iArr) || z4) {
                        z4 = true;
                    }
                }
                return z4;
            }
        }

        public void onRestoreInstanceState(@Nullable Bundle bundle) {
            Iterator<ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onRestoreInstanceState(bundle);
            }
        }

        public void onSaveInstanceState(@NonNull Bundle bundle) {
            Iterator<ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onSaveInstanceState(bundle);
            }
        }

        public void onUserLeaveHint() {
            Iterator<InterfaceC2034A> it = this.onUserLeaveHintListeners.iterator();
            if (it.hasNext()) {
                throw AbstractC1331a.n(it);
            }
        }

        public void onWindowFocusChanged(boolean z4) {
            Iterator<InterfaceC2036C> it = this.onWindowFocusChangedListeners.iterator();
            if (it.hasNext()) {
                throw AbstractC1331a.n(it);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeActivityResultListener(@NonNull w wVar) {
            this.onActivityResultListeners.remove(wVar);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnNewIntentListener(@NonNull x xVar) {
            this.onNewIntentListeners.remove(xVar);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnSaveStateListener(@NonNull ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.remove(onSaveInstanceStateListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnUserLeaveHintListener(@NonNull InterfaceC2034A interfaceC2034A) {
            this.onUserLeaveHintListeners.remove(interfaceC2034A);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnWindowFocusChangedListener(@NonNull InterfaceC2036C interfaceC2036C) {
            this.onWindowFocusChangedListeners.remove(interfaceC2036C);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeRequestPermissionsResultListener(@NonNull z zVar) {
            this.onRequestPermissionsResultListeners.remove(zVar);
        }
    }

    public static class FlutterEngineBroadcastReceiverPluginBinding implements BroadcastReceiverPluginBinding {

        @NonNull
        private final BroadcastReceiver broadcastReceiver;

        public FlutterEngineBroadcastReceiverPluginBinding(@NonNull BroadcastReceiver broadcastReceiver) {
            this.broadcastReceiver = broadcastReceiver;
        }

        @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding
        @NonNull
        public BroadcastReceiver getBroadcastReceiver() {
            return this.broadcastReceiver;
        }
    }

    public static class FlutterEngineContentProviderPluginBinding implements ContentProviderPluginBinding {

        @NonNull
        private final ContentProvider contentProvider;

        public FlutterEngineContentProviderPluginBinding(@NonNull ContentProvider contentProvider) {
            this.contentProvider = contentProvider;
        }

        @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding
        @NonNull
        public ContentProvider getContentProvider() {
            return this.contentProvider;
        }
    }

    public static class FlutterEngineServicePluginBinding implements ServicePluginBinding {

        @Nullable
        private final HiddenLifecycleReference hiddenLifecycleReference;

        @NonNull
        private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();

        @NonNull
        private final Service service;

        public FlutterEngineServicePluginBinding(@NonNull Service service, @Nullable Lifecycle lifecycle) {
            this.service = service;
            this.hiddenLifecycleReference = lifecycle != null ? new HiddenLifecycleReference(lifecycle) : null;
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public void addOnModeChangeListener(@NonNull ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.add(onModeChangeListener);
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        @Nullable
        public Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        @NonNull
        public Service getService() {
            return this.service;
        }

        public void onMoveToBackground() {
            Iterator<ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onMoveToBackground();
            }
        }

        public void onMoveToForeground() {
            Iterator<ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onMoveToForeground();
            }
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public void removeOnModeChangeListener(@NonNull ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.remove(onModeChangeListener);
        }
    }

    public FlutterEngineConnectionRegistry(@NonNull Context context, @NonNull FlutterEngine flutterEngine, @NonNull FlutterLoader flutterLoader, @Nullable FlutterEngineGroup flutterEngineGroup) {
        this.flutterEngine = flutterEngine;
        this.pluginBinding = new FlutterPlugin.FlutterPluginBinding(context, flutterEngine, flutterEngine.getDartExecutor(), flutterEngine.getRenderer(), flutterEngine.getPlatformViewsController().f17247a, new DefaultFlutterAssets(flutterLoader), flutterEngineGroup);
    }

    private void attachToActivityInternal(@NonNull Activity activity, @NonNull Lifecycle lifecycle) {
        this.activityPluginBinding = new FlutterEngineActivityPluginBinding(activity, lifecycle);
        this.flutterEngine.getPlatformViewsController().f17260u = activity.getIntent() != null ? activity.getIntent().getBooleanExtra(FlutterShellArgs.ARG_KEY_ENABLE_SOFTWARE_RENDERING, false) : false;
        u platformViewsController = this.flutterEngine.getPlatformViewsController();
        FlutterRenderer renderer = this.flutterEngine.getRenderer();
        DartExecutor dartExecutor = this.flutterEngine.getDartExecutor();
        if (platformViewsController.c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        platformViewsController.c = activity;
        platformViewsController.e = renderer;
        PlatformViewsChannel platformViewsChannel = new PlatformViewsChannel(dartExecutor);
        platformViewsController.f17250g = platformViewsChannel;
        platformViewsChannel.setPlatformViewsHandler(platformViewsController.f17261v);
        for (ActivityAware activityAware : this.activityAwarePlugins.values()) {
            if (this.isWaitingForActivityReattachment) {
                activityAware.onReattachedToActivityForConfigChanges(this.activityPluginBinding);
            } else {
                activityAware.onAttachedToActivity(this.activityPluginBinding);
            }
        }
        this.isWaitingForActivityReattachment = false;
    }

    private Activity attachedActivity() {
        ExclusiveAppComponent<Activity> exclusiveAppComponent = this.exclusiveActivity;
        if (exclusiveAppComponent != null) {
            return exclusiveAppComponent.getAppComponent();
        }
        return null;
    }

    private void detachFromActivityInternal() {
        u platformViewsController = this.flutterEngine.getPlatformViewsController();
        PlatformViewsChannel platformViewsChannel = platformViewsController.f17250g;
        if (platformViewsChannel != null) {
            platformViewsChannel.setPlatformViewsHandler(null);
        }
        platformViewsController.c();
        platformViewsController.f17250g = null;
        platformViewsController.c = null;
        platformViewsController.e = null;
        this.exclusiveActivity = null;
        this.activityPluginBinding = null;
    }

    private void detachFromAppComponent() {
        if (isAttachedToActivity()) {
            detachFromActivity();
            return;
        }
        if (isAttachedToService()) {
            detachFromService();
        } else if (isAttachedToBroadcastReceiver()) {
            detachFromBroadcastReceiver();
        } else if (isAttachedToContentProvider()) {
            detachFromContentProvider();
        }
    }

    private boolean isAttachedToActivity() {
        return this.exclusiveActivity != null;
    }

    private boolean isAttachedToBroadcastReceiver() {
        return this.broadcastReceiver != null;
    }

    private boolean isAttachedToContentProvider() {
        return this.contentProvider != null;
    }

    private boolean isAttachedToService() {
        return this.service != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void add(@NonNull FlutterPlugin flutterPlugin) {
        ug.a.c("FlutterEngineConnectionRegistry#add ".concat(flutterPlugin.getClass().getSimpleName()));
        try {
            if (has(flutterPlugin.getClass())) {
                Log.w(TAG, "Attempted to register plugin (" + flutterPlugin + ") but it was already registered with this FlutterEngine (" + this.flutterEngine + ").");
                Trace.endSection();
                return;
            }
            flutterPlugin.toString();
            this.plugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), flutterPlugin);
            flutterPlugin.onAttachedToEngine(this.pluginBinding);
            if (flutterPlugin instanceof ActivityAware) {
                ActivityAware activityAware = (ActivityAware) flutterPlugin;
                this.activityAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), activityAware);
                if (isAttachedToActivity()) {
                    activityAware.onAttachedToActivity(this.activityPluginBinding);
                }
            }
            if (flutterPlugin instanceof ServiceAware) {
                ServiceAware serviceAware = (ServiceAware) flutterPlugin;
                this.serviceAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), serviceAware);
                if (isAttachedToService()) {
                    serviceAware.onAttachedToService(this.servicePluginBinding);
                }
            }
            if (flutterPlugin instanceof BroadcastReceiverAware) {
                BroadcastReceiverAware broadcastReceiverAware = (BroadcastReceiverAware) flutterPlugin;
                this.broadcastReceiverAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), broadcastReceiverAware);
                if (isAttachedToBroadcastReceiver()) {
                    broadcastReceiverAware.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
                }
            }
            if (flutterPlugin instanceof ContentProviderAware) {
                ContentProviderAware contentProviderAware = (ContentProviderAware) flutterPlugin;
                this.contentProviderAwarePlugins.put((Class<? extends FlutterPlugin>) flutterPlugin.getClass(), contentProviderAware);
                if (isAttachedToContentProvider()) {
                    contentProviderAware.onAttachedToContentProvider(this.contentProviderPluginBinding);
                }
            }
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void attachToActivity(@NonNull ExclusiveAppComponent<Activity> exclusiveAppComponent, @NonNull Lifecycle lifecycle) {
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#attachToActivity"));
        try {
            ExclusiveAppComponent<Activity> exclusiveAppComponent2 = this.exclusiveActivity;
            if (exclusiveAppComponent2 != null) {
                exclusiveAppComponent2.detachFromFlutterEngine();
            }
            detachFromAppComponent();
            this.exclusiveActivity = exclusiveAppComponent;
            attachToActivityInternal(exclusiveAppComponent.getAppComponent(), lifecycle);
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

    @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
    public void attachToBroadcastReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull Lifecycle lifecycle) {
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#attachToBroadcastReceiver"));
        try {
            detachFromAppComponent();
            this.broadcastReceiver = broadcastReceiver;
            this.broadcastReceiverPluginBinding = new FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver);
            Iterator<BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
            }
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

    @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
    public void attachToContentProvider(@NonNull ContentProvider contentProvider, @NonNull Lifecycle lifecycle) {
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#attachToContentProvider"));
        try {
            detachFromAppComponent();
            this.contentProvider = contentProvider;
            this.contentProviderPluginBinding = new FlutterEngineContentProviderPluginBinding(contentProvider);
            Iterator<ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToContentProvider(this.contentProviderPluginBinding);
            }
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

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void attachToService(@NonNull Service service, @Nullable Lifecycle lifecycle, boolean z4) {
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#attachToService"));
        try {
            detachFromAppComponent();
            this.service = service;
            this.servicePluginBinding = new FlutterEngineServicePluginBinding(service, lifecycle);
            Iterator<ServiceAware> it = this.serviceAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToService(this.servicePluginBinding);
            }
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

    public void destroy() {
        detachFromAppComponent();
        removeAll();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void detachFromActivity() {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#detachFromActivity"));
        try {
            Iterator<ActivityAware> it = this.activityAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            detachFromActivityInternal();
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void detachFromActivityForConfigChanges() {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges"));
        try {
            this.isWaitingForActivityReattachment = true;
            Iterator<ActivityAware> it = this.activityAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivityForConfigChanges();
            }
            detachFromActivityInternal();
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

    @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
    public void detachFromBroadcastReceiver() {
        if (!isAttachedToBroadcastReceiver()) {
            Log.e(TAG, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver"));
        try {
            Iterator<BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromBroadcastReceiver();
            }
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

    @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
    public void detachFromContentProvider() {
        if (!isAttachedToContentProvider()) {
            Log.e(TAG, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#detachFromContentProvider"));
        try {
            Iterator<ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromContentProvider();
            }
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

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void detachFromService() {
        if (!isAttachedToService()) {
            Log.e(TAG, "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#detachFromService"));
        try {
            Iterator<ServiceAware> it = this.serviceAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromService();
            }
            this.service = null;
            this.servicePluginBinding = null;
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

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public FlutterPlugin get(@NonNull Class<? extends FlutterPlugin> cls) {
        return this.plugins.get(cls);
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public boolean has(@NonNull Class<? extends FlutterPlugin> cls) {
        return this.plugins.containsKey(cls);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public boolean onActivityResult(int i, int i4, @Nullable Intent intent) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onActivityResult"));
        try {
            boolean zOnActivityResult = this.activityPluginBinding.onActivityResult(i, i4, intent);
            Trace.endSection();
            return zOnActivityResult;
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void onMoveToBackground() {
        if (isAttachedToService()) {
            Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onMoveToBackground"));
            try {
                this.servicePluginBinding.onMoveToBackground();
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
    }

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void onMoveToForeground() {
        if (isAttachedToService()) {
            Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onMoveToForeground"));
            try {
                this.servicePluginBinding.onMoveToForeground();
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
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onNewIntent(@NonNull Intent intent) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onNewIntent"));
        try {
            this.activityPluginBinding.onNewIntent(intent);
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult"));
        try {
            boolean zOnRequestPermissionsResult = this.activityPluginBinding.onRequestPermissionsResult(i, strArr, iArr);
            Trace.endSection();
            return zOnRequestPermissionsResult;
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onRestoreInstanceState(@Nullable Bundle bundle) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState"));
        try {
            this.activityPluginBinding.onRestoreInstanceState(bundle);
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState"));
        try {
            this.activityPluginBinding.onSaveInstanceState(bundle);
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

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onUserLeaveHint() {
        if (!isAttachedToActivity()) {
            Log.e(TAG, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        Trace.beginSection(ug.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint"));
        try {
            this.activityPluginBinding.onUserLeaveHint();
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

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void remove(@NonNull Class<? extends FlutterPlugin> cls) {
        FlutterPlugin flutterPlugin = this.plugins.get(cls);
        if (flutterPlugin == null) {
            return;
        }
        ug.a.c("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
        try {
            if (flutterPlugin instanceof ActivityAware) {
                if (isAttachedToActivity()) {
                    ((ActivityAware) flutterPlugin).onDetachedFromActivity();
                }
                this.activityAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof ServiceAware) {
                if (isAttachedToService()) {
                    ((ServiceAware) flutterPlugin).onDetachedFromService();
                }
                this.serviceAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof BroadcastReceiverAware) {
                if (isAttachedToBroadcastReceiver()) {
                    ((BroadcastReceiverAware) flutterPlugin).onDetachedFromBroadcastReceiver();
                }
                this.broadcastReceiverAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof ContentProviderAware) {
                if (isAttachedToContentProvider()) {
                    ((ContentProviderAware) flutterPlugin).onDetachedFromContentProvider();
                }
                this.contentProviderAwarePlugins.remove(cls);
            }
            flutterPlugin.onDetachedFromEngine(this.pluginBinding);
            this.plugins.remove(cls);
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

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void removeAll() {
        remove(new HashSet(this.plugins.keySet()));
        this.plugins.clear();
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void remove(@NonNull Set<Class<? extends FlutterPlugin>> set) {
        Iterator<Class<? extends FlutterPlugin>> it = set.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void add(@NonNull Set<FlutterPlugin> set) {
        Iterator<FlutterPlugin> it = set.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
