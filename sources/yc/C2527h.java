package yc;

import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: yc.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2527h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaUnderWritingRequirementsFragment f21116b;
    public final /* synthetic */ MayaProfileInputLayout c;

    public /* synthetic */ C2527h(MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment, MayaProfileInputLayout mayaProfileInputLayout, int i) {
        this.f21115a = i;
        this.f21116b = mayaUnderWritingRequirementsFragment;
        this.c = mayaProfileInputLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = this.f21116b;
        MayaProfileInputLayout mayaProfileInputLayout = this.c;
        switch (this.f21115a) {
            case 0:
                List list = MayaUnderWritingRequirementsFragment.f14251d0;
                kotlin.jvm.internal.j.d(mayaProfileInputLayout);
                mayaUnderWritingRequirementsFragment.R1(mayaProfileInputLayout);
                break;
            case 1:
                List list2 = MayaUnderWritingRequirementsFragment.f14251d0;
                mayaUnderWritingRequirementsFragment.f2(false);
                com.paymaya.common.utility.C.Q(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout);
                break;
            case 2:
                List list3 = MayaUnderWritingRequirementsFragment.f14251d0;
                kotlin.jvm.internal.j.d(mayaProfileInputLayout);
                mayaUnderWritingRequirementsFragment.R1(mayaProfileInputLayout);
                break;
            default:
                List list4 = MayaUnderWritingRequirementsFragment.f14251d0;
                kotlin.jvm.internal.j.d(mayaProfileInputLayout);
                mayaUnderWritingRequirementsFragment.R1(mayaProfileInputLayout);
                break;
        }
        return Unit.f18162a;
    }
}
