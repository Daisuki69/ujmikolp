package mx_android.support.v4.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
class ActivityOptionsCompatJB {
    private final ActivityOptions mActivityOptions;

    public static ActivityOptionsCompatJB makeCustomAnimation(Context context, int i, int i4) {
        return new ActivityOptionsCompatJB(ActivityOptions.makeCustomAnimation(context, i, i4));
    }

    public static ActivityOptionsCompatJB makeScaleUpAnimation(View view, int i, int i4, int i6, int i10) {
        return new ActivityOptionsCompatJB(ActivityOptions.makeScaleUpAnimation(view, i, i4, i6, i10));
    }

    public static ActivityOptionsCompatJB makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int i4) {
        return new ActivityOptionsCompatJB(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i4));
    }

    private ActivityOptionsCompatJB(ActivityOptions activityOptions) {
        this.mActivityOptions = activityOptions;
    }

    public Bundle toBundle() {
        return this.mActivityOptions.toBundle();
    }

    public void update(ActivityOptionsCompatJB activityOptionsCompatJB) {
        this.mActivityOptions.update(activityOptionsCompatJB.mActivityOptions);
    }
}
