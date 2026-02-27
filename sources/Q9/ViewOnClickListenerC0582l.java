package Q9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;

/* JADX INFO: renamed from: Q9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0582l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditActivationConfirmDetailFragment f5325b;

    public /* synthetic */ ViewOnClickListenerC0582l(NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment, int i) {
        this.f5324a = i;
        this.f5325b = newMayaCreditActivationConfirmDetailFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5324a) {
            case 0:
                NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment = this.f5325b;
                Callback.onClick_enter(view);
                try {
                    L9.o oVarG1 = newMayaCreditActivationConfirmDetailFragment.G1();
                    if (S5.c.b(oVarG1.f2905g, A5.b.f78T)) {
                        oVarG1.n();
                    } else {
                        oVarG1.o();
                    }
                    return;
                } finally {
                }
            case 1:
                NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment2 = this.f5325b;
                Callback.onClick_enter(view);
                try {
                    newMayaCreditActivationConfirmDetailFragment2.G1().m();
                    return;
                } finally {
                }
            case 2:
                NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment3 = this.f5325b;
                Callback.onClick_enter(view);
                try {
                    newMayaCreditActivationConfirmDetailFragment3.G1().n();
                    return;
                } finally {
                }
            default:
                NewMayaCreditActivationConfirmDetailFragment newMayaCreditActivationConfirmDetailFragment4 = this.f5325b;
                Callback.onClick_enter(view);
                try {
                    newMayaCreditActivationConfirmDetailFragment4.G1().n();
                    return;
                } finally {
                }
        }
    }
}
