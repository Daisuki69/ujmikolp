package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0458i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4115b;
    public final FragmentContainerView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0491z f4116d;

    public /* synthetic */ C0458i(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, C0491z c0491z, int i) {
        this.f4114a = i;
        this.f4115b = constraintLayout;
        this.c = fragmentContainerView;
        this.f4116d = c0491z;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4114a) {
        }
        return this.f4115b;
    }
}
