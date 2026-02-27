package u8;

import N5.C0452f1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: u8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2305a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0452f1 f20274b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2305a(C0452f1 c0452f1, String title) {
        super(c0452f1.f4092b);
        j.g(title, "title");
        this.f20273a = title;
        this.f20274b = c0452f1;
    }
}
