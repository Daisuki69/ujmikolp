package Bb;

import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f407b;

    public /* synthetic */ j(n nVar, int i) {
        this.f406a = i;
        this.f407b = nVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f406a) {
            case 0:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f407b.e(it);
                return;
            case 1:
                FavoriteCount it2 = (FavoriteCount) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                n nVar = this.f407b;
                nVar.getClass();
                Gb.k kVar = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13810v0;
                if (kVar != null) {
                    ((MayaSendMoneyActivity) kVar).f13742s = it2;
                }
                if (it2.mUsed() > 0) {
                    Fb.c cVar = (Fb.c) nVar.c.get();
                    int iMUsed = it2.mUsed();
                    int iMLimit = it2.mLimit();
                    MayaSendMoneyFragment mayaSendMoneyFragment = (MayaSendMoneyFragment) cVar;
                    TextView textView = mayaSendMoneyFragment.y0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
                        throw null;
                    }
                    textView.setText(mayaSendMoneyFragment.getString(R.string.maya_format_my_favorites_with_limits_count, Integer.valueOf(iMUsed), Integer.valueOf(iMLimit)));
                    TextView textView2 = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).y0;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
                        throw null;
                    }
                }
                return;
            case 2:
                io.reactivex.rxjava3.disposables.b it3 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                this.f407b.e(it3);
                return;
            default:
                io.reactivex.rxjava3.disposables.b it4 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it4, "it");
                this.f407b.e(it4);
                return;
        }
    }
}
