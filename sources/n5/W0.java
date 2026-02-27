package N5;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class W0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3973b;
    public final FrameLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f3974d;
    public final WebView e;

    public /* synthetic */ W0(ConstraintLayout constraintLayout, FrameLayout frameLayout, ProgressBar progressBar, WebView webView, int i) {
        this.f3972a = i;
        this.f3973b = constraintLayout;
        this.c = frameLayout;
        this.f3974d = progressBar;
        this.e = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3972a) {
        }
        return this.f3973b;
    }

    public W0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, ProgressBar progressBar, WebView webView) {
        this.f3972a = 0;
        this.f3973b = constraintLayout;
        this.c = frameLayout;
        this.f3974d = progressBar;
        this.e = webView;
    }
}
