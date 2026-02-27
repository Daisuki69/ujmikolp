package Z8;

import android.content.Intent;
import android.text.Editable;
import android.widget.Button;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.User;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import g9.InterfaceC1510e;
import h9.t;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC2509a implements Y8.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6914d;
    public boolean e;

    public g(com.paymaya.data.preference.a preference) {
        j.g(preference, "preference");
        this.f6914d = preference;
    }

    @Override // y5.AbstractC2509a
    public final void h(Object obj) {
        Intent intent;
        Intent intent2;
        InterfaceC1510e view = (InterfaceC1510e) obj;
        j.g(view, "view");
        super.h(view);
        FragmentActivity activity = ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).getActivity();
        String dataString = (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString();
        if (27 == C.w(dataString)) {
            C1219h c1219hM1 = ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("from_deep_link", "true");
            String strL = C.L(dataString, "invite");
            if (strL != null && !C2576A.H(strL)) {
                return;
            }
        }
        FragmentActivity activity2 = ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).getActivity();
        if (activity2 == null || (intent = activity2.getIntent()) == null) {
            return;
        }
        intent.setData(null);
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (this.f6914d.e().isRegistrationMiddleNameEnabled()) {
            Group group = ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12816g0;
            if (group != null) {
                group.setVisibility(0);
                return;
            } else {
                j.n("mMiddleNameGroup");
                throw null;
            }
        }
        Group group2 = ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12816g0;
        if (group2 != null) {
            group2.setVisibility(8);
        } else {
            j.n("mMiddleNameGroup");
            throw null;
        }
    }

    public final boolean k() {
        return (!this.f6914d.e().isRegistrationMiddleNameEnabled() || this.e) ? ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12819j0 && ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12821l0 && ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).m0 : ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12819j0 && ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12820k0 && ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12821l0 && ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).m0;
    }

    public final void l() {
        String string;
        String string2;
        User userBuild;
        if (k()) {
            OngoingRegistration ongoingRegistration = null;
            if (this.e) {
                string = null;
            } else {
                MayaInputLayout mayaInputLayout = ((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).f12810a0;
                if (mayaInputLayout == null) {
                    j.n("mMayaInputLayoutMiddleName");
                    throw null;
                }
                Editable text = mayaInputLayout.getInputEditText().getText();
                if (text == null || (string2 = text.toString()) == null || (string = C2576A.b0(string2).toString()) == null) {
                    string = "";
                }
            }
            if (this.f6914d.e().isRegistrationMiddleNameEnabled()) {
                userBuild = User.sBuilder().mFirstName(((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).J1()).mMiddleName(string).mLastName(((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).K1()).mHasNoMiddleName(Boolean.valueOf(this.e)).build();
                j.d(userBuild);
            } else {
                userBuild = User.sBuilder().mFirstName(((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).J1()).mLastName(((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).K1()).build();
                j.d(userBuild);
            }
            Identity identityBuild = C2576A.H(((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).I1()) ? null : Identity.sBuilder().mType("email").mValue(((MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get())).I1()).build();
            MayaRegistrationUserFragment mayaRegistrationUserFragment = (MayaRegistrationUserFragment) ((InterfaceC1510e) this.c.get());
            mayaRegistrationUserFragment.getClass();
            t tVar = mayaRegistrationUserFragment.f12817h0;
            if (tVar != null) {
                MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) tVar;
                OngoingRegistration ongoingRegistration2 = mayaRegistrationActivity.f12734q;
                if (ongoingRegistration2 != null) {
                    ongoingRegistration2.setRegisteringUser(userBuild);
                    ongoingRegistration2.setRegisteringEmailIdentity(identityBuild);
                    ongoingRegistration = ongoingRegistration2;
                }
                mayaRegistrationActivity.f12734q = ongoingRegistration;
            }
            t tVar2 = mayaRegistrationUserFragment.f12817h0;
            if (tVar2 != null) {
                AbstractC1236z.i((MayaRegistrationActivity) tVar2, R.id.fragment_container, new MayaRegistrationIdentityFragment(), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
            }
        }
    }

    public final void m() {
        InterfaceC1510e interfaceC1510e = (InterfaceC1510e) this.c.get();
        boolean zK = k();
        Button button = ((MayaRegistrationUserFragment) interfaceC1510e).f12813d0;
        if (button != null) {
            button.setEnabled(zK);
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
