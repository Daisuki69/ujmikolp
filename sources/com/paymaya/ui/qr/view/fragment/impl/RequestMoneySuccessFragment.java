package com.paymaya.ui.qr.view.fragment.impl;

import A7.j;
import Y6.o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.ShareCompat;
import androidx.webkit.internal.AssetHelper;
import butterknife.BindView;
import butterknife.OnClick;
import ce.g;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.domain.store.Z0;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyActivity;
import de.u;
import v.AbstractC2329d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneySuccessFragment extends BaseFragment implements g {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public j f14718S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public u f14719T;

    @BindView(R.id.message_group_pma_fragment_request_money_success)
    Group mGroupMessage;

    @BindView(R.id.amount_text_view_pma_fragment_request_money_success)
    TextView mTextViewAmount;

    @BindView(R.id.message_text_view_pma_fragment_request_money_success)
    TextView mTextViewMessage;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SUCCESS;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        r1();
        return true;
    }

    @OnClick({R.id.back_to_home_view_group_pma_fragment_request_money_success})
    public void onBackToHomeClick() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BACK_TO_HOME);
        o1(c1219hH);
        r1();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14719T = (u) getActivity();
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        j jVar = new j(aVar.X(), 13);
        this.f14718S = jVar;
        jVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_request_money_success_v2, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14718S.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((RequestMoneyActivity) this.f14719T).Q(this);
    }

    @OnClick({R.id.share_view_group_pma_fragment_request_money_success})
    public void onShareClick() {
        String string;
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SHARE);
        o1(c1219hH);
        j jVar = this.f14718S;
        TransferAppLink transferAppLink = (TransferAppLink) jVar.f;
        if (transferAppLink == null) {
            kotlin.jvm.internal.j.n("mTransferAppLink");
            throw null;
        }
        String strM = C.m(transferAppLink);
        String strN = j.n(transferAppLink);
        String strMMessage = transferAppLink.mMessage();
        if (strMMessage == null || C2576A.H(strMMessage)) {
            string = ((RequestMoneySuccessFragment) ((g) jVar.c.get())).getString(R.string.pma_label_format_request_money_share_no_purpose, ((Z0) jVar.e).a().getFullName(), strN, strM);
            kotlin.jvm.internal.j.d(string);
        } else {
            string = ((RequestMoneySuccessFragment) ((g) jVar.c.get())).getString(R.string.pma_label_format_request_money_share, ((Z0) jVar.e).a().getFullName(), strN, strMMessage, strM);
            kotlin.jvm.internal.j.d(string);
        }
        RequestMoneyActivity requestMoneyActivity = (RequestMoneyActivity) ((RequestMoneySuccessFragment) ((g) jVar.c.get())).f14719T;
        requestMoneyActivity.e.getClass();
        new ShareCompat.IntentBuilder(requestMoneyActivity).setType(AssetHelper.DEFAULT_MIME_TYPE).setChooserTitle(requestMoneyActivity.getString(R.string.pma_label_share)).setText(string).startChooser();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            TransferAppLink transferAppLink = (TransferAppLink) getArguments().getParcelable("transfer_app_link");
            j jVar = this.f14718S;
            jVar.getClass();
            kotlin.jvm.internal.j.g(transferAppLink, "transferAppLink");
            jVar.f = transferAppLink;
            g gVar = (g) jVar.c.get();
            ((RequestMoneySuccessFragment) gVar).mTextViewAmount.setText(j.n(transferAppLink));
            String strMMessage = transferAppLink.mMessage();
            if (strMMessage == null || C2576A.H(strMMessage)) {
                ((RequestMoneySuccessFragment) ((g) jVar.c.get())).mGroupMessage.setVisibility(8);
                return;
            }
            g gVar2 = (g) jVar.c.get();
            ((RequestMoneySuccessFragment) gVar2).mTextViewMessage.setText(transferAppLink.mMessage());
            ((RequestMoneySuccessFragment) ((g) jVar.c.get())).mGroupMessage.setVisibility(0);
        }
    }

    public final void r1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.pma_dialog_request_money_success_exit, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        View viewFindViewById = viewInflate.findViewById(R.id.no_text_view_pma_dialog_request_money_success_exit);
        View viewFindViewById2 = viewInflate.findViewById(R.id.yes_text_view_pma_dialog_request_money_success_exit);
        viewFindViewById.setOnClickListener(new Na.a(alertDialogCreate, 4));
        viewFindViewById2.setOnClickListener(new o(this, 27));
        alertDialogCreate.show();
    }
}
