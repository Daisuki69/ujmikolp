package J6;

import G6.r;
import M6.i;
import M6.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.BankPullListItem;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.LinkedPaymentOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import w.C2360b;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter {
    public static final /* synthetic */ KProperty[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseFragment f2419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2420b = new ArrayList();
    public final int c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A7.f f2421d = new A7.f(this);

    static {
        m mVar = new m(b.class, "isExpanded", "isExpanded()Z", 0);
        z.f18196a.getClass();
        e = new KProperty[]{mVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f2419a = (MayaBaseFragment) aVar;
    }

    public final void e(boolean z4) {
        KProperty property = e[0];
        Boolean boolValueOf = Boolean.valueOf(z4);
        A7.f fVar = this.f2421d;
        fVar.getClass();
        j.g(property, "property");
        fVar.f210b = boolValueOf;
        b bVar = (b) fVar.c;
        if (z4) {
            bVar.notifyItemRangeInserted(bVar.c, bVar.f2420b.size());
            bVar.notifyItemChanged(0);
        } else {
            bVar.notifyItemRangeRemoved(bVar.c, bVar.f2420b.size());
            bVar.notifyItemChanged(0);
        }
    }

    public final void f(List newPaymentOptionList) {
        j.g(newPaymentOptionList, "newPaymentOptionList");
        ArrayList oldList = this.f2420b;
        j.g(oldList, "oldList");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new N6.d(oldList, newPaymentOptionList));
        j.f(diffResultCalculateDiff, "calculateDiff(...)");
        oldList.clear();
        oldList.addAll(newPaymentOptionList);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (((Boolean) this.f2421d.getValue(this, e[0])).booleanValue()) {
            return this.f2420b.size();
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((BankPullListItem) this.f2420b.get(i)).getItemId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        String lastFourDigits;
        final int i4 = 2;
        final int i6 = 1;
        final int i10 = 0;
        j.g(holder, "holder");
        BankPullListItem bankPullListItem = (BankPullListItem) this.f2420b.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullHeader");
            M6.a aVar = (M6.a) holder;
            boolean zBooleanValue = ((Boolean) this.f2421d.getValue(this, e[0])).booleanValue();
            String title = ((BankPullListItem.BankPullHeader) bankPullListItem).getTitle();
            j.g(title, "title");
            J5.a aVar2 = aVar.f3090d;
            aVar2.getClass();
            M6.a aVar3 = (M6.a) aVar2.f2414b;
            aVar3.c.setText(title);
            ImageView imageView = aVar3.f3089b;
            if (zBooleanValue) {
                imageView.setImageDrawable(ContextCompat.getDrawable(aVar3.itemView.getContext(), R.drawable.maya_ic_chevron_up_green));
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(aVar3.itemView.getContext(), R.drawable.maya_ic_chevron_down_green));
            }
            aVar.itemView.setOnClickListener(new Ba.a(aVar, 26));
            return;
        }
        if (itemViewType == 1) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullItem");
            BankPullListItem.BankPullItem bankPullItem = (BankPullListItem.BankPullItem) bankPullListItem;
            final k kVar = (k) holder;
            final BankPullPaymentOption bankPullListItem2 = bankPullItem.getPaymentOption();
            boolean hasReachedMaxLimit = bankPullItem.getHasReachedMaxLimit();
            j.g(bankPullListItem2, "bankPullListItem");
            kVar.f3120g = hasReachedMaxLimit;
            C2360b c2360b = kVar.f;
            c2360b.getClass();
            c2360b.d(bankPullListItem2);
            String name = bankPullListItem2.getName();
            k kVar2 = (k) c2360b.f20516b;
            j.g(name, "name");
            kVar2.c.setText(name);
            kVar2.e.setImageDrawable(ContextCompat.getDrawable(kVar2.itemView.getContext(), R.drawable.maya_ic_service_help_grey_arrow));
            kVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: M6.j
                /* JADX WARN: Type inference failed for: r3v2, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference failed for: r3v4, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference failed for: r3v6, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            k kVar3 = kVar;
                            BankPullPaymentOption bankPullPaymentOption = bankPullListItem2;
                            Callback.onClick_enter(view);
                            try {
                                kVar3.f3117a.a1(bankPullPaymentOption);
                                return;
                            } finally {
                            }
                        case 1:
                            k kVar4 = kVar;
                            BankPullPaymentOption bankPullPaymentOption2 = bankPullListItem2;
                            Callback.onClick_enter(view);
                            try {
                                kVar4.f3117a.a1(bankPullPaymentOption2);
                                return;
                            } finally {
                            }
                        default:
                            k kVar5 = kVar;
                            BankPullPaymentOption bankPullPaymentOption3 = bankPullListItem2;
                            Callback.onClick_enter(view);
                            try {
                                kVar5.f3117a.y0(kVar5.getAbsoluteAdapterPosition(), bankPullPaymentOption3);
                                return;
                            } finally {
                            }
                    }
                }
            });
            return;
        }
        if (itemViewType == 2) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullLinked");
            k kVar3 = (k) holder;
            List<BankPullPaymentOption> paymentOptionList = ((BankPullListItem.BankPullLinked) bankPullListItem).getLinkedPaymentOptionList();
            j.g(paymentOptionList, "paymentOptionList");
            kVar3.f3120g = false;
            C2360b c2360b2 = kVar3.f;
            c2360b2.getClass();
            BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) C1110A.A(paymentOptionList);
            int size = paymentOptionList.size();
            k kVar4 = (k) c2360b2.f20516b;
            String quantityString = kVar4.itemView.getResources().getQuantityString(R.plurals.maya_format_bank_pull_linked_option_with_count, size, Integer.valueOf(size));
            TextView textView = kVar4.f3119d;
            textView.setText(quantityString);
            c2360b2.d(bankPullPaymentOption);
            String name2 = bankPullPaymentOption.getName();
            j.g(name2, "name");
            kVar4.c.setText(name2);
            textView.setVisibility(0);
            kVar4.e.setImageDrawable(ContextCompat.getDrawable(kVar4.itemView.getContext(), R.drawable.maya_ic_service_help_grey_arrow));
            kVar3.itemView.setOnClickListener(new Ad.a(16, kVar3, paymentOptionList));
            return;
        }
        if (itemViewType == 3) {
            j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullLinkedItem");
            final k kVar5 = (k) holder;
            final BankPullPaymentOption paymentOption = ((BankPullListItem.BankPullLinkedItem) bankPullListItem).getPaymentOption();
            j.g(paymentOption, "paymentOption");
            kVar5.f3120g = false;
            C2360b c2360b3 = kVar5.f;
            c2360b3.getClass();
            c2360b3.d(paymentOption);
            LinkedPaymentOption paymentOption2 = paymentOption.getPaymentOption();
            k kVar6 = (k) c2360b3.f20516b;
            TextView textView2 = kVar6.f3119d;
            if (paymentOption2 != null) {
                LinkedPaymentOption paymentOption3 = paymentOption.getPaymentOption();
                if (paymentOption3 != null && (lastFourDigits = paymentOption3.getLastFourDigits()) != null) {
                    kVar6.c.setText(kVar6.itemView.getContext().getString(R.string.maya_format_bank_pull_last_four_digits, lastFourDigits));
                }
                textView2.setText(paymentOption.getName());
            }
            textView2.setVisibility(0);
            kVar6.e.setImageDrawable(ContextCompat.getDrawable(kVar6.itemView.getContext(), R.drawable.maya_ic_menu_dots_horizontal));
            kVar5.itemView.setOnClickListener(new View.OnClickListener() { // from class: M6.j
                /* JADX WARN: Type inference failed for: r3v2, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference failed for: r3v4, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference failed for: r3v6, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            k kVar32 = kVar5;
                            BankPullPaymentOption bankPullPaymentOption2 = paymentOption;
                            Callback.onClick_enter(view);
                            try {
                                kVar32.f3117a.a1(bankPullPaymentOption2);
                                return;
                            } finally {
                            }
                        case 1:
                            k kVar42 = kVar5;
                            BankPullPaymentOption bankPullPaymentOption22 = paymentOption;
                            Callback.onClick_enter(view);
                            try {
                                kVar42.f3117a.a1(bankPullPaymentOption22);
                                return;
                            } finally {
                            }
                        default:
                            k kVar52 = kVar5;
                            BankPullPaymentOption bankPullPaymentOption3 = paymentOption;
                            Callback.onClick_enter(view);
                            try {
                                kVar52.f3117a.y0(kVar52.getAbsoluteAdapterPosition(), bankPullPaymentOption3);
                                return;
                            } finally {
                            }
                    }
                }
            });
            kVar5.e.setOnClickListener(new View.OnClickListener() { // from class: M6.j
                /* JADX WARN: Type inference failed for: r3v2, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference failed for: r3v4, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference failed for: r3v6, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            k kVar32 = kVar5;
                            BankPullPaymentOption bankPullPaymentOption2 = paymentOption;
                            Callback.onClick_enter(view);
                            try {
                                kVar32.f3117a.a1(bankPullPaymentOption2);
                                return;
                            } finally {
                            }
                        case 1:
                            k kVar42 = kVar5;
                            BankPullPaymentOption bankPullPaymentOption22 = paymentOption;
                            Callback.onClick_enter(view);
                            try {
                                kVar42.f3117a.a1(bankPullPaymentOption22);
                                return;
                            } finally {
                            }
                        default:
                            k kVar52 = kVar5;
                            BankPullPaymentOption bankPullPaymentOption3 = paymentOption;
                            Callback.onClick_enter(view);
                            try {
                                kVar52.f3117a.y0(kVar52.getAbsoluteAdapterPosition(), bankPullPaymentOption3);
                                return;
                            } finally {
                            }
                    }
                }
            });
            return;
        }
        if (itemViewType != 4) {
            return;
        }
        j.e(bankPullListItem, "null cannot be cast to non-null type com.paymaya.domain.model.BankPullListItem.BankPullNewLinked");
        final i iVar = (i) holder;
        final BankPullPaymentOption bankPullListItem3 = ((BankPullListItem.BankPullNewLinked) bankPullListItem).getLinkedPaymentOption();
        j.g(bankPullListItem3, "bankPullListItem");
        C2361c c2361c = iVar.i;
        c2361c.getClass();
        String name3 = bankPullListItem3.getName();
        i iVar2 = (i) c2361c.f20518b;
        j.g(name3, "name");
        iVar2.c.setText(name3);
        LinkedPaymentOption paymentOption4 = bankPullListItem3.getPaymentOption();
        TextView textView3 = iVar2.f3113d;
        if (paymentOption4 != null) {
            String lastFourDigitsString = paymentOption4.getLastFourDigits();
            j.g(lastFourDigitsString, "lastFourDigitsString");
            textView3.setText(iVar2.itemView.getContext().getString(R.string.maya_format_bank_pull_last_four_digits_v2, lastFourDigitsString));
        }
        textView3.setVisibility(0);
        iVar2.e.setImageDrawable(ContextCompat.getDrawable(iVar2.itemView.getContext(), R.drawable.maya_ic_service_help_grey_arrow));
        ImageUrlUnfiltered iconUrl = bankPullListItem3.getIconUrl();
        String strO = iconUrl != null ? C.O(iconUrl.mAndroidImageUrl()) : null;
        int dimensionPixelSize = iVar2.itemView.getResources().getDimensionPixelSize(R.dimen.maya_cash_in_bank_pull_logo_size);
        C.c0(strO, R.drawable.maya_ic_bank_placeholder, iVar2.f3112b, dimensionPixelSize, dimensionPixelSize, iVar2.itemView.getResources().getDimensionPixelSize(R.dimen.pma_stroke_width_normal));
        iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: M6.h
            /* JADX WARN: Type inference failed for: r3v2, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
            /* JADX WARN: Type inference failed for: r3v4, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i iVar3 = iVar;
                        BankPullPaymentOption bankPullPaymentOption2 = bankPullListItem3;
                        Callback.onClick_enter(view);
                        try {
                            iVar3.f3111a.a1(bankPullPaymentOption2);
                            return;
                        } finally {
                        }
                    default:
                        i iVar4 = iVar;
                        BankPullPaymentOption bankPullPaymentOption3 = bankPullListItem3;
                        Callback.onClick_enter(view);
                        try {
                            iVar4.f3111a.y0(iVar4.getAbsoluteAdapterPosition(), bankPullPaymentOption3);
                            return;
                        } finally {
                        }
                }
            }
        });
        iVar.f.setOnClickListener(new View.OnClickListener() { // from class: M6.h
            /* JADX WARN: Type inference failed for: r3v2, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
            /* JADX WARN: Type inference failed for: r3v4, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        i iVar3 = iVar;
                        BankPullPaymentOption bankPullPaymentOption2 = bankPullListItem3;
                        Callback.onClick_enter(view);
                        try {
                            iVar3.f3111a.a1(bankPullPaymentOption2);
                            return;
                        } finally {
                        }
                    default:
                        i iVar4 = iVar;
                        BankPullPaymentOption bankPullPaymentOption3 = bankPullListItem3;
                        Callback.onClick_enter(view);
                        try {
                            iVar4.f3111a.y0(iVar4.getAbsoluteAdapterPosition(), bankPullPaymentOption3);
                            return;
                        } finally {
                        }
                }
            }
        });
        iVar.h.setItemSlideLayoutListener(new r(iVar, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[PHI: r1
  0x00be: PHI (r1v19 int) = (r1v18 int), (r1v21 int), (r1v22 int), (r1v23 int) binds: [B:13:0x003d, B:15:0x0049, B:17:0x0055, B:19:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r21, int r22) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J6.b.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
