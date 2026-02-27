package ba;

import com.paymaya.domain.model.FavoriteContentPreview;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f8630b;

    public /* synthetic */ y(C c, int i) {
        this.f8629a = i;
        this.f8630b = c;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String strTnTj78 = numX49.tnTj78("bucZV");
        switch (this.f8629a) {
            case 0:
                FavoriteDetails favoriteDetails = (FavoriteDetails) obj;
                kotlin.jvm.internal.j.g(favoriteDetails, strTnTj78);
                FavoriteContentPreview favoriteContentPreviewMContentPreview = favoriteDetails.mContentPreview();
                String strMMeta = favoriteContentPreviewMContentPreview != null ? favoriteContentPreviewMContentPreview.mMeta() : null;
                C c = this.f8630b;
                c.getClass();
                ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13426K0 = favoriteDetails;
                c.o(strMMeta);
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar, strTnTj78);
                this.f8630b.e(bVar);
                break;
        }
    }
}
