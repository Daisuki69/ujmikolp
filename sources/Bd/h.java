package Bd;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.ekyc.view.widget.EDDOptionsInput;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EDDOptionsInput f428b;

    public /* synthetic */ h(EDDOptionsInput eDDOptionsInput, int i) {
        this.f427a = i;
        this.f428b = eDDOptionsInput;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f427a) {
            case 0:
                this.f428b.onClickOptions();
                break;
            default:
                this.f428b.onRemove();
                break;
        }
    }
}
