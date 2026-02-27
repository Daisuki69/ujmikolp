package N9;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditActivationFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditActivity f4345b;

    public /* synthetic */ e(NewMayaCreditActivity newMayaCreditActivity, int i) {
        this.f4344a = i;
        this.f4345b = newMayaCreditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4344a) {
            case 0:
                View it = (View) obj;
                int i = NewMayaCreditActivity.f13081x;
                j.g(it, "it");
                NewMayaCreditActivity newMayaCreditActivity = this.f4345b;
                C1220i c1220iK1 = newMayaCreditActivity.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                c1219hD.r(EnumC1216e.TRANSFER_PROCESSING);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.CONTINUE);
                c1219hD.j();
                c1220iK1.c(newMayaCreditActivity, c1219hD);
                newMayaCreditActivity.n1().q(newMayaCreditActivity);
                break;
            default:
                NewMayaCreditActivity newMayaCreditActivity2 = this.f4345b;
                int iIntValue = ((Integer) obj).intValue();
                int i4 = NewMayaCreditActivity.f13081x;
                MayaCreditActivationFragment mayaCreditActivationFragment = (MayaCreditActivationFragment) newMayaCreditActivity2.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(newMayaCreditActivity2, MayaCreditActivationFragment.class));
                if (mayaCreditActivationFragment != null) {
                    Rd.a aVar = mayaCreditActivationFragment.f14638g0;
                    if (aVar != null) {
                        CreditAgreement creditAgreement = (CreditAgreement) aVar.f5489b.get(iIntValue);
                        Boolean bool = Boolean.TRUE;
                        creditAgreement.setItemChecked(bool);
                        creditAgreement.setBlockShowAgreement(bool);
                        aVar.f5489b.set(iIntValue, creditAgreement);
                        aVar.notifyItemChanged(iIntValue);
                    }
                    Lb.a aVarR1 = mayaCreditActivationFragment.r1();
                    String key = ((CreditAgreement) ((ArrayList) aVarR1.f2942g).get(iIntValue)).getKey();
                    ((ArrayList) aVarR1.h).add(key);
                    MayaCreditActivationFragment mayaCreditActivationFragment2 = (MayaCreditActivationFragment) ((Sd.a) aVarR1.c.get());
                    mayaCreditActivationFragment2.getClass();
                    j.g(key, "key");
                    C1220i c1220i = mayaCreditActivationFragment2.f10245B;
                    FragmentActivity activity = mayaCreditActivationFragment2.getActivity();
                    C1219h c1219hD2 = C1219h.d(mayaCreditActivationFragment2.m1());
                    c1219hD2.r(EnumC1216e.AGREEMENT);
                    c1219hD2.n(17);
                    c1219hD2.t(EnumC1217f.AGREE);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hD2.j.put("document_type", key);
                    c1220i.c(activity, c1219hD2);
                }
                break;
        }
        return Unit.f18162a;
    }
}
