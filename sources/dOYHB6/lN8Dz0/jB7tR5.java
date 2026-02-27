package dOYHB6.lN8Dz0;

import android.app.Activity;
import android.content.Context;
import android.media.tv.interactive.TvInteractiveAppView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes6.dex */
public class jB7tR5 extends TvInteractiveAppView {
    public jB7tR5(Context context) {
        super(context);
    }

    public jB7tR5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jB7tR5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
