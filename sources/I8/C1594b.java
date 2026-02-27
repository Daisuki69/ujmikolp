package i8;

import android.widget.Button;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import kotlin.jvm.internal.j;
import m8.InterfaceC1854a;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: i8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1594b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L f17124d;

    public void k() {
        InterfaceC1854a interfaceC1854a = (InterfaceC1854a) this.c.get();
        boolean z4 = ((MayaForgotPasswordEnterMinFragment) ((InterfaceC1854a) this.c.get())).f12371a0;
        Button button = ((MayaForgotPasswordEnterMinFragment) interfaceC1854a).f12369Y;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            j.n("mNextButton");
            throw null;
        }
    }
}
