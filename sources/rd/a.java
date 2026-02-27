package Rd;

import Bb.f;
import N5.r1;
import Vd.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditActivationFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaCreditActivationFragment f5488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5489b = new ArrayList();
    public boolean c;

    public a(MayaCreditActivationFragment mayaCreditActivationFragment) {
        this.f5488a = mayaCreditActivationFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5489b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        Boolean boolIsItemChecked;
        final b holder = (b) viewHolder;
        j.g(holder, "holder");
        final CreditAgreement creditAgreement = (CreditAgreement) this.f5489b.get(i);
        j.g(creditAgreement, "creditAgreement");
        f fVar = holder.e;
        fVar.getClass();
        fVar.e = creditAgreement;
        Ud.a aVar = (Ud.a) fVar.c.get();
        CreditAgreement creditAgreement2 = (CreditAgreement) fVar.e;
        ((b) aVar).f6099b.setText(creditAgreement2 != null ? creditAgreement2.getHeading() : null);
        Ud.a aVar2 = (Ud.a) fVar.c.get();
        CreditAgreement creditAgreement3 = (CreditAgreement) fVar.e;
        ((b) aVar2).c.setText(creditAgreement3 != null ? creditAgreement3.getSubheading() : null);
        Ud.a aVar3 = (Ud.a) fVar.c.get();
        CreditAgreement creditAgreement4 = (CreditAgreement) fVar.e;
        boolean zBooleanValue = (creditAgreement4 == null || (boolIsItemChecked = creditAgreement4.isItemChecked()) == null) ? false : boolIsItemChecked.booleanValue();
        b bVar = (b) aVar3;
        AppCompatCheckBox appCompatCheckBox = bVar.f6100d;
        if (zBooleanValue) {
            appCompatCheckBox.setButtonDrawable(ResourcesCompat.getDrawable(bVar.f.getResources(), R.drawable.pma_selectable_background_checkbox_green, null));
        }
        appCompatCheckBox.setChecked(zBooleanValue);
        final int i4 = 0;
        holder.f6099b.setOnClickListener(new View.OnClickListener(holder, i, creditAgreement, i4) { // from class: Vd.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6095a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f6096b;
            public final /* synthetic */ CreditAgreement c;

            {
                this.f6095a = i4;
                this.c = creditAgreement;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f6095a) {
                    case 0:
                        b bVar2 = this.f6096b;
                        CreditAgreement creditAgreement5 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            bVar2.e.y(creditAgreement5);
                            return;
                        } finally {
                        }
                    case 1:
                        b bVar3 = this.f6096b;
                        CreditAgreement creditAgreement6 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            bVar3.e.y(creditAgreement6);
                            return;
                        } finally {
                        }
                    default:
                        b bVar4 = this.f6096b;
                        CreditAgreement creditAgreement7 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            b.E(bVar4, creditAgreement7, view);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i6 = 1;
        holder.c.setOnClickListener(new View.OnClickListener(holder, i, creditAgreement, i6) { // from class: Vd.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6095a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f6096b;
            public final /* synthetic */ CreditAgreement c;

            {
                this.f6095a = i6;
                this.c = creditAgreement;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f6095a) {
                    case 0:
                        b bVar2 = this.f6096b;
                        CreditAgreement creditAgreement5 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            bVar2.e.y(creditAgreement5);
                            return;
                        } finally {
                        }
                    case 1:
                        b bVar3 = this.f6096b;
                        CreditAgreement creditAgreement6 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            bVar3.e.y(creditAgreement6);
                            return;
                        } finally {
                        }
                    default:
                        b bVar4 = this.f6096b;
                        CreditAgreement creditAgreement7 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            b.E(bVar4, creditAgreement7, view);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i10 = 2;
        holder.f6100d.setOnClickListener(new View.OnClickListener(holder, i, creditAgreement, i10) { // from class: Vd.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6095a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f6096b;
            public final /* synthetic */ CreditAgreement c;

            {
                this.f6095a = i10;
                this.c = creditAgreement;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f6095a) {
                    case 0:
                        b bVar2 = this.f6096b;
                        CreditAgreement creditAgreement5 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            bVar2.e.y(creditAgreement5);
                            return;
                        } finally {
                        }
                    case 1:
                        b bVar3 = this.f6096b;
                        CreditAgreement creditAgreement6 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            bVar3.e.y(creditAgreement6);
                            return;
                        } finally {
                        }
                    default:
                        b bVar4 = this.f6096b;
                        CreditAgreement creditAgreement7 = this.c;
                        Callback.onClick_enter(view);
                        try {
                            b.E(bVar4, creditAgreement7, view);
                            return;
                        } finally {
                        }
                }
            }
        });
        if (this.c) {
            if (creditAgreement.isValid()) {
                holder.f6100d.setButtonDrawable(ResourcesCompat.getDrawable(holder.f.getResources(), R.drawable.pma_selectable_background_checkbox_green, null));
            } else {
                holder.f6100d.setButtonDrawable(ResourcesCompat.getDrawable(holder.f.getResources(), R.drawable.pma_ic_checkbox_state_error, null));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.pma_view_holder_agreement_item, parent, false);
        int i4 = R.id.agreement_checkbox_view_pma_view_holder_agreement_item;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(viewInflate, R.id.agreement_checkbox_view_pma_view_holder_agreement_item);
        if (appCompatCheckBox != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i4 = R.id.heading_text_view_pma_view_holder_agreement_item;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.heading_text_view_pma_view_holder_agreement_item);
            if (textView != null) {
                i4 = R.id.subheading_text_description_view_pma_view_holder_agreement_item;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.subheading_text_description_view_pma_view_holder_agreement_item);
                if (textView2 != null) {
                    r1 r1Var = new r1((ViewGroup) constraintLayout, (View) appCompatCheckBox, (View) textView, (View) textView2, 9);
                    int i6 = b.f6097g;
                    MayaCreditActivationFragment listener = this.f5488a;
                    j.g(listener, "listener");
                    return new b(r1Var, listener);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }
}
