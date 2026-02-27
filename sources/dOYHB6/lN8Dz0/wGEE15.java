package dOYHB6.lN8Dz0;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes6.dex */
public class wGEE15 extends WebView {
    public wGEE15(Context context) {
        super(context);
    }

    public wGEE15(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public wGEE15(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public wGEE15(Context context, AttributeSet attributeSet, int i, int i4) {
        super(context, attributeSet, i, i4);
    }

    public wGEE15(Context context, AttributeSet attributeSet, int i, boolean z4) {
        super(context, attributeSet, i, z4);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onTouchEvent(motionEvent);
    }
}
