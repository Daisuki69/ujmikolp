package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class EmbeddingAdapter$VendorApiLevel1Impl$translateActivityIntentPredicates$1 extends k implements Function2<Activity, Intent, Boolean> {
    final /* synthetic */ Set<SplitPairFilter> $splitPairFilters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddingAdapter$VendorApiLevel1Impl$translateActivityIntentPredicates$1(Set<SplitPairFilter> set) {
        super(2);
        this.$splitPairFilters = set;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Activity first, Intent second) {
        j.g(first, "first");
        j.g(second, "second");
        Set<SplitPairFilter> set = this.$splitPairFilters;
        boolean z4 = false;
        if (!(set != null) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((SplitPairFilter) it.next()).matchesActivityIntentPair(first, second)) {
                    z4 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z4);
    }
}
