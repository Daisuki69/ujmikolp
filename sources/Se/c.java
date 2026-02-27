package se;

import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20055b;
    public final /* synthetic */ ShopHomeSectionCarousel c;

    public /* synthetic */ c(e eVar, ShopHomeSectionCarousel shopHomeSectionCarousel, int i) {
        this.f20054a = i;
        this.f20055b = eVar;
        this.c = shopHomeSectionCarousel;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f20054a) {
            case 0:
                ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase, numX49.tnTj78("bF3X"));
                List<ShopProvider> data = shopProviderBase.getData();
                if (data == null || data.isEmpty()) {
                    ((ShopV3HomePageFragment) ((ve.c) this.f20055b.c.get())).C1(numX49.tnTj78("bF3G"));
                } else {
                    this.c.setList(shopProviderBase.getData());
                    ((ShopV3HomePageFragment) ((ve.c) this.f20055b.c.get())).A1(this.c);
                }
                break;
            case 1:
                ShopProviderBase shopProviderBase2 = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase2, numX49.tnTj78("bF36"));
                List<ShopProvider> data2 = shopProviderBase2.getData();
                if (data2 == null || data2.isEmpty()) {
                    ((ShopV3HomePageFragment) ((ve.c) this.f20055b.c.get())).C1(numX49.tnTj78("bF3a"));
                } else {
                    this.c.setList(shopProviderBase2.getData());
                    ((ShopV3HomePageFragment) ((ve.c) this.f20055b.c.get())).A1(this.c);
                }
                break;
            default:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, numX49.tnTj78("bF3M"));
                List<ProductV3> records = productV3Base.getRecords();
                if (records == null || records.isEmpty()) {
                    ((ShopV3HomePageFragment) ((ve.c) this.f20055b.c.get())).C1(numX49.tnTj78("bF3N"));
                } else {
                    this.c.setList(productV3Base.getRecords());
                    ((ShopV3HomePageFragment) ((ve.c) this.f20055b.c.get())).A1(this.c);
                }
                break;
        }
    }
}
