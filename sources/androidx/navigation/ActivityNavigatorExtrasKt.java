package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.ActivityNavigator;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityNavigatorExtrasKt {
    public static final ActivityNavigator.Extras ActivityNavigatorExtras(ActivityOptionsCompat activityOptionsCompat, int i) {
        ActivityNavigator.Extras.Builder builder = new ActivityNavigator.Extras.Builder();
        if (activityOptionsCompat != null) {
            builder.setActivityOptions(activityOptionsCompat);
        }
        builder.addFlags(i);
        return builder.build();
    }

    public static /* synthetic */ ActivityNavigator.Extras ActivityNavigatorExtras$default(ActivityOptionsCompat activityOptionsCompat, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            activityOptionsCompat = null;
        }
        if ((i4 & 2) != 0) {
            i = 0;
        }
        return ActivityNavigatorExtras(activityOptionsCompat, i);
    }
}
