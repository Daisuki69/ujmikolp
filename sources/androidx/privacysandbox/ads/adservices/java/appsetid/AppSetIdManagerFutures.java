package androidx.privacysandbox.ads.adservices.java.appsetid;

import Bj.H;
import Bj.U;
import S1.y;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppSetIdManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        private final AppSetIdManager mAppSetIdManager;

        public Api33Ext4JavaImpl(AppSetIdManager mAppSetIdManager) {
            j.g(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures
        @DoNotInline
        public y getAppSetIdAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(H.g(H.c(U.f603a), null, new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppSetIdManagerFutures from(Context context) {
            j.g(context, "context");
            AppSetIdManager appSetIdManagerObtain = AppSetIdManager.Companion.obtain(context);
            if (appSetIdManagerObtain != null) {
                return new Api33Ext4JavaImpl(appSetIdManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AppSetIdManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract y getAppSetIdAsync();
}
