package S7;

import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDataPrivacyPolicyFragment f5684b;

    public /* synthetic */ h(MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment, int i) {
        this.f5683a = i;
        this.f5684b = mayaDataPrivacyPolicyFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5683a) {
            case 0:
                this.f5684b.G1().n("purpose_terms_and_conditions");
                break;
            case 1:
                this.f5684b.G1().m("purpose_terms_and_conditions");
                break;
            case 2:
                this.f5684b.G1().n("purpose_privacy_policy");
                break;
            default:
                this.f5684b.G1().m("purpose_privacy_policy");
                break;
        }
        return Unit.f18162a;
    }
}
