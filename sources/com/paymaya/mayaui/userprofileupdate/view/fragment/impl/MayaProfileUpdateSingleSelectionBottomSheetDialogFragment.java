package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import J8.n;
import N5.C0450f;
import W4.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.UpdateProfileSelectionItem;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import eb.g;
import f9.DialogInterfaceOnShowListenerC1475b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import rc.C2195b;
import vc.C2345a;
import wc.InterfaceC2391b;
import yc.C2525f;

/* JADX INFO: loaded from: classes4.dex */
public class MayaProfileUpdateSingleSelectionBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements InterfaceC2391b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C2195b f14248S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C0450f f14249T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final InterfaceC1033d f14250U = C1034e.b(new C2525f(this, 1));

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) a.e().B().f4755a.f4716g.get();
        C2195b c2195b = new C2195b();
        this.f14248S = c2195b;
        c2195b.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 8));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_profile_update_single_selection_bottom_sheet_dialog, viewGroup, false);
        int i = R.id.recycler_view_item_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_item_list);
        if (recyclerView != null) {
            i = R.id.text_view_header;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.f14249T = new C0450f((ViewGroup) linearLayout, (Object) recyclerView, (Object) textView, 10);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<UpdateProfileSelectionItem> items;
        Integer headerTextRes;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f14249T;
        j.d(c0450f);
        InterfaceC1033d interfaceC1033d = this.f14250U;
        UpdateProfileSelectionModel updateProfileSelectionModel = (UpdateProfileSelectionModel) interfaceC1033d.getValue();
        int i = 0;
        ((TextView) c0450f.f4088d).setText((updateProfileSelectionModel == null || (headerTextRes = updateProfileSelectionModel.getHeaderTextRes()) == null) ? 0 : headerTextRes.intValue());
        C0450f c0450f2 = this.f14249T;
        j.d(c0450f2);
        UpdateProfileSelectionModel updateProfileSelectionModel2 = (UpdateProfileSelectionModel) interfaceC1033d.getValue();
        Integer numValueOf = null;
        List<UpdateProfileSelectionItem> items2 = updateProfileSelectionModel2 != null ? updateProfileSelectionModel2.getItems() : null;
        if (items2 == null) {
            items2 = C1112C.f9377a;
        }
        UpdateProfileSelectionModel updateProfileSelectionModel3 = (UpdateProfileSelectionModel) interfaceC1033d.getValue();
        String selectedId = updateProfileSelectionModel3 != null ? updateProfileSelectionModel3.getSelectedId() : null;
        C2195b c2195b = this.f14248S;
        if (c2195b == null) {
            j.n("mPresenter");
            throw null;
        }
        C2345a c2345a = new C2345a(items2, selectedId, new g(1, c2195b, C2195b.class, "onItemSelected", "onItemSelected(Lcom/paymaya/domain/model/UpdateProfileSelectionItem;)V", 0, 19));
        RecyclerView recyclerView = (RecyclerView) c0450f2.f4087b;
        recyclerView.setAdapter(c2345a);
        recyclerView.addItemDecoration(new n(recyclerView.getResources().getDimensionPixelSize(R.dimen.maya_margin_medium), 0, recyclerView.getResources().getDimensionPixelSize(R.dimen.maya_margin_large), 2));
        UpdateProfileSelectionModel updateProfileSelectionModel4 = (UpdateProfileSelectionModel) interfaceC1033d.getValue();
        if (updateProfileSelectionModel4 != null && (items = updateProfileSelectionModel4.getItems()) != null) {
            Iterator<UpdateProfileSelectionItem> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                String code = it.next().getCode();
                UpdateProfileSelectionModel updateProfileSelectionModel5 = (UpdateProfileSelectionModel) interfaceC1033d.getValue();
                if (j.b(code, updateProfileSelectionModel5 != null ? updateProfileSelectionModel5.getSelectedId() : null)) {
                    break;
                } else {
                    i++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf == null || numValueOf.intValue() == -1) {
            return;
        }
        C0450f c0450f3 = this.f14249T;
        j.d(c0450f3);
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) c0450f3.f4087b).getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(numValueOf.intValue());
        }
    }
}
