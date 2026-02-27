package mx_android.support.v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
class ActivityOptionsCompat21 {
    private final ActivityOptions mActivityOptions;

    public static ActivityOptionsCompat21 makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static ActivityOptionsCompat21 makeSceneTransitionAnimation(Activity activity, View[] viewArr, String[] strArr) {
        Pair[] pairArr;
        if (viewArr != null) {
            int length = viewArr.length;
            pairArr = new Pair[length];
            for (int i = 0; i < length; i++) {
                pairArr[i] = Pair.create(viewArr[i], strArr[i]);
            }
        } else {
            pairArr = null;
        }
        return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    private ActivityOptionsCompat21(ActivityOptions activityOptions) {
        this.mActivityOptions = activityOptions;
    }

    public Bundle toBundle() {
        return this.mActivityOptions.toBundle();
    }

    public void update(ActivityOptionsCompat21 activityOptionsCompat21) {
        this.mActivityOptions.update(activityOptionsCompat21.mActivityOptions);
    }
}
