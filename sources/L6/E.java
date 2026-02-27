package L6;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaVaultedCardsFragment f2823b;

    public /* synthetic */ E(MayaVaultedCardsFragment mayaVaultedCardsFragment, int i) {
        this.f2822a = i;
        this.f2823b = mayaVaultedCardsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2822a) {
            case 0:
                MayaVaultedCardsFragment mayaVaultedCardsFragment = this.f2823b;
                Callback.onClick_enter(view);
                try {
                    MayaVaultedCardsFragment.R1(mayaVaultedCardsFragment);
                    return;
                } finally {
                }
            default:
                MayaVaultedCardsFragment mayaVaultedCardsFragment2 = this.f2823b;
                Callback.onClick_enter(view);
                try {
                    mayaVaultedCardsFragment2.P1().o();
                    return;
                } finally {
                }
        }
    }
}
