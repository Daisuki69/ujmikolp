package com.paymaya.ui.sendmoney.view.fragment.impl;

import G5.r;
import N5.I;
import N5.r1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.store.L;
import fe.b;
import java.util.List;
import je.InterfaceC1680b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class SendMoneyCardPreviewFragment extends BaseFragment implements InterfaceC1680b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public r1 f14768S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final L f14769T = new L(this, 19);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public b f14770U;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CARD_PREVIEW;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        j.e(getActivity(), "null cannot be cast to non-null type com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardPreviewFragment.SendMoneyCardPreviewFragmentListener");
        throw new ClassCastException();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_design_card_preview, (ViewGroup) null, false);
        int i = R.id.card_design_group_pma_fragment_transfer_send_money;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.card_design_group_pma_fragment_transfer_send_money);
        if (group != null) {
            i = R.id.card_design_recyclerview_pma_fragment_design_card_preview;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.card_design_recyclerview_pma_fragment_design_card_preview);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.pma_view_card_layout;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.pma_view_card_layout);
                if (viewFindChildViewById != null) {
                    I iA = I.a(viewFindChildViewById);
                    i = R.id.scroll_view_pma_fragment_design_card_preview;
                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_pma_fragment_design_card_preview)) != null) {
                        i = R.id.select_design_text_view_pma_fragment_design_card_preview;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.select_design_text_view_pma_fragment_design_card_preview)) != null) {
                            this.f14768S = new r1(constraintLayout, group, recyclerView, iA, 7);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j.n("mSendMoneyCardPreviewFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f14768S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j.n("mSendMoneyCardPreviewFragmentListener");
        throw null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f14770U = new b(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.pma_padding_normal);
        r1 r1Var = this.f14768S;
        j.d(r1Var);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        RecyclerView recyclerView = (RecyclerView) r1Var.e;
        recyclerView.setLayoutManager(linearLayoutManager);
        b bVar = this.f14770U;
        if (bVar == null) {
            j.n("mSendMoneyDecorationAdapter");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        recyclerView.addItemDecoration(new r(dimensionPixelSize / 2, dimensionPixelSize, dimensionPixelSize));
        recyclerView.setItemAnimator(null);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        arguments.getString("gif_id");
        arguments.getString("message");
        arguments.getBoolean("show_selection", false);
        j.n("mSendMoneyCardPreviewFragmentPresenter");
        throw null;
    }

    public final void r1(String imageUrl) {
        j.g(imageUrl, "imageUrl");
        r1 r1Var = this.f14768S;
        j.d(r1Var);
        ((FrameLayout) ((I) r1Var.f4198b).f3648g).setVisibility(4);
        getActivity();
        r1 r1Var2 = this.f14768S;
        j.d(r1Var2);
        C.h0(imageUrl, (ImageView) ((I) r1Var2.f4198b).f, this.f14769T);
    }

    public final void s1(Decoration decoration) {
        b bVar = this.f14770U;
        if (bVar == null) {
            j.n("mSendMoneyDecorationAdapter");
            throw null;
        }
        int i = bVar.c;
        List list = bVar.f16754b;
        j.g(list, "<this>");
        bVar.c = list.indexOf(decoration);
        bVar.notifyItemChanged(i);
        bVar.notifyItemChanged(bVar.c);
        j.n("mSendMoneyCardPreviewFragmentListener");
        throw null;
    }
}
