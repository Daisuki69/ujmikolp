package M8;

import android.text.Editable;
import android.text.TextWatcher;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycCompletePersonalInformationFragment f3211b;
    public final /* synthetic */ MayaInputLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i f3212d;
    public final /* synthetic */ KycFieldType e;

    /* JADX WARN: Multi-variable type inference failed */
    public Q(MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment, MayaInputLayout mayaInputLayout, Function2 function2, KycFieldType kycFieldType, int i) {
        this.f3210a = i;
        switch (i) {
            case 1:
                this.f3211b = mayaKycCompletePersonalInformationFragment;
                this.c = mayaInputLayout;
                this.f3212d = (kotlin.jvm.internal.i) function2;
                this.e = kycFieldType;
                break;
            default:
                this.f3211b = mayaKycCompletePersonalInformationFragment;
                this.c = mayaInputLayout;
                this.f3212d = (kotlin.jvm.internal.i) function2;
                this.e = kycFieldType;
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void d(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f3210a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        int i10 = this.f3210a;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        switch (this.f3210a) {
            case 0:
                if (charSequence != null && charSequence.length() > 0) {
                    KycValidationResult kycValidationResult = (KycValidationResult) this.f3212d.invoke(this.e, charSequence.toString());
                    this.f3211b.Y2(this.c, kycValidationResult);
                    break;
                }
                break;
            default:
                if (charSequence != null && charSequence.length() > 0) {
                    KycValidationResult kycValidationResult2 = (KycValidationResult) this.f3212d.invoke(this.e, charSequence.toString());
                    this.f3211b.Y2(this.c, kycValidationResult2);
                    break;
                }
                break;
        }
    }
}
