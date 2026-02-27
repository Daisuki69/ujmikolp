package C7;

import N5.C0453g;
import N5.k1;
import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import androidx.window.layout.WindowMetricsCalculator;
import com.paymaya.R;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardActivity f742b;

    public /* synthetic */ a(MayaDashboardActivity mayaDashboardActivity, int i) {
        this.f741a = i;
        this.f742b = mayaDashboardActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int[], java.io.Serializable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        int i4 = 0;
        int i6 = 1;
        switch (this.f741a) {
            case 0:
                MayaDashboardActivity mayaDashboardActivity = this.f742b;
                TextView textView = mayaDashboardActivity.f12147t;
                if (textView == null) {
                    j.n("mTextViewToast");
                    throw null;
                }
                textView.setAlpha(1.0f);
                TextView textView2 = mayaDashboardActivity.f12147t;
                if (textView2 == null) {
                    j.n("mTextViewToast");
                    throw null;
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = textView2.animate();
                viewPropertyAnimatorAnimate.alpha(0.0f);
                viewPropertyAnimatorAnimate.setDuration(400L);
                viewPropertyAnimatorAnimate.setUpdateListener(new b(mayaDashboardActivity, i6));
                viewPropertyAnimatorAnimate.start();
                return;
            default:
                int i10 = MayaDashboardActivity.f12133U;
                MayaDashboardActivity mayaDashboardActivity2 = this.f742b;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(mayaDashboardActivity2);
                C0453g c0453g = mayaDashboardActivity2.m;
                j.d(c0453g);
                ConstraintLayout constraintLayout = (ConstraintLayout) c0453g.f4094b;
                j.e(constraintLayout, "null cannot be cast to non-null type android.view.ViewGroup");
                View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_tap_to_pay_tooltip_container, (ViewGroup) constraintLayout, false);
                int i11 = R.id.btn_close;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.btn_close);
                if (textView3 != null) {
                    i11 = R.id.tooltip_container;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.tooltip_container);
                    if (relativeLayout != null) {
                        i11 = R.id.tooltip_content;
                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.tooltip_content);
                        if (viewFindChildViewById != null) {
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_try_now);
                            if (textView4 == null) {
                                throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(R.id.text_view_try_now)));
                            }
                            RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate;
                            j.f(relativeLayout2, "getRoot(...)");
                            Rect bounds = WindowMetricsCalculator.Companion.getOrCreate().computeCurrentWindowMetrics((Activity) mayaDashboardActivity2).getBounds();
                            int iWidth = bounds.width();
                            int iHeight = bounds.height();
                            PopupWindow popupWindow = new PopupWindow(relativeLayout2, iWidth, iHeight);
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setFocusable(true);
                            popupWindow.setElevation(12.0f);
                            popupWindow.setClippingEnabled(false);
                            popupWindow.setWindowLayoutType(1000);
                            popupWindow.setOverlapAnchor(true);
                            mayaDashboardActivity2.f12136P = popupWindow;
                            relativeLayout2.setOnClickListener(new c(mayaDashboardActivity2, i4));
                            textView3.setOnClickListener(new c(mayaDashboardActivity2, i6));
                            relativeLayout.setOnClickListener(new c(mayaDashboardActivity2, i));
                            textView4.setOnClickListener(new c(mayaDashboardActivity2, 3));
                            C0453g c0453g2 = mayaDashboardActivity2.m;
                            j.d(c0453g2);
                            ImageView imageView = (ImageView) ((k1) c0453g2.c).c;
                            ?? r02 = new int[2];
                            imageView.getLocationOnScreen(r02);
                            relativeLayout.post(new d(relativeLayout, mayaDashboardActivity2, iHeight, r02, imageView, 0));
                            PopupWindow popupWindow2 = mayaDashboardActivity2.f12136P;
                            if (popupWindow2 != null) {
                                popupWindow2.showAtLocation(mayaDashboardActivity2.getWindow().getDecorView(), 0, 0, 0);
                                return;
                            }
                            return;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        }
    }
}
