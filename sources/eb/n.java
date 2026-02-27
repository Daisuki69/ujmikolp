package eb;

import com.paymaya.mayaui.regv2.view.fragment.impl.MayaVerifyRegistrationV2Fragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaVerifyRegistrationV2Fragment f16642b;
    public final /* synthetic */ String c;

    public /* synthetic */ n(MayaVerifyRegistrationV2Fragment mayaVerifyRegistrationV2Fragment, String str, int i) {
        this.f16641a = i;
        this.f16642b = mayaVerifyRegistrationV2Fragment;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.f16641a) {
            case 0:
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bi9Pu"));
                this.f16642b.Y1(str, this.c);
                break;
            case 1:
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bi9PB"));
                String str2 = this.c;
                kotlin.jvm.internal.j.d(str2);
                this.f16642b.Y1(str, str2);
                break;
            case 2:
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bi9Pk"));
                String str3 = this.c;
                kotlin.jvm.internal.j.d(str3);
                this.f16642b.Y1(str, str3);
                break;
            case 3:
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bi9PZ"));
                this.f16642b.Y1(str, this.c);
                break;
            default:
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bi9Pr"));
                String str4 = this.c;
                kotlin.jvm.internal.j.d(str4);
                this.f16642b.Y1(str, str4);
                break;
        }
        return Unit.f18162a;
    }
}
