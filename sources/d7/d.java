package D7;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import cj.C1132s;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDAccountUsageFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDBankInformationFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIncomeSourceFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIntroFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDRelatedCompaniesFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmissionReviewFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmittedFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f991a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FragmentActivity fragmentActivity, List mFragments) {
        super(fragmentActivity);
        j.g(mFragments, "mFragments");
        this.f992b = mFragments;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment createFragment(int i) {
        switch (this.f991a) {
            case 0:
                return (Fragment) this.f992b.get(i);
            default:
                return (Fragment) ((ArrayList) this.f992b).get(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        switch (this.f991a) {
            case 0:
                return this.f992b.size();
            default:
                return ((ArrayList) this.f992b).size();
        }
    }

    public d(EDDActivity eDDActivity) {
        super(eDDActivity);
        this.f992b = C1132s.h(new EDDIntroFragment(), new EDDAccountUsageFragment(), new EDDIncomeSourceFragment(), new EDDRelatedCompaniesFragment(), new EDDBankInformationFragment(), new EDDFinancialDocumentsFragment(), new EDDSubmissionReviewFragment(), new EDDSubmittedFragment());
    }
}
