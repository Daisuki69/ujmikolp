package G5;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.domain.model.DosriValidationResult;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import sc.AbstractC2250a;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class A implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1714b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1715d;
    public Object e;

    public /* synthetic */ A(int i, ViewGroup viewGroup, Object obj, Object obj2, Object obj3) {
        this.f1713a = i;
        this.f1714b = obj;
        this.c = viewGroup;
        this.f1715d = obj2;
        this.e = obj3;
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

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s9) throws JSONException {
        switch (this.f1713a) {
            case 0:
                kotlin.jvm.internal.j.g(s9, "s");
                break;
            case 1:
                kotlin.jvm.internal.j.g(s9, "s");
                break;
            case 2:
                ((Ag.j) this.f1714b).invoke((TextInputLayout) this.c, Integer.valueOf(25 - ((EditText) this.f1715d).getText().toString().length()));
                break;
            case 3:
                ((Ag.j) this.f1714b).invoke((MayaInputLayout) this.c, Integer.valueOf(25 - String.valueOf(((AppCompatEditText) this.f1715d).getText()).length()));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s9, int i, int i4, int i6) {
        switch (this.f1713a) {
            case 0:
                kotlin.jvm.internal.j.g(s9, "s");
                break;
            case 1:
                kotlin.jvm.internal.j.g(s9, "s");
                break;
            case 2:
                if (i6 - i4 > 1) {
                    String strValueOf = String.valueOf(s9);
                    EditText editText = (EditText) this.f1715d;
                    editText.setText(strValueOf);
                    editText.setSelection(strValueOf.length());
                }
                break;
            case 3:
                if (i6 - i4 > 1) {
                    String strValueOf2 = String.valueOf(s9);
                    AppCompatEditText appCompatEditText = (AppCompatEditText) this.f1715d;
                    appCompatEditText.setText(strValueOf2);
                    appCompatEditText.setSelection(strValueOf2.length());
                }
                break;
        }
    }

    public void k(CharSequence charSequence) {
        if (new zj.o((String) this.e).e(charSequence.toString())) {
            ((Function0) this.f1714b).invoke();
        } else if (charSequence.length() > 0) {
            ((Function0) this.c).invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s9, int i, int i4, int i6) {
        final int i10 = 2;
        final int i11 = 1;
        Object obj = this.f1714b;
        switch (this.f1713a) {
            case 0:
                kotlin.jvm.internal.j.g(s9, "s");
                Function0 function0 = (Function0) this.e;
                if (function0 != null) {
                    function0.invoke();
                }
                Function0 function02 = (Function0) obj;
                if (function02 != null ? ((Boolean) function02.invoke()).booleanValue() : false) {
                    if (!C2576A.H(s9.toString())) {
                        Function0 function03 = (Function0) this.f1715d;
                        if (function03 != null) {
                            function03.invoke();
                        }
                    } else {
                        Function0 function04 = (Function0) this.c;
                        if (function04 != null) {
                            function04.invoke();
                        }
                    }
                }
                break;
            case 1:
                kotlin.jvm.internal.j.g(s9, "s");
                if (!C2576A.H(s9.toString())) {
                    k(s9);
                } else {
                    Function0 function05 = (Function0) this.f1715d;
                    if (function05 != null) {
                        function05.invoke();
                    }
                }
                break;
            case 2:
                if (s9 != null && s9.length() != 0 && Character.isWhitespace(s9.charAt(0))) {
                    ((EditText) this.f1715d).setText((CharSequence) null);
                }
                ((com.squareup.wire.internal.a) this.e).invoke(Boolean.valueOf(!(s9 == null || C2576A.H(s9))));
                break;
            case 3:
                if (s9 != null && s9.length() != 0 && Character.isWhitespace(s9.charAt(0))) {
                    ((AppCompatEditText) this.f1715d).setText((CharSequence) null);
                }
                ((N9.f) this.e).invoke(Boolean.valueOf(!(s9 == null || C2576A.H(s9))));
                break;
            case 4:
                if (s9 != null && s9.length() > 0) {
                    ((MayaKycDosriFragment) obj).P1((MayaInputLayout) this.c, (DosriValidationResult) ((Function2) this.f1715d).invoke((KycFieldType) this.e, s9.toString()));
                    break;
                }
                break;
            case 5:
                String strValueOf = String.valueOf(((MayaProfileInputLayout) obj).getInputEditText().getText());
                String strValueOf2 = String.valueOf(((MayaProfileInputLayout) this.c).getInputEditText().getText());
                if (strValueOf.length() > 0 && strValueOf.equals(strValueOf2)) {
                    ((Function1) this.f1715d).invoke(Boolean.TRUE);
                } else {
                    ((Function1) this.e).invoke(Boolean.FALSE);
                }
                break;
            case 6:
                if (i4 != i6) {
                    final MayaUserContactReferenceFragment mayaUserContactReferenceFragment = (MayaUserContactReferenceFragment) obj;
                    boolean z4 = ((rc.i) mayaUserContactReferenceFragment.Z1()).f19909t;
                    UpdateProfileFieldType updateProfileFieldType = (UpdateProfileFieldType) this.c;
                    if (z4 && updateProfileFieldType.isNameType()) {
                        mayaUserContactReferenceFragment.X1().f();
                        mayaUserContactReferenceFragment.a2().f();
                        mayaUserContactReferenceFragment.Y1().f();
                    }
                    String strValueOf3 = String.valueOf(s9);
                    int i12 = yc.q.f21126a[updateProfileFieldType.ordinal()];
                    final MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) this.f1715d;
                    ?? r02 = (kotlin.jvm.internal.i) this.e;
                    if (i12 == 1) {
                        rc.i iVar = MayaUserProfileUpdateFragment.f14263h0;
                        if (iVar != null) {
                            iVar.r(strValueOf3.length());
                        }
                        rc.m mVar = MayaUserProfileUpdateFragment.f14264i0;
                        if (mVar != null) {
                            mVar.r(strValueOf3.length());
                        }
                        UpdateProfileValidationResult updateProfileValidationResult = (UpdateProfileValidationResult) r02.invoke(updateProfileFieldType, strValueOf3);
                        final int i13 = z ? 1 : 0;
                        AbstractC2250a.c(mayaProfileInputLayout, updateProfileValidationResult, new Function0() { // from class: yc.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i13) {
                                    case 0:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                    case 1:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                    default:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                }
                                return Unit.f18162a;
                            }
                        });
                    } else if (i12 == 2) {
                        AbstractC2250a.c(mayaProfileInputLayout, (UpdateProfileValidationResult) r02.invoke(updateProfileFieldType, "63".concat(strValueOf3)), new Function0() { // from class: yc.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                    case 1:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                    default:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                }
                                return Unit.f18162a;
                            }
                        });
                    } else {
                        AbstractC2250a.c(mayaProfileInputLayout, (UpdateProfileValidationResult) r02.invoke(updateProfileFieldType, strValueOf3), new Function0() { // from class: yc.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                    case 1:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                    default:
                                        mayaUserContactReferenceFragment.R1(mayaProfileInputLayout);
                                        break;
                                }
                                return Unit.f18162a;
                            }
                        });
                    }
                }
                break;
            case 7:
                if (i4 != i6) {
                    List list = MayaUserProfileUpdateFragment.f14261f0;
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) obj;
                    boolean z5 = ((rc.m) mayaUserProfileUpdateFragment.h2()).f19924v;
                    UpdateProfileFieldType updateProfileFieldType2 = (UpdateProfileFieldType) this.c;
                    if (z5 && updateProfileFieldType2.isNameType()) {
                        mayaUserProfileUpdateFragment.d2().f();
                        mayaUserProfileUpdateFragment.f2().f();
                        mayaUserProfileUpdateFragment.e2().f();
                    }
                    boolean zIsIdNumberType = updateProfileFieldType2.isIdNumberType();
                    ?? r10 = (kotlin.jvm.internal.i) this.e;
                    MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) this.f1715d;
                    if (!zIsIdNumberType) {
                        mayaUserProfileUpdateFragment.k2(mayaProfileInputLayout2, updateProfileFieldType2, r10, String.valueOf(s9));
                    } else {
                        mayaUserProfileUpdateFragment.j2(mayaProfileInputLayout2, updateProfileFieldType2, r10, String.valueOf(s9));
                    }
                }
                break;
            default:
                ((MayaUserUpdateWorkDetailsFragment) obj).d2((MayaProfileInputLayout) this.c, (UpdateProfileFieldType) this.f1715d, (kotlin.jvm.internal.i) this.e, String.valueOf(s9));
                break;
        }
    }

    public A() {
        this.f1713a = 0;
        this.f1714b = new A5.j(11);
    }

    public A(MayaInputLayout mayaInputLayout, String str, Function0 function0, Function0 function02, Function0 function03) {
        this.f1713a = 1;
        kotlin.jvm.internal.j.g(mayaInputLayout, "mayaInputLayout");
        this.e = str;
        this.f1714b = function0;
        this.c = function02;
        this.f1715d = function03;
    }

    public A(MayaProfileInputLayout firstInput, MayaProfileInputLayout secondInput, Function1 function1, Function1 function12) {
        this.f1713a = 5;
        kotlin.jvm.internal.j.g(firstInput, "firstInput");
        kotlin.jvm.internal.j.g(secondInput, "secondInput");
        this.f1714b = firstInput;
        this.c = secondInput;
        this.f1715d = function1;
        this.e = function12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(Function0 function0, Function0 function02, Function0 function03, int i) {
        this();
        this.f1713a = 0;
        function0 = (i & 1) != 0 ? new A5.j(11) : function0;
        function02 = (i & 2) != 0 ? null : function02;
        function03 = (i & 4) != 0 ? null : function03;
        this.f1714b = function0;
        this.c = function02;
        this.f1715d = function03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(UpdateProfileFieldType updateProfileFieldType, MayaProfileInputLayout mayaProfileInputLayout, MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment, Function2 function2) {
        this.f1713a = 8;
        this.f1714b = mayaUserUpdateWorkDetailsFragment;
        this.c = mayaProfileInputLayout;
        this.f1715d = updateProfileFieldType;
        this.e = (kotlin.jvm.internal.i) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(MayaUserContactReferenceFragment mayaUserContactReferenceFragment, UpdateProfileFieldType updateProfileFieldType, MayaProfileInputLayout mayaProfileInputLayout, Function2 function2) {
        this.f1713a = 6;
        this.f1714b = mayaUserContactReferenceFragment;
        this.c = updateProfileFieldType;
        this.f1715d = mayaProfileInputLayout;
        this.e = (kotlin.jvm.internal.i) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A(MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment, UpdateProfileFieldType updateProfileFieldType, MayaProfileInputLayout mayaProfileInputLayout, Function2 function2) {
        this.f1713a = 7;
        this.f1714b = mayaUserProfileUpdateFragment;
        this.c = updateProfileFieldType;
        this.f1715d = mayaProfileInputLayout;
        this.e = (kotlin.jvm.internal.i) function2;
    }
}
