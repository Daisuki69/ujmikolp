package ba;

import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerDynamicField;
import com.paymaya.domain.model.BillerField;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.store.C1277p;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.Y;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends AbstractC2509a implements aa.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1277p f8621d;
    public final Q e;
    public final Y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.data.preference.a f8622g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C1277p c1277p, Q q9, Y y7, com.paymaya.data.preference.a aVar, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bucbC"));
        this.f8621d = c1277p;
        this.e = q9;
        this.f = y7;
        this.f8622g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x026a  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.u.j():void");
    }

    public final BillerTransaction k(BillerTransaction billerTransaction) {
        kotlin.jvm.internal.j.g(billerTransaction, numX49.tnTj78("bucby"));
        BillerDetails billerDetailsMBiller = ((MayaPayBillsConfirmationFragment) ((ga.d) this.c.get())).G1().mBiller();
        ImageUrlUnfiltered imageUrlUnfilteredMIconUrl = billerDetailsMBiller.mIconUrl();
        BillerMetadata billerMetadataMMetadata = billerDetailsMBiller.mMetadata();
        Object value = ((MayaPayBillsConfirmationFragment) ((ga.d) this.c.get())).f13412f0.getValue();
        kotlin.jvm.internal.j.f(value, numX49.tnTj78("bucbv"));
        Map<String, BillerField> mapMBillerFields = ((BillerInput) value).mBillerFields();
        List<BillerDynamicField> listMDynamicFields = billerTransaction.mBiller().mDynamicFields();
        ArrayList arrayList = null;
        if (listMDynamicFields != null) {
            ArrayList arrayList2 = new ArrayList();
            for (BillerDynamicField billerDynamicFieldBuild : listMDynamicFields) {
                kotlin.jvm.internal.j.d(billerDynamicFieldBuild);
                kotlin.jvm.internal.j.d(mapMBillerFields);
                BillerField billerField = mapMBillerFields.get(billerDynamicFieldBuild.mParameter());
                if (billerField == null || billerField.mIsHidden()) {
                    billerDynamicFieldBuild = null;
                } else {
                    String strMDisplayValue = billerField.mDisplayValue();
                    if (strMDisplayValue != null && !C2576A.H(strMDisplayValue)) {
                        billerDynamicFieldBuild = billerDynamicFieldBuild.toBuilder().mValue(strMDisplayValue).build();
                    }
                }
                if (billerDynamicFieldBuild != null) {
                    arrayList2.add(billerDynamicFieldBuild);
                }
            }
            arrayList = arrayList2;
        }
        BillerDetails.Builder builder = billerTransaction.mBiller().toBuilder();
        builder.mDynamicFields(arrayList);
        builder.mMetadata(billerMetadataMMetadata);
        builder.mIconUrl(imageUrlUnfilteredMIconUrl);
        if (this.f8622g.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
            builder.mName(billerDetailsMBiller.mName());
        }
        BillerTransaction billerTransactionBuild = billerTransaction.toBuilder().mBiller(builder.build()).build();
        kotlin.jvm.internal.j.f(billerTransactionBuild, numX49.tnTj78("bucb7"));
        return billerTransactionBuild;
    }

    public final boolean l() {
        String str;
        String str2;
        return this.f8622g.e().isMayaBillerReminderEnabled() && !this.h && (str = (String) ((MayaPayBillsConfirmationFragment) ((ga.d) this.c.get())).f13415i0.getValue()) != null && (C2576A.H(str) ^ true) && (str2 = (String) ((MayaPayBillsConfirmationFragment) ((ga.d) this.c.get())).f13416j0.getValue()) != null && (C2576A.H(str2) ^ true);
    }
}
