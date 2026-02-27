package androidx.window.embedding;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.window.extensions.core.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f8210b;
    public final /* synthetic */ SplitRule c;

    public /* synthetic */ b(SplitRule splitRule, Context context, int i) {
        this.f8209a = i;
        this.c = splitRule;
        this.f8210b = context;
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public final boolean test(Object obj) {
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        switch (this.f8209a) {
            case 0:
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$11((SplitPlaceholderRule) this.c, this.f8210b, windowMetrics);
            default:
                return EmbeddingAdapter.translateSplitPairRule$lambda$6((SplitPairRule) this.c, this.f8210b, windowMetrics);
        }
    }
}
