package com.paymaya.mayaui.login.view.fragment.impl;

import N5.C0485w;
import Q6.l;
import W4.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import f9.DialogInterfaceOnShowListenerC1475b;
import fa.ViewOnClickListenerC1479a;
import h9.InterfaceC1544c;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaLocationPermissionBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0485w f12771S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public l f12772T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ConstraintLayout f12773U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f12774V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public InterfaceC1544c f12775W;

    public static final void s1(MayaLocationPermissionBottomSheetDialogFragment mayaLocationPermissionBottomSheetDialogFragment) {
        C1220i c1220iN1 = mayaLocationPermissionBottomSheetDialogFragment.n1();
        FragmentActivity activity = mayaLocationPermissionBottomSheetDialogFragment.getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(9));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Location Permission (Bottom sheet)");
        map.put("destination_page", "Location Permission OS");
        Button button = mayaLocationPermissionBottomSheetDialogFragment.f12774V;
        if (button == null) {
            j.n("mButtonContinue");
            throw null;
        }
        map.put("button", button.getText().toString());
        c1219hE.i();
        c1220iN1.c(activity, c1219hE);
        InterfaceC1544c interfaceC1544c = mayaLocationPermissionBottomSheetDialogFragment.f12775W;
        if (interfaceC1544c != null) {
            interfaceC1544c.d0();
        }
        mayaLocationPermissionBottomSheetDialogFragment.dismiss();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10327P = true;
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10325B = (C1220i) a.e().p().f4756a.f4716g.get();
        this.f12772T = new l(12);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.login.view.fragment.impl.MayaLocationPermissionBottomSheetDialogFragment.MayaLocationPermissionBottomSheetFragmentListener");
        this.f12775W = (InterfaceC1544c) componentRequireActivity;
        l lVar = this.f12772T;
        if (lVar != null) {
            lVar.h(this);
        } else {
            j.n("mLocationPermissionBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 5));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_location_permission, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.continue_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
        if (button != null) {
            i = R.id.description_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.description_text_view)) != null) {
                i = R.id.location_graphic_image_view;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.location_graphic_image_view)) != null) {
                    i = R.id.title_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view)) != null) {
                        this.f12771S = new C0485w(constraintLayout, constraintLayout, button);
                        j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        l lVar = this.f12772T;
        if (lVar == null) {
            j.n("mLocationPermissionBottomSheetDialogFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1544c interfaceC1544c = this.f12775W;
        if (interfaceC1544c != null) {
            interfaceC1544c.Q(this);
        }
        C1220i c1220iN1 = n1();
        FragmentActivity activity = getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.u(9));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("source_page", "Location Permission (Bottom sheet)");
        c1219hE.i();
        c1220iN1.c(activity, c1219hE);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0485w c0485w = this.f12771S;
        j.d(c0485w);
        this.f12773U = c0485w.f4251d;
        C0485w c0485w2 = this.f12771S;
        j.d(c0485w2);
        this.f12774V = c0485w2.c;
        l lVar = this.f12772T;
        if (lVar == null) {
            j.n("mLocationPermissionBottomSheetDialogFragmentPresenter");
            throw null;
        }
        lVar.j();
        Button button = this.f12774V;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC1479a(this, 4));
        } else {
            j.n("mButtonContinue");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return EnumC1215d.LOCATION_PERMISSION;
    }
}
