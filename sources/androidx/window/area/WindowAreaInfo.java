package androidx.window.area;

import android.os.Binder;
import androidx.window.area.WindowAreaCapability;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.layout.WindowMetrics;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public final class WindowAreaInfo {
    private final HashMap<WindowAreaCapability.Operation, WindowAreaCapability> capabilityMap;
    private WindowMetrics metrics;
    private final Binder token;
    private final Type type;
    private final WindowAreaComponent windowAreaComponent;

    @ExperimentalWindowApi
    public static final class Type {
        public static final Companion Companion = new Companion(null);
        public static final Type TYPE_REAR_FACING = new Type("REAR FACING");
        private final String description;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return this.description;
        }
    }

    public WindowAreaInfo(WindowMetrics metrics, Type type, Binder token, WindowAreaComponent windowAreaComponent) {
        j.g(metrics, "metrics");
        j.g(type, "type");
        j.g(token, "token");
        j.g(windowAreaComponent, "windowAreaComponent");
        this.metrics = metrics;
        this.type = type;
        this.token = token;
        this.windowAreaComponent = windowAreaComponent;
        this.capabilityMap = new HashMap<>();
    }

    private final WindowAreaSession createRearFacingSession(WindowAreaCapability.Operation operation) {
        if (j.b(operation, WindowAreaCapability.Operation.OPERATION_TRANSFER_ACTIVITY_TO_AREA)) {
            return new RearDisplaySessionImpl(this.windowAreaComponent);
        }
        if (!j.b(operation, WindowAreaCapability.Operation.OPERATION_PRESENT_ON_AREA)) {
            throw new IllegalArgumentException("Invalid operation provided");
        }
        WindowAreaComponent windowAreaComponent = this.windowAreaComponent;
        ExtensionWindowAreaPresentation rearDisplayPresentation = windowAreaComponent.getRearDisplayPresentation();
        j.d(rearDisplayPresentation);
        return new RearDisplayPresentationSessionPresenterImpl(windowAreaComponent, rearDisplayPresentation);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WindowAreaInfo)) {
            return false;
        }
        WindowAreaInfo windowAreaInfo = (WindowAreaInfo) obj;
        return j.b(this.metrics, windowAreaInfo.metrics) && j.b(this.type, windowAreaInfo.type) && j.b(this.capabilityMap.entrySet(), windowAreaInfo.capabilityMap.entrySet());
    }

    public final WindowAreaSession getActiveSession(WindowAreaCapability.Operation operation) {
        j.g(operation, "operation");
        if (!j.b(getCapability(operation).getStatus(), WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE)) {
            throw new IllegalStateException("No session is currently active");
        }
        if (j.b(this.type, Type.TYPE_REAR_FACING)) {
            return createRearFacingSession(operation);
        }
        return null;
    }

    public final WindowAreaCapability getCapability(WindowAreaCapability.Operation operation) {
        j.g(operation, "operation");
        WindowAreaCapability windowAreaCapability = this.capabilityMap.get(operation);
        return windowAreaCapability == null ? new WindowAreaCapability(operation, WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED) : windowAreaCapability;
    }

    public final HashMap<WindowAreaCapability.Operation, WindowAreaCapability> getCapabilityMap$window_release() {
        return this.capabilityMap;
    }

    public final WindowMetrics getMetrics() {
        return this.metrics;
    }

    public final Binder getToken() {
        return this.token;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.capabilityMap.entrySet().hashCode() + ((this.type.hashCode() + (this.metrics.hashCode() * 31)) * 31);
    }

    public final void setMetrics(WindowMetrics windowMetrics) {
        j.g(windowMetrics, "<set-?>");
        this.metrics = windowMetrics;
    }

    public String toString() {
        return "WindowAreaInfo{ Metrics: " + this.metrics + ", type: " + this.type + ", Capabilities: " + this.capabilityMap.entrySet() + " }";
    }
}
