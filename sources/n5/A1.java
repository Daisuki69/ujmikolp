package N5;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class A1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f3548b;

    public /* synthetic */ A1(CardView cardView, int i) {
        this.f3547a = i;
        this.f3548b = cardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3547a) {
        }
        return this.f3548b;
    }
}
