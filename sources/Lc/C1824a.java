package lc;

import N5.k1;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.store.M;
import dOYHB6.tiZVw8.numX49;
import ic.InterfaceC1598b;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: lc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1824a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseLoadingFragment f18286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f18287b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f18288d;
    public final M e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1824a(k1 k1Var, InterfaceC1598b interfaceC1598b) {
        super((ConstraintLayout) k1Var.e);
        j.g(interfaceC1598b, numX49.tnTj78("bF9L"));
        this.f18286a = (MayaBaseLoadingFragment) interfaceC1598b;
        ConstraintLayout constraintLayout = (ConstraintLayout) k1Var.c;
        j.f(constraintLayout, numX49.tnTj78("bF9r"));
        this.f18287b = constraintLayout;
        this.c = (ImageView) k1Var.f4138b;
        this.f18288d = (TextView) k1Var.f4139d;
        this.e = new M(this, 8);
    }
}
