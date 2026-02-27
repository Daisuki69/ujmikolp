package y5;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.common.base.AbstractBaseReceiptFragmentImpl;

/* JADX INFO: renamed from: y5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2510b extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractBaseReceiptFragmentImpl f21060b;

    public /* synthetic */ C2510b(AbstractBaseReceiptFragmentImpl abstractBaseReceiptFragmentImpl, int i) {
        this.f21059a = i;
        this.f21060b = abstractBaseReceiptFragmentImpl;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f21059a) {
            case 0:
                this.f21060b.handleShareClick();
                break;
            case 1:
                this.f21060b.handleAdditionalButtonClick();
                break;
            default:
                this.f21060b.handleCloseClick();
                break;
        }
    }
}
