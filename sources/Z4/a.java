package Z4;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f6889b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6890d;

    public /* synthetic */ a(CardView cardView, View view, Object obj, int i) {
        this.f6888a = i;
        this.f6889b = cardView;
        this.c = view;
        this.f6890d = obj;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f6888a) {
        }
        return this.f6889b;
    }
}
