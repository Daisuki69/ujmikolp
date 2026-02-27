package J7;

import com.paymaya.domain.model.ServicesFeatureCategoryDetails;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServicesFeatureCategoryDetails f2445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ServicesFeatureCategoryDetails categoryItem) {
        super(1);
        kotlin.jvm.internal.j.g(categoryItem, "categoryItem");
        this.f2445b = categoryItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.j.b(this.f2445b, ((g) obj).f2445b);
    }

    public final int hashCode() {
        return this.f2445b.hashCode();
    }

    public final String toString() {
        return "CategoryItem(categoryItem=" + this.f2445b + ")";
    }
}
