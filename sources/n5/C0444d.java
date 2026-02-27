package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;

/* JADX INFO: renamed from: N5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0444d implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4072b;
    public final FrameLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0491z f4073d;

    public /* synthetic */ C0444d(ConstraintLayout constraintLayout, FrameLayout frameLayout, C0491z c0491z, int i) {
        this.f4071a = i;
        this.f4072b = constraintLayout;
        this.c = frameLayout;
        this.f4073d = c0491z;
    }

    public static C0444d a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_activity_merchant, (ViewGroup) null, false);
        int i = R.id.maya_activity_merchant_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_activity_merchant_fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                return new C0444d((ConstraintLayout) viewInflate, frameLayout, C0491z.a(viewFindChildViewById), 12);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static C0444d b(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_activity_transactions, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                return new C0444d((ConstraintLayout) viewInflate, frameLayout, C0491z.a(viewFindChildViewById), 26);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4071a) {
        }
        return this.f4072b;
    }
}
