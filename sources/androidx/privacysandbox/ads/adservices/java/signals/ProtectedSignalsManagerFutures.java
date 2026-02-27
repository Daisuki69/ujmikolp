package androidx.privacysandbox.ads.adservices.java.signals;

import Bj.H;
import Bj.U;
import S1.y;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProtectedSignalsManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProtectedSignalsManagerFutures from(Context context) {
            j.g(context, "context");
            ProtectedSignalsManager protectedSignalsManagerObtain = ProtectedSignalsManager.Companion.obtain(context);
            if (protectedSignalsManagerObtain != null) {
                return new JavaImpl(protectedSignalsManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final class JavaImpl extends ProtectedSignalsManagerFutures {
        private final ProtectedSignalsManager mProtectedSignalsManager;

        public JavaImpl(ProtectedSignalsManager protectedSignalsManager) {
            this.mProtectedSignalsManager = protectedSignalsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
        @DoNotInline
        public y updateSignalsAsync(UpdateSignalsRequest request) {
            j.g(request, "request");
            return CoroutineAdapterKt.asListenableFuture$default(H.g(H.c(U.f603a), null, new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this, request, null), 3), null, 1, null);
        }
    }

    public static final ProtectedSignalsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    public abstract y updateSignalsAsync(UpdateSignalsRequest updateSignalsRequest);
}
