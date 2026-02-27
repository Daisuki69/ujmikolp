package qc;

import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import sc.C2251b;

/* JADX INFO: renamed from: qc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2169a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19766b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C2169a(Function1 function1) {
        this.f19765a = 0;
        this.f19766b = (i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r1 = this.f19766b;
        switch (this.f19765a) {
            case 0:
                MayaUpdateProfileData userProfileData = (MayaUpdateProfileData) obj;
                j.g(userProfileData, "userProfileData");
                r1.invoke(userProfileData);
                return Unit.f18162a;
            case 1:
                MayaDropDown dropDown = (MayaDropDown) obj;
                j.g(dropDown, "dropDown");
                Object tag = dropDown.getTag();
                FieldType fieldType = tag instanceof FieldType ? (FieldType) tag : null;
                if (fieldType == null) {
                    return null;
                }
                ValidationResult validationResult = (ValidationResult) r1.invoke(fieldType, dropDown.getSelectedData());
                Pair pair = new Pair(dropDown, validationResult);
                if (validationResult instanceof ValidationResult.Success) {
                    return null;
                }
                return pair;
            default:
                MayaProfileInputLayout layout = (MayaProfileInputLayout) obj;
                j.g(layout, "layout");
                Object tag2 = layout.getTag();
                FieldType fieldType2 = tag2 instanceof FieldType ? (FieldType) tag2 : null;
                if (fieldType2 == null) {
                    return null;
                }
                String strP = jk.b.p(layout);
                C2251b c2251b = C2251b.f20034a;
                return new Pair(layout, (ValidationResult) r1.invoke(fieldType2, C2251b.b(fieldType2, strP)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C2169a(Function2 function2, int i) {
        this.f19765a = i;
        this.f19766b = (i) function2;
    }
}
