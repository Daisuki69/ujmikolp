package d8;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;

/* JADX INFO: renamed from: d8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1340e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaFavoriteFragment f16293b;

    public /* synthetic */ ViewOnClickListenerC1340e(MayaFavoriteFragment mayaFavoriteFragment, int i) {
        this.f16292a = i;
        this.f16293b = mayaFavoriteFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16292a) {
            case 0:
                MayaFavoriteFragment mayaFavoriteFragment = this.f16293b;
                Callback.onClick_enter(view);
                try {
                    mayaFavoriteFragment.requireActivity().onBackPressed();
                    return;
                } finally {
                }
            case 1:
                MayaFavoriteFragment mayaFavoriteFragment2 = this.f16293b;
                Callback.onClick_enter(view);
                try {
                    ((Y7.f) mayaFavoriteFragment2.P1()).l();
                    return;
                } finally {
                }
            default:
                MayaFavoriteFragment mayaFavoriteFragment3 = this.f16293b;
                Callback.onClick_enter(view);
                try {
                    ((Y7.f) mayaFavoriteFragment3.P1()).l();
                    return;
                } finally {
                }
        }
    }
}
