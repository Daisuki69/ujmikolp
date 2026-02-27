package androidx.privacysandbox.ads.adservices.java.adid;

import Bj.H;
import Bj.U;
import S1.y;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AdIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends AdIdManagerFutures {
        private final AdIdManager mAdIdManager;

        public Api33Ext4JavaImpl(AdIdManager mAdIdManager) {
            j.g(mAdIdManager, "mAdIdManager");
            this.mAdIdManager = mAdIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @DoNotInline
        public y getAdIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(H.g(H.c(U.f603a), null, new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AdIdManagerFutures from(Context context) {
            j.g(context, "context");
            AdIdManager adIdManagerObtain = AdIdManager.Companion.obtain(context);
            if (adIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(adIdManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AdIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract y getAdIdAsync();
}
