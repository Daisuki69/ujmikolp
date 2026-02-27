package o6;

import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import java.util.List;
import s6.InterfaceC2242c;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f18800b;

    public /* synthetic */ i(n nVar, int i) {
        this.f18799a = i;
        this.f18800b = nVar;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f18799a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f18800b.m(it);
                return;
            default:
                FavoriteCount favoriteCount = (FavoriteCount) obj;
                kotlin.jvm.internal.j.g(favoriteCount, "favoriteCount");
                n nVar = this.f18800b;
                nVar.getClass();
                t6.h hVar = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11574i0;
                if (hVar != null) {
                    ((MayaBankTransferActivity) hVar).Y1().f2942g = favoriteCount;
                }
                if (favoriteCount.mUsed() <= 0) {
                    ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).P1();
                    return;
                }
                InterfaceC2242c interfaceC2242c = (InterfaceC2242c) nVar.c.get();
                int iMUsed = favoriteCount.mUsed();
                int iMLimit = favoriteCount.mLimit();
                MayaBankTransferListFragment mayaBankTransferListFragment = (MayaBankTransferListFragment) interfaceC2242c;
                TextView textView = mayaBankTransferListFragment.f11565Z;
                if (textView != null) {
                    textView.setText(mayaBankTransferListFragment.getString(R.string.pma_format_my_favorites, Integer.valueOf(iMUsed), Integer.valueOf(iMLimit)));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewMyFavoritesLabel");
                    throw null;
                }
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        List bankList = (List) obj;
        kotlin.jvm.internal.j.g(bankList, "bankList");
        return new Lh.f(this.f18800b.k(), new M(bankList, 25), 0);
    }
}
