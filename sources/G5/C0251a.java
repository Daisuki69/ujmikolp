package G5;

import Kh.C0300e;
import L9.I;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import java.util.List;
import zj.C2576A;

/* JADX INFO: renamed from: G5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0251a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1726b;
    public Object c;

    public /* synthetic */ C0251a() {
        this.f1725a = 2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void g(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void h(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void i(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void j(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void k(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void l(CharSequence charSequence, int i, int i4, int i6) {
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f3  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r14) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.C0251a.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        switch (this.f1725a) {
            case 0:
                this.c = String.valueOf(charSequence);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            default:
                ((MayaPayBillsSearchFragment) this.f1726b).f13489l0 = String.valueOf(charSequence);
                break;
        }
    }

    public String m(String str) {
        if (str.length() <= 2 || !str.startsWith("09")) {
            return "+63".concat(str);
        }
        return "+63" + str.substring(1);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        String string;
        String string2;
        switch (this.f1725a) {
            case 0:
            case 1:
                return;
            case 2:
                if (!m(charSequence.toString()).matches("^((\\+?63)|0)?[0-9]{10}$")) {
                    MayaChangeMinFormFragment mayaChangeMinFormFragment = (MayaChangeMinFormFragment) ((R4.i) this.f1726b).f5470b;
                    String string3 = mayaChangeMinFormFragment.getString(R.string.maya_error_change_min_invalid_mobile_number);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    mayaChangeMinFormFragment.J1(string3);
                    mayaChangeMinFormFragment.I1(false);
                    return;
                }
                if (m(charSequence.toString()).equals((String) this.c)) {
                    MayaChangeMinFormFragment mayaChangeMinFormFragment2 = (MayaChangeMinFormFragment) ((R4.i) this.f1726b).f5470b;
                    String string4 = mayaChangeMinFormFragment2.getString(R.string.maya_error_change_min_reused_current_mobile_number);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    mayaChangeMinFormFragment2.J1(string4);
                    mayaChangeMinFormFragment2.I1(false);
                    return;
                }
                R4.i iVar = (R4.i) this.f1726b;
                MayaChangeMinFormFragment mayaChangeMinFormFragment3 = (MayaChangeMinFormFragment) iVar.f5470b;
                TextView textView = mayaChangeMinFormFragment3.f13933W;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewNewMobileNumberError");
                    throw null;
                }
                textView.setText("");
                TextView textView2 = mayaChangeMinFormFragment3.f13933W;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTextViewNewMobileNumberError");
                    throw null;
                }
                textView2.setVisibility(8);
                MayaInputLayout mayaInputLayout = mayaChangeMinFormFragment3.f13932V;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
                    throw null;
                }
                mayaInputLayout.h();
                MayaInputLayout mayaInputLayout2 = mayaChangeMinFormFragment3.f13932V;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
                    throw null;
                }
                mayaInputLayout2.f();
                Lb.b bVar = (Lb.b) ((MayaChangeMinFormFragment) iVar.f5470b).G1();
                Rb.c cVar = (Rb.c) bVar.c.get();
                if (((MayaChangeMinFormFragment) ((Rb.c) bVar.c.get())).f13932V != null) {
                    ((MayaChangeMinFormFragment) cVar).I1(!C2576A.H(C2576A.b0(String.valueOf(r3.getInputEditText().getText())).toString()));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
                    throw null;
                }
            case 3:
                ((I) this.f1726b).o(String.valueOf(charSequence));
                ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) this.c).G1().l();
                return;
            case 4:
                ((MayaShopProviderProductsListSearchFragment) this.f1726b).f14095j0 = String.valueOf(charSequence);
                ((C0300e) this.c).onNext(String.valueOf(charSequence));
                return;
            case 5:
                ((MayaShopSearchFragment) this.f1726b).f14173l0 = String.valueOf(charSequence);
                ((C0300e) this.c).onNext(String.valueOf(charSequence));
                return;
            default:
                if (charSequence == null || (string2 = charSequence.toString()) == null || (string = C2576A.b0(string2).toString()) == null) {
                    string = "";
                }
                ((C0300e) this.c).onNext(string);
                return;
        }
    }

    public /* synthetic */ C0251a(int i, Object obj, Object obj2) {
        this.f1725a = i;
        this.f1726b = obj;
        this.c = obj2;
    }

    public C0251a(AppCompatEditText editText) {
        this.f1725a = 0;
        kotlin.jvm.internal.j.g(editText, "editText");
        this.f1726b = editText;
        this.c = "";
    }

    public C0251a(AppCompatEditText editText, List clusterSizes) {
        this.f1725a = 1;
        kotlin.jvm.internal.j.g(editText, "editText");
        kotlin.jvm.internal.j.g(clusterSizes, "clusterSizes");
        this.f1726b = editText;
        this.c = clusterSizes;
    }
}
