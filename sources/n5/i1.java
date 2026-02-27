package N5;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4119a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f4120b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4121d;

    public i1(CardView cardView, ImageView imageView, View view) {
        this.f4120b = cardView;
        this.f4121d = imageView;
        this.c = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4119a) {
        }
        return this.f4120b;
    }

    public i1(CardView cardView, View view, ImageView imageView) {
        this.f4120b = cardView;
        this.c = view;
        this.f4121d = imageView;
    }
}
