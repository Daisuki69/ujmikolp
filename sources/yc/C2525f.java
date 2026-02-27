package yc;

import N5.R0;
import android.os.Bundle;
import bg.AbstractC0983W;
import com.paymaya.domain.model.ContactReferenceLearnMore;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileLearnMoreBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileUpdateSingleSelectionBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDAccountUsageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;
import wc.InterfaceC2393d;

/* JADX INFO: renamed from: yc.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2525f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21112b;

    public /* synthetic */ C2525f(Object obj, int i) {
        this.f21111a = i;
        this.f21112b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        switch (this.f21111a) {
            case 0:
                Bundle arguments = ((MayaProfileLearnMoreBottomSheetDialogFragment) this.f21112b).getArguments();
                if (arguments != null) {
                    return (ContactReferenceLearnMore) arguments.getParcelable("LEARN_MORE_ARG", ContactReferenceLearnMore.class);
                }
                return null;
            case 1:
                Bundle arguments2 = ((MayaProfileUpdateSingleSelectionBottomSheetDialogFragment) this.f21112b).getArguments();
                if (arguments2 != null) {
                    return (UpdateProfileSelectionModel) arguments2.getParcelable(numX49.tnTj78("bt9PI"));
                }
                return null;
            case 2:
                List list = MayaUnderWritingRequirementsFragment.f14251d0;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = (MayaUnderWritingRequirementsFragment) this.f21112b;
                R0 r02 = (R0) mayaUnderWritingRequirementsFragment.G1();
                String strTnTj78 = numX49.tnTj78("bt9PJ");
                MayaProfileInputLayout mayaProfileInputLayout = r02.f;
                kotlin.jvm.internal.j.f(mayaProfileInputLayout, strTnTj78);
                mayaUnderWritingRequirementsFragment.R1(mayaProfileInputLayout);
                return Unit.f18162a;
            case 3:
                rc.i iVar = (rc.i) ((MayaUserContactReferenceFragment) this.f21112b).Z1();
                MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) ((InterfaceC2393d) iVar.c.get());
                mayaUserContactReferenceFragment.getClass();
                try {
                    AbstractC1955a.l(mayaUserContactReferenceFragment).e(zh.b.a()).g(new Gh.e(0, new Gh.f(new rc.h(iVar, i), Eh.d.f1366d), new rc.g(iVar, i)));
                    return Unit.f18162a;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    E1.c.k(th2);
                    NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("bt9P5"));
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
            case 4:
                return this.f21112b;
            default:
                return Boolean.valueOf(((EDDAccountUsageFragment) this.f21112b).f14516V);
        }
    }
}
