package F8;

import android.text.Editable;
import android.text.TextWatcher;
import bj.InterfaceC1031b;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1558a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f1559b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1560d;
    public final InterfaceC1031b e;
    public final Object f;

    public e(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15) {
        this.f1559b = function1;
        this.c = function12;
        this.f1560d = function13;
        this.e = function14;
        this.f = function15;
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
        int i = this.f1558a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        int i10 = this.f1558a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F8.e.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(G8.b bVar, KycFieldType kycFieldType, KycMayaInputLayout kycMayaInputLayout, Function1 function1, Function2 function2) {
        this.c = kycFieldType;
        this.f1560d = kycMayaInputLayout;
        this.e = (i) function2;
        this.f = bVar;
        this.f1559b = function1;
    }
}
