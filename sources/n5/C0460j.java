package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0460j implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4123b;
    public final FrameLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0491z f4124d;

    public /* synthetic */ C0460j(ConstraintLayout constraintLayout, FrameLayout frameLayout, C0491z c0491z, int i) {
        this.f4122a = i;
        this.f4123b = constraintLayout;
        this.c = frameLayout;
        this.f4124d = c0491z;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4122a) {
        }
        return this.f4123b;
    }
}
