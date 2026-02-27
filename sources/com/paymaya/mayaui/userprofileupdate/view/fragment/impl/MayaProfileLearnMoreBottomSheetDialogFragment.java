package com.paymaya.mayaui.userprofileupdate.view.fragment.impl;

import N5.C0453g;
import W4.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.ContactReferenceLearnMore;
import kotlin.jvm.internal.j;
import qf.d;
import yc.C2525f;

/* JADX INFO: loaded from: classes4.dex */
public class MayaProfileLearnMoreBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0453g f14246S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final InterfaceC1033d f14247T = C1034e.b(new C2525f(this, 0));

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) a.e().B().f4755a.f4716g.get();
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_profile_learn_more_bottom_sheet_dialog, viewGroup, false);
        int i = R.id.card_view_info;
        if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_info)) != null) {
            i = R.id.return_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.return_button);
            if (button != null) {
                i = R.id.text_view_description;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                if (textView != null) {
                    i = R.id.text_view_form_header;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_form_header);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        this.f14246S = new C0453g(14, linearLayout, button, textView, textView2);
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        ContactReferenceLearnMore contactReferenceLearnMore = (ContactReferenceLearnMore) this.f14247T.getValue();
        if (contactReferenceLearnMore != null) {
            C0453g c0453g = this.f14246S;
            j.d(c0453g);
            String header = contactReferenceLearnMore.getHeader();
            if (header == null) {
                header = "";
            }
            ((TextView) c0453g.e).setText(header);
            String body = contactReferenceLearnMore.getBody();
            ((TextView) c0453g.f4095d).setText(body != null ? body : "");
        }
        C0453g c0453g2 = this.f14246S;
        j.d(c0453g2);
        ((Button) c0453g2.c).setOnClickListener(new d(this, 26));
    }
}
