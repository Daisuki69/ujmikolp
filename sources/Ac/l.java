package ac;

import com.paymaya.domain.model.ShopHomeSectionItem;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopHomeSectionItem f7103b;

    public /* synthetic */ l(ShopHomeSectionItem shopHomeSectionItem, int i) {
        this.f7102a = i;
        this.f7103b = shopHomeSectionItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ShopHomeSectionItem shopHomeSectionItem = (ShopHomeSectionItem) obj;
        switch (this.f7102a) {
            case 0:
                kotlin.jvm.internal.j.g(shopHomeSectionItem, numX49.tnTj78("buOPH"));
                break;
            default:
                kotlin.jvm.internal.j.g(shopHomeSectionItem, numX49.tnTj78("buOPF"));
                break;
        }
        return Boolean.valueOf(kotlin.jvm.internal.j.b(shopHomeSectionItem.getName(), this.f7103b.getName()));
    }
}
