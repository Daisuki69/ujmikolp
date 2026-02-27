package Xb;

import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import java.util.List;

/* JADX INFO: renamed from: Xb.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0614c implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6564b;
    public final /* synthetic */ ShopHomeSectionCarousel c;

    public /* synthetic */ C0614c(f fVar, ShopHomeSectionCarousel shopHomeSectionCarousel, int i) {
        this.f6563a = i;
        this.f6564b = fVar;
        this.c = shopHomeSectionCarousel;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6563a) {
            case 0:
                ShopProviderBase shopProviderBase = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase, "shopProviderBase");
                List<ShopProvider> data = shopProviderBase.getData();
                if (data == null || data.isEmpty()) {
                    ((MayaShopHomePageFragment) ((bc.b) this.f6564b.c.get())).T1("Brands for you");
                } else {
                    this.c.setList(shopProviderBase.getData());
                    ((MayaShopHomePageFragment) ((bc.b) this.f6564b.c.get())).Q1(this.c);
                }
                break;
            case 1:
                ShopProviderBase shopProviderBase2 = (ShopProviderBase) obj;
                kotlin.jvm.internal.j.g(shopProviderBase2, "shopProviderBase");
                List<ShopProvider> data2 = shopProviderBase2.getData();
                if (data2 == null || data2.isEmpty()) {
                    ((MayaShopHomePageFragment) ((bc.b) this.f6564b.c.get())).T1("Load");
                } else {
                    this.c.setList(shopProviderBase2.getData());
                    ((MayaShopHomePageFragment) ((bc.b) this.f6564b.c.get())).Q1(this.c);
                }
                break;
            default:
                ProductV3Base productV3Base = (ProductV3Base) obj;
                kotlin.jvm.internal.j.g(productV3Base, "productV3Base");
                List<ProductV3> records = productV3Base.getRecords();
                if (records == null || records.isEmpty()) {
                    ((MayaShopHomePageFragment) ((bc.b) this.f6564b.c.get())).T1("Most Popular");
                } else {
                    this.c.setList(productV3Base.getRecords());
                    ((MayaShopHomePageFragment) ((bc.b) this.f6564b.c.get())).Q1(this.c);
                }
                break;
        }
    }
}
