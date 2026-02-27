package Q9;

import L9.C0323a;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteCategoryFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditActivationAllSetEnhanceFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Q9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0572b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5319b;
    public final /* synthetic */ MayaBaseFragment c;

    public /* synthetic */ C0572b(MayaBaseFragment mayaBaseFragment, int i, int i4) {
        this.f5318a = i4;
        this.c = mayaBaseFragment;
        this.f5319b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5318a) {
            case 0:
                ((Integer) obj).getClass();
                C0323a c0323aG1 = ((MayaCreditActivationAllSetEnhanceFragment) this.c).G1();
                ((ArrayList) c0323aG1.i).add(((CreditAgreement) ((ArrayList) c0323aG1.h).get(this.f5319b)).getKey());
                return Unit.f18162a;
            case 1:
                NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) this.c;
                int i = this.f5319b;
                ((Integer) obj).getClass();
                L9.s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
                String key = ((CreditAgreement) sVarH1.f2913k.get(i)).getKey();
                sVarH1.f2914l.add(key);
                NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get());
                newMayaCreditEnhancedActivationFragment2.getClass();
                kotlin.jvm.internal.j.g(key, "key");
                C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment2.o1();
                FragmentActivity activity = newMayaCreditEnhancedActivationFragment2.getActivity();
                C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment2.u1());
                c1219hD.r(EnumC1216e.AGREEMENT);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.AGREE);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD.j.put("document_type", key);
                c1219hD.i();
                c1220iO1.c(activity, c1219hD);
                P9.j jVar = (P9.j) sVarH1.c.get();
                boolean zK = sVarH1.k();
                Button button = ((NewMayaCreditEnhancedActivationFragment) jVar).f13204Z;
                if (button == null) {
                    kotlin.jvm.internal.j.n("mButtonActivateCredit");
                    throw null;
                }
                button.setEnabled(zK);
                ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get())).J1(sVarH1.k());
                return Unit.f18162a;
            default:
                View it = (View) obj;
                kotlin.jvm.internal.j.g(it, "it");
                MayaFavoriteCategoryFragment mayaFavoriteCategoryFragment = (MayaFavoriteCategoryFragment) this.c;
                U7.b bVar = mayaFavoriteCategoryFragment.f12344Z;
                if (bVar != null) {
                    bVar.notifyItemChanged(this.f5319b);
                }
                RecyclerView recyclerView = mayaFavoriteCategoryFragment.f12341W;
                if (recyclerView != null) {
                    recyclerView.getRecycledViewPool().clear();
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mRecyclerView");
                throw null;
        }
    }
}
