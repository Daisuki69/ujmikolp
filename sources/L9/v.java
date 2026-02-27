package L9;

import N5.C0449e1;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.ContactReferenceData;
import com.paymaya.domain.model.FileUrl;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f2930b;

    public /* synthetic */ v(B b8, int i) {
        this.f2929a = i;
        this.f2930b = b8;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2929a) {
            case 0:
                ContactReferenceData contactReferenceData = (ContactReferenceData) obj;
                kotlin.jvm.internal.j.g(contactReferenceData, "contactReferenceData");
                B b8 = this.f2930b;
                if ((contactReferenceData.getContactReference() != null ? new J9.a(contactReferenceData.getContactReference().getFirstName(), contactReferenceData.getContactReference().getLastName(), contactReferenceData.getContactReference().getRelationship(), contactReferenceData.getContactReference().getMobileNumber()) : null) != null) {
                    C0449e1 c0449e1 = ((NewMayaCreditFragment) ((P9.k) b8.c.get())).f13241J0;
                    if (c0449e1 == null) {
                        kotlin.jvm.internal.j.n("mViewContactReferenceBanner");
                        throw null;
                    }
                    c0449e1.f4085b.setVisibility(8);
                    NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) b8.c.get());
                    Button button = newMayaCreditFragment.w0;
                    if (button == null) {
                        kotlin.jvm.internal.j.n("mButtonTransferToWallet");
                        throw null;
                    }
                    button.setEnabled(true);
                    Button button2 = newMayaCreditFragment.w0;
                    if (button2 == null) {
                        kotlin.jvm.internal.j.n("mButtonTransferToWallet");
                        throw null;
                    }
                    button2.setBackground(ContextCompat.getDrawable(newMayaCreditFragment.requireActivity(), R.drawable.maya_bg_selector_button_secondary_default));
                    Button button3 = newMayaCreditFragment.w0;
                    if (button3 == null) {
                        kotlin.jvm.internal.j.n("mButtonTransferToWallet");
                        throw null;
                    }
                    button3.setTextColor(ContextCompat.getColor(newMayaCreditFragment.requireContext(), R.color.maya_primary_green));
                } else {
                    b8.x();
                }
                ((MayaBaseFragment) ((P9.k) b8.c.get())).w1();
                return;
            default:
                FileUrl p02 = (FileUrl) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                B b10 = this.f2930b;
                b10.getClass();
                ((MayaBaseFragment) ((P9.k) b10.c.get())).w1();
                P9.k kVar = (P9.k) b10.c.get();
                String url = p02.getUrl();
                NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) kVar;
                newMayaCreditFragment2.getClass();
                kotlin.jvm.internal.j.g(url, "url");
                Q9.G g8 = newMayaCreditFragment2.D1;
                if (g8 != null) {
                    MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
                    mayaDashboardActivity.n1();
                    B5.i.f(mayaDashboardActivity, url);
                    return;
                }
                return;
        }
    }
}
