package de;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.qr.view.fragment.impl.MyQRFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyQRFragment f16371b;

    public /* synthetic */ l(MyQRFragment myQRFragment, int i) {
        this.f16370a = i;
        this.f16371b = myQRFragment;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f16370a) {
            case 0:
                this.f16371b.onHowRequestMoneyLinkWorksClick();
                break;
            default:
                this.f16371b.onSendRequestLinkClick();
                break;
        }
    }
}
