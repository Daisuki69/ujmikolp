package dc;

import Kh.T;
import N5.C0450f;
import Xb.C0613b;
import Xb.C0615d;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import cj.r;
import com.paymaya.domain.model.ShopHomeErrorRefreshCard;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionTemplate;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import java.util.Iterator;

/* JADX INFO: renamed from: dc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1354e extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.n f16312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T3.l f16313b;
    public ShopHomeErrorRefreshCard c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16314d;

    public C1354e(C0450f c0450f, ac.n nVar) {
        super((CardView) c0450f.c);
        this.f16312a = nVar;
        this.f16314d = (TextView) c0450f.f4088d;
        Button button = (Button) c0450f.f4087b;
        this.f16313b = new T3.l(this);
        button.setOnClickListener(new Y6.o(this, 16));
    }

    public static final void D(C1354e c1354e) {
        ac.n nVar = c1354e.f16312a;
        if (nVar != null) {
            ShopHomeErrorRefreshCard shopHomeErrorRefreshCard = c1354e.c;
            Object obj = null;
            String refreshTarget = shopHomeErrorRefreshCard != null ? shopHomeErrorRefreshCard.getRefreshTarget() : null;
            Xb.f fVar = (Xb.f) ((MayaShopHomePageFragment) nVar).R1();
            Iterator it = fVar.m().iterator();
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
                ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).Q1(new ShopHomeSectionCarousel(shopHomeSectionTemplate.getName(), shopHomeSectionTemplate.getListType(), shopHomeSectionTemplate.getPosition(), fVar.l(refreshTarget), 5, null));
                ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).L1();
                MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) ((bc.b) fVar.c.get());
                mayaShopHomePageFragment.getClass();
                mayaShopHomePageFragment.u0.add("Buy Again");
                mayaShopHomePageFragment.V1();
                fVar.e(new T(5, new Lh.d(new Lh.h(fVar.k(r.c(shopHomeSectionTemplate)), zh.b.a(), 0), new C0615d(fVar, 1), 0), new C0613b(fVar, 3)).e());
            }
        }
    }
}
