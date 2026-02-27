package S7;

import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1229s;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyDataPersonalizationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDataPrivacyDataPersonalizationFragment f5680b;
    public final /* synthetic */ String c;

    public /* synthetic */ e(MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment, String str, int i) {
        this.f5679a = i;
        this.f5680b = mayaDataPrivacyDataPersonalizationFragment;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5679a) {
            case 0:
                String label = (String) obj;
                kotlin.jvm.internal.j.g(label, "label");
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment = this.f5680b;
                C1229s c1229sG1 = mayaDataPrivacyDataPersonalizationFragment.G1();
                FragmentActivity fragmentActivityRequireActivity = mayaDataPrivacyDataPersonalizationFragment.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                String strB = AbstractC1213b.b(3);
                kotlin.jvm.internal.j.f(strB, "errorTapped(...)");
                C1229s.c(c1229sG1, fragmentActivityRequireActivity, strB, "Reg Submit Error (Dialog)", "Login Page", label, null, this.c, null, 160);
                break;
            case 1:
                String label2 = (String) obj;
                kotlin.jvm.internal.j.g(label2, "label");
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment2 = this.f5680b;
                C1229s c1229sG12 = mayaDataPrivacyDataPersonalizationFragment2.G1();
                FragmentActivity fragmentActivityRequireActivity2 = mayaDataPrivacyDataPersonalizationFragment2.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
                String strB2 = AbstractC1213b.b(3);
                kotlin.jvm.internal.j.f(strB2, "errorTapped(...)");
                C1229s.c(c1229sG12, fragmentActivityRequireActivity2, strB2, "Reg Submit Error (Dialog)", "Data personalization", label2, null, this.c, null, 160);
                break;
            default:
                String label3 = (String) obj;
                kotlin.jvm.internal.j.g(label3, "label");
                MayaDataPrivacyDataPersonalizationFragment mayaDataPrivacyDataPersonalizationFragment3 = this.f5680b;
                C1229s c1229sG13 = mayaDataPrivacyDataPersonalizationFragment3.G1();
                FragmentActivity fragmentActivityRequireActivity3 = mayaDataPrivacyDataPersonalizationFragment3.requireActivity();
                kotlin.jvm.internal.j.f(fragmentActivityRequireActivity3, "requireActivity(...)");
                String strB3 = AbstractC1213b.b(3);
                kotlin.jvm.internal.j.f(strB3, "errorTapped(...)");
                C1229s.c(c1229sG13, fragmentActivityRequireActivity3, strB3, "Reg Submit Error (Dialog)", "Data personalization", label3, null, this.c, null, 160);
                break;
        }
        return Unit.f18162a;
    }
}
