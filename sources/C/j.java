package C;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.messaging.r;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends SwipeDismissBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f660a;

    public j(m mVar) {
        this.f660a = mVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean canSwipeDismissView(View view) {
        return view instanceof TSnackbar$SnackbarLayout;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        TSnackbar$SnackbarLayout tSnackbar$SnackbarLayout = (TSnackbar$SnackbarLayout) view;
        if (coordinatorLayout.isPointInChildBounds(tSnackbar$SnackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            int actionMasked = motionEvent.getActionMasked();
            m mVar = this.f660a;
            if (actionMasked == 0) {
                r.s().n(mVar.c);
            } else if (actionMasked == 1 || actionMasked == 3) {
                r rVarS = r.s();
                f fVar = mVar.c;
                synchronized (rVarS.f9803b) {
                    try {
                        if (rVarS.E(fVar)) {
                            rVarS.J((d) rVarS.f9804d);
                        }
                    } finally {
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, tSnackbar$SnackbarLayout, motionEvent);
    }
}
