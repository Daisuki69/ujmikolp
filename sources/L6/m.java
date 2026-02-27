package L6;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCashInCodeFragment f2839b;

    public /* synthetic */ m(MayaCashInCodeFragment mayaCashInCodeFragment, int i) {
        this.f2838a = i;
        this.f2839b = mayaCashInCodeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2838a) {
            case 0:
                MayaCashInCodeFragment mayaCashInCodeFragment = this.f2839b;
                Callback.onClick_enter(view);
                try {
                    mayaCashInCodeFragment.G1().n("Close");
                    mayaCashInCodeFragment.H1();
                    return;
                } finally {
                }
            case 1:
                MayaCashInCodeFragment mayaCashInCodeFragment2 = this.f2839b;
                Callback.onClick_enter(view);
                try {
                    n nVar = ((MayaCashInCodeFragment) ((K6.g) mayaCashInCodeFragment2.G1().c.get())).f11680p0;
                    if (nVar != null) {
                        MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) nVar;
                        mayaCashInActivity.n1().k0(mayaCashInActivity, "https://smartpadala.ph/find-a-smart-padala-agent/");
                    }
                    return;
                } finally {
                }
            case 2:
                MayaCashInCodeFragment mayaCashInCodeFragment3 = this.f2839b;
                Callback.onClick_enter(view);
                try {
                    G6.m mVarG1 = mayaCashInCodeFragment3.G1();
                    String string = mayaCashInCodeFragment3.getString(R.string.maya_label_edit_amount);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    mVarG1.n(string);
                    n nVar2 = mayaCashInCodeFragment3.f11680p0;
                    if (nVar2 != null) {
                        ((MayaCashInActivity) nVar2).getSupportFragmentManager().popBackStack();
                    }
                    return;
                } finally {
                }
            default:
                MayaCashInCodeFragment mayaCashInCodeFragment4 = this.f2839b;
                Callback.onClick_enter(view);
                try {
                    mayaCashInCodeFragment4.G1().k();
                    return;
                } finally {
                }
        }
    }
}
