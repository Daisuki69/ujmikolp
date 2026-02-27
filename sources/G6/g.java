package G6;

import android.content.Intent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import java.util.List;
import kotlin.Pair;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC2509a implements F6.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1786d;
    public final C1295y0 e;
    public Pair f;

    public g(com.paymaya.data.preference.a aVar, C1295y0 c1295y0, Uh.d dVar) {
        super(dVar);
        this.f1786d = aVar;
        this.e = c1295y0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        Intent intent2;
        super.j();
        if (this.f1786d.e().isBankPullSettingsV2Enabled()) {
            MayaBankPullV2Fragment mayaBankPullV2Fragment = (MayaBankPullV2Fragment) ((K6.e) this.c.get());
            AppCompatTextView appCompatTextView = mayaBankPullV2Fragment.f11643p0;
            if (appCompatTextView == null) {
                kotlin.jvm.internal.j.n("mTextViewLinkNewAccount");
                throw null;
            }
            appCompatTextView.setText(mayaBankPullV2Fragment.getString(R.string.maya_label_header_bank_pull_title_v2));
        } else {
            MayaBankPullV2Fragment mayaBankPullV2Fragment2 = (MayaBankPullV2Fragment) ((K6.e) this.c.get());
            AppCompatTextView appCompatTextView2 = mayaBankPullV2Fragment2.f11643p0;
            if (appCompatTextView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewLinkNewAccount");
                throw null;
            }
            appCompatTextView2.setText(mayaBankPullV2Fragment2.getString(R.string.maya_label_header_bank_pull_title));
        }
        FragmentActivity activity = ((MayaBankPullV2Fragment) ((K6.e) this.c.get())).getActivity();
        if (10 == C.w((activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString())) {
            MayaBankPullV2Fragment mayaBankPullV2Fragment3 = (MayaBankPullV2Fragment) ((K6.e) this.c.get());
            C1219h c1219hM1 = mayaBankPullV2Fragment3.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("from_deep_link", "true");
            FragmentActivity activity2 = mayaBankPullV2Fragment3.getActivity();
            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                return;
            }
            intent.setData(null);
        }
    }

    public final void k(Pair paymentOptions) {
        kotlin.jvm.internal.j.g(paymentOptions, "paymentOptions");
        ((MayaBankPullV2Fragment) ((K6.e) this.c.get())).L1();
        K6.e eVar = (K6.e) this.c.get();
        List paymentOptions2 = (List) paymentOptions.f18160a;
        MayaBankPullV2Fragment mayaBankPullV2Fragment = (MayaBankPullV2Fragment) eVar;
        mayaBankPullV2Fragment.getClass();
        kotlin.jvm.internal.j.g(paymentOptions2, "paymentOptions");
        J6.c cVar = mayaBankPullV2Fragment.w0;
        if (cVar != null) {
            cVar.e(paymentOptions2);
        }
        if (((List) paymentOptions.f18161b).isEmpty()) {
            Group group = ((MayaBankPullV2Fragment) ((K6.e) this.c.get())).t0;
            if (group != null) {
                group.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mGroupLinkedAccounts");
                throw null;
            }
        }
        Group group2 = ((MayaBankPullV2Fragment) ((K6.e) this.c.get())).t0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mGroupLinkedAccounts");
            throw null;
        }
        group2.setVisibility(0);
        K6.e eVar2 = (K6.e) this.c.get();
        List linkedAccounts = (List) paymentOptions.f18161b;
        MayaBankPullV2Fragment mayaBankPullV2Fragment2 = (MayaBankPullV2Fragment) eVar2;
        mayaBankPullV2Fragment2.getClass();
        kotlin.jvm.internal.j.g(linkedAccounts, "linkedAccounts");
        J6.c cVar2 = mayaBankPullV2Fragment2.f11648x0;
        if (cVar2 != null) {
            cVar2.e(linkedAccounts);
        }
    }
}
