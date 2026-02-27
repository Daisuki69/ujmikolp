package io.flutter.embedding.android;

import We.s;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.FlutterEngineGroupCache;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.platform.E;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import io.flutter.plugin.platform.u;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import og.C1978b;

/* JADX INFO: loaded from: classes4.dex */
class FlutterActivityAndFragmentDelegate implements ExclusiveAppComponent<Activity> {
    private static final int FLUTTER_SPLASH_VIEW_FALLBACK_ID = 486947586;
    private static final String FRAMEWORK_RESTORATION_BUNDLE_KEY = "framework";
    private static final String PLUGINS_RESTORATION_BUNDLE_KEY = "plugins";
    private static final String TAG = "FlutterActivityAndFragmentDelegate";

    @Nullable
    @VisibleForTesting
    ViewTreeObserver.OnPreDrawListener activePreDrawListener;

    @Nullable
    private FlutterEngineGroup engineGroup;

    @Nullable
    private FlutterEngine flutterEngine;

    @NonNull
    private final FlutterUiDisplayListener flutterUiDisplayListener;

    @Nullable
    @VisibleForTesting
    FlutterView flutterView;

    @NonNull
    private Host host;
    private boolean isAttached;
    private boolean isFirstFrameRendered;
    private boolean isFlutterEngineFromHost;
    private boolean isFlutterUiDisplayed;

    @Nullable
    private j platformPlugin;
    private Integer previousVisibility;

    public interface DelegateFactory {
        FlutterActivityAndFragmentDelegate createDelegate(Host host);
    }

    public interface Host extends FlutterEngineProvider, FlutterEngineConfigurator, i {
        boolean attachToEngineAutomatically();

        void cleanUpFlutterEngine(@NonNull FlutterEngine flutterEngine);

        void configureFlutterEngine(@NonNull FlutterEngine flutterEngine);

        void detachFromFlutterEngine();

        @Nullable
        Activity getActivity();

        @NonNull
        String getAppBundlePath();

        @Nullable
        String getCachedEngineGroupId();

        @Nullable
        String getCachedEngineId();

        @NonNull
        Context getContext();

        @Nullable
        List<String> getDartEntrypointArgs();

        @NonNull
        String getDartEntrypointFunctionName();

        @Nullable
        String getDartEntrypointLibraryUri();

        ExclusiveAppComponent<Activity> getExclusiveAppComponent();

        @NonNull
        FlutterShellArgs getFlutterShellArgs();

        @Nullable
        String getInitialRoute();

        @NonNull
        Lifecycle getLifecycle();

        @NonNull
        RenderMode getRenderMode();

        @NonNull
        TransparencyMode getTransparencyMode();

        void onFlutterSurfaceViewCreated(@NonNull FlutterSurfaceView flutterSurfaceView);

        void onFlutterTextureViewCreated(@NonNull FlutterTextureView flutterTextureView);

        void onFlutterUiDisplayed();

        void onFlutterUiNoLongerDisplayed();

        /* synthetic */ boolean popSystemNavigator();

        @Override // io.flutter.embedding.android.FlutterEngineProvider
        @Nullable
        FlutterEngine provideFlutterEngine(@NonNull Context context);

        @Nullable
        j providePlatformPlugin(@Nullable Activity activity, @NonNull FlutterEngine flutterEngine);

        /* bridge */ /* synthetic */ void setFrameworkHandlesBack(boolean z4);

        boolean shouldAttachEngineToActivity();

        boolean shouldDestroyEngineWithHost();

        boolean shouldDispatchAppLifecycleState();

        @Nullable
        boolean shouldHandleDeeplinking();

        boolean shouldRestoreAndSaveState();

        void updateSystemUiOverlays();
    }

    public FlutterActivityAndFragmentDelegate(@NonNull Host host) {
        this(host, null);
    }

