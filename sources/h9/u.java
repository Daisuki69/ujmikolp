package h9;

import com.paymaya.mayaui.login.view.fragment.impl.MayaVerifyRegistrationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaVerifyRegistrationFragment f16966b;
    public final /* synthetic */ String c;

    public /* synthetic */ u(MayaVerifyRegistrationFragment mayaVerifyRegistrationFragment, String str, int i) {
        this.f16965a = i;
        this.f16966b = mayaVerifyRegistrationFragment;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String label = (String) obj;
        switch (this.f16965a) {
            case 0:
                kotlin.jvm.internal.j.g(label, "label");
                this.f16966b.X1(label, this.c);
                break;
            case 1:
                kotlin.jvm.internal.j.g(label, "label");
                String str = this.c;
                kotlin.jvm.internal.j.d(str);
                this.f16966b.X1(label, str);
                break;
            case 2:
                kotlin.jvm.internal.j.g(label, "label");
                String str2 = this.c;
                kotlin.jvm.internal.j.d(str2);
                this.f16966b.X1(label, str2);
                break;
            case 3:
                kotlin.jvm.internal.j.g(label, "label");
                String str3 = this.c;
                kotlin.jvm.internal.j.d(str3);
                this.f16966b.X1(label, str3);
                break;
            default:
                kotlin.jvm.internal.j.g(label, "label");
                this.f16966b.X1(label, this.c);
                break;
        }
        return Unit.f18162a;
    }
}
