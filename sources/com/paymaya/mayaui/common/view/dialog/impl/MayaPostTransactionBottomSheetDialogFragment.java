package com.paymaya.mayaui.common.view.dialog.impl;

import Fa.c;
import L9.C0327e;
import N5.C0462k;
import O5.a;
import V6.e;
import W6.k;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPostTransactionBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements e {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0462k f11868S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ImageView f11869T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f11870U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f11871V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AppCompatTextView f11872W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public AppCompatTextView f11873X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f11874Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f11875Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f11876a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f11877b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public EnumC1215d f11878c0 = EnumC1215d.DEFAULT;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public EnumC1216e f11879d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Function1 f11880e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Function1 f11881f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Function1 f11882g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public C0327e f11883h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public k f11884i0;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return this.f11879d0;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f11877b0) {
            m1().i();
            m1().n(8);
            this.f10327P = true;
        }
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10325B = (C1220i) ((a) W4.a.e().a().c).f4716g.get();
        this.f11883h0 = new C0327e(29);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment.MayaPostTransactionBottomSheetDialogFragmentListener");
        this.f11884i0 = (k) componentRequireActivity;
        C0327e c0327e = this.f11883h0;
        if (c0327e != null) {
            c0327e.h(this);
        } else {
            j.n("mFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 26));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_post_transaction_bottom_sheet, viewGroup, false);
        int i = R.id.button_primary;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_primary);
        if (button != null) {
            i = R.id.button_secondary;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_secondary);
            if (button2 != null) {
                i = R.id.image_view_head_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_head_image);
                if (imageView != null) {
                    i = R.id.text_view_add_favorite;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_favorite);
                    if (appCompatTextView != null) {
                        i = R.id.text_view_description;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                        if (textView != null) {
                            i = R.id.text_view_tertiary;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_tertiary);
                            if (textView2 != null) {
                                i = R.id.text_view_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                                if (textView3 != null) {
                                    i = R.id.text_view_update_favorite_status;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_update_favorite_status);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.view_background_sheet;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_background_sheet);
                                        if (viewFindChildViewById != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            this.f11868S = new C0462k(constraintLayout, button, button2, imageView, appCompatTextView, textView, textView2, textView3, appCompatTextView2, viewFindChildViewById);
                                            j.f(constraintLayout, "getRoot(...)");
                                            return constraintLayout;
                                        }
                                    }
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
        C0327e c0327e = this.f11883h0;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11868S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0462k c0462k = this.f11868S;
        j.d(c0462k);
        this.f11869T = (ImageView) c0462k.f4133g;
        C0462k c0462k2 = this.f11868S;
        j.d(c0462k2);
        this.f11870U = (TextView) c0462k2.e;
        C0462k c0462k3 = this.f11868S;
        j.d(c0462k3);
        this.f11871V = (TextView) c0462k3.c;
        C0462k c0462k4 = this.f11868S;
        j.d(c0462k4);
        this.f11872W = (AppCompatTextView) c0462k4.i;
        C0462k c0462k5 = this.f11868S;
        j.d(c0462k5);
        this.f11873X = (AppCompatTextView) c0462k5.j;
        C0462k c0462k6 = this.f11868S;
        j.d(c0462k6);
        this.f11874Y = (Button) c0462k6.f;
        C0462k c0462k7 = this.f11868S;
        j.d(c0462k7);
        this.f11875Z = (Button) c0462k7.h;
        C0462k c0462k8 = this.f11868S;
        j.d(c0462k8);
        this.f11876a0 = (TextView) c0462k8.f4132d;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("image_res_id");
            CharSequence charSequence = arguments.getCharSequence("title");
            CharSequence charSequence2 = arguments.getCharSequence("description");
            Serializable serializable = arguments.getSerializable("favorite_status");
            j.e(serializable, "null cannot be cast to non-null type com.paymaya.domain.model.FavoriteStatus");
            FavoriteStatus favoriteStatus = (FavoriteStatus) serializable;
            String string = arguments.getString("primary_text");
            String string2 = arguments.getString("secondary_text");
            String string3 = arguments.getString("tertiary_text");
            ImageView imageView = this.f11869T;
            if (imageView == null) {
                j.n("mImageViewHeadImage");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), i));
            TextView textView = this.f11870U;
            if (textView == null) {
                j.n("mTextViewTitle");
                throw null;
            }
            textView.setText(charSequence);
            C0327e c0327e = this.f11883h0;
            if (c0327e == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            if (charSequence2 == null || C2576A.H(charSequence2)) {
                TextView textView2 = ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).f11871V;
                if (textView2 == null) {
                    j.n("mTextViewDescription");
                    throw null;
                }
                textView2.setVisibility(8);
            } else {
                TextView textView3 = ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).f11871V;
                if (textView3 == null) {
                    j.n("mTextViewDescription");
                    throw null;
                }
                textView3.setVisibility(0);
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = (MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get());
                mayaPostTransactionBottomSheetDialogFragment.getClass();
                TextView textView4 = mayaPostTransactionBottomSheetDialogFragment.f11871V;
                if (textView4 == null) {
                    j.n("mTextViewDescription");
                    throw null;
                }
                textView4.setText(Html.fromHtml(charSequence2.toString()));
            }
            if (string == null) {
                final MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment2 = (MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get());
                Button button = mayaPostTransactionBottomSheetDialogFragment2.f11874Y;
                if (button == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                button.setText(mayaPostTransactionBottomSheetDialogFragment2.getString(R.string.pma_label_got_it));
                Button button2 = mayaPostTransactionBottomSheetDialogFragment2.f11874Y;
                if (button2 == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                final int i4 = 3;
                button2.setOnClickListener(new View.OnClickListener(mayaPostTransactionBottomSheetDialogFragment2) { // from class: W6.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaPostTransactionBottomSheetDialogFragment f6322b;

                    {
                        this.f6322b = mayaPostTransactionBottomSheetDialogFragment2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment3 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaPostTransactionBottomSheetDialogFragment3.f11882g0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    k kVar = mayaPostTransactionBottomSheetDialogFragment3.f11884i0;
                                    if (kVar != null) {
                                        kVar.k0();
                                    }
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment4 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment4.getClass();
                                    mayaPostTransactionBottomSheetDialogFragment4.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment5 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaPostTransactionBottomSheetDialogFragment5.f11880e0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment5.dismiss();
                                    return;
                                } finally {
                                }
                            case 3:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment6 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment7 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaPostTransactionBottomSheetDialogFragment7.f11881f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment7.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            } else {
                final MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment3 = (MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get());
                mayaPostTransactionBottomSheetDialogFragment3.getClass();
                Button button3 = mayaPostTransactionBottomSheetDialogFragment3.f11874Y;
                if (button3 == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                button3.setText(string);
                Button button4 = mayaPostTransactionBottomSheetDialogFragment3.f11874Y;
                if (button4 == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                final int i6 = 2;
                button4.setOnClickListener(new View.OnClickListener(mayaPostTransactionBottomSheetDialogFragment3) { // from class: W6.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaPostTransactionBottomSheetDialogFragment f6322b;

                    {
                        this.f6322b = mayaPostTransactionBottomSheetDialogFragment3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i6) {
                            case 0:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment32 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaPostTransactionBottomSheetDialogFragment32.f11882g0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    k kVar = mayaPostTransactionBottomSheetDialogFragment32.f11884i0;
                                    if (kVar != null) {
                                        kVar.k0();
                                    }
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment4 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment4.getClass();
                                    mayaPostTransactionBottomSheetDialogFragment4.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment5 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaPostTransactionBottomSheetDialogFragment5.f11880e0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment5.dismiss();
                                    return;
                                } finally {
                                }
                            case 3:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment6 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment7 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaPostTransactionBottomSheetDialogFragment7.f11881f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment7.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
            if (string2 != null) {
                final MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment4 = (MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get());
                mayaPostTransactionBottomSheetDialogFragment4.getClass();
                Button button5 = mayaPostTransactionBottomSheetDialogFragment4.f11875Z;
                if (button5 == null) {
                    j.n("mButtonSecondary");
                    throw null;
                }
                button5.setVisibility(0);
                Button button6 = mayaPostTransactionBottomSheetDialogFragment4.f11875Z;
                if (button6 == null) {
                    j.n("mButtonSecondary");
                    throw null;
                }
                button6.setText(string2);
                Button button7 = mayaPostTransactionBottomSheetDialogFragment4.f11875Z;
                if (button7 == null) {
                    j.n("mButtonSecondary");
                    throw null;
                }
                final int i10 = 4;
                button7.setOnClickListener(new View.OnClickListener(mayaPostTransactionBottomSheetDialogFragment4) { // from class: W6.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaPostTransactionBottomSheetDialogFragment f6322b;

                    {
                        this.f6322b = mayaPostTransactionBottomSheetDialogFragment4;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment32 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaPostTransactionBottomSheetDialogFragment32.f11882g0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    k kVar = mayaPostTransactionBottomSheetDialogFragment32.f11884i0;
                                    if (kVar != null) {
                                        kVar.k0();
                                    }
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment42 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment42.getClass();
                                    mayaPostTransactionBottomSheetDialogFragment42.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment5 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaPostTransactionBottomSheetDialogFragment5.f11880e0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment5.dismiss();
                                    return;
                                } finally {
                                }
                            case 3:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment6 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment7 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaPostTransactionBottomSheetDialogFragment7.f11881f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment7.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
            if (string3 != null) {
                final MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment5 = (MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get());
                mayaPostTransactionBottomSheetDialogFragment5.getClass();
                TextView textView5 = mayaPostTransactionBottomSheetDialogFragment5.f11876a0;
                if (textView5 == null) {
                    j.n("mTertiaryTextView");
                    throw null;
                }
                textView5.setVisibility(0);
                TextView textView6 = mayaPostTransactionBottomSheetDialogFragment5.f11876a0;
                if (textView6 == null) {
                    j.n("mTertiaryTextView");
                    throw null;
                }
                textView6.setText(string3);
                TextView textView7 = mayaPostTransactionBottomSheetDialogFragment5.f11876a0;
                if (textView7 == null) {
                    j.n("mTertiaryTextView");
                    throw null;
                }
                final int i11 = 1;
                textView7.setOnClickListener(new View.OnClickListener(mayaPostTransactionBottomSheetDialogFragment5) { // from class: W6.j

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaPostTransactionBottomSheetDialogFragment f6322b;

                    {
                        this.f6322b = mayaPostTransactionBottomSheetDialogFragment5;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment32 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaPostTransactionBottomSheetDialogFragment32.f11882g0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    k kVar = mayaPostTransactionBottomSheetDialogFragment32.f11884i0;
                                    if (kVar != null) {
                                        kVar.k0();
                                    }
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment42 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment42.getClass();
                                    mayaPostTransactionBottomSheetDialogFragment42.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment52 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaPostTransactionBottomSheetDialogFragment52.f11880e0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment52.dismiss();
                                    return;
                                } finally {
                                }
                            case 3:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment6 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaPostTransactionBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment7 = this.f6322b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaPostTransactionBottomSheetDialogFragment7.f11881f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaPostTransactionBottomSheetDialogFragment7.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
            switch (Q6.k.f5279a[favoriteStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).s1();
                    AppCompatTextView appCompatTextView = ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).f11873X;
                    if (appCompatTextView == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView.setVisibility(8);
                    break;
                    break;
                case 4:
                    ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).t1();
                    AppCompatTextView appCompatTextView2 = ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).f11873X;
                    if (appCompatTextView2 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView2.setVisibility(8);
                    break;
                    break;
                case 5:
                    ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).t1();
                    AppCompatTextView appCompatTextView3 = ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).f11873X;
                    if (appCompatTextView3 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView3.setVisibility(8);
                    break;
                    break;
                case 6:
                    MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment6 = (MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get());
                    Drawable drawable = ContextCompat.getDrawable(mayaPostTransactionBottomSheetDialogFragment6.requireContext(), R.drawable.maya_ic_information_primary_badge_light);
                    AppCompatTextView appCompatTextView4 = mayaPostTransactionBottomSheetDialogFragment6.f11873X;
                    if (appCompatTextView4 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    AppCompatTextView appCompatTextView5 = mayaPostTransactionBottomSheetDialogFragment6.f11873X;
                    if (appCompatTextView5 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView5.setText(mayaPostTransactionBottomSheetDialogFragment6.getString(R.string.maya_label_favorite_details_update_success));
                    AppCompatTextView appCompatTextView6 = ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).f11873X;
                    if (appCompatTextView6 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView6.setVisibility(0);
                    ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).s1();
                    break;
                    break;
                case 7:
                    MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment7 = (MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get());
                    Drawable drawable2 = ContextCompat.getDrawable(mayaPostTransactionBottomSheetDialogFragment7.requireContext(), R.drawable.maya_ic_information_error_badge);
                    AppCompatTextView appCompatTextView7 = mayaPostTransactionBottomSheetDialogFragment7.f11873X;
                    if (appCompatTextView7 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView7.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                    AppCompatTextView appCompatTextView8 = mayaPostTransactionBottomSheetDialogFragment7.f11873X;
                    if (appCompatTextView8 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView8.setText(mayaPostTransactionBottomSheetDialogFragment7.getString(R.string.maya_label_favorite_details_update_failed));
                    AppCompatTextView appCompatTextView9 = ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).f11873X;
                    if (appCompatTextView9 == null) {
                        j.n("mTextViewFavoriteUpdateStatus");
                        throw null;
                    }
                    appCompatTextView9.setVisibility(0);
                    ((MayaPostTransactionBottomSheetDialogFragment) ((e) c0327e.c.get())).s1();
                    break;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        AppCompatTextView appCompatTextView10 = this.f11872W;
        if (appCompatTextView10 == null) {
            j.n("mTextViewAddFavorite");
            throw null;
        }
        final int i12 = 0;
        appCompatTextView10.setOnClickListener(new View.OnClickListener(this) { // from class: W6.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPostTransactionBottomSheetDialogFragment f6322b;

            {
                this.f6322b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment32 = this.f6322b;
                        Callback.onClick_enter(view2);
                        try {
                            Function1 function1 = mayaPostTransactionBottomSheetDialogFragment32.f11882g0;
                            if (function1 != null) {
                                kotlin.jvm.internal.j.d(view2);
                                function1.invoke(view2);
                            }
                            k kVar = mayaPostTransactionBottomSheetDialogFragment32.f11884i0;
                            if (kVar != null) {
                                kVar.k0();
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment42 = this.f6322b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPostTransactionBottomSheetDialogFragment42.getClass();
                            mayaPostTransactionBottomSheetDialogFragment42.dismiss();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment52 = this.f6322b;
                        Callback.onClick_enter(view2);
                        try {
                            Function1 function12 = mayaPostTransactionBottomSheetDialogFragment52.f11880e0;
                            if (function12 != null) {
                                kotlin.jvm.internal.j.d(view2);
                                function12.invoke(view2);
                            }
                            mayaPostTransactionBottomSheetDialogFragment52.dismiss();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment62 = this.f6322b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPostTransactionBottomSheetDialogFragment62.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment72 = this.f6322b;
                        Callback.onClick_enter(view2);
                        try {
                            Function1 function13 = mayaPostTransactionBottomSheetDialogFragment72.f11881f0;
                            if (function13 != null) {
                                kotlin.jvm.internal.j.d(view2);
                                function13.invoke(view2);
                            }
                            mayaPostTransactionBottomSheetDialogFragment72.dismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return this.f11878c0;
    }

    public final void s1() {
        AppCompatTextView appCompatTextView = this.f11872W;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        } else {
            j.n("mTextViewAddFavorite");
            throw null;
        }
    }

    public final void t1() {
        AppCompatTextView appCompatTextView = this.f11872W;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        } else {
            j.n("mTextViewAddFavorite");
            throw null;
        }
    }
}
