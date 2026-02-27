package androidx.privacysandbox.ads.adservices.signals;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import gj.InterfaceC1526a;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProtectedSignalsManager {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ProtectedSignalsManager";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi"})
        @ExperimentalFeatures.Ext12OptIn
        public final ProtectedSignalsManager obtain(Context context) {
            j.g(context, "context");
            if (AdServicesInfo.INSTANCE.adServicesVersion() < 12) {
                Log.d(ProtectedSignalsManager.TAG, "Adservices less than 12, returning null for ProtectedSignalsManager.obtain.");
                return null;
            }
            Log.d(ProtectedSignalsManager.TAG, "Adservices version 12 detected, obtaining ProtectedSignalsManagerImpl.");
            android.adservices.signals.ProtectedSignalsManager protectedSignalsManager = android.adservices.signals.ProtectedSignalsManager.get(context);
            j.f(protectedSignalsManager, "get(context)");
            return new ProtectedSignalsManagerImpl(protectedSignalsManager);
        }

        private Companion() {
        }
    }

    @SuppressLint({"NewApi"})
    @ExperimentalFeatures.Ext12OptIn
    public static final ProtectedSignalsManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_PROTECTED_SIGNALS")
    @ExperimentalFeatures.Ext12OptIn
    public abstract Object updateSignals(UpdateSignalsRequest updateSignalsRequest, InterfaceC1526a<? super Unit> interfaceC1526a);
}
