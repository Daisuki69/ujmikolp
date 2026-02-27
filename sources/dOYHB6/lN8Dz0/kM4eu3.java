package dOYHB6.lN8Dz0;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TabHost;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes6.dex */
public class kM4eu3 extends TabHost {
    public kM4eu3(Context context) {
        super(context);
    }

    public kM4eu3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public kM4eu3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public kM4eu3(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
