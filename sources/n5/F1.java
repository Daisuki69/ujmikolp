package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class F1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f3621b;
    public final CardView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3622d;
    public final ImageView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f3623g;

    public /* synthetic */ F1(CardView cardView, CardView cardView2, TextView textView, ImageView imageView, TextView textView2, TextView textView3, int i) {
        this.f3620a = i;
        this.f3621b = cardView;
        this.c = cardView2;
        this.f3622d = textView;
        this.e = imageView;
        this.f = textView2;
        this.f3623g = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3620a) {
        }
        return this.f3621b;
    }
}
