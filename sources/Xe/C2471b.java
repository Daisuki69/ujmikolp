package xe;

import Kh.T;
import N5.C0450f;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import cj.r;
import com.paymaya.domain.model.ShopHomeErrorRefreshCard;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionTemplate;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import java.util.Iterator;
import se.C2256b;

/* JADX INFO: renamed from: xe.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2471b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.m f20939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.c f20940b;
    public ShopHomeErrorRefreshCard c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20941d;

    public C2471b(C0450f c0450f, ue.m mVar) {
        super((CardView) c0450f.c);
        this.f20939a = mVar;
        this.f20941d = (TextView) c0450f.f4088d;
        Button button = (Button) c0450f.f4087b;
        this.f20940b = new qc.c(this, 6);
        button.setOnClickListener(new qf.d(this, 15));
    }

    public static final void D(C2471b c2471b) {
        ue.m mVar = c2471b.f20939a;
        if (mVar != null) {
            ShopHomeErrorRefreshCard shopHomeErrorRefreshCard = c2471b.c;
            Object obj = null;
            String refreshTarget = shopHomeErrorRefreshCard != null ? shopHomeErrorRefreshCard.getRefreshTarget() : null;
            se.e eVar = (se.e) ((ShopV3HomePageFragment) mVar).B1();
            Iterator it = eVar.m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next).getName(), refreshTarget)) {
                    obj = next;
                    break;
                }
            }
            ShopHomeSectionTemplate shopHomeSectionTemplate = (ShopHomeSectionTemplate) obj;
            if (shopHomeSectionTemplate != null && kotlin.jvm.internal.j.b(refreshTarget, "Buy Again")) {
                ((ShopV3HomePageFragment) ((ve.c) eVar.c.get())).A1(new ShopHomeSectionCarousel(shopHomeSectionTemplate.getName(), shopHomeSectionTemplate.getListType(), shopHomeSectionTemplate.getPosition(), eVar.l(refreshTarget), 5, null));
                ((ShopV3HomePageFragment) ((ve.c) eVar.c.get())).w1();
                ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) ((ve.c) eVar.c.get());
                shopV3HomePageFragment.getClass();
                shopV3HomePageFragment.f14798g0.add("Buy Again");
                shopV3HomePageFragment.D1();
                eVar.e(new T(5, new Lh.h(eVar.k(r.c(shopHomeSectionTemplate)), zh.b.a(), 0), new C2256b(eVar, 2)).e());
            }
        }
    }
}
