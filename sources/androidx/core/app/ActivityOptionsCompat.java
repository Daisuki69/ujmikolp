package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions mActivityOptions;

        public ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Rect getLaunchBounds() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return this.mActivityOptions.getLaunchBounds();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public int getLaunchDisplayId() {
            if (Build.VERSION.SDK_INT >= 26) {
                return this.mActivityOptions.getLaunchDisplayId();
            }
            return -1;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            this.mActivityOptions.requestUsageTimeReport(pendingIntent);
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new ActivityOptionsCompatImpl(this.mActivityOptions.setLaunchBounds(rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setLaunchDisplayId(int i) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mActivityOptions.setLaunchDisplayId(i);
            }
            return this;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        @SuppressLint({"WrongConstant"})
        public ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int i) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34) {
                this.mActivityOptions.setPendingIntentBackgroundActivityStartMode(i);
                return this;
            }
            if (i4 >= 33) {
                this.mActivityOptions.setPendingIntentBackgroundActivityLaunchAllowed(i != 2);
            }
            return this;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setShareIdentityEnabled(boolean z4) {
            return Build.VERSION.SDK_INT < 34 ? this : new ActivityOptionsCompatImpl(this.mActivityOptions.setShareIdentityEnabled(z4));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface BackgroundActivityStartMode {
    }

    public static ActivityOptionsCompat makeBasic() {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeBasic());
    }

    public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int i4, int i6, int i10) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeClipRevealAnimation(view, i, i4, i6, i10));
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int i4) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i, i4));
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int i4, int i6, int i10) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(view, i, i4, i6, i10));
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeTaskLaunchBehind());
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i4) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i4));
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public int getLaunchDisplayId() {
        return -1;
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public ActivityOptionsCompat setLaunchBounds(Rect rect) {
        return this;
    }

    public ActivityOptionsCompat setLaunchDisplayId(int i) {
        return this;
    }

    public ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int i) {
        return this;
    }

    public ActivityOptionsCompat setShareIdentityEnabled(boolean z4) {
        return this;
    }

    public Bundle toBundle() {
        return null;
    }

    public void update(ActivityOptionsCompat activityOptionsCompat) {
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, Pair<View, String>... pairArr) {
        android.util.Pair[] pairArr2;
        if (pairArr != null) {
            pairArr2 = new android.util.Pair[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                Pair<View, String> pair = pairArr[i];
                pairArr2[i] = android.util.Pair.create(pair.first, pair.second);
            }
        } else {
            pairArr2 = null;
        }
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr2));
    }
}
