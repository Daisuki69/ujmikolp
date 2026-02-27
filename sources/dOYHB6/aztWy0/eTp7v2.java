package dOYHB6.aztWy0;

import android.app.Activity;
import android.view.MotionEvent;
import dOYHB6.nm8AQ4;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class eTp7v2 {
    private final WeakReference<Activity> activity;
    private final String activityPath;
    private final MotionEvent motionEvent;

    public eTp7v2(MotionEvent motionEvent, Activity activity) {
        this.motionEvent = MotionEvent.obtain(motionEvent);
        if (activity != null) {
            this.activity = new WeakReference<>(activity);
            this.activityPath = activity.getClass().getName();
        } else {
            this.activity = null;
            this.activityPath = nm8AQ4.get().getClass().getName();
        }
    }

    public Activity getActivity() {
        return this.activity.get();
    }

    public String getActivityPath() {
        return this.activityPath;
    }

    public MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public void recycleMotionEvent() {
        this.motionEvent.recycle();
    }
}
