package androidx.window.area;

import Bj.E;
import Bj.H;
import Ej.InterfaceC0230h;
import Ej.W;
import We.s;
import android.app.Activity;
import android.os.Binder;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.camera.core.processing.l;
import androidx.window.area.WindowAreaCapability;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.area.WindowAreaInfo;
import androidx.window.area.utils.DeviceUtils;
import androidx.window.core.BuildConfig;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.core.VerificationMode;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
@ExperimentalWindowApi
public final class WindowAreaControllerImpl implements WindowAreaController {
    private static final String REAR_DISPLAY_BINDER_DESCRIPTOR = "WINDOW_AREA_REAR_DISPLAY";
    private WindowAreaCapability.Status currentRearDisplayModeStatus;
    private WindowAreaCapability.Status currentRearDisplayPresentationStatus;
    private final HashMap<String, WindowAreaInfo> currentWindowAreaInfoMap;
    private Consumer<Integer> rearDisplaySessionConsumer;
    private final int vendorApiLevel;
    private final WindowAreaComponent windowAreaComponent;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = z.a(WindowAreaControllerImpl.class).c();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class RearDisplayPresentationSessionConsumer implements Consumer<Integer> {
        private final Executor executor;
        private int lastReportedSessionStatus;
        private final WindowAreaComponent windowAreaComponent;
        private final WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback;

        public RearDisplayPresentationSessionConsumer(Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback, WindowAreaComponent windowAreaComponent) {
            j.g(executor, "executor");
            j.g(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
            j.g(windowAreaComponent, "windowAreaComponent");
            this.executor = executor;
            this.windowAreaPresentationSessionCallback = windowAreaPresentationSessionCallback;
            this.windowAreaComponent = windowAreaComponent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void accept$lambda$0(int i, int i4, RearDisplayPresentationSessionConsumer this$0) {
            j.g(this$0, "this$0");
            if (i == 0) {
                this$0.windowAreaPresentationSessionCallback.onSessionEnded(null);
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    s.y(i, "Invalid session state value received: ", WindowAreaControllerImpl.TAG);
                    return;
                } else {
                    this$0.windowAreaPresentationSessionCallback.onContainerVisibilityChanged(true);
                    return;
                }
            }
            if (i4 == 2) {
                this$0.windowAreaPresentationSessionCallback.onContainerVisibilityChanged(false);
                return;
            }
            WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback = this$0.windowAreaPresentationSessionCallback;
            WindowAreaComponent windowAreaComponent = this$0.windowAreaComponent;
            ExtensionWindowAreaPresentation rearDisplayPresentation = windowAreaComponent.getRearDisplayPresentation();
            j.d(rearDisplayPresentation);
            windowAreaPresentationSessionCallback.onSessionStarted(new RearDisplayPresentationSessionPresenterImpl(windowAreaComponent, rearDisplayPresentation));
        }

        @Override // androidx.window.extensions.core.util.function.Consumer, Ch.c
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(((Number) obj).intValue());
        }

        public void accept(int i) {
            int i4 = this.lastReportedSessionStatus;
            this.lastReportedSessionStatus = i;
            this.executor.execute(new l(i, i4, this));
        }
    }

    public static final class RearDisplaySessionConsumer implements Consumer<Integer> {
        private final WindowAreaSessionCallback appCallback;
        private final Executor executor;
        private final WindowAreaComponent extensionsComponent;
        private WindowAreaSession session;

        public RearDisplaySessionConsumer(Executor executor, WindowAreaSessionCallback appCallback, WindowAreaComponent extensionsComponent) {
            j.g(executor, "executor");
            j.g(appCallback, "appCallback");
            j.g(extensionsComponent, "extensionsComponent");
            this.executor = executor;
            this.appCallback = appCallback;
            this.extensionsComponent = extensionsComponent;
        }

