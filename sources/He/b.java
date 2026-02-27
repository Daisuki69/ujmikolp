package He;

import com.paymaya.R;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.ui.travel.view.fragment.impl.TravelTicketFragment;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements g0, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TravelTicketFragment f2164a;

    public /* synthetic */ b(TravelTicketFragment travelTicketFragment) {
        this.f2164a = travelTicketFragment;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Ee.a aVar = this.f2164a.f14935S;
        if (((Ze.a) obj).f6934b) {
            ((TravelTicketFragment) aVar.c.get()).s1();
        } else {
            aVar.getClass();
        }
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        TravelTicketFragment travelTicketFragment = this.f2164a;
        h0.g(travelTicketFragment.getActivity(), travelTicketFragment.getString(R.string.pma_label_share_or_save), file);
    }
}
