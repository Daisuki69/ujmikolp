package de;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneySuccessFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RequestMoneySuccessFragment f16382b;

    public /* synthetic */ v(RequestMoneySuccessFragment requestMoneySuccessFragment, int i) {
        this.f16381a = i;
        this.f16382b = requestMoneySuccessFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f16381a) {
            case 0:
                this.f16382b.onShareClick();
                break;
            default:
                this.f16382b.onBackToHomeClick();
                break;
        }
    }
}
