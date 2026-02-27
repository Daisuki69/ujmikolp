package L6;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCashInWebFragment f2817b;

    public /* synthetic */ A(MayaCashInWebFragment mayaCashInWebFragment, int i) {
        this.f2816a = i;
        this.f2817b = mayaCashInWebFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2816a) {
            case 0:
                MayaCashInWebFragment mayaCashInWebFragment = this.f2817b;
                Callback.onClick_enter(view);
                try {
                    mayaCashInWebFragment.O1();
                    mayaCashInWebFragment.Q1().l(mayaCashInWebFragment.f11761v0, com.paymaya.common.utility.C.W(mayaCashInWebFragment.getActivity()));
                    return;
                } finally {
                }
            default:
                MayaCashInWebFragment mayaCashInWebFragment2 = this.f2817b;
                Callback.onClick_enter(view);
                try {
                    mayaCashInWebFragment2.O1();
                    mayaCashInWebFragment2.Q1().l(mayaCashInWebFragment2.f11761v0, com.paymaya.common.utility.C.W(mayaCashInWebFragment2.getActivity()));
                    return;
                } finally {
                }
        }
    }
}
