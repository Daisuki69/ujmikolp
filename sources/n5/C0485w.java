package N5;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0485w implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4249a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4250b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f4251d;

    public C0485w(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button) {
        this.f4250b = constraintLayout;
        this.f4251d = constraintLayout2;
        this.c = button;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4249a) {
        }
        return this.f4250b;
    }

    public C0485w(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2) {
        this.f4250b = constraintLayout;
        this.c = button;
        this.f4251d = constraintLayout2;
    }
}
