package androidx.window.area;

import Ej.InterfaceC0230h;
import android.app.Activity;
import android.os.Binder;
import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public interface WindowAreaController {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = z.a(WindowAreaController.class).c();
        private static WindowAreaControllerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.window.area.WindowAreaController getOrCreate() {
            /*
                r6 = this;
                r0 = 0
                java.lang.Class<androidx.window.area.WindowAreaController$Companion> r1 = androidx.window.area.WindowAreaController.Companion.class
                java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L13
                if (r1 == 0) goto L24
                androidx.window.area.SafeWindowAreaComponentProvider r2 = new androidx.window.area.SafeWindowAreaComponentProvider     // Catch: java.lang.Throwable -> L13
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
                androidx.window.extensions.area.WindowAreaComponent r0 = r2.getWindowAreaComponent()     // Catch: java.lang.Throwable -> L13
                goto L24
            L13:
                androidx.window.core.BuildConfig r1 = androidx.window.core.BuildConfig.INSTANCE
                androidx.window.core.VerificationMode r1 = r1.getVerificationMode()
                androidx.window.core.VerificationMode r2 = androidx.window.core.VerificationMode.LOG
                if (r1 != r2) goto L24
                java.lang.String r1 = androidx.window.area.WindowAreaController.Companion.TAG
                java.lang.String r2 = "Failed to load WindowExtensions"
                android.util.Log.d(r1, r2)
            L24:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 29
                if (r1 <= r2) goto L58
                if (r0 == 0) goto L58
                androidx.window.core.ExtensionsUtil r1 = androidx.window.core.ExtensionsUtil.INSTANCE
                int r2 = r1.getSafeVendorApiLevel()
                r3 = 3
                if (r2 >= r3) goto L4b
                androidx.window.area.utils.DeviceUtils r2 = androidx.window.area.utils.DeviceUtils.INSTANCE
                java.lang.String r3 = android.os.Build.MANUFACTURER
                java.lang.String r4 = "MANUFACTURER"
                kotlin.jvm.internal.j.f(r3, r4)
                java.lang.String r4 = android.os.Build.MODEL
                java.lang.String r5 = "MODEL"
                kotlin.jvm.internal.j.f(r4, r5)
                boolean r2 = r2.hasDeviceMetrics$window_release(r3, r4)
                if (r2 == 0) goto L58
            L4b:
                androidx.window.area.WindowAreaControllerImpl r2 = new androidx.window.area.WindowAreaControllerImpl
                kotlin.jvm.internal.j.d(r0)
                int r1 = r1.getSafeVendorApiLevel()
                r2.<init>(r0, r1)
                goto L5d
            L58:
                androidx.window.area.EmptyWindowAreaControllerImpl r2 = new androidx.window.area.EmptyWindowAreaControllerImpl
                r2.<init>()
            L5d:
                androidx.window.area.WindowAreaControllerDecorator r0 = androidx.window.area.WindowAreaController.Companion.decorator
                androidx.window.area.WindowAreaController r0 = r0.decorate(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.area.WindowAreaController.Companion.getOrCreate():androidx.window.area.WindowAreaController");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void overrideDecorator(WindowAreaControllerDecorator overridingDecorator) {
            j.g(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }
    }

    InterfaceC0230h getWindowAreaInfos();

    void presentContentOnWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback);

    void transferActivityToWindowArea(Binder binder, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback);
}
