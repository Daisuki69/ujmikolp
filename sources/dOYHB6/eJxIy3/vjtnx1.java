package dOYHB6.eJxIy3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.MotionEvent;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.fChUQ4;

/* JADX INFO: loaded from: classes6.dex */
public class vjtnx1 extends Dialog {
    public vjtnx1(Context context, int i) {
        super(context, i);
    }

    protected vjtnx1(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
    }

    public boolean __replaced_725_0_dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            fChUQ4.onUserInteraction();
        }
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            fChUQ4.onUserInteraction();
        }
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return __replaced_725_0_dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }
}
