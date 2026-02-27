package M8;

import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class D1 implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D1 f3151a = new D1();

    public static final void a(MayaInputLayout mayaInputLayout) {
        mayaInputLayout.getInputEditText().setText("");
        mayaInputLayout.f();
    }

    public static final H8.b b(Fragment fragment) {
        KeyEventDispatcher.Component componentRequireActivity = fragment.requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return (H8.b) componentRequireActivity;
    }

    public static final void c(Fragment fragment, Function0 function0) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            com.paymaya.common.utility.C.Q(activity, activity.getCurrentFocus());
            activity.getWindow().getDecorView().post(new E8.l(function0, 6));
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        kotlin.jvm.internal.j.g(it, "it");
    }
}
