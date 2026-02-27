package zd;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl;

/* JADX INFO: renamed from: zd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2559c extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractBaseEDDFormFragmentImpl f21376b;

    public /* synthetic */ C2559c(AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl, int i) {
        this.f21375a = i;
        this.f21376b = abstractBaseEDDFormFragmentImpl;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f21375a) {
            case 0:
                this.f21376b.onChooseOneClick();
                break;
            default:
                this.f21376b.onNextClick();
                break;
        }
    }
}
