package androidx.privacysandbox.ads.adservices.java.topics;

import Bj.H;
import Bj.U;
import Gj.m;
import Ij.e;
import S1.y;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TopicsManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class CommonApiJavaImpl extends TopicsManagerFutures {
        private final TopicsManager mTopicsManager;

        public CommonApiJavaImpl(TopicsManager mTopicsManager) {
            j.g(mTopicsManager, "mTopicsManager");
            this.mTopicsManager = mTopicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @DoNotInline
        public y getTopicsAsync(GetTopicsRequest request) {
            j.g(request, "request");
            e eVar = U.f603a;
            return CoroutineAdapterKt.asListenableFuture$default(H.g(H.c(m.f2024a), null, new TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1(this, request, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TopicsManagerFutures from(Context context) {
            j.g(context, "context");
            TopicsManager topicsManagerObtain = TopicsManager.Companion.obtain(context);
            if (topicsManagerObtain != null) {
                return new CommonApiJavaImpl(topicsManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final TopicsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract y getTopicsAsync(GetTopicsRequest getTopicsRequest);
}
