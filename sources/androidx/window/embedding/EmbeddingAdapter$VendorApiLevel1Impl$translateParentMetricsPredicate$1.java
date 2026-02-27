package androidx.window.embedding;

import android.content.Context;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class EmbeddingAdapter$VendorApiLevel1Impl$translateParentMetricsPredicate$1 extends k implements Function1<WindowMetrics, Boolean> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SplitRule $splitRule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddingAdapter$VendorApiLevel1Impl$translateParentMetricsPredicate$1(SplitRule splitRule, Context context) {
        super(1);
        this.$splitRule = splitRule;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(f.n(obj));
    }

    public final Boolean invoke(WindowMetrics windowMetrics) {
        j.g(windowMetrics, "windowMetrics");
        return Boolean.valueOf(this.$splitRule.checkParentMetrics$window_release(this.$context, windowMetrics));
    }
}
