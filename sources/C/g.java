package C;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.messaging.r;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements SwipeDismissBehavior.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f655a;

    public g(m mVar) {
        this.f655a = mVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
    public final void onDismiss(View view) {
        this.f655a.b(0);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
    public final void onDragStateChanged(int i) {
        m mVar = this.f655a;
        if (i != 0) {
            if (i == 1 || i == 2) {
                r.s().n(mVar.c);
                return;
            }
            return;
        }
        r rVarS = r.s();
        f fVar = mVar.c;
        synchronized (rVarS.f9803b) {
            try {
                if (rVarS.E(fVar)) {
                    rVarS.J((d) rVarS.f9804d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
