package La;

import android.view.View;
import com.paymaya.mayaui.dataprivacy.view.activity.impl.MayaDataPrivacyActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f2940b;

    public /* synthetic */ a(int i, Function0 function0) {
        this.f2939a = i;
        this.f2940b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strTnTj78 = numX49.tnTj78("bZOP");
        Function0 function0 = this.f2940b;
        switch (this.f2939a) {
            case 0:
                int i = MayaQRActivity.f13569r;
                j.g((View) obj, strTnTj78);
                function0.invoke();
                return Unit.f18162a;
            case 1:
                int i4 = MayaQRActivity.f13569r;
                j.g((View) obj, strTnTj78);
                function0.invoke();
                return Unit.f18162a;
            case 2:
                int i6 = MayaDataPrivacyActivity.f12260s;
                j.g((View) obj, strTnTj78);
                function0.invoke();
                return Unit.f18162a;
            case 3:
                int i10 = MayaRegistrationV2Activity.f13663v;
                j.g((View) obj, strTnTj78);
                function0.invoke();
                return Unit.f18162a;
            case 4:
                int i11 = MayaRegistrationActivity.f12730r;
                j.g((View) obj, strTnTj78);
                function0.invoke();
                return Unit.f18162a;
            case 5:
                function0.invoke();
                return Unit.f18162a;
            case 6:
                function0.invoke();
                return Unit.f18162a;
            default:
                j.g(obj, strTnTj78);
                return function0.invoke();
        }
    }
}
