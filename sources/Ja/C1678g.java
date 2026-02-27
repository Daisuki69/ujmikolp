package ja;

import N5.C0452f1;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaSpinnerBottomSheetDialogFragment;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: ja.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1678g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0452f1 f17733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaSpinnerBottomSheetDialogFragment f17734b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678g(C0452f1 c0452f1, MayaSpinnerBottomSheetDialogFragment onItemClickListener) {
        super(c0452f1.f4092b);
        j.g(onItemClickListener, "onItemClickListener");
        this.f17733a = c0452f1;
        this.f17734b = onItemClickListener;
        this.itemView.setOnClickListener(new ViewOnClickListenerC1479a(this, 11));
    }
}
