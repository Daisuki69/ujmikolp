package dOYHB6.lN8Dz0;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes6.dex */
public class tA8R70 extends HorizontalScrollView {
    public tA8R70(Context context) {
        super(context);
    }

    public tA8R70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public tA8R70(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public tA8R70(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
