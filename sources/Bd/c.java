package Bd;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends DebouncingOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EDDInputFinancialDocument f420b;

    public /* synthetic */ c(EDDInputFinancialDocument eDDInputFinancialDocument, int i) {
        this.f419a = i;
        this.f420b = eDDInputFinancialDocument;
    }

    @Override // butterknife.internal.DebouncingOnClickListener
    public final void doClick(View view) {
        switch (this.f419a) {
            case 0:
                this.f420b.onChooseClick();
                break;
            case 1:
                this.f420b.onRemove();
                break;
            case 2:
                this.f420b.onTakePhoto();
                break;
            case 3:
                this.f420b.onTakePhoto();
                break;
            case 4:
                this.f420b.onTakePhoto();
                break;
            default:
                this.f420b.onTakePhoto();
                break;
        }
    }
}
