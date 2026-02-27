package ac;

import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.domain.model.ValidationField;
import com.paymaya.domain.model.ValidationRule;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7105b;

    public /* synthetic */ m(String str, int i) {
        this.f7104a = i;
        this.f7105b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7104a) {
            case 0:
                ShopHomeSectionItem shopHomeSectionItem = (ShopHomeSectionItem) obj;
                kotlin.jvm.internal.j.g(shopHomeSectionItem, numX49.tnTj78("buOr"));
                return Boolean.valueOf(kotlin.jvm.internal.j.b(shopHomeSectionItem.getName(), this.f7105b));
            case 1:
                SecondaryFeature secondaryFeature = (SecondaryFeature) obj;
                kotlin.jvm.internal.j.g(secondaryFeature, numX49.tnTj78("buOL"));
                return Boolean.valueOf(kotlin.jvm.internal.j.b(secondaryFeature.mId(), this.f7105b));
            case 2:
                SecondaryFeature secondaryFeature2 = (SecondaryFeature) obj;
                kotlin.jvm.internal.j.g(secondaryFeature2, numX49.tnTj78("buO2"));
                return Boolean.valueOf(kotlin.jvm.internal.j.b(secondaryFeature2.mId(), this.f7105b));
            case 3:
                ValidationRule validationRule = (ValidationRule) obj;
                kotlin.jvm.internal.j.g(validationRule, numX49.tnTj78("buOb"));
                List<ValidationField> validationFields = validationRule.getValidationFields();
                Object obj2 = null;
                if (validationFields != null) {
                    Iterator<T> it = validationFields.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (kotlin.jvm.internal.j.b(((ValidationField) next).getName(), this.f7105b)) {
                                obj2 = next;
                            }
                        }
                    }
                    obj2 = (ValidationField) obj2;
                }
                return Boolean.valueOf(obj2 != null);
            case 4:
                ShopHomeSectionItem shopHomeSectionItem2 = (ShopHomeSectionItem) obj;
                kotlin.jvm.internal.j.g(shopHomeSectionItem2, numX49.tnTj78("buOP"));
                return Boolean.valueOf(kotlin.jvm.internal.j.b(shopHomeSectionItem2.getName(), this.f7105b));
            default:
                return Boolean.valueOf(JsonAttributeSanitationKt.trimFields$lambda$10(this.f7105b, (String) obj));
        }
    }
}
