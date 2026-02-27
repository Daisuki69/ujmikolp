package S9;

import G6.r;
import N5.s1;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f5687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5688b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f5689d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f5690g;
    public final Context h;
    public final r i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s1 s1Var, a mViewHolderListener) {
        super(s1Var.f4206b);
        j.g(mViewHolderListener, "mViewHolderListener");
        ConstraintLayout constraintLayoutContainer = s1Var.c;
        j.f(constraintLayoutContainer, "constraintLayoutContainer");
        this.f5687a = constraintLayoutContainer;
        this.f5688b = s1Var.f;
        this.c = s1Var.f4209k;
        this.f5689d = s1Var.h;
        this.e = s1Var.f4208g;
        this.f = s1Var.i;
        this.f5690g = s1Var.j;
        Context context = constraintLayoutContainer.getContext();
        j.f(context, "getContext(...)");
        this.h = context;
        this.i = new r(this, 11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(com.paymaya.domain.model.CreditTransactionItem r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.b.D(com.paymaya.domain.model.CreditTransactionItem, boolean, boolean):void");
    }
}
