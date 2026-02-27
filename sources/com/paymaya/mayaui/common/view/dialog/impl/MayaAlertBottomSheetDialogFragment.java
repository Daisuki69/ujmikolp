package com.paymaya.mayaui.common.view.dialog.impl;

import Fa.c;
import L9.C0327e;
import N5.C0466m;
import V6.a;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAlertBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0466m f11810S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ImageView f11811T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f11812U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f11813V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f11814W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f11815X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f11816Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f11817Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public EnumC1215d f11818a0 = EnumC1215d.DEFAULT;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f11819b0 = "MODULE";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public EnumC1216e f11820c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C0327e f11821d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Function1 f11822e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Function1 f11823f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Function1 f11824g0;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f11817Z) {
            C1219h c1219hM1 = m1();
            c1219hM1.q(this.f11819b0);
            c1219hM1.r(this.f11820c0);
            c1219hM1.i();
            this.f10327P = true;
        }
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10325B = (C1220i) ((O5.a) W4.a.e().a().c).f4716g.get();
        this.f11821d0 = new C0327e(20);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment.MayaAlertBottomSheetDialogFragmentListener");
        C0327e c0327e = this.f11821d0;
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
        dialogOnCreateDialog.setOnShowListener(new c(this, 23));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_alert_bottom_sheet, viewGroup, false);
        int i = R.id.button_primary;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_primary);
        if (button != null) {
            i = R.id.button_secondary;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_secondary);
            if (button2 != null) {
                i = R.id.image_view_head_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_head_image);
                if (imageView != null) {
                    i = R.id.tertiary_text_view;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tertiary_text_view);
                    if (textView != null) {
                        i = R.id.text_view_description;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                        if (textView2 != null) {
                            i = R.id.text_view_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                            if (textView3 != null) {
                                i = R.id.view_background_sheet;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_background_sheet);
                                if (viewFindChildViewById != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.f11810S = new C0466m((ViewGroup) constraintLayout, (View) button, (View) button2, (View) imageView, (View) textView, (View) textView2, (View) textView3, viewFindChildViewById, 1);
                                    j.f(constraintLayout, "getRoot(...)");
                                    return constraintLayout;
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
        C0327e c0327e = this.f11821d0;
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
        this.f11810S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f11810S;
        j.d(c0466m);
        this.f11811T = (ImageView) c0466m.f;
        C0466m c0466m2 = this.f11810S;
        j.d(c0466m2);
        this.f11812U = (TextView) c0466m2.i;
        C0466m c0466m3 = this.f11810S;
        j.d(c0466m3);
        this.f11813V = (TextView) c0466m3.h;
        C0466m c0466m4 = this.f11810S;
        j.d(c0466m4);
        this.f11814W = (Button) c0466m4.c;
        C0466m c0466m5 = this.f11810S;
        j.d(c0466m5);
        this.f11815X = (Button) c0466m5.e;
        C0466m c0466m6 = this.f11810S;
        j.d(c0466m6);
        this.f11816Y = (TextView) c0466m6.f4152g;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("image_res_id");
            CharSequence charSequence = arguments.getCharSequence("title");
            CharSequence charSequence2 = arguments.getCharSequence("description");
            String string = arguments.getString("primary_value");
            String string2 = arguments.getString("secondary_value");
            String string3 = arguments.getString("tertiary_value");
            ImageView imageView = this.f11811T;
            if (imageView == null) {
                j.n("mImageViewHeadImage");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), i));
            TextView textView = this.f11812U;
            if (textView == null) {
                j.n("mTextViewTitle");
                throw null;
            }
            textView.setText(charSequence);
            C0327e c0327e = this.f11821d0;
            if (c0327e == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            if (charSequence2 == null || C2576A.H(charSequence2)) {
                TextView textView2 = ((MayaAlertBottomSheetDialogFragment) ((a) c0327e.c.get())).f11813V;
                if (textView2 == null) {
                    j.n("mTextViewDescription");
                    throw null;
                }
                textView2.setVisibility(8);
            } else {
                TextView textView3 = ((MayaAlertBottomSheetDialogFragment) ((a) c0327e.c.get())).f11813V;
                if (textView3 == null) {
                    j.n("mTextViewDescription");
                    throw null;
                }
                textView3.setVisibility(0);
                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment = (MayaAlertBottomSheetDialogFragment) ((a) c0327e.c.get());
                mayaAlertBottomSheetDialogFragment.getClass();
                TextView textView4 = mayaAlertBottomSheetDialogFragment.f11813V;
                if (textView4 == null) {
                    j.n("mTextViewDescription");
                    throw null;
                }
                textView4.setText(Html.fromHtml(charSequence2.toString()));
            }
            if (string == null) {
                final MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment2 = (MayaAlertBottomSheetDialogFragment) ((a) c0327e.c.get());
                Button button = mayaAlertBottomSheetDialogFragment2.f11814W;
                if (button == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                button.setText(mayaAlertBottomSheetDialogFragment2.getString(R.string.pma_label_got_it));
                Button button2 = mayaAlertBottomSheetDialogFragment2.f11814W;
                if (button2 == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                final int i4 = 3;
                button2.setOnClickListener(new View.OnClickListener(mayaAlertBottomSheetDialogFragment2) { // from class: W6.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaAlertBottomSheetDialogFragment f6318b;

                    {
                        this.f6318b = mayaAlertBottomSheetDialogFragment2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment3 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaAlertBottomSheetDialogFragment3.f11822e0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment3.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment4 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaAlertBottomSheetDialogFragment4.f11824g0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment4.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment5 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaAlertBottomSheetDialogFragment5.f11823f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment5.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment6 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaAlertBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            } else {
                final MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment3 = (MayaAlertBottomSheetDialogFragment) ((a) c0327e.c.get());
                mayaAlertBottomSheetDialogFragment3.getClass();
                Button button3 = mayaAlertBottomSheetDialogFragment3.f11814W;
                if (button3 == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                button3.setText(string);
                Button button4 = mayaAlertBottomSheetDialogFragment3.f11814W;
                if (button4 == null) {
                    j.n("mButtonPrimary");
                    throw null;
                }
                final int i6 = 0;
                button4.setOnClickListener(new View.OnClickListener(mayaAlertBottomSheetDialogFragment3) { // from class: W6.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaAlertBottomSheetDialogFragment f6318b;

                    {
                        this.f6318b = mayaAlertBottomSheetDialogFragment3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i6) {
                            case 0:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment32 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaAlertBottomSheetDialogFragment32.f11822e0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment32.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment4 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaAlertBottomSheetDialogFragment4.f11824g0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment4.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment5 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaAlertBottomSheetDialogFragment5.f11823f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment5.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment6 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaAlertBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
            if (string2 != null) {
                final MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment4 = (MayaAlertBottomSheetDialogFragment) ((a) c0327e.c.get());
                mayaAlertBottomSheetDialogFragment4.getClass();
                Button button5 = mayaAlertBottomSheetDialogFragment4.f11815X;
                if (button5 == null) {
                    j.n("mButtonSecondary");
                    throw null;
                }
                button5.setVisibility(0);
                Button button6 = mayaAlertBottomSheetDialogFragment4.f11815X;
                if (button6 == null) {
                    j.n("mButtonSecondary");
                    throw null;
                }
                button6.setText(string2);
                Button button7 = mayaAlertBottomSheetDialogFragment4.f11815X;
                if (button7 == null) {
                    j.n("mButtonSecondary");
                    throw null;
                }
                final int i10 = 2;
                button7.setOnClickListener(new View.OnClickListener(mayaAlertBottomSheetDialogFragment4) { // from class: W6.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaAlertBottomSheetDialogFragment f6318b;

                    {
                        this.f6318b = mayaAlertBottomSheetDialogFragment4;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment32 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaAlertBottomSheetDialogFragment32.f11822e0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment32.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment42 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaAlertBottomSheetDialogFragment42.f11824g0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment42.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment5 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaAlertBottomSheetDialogFragment5.f11823f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment5.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment6 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaAlertBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
            if (string3 != null) {
                final MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment5 = (MayaAlertBottomSheetDialogFragment) ((a) c0327e.c.get());
                mayaAlertBottomSheetDialogFragment5.getClass();
                TextView textView5 = mayaAlertBottomSheetDialogFragment5.f11816Y;
                if (textView5 == null) {
                    j.n("mTertiaryTextView");
                    throw null;
                }
                textView5.setVisibility(0);
                TextView textView6 = mayaAlertBottomSheetDialogFragment5.f11816Y;
                if (textView6 == null) {
                    j.n("mTertiaryTextView");
                    throw null;
                }
                textView6.setText(string3);
                TextView textView7 = mayaAlertBottomSheetDialogFragment5.f11816Y;
                if (textView7 == null) {
                    j.n("mTertiaryTextView");
                    throw null;
                }
                final int i11 = 1;
                textView7.setOnClickListener(new View.OnClickListener(mayaAlertBottomSheetDialogFragment5) { // from class: W6.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaAlertBottomSheetDialogFragment f6318b;

                    {
                        this.f6318b = mayaAlertBottomSheetDialogFragment5;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment32 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaAlertBottomSheetDialogFragment32.f11822e0;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment32.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment42 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaAlertBottomSheetDialogFragment42.f11824g0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment42.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment52 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function13 = mayaAlertBottomSheetDialogFragment52.f11823f0;
                                    if (function13 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function13.invoke(view2);
                                    }
                                    mayaAlertBottomSheetDialogFragment52.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment6 = this.f6318b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaAlertBottomSheetDialogFragment6.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
        }
    }

    public final void s1(EnumC1215d value) {
        j.g(value, "value");
        this.f11818a0 = value;
        String str = value.f10786a;
        this.f11817Z = true;
        this.f11819b0 = str;
    }
}
