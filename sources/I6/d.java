package I6;

import Ah.o;
import Hh.f;
import L6.InterfaceC0320f;
import L6.ViewOnClickListenerC0318d;
import Q6.r;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bg.AbstractC0983W;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullLinkedAccountsFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteCategoryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2216b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f2217d;

    public /* synthetic */ d(Object obj, int i, Parcelable parcelable, int i4) {
        this.f2215a = i4;
        this.c = obj;
        this.f2216b = i;
        this.f2217d = parcelable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2215a) {
            case 0:
                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) this.c;
                int i = this.f2216b;
                BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) this.f2217d;
                View it = (View) obj;
                int i4 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment = (MayaBankPullLinkedAccountsFragment) mayaCashInActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaCashInActivity, MayaBankPullLinkedAccountsFragment.class));
                if (mayaBankPullLinkedAccountsFragment != null) {
                    G6.d dVar = (G6.d) mayaBankPullLinkedAccountsFragment.G1();
                    LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
                    if (paymentOption != null) {
                        K6.d dVar2 = (K6.d) dVar.c.get();
                        String lastFourDigits = paymentOption.getLastFourDigits();
                        MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment2 = (MayaBankPullLinkedAccountsFragment) dVar2;
                        mayaBankPullLinkedAccountsFragment2.getClass();
                        j.g(lastFourDigits, "lastFourDigits");
                        InterfaceC0320f interfaceC0320f = mayaBankPullLinkedAccountsFragment2.f11638X;
                        if (interfaceC0320f != null) {
                            ((MayaCashInActivity) interfaceC0320f).a2(lastFourDigits, bankPullPaymentOption.getName(), new ViewOnClickListenerC0318d(mayaBankPullLinkedAccountsFragment2, i, bankPullPaymentOption, 1), mayaBankPullLinkedAccountsFragment2);
                        }
                    }
                }
                return Unit.f18162a;
            default:
                MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment = (MayaFavoriteCategoryFragment) this.c;
                int i6 = this.f2216b;
                Favorite favorite = (Favorite) this.f2217d;
                View it2 = (View) obj;
                j.g(it2, "it");
                U7.b bVar = mayaFavoriteCategoryFragment.f12344Z;
                if (bVar != null) {
                    bVar.notifyItemChanged(i6);
                }
                RecyclerView recyclerView = mayaFavoriteCategoryFragment.f12341W;
                if (recyclerView == null) {
                    j.n("mRecyclerView");
                    throw null;
                }
                recyclerView.getRecycledViewPool().clear();
                Y7.d dVar3 = (Y7.d) mayaFavoriteCategoryFragment.H1();
                j.g(favorite, "favorite");
                ((MayaBaseFragment) ((c8.b) dVar3.c.get())).E1();
                f fVarF = dVar3.f6779d.f11382b.deleteFavorite(favorite.mId()).f(Th.e.c);
                o oVarA = zh.b.a();
                Gh.d dVar4 = new Gh.d(0, new r(dVar3, 16), new A7.r(27, dVar3, favorite));
                try {
                    fVarF.d(new Hh.e(dVar4, oVarA));
                    dVar3.e(dVar4);
                    return Unit.f18162a;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    E1.c.k(th2);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
        }
    }
}
