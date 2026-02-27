package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.widget.HtmlTextView;

/* JADX INFO: renamed from: N5.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0449e1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4085b;
    public final HtmlTextView c;

    public /* synthetic */ C0449e1(ConstraintLayout constraintLayout, HtmlTextView htmlTextView, int i) {
        this.f4084a = i;
        this.f4085b = constraintLayout;
        this.c = htmlTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4084a) {
        }
        return this.f4085b;
    }
}
