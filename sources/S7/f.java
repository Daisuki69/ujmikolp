package S7;

import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Registration;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public interface f extends y5.g {
    void B0(float f);

    void a(PayMayaError payMayaError, String str);

    void finish();

    OngoingRegistration j0();

    void l0(PayMayaError payMayaError, Function1 function1, Function1 function12);

    void m0();

    void t(String str, String str2);

    void u0(ArrayList arrayList);

    void v(PayMayaError payMayaError, Function1 function1);

    void z(Registration registration);
}
