package rc;

import android.content.Intent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.data.api.UpdateProfileApi;
import com.paymaya.data.api.UserProfileUpdateApi;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.domain.model.UpdateProfileFieldType;
import com.paymaya.domain.model.UpdateProfileIncomeSource;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.domain.model.UpdateProfileWorkNature;
import com.paymaya.domain.model.ValidationRule;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o6.C1967a;
import pc.AbstractC2033b;
import ph.C2070f1;
import s.AbstractC2217b;
import zj.x;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2033b implements oc.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y.e f19927g;
    public final com.paymaya.data.preference.a h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19929l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public UpdateProfileCmsContentData f19930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public UpdateProfileWorkNature f19931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f19932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f19933q;

    public o(Y.e eVar, com.paymaya.data.preference.a aVar) {
        super(aVar);
        this.f19927g = eVar;
        this.h = aVar;
        this.f19928k = true;
        this.m = true;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        super.j();
        FragmentActivity activity = ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).getActivity();
        String dataString = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getDataString();
        int iW = C.w(dataString);
        if (iW != 0 && n.f19925a[AbstractC2217b.c(iW)] == 1) {
            HashMap mapA = C.A(dataString);
            this.f19932p = (String) jk.b.m(mapA, numX49.tnTj78("bFot"), null);
            this.f19933q = (String) jk.b.m(mapA, numX49.tnTj78("bFoU"), null);
        }
        k();
    }

    @Override // pc.AbstractC2033b
    public final void k() {
        ((MayaBaseFragment) ((wc.f) this.c.get())).E1();
        new Lh.d(new Lh.d(new Lh.h(((UserProfileUpdateApi) this.f19927g.f6708b).getProfileCMSData().h(Th.e.c), zh.b.a(), 0), new C1967a(this, 10), 2), new qc.c(this, 3), 0).e();
    }

    @Override // pc.AbstractC2033b
    public final void l() {
        com.paymaya.data.preference.a aVar = this.h;
        if (aVar.v().length() == 0) {
            aVar.m0(UUID.randomUUID().toString());
        }
        new Lh.d(new Lh.d(new Lh.h(((UpdateProfileApi) this.f19927g.c).getUserProfile().h(Th.e.c), zh.b.a(), 0), new C2070f1(this, 5), 2), new p8.a(this, 9), 0).e();
    }

    public final boolean p(UpdateProfileFieldType updateProfileFieldType) {
        int i = n.f19926b[updateProfileFieldType.ordinal()];
        if (i == 1) {
            return this.m;
        }
        if (i == 2) {
            return this.f19929l;
        }
        if (i == 3) {
            return this.f19928k;
        }
        if (i == 4) {
            return this.j;
        }
        if (i != 5) {
            return false;
        }
        return this.i;
    }

    public final void q(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bFoe"));
        UpdateProfileCmsContentData updateProfileCmsContentData = this.f19930n;
        Object obj = null;
        if (updateProfileCmsContentData == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bFo8"));
            throw null;
        }
        List<UpdateProfileIncomeSource> incomeSources = updateProfileCmsContentData.getIncomeSources();
        if (incomeSources != null) {
            Iterator<T> it = incomeSources.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.j.b(((UpdateProfileIncomeSource) next).getCode(), str)) {
                    obj = next;
                    break;
                }
            }
            UpdateProfileIncomeSource updateProfileIncomeSource = (UpdateProfileIncomeSource) obj;
            if (updateProfileIncomeSource != null) {
                ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).i2(updateProfileIncomeSource);
            }
        }
    }

    public final void r(String str) {
        Object next;
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bFoC"));
        UpdateProfileCmsContentData updateProfileCmsContentData = this.f19930n;
        if (updateProfileCmsContentData == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bFoo"));
            throw null;
        }
        List<UpdateProfileWorkNature> workNatures = updateProfileCmsContentData.getWorkNatures();
        if (workNatures != null) {
            Iterator<T> it = workNatures.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.j.b(((UpdateProfileWorkNature) next).getCode(), str)) {
                        break;
                    }
                }
            }
            UpdateProfileWorkNature updateProfileWorkNature = (UpdateProfileWorkNature) next;
            if (updateProfileWorkNature != null) {
                this.f19931o = updateProfileWorkNature;
                MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment = (MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get());
                mayaUserUpdateWorkDetailsFragment.getClass();
                mayaUserUpdateWorkDetailsFragment.a2().getDisplayText().setText(updateProfileWorkNature.getName());
                mayaUserUpdateWorkDetailsFragment.a2().setSelectedData(updateProfileWorkNature);
                AppCompatTextView displayText = mayaUserUpdateWorkDetailsFragment.a2().getDisplayText();
                String strTnTj78 = numX49.tnTj78("bFo4");
                displayText.setHint(strTnTj78);
                mayaUserUpdateWorkDetailsFragment.a2().b();
                ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).j2(null);
                ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).i2(null);
                ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).X1().getInputEditText().setText(strTnTj78);
                boolean z4 = true;
                this.j = true;
                ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).Y1().setVisibility(0);
                this.f19929l = true;
                ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).b2().setVisibility(0);
                if (updateProfileWorkNature.getRequiresEmploymentDetails()) {
                    ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).X1().setVisibility(0);
                } else {
                    ((MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get())).X1().setVisibility(8);
                    z4 = false;
                }
                this.i = z4;
                MayaUserUpdateWorkDetailsFragment mayaUserUpdateWorkDetailsFragment2 = (MayaUserUpdateWorkDetailsFragment) ((wc.f) this.c.get());
                mayaUserUpdateWorkDetailsFragment2.X1().f();
                mayaUserUpdateWorkDetailsFragment2.Z1().f();
            }
        }
    }

    public final UpdateProfileValidationResult s(UpdateProfileFieldType updateProfileFieldType, Object obj) {
        kotlin.jvm.internal.j.g(updateProfileFieldType, numX49.tnTj78("bFoK"));
        return (obj == null && p(updateProfileFieldType)) ? new UpdateProfileValidationResult.RequiredFieldError(updateProfileFieldType) : UpdateProfileValidationResult.Success.INSTANCE;
    }

    public final UpdateProfileValidationResult t(UpdateProfileFieldType updateProfileFieldType, String str) {
        Double dE;
        kotlin.jvm.internal.j.g(updateProfileFieldType, numX49.tnTj78("bFow"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bFoc"));
        if (str.length() == 0 && p(updateProfileFieldType)) {
            return new UpdateProfileValidationResult.RequiredFieldError(updateProfileFieldType);
        }
        if (updateProfileFieldType == UpdateProfileFieldType.MONTHLY_TAKE_HOME_PAY && str.length() > 0 && p(updateProfileFieldType) && (dE = x.e(str)) != null && dE.doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return new UpdateProfileValidationResult.RequiredFieldError(updateProfileFieldType);
        }
        UpdateProfileCmsContentData updateProfileCmsContentData = this.f19930n;
        ValidationRule validationRule = null;
        Object obj = null;
        if (updateProfileCmsContentData == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bFoh"));
            throw null;
        }
        List<ValidationRule> validationRules = updateProfileCmsContentData.getValidationRules();
        if (validationRules != null) {
            Iterator it = jk.b.h(validationRules, updateProfileFieldType).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String regex = ((ValidationRule) next).getRegex();
                if (regex == null) {
                    regex = numX49.tnTj78("bFom");
                }
                if (!AbstractC1213b.U(regex, str)) {
                    obj = next;
                    break;
                }
            }
            validationRule = (ValidationRule) obj;
        }
        if (str.length() <= 0 || validationRule == null) {
            return UpdateProfileValidationResult.Success.INSTANCE;
        }
        String message = validationRule.getMessage();
        if (message == null) {
            message = numX49.tnTj78("bFoD");
        }
        return new UpdateProfileValidationResult.RegExError(message);
    }
}
