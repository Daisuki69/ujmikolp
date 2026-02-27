package com.paymaya.mayaui.missions.view.fragment.impl;

import Ah.p;
import F9.c;
import G5.F;
import G9.e;
import Lh.d;
import Lh.h;
import N5.C0491z;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.domain.store.C1272m0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import w.C2361c;
import y5.f;
import yk.a;
import zh.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMissionsEnterCodeBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public B9.c f12987S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public MissionV2 f12988T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public MissionV2Action f12989U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0491z f12990V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public e f12991W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ConstraintLayout f12992X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f12993Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f12994Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f12995a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public MayaInputLayout f12996b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final EnumC1216e f12997c0 = EnumC1216e.ENTER_CODE;

    public static final void t1(MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BUTTON);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("button", "CONFIRM");
        c1219hH.i();
        mayaMissionsEnterCodeBottomSheetFragment.r1(c1219hH);
        B9.c cVarS1 = mayaMissionsEnterCodeBottomSheetFragment.s1();
        MayaInputLayout mayaInputLayout = mayaMissionsEnterCodeBottomSheetFragment.f12996b0;
        if (mayaInputLayout == null) {
            j.n("mCodeEditText");
            throw null;
        }
        Editable text = mayaInputLayout.getInputEditText().getText();
        String string = text != null ? text.toString() : null;
        MissionV2 missionV2 = ((MayaMissionsEnterCodeBottomSheetFragment) ((c) cVarS1.c.get())).f12988T;
        MissionV2Action missionV2Action = ((MayaMissionsEnterCodeBottomSheetFragment) ((c) cVarS1.c.get())).f12989U;
        if (string == null || C2576A.H(string) || missionV2 == null || missionV2Action == null || missionV2Action.getVoucherCampaignId() == null) {
            return;
        }
        MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment2 = (MayaMissionsEnterCodeBottomSheetFragment) ((c) cVarS1.c.get());
        FragmentActivity fragmentActivityRequireActivity = mayaMissionsEnterCodeBottomSheetFragment2.requireActivity();
        MayaInputLayout mayaInputLayout2 = mayaMissionsEnterCodeBottomSheetFragment2.f12996b0;
        if (mayaInputLayout2 == null) {
            j.n("mCodeEditText");
            throw null;
        }
        C.Q(fragmentActivityRequireActivity, mayaInputLayout2);
        e eVar = ((MayaMissionsEnterCodeBottomSheetFragment) ((c) cVarS1.c.get())).f12991W;
        if (eVar != null) {
            MayaMissionsActivity mayaMissionsActivity = (MayaMissionsActivity) eVar;
            Bundle bundle = new Bundle();
            bundle.putString("message", "");
            bundle.putBoolean("cancelable", false);
            MayaLoadingDialogFragment mayaLoadingDialogFragment = new MayaLoadingDialogFragment();
            mayaLoadingDialogFragment.setArguments(bundle);
            mayaLoadingDialogFragment.show(mayaMissionsActivity.getSupportFragmentManager(), "loading_fragment");
            mayaMissionsActivity.f12955o = mayaLoadingDialogFragment;
        }
        String id = missionV2.getId();
        String voucherCampaignId = missionV2Action.getVoucherCampaignId();
        j.g(id, "id");
        C1272m0 c1272m0 = cVarS1.e;
        c1272m0.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mission_id", id);
        } catch (JSONException unused) {
            a.e();
        }
        try {
            jSONObject.put("voucher_campaign_id", voucherCampaignId);
        } catch (JSONException unused2) {
            a.e();
        }
        try {
            jSONObject.put("mission_code", string);
        } catch (JSONException unused3) {
            a.e();
        }
        try {
            jSONObject.put("device_type", "android");
        } catch (JSONException unused4) {
            a.e();
        }
        byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        RequestBody.Companion companion = RequestBody.Companion;
        j.d(bytes);
        p<MissionV2> pVarEnterMissionCode = c1272m0.f11462b.enterMissionCode(RequestBody.Companion.create$default(companion, f.f21063a, bytes, 0, 0, 12, (Object) null));
        j.f(pVarEnterMissionCode, "enterMissionCode(...)");
        new d(new d(new h(pVarEnterMissionCode, b.a(), 0), new C2361c(cVarS1, 6), 2), new J5.a(cVarS1, 7), 0).e();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return this.f12997c0;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12988T = (MissionV2) arguments.getParcelable("mission");
            this.f12989U = (MissionV2Action) arguments.getParcelable("mission_action");
        }
        setStyle(0, R.style.AppBottomSheetDialogTheme);
        this.f12991W = (e) getActivity();
        O5.a aVar = W4.a.e().s().f4753a;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f12987S = new B9.c(aVar.D(), (Uh.d) aVar.f4748y.get());
        s1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_missions_enter_code_bottom_sheet, viewGroup, false);
        int i = R.id.cancel_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.cancel_button);
        if (button != null) {
            i = R.id.code_input_layout;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.code_input_layout);
            if (mayaInputLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.instructions_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.instructions_text_view);
                if (textView != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                        i = R.id.right_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                            i = R.id.sheet_background_view;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                            if (viewFindChildViewById != null) {
                                i = R.id.submit_button;
                                Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.submit_button);
                                if (button2 != null) {
                                    this.f12990V = new C0491z(viewFindChildViewById, button, button2, textView, constraintLayout, constraintLayout, mayaInputLayout);
                                    Dialog dialog = getDialog();
                                    if (dialog != null) {
                                        dialog.setOnShowListener(new Fa.c(this, 2));
                                    }
                                    C0491z c0491z = this.f12990V;
                                    j.d(c0491z);
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) c0491z.f4303b;
                                    j.f(constraintLayout2, "getRoot(...)");
                                    return constraintLayout2;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        s1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12990V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e eVar = this.f12991W;
        if (eVar != null) {
            ((MayaMissionsActivity) eVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f12990V;
        j.d(c0491z);
        this.f12992X = (ConstraintLayout) c0491z.f;
        C0491z c0491z2 = this.f12990V;
        j.d(c0491z2);
        this.f12993Y = (TextView) c0491z2.f4304d;
        C0491z c0491z3 = this.f12990V;
        j.d(c0491z3);
        this.f12994Z = (Button) c0491z3.c;
        C0491z c0491z4 = this.f12990V;
        j.d(c0491z4);
        this.f12995a0 = (Button) c0491z4.h;
        C0491z c0491z5 = this.f12990V;
        j.d(c0491z5);
        this.f12996b0 = (MayaInputLayout) c0491z5.e;
        Button button = this.f12994Z;
        if (button == null) {
            j.n("mCancelButton");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMissionsEnterCodeBottomSheetFragment f1928b;

            {
                this.f1928b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = this.f1928b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaMissionsEnterCodeBottomSheetFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment2 = this.f1928b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMissionsEnterCodeBottomSheetFragment.t1(mayaMissionsEnterCodeBottomSheetFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f12995a0;
        if (button2 == null) {
            j.n("mConfirmButton");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: G9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMissionsEnterCodeBottomSheetFragment f1928b;

            {
                this.f1928b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = this.f1928b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaMissionsEnterCodeBottomSheetFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment2 = this.f1928b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaMissionsEnterCodeBottomSheetFragment.t1(mayaMissionsEnterCodeBottomSheetFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout = this.f12996b0;
        if (mayaInputLayout == null) {
            j.n("mCodeEditText");
            throw null;
        }
        mayaInputLayout.getInputEditText().addTextChangedListener(new F(this, 1));
        MayaInputLayout mayaInputLayout2 = this.f12996b0;
        if (mayaInputLayout2 == null) {
            j.n("mCodeEditText");
            throw null;
        }
        mayaInputLayout2.requestFocus();
        s1().j();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        r1(c1219h);
    }

    public final B9.c s1() {
        B9.c cVar = this.f12987S;
        if (cVar != null) {
            return cVar;
        }
        j.n("mMissionsEnterCodeBottomSheetFragmentPresenter");
        throw null;
    }
}
