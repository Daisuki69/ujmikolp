package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.annotation.DeprecatedSinceApi;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.editing.k;
import io.flutter.plugin.platform.p;
import io.flutter.plugin.platform.u;
import io.flutter.view.h;
import io.flutter.view.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import pg.j;
import qg.C2174b;
import rg.C2207c;
import rg.InterfaceC2206b;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterView extends FrameLayout implements InterfaceC2206b, KeyboardManager.ViewDelegate {
    private static final String TAG = "FlutterView";

    @Nullable
    private l accessibilityBridge;

    @Nullable
    private AndroidTouchProcessor androidTouchProcessor;
    private FlutterViewDelegate delegate;

    @Nullable
    private FlutterEngine flutterEngine;

    @NonNull
    private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;

    @Nullable
    private FlutterImageView flutterImageView;

    @Nullable
    private FlutterSurfaceView flutterSurfaceView;

    @Nullable
    private FlutterTextureView flutterTextureView;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners;
    private boolean isFlutterUiDisplayed;

    @Nullable
    private KeyboardManager keyboardManager;

    @Nullable
    private C2174b localizationPlugin;

    @Nullable
    private C2207c mouseCursorPlugin;
    private final h onAccessibilityChangeListener;

    @Nullable
    private RenderSurface previousRenderSurface;

    @Nullable
    @VisibleForTesting
    RenderSurface renderSurface;

    @Nullable
    private io.flutter.plugin.editing.h spellCheckPlugin;
    private final ContentObserver systemSettingsObserver;

    @Nullable
    private k textInputPlugin;

    @Nullable
    private TextServicesManager textServicesManager;
    private final FlutterRenderer.ViewportMetrics viewportMetrics;
    private Consumer<WindowLayoutInfo> windowInfoListener;

    @Nullable
    private WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;

    @VisibleForTesting
    public interface FlutterEngineAttachmentListener {
        void onFlutterEngineAttachedToFlutterView(@NonNull FlutterEngine flutterEngine);

        void onFlutterEngineDetachedFromFlutterView();
    }

    @VisibleForTesting
    public enum ZeroSides {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public FlutterView(@NonNull Context context) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context));
    }

    @SuppressLint({"DiscouragedPrivateApi"})
    private View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        Method declaredMethod;
        try {
            declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (declaredMethod.invoke(view, null).equals(Integer.valueOf(i))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            int i4 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i4 >= viewGroup.getChildCount()) {
                    break;
                }
                View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, viewGroup.getChildAt(i4));
                if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                    return viewFindViewByAccessibilityIdRootedAtCurrentView;
                }
                i4++;
            }
        }
        return null;
    }

    private int guessBottomKeyboardInset(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void init() {
        FlutterSurfaceView flutterSurfaceView = this.flutterSurfaceView;
        if (flutterSurfaceView != null) {
            addView(flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = this.flutterTextureView;
            if (flutterTextureView != null) {
                addView(flutterTextureView);
            } else {
                addView(this.flutterImageView);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$sendUserSettingsToFlutter$0(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseImageView() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView.closeImageReader();
            removeView(this.flutterImageView);
            this.flutterImageView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetWillNotDraw(boolean z4, boolean z5) {
        boolean z8 = false;
        if (this.flutterEngine.getRenderer().isSoftwareRenderingEnabled()) {
            setWillNotDraw(false);
            return;
        }
        if (!z4 && !z5) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    private void sendViewportMetricsToFlutter() {
        if (!isAttachedToFlutterEngine()) {
            Log.w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.devicePixelRatio = getResources().getDisplayMetrics().density;
        this.viewportMetrics.physicalTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
    }

    public boolean acquireLatestImageViewFrame() {
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView != null) {
            return flutterImageView.acquireLatestImage();
        }
        return false;
    }

    @VisibleForTesting
    public void addFlutterEngineAttachmentListener(@NonNull FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.add(flutterEngineAttachmentListener);
    }

    public void addOnFirstFrameRenderedListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void attachOverlaySurfaceToRender(@NonNull FlutterImageView flutterImageView) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    public void attachToFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        Objects.toString(flutterEngine);
        if (isAttachedToFlutterEngine()) {
            if (flutterEngine == this.flutterEngine) {
                return;
            } else {
                detachFromFlutterEngine();
            }
        }
        this.flutterEngine = flutterEngine;
        FlutterRenderer renderer = flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = renderer.isDisplayingFlutterUi();
        this.renderSurface.attachToRenderer(renderer);
        renderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mouseCursorPlugin = new C2207c(this, this.flutterEngine.getMouseCursorChannel());
        }
        this.textInputPlugin = new k(this, this.flutterEngine.getTextInputChannel(), this.flutterEngine.getPlatformViewsController());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.textServicesManager = textServicesManager;
            this.spellCheckPlugin = new io.flutter.plugin.editing.h(textServicesManager, this.flutterEngine.getSpellCheckChannel());
        } catch (Exception unused) {
            Log.e(TAG, "TextServicesManager not supported by device, spell check disabled.");
        }
        this.localizationPlugin = this.flutterEngine.getLocalizationPlugin();
        this.keyboardManager = new KeyboardManager(this);
        int i = 0;
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.getRenderer(), false);
        l lVar = new l(this, flutterEngine.getAccessibilityChannel(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.flutterEngine.getPlatformViewsController());
        this.accessibilityBridge = lVar;
        lVar.f17482s = this.onAccessibilityChangeListener;
        resetWillNotDraw(lVar.c.isEnabled(), this.accessibilityBridge.c.isTouchExplorationEnabled());
        this.flutterEngine.getPlatformViewsController().h.f17218a = this.accessibilityBridge;
        u platformViewsController = this.flutterEngine.getPlatformViewsController();
        FlutterRenderer renderer2 = this.flutterEngine.getRenderer();
        platformViewsController.getClass();
        platformViewsController.f17248b = new AndroidTouchProcessor(renderer2, true);
        this.textInputPlugin.f17199b.restartInput(this);
        sendUserSettingsToFlutter();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.systemSettingsObserver);
        sendViewportMetricsToFlutter();
        u platformViewsController2 = flutterEngine.getPlatformViewsController();
        platformViewsController2.f17249d = this;
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = platformViewsController2.f17253n;
            if (i4 >= sparseArray.size()) {
                break;
            }
            platformViewsController2.f17249d.addView((p) sparseArray.valueAt(i4));
            i4++;
        }
        int i6 = 0;
        while (true) {
            SparseArray sparseArray2 = platformViewsController2.f17252l;
            if (i6 >= sparseArray2.size()) {
                break;
            }
            platformViewsController2.f17249d.addView((FlutterMutatorView) sparseArray2.valueAt(i6));
            i6++;
        }
        while (true) {
            SparseArray sparseArray3 = platformViewsController2.f17251k;
            if (i >= sparseArray3.size()) {
                break;
            }
            ((io.flutter.plugin.platform.k) sparseArray3.valueAt(i)).onFlutterViewAttached(platformViewsController2.f17249d);
            i++;
        }
        Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterEngineAttachedToFlutterView(flutterEngine);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    @Override // android.view.View
    public void autofill(@NonNull SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration.Autofill autofill;
        TextInputChannel.Configuration.Autofill autofill2;
        k kVar = this.textInputPlugin;
        if (Build.VERSION.SDK_INT < 26) {
            kVar.getClass();
            return;
        }
        TextInputChannel.Configuration configuration = kVar.f;
        if (configuration == null || kVar.f17201g == null || (autofill = configuration.autofill) == null) {
            return;
        }
        HashMap<String, TextInputChannel.TextEditState> map = new HashMap<>();
        for (int i = 0; i < sparseArray.size(); i++) {
            TextInputChannel.Configuration configuration2 = (TextInputChannel.Configuration) kVar.f17201g.get(sparseArray.keyAt(i));
            if (configuration2 != null && (autofill2 = configuration2.autofill) != null) {
                String string = c.d(sparseArray.valueAt(i)).getTextValue().toString();
                TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(string, string.length(), string.length(), -1, -1);
                if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                    kVar.h.f(textEditState);
                } else {
                    map.put(autofill2.uniqueIdentifier, textEditState);
                }
            }
        }
        kVar.f17200d.updateEditingStateWithTag(kVar.e.c, map);
    }

    @DeprecatedSinceApi(api = 30)
    @VisibleForTesting
    public ZeroSides calculateShouldZeroSides() {
        Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return ZeroSides.RIGHT;
            }
            if (rotation == 3) {
                return ZeroSides.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine == null) {
            return super.checkInputConnectionProxy(view);
        }
        u platformViewsController = flutterEngine.getPlatformViewsController();
        if (view == null) {
            platformViewsController.getClass();
            return false;
        }
        HashMap map = platformViewsController.j;
        if (!map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public void convertToImageView() {
        this.renderSurface.pause();
        FlutterImageView flutterImageView = this.flutterImageView;
        if (flutterImageView == null) {
            FlutterImageView flutterImageViewCreateImageView = createImageView();
            this.flutterImageView = flutterImageViewCreateImageView;
            addView(flutterImageViewCreateImageView);
        } else {
            flutterImageView.resizeIfNeeded(getWidth(), getHeight());
        }
        this.previousRenderSurface = this.renderSurface;
        FlutterImageView flutterImageView2 = this.flutterImageView;
        this.renderSurface = flutterImageView2;
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            flutterImageView2.attachToRenderer(flutterEngine.getRenderer());
        }
    }

    @NonNull
    @VisibleForTesting
    public FlutterImageView createImageView() {
        return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
    }

    @VisibleForTesting
    public WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo() {
        try {
            return new WindowInfoRepositoryCallbackAdapterWrapper(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void detachFromFlutterEngine() {
        SparseArray sparseArray;
        Objects.toString(this.flutterEngine);
        if (isAttachedToFlutterEngine()) {
            Iterator<FlutterEngineAttachmentListener> it = this.flutterEngineAttachmentListeners.iterator();
            while (it.hasNext()) {
                it.next().onFlutterEngineDetachedFromFlutterView();
            }
            getContext().getContentResolver().unregisterContentObserver(this.systemSettingsObserver);
            u platformViewsController = this.flutterEngine.getPlatformViewsController();
            int i = 0;
            while (true) {
                SparseArray sparseArray2 = platformViewsController.f17253n;
                if (i >= sparseArray2.size()) {
                    break;
                }
                platformViewsController.f17249d.removeView((p) sparseArray2.valueAt(i));
                i++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray3 = platformViewsController.f17252l;
                if (i4 >= sparseArray3.size()) {
                    break;
                }
                platformViewsController.f17249d.removeView((FlutterMutatorView) sparseArray3.valueAt(i4));
                i4++;
            }
            platformViewsController.c();
            if (platformViewsController.f17249d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i6 = 0;
                while (true) {
                    sparseArray = platformViewsController.m;
                    if (i6 >= sparseArray.size()) {
                        break;
                    }
                    platformViewsController.f17249d.removeView((View) sparseArray.valueAt(i6));
                    i6++;
                }
                sparseArray.clear();
            }
            platformViewsController.f17249d = null;
            platformViewsController.f17255p = false;
            int i10 = 0;
            while (true) {
                SparseArray sparseArray4 = platformViewsController.f17251k;
                if (i10 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.k) sparseArray4.valueAt(i10)).onFlutterViewDetached();
                i10++;
            }
            this.flutterEngine.getPlatformViewsController().h.f17218a = null;
            l lVar = this.accessibilityBridge;
            lVar.f17484u = true;
            lVar.e.h.f17218a = null;
            lVar.f17482s = null;
            AccessibilityManager accessibilityManager = lVar.c;
            accessibilityManager.removeAccessibilityStateChangeListener(lVar.f17486w);
            accessibilityManager.removeTouchExplorationStateChangeListener(lVar.f17487x);
            lVar.f.unregisterContentObserver(lVar.f17488y);
            lVar.f17472b.setAccessibilityMessageHandler(null);
            this.accessibilityBridge = null;
            this.textInputPlugin.f17199b.restartInput(this);
            this.textInputPlugin.c();
            this.keyboardManager.destroy();
            io.flutter.plugin.editing.h hVar = this.spellCheckPlugin;
            if (hVar != null) {
                hVar.f17190a.setSpellCheckMethodHandler(null);
                SpellCheckerSession spellCheckerSession = hVar.c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            C2207c c2207c = this.mouseCursorPlugin;
            if (c2207c != null) {
                c2207c.f19948b.setMethodHandler(null);
            }
            FlutterRenderer renderer = this.flutterEngine.getRenderer();
            this.isFlutterUiDisplayed = false;
            renderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
            renderer.stopRenderingToSurface();
            renderer.setSemanticsEnabled(false);
            RenderSurface renderSurface = this.previousRenderSurface;
            if (renderSurface != null && this.renderSurface == this.flutterImageView) {
                this.renderSurface = renderSurface;
            }
            this.renderSurface.detachFromRenderer();
            releaseImageView();
            this.previousRenderSurface = null;
            this.flutterEngine = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (isAttachedToFlutterEngine() && this.keyboardManager.handleEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Nullable
    @SuppressLint({"SoonBlockedPrivateApi"})
    public View findViewByAccessibilityIdTraversal(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            return findViewByAccessibilityIdRootedAtCurrentView(i, this);
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return (View) declaredMethod.invoke(this, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.view.View
    @Nullable
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        l lVar = this.accessibilityBridge;
        if (lVar == null || !lVar.c.isEnabled()) {
            return null;
        }
        return this.accessibilityBridge;
    }

    @Nullable
    @VisibleForTesting
    public FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public j getBinaryMessenger() {
        return this.flutterEngine.getDartExecutor();
    }

    @VisibleForTesting
    public FlutterImageView getCurrentImageSurface() {
        return this.flutterImageView;
    }

    @Override // rg.InterfaceC2206b
    @NonNull
    @RequiresApi(24)
    @TargetApi(24)
    public PointerIcon getSystemPointerIcon(int i) {
        return PointerIcon.getSystemIcon(getContext(), i);
    }

    @VisibleForTesting
    public FlutterRenderer.ViewportMetrics getViewportMetrics() {
        return this.viewportMetrics;
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    @VisibleForTesting
    public boolean isAttachedToFlutterEngine() {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null && flutterEngine.getRenderer() == this.renderSurface.getAttachedRenderer();
    }

    @Override // android.view.View
    @NonNull
    @SuppressLint({"InlinedApi", "NewApi", "DeprecatedSinceApi"})
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i = Build.VERSION.SDK_INT;
        if (i == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            this.viewportMetrics.systemGestureInsetTop = systemGestureInsets.top;
            this.viewportMetrics.systemGestureInsetRight = systemGestureInsets.right;
            this.viewportMetrics.systemGestureInsetBottom = systemGestureInsets.bottom;
            this.viewportMetrics.systemGestureInsetLeft = systemGestureInsets.left;
        }
        boolean z4 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z5 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i >= 30) {
            int iNavigationBars = z5 ? WindowInsets.Type.navigationBars() : 0;
            if (z4) {
                iNavigationBars |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(iNavigationBars);
            this.viewportMetrics.viewPaddingTop = insets.top;
            this.viewportMetrics.viewPaddingRight = insets.right;
            this.viewportMetrics.viewPaddingBottom = insets.bottom;
            this.viewportMetrics.viewPaddingLeft = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            this.viewportMetrics.viewInsetTop = insets2.top;
            this.viewportMetrics.viewInsetRight = insets2.right;
            this.viewportMetrics.viewInsetBottom = insets2.bottom;
            this.viewportMetrics.viewInsetLeft = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            this.viewportMetrics.systemGestureInsetTop = insets3.top;
            this.viewportMetrics.systemGestureInsetRight = insets3.right;
            this.viewportMetrics.systemGestureInsetBottom = insets3.bottom;
            this.viewportMetrics.systemGestureInsetLeft = insets3.left;
            DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
                viewportMetrics.viewPaddingTop = Math.max(Math.max(viewportMetrics.viewPaddingTop, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
                viewportMetrics2.viewPaddingRight = Math.max(Math.max(viewportMetrics2.viewPaddingRight, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
                viewportMetrics3.viewPaddingBottom = Math.max(Math.max(viewportMetrics3.viewPaddingBottom, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                FlutterRenderer.ViewportMetrics viewportMetrics4 = this.viewportMetrics;
                viewportMetrics4.viewPaddingLeft = Math.max(Math.max(viewportMetrics4.viewPaddingLeft, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
        } else {
            ZeroSides zeroSidesCalculateShouldZeroSides = ZeroSides.NONE;
            if (!z5) {
                zeroSidesCalculateShouldZeroSides = calculateShouldZeroSides();
            }
            this.viewportMetrics.viewPaddingTop = z4 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.viewportMetrics.viewPaddingRight = (zeroSidesCalculateShouldZeroSides == ZeroSides.RIGHT || zeroSidesCalculateShouldZeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.viewportMetrics.viewPaddingBottom = (z5 && guessBottomKeyboardInset(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.viewportMetrics.viewPaddingLeft = (zeroSidesCalculateShouldZeroSides == ZeroSides.LEFT || zeroSidesCalculateShouldZeroSides == ZeroSides.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.ViewportMetrics viewportMetrics5 = this.viewportMetrics;
            viewportMetrics5.viewInsetTop = 0;
            viewportMetrics5.viewInsetRight = 0;
            viewportMetrics5.viewInsetBottom = guessBottomKeyboardInset(windowInsets);
            this.viewportMetrics.viewInsetLeft = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                rect.toString();
                arrayList.add(new FlutterRenderer.DisplayFeature(rect, FlutterRenderer.DisplayFeatureType.CUTOUT, FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        this.viewportMetrics.setDisplayCutouts(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            this.delegate.growViewportMetricsToCaptionBar(getContext(), this.viewportMetrics);
        }
        int i4 = this.viewportMetrics.viewPaddingTop;
        sendViewportMetricsToFlutter();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.windowInfoRepo = createWindowInfoRepo();
        Activity activityH = E1.c.h(getContext());
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper == null || activityH == null) {
            return;
        }
        this.windowInfoListener = new Consumer() { // from class: io.flutter.embedding.android.e
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f17157a.setWindowInfoListenerDisplayFeatures((WindowLayoutInfo) obj);
            }
        };
        windowInfoRepositoryCallbackAdapterWrapper.addWindowLayoutInfoListener(activityH, ContextCompat.getMainExecutor(getContext()), this.windowInfoListener);
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            this.localizationPlugin.b(configuration);
            sendUserSettingsToFlutter();
            E1.c.c(getContext(), this.flutterEngine);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f A[PHI: r6
  0x005f: PHI (r6v9 int) = (r6v4 int), (r6v11 int) binds: [B:71:0x00b9, B:32:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    @Override // android.view.View
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(@androidx.annotation.NonNull android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Consumer<WindowLayoutInfo> consumer;
        WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepositoryCallbackAdapterWrapper = this.windowInfoRepo;
        if (windowInfoRepositoryCallbackAdapterWrapper != null && (consumer = this.windowInfoListener) != null) {
            windowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(consumer);
        }
        this.windowInfoListener = null;
        this.windowInfoRepo = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        if (isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        return !isAttachedToFlutterEngine() ? super.onHoverEvent(motionEvent) : this.accessibilityBridge.e(motionEvent, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(@NonNull ViewStructure viewStructure, int i) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        k kVar = this.textInputPlugin;
        if (Build.VERSION.SDK_INT < 26) {
            kVar.getClass();
            return;
        }
        if (kVar.f17201g != null) {
            String str = kVar.f.autofill.uniqueIdentifier;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i4 = 0; i4 < kVar.f17201g.size(); i4++) {
                int iKeyAt = kVar.f17201g.keyAt(i4);
                TextInputChannel.Configuration.Autofill autofill = ((TextInputChannel.Configuration) kVar.f17201g.valueAt(i4)).autofill;
                if (autofill != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i4);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = autofill.hints;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = autofill.hintText;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = kVar.f17203l) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(autofill.editState.text));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), kVar.f17203l.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(kVar.h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i10) {
        super.onSizeChanged(i, i4, i6, i10);
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.width = i;
        viewportMetrics.height = i4;
        sendViewportMetricsToFlutter();
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public boolean onTextInputKeyEvent(@NonNull KeyEvent keyEvent) {
        InputConnection inputConnection;
        k kVar = this.textInputPlugin;
        if (kVar.f17199b.isAcceptingText() && (inputConnection = kVar.j) != null) {
            if (!(inputConnection instanceof io.flutter.plugin.editing.d)) {
                return inputConnection.sendKeyEvent(keyEvent);
            }
            io.flutter.plugin.editing.d dVar = (io.flutter.plugin.editing.d) inputConnection;
            if (keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    return dVar.d(true, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 22) {
                    return dVar.d(false, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 19) {
                    return dVar.e(true, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 20) {
                    return dVar.e(false, keyEvent.isShiftPressed());
                }
                if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                    EditorInfo editorInfo = dVar.e;
                    if ((editorInfo.inputType & 131072) == 0) {
                        dVar.performEditorAction(editorInfo.imeOptions & 255);
                        return true;
                    }
                }
                g gVar = dVar.f17178d;
                int selectionStart = Selection.getSelectionStart(gVar);
                int selectionEnd = Selection.getSelectionEnd(gVar);
                int unicodeChar = keyEvent.getUnicodeChar();
                if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                    int iMin = Math.min(selectionStart, selectionEnd);
                    int iMax = Math.max(selectionStart, selectionEnd);
                    dVar.beginBatchEdit();
                    if (iMin != iMax) {
                        gVar.delete(iMin, iMax);
                    }
                    gVar.insert(iMin, (CharSequence) String.valueOf((char) unicodeChar));
                    int i = iMin + 1;
                    dVar.setSelection(i, i);
                    dVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.ViewDelegate
    public void redispatch(@NonNull KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @VisibleForTesting
    public void removeFlutterEngineAttachmentListener(@NonNull FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.remove(flutterEngineAttachmentListener);
    }

    public void removeOnFirstFrameRenderedListener(@NonNull FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void revertImageView(@NonNull final Runnable runnable) {
        RenderSurface renderSurface;
        if (this.flutterImageView == null || (renderSurface = this.previousRenderSurface) == null) {
            return;
        }
        this.renderSurface = renderSurface;
        this.previousRenderSurface = null;
        final FlutterRenderer renderer = this.flutterEngine.getRenderer();
        if (this.flutterEngine != null && renderer != null) {
            this.renderSurface.resume();
            renderer.addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.4
                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiDisplayed() {
                    renderer.removeIsDisplayingFlutterUiListener(this);
                    runnable.run();
                    FlutterView flutterView = FlutterView.this;
                    if ((flutterView.renderSurface instanceof FlutterImageView) || flutterView.flutterImageView == null) {
                        return;
                    }
                    FlutterView.this.flutterImageView.detachFromRenderer();
                    FlutterView.this.releaseImageView();
                }

                @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
                public void onFlutterUiNoLongerDisplayed() {
                }
            });
        } else {
            this.flutterImageView.detachFromRenderer();
            releaseImageView();
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendUserSettingsToFlutter() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.dark
            goto L15
        L13:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r0 = io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.textServicesManager
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3c
            java.util.List r1 = bg.AbstractC0963F0.h(r1)
            java.util.stream.Stream r1 = C0.a.s(r1)
            io.flutter.embedding.android.d r4 = new io.flutter.embedding.android.d
            r4.<init>()
            boolean r1 = com.google.android.material.datepicker.a.z(r1, r4)
            android.view.textservice.TextServicesManager r4 = r6.textServicesManager
            boolean r4 = bg.AbstractC0963F0.p(r4)
            if (r4 == 0) goto L3e
            if (r1 == 0) goto L3e
        L3c:
            r1 = r3
            goto L3f
        L3e:
            r1 = r2
        L3f:
            io.flutter.embedding.engine.FlutterEngine r4 = r6.flutterEngine
            io.flutter.embedding.engine.systemchannels.SettingsChannel r4 = r4.getSettingsChannel()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.startMessage()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.setTextScaleFactor(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r4 = r4.setDisplayMetrics(r5)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r4.setNativeSpellCheckServiceDefined(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L78
            r2 = r3
        L78:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.setBrieflyShowPassword(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r1.setUse24HourFormat(r2)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r0 = r1.setPlatformBrightness(r0)
            r0.send()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.FlutterView.sendUserSettingsToFlutter():void");
    }

    @VisibleForTesting
    public void setDelegate(@NonNull FlutterViewDelegate flutterViewDelegate) {
        this.delegate = flutterViewDelegate;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        RenderSurface renderSurface = this.renderSurface;
        if (renderSurface instanceof FlutterSurfaceView) {
            ((FlutterSurfaceView) renderSurface).setVisibility(i);
        }
    }

    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            displayFeature.getBounds().toString();
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new FlutterRenderer.DisplayFeature(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? FlutterRenderer.DisplayFeatureType.HINGE : FlutterRenderer.DisplayFeatureType.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? FlutterRenderer.DisplayFeatureState.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED : FlutterRenderer.DisplayFeatureState.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.DisplayFeature(displayFeature.getBounds(), FlutterRenderer.DisplayFeatureType.UNKNOWN, FlutterRenderer.DisplayFeatureState.UNKNOWN));
            }
        }
        this.viewportMetrics.setDisplayFeatures(arrayList);
        sendViewportMetricsToFlutter();
    }

    @Deprecated
    public FlutterView(@NonNull Context context, @NonNull RenderMode renderMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new h() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.h
            public void onAccessibilityChanged(boolean z4, boolean z5) {
                FlutterView.this.resetWillNotDraw(z4, z5);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z4) {
                super.onChange(z4);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else {
            if (renderMode != RenderMode.texture) {
                throw new IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
            }
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        }
        init();
    }

    @Deprecated
    public FlutterView(@NonNull Context context, @NonNull TransparencyMode transparencyMode) {
        this(context, (AttributeSet) null, new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent));
    }

    public FlutterView(@NonNull Context context, @NonNull FlutterSurfaceView flutterSurfaceView) {
        this(context, (AttributeSet) null, flutterSurfaceView);
    }

    public FlutterView(@NonNull Context context, @NonNull FlutterTextureView flutterTextureView) {
        this(context, (AttributeSet) null, flutterTextureView);
    }

    public FlutterView(@NonNull Context context, @NonNull FlutterImageView flutterImageView) {
        this(context, (AttributeSet) null, flutterImageView);
    }

    public FlutterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, new FlutterSurfaceView(context));
    }

    @Deprecated
    public FlutterView(@NonNull Context context, @NonNull RenderMode renderMode, @NonNull TransparencyMode transparencyMode) {
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new h() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.h
            public void onAccessibilityChanged(boolean z4, boolean z5) {
                FlutterView.this.resetWillNotDraw(z4, z5);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z4) {
                super.onChange(z4);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        if (renderMode == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView(context, transparencyMode == TransparencyMode.transparent);
            this.flutterSurfaceView = flutterSurfaceView;
            this.renderSurface = flutterSurfaceView;
        } else if (renderMode == RenderMode.texture) {
            FlutterTextureView flutterTextureView = new FlutterTextureView(context);
            this.flutterTextureView = flutterTextureView;
            this.renderSurface = flutterTextureView;
        } else {
            throw new IllegalArgumentException("RenderMode not supported with this constructor: " + renderMode);
        }
        init();
    }

    private FlutterView(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new h() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.h
            public void onAccessibilityChanged(boolean z4, boolean z5) {
                FlutterView.this.resetWillNotDraw(z4, z5);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z4) {
                super.onChange(z4);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterSurfaceView = flutterSurfaceView;
        this.renderSurface = flutterSurfaceView;
        init();
    }

    private FlutterView(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new h() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.h
            public void onAccessibilityChanged(boolean z4, boolean z5) {
                FlutterView.this.resetWillNotDraw(z4, z5);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z4) {
                super.onChange(z4);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterTextureView = flutterTextureView;
        this.renderSurface = flutterTextureView;
        init();
    }

    private FlutterView(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull FlutterImageView flutterImageView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new FlutterRenderer.ViewportMetrics();
        this.onAccessibilityChangeListener = new h() { // from class: io.flutter.embedding.android.FlutterView.1
            @Override // io.flutter.view.h
            public void onAccessibilityChanged(boolean z4, boolean z5) {
                FlutterView.this.resetWillNotDraw(z4, z5);
            }
        };
        this.systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: io.flutter.embedding.android.FlutterView.2
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z4) {
                super.onChange(z4);
                if (FlutterView.this.flutterEngine == null) {
                    return;
                }
                FlutterView.this.sendUserSettingsToFlutter();
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.FlutterView.3
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = true;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiDisplayed();
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.this.isFlutterUiDisplayed = false;
                Iterator it = FlutterView.this.flutterUiDisplayListeners.iterator();
                while (it.hasNext()) {
                    ((FlutterUiDisplayListener) it.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.delegate = new FlutterViewDelegate();
        this.flutterImageView = flutterImageView;
        this.renderSurface = flutterImageView;
        init();
    }
}
