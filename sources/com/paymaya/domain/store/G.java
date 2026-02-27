package com.paymaya.domain.store;

import android.view.View;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import defpackage.Location;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class G implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11350b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11351d;

    public /* synthetic */ G(int i, Object obj, Object obj2, Object obj3) {
        this.f11349a = i;
        this.f11350b = obj;
        this.c = obj2;
        this.f11351d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1219h c1219hE;
        Object obj3 = this.f11351d;
        Object obj4 = this.c;
        Object obj5 = this.f11350b;
        switch (this.f11349a) {
            case 0:
                R4.a aVar = (R4.a) obj2;
                K k8 = (K) obj5;
                k8.getClass();
                ((C5.a) obj4).f("raven_get_location");
                ((Function2) obj3).invoke((Location) obj, aVar);
                if (aVar != null) {
                    c1219hE = C1219h.e("DEVICE_EXTRACTION_FAILURE");
                    c1219hE.g("extractor", "location");
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.j.put(Constants.REASON, aVar.f5455a);
                } else {
                    c1219hE = C1219h.e("DEVICE_EXTRACTION_SUCCESS");
                    c1219hE.g("extractor", "location");
                }
                k8.f11363b.b(c1219hE);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                List list = MayaUserProfileUpdateFragment.f14261f0;
                kotlin.jvm.internal.j.g((View) obj, "<unused var>");
                if (zBooleanValue) {
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) obj5;
                    mayaUserProfileUpdateFragment.u2(true);
                    mayaUserProfileUpdateFragment.i2().setText((String) obj4);
                    MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) obj3;
                    com.paymaya.common.utility.C.u0(mayaUserProfileUpdateFragment.getActivity(), mayaProfileInputLayout);
                    Object tag = mayaProfileInputLayout.getTag();
                    kotlin.jvm.internal.j.e(tag, "null cannot be cast to non-null type com.paymaya.domain.model.UpdateProfileFieldType");
                    mayaUserProfileUpdateFragment.j2(mayaProfileInputLayout, (UpdateProfileFieldType) tag, new yc.s(2, mayaUserProfileUpdateFragment.h2(), oc.d.class, "validateField", "validateField(Lcom/paymaya/domain/model/UpdateProfileFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/UpdateProfileValidationResult;", 0, 6), jk.b.p(mayaProfileInputLayout));
                }
                break;
        }
        return Unit.f18162a;
    }
}