    private FlutterEngineGroup.Options addEntrypointOptions(FlutterEngineGroup.Options options) {
        String appBundlePath = this.host.getAppBundlePath();
        if (appBundlePath == null || appBundlePath.isEmpty()) {
            appBundlePath = C1978b.a().f18847a.findAppBundlePath();
        }
        DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName());
        String initialRoute = this.host.getInitialRoute();
        if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
            initialRoute = "/";
        }
        return options.setDartEntrypoint(dartEntrypoint).setInitialRoute(initialRoute).setDartEntrypointArgs(this.host.getDartEntrypointArgs());
    }

    private void delayFirstAndroidViewDraw(final FlutterView flutterView) {
        if (this.host.getRenderMode() != RenderMode.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.activePreDrawListener != null) {
            flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
        }
        this.activePreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed && FlutterActivityAndFragmentDelegate.this.activePreDrawListener != null) {
                    flutterView.getViewTreeObserver().removeOnPreDrawListener(this);
                    FlutterActivityAndFragmentDelegate.this.activePreDrawListener = null;
                }
                return FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed;
            }
        };
        flutterView.getViewTreeObserver().addOnPreDrawListener(this.activePreDrawListener);
    }

    private void doInitialFlutterViewRun() {
        if (this.host.getCachedEngineId() == null && !this.flutterEngine.getDartExecutor().isExecutingDart()) {
            String initialRoute = this.host.getInitialRoute();
            if (initialRoute == null && (initialRoute = maybeGetInitialRouteFromIntent(this.host.getActivity().getIntent())) == null) {
                initialRoute = "/";
            }
            String dartEntrypointLibraryUri = this.host.getDartEntrypointLibraryUri();
            androidx.camera.core.impl.a.C(new StringBuilder("Executing Dart entrypoint: "), this.host.getDartEntrypointFunctionName(), ", library uri: ", dartEntrypointLibraryUri);
            this.flutterEngine.getNavigationChannel().setInitialRoute(initialRoute);
            String appBundlePath = this.host.getAppBundlePath();
            if (appBundlePath == null || appBundlePath.isEmpty()) {
                appBundlePath = C1978b.a().f18847a.findAppBundlePath();
            }
            this.flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypointLibraryUri == null ? new DartExecutor.DartEntrypoint(appBundlePath, this.host.getDartEntrypointFunctionName()) : new DartExecutor.DartEntrypoint(appBundlePath, dartEntrypointLibraryUri, this.host.getDartEntrypointFunctionName()), this.host.getDartEntrypointArgs());
        }
    }

    private void ensureAlive() {
        if (this.host == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String maybeGetInitialRouteFromIntent(Intent intent) {
        Uri data;
        if (!this.host.shouldHandleDeeplinking() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void cancelBackGesture() {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.getBackGestureChannel().cancelBackGesture();
        } else {
            Log.w(TAG, "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void commitBackGesture() {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.getBackGestureChannel().commitBackGesture();
        } else {
            Log.w(TAG, "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    public void detachFromFlutterEngine() {
        if (!this.host.shouldDestroyEngineWithHost()) {
            this.host.detachFromFlutterEngine();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.host + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Nullable
    public FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    public boolean isAttached() {
        return this.isAttached;
    }

    public boolean isFlutterEngineFromHost() {
        return this.isFlutterEngineFromHost;
    }

    public void onActivityResult(int i, int i4, Intent intent) {
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
        } else {
            Objects.toString(intent);
            this.flutterEngine.getActivityControlSurface().onActivityResult(i, i4, intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        ensureAlive();
        if (this.flutterEngine == null) {
            setUpFlutterEngine();
        }
        if (this.host.shouldAttachEngineToActivity()) {
            this.flutterEngine.getActivityControlSurface().attachToActivity(this, this.host.getLifecycle());
        }
        Host host = this.host;
        this.platformPlugin = host.providePlatformPlugin(host.getActivity(), this.flutterEngine);
        this.host.configureFlutterEngine(this.flutterEngine);
        this.isAttached = true;
    }

    public void onBackPressed() {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.getNavigationChannel().popRoute();
        } else {
            Log.w(TAG, "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        }
    }

    @NonNull
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, int i, boolean z4) {
        ensureAlive();
        if (this.host.getRenderMode() == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(this.host.getContext(), this.host.getTransparencyMode() == TransparencyMode.transparent);
            this.host.onFlutterSurfaceViewCreated(flutterSurfaceView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = new FlutterTextureView(this.host.getContext());
            flutterTextureView.setOpaque(this.host.getTransparencyMode() == TransparencyMode.opaque);
            this.host.onFlutterTextureViewCreated(flutterTextureView);
            this.flutterView = new FlutterView(this.host.getContext(), flutterTextureView);
        }
        this.flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        if (this.host.attachToEngineAutomatically()) {
            this.flutterView.attachToFlutterEngine(this.flutterEngine);
        }
        this.flutterView.setId(i);
        if (z4) {
            delayFirstAndroidViewDraw(this.flutterView);
        }
        return this.flutterView;
    }

    public void onDestroyView() {
        ensureAlive();
        if (this.activePreDrawListener != null) {
            this.flutterView.getViewTreeObserver().removeOnPreDrawListener(this.activePreDrawListener);
            this.activePreDrawListener = null;
        }
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.detachFromFlutterEngine();
            this.flutterView.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
        }
    }

    public void onDetach() {
        FlutterEngine flutterEngine;
        if (this.isAttached) {
            ensureAlive();
            this.host.cleanUpFlutterEngine(this.flutterEngine);
            if (this.host.shouldAttachEngineToActivity()) {
                if (this.host.getActivity().isChangingConfigurations()) {
                    this.flutterEngine.getActivityControlSurface().detachFromActivityForConfigChanges();
                } else {
                    this.flutterEngine.getActivityControlSurface().detachFromActivity();
                }
            }
            j jVar = this.platformPlugin;
            if (jVar != null) {
                jVar.f17230b.setPlatformMessageHandler(null);
                this.platformPlugin = null;
            }
            if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
                flutterEngine.getLifecycleChannel().appIsDetached();
            }
            if (this.host.shouldDestroyEngineWithHost()) {
                this.flutterEngine.destroy();
                if (this.host.getCachedEngineId() != null) {
                    FlutterEngineCache.getInstance().remove(this.host.getCachedEngineId());
                }
                this.flutterEngine = null;
            }
            this.isAttached = false;
        }
    }

    public void onNewIntent(@NonNull Intent intent) {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine == null) {
            Log.w(TAG, "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        flutterEngine.getActivityControlSurface().onNewIntent(intent);
        String strMaybeGetInitialRouteFromIntent = maybeGetInitialRouteFromIntent(intent);
        if (strMaybeGetInitialRouteFromIntent == null || strMaybeGetInitialRouteFromIntent.isEmpty()) {
            return;
        }
        this.flutterEngine.getNavigationChannel().pushRouteInformation(strMaybeGetInitialRouteFromIntent);
    }

    public void onPause() {
        FlutterEngine flutterEngine;
        ensureAlive();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.getLifecycleChannel().appIsInactive();
    }

    public void onPostResume() {
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            updateSystemUiOverlays();
            this.flutterEngine.getPlatformViewsController().i();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        ensureAlive();
        if (this.flutterEngine == null) {
            Log.w(TAG, "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Arrays.toString(strArr);
        Arrays.toString(iArr);
        this.flutterEngine.getActivityControlSurface().onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onRestoreInstanceState(@Nullable Bundle bundle) {
        Bundle bundle2;
        byte[] byteArray;
        ensureAlive();
        if (bundle != null) {
            bundle2 = bundle.getBundle(PLUGINS_RESTORATION_BUNDLE_KEY);
            byteArray = bundle.getByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY);
        } else {
            bundle2 = null;
            byteArray = null;
        }
        if (this.host.shouldRestoreAndSaveState()) {
            this.flutterEngine.getRestorationChannel().setRestorationData(byteArray);
        }
        if (this.host.shouldAttachEngineToActivity()) {
            this.flutterEngine.getActivityControlSurface().onRestoreInstanceState(bundle2);
        }
    }

    public void onResume() {
        FlutterEngine flutterEngine;
        ensureAlive();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        flutterEngine.getLifecycleChannel().appIsResumed();
    }

    public void onSaveInstanceState(@Nullable Bundle bundle) {
        ensureAlive();
        if (this.host.shouldRestoreAndSaveState()) {
            bundle.putByteArray(FRAMEWORK_RESTORATION_BUNDLE_KEY, this.flutterEngine.getRestorationChannel().getRestorationData());
        }
        if (this.host.shouldAttachEngineToActivity()) {
            Bundle bundle2 = new Bundle();
            this.flutterEngine.getActivityControlSurface().onSaveInstanceState(bundle2);
            bundle.putBundle(PLUGINS_RESTORATION_BUNDLE_KEY, bundle2);
        }
    }

    public void onStart() {
        ensureAlive();
        doInitialFlutterViewRun();
        Integer num = this.previousVisibility;
        if (num != null) {
            this.flutterView.setVisibility(num.intValue());
        }
    }

    public void onStop() {
        FlutterEngine flutterEngine;
        ensureAlive();
        if (this.host.shouldDispatchAppLifecycleState() && (flutterEngine = this.flutterEngine) != null) {
            flutterEngine.getLifecycleChannel().appIsPaused();
        }
        this.previousVisibility = Integer.valueOf(this.flutterView.getVisibility());
        this.flutterView.setVisibility(8);
        FlutterEngine flutterEngine2 = this.flutterEngine;
        if (flutterEngine2 != null) {
            flutterEngine2.getRenderer().onTrimMemory(40);
        }
    }

    public void onTrimMemory(int i) {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            if (this.isFirstFrameRendered && i >= 10) {
                flutterEngine.getDartExecutor().notifyLowMemoryWarning();
                this.flutterEngine.getSystemChannel().sendMemoryPressureWarning();
            }
            this.flutterEngine.getRenderer().onTrimMemory(i);
            u platformViewsController = this.flutterEngine.getPlatformViewsController();
            if (i < 40) {
                platformViewsController.getClass();
                return;
            }
            Iterator it = platformViewsController.i.values().iterator();
            while (it.hasNext()) {
                ((E) it.next()).h.setSurface(null);
            }
        }
    }

    public void onUserLeaveHint() {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.getActivityControlSurface().onUserLeaveHint();
        } else {
            Log.w(TAG, "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    public void onWindowFocusChanged(boolean z4) {
        FlutterEngine flutterEngine;
        ensureAlive();
        if (!this.host.shouldDispatchAppLifecycleState() || (flutterEngine = this.flutterEngine) == null) {
            return;
        }
        if (z4) {
            flutterEngine.getLifecycleChannel().aWindowIsFocused();
        } else {
            flutterEngine.getLifecycleChannel().noWindowsAreFocused();
        }
    }

    public void release() {
        this.host = null;
        this.flutterEngine = null;
        this.flutterView = null;
        this.platformPlugin = null;
    }

    @VisibleForTesting
    public void setUpFlutterEngine() {
        String cachedEngineId = this.host.getCachedEngineId();
        if (cachedEngineId != null) {
            FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get(cachedEngineId);
            this.flutterEngine = flutterEngine;
            this.isFlutterEngineFromHost = true;
            if (flutterEngine == null) {
                throw new IllegalStateException(s.j("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '", cachedEngineId, "'"));
            }
            return;
        }
        Host host = this.host;
        FlutterEngine flutterEngineProvideFlutterEngine = host.provideFlutterEngine(host.getContext());
        this.flutterEngine = flutterEngineProvideFlutterEngine;
        if (flutterEngineProvideFlutterEngine != null) {
            this.isFlutterEngineFromHost = true;
            return;
        }
        String cachedEngineGroupId = this.host.getCachedEngineGroupId();
        if (cachedEngineGroupId != null) {
            FlutterEngineGroup flutterEngineGroup = FlutterEngineGroupCache.getInstance().get(cachedEngineGroupId);
            if (flutterEngineGroup == null) {
                throw new IllegalStateException(s.j("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '", cachedEngineGroupId, "'"));
            }
            this.flutterEngine = flutterEngineGroup.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext())));
            this.isFlutterEngineFromHost = false;
            return;
        }
        FlutterEngineGroup flutterEngineGroup2 = this.engineGroup;
        if (flutterEngineGroup2 == null) {
            flutterEngineGroup2 = new FlutterEngineGroup(this.host.getContext(), this.host.getFlutterShellArgs().toArray());
        }
        this.flutterEngine = flutterEngineGroup2.createAndRunEngine(addEntrypointOptions(new FlutterEngineGroup.Options(this.host.getContext()).setAutomaticallyRegisterPlugins(false).setWaitForRestorationData(this.host.shouldRestoreAndSaveState())));
        this.isFlutterEngineFromHost = false;
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void startBackGesture(@NonNull BackEvent backEvent) {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.getBackGestureChannel().startBackGesture(backEvent);
        } else {
            Log.w(TAG, "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }

    @RequiresApi(34)
    @TargetApi(34)
    public void updateBackGestureProgress(@NonNull BackEvent backEvent) {
        ensureAlive();
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.getBackGestureChannel().updateBackGestureProgress(backEvent);
        } else {
            Log.w(TAG, "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        }
    }

    public void updateSystemUiOverlays() {
        j jVar = this.platformPlugin;
        if (jVar != null) {
            jVar.b();
        }
    }

    public FlutterActivityAndFragmentDelegate(@NonNull Host host, @Nullable FlutterEngineGroup flutterEngineGroup) {
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.1
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterActivityAndFragmentDelegate.this.host.onFlutterUiDisplayed();
                FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = true;
                FlutterActivityAndFragmentDelegate.this.isFirstFrameRendered = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterActivityAndFragmentDelegate.this.host.onFlutterUiNoLongerDisplayed();
                FlutterActivityAndFragmentDelegate.this.isFlutterUiDisplayed = false;
            }
        };
        this.host = host;
        this.isFirstFrameRendered = false;
        this.engineGroup = flutterEngineGroup;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    @NonNull
    public Activity getAppComponent() {
        Activity activity = this.host.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }
}
