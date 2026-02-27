package I6;

import android.view.View;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCashInActivity f2214b;

    public /* synthetic */ c(MayaCashInActivity mayaCashInActivity, int i) {
        this.f2213a = i;
        this.f2214b = mayaCashInActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MayaCashInActivity mayaCashInActivity = this.f2214b;
        View it = (View) obj;
        switch (this.f2213a) {
            case 0:
                int i = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.n1().s(mayaCashInActivity, false);
                Bb.a aVarW1 = mayaCashInActivity.W1();
                String string = mayaCashInActivity.getString(R.string.maya_label_upgrade_now);
                j.f(string, "getString(...)");
                aVarW1.A(string);
                break;
            case 1:
                int i4 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                Bb.a aVarW12 = mayaCashInActivity.W1();
                String string2 = mayaCashInActivity.getString(R.string.maya_label_maybe_later);
                j.f(string2, "getString(...)");
                aVarW12.A(string2);
                break;
            case 2:
                int i6 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                AbstractC1236z.c(mayaCashInActivity);
                break;
            case 3:
                int i10 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.n1().q(mayaCashInActivity);
                break;
            case 4:
                int i11 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.n1().q(mayaCashInActivity);
                break;
            case 5:
                int i12 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.getClass();
                AbstractC1236z.e(mayaCashInActivity, MayaVaultedCardsFragment.class, false);
                break;
            case 6:
                int i13 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.V1();
                break;
            case 7:
                int i14 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) mayaCashInActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaCashInActivity, MayaCashInCodeFragment.class));
                if (mayaCashInCodeFragment != null) {
                    mayaCashInCodeFragment.f11683s0 = false;
                }
                MayaCashInCodeFragment mayaCashInCodeFragment2 = (MayaCashInCodeFragment) mayaCashInActivity.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaCashInActivity, MayaCashInCodeFragment.class));
                if (mayaCashInCodeFragment2 != null) {
                    mayaCashInCodeFragment2.G1().k();
                }
                break;
            case 8:
                int i15 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.getSupportFragmentManager().popBackStack((String) null, 1);
                break;
            case 9:
                int i16 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.n1().q(mayaCashInActivity);
                break;
            case 10:
                int i17 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                mayaCashInActivity.n1().q(mayaCashInActivity);
                break;
            default:
                int i18 = MayaCashInActivity.f11609r;
                j.g(it, "it");
                C1220i c1220iK1 = mayaCashInActivity.k1();
                C1219h c1219h = new C1219h();
                c1219h.p(EnumC1215d.AUTO_CASH_IN);
                c1219h.t(EnumC1217f.ACCOUNT_UPGRADE);
                c1219h.n(2);
                c1219h.i();
                c1220iK1.c(mayaCashInActivity, c1219h);
                mayaCashInActivity.n1().s(mayaCashInActivity, false);
                break;
        }
        return Unit.f18162a;
    }
}