        private final void onSessionFinished() {
            this.session = null;
            this.executor.execute(new E8.l(this, 29));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSessionFinished$lambda$2(RearDisplaySessionConsumer this$0) {
            j.g(this$0, "this$0");
            this$0.appCallback.onSessionEnded(null);
        }

        private final void onSessionStarted() {
            final RearDisplaySessionImpl rearDisplaySessionImpl = new RearDisplaySessionImpl(this.extensionsComponent);
            this.session = rearDisplaySessionImpl;
            this.executor.execute(new Runnable() { // from class: androidx.window.area.b
                @Override // java.lang.Runnable
                public final void run() {
                    WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionStarted$lambda$1$lambda$0(this.f8201a, rearDisplaySessionImpl);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSessionStarted$lambda$1$lambda$0(RearDisplaySessionConsumer this$0, WindowAreaSession it) {
            j.g(this$0, "this$0");
            j.g(it, "$it");
            this$0.appCallback.onSessionStarted(it);
        }

        @Override // androidx.window.extensions.core.util.function.Consumer, Ch.c
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept(((Number) obj).intValue());
        }

        public void accept(int i) {
            if (i == 0) {
                onSessionFinished();
                return;
            }
            if (i == 1) {
                onSessionStarted();
                return;
            }
            if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.STRICT) {
                Log.d(WindowAreaControllerImpl.TAG, "Received an unknown session status value: " + i);
            }
            onSessionFinished();
        }
    }

    /* JADX INFO: renamed from: androidx.window.area.WindowAreaControllerImpl$presentContentOnWindowArea$2, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.window.area.WindowAreaControllerImpl$presentContentOnWindowArea$2", f = "WindowAreaControllerImpl.kt", l = {252}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Executor $executor;
        final /* synthetic */ WindowAreaPresentationSessionCallback $windowAreaPresentationSessionCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback, InterfaceC1526a<? super AnonymousClass2> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$activity = activity;
            this.$executor = executor;
            this.$windowAreaPresentationSessionCallback = windowAreaPresentationSessionCallback;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return WindowAreaControllerImpl.this.new AnonymousClass2(this.$activity, this.$executor, this.$windowAreaPresentationSessionCallback, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass2) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0230h windowAreaInfos = WindowAreaControllerImpl.this.getWindowAreaInfos();
                this.label = 1;
                if (W.j(windowAreaInfos, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            WindowAreaControllerImpl.this.startRearDisplayPresentationMode(this.$activity, this.$executor, this.$windowAreaPresentationSessionCallback);
            return Unit.f18162a;
        }
    }

    /* JADX INFO: renamed from: androidx.window.area.WindowAreaControllerImpl$transferActivityToWindowArea$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "androidx.window.area.WindowAreaControllerImpl$transferActivityToWindowArea$2", f = "WindowAreaControllerImpl.kt", l = {224}, m = "invokeSuspend")
    public static final class C08172 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Executor $executor;
        final /* synthetic */ WindowAreaSessionCallback $windowAreaSessionCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08172(Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback, InterfaceC1526a<? super C08172> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$activity = activity;
            this.$executor = executor;
            this.$windowAreaSessionCallback = windowAreaSessionCallback;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return WindowAreaControllerImpl.this.new C08172(this.$activity, this.$executor, this.$windowAreaSessionCallback, interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C08172) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0230h windowAreaInfos = WindowAreaControllerImpl.this.getWindowAreaInfos();
                this.label = 1;
                if (W.j(windowAreaInfos, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            WindowAreaControllerImpl.this.startRearDisplayMode(this.$activity, this.$executor, this.$windowAreaSessionCallback);
            return Unit.f18162a;
        }
    }

    public WindowAreaControllerImpl(WindowAreaComponent windowAreaComponent, int i) {
        j.g(windowAreaComponent, "windowAreaComponent");
        this.windowAreaComponent = windowAreaComponent;
        this.vendorApiLevel = i;
        WindowAreaCapability.Status.Companion companion = WindowAreaCapability.Status.Companion;
        this.currentRearDisplayModeStatus = companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release();
        this.currentRearDisplayPresentationStatus = companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release();
        this.currentWindowAreaInfoMap = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentContentOnWindowArea$lambda$2(WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        j.g(windowAreaPresentationSessionCallback, "$windowAreaPresentationSessionCallback");
        windowAreaPresentationSessionCallback.onSessionEnded(new IllegalArgumentException("Invalid WindowAreaInfo token"));
    }

    private final boolean shouldRemoveWindowAreaInfo(WindowAreaInfo windowAreaInfo) {
        for (WindowAreaCapability windowAreaCapability : windowAreaInfo.getCapabilityMap$window_release().values()) {
            j.f(windowAreaCapability, "windowAreaInfo.capabilityMap.values");
            if (!j.b(windowAreaCapability.getStatus(), WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startRearDisplayMode(Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        if (j.b(this.currentRearDisplayModeStatus, WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE)) {
            windowAreaSessionCallback.onSessionEnded(new IllegalStateException("The WindowArea feature is currently active, WindowAreaInfo#getActiveSessioncan be used to get an instance of the current active session"));
        } else {
            if (!j.b(this.currentRearDisplayModeStatus, WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE)) {
                windowAreaSessionCallback.onSessionEnded(new IllegalStateException("The WindowArea feature is currently not available to be entered"));
                return;
            }
            RearDisplaySessionConsumer rearDisplaySessionConsumer = new RearDisplaySessionConsumer(executor, windowAreaSessionCallback, this.windowAreaComponent);
            this.rearDisplaySessionConsumer = rearDisplaySessionConsumer;
            this.windowAreaComponent.startRearDisplaySession(activity, rearDisplaySessionConsumer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startRearDisplayPresentationMode(Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        if (!j.b(this.currentRearDisplayPresentationStatus, WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE)) {
            windowAreaPresentationSessionCallback.onSessionEnded(new IllegalStateException("The WindowArea feature is currently not available to be entered"));
        } else {
            WindowAreaComponent windowAreaComponent = this.windowAreaComponent;
            windowAreaComponent.startRearDisplayPresentationSession(activity, new RearDisplayPresentationSessionConsumer(executor, windowAreaPresentationSessionCallback, windowAreaComponent));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transferActivityToWindowArea$lambda$1(WindowAreaSessionCallback windowAreaSessionCallback) {
        j.g(windowAreaSessionCallback, "$windowAreaSessionCallback");
        windowAreaSessionCallback.onSessionEnded(new IllegalArgumentException("Invalid WindowAreaInfo token"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRearDisplayAvailability(int i) {
        WindowMetrics windowMetricsFromDisplayMetrics$window_release;
        if (this.vendorApiLevel >= 3) {
            WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
            DisplayMetrics rearDisplayMetrics = this.windowAreaComponent.getRearDisplayMetrics();
            j.f(rearDisplayMetrics, "windowAreaComponent.rearDisplayMetrics");
            windowMetricsFromDisplayMetrics$window_release = companion.fromDisplayMetrics$window_release(rearDisplayMetrics);
        } else {
            DeviceUtils deviceUtils = DeviceUtils.INSTANCE;
            String MANUFACTURER = Build.MANUFACTURER;
            j.f(MANUFACTURER, "MANUFACTURER");
            String MODEL = Build.MODEL;
            j.f(MODEL, "MODEL");
            DisplayMetrics rearDisplayMetrics$window_release = deviceUtils.getRearDisplayMetrics$window_release(MANUFACTURER, MODEL);
            if (rearDisplayMetrics$window_release == null) {
                throw new IllegalArgumentException("DeviceUtils rear display metrics entry should not be null");
            }
            windowMetricsFromDisplayMetrics$window_release = WindowMetricsCalculator.Companion.fromDisplayMetrics$window_release(rearDisplayMetrics$window_release);
        }
        WindowAreaCapability.Status statusTranslate$window_release = WindowAreaAdapter.INSTANCE.translate$window_release(i);
        this.currentRearDisplayModeStatus = statusTranslate$window_release;
        updateRearDisplayWindowArea(WindowAreaCapability.Operation.OPERATION_TRANSFER_ACTIVITY_TO_AREA, statusTranslate$window_release, windowMetricsFromDisplayMetrics$window_release);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRearDisplayPresentationAvailability(ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        this.currentRearDisplayPresentationStatus = WindowAreaAdapter.INSTANCE.translate$window_release(extensionWindowAreaStatus.getWindowAreaStatus());
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
        DisplayMetrics windowAreaDisplayMetrics = extensionWindowAreaStatus.getWindowAreaDisplayMetrics();
        j.f(windowAreaDisplayMetrics, "extensionWindowAreaStatus.windowAreaDisplayMetrics");
        updateRearDisplayWindowArea(WindowAreaCapability.Operation.OPERATION_PRESENT_ON_AREA, this.currentRearDisplayPresentationStatus, companion.fromDisplayMetrics$window_release(windowAreaDisplayMetrics));
    }

    private final void updateRearDisplayWindowArea(WindowAreaCapability.Operation operation, WindowAreaCapability.Status status, WindowMetrics windowMetrics) {
        WindowAreaInfo windowAreaInfo = this.currentWindowAreaInfoMap.get(REAR_DISPLAY_BINDER_DESCRIPTOR);
        if (!j.b(status, WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED)) {
            if (windowAreaInfo == null) {
                windowAreaInfo = new WindowAreaInfo(windowMetrics, WindowAreaInfo.Type.TYPE_REAR_FACING, androidx.webkit.internal.d.i(), this.windowAreaComponent);
            }
            windowAreaInfo.getCapabilityMap$window_release().put(operation, new WindowAreaCapability(operation, status));
            windowAreaInfo.setMetrics(windowMetrics);
            this.currentWindowAreaInfoMap.put(REAR_DISPLAY_BINDER_DESCRIPTOR, windowAreaInfo);
            return;
        }
        if (windowAreaInfo != null) {
            if (shouldRemoveWindowAreaInfo(windowAreaInfo)) {
                this.currentWindowAreaInfoMap.remove(REAR_DISPLAY_BINDER_DESCRIPTOR);
            } else {
                windowAreaInfo.getCapabilityMap$window_release().put(operation, new WindowAreaCapability(operation, status));
            }
        }
    }

    @Override // androidx.window.area.WindowAreaController
    public InterfaceC0230h getWindowAreaInfos() {
        return W.f(new WindowAreaControllerImpl$windowAreaInfos$1(this, null));
    }

    @Override // androidx.window.area.WindowAreaController
    public void presentContentOnWindowArea(Binder token, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        j.g(token, "token");
        j.g(activity, "activity");
        j.g(executor, "executor");
        j.g(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        if (!j.b(token.getInterfaceDescriptor(), REAR_DISPLAY_BINDER_DESCRIPTOR)) {
            executor.execute(new E8.l(windowAreaPresentationSessionCallback, 27));
        } else if (!j.b(this.currentRearDisplayPresentationStatus, WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release())) {
            startRearDisplayPresentationMode(activity, executor, windowAreaPresentationSessionCallback);
        } else {
            Log.d(TAG, "Force updating currentRearDisplayPresentationStatus");
            H.w(H.c(H.n(executor)), null, null, new AnonymousClass2(activity, executor, windowAreaPresentationSessionCallback, null), 3);
        }
    }

    @Override // androidx.window.area.WindowAreaController
    public void transferActivityToWindowArea(Binder token, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        j.g(token, "token");
        j.g(activity, "activity");
        j.g(executor, "executor");
        j.g(windowAreaSessionCallback, "windowAreaSessionCallback");
        if (!j.b(token.getInterfaceDescriptor(), REAR_DISPLAY_BINDER_DESCRIPTOR)) {
            executor.execute(new E8.l(windowAreaSessionCallback, 28));
        } else if (!j.b(this.currentRearDisplayModeStatus, WindowAreaCapability.Status.Companion.getWINDOW_AREA_STATUS_UNKNOWN$window_release())) {
            startRearDisplayMode(activity, executor, windowAreaSessionCallback);
        } else {
            Log.d(TAG, "Force updating currentRearDisplayModeStatus");
            H.w(H.c(H.n(executor)), null, null, new C08172(activity, executor, windowAreaSessionCallback, null), 3);
        }
    }
}
