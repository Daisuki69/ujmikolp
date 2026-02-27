package Ke;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2653b;

    public /* synthetic */ f(View view, int i) {
        this.f2652a = i;
        this.f2653b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NestedScrollView nestedScrollView;
        switch (this.f2652a) {
            case 0:
                View view = this.f2653b;
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        nestedScrollView = null;
                    } else if (parent instanceof NestedScrollView) {
                        nestedScrollView = (NestedScrollView) parent;
                    } else {
                        parent = ((ViewGroup) parent).getParent();
                    }
                }
                if (nestedScrollView != null) {
                    nestedScrollView.smoothScrollTo(0, kotlin.ranges.d.b((int) ((view.getY() - (nestedScrollView.getHeight() / 2)) + (view.getHeight() / 2)), 0, nestedScrollView.getChildAt(0).getHeight() - nestedScrollView.getHeight()));
                }
                break;
            default:
                View view2 = this.f2653b;
                view2.getLayoutParams().height = -1;
                view2.requestLayout();
                break;
        }
    }
}
