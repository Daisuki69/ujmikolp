package com.paymaya.mayaui.common.view.dialog.impl;

import Fa.c;
import L9.C0327e;
import N5.C0491z;
import Q6.n;
import U6.a;
import V6.b;
import a7.C0652m;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import cj.t;
import com.paymaya.R;
import com.paymaya.common.base.BaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.MayaChoicesStringItem;
import com.paymaya.domain.model.Stop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaChoicesBottomSheetDialogFragment extends BaseBottomSheetDialogFragment implements b {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0491z f11825Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public NestedScrollView f11826R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public RecyclerView f11827S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f11828T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f11829U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public String f11830V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0327e f11831W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public a f11832X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f11833Y = R.style.JekoOverlineBig_Tertiary;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f11834Z = R.style.JekoSemiBoldTextBody_Primary;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f11835a0 = R.drawable.maya_bg_content_border;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Stop f11836b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f11837c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f11838d0;

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10238B = (C1220i) ((O5.a) W4.a.e().a().c).f4716g.get();
        this.f11831W = new C0327e(22);
        C0327e c0327e = this.f11831W;
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
        dialogOnCreateDialog.setOnShowListener(new c(this, 24));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_choices_bottom_sheet, viewGroup, false);
        int i = R.id.cancel_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.cancel_button);
        if (button != null) {
            i = R.id.image_view_info;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_info);
            if (appCompatImageView != null) {
                i = R.id.recycler_view_choices;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_choices);
                if (recyclerView != null) {
                    i = R.id.scroll_view_choices;
                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_choices);
                    if (nestedScrollView != null) {
                        i = R.id.text_view_info_desc;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_info_desc);
                        if (textView != null) {
                            i = R.id.text_view_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f11825Q = new C0491z(constraintLayout, button, appCompatImageView, recyclerView, nestedScrollView, textView, textView2, 0);
                                j.f(constraintLayout, "getRoot(...)");
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f11831W;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11825Q = null;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f11825Q;
        j.d(c0491z);
        this.f11826R = (NestedScrollView) c0491z.f4305g;
        C0491z c0491z2 = this.f11825Q;
        j.d(c0491z2);
        this.f11828T = (TextView) c0491z2.h;
        C0491z c0491z3 = this.f11825Q;
        j.d(c0491z3);
        this.f11829U = (Button) c0491z3.c;
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("truncate_text") : -1;
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        a aVar = new a(contextRequireContext, new n(this, 6), i);
        aVar.e = this.f11833Y;
        aVar.f = this.f11834Z;
        aVar.f5949g = this.f11835a0;
        aVar.h = this.f11836b0;
        aVar.i = this.f11837c0;
        this.f11832X = aVar;
        C0491z c0491z4 = this.f11825Q;
        j.d(c0491z4);
        this.f11827S = (RecyclerView) c0491z4.f;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        RecyclerView recyclerView = this.f11827S;
        if (recyclerView == null) {
            j.n("mRecyclerViewChoices");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.f11827S;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewChoices");
            throw null;
        }
        recyclerView2.setAdapter(this.f11832X);
        NestedScrollView nestedScrollView = this.f11826R;
        if (nestedScrollView == null) {
            j.n("mScrollView");
            throw null;
        }
        nestedScrollView.setVerticalScrollBarEnabled(this.f11838d0);
        Button button = this.f11829U;
        if (button == null) {
            j.n("mCancelButton");
            throw null;
        }
        button.setOnClickListener(new S.b(this, 19));
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string = arguments2.getString("title");
            ArrayList<String> stringArrayList = arguments2.getStringArrayList("string_values");
            List list = arguments2.getParcelableArrayList("model_values");
            boolean z4 = arguments2.getBoolean("show_cancel");
            String string2 = arguments2.getString("info_desc_text");
            C0327e c0327e = this.f11831W;
            if (c0327e == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            c0327e.j();
            TextView textView = ((MayaChoicesBottomSheetDialogFragment) ((b) c0327e.c.get())).f11828T;
            if (textView == null) {
                j.n("mTextViewTitle");
                throw null;
            }
            textView.setText(string);
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                b bVar = (b) c0327e.c.get();
                if (list == null) {
                    list = C1112C.f9377a;
                }
                MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment = (MayaChoicesBottomSheetDialogFragment) bVar;
                mayaChoicesBottomSheetDialogFragment.getClass();
                j.g(list, "list");
                a aVar2 = mayaChoicesBottomSheetDialogFragment.f11832X;
                if (aVar2 != null) {
                    List oldList = aVar2.f5947b;
                    j.g(oldList, "oldList");
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C0652m(oldList, list));
                    j.f(diffResultCalculateDiff, "calculateDiff(...)");
                    oldList.clear();
                    oldList.addAll(list);
                    diffResultCalculateDiff.dispatchUpdatesTo(aVar2);
                }
            } else {
                MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment2 = (MayaChoicesBottomSheetDialogFragment) ((b) c0327e.c.get());
                mayaChoicesBottomSheetDialogFragment2.getClass();
                a aVar3 = mayaChoicesBottomSheetDialogFragment2.f11832X;
                if (aVar3 != null) {
                    ArrayList arrayList = new ArrayList(t.l(stringArrayList, 10));
                    Iterator<T> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new MayaChoicesStringItem((String) it.next(), 0, 2, null));
                    }
                    List oldList2 = aVar3.f5947b;
                    j.g(oldList2, "oldList");
                    DiffUtil.DiffResult diffResultCalculateDiff2 = DiffUtil.calculateDiff(new C0652m(oldList2, arrayList));
                    j.f(diffResultCalculateDiff2, "calculateDiff(...)");
                    oldList2.clear();
                    oldList2.addAll(arrayList);
                    diffResultCalculateDiff2.dispatchUpdatesTo(aVar3);
                }
            }
            if (z4) {
                MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment3 = (MayaChoicesBottomSheetDialogFragment) ((b) c0327e.c.get());
                Button button2 = mayaChoicesBottomSheetDialogFragment3.f11829U;
                if (button2 == null) {
                    j.n("mCancelButton");
                    throw null;
                }
                button2.setVisibility(0);
                RecyclerView recyclerView3 = mayaChoicesBottomSheetDialogFragment3.f11827S;
                if (recyclerView3 == null) {
                    j.n("mRecyclerViewChoices");
                    throw null;
                }
                recyclerView3.setPadding(0, 0, 0, 12);
            }
            if (string2 != null) {
                MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment4 = (MayaChoicesBottomSheetDialogFragment) ((b) c0327e.c.get());
                mayaChoicesBottomSheetDialogFragment4.getClass();
                C0491z c0491z5 = mayaChoicesBottomSheetDialogFragment4.f11825Q;
                j.d(c0491z5);
                ((TextView) c0491z5.f4304d).setText(string2);
                C0491z c0491z6 = mayaChoicesBottomSheetDialogFragment4.f11825Q;
                j.d(c0491z6);
                ((AppCompatImageView) c0491z6.e).setVisibility(0);
                C0491z c0491z7 = mayaChoicesBottomSheetDialogFragment4.f11825Q;
                j.d(c0491z7);
                ((TextView) c0491z7.f4304d).setVisibility(0);
            }
        }
    }
}
