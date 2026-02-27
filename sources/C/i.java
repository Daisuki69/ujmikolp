package C;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout;
import com.google.firebase.messaging.r;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends ViewPropertyAnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f658a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f659b;

    public i(m mVar) {
        this.f659b = mVar;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        switch (this.f658a) {
            case 0:
                this.f659b.getClass();
                r rVarS = r.s();
                f fVar = this.f659b.c;
                synchronized (rVarS.f9803b) {
                    try {
                        if (rVarS.E(fVar)) {
                            rVarS.J((d) rVarS.f9804d);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                this.f659b.d();
                return;
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        switch (this.f658a) {
            case 0:
                TSnackbar$SnackbarLayout tSnackbar$SnackbarLayout = this.f659b.f663b;
                tSnackbar$SnackbarLayout.f9425a.setAlpha(0.0f);
                long j = 180;
                long j6 = 70;
                ViewCompat.animate(tSnackbar$SnackbarLayout.f9425a).alpha(1.0f).setDuration(j).setStartDelay(j6).start();
                if (tSnackbar$SnackbarLayout.f9426b.getVisibility() == 0) {
                    tSnackbar$SnackbarLayout.f9426b.setAlpha(0.0f);
                    ViewCompat.animate(tSnackbar$SnackbarLayout.f9426b).alpha(1.0f).setDuration(j).setStartDelay(j6).start();
                }
                break;
            default:
                TSnackbar$SnackbarLayout tSnackbar$SnackbarLayout2 = this.f659b.f663b;
                tSnackbar$SnackbarLayout2.f9425a.setAlpha(1.0f);
                long j7 = 180;
                long j9 = 0;
                ViewCompat.animate(tSnackbar$SnackbarLayout2.f9425a).alpha(0.0f).setDuration(j7).setStartDelay(j9).start();
                if (tSnackbar$SnackbarLayout2.f9426b.getVisibility() == 0) {
                    tSnackbar$SnackbarLayout2.f9426b.setAlpha(1.0f);
                    ViewCompat.animate(tSnackbar$SnackbarLayout2.f9426b).alpha(0.0f).setDuration(j7).setStartDelay(j9).start();
                }
                break;
        }
    }

    public i(m mVar, int i) {
        this.f659b = mVar;
    }
}
