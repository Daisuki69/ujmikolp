package r6;

import N5.k1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.domain.model.Bank;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import i8.C1593a;
import kotlin.jvm.internal.j;
import u6.InterfaceC2303a;
import v6.C2343a;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBankTransferListFragment f19877a;

    public b(MayaBankTransferListFragment mayaBankTransferListFragment) {
        super(new C2383a());
        this.f19877a = mayaBankTransferListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C2343a holder = (C2343a) viewHolder;
        j.g(holder, "holder");
        Bank bank = (Bank) getItem(i);
        j.d(bank);
        holder.f20480d = bank;
        C1593a c1593a = holder.f;
        c1593a.getClass();
        InterfaceC2303a interfaceC2303a = (InterfaceC2303a) c1593a.c.get();
        ((C2343a) interfaceC2303a).f20478a.setText(bank.mBankName());
        if (j.b(bank.mIsMaintenance(), Boolean.TRUE)) {
            C2343a c2343a = (C2343a) ((InterfaceC2303a) c1593a.c.get());
            AppCompatTextView appCompatTextView = c2343a.f20479b;
            appCompatTextView.setVisibility(0);
            appCompatTextView.setAlpha(0.5f);
            c2343a.f20478a.setAlpha(0.5f);
            c2343a.c.setAlpha(0.4f);
            return;
        }
        C2343a c2343a2 = (C2343a) ((InterfaceC2303a) c1593a.c.get());
        AppCompatTextView appCompatTextView2 = c2343a2.f20479b;
        appCompatTextView2.setVisibility(8);
        appCompatTextView2.setAlpha(1.0f);
        c2343a2.f20478a.setAlpha(1.0f);
        c2343a2.c.setAlpha(1.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        int i4 = C2343a.f20477g;
        MayaBankTransferListFragment bankNameViewHolderListener = this.f19877a;
        j.g(bankNameViewHolderListener, "bankNameViewHolderListener");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.maya_view_holder_bank_transfer_list_bank_name, parent, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i6 = R.id.image_view_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_arrow);
        if (appCompatImageView != null) {
            i6 = R.id.text_view_bank_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_bank_name);
            if (appCompatTextView != null) {
                i6 = R.id.text_view_maintenance;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maintenance);
                if (appCompatTextView2 != null) {
                    return new C2343a(new k1((ViewGroup) constraintLayout, (Object) constraintLayout, (Object) appCompatImageView, (Object) appCompatTextView, (Object) appCompatTextView2, 2), bankNameViewHolderListener);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
    }
}
