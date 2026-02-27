package C;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout;
import com.google.firebase.messaging.r;
import com.paymaya.R;
import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Handler f661d = new Handler(Looper.getMainLooper(), new e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TSnackbar$SnackbarLayout f663b;
    public final f c = new f(this);

    public m(ViewGroup viewGroup) {
        this.f662a = viewGroup;
        this.f663b = (TSnackbar$SnackbarLayout) AbstractC1414e.e(viewGroup, R.layout.tsnackbar_layout, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061 A[EDGE_INSN: B:48:0x0061->B:31:0x0061 BREAK  A[LOOP:1: B:21:0x0042->B:30:0x005e], PHI: r2
  0x0061: PHI (r2v2 android.view.ViewGroup) = 
  (r2v1 android.view.ViewGroup)
  (r2v1 android.view.ViewGroup)
  (r2v1 android.view.ViewGroup)
  (r2v1 android.view.ViewGroup)
  (r2v1 android.view.ViewGroup)
  (r2v1 android.view.ViewGroup)
  (r2v5 android.view.ViewGroup)
 binds: [B:17:0x002e, B:19:0x003b, B:48:0x0061, B:25:0x004c, B:50:0x0061, B:15:0x0026, B:11:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[LOOP:0: B:3:0x0004->B:47:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C.m c(android.view.View r8, java.lang.CharSequence r9) {
        /*
            C.m r0 = new C.m
            r1 = 0
            r2 = r1
        L4:
            boolean r3 = r8 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r3 == 0) goto Lc
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L72
        Lc:
            boolean r3 = r8 instanceof android.widget.FrameLayout
            if (r3 == 0) goto L20
            int r2 = r8.getId()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 != r3) goto L1c
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L72
        L1c:
            r2 = r8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L61
        L20:
            boolean r3 = r8 instanceof androidx.appcompat.widget.Toolbar
            if (r3 != 0) goto L28
            boolean r3 = r8 instanceof android.widget.Toolbar
            if (r3 == 0) goto L61
        L28:
            android.view.ViewParent r3 = r8.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L61
            android.view.ViewParent r3 = r8.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.getChildCount()
            r5 = 1
            if (r4 <= r5) goto L61
            int r4 = r3.getChildCount()
            r5 = 0
        L42:
            if (r5 >= r4) goto L61
            android.view.View r6 = r3.getChildAt(r5)
            if (r6 != r8) goto L5e
            int r6 = r4 + (-1)
            if (r5 >= r6) goto L61
        L4e:
            if (r5 >= r4) goto L61
            int r5 = r5 + 1
            android.view.View r6 = r3.getChildAt(r5)
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L4e
            r8 = r6
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L72
        L5e:
            int r5 = r5 + 1
            goto L42
        L61:
            if (r8 == 0) goto L6f
            android.view.ViewParent r8 = r8.getParent()
            boolean r3 = r8 instanceof android.view.View
            if (r3 == 0) goto L6e
            android.view.View r8 = (android.view.View) r8
            goto L6f
        L6e:
            r8 = r1
        L6f:
            if (r8 != 0) goto L4
            r8 = r2
        L72:
            r0.<init>(r8)
            com.androidadvance.topsnackbar.TSnackbar$SnackbarLayout r8 = r0.f663b
            android.widget.TextView r8 = r8.getMessageView()
            r8.setText(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C.m.c(android.view.View, java.lang.CharSequence):C.m");
    }

    public final void a() {
        TSnackbar$SnackbarLayout tSnackbar$SnackbarLayout = this.f663b;
        tSnackbar$SnackbarLayout.setTranslationY(-tSnackbar$SnackbarLayout.getHeight());
        ViewCompat.animate(tSnackbar$SnackbarLayout).translationY(0.0f).setInterpolator(a.f649a).setDuration(250L).setListener(new i(this)).start();
    }

    public final void b(int i) {
        r rVarS = r.s();
        f fVar = this.c;
        synchronized (rVarS.f9803b) {
            if (rVarS.E(fVar)) {
                r.m((d) rVarS.f9804d, i);
            } else {
                d dVar = (d) rVarS.e;
                if (dVar != null && dVar.f653a.get() == fVar) {
                    r.m((d) rVarS.e, i);
                }
            }
        }
    }

    public final void d() {
        r rVarS = r.s();
        f fVar = this.c;
        synchronized (rVarS.f9803b) {
            try {
                if (rVarS.E(fVar)) {
                    rVarS.f9804d = null;
                    if (((d) rVarS.e) != null) {
                        rVarS.M();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f663b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f663b);
        }
    }

    public final void e() {
        r rVarS = r.s();
        f fVar = this.c;
        synchronized (rVarS.f9803b) {
            try {
                if (rVarS.E(fVar)) {
                    d dVar = (d) rVarS.f9804d;
                    dVar.getClass();
                    ((Handler) rVarS.c).removeCallbacksAndMessages(dVar);
                    rVarS.J((d) rVarS.f9804d);
                    return;
                }
                d dVar2 = (d) rVarS.e;
                if (dVar2 != null && dVar2.f653a.get() == fVar) {
                    ((d) rVarS.e).getClass();
                } else {
                    rVarS.e = new d(fVar);
                }
                d dVar3 = (d) rVarS.f9804d;
                if (dVar3 == null || !r.m(dVar3, 4)) {
                    rVarS.f9804d = null;
                    rVarS.M();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
