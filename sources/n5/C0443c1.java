package N5;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0443c1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f4070b;
    public final TextView c;

    public /* synthetic */ C0443c1(CardView cardView, TextView textView, int i) {
        this.f4069a = i;
        this.f4070b = cardView;
        this.c = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4069a) {
        }
        return this.f4070b;
    }
}
