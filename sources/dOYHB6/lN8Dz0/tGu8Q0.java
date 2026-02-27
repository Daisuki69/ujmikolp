package dOYHB6.lN8Dz0;

import android.app.Activity;
import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.MotionEvent;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes6.dex */
public class tGu8Q0 extends AppWidgetHostView {
    public tGu8Q0(Context context) {
        super(context);
    }

    public tGu8Q0(Context context, int i, int i4) {
        super(context, i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
