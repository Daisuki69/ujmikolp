package Q9;

import android.text.Editable;
import android.text.TextWatcher;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L9.q f5333b;

    public /* synthetic */ r(L9.q qVar, int i) {
        this.f5332a = i;
        this.f5333b = qVar;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void f(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void g(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void h(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f5332a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        int i10 = this.f5332a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        J9.a aVar;
        J9.a aVar2;
        switch (this.f5332a) {
            case 0:
                String strValueOf = String.valueOf(charSequence);
                L9.q qVar = this.f5333b;
                CreditReviewUiModel creditReviewUiModel = qVar.e;
                if (creditReviewUiModel != null && (aVar = creditReviewUiModel.f13060l) != null) {
                    aVar.f2485a = strValueOf;
                }
                qVar.k();
                break;
            case 1:
                String strValueOf2 = String.valueOf(charSequence);
                L9.q qVar2 = this.f5333b;
                CreditReviewUiModel creditReviewUiModel2 = qVar2.e;
                if (creditReviewUiModel2 != null && (aVar2 = creditReviewUiModel2.f13060l) != null) {
                    aVar2.f2486b = strValueOf2;
                }
                qVar2.k();
                break;
            case 2:
                this.f5333b.k();
                break;
            default:
                this.f5333b.k();
                break;
        }
    }
}
