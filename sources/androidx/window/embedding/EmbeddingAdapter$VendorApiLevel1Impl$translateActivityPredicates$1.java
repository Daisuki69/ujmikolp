package androidx.window.embedding;

import android.app.Activity;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class EmbeddingAdapter$VendorApiLevel1Impl$translateActivityPredicates$1 extends k implements Function1<Activity, Boolean> {
    final /* synthetic */ Set<ActivityFilter> $activityFilters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddingAdapter$VendorApiLevel1Impl$translateActivityPredicates$1(Set<ActivityFilter> set) {
        super(1);
        this.$activityFilters = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Activity activity) {
        j.g(activity, "activity");
        Set<ActivityFilter> set = this.$activityFilters;
        boolean z4 = false;
        if (!(set != null) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ActivityFilter) it.next()).matchesActivity(activity)) {
                    z4 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z4);
    }
}
